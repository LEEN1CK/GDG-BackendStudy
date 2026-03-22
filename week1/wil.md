# week1 학습한 내용
    # 클라이언트 - 서버 모델
    클라이언트 : 요청을 보내고 서버의 응답을 받음
    서버 : 요청을 받아 처리하고 응답을 반환
    

    # URL
    URL : 웹 상에서 특정 리소스의 위치를 나타내는 주소
    Host : 리소스가 위치한 서버의 IP 또는 도메인
    Port : 서버의 특정 네트워크 번호 (주로 생략)
    Path : 서버 내에서 원하는 리소스 경로 (Host 뒤)
    Query : 추가 정보를 보내는 파라미터 (? 뒤)
    

    # HTTP
    HTTP : 데이터를 주고받는 클라이언트 - 서버 모델의 프로토콜
    GET : 리소스 조회
    POST : 리소스 추가, 등록
    PUT : 리소스 교체 (없으면 생성)
    PATCH : 리소스 일부 수정
    DELETE : 리소스 삭제
    

    # 프론트엔드와 백엔드
    프론트앤드: 클라이언트 정보의 렌더링, 사용자의 상호작용
    백엔드 : 서버와 데이터베이스간의 데이터 처리, 저장, 관리
    

    # API
    API : 클라이언트와 서버간의 소통에서 요청 및 응답 방식을 미리 정해놓은 규칙
    

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/e796e6b9-1db7-4e7c-ac70-26ee20f39f48" />


# 상품 기능
    # 상품 정보 등록
    HTTP Method : POST
    URL : /merchandise
    

    # 상품 목록 조회
    HTTP Method : GET
    URL : /merchandise
    

    # 개별 상품 정보 상세 조회
    HTTP Method : GET
    URL : /merchandise/{mdId}
    

    # 상품 정보 수정
    HTTP Method : PATCH
    URL : /merchandise/{mdId}
    
    
    # 상품 삭제
    HTTP Method : DELETE
    URL : /merchandise/{mdId}
    

# 주문 기능
    # 주문 정보 생성
    HTTP Method : POST
    URL : /order
    

    # 주문 목록 조회
    HTTP Method : GET
    URL : /order/{memberId}
    

    # 개별 주문 정보 상세 조회
    HTTP Method : GET
    URL : /order/{memberId}
    

    # 주문 최소
    HTTP Method : DELETE
    URL : /order/{memberId}

