package ru.geekbrainsLesson1.Hurdles;

import org.junit.Assert;
import ru.geekbrainsLesson1.jump.run.JumpAndRun;

public class ObstacleCourse implements Hurdles {
    private int length;

    public ObstacleCourse(int length) {
        this.length = length;
    }

    public String check(JumpAndRun jumpAndRun) {
        jumpAndRun.runStr();
        jumpAndRun.setSuccess(jumpAndRun.getMaxLength() >= length);
        if (jumpAndRun.getSuccess()) {
            Assert.assertTrue(jumpAndRun.getSuccess());
            return "Участник " + jumpAndRun.getName() + " проходит дистанцию длиной " + length + " км.";
        } else {
            Assert.assertFalse(jumpAndRun.getSuccess());
            return "Участник " + jumpAndRun.getName() + " не проходит дистанцию длиной " + length + " км.";
        }
    }
}
