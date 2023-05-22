## Chapter 01
1. 한식, 중식, 일식 등 요리사를 만들 예정
2. Chef 인터페이스 생성, void cook(); 을 가짐
3. Restaurant 인터페이스 생성, void order(); 를 가짐 (레스토랑은 주문을 받아서 처리)
4. Course 인터페이스 생성, 한정식 오마카세 중국코스요리를 만들 수 있도록 void combineMenu(); 를 가짐
---
## Chapter 02
1. Chapter 01의 경우, FusionRestaurant의 셰프를 수정할 경우 두 군데를 수정해야 함
2. 여러 군데를 수정하지 않아도 HotelManager 에서만 수정할 수 있도록 구조 변경