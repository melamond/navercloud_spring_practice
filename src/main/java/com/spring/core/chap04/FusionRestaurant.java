package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fs")
public class FusionRestaurant implements Restaurant {
    // 셰프
    //@Autowired // 컨테이너에 든 자료중 Chef에 대입할 수 있는 것을 자동으로 집어넣어줌
    private Chef chef;
    // 요리 코스
    //@Autowired
    private Course course;

    // Setter 주입 : 세터 위에 어노테이션
    // @Autowired
    public void setChef(Chef chef){
        this.chef = chef;
    }

    // @Autowired
    public void setCourse(Course course){
        this.course = course;
    }

    @Autowired // @Qualifier("bean") 를 붙이면 지정된 이름의 객체 주입 가능
    public FusionRestaurant(@Qualifier("cc") Chef chef, @Qualifier("cco") Course course){
        this.chef = chef;
        this.course = course;
    }


    @Override
    public void order() {
        System.out.println("여기는 퓨전 레스토랑 입니다.");
        course.combineMenu();
        chef.cook();
    }
}
