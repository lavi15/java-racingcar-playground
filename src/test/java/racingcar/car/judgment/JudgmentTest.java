package racingcar.car.judgment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgmentTest {
    Judgment judgment = new Judgment();
    @Test
    @DisplayName("move 배열을 받아 String 길이가 가장 긴 String의 길이를 반환한다.")
    void calculateMaxMoveTest() {
        String[] carMove = new String[3];
        carMove[0]="---";
        carMove[1]="----";
        carMove[2]="---";
        assertEquals(4 , judgment.calculateMaxMove(carMove));
    }
}