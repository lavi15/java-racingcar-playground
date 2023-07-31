package racingcar.car;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {
    Car car = new Car();

    @Test
    @DisplayName("Car의 이름을 받아 ,를 기준으로 나누어 배열한다.")
    void carNameTest() {
        assertEquals(3 , car.setCarName("poid,gest,dadd").length);
    }

    @Test
    @DisplayName("차이름을 배열의 이름이 5로 true이다.")
    void isOverFiveTest() {
        String[] carNames = car.setCarName("poid,gest,dadd");
        assertEquals(false, car.isOverFive(carNames));
    }

    @Test
    @DisplayName("차이름을 배열의 이름이 6로 false이다.")
    void isOverFiveTest2() {
        String[] carNames = car.setCarName("poid,gest,dadddd");
        assertEquals(true, car.isOverFive(carNames));
    }
}