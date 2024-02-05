package com.ohgiraffers.section01.method;

public class App04 {

    public static void main(String[] args) {

        /* 수업목표. 여러 개의 전달 인자를 이용한 메소도를 호출할 수 있다. */
        /* 필기.
        *   여러개의 전달인자를 이용한 메소드 호출 테스트
        *  */

        App04 app04 = new App04();
        app04.testMethod("짱구",5,'남');


    }

    public void testMethod(String name, int age, final char gender) {

        System.out.println("나의 이름은 " + name + " 이고, 나이는 " + age + " 세 이며, 성별은 " + gender + " 입니다.");

    }

}
