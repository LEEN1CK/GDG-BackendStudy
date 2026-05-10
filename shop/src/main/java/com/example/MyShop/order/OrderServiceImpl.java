package com.example.MyShop.order.service;

import com.example.MyShop.member.entity.Member;
import com.example.MyShop.member.repository.MemberRepository;
import com.example.MyShop.order.dto.OrderCreateRequest;
import com.example.MyShop.order.entity.Order;
import com.example.MyShop.order.repository.JpaOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final JpaOrderRepository orderRepository;
    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public Long createOrder(OrderCreateRequest request) {
        Member member = memberRepository.findById(request.getMemberId());
        if (member == null) {
            throw new RuntimeException("회원을 찾을 수 없습니다.");
        }

        Order order = new Order(
                member,
                request.getTotalPrice(),
                request.getPointUsed(),
                request.getCashAmount()
        );

        orderRepository.save(order);

        return order.getId();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Order getOrderById(Long id) {
        Order order = orderRepository.findById(id);

        if (order == null) {
            throw new RuntimeException("주문을 찾을 수 없습니다.");
        }

        return order;
    }

    @Override
    @Transactional
    public void cancelOrder(Long id) {
        Order order = orderRepository.findById(id);

        if (order == null) {
            throw new RuntimeException("주문을 찾을 수 없습니다.");
        }

        order.cancel();
    }
}
