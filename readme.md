# Spring Core Study

---
## gradle 한글 인코딩 설정하기

---

1. shift 두번 타건 후 통합 검색창에 vm 검색
2. 사용자 지정 vm 옵션 편집 클릭
3. 가장 아래줄에 **'`-Dfile.encoding=uft-8`'** 입력 후 인텔리제이 재실행

---
## 인텔리제이 화면상 글씨 크기 조절

---
1. File 메뉴창에서 Settings 선택
2. 좌측 Editor -> General 선택
3. 상단의 Change font size(Zoom) with Ctrl-Mouse Wheel 체크 저장
4. 컨트롤 휠로 확대 축소
---
## 테마 및 아이콘 설치

1. File -> Settings -> Plugin -> Material 검색
2. Atom material icon, Material Theme UI 적용
   (File -> Settings -> Theme)

---
## 깃허브 연동

1. File -> Settings -> Version Control -> 계정 등록
2. 하단 Terminal -> `$ git rm -r --cached` 입력
---
## SpringBoot 패키지 생성시 유의 사항 (자바 옵션이 안 보이는 경우)
1. Setting -> Project Structure -> JDK 설정 확인
2. Project Structure -> Project, Project Structure -> Module
   - Language Level은 SDK Default
3. Setting -> Settings -> Build tools -> Gradle 하단 SDK 세팅 JDK 설정 확인
4. 우측 상단의 코끼리 모양 (리프레쉬 버튼) 클릭
---
