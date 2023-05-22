package com.spring.core.chap01;

public class FusionRestaurant implements Restaurant{
    // 셰프
    private Chef chef;
    // 요리 코스
    private Course course;

    public FusionRestaurant(){
        chef = new JapaneseChef();
        course = new JapaneseCourse();
    }


    @Override
    public void order() {
        System.out.println("여기는 퓨전 레스토랑 입니다.");
        course.combineMenu();
        chef.cook();
    }
}
