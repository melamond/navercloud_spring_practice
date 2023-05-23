package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("cc")
public class ChineseChef implements Chef {
    @Override
    public void cook() {
        System.out.println("중식 경력 30년 쉐프입니다.");
    }
}
