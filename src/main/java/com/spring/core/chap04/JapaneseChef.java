package com.spring.core.chap04;

import org.springframework.stereotype.Component;

// 해당 클래스의 객체를 스프링 컨테이너에 자동 생성해 등록하겠다는 의미
// 별칭 정해줄 수 있으며, jc라는 별칭으로 넣음
@Component("jc")
public class JapaneseChef implements Chef {
    @Override
    public void cook() {
        System.out.println("일식 쉐프 입니다.");
    }
}
