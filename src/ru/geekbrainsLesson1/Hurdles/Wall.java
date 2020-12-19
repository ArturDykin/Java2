package ru.geekbrainsLesson1.Hurdles;

import org.junit.Assert;
import ru.geekbrainsLesson1.jump.run.JumpAndRun;

public class Wall implements Hurdles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public String check(JumpAndRun jumpAndRun) {
        jumpAndRun.jumpStr();
        jumpAndRun.setSuccess(jumpAndRun.getMaxHeight() >= height);
        if (jumpAndRun.getSuccess()) {
            Assert.assertTrue(jumpAndRun.getSuccess());
            return "Участник " + jumpAndRun.getName() + " перепрыгнул стену высотой " + height + " м";
        } else {
            Assert.assertFalse(jumpAndRun.getSuccess());
            return "ИУчастник " + jumpAndRun.getName() + " не перепрыгнул стену высотой " + height + " м";
        }
    }


}
