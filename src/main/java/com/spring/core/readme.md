## Chapter 01
1. 한식, 중식, 일식 등 요리사를 만들 예정
2. Chef 인터페이스 생성, void cook(); 을 가짐
3. Restaurant 인터페이스 생성, void order(); 를 가짐 (레스토랑은 주문을 받아서 처리)
4. Course 인터페이스 생성, 한정식 오마카세 중국코스요리를 만들 수 있도록 void combineMenu(); 를 가짐
---
## Chapter 02
1. Chapter 01의 경우, FusionRestaurant의 셰프를 수정할 경우 두 군데를 수정해야 함
2. 여러 군데를 수정하지 않아도 HotelManager 에서만 수정할 수 있도록 구조 변경
### Chap 01과 Chap 02의 차이점
특정 클래스(Hotel)에서 어떤 자료가 대입될지를 그 클래스 내부에서 정의 vs 
다른 클래스(Hotelmanager)에서 특정 클래스(Hotel)에 어떤 자료가 대입될 지 결정
---
## Chapter 03
1. IoC 컨테이너 (스프링 컨테이너) 를 생성
2. Bean Factory를 생성하여 Bean 객체를 관리
---
## Chapter 04
1. 의존성 주입 (필드 주입)
2. 필드 주입의 경우, 하나에 한 개만 매칭 가능하므로 한 곳에 복수의 Component가 들어갈 수 있게 되면
    예외를 발생시킨다. (Chef 자리에 JapaneseChef, ChineseChef 두 가지 선택지가 생기므로 예외 발생)
   (Restaurant는 FusionRestaurant만 들어갈 수 있으므로 정상적으로 작동)