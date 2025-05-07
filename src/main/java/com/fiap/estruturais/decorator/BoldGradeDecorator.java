package com.fiap.estruturais.decorator;

public class BoldGradeDecorator extends GradeDecorator {
    public BoldGradeDecorator(Grade grade) {
        super(grade);
    }

    @Override
    public String getGradeDescription() {
        return "<b>" + super.getGradeDescription() + "</b>";
    }
}
