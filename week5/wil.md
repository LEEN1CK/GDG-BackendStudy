# 다형성(polymorphism)
    어떤 객체의 속성이나 기능이 상황에 따라 여러 가지 형태를 가질 수 있는 성질

    역할 -> 인터페이스: 클래스가 구현해야 하는 메소트의 집합
    구현 -> 인터페이스 구현 클래스

# SOLID 원칙
    SRP(single responsibility pri.) 단일 책임 원칙
     - 한 클래스의 한 기능만

    OCP(open-close pri.) 개방-폐쇠 원착
     - 클래스는 확장에 열려있고 수정에 닫혀있어야 함

    ISP(interface segregation pri.) 인터페이스 분리 원칙
     - 클라이언트의 목적과 용도에 적합한 인터페이스만 제공

    DIP(dependency inversion pri.) 의존관계 역전 원칙
     - 구현 클래스에 의존하지 말고, 인터페이스에 의존

# IoC(Inversion of Control)
    객체 생성 및 관리 제어권을 프레임워크가 대신 가져가는 것
    스프링 -> 객체 생성
    스프링 컨테이너 -> 객체 관리

# DI(Dependency Injection) 의존성 주입
    스프링 컨테이너에 필요한 객체(Bean)을 미리 생성하고, 필요할 때 주입하는 것

    빈 수동 등록: @Configuration으로 설정 클래스 생성 & @Bean을 반환 메서드에 붙이기
    빈 자동 등록: @Component로 빈을 표시, @ComponentScan으로 등록
    의존관계 자동 주입: @Autowired로 스프링 컨테이너에 등록된 빈 중 필요한 타입의 객체를 자동으로 주입

    빈이 2개 이상일 때: @Qualifier로 빈에 이름 지정 가능, @Primary로 빈에 우선순위 지정 가능

# 의존성 주입 방법
    1. 생성자 주입: @Autowired 사용(생성자가 1개라면 생략 가능) & @RequiredArgsConstructor 사용
    2. 수정자 주입: 의존 객체를 변경할 때 수정하는 함수 생성
    3. 필드 주입
