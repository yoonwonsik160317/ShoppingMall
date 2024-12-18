<h1>스프링부트 쇼핑몰</h1>

<hr>

<h3>프로젝트 설명</h3>

-   스프링부트를 이용하여 만든 쇼핑몰입니다.
-   판매자와 구매자로 나뉘어 기능이 분리됩니다.
-   로그인 세션을 이용한 ROLE별로 구매자와 판매자 페이지가 렌더링이 되고, 구매자는 장바구니에 물품을 담고 구매하고, 구매자 정보와 판매자 정보가 History Entity에 담기게 되고, 그걸 바탕으로 구매통계와 판매통계를 구현했습니다.
-   결제 기능 또한 구현 했습니다.

<hr>

<h3>제작 후기</h3>

-   @Transactional 어노테이션에 대해 공부하게 되었습니다.
-   JPA 연관관계에 대해 더욱 잘 알게되는 계기가 되었습니다.
-   세션과 ROLE을 이용하여 역할별 기능을 구분하는 페이지를 만드는 방법에 대해 알게 되었습니다.

<hr>

<h3>Dependencies</h3>

-   Spring Web
-   Thymeleaf
-   Lombok
-   Spring Data Jpa
-   MariaDB Driver
-   Spring Security
-   Oauth2-client

<h3>DB 설계</h3>

-   User
-   Item
-   Cart
-   Cart_item
-   Board
-   History

<hr>

<h3>Update</h3>

-   CRUD 설계
-   회원가입 및 로그인 구현
-   판매자 및 구매자를 나눠 페이지 렌더링을 다르게 함
-   Entity 연관관계를 이용하여 장바구니 설계
-   장바구니 구매 기능 구현
-   장바구니 구매 오류 해결
-   구매내역 구현
-   판매 통계 및 판매 순위 구현
-   판매 상세 페이지 구현
-   금액 충전 구현 및 최종 완성
