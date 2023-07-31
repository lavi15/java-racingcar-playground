package racingcar;

import racingcar.car.Car;
import racingcar.car.judgment.Judgment;
import racingcar.car.move.Move;

public class application {
    public static void main(String[] args) {
        Car car = new Car();
        Move move = new Move();
        Judgment judgment = new Judgment();
        String[] carNames = car.getCarName();
        move.moveCar(carNames);
        judgment.judgmentWinCar(carNames ,move.carMove);
    }
}
