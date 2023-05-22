package com.spring.core.chap02.config;

// 현재까지 최상위 객체인 호텔을 운영하기 위해 필요한
// 모든 객체들을 관리하고 주입해주는 클래스
// Bean Factory (빈 공장) / Bean이 자바 인스턴스를 부르는 별칭

import com.spring.core.chap02.*;

public class HotelManager {
    // 셰프 객체 생성
    public Chef chef(){
        return new JapaneseChef();
    }
    // 코스 객체 생성
    public Course course(){
        return new JapaneseCourse();
    }
    // 레스토랑 객체 생성
    public Restaurant restaurant(){
        // 위에 정의된 chef(), course()를 파라미터로 호출하여 주입
        return new FusionRestaurant(chef(), course());
    }
    // 호텔 객체 생성
    public Hotel hotel(){
        return new Hotel(restaurant(), chef());
    }

}
