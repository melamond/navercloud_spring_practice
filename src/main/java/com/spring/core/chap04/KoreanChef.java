package com.spring.core.chap04;

import org.springframework.stereotype.Component;


public class KoreanChef implements Chef {
    @Override
    public void cook() {
        System.out.println("한식 마스터 김한식 입니다.");
    }
}
