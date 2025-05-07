package com.fiap.estruturais.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Grade grade = new HighSchoolGrade();
        BoldGradeDecorator boldGradeDecorator = new BoldGradeDecorator(grade);
        System.out.println(boldGradeDecorator.getGradeDescription());
    }

}
