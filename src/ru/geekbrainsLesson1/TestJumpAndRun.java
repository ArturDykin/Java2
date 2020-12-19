package ru.geekbrainsLesson1;

import org.junit.Test;
import ru.geekbrainsLesson1.jump.run.Cat;
import ru.geekbrainsLesson1.jump.run.Man;
import ru.geekbrainsLesson1.jump.run.Robot;
import ru.geekbrainsLesson1.jump.run.JumpAndRun;
import ru.geekbrainsLesson1.Hurdles.Hurdles;
import ru.geekbrainsLesson1.Hurdles.ObstacleCourse;
import ru.geekbrainsLesson1.Hurdles.Wall;

class TestJumpAndRun {

    @Test
    void Positive() {
        JumpAndRun catRed = new Cat("Рыжий", 5, 3);
        JumpAndRun catPushok = new Cat("Пушок", 6, 2);

        JumpAndRun humanYvan = new Man("Иван", 10, 5);
        JumpAndRun humanPetr = new Man("Петр", 11, 6);

        JumpAndRun robotCop = new Robot("Коп", 15, 10);
        JumpAndRun robotNecop = new Robot("Некоп", 16, 11);

        JumpAndRun[] jumpsAndRuns = {catRed, catPushok, humanYvan, humanPetr, robotCop, robotNecop};


        Hurdles wall1 = new Wall(2);
        Hurdles wall2 = new Wall(11);

        Hurdles obstacleCourse1 = new ObstacleCourse(5);
        Hurdles obstacleCourse2 = new ObstacleCourse(16);

        Hurdles[] hurdles = {wall1, wall2, obstacleCourse1, obstacleCourse2};

        for (int i = 0; i < hurdles.length; i++) {

            for (JumpAndRun jumpAndRun : jumpsAndRuns) {
                if (jumpAndRun.getSuccess()) {
                    hurdles[i].check(jumpAndRun);
                }
            }
        }
    }

    @Test
    void Negative() {

        JumpAndRun catRed = new Cat("Рыжий", 15, 13);
        JumpAndRun catPushok = new Cat("Пушок", 16, 12);

        JumpAndRun humanYvan = new Man("Иван", 20, 15);
        JumpAndRun humanPetr = new Man("Петр", 21, 16);

        JumpAndRun robotCop = new Robot("Коп", 25, 20);
        JumpAndRun robotNecop = new Robot("Некоп", 26, 21);

        JumpAndRun[] jumpsAndRuns = {catRed, catPushok, humanYvan, humanPetr, robotCop, robotNecop};


        Hurdles wall1 = new Wall(22);
        Hurdles wall2 = new Wall(27);

        Hurdles obstacleCourse1 = new ObstacleCourse(5);
        Hurdles obstacleCourse2 = new ObstacleCourse(18);

        Hurdles[] hurdles = {wall1, wall2, obstacleCourse1, obstacleCourse2};

        for (int i = 0; i < hurdles.length; i++) {

            for (JumpAndRun jumpAndRun : jumpsAndRuns) {
                if (!jumpAndRun.getSuccess()) {
                    hurdles[i].check(jumpAndRun);
                }
            }
        }
    }
}
