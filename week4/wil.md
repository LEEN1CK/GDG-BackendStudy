# ERD(Entity-Relationship Diagram)
    개체-관계 중심의 모델링 기법으로 DB설계에 사용

    기본 키(PK): 고유하게 식별하는 데 사용되는 하나 이상의 컬럼
    외래 키(FK): 다른 테이블의 PK를 참조하는 속성
    관계: 다대일(N:1), 일대다(1:N). 일대일(1:1), 다대다(N:M)

    식별 관계: 관계 대상의 PK를 자신의 PK로도 사용
    비식별 관계: 관계 대상의 PK를 자신의 FK로만 사용

# 엔티티 구현
    1. 엔티티 클래스 구성
        @Entity, @Id 필요, @GeneratedValau를 사용하여 id값을 자동 생성, @Column으로 컬럼 정보 지정
    2. 외래 키(FK)
        @JoinColumn으로 FK 정보 명시, @ManyToOne으로 관계 지정
    3. 엔티티 생성자
        일반적으로 id필드를 제외하고 생성
        

