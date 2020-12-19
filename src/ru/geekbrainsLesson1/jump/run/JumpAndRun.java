package ru.geekbrainsLesson1.jump.run;

public interface JumpAndRun {

    String getName();

    int getMaxLength();

    int getMaxHeight();

    boolean getSuccess();

    void setSuccess(boolean success);

    String runStr();

    String jumpStr();
}
