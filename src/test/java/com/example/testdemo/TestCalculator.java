package com.example.testdemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; //junit = Java 가 가진 단위 테스트라는 뜻

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/*
*   Application SRS: 계산기(Calculator)
*   1. 2가지 숫자의 정수 덧셈
*   2. 2가지 숫자의 정수 뺄셈
*/
// xunit => junit, jsunit, pyunit, cunit
public class TestCalculator {
    /// annotation => 부가 설명, 기능을 코드 엇이 설정
    @Test
    public void  testAddSuccess(){
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        Assertions.assertTrue(result == 30);
    }
    @Test
    public void  testAddError(){
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        assertFalse(result != 30);

    }

    @Test
    public void testSubtractSuccess(){
        Calculator calc = new Calculator();
        int result = calc.subtract(20, 10);
        Assertions.assertTrue(result == 10);
    }
     @Test
     public void testSubtractError(){
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 20);
        assertEquals(-10, result, "Testing...");
    }
}
