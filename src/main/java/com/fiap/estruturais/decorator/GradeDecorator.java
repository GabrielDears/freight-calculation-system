package com.fiap.estruturais.decorator;

public abstract class GradeDecorator implements Grade {

    private final Grade grade;

    public GradeDecorator(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String getGradeDescription() {
        return grade.getGradeDescription();
    }
}
