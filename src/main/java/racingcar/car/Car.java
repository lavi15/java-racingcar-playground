package racingcar.car;

import java.util.Scanner;

public class Car {

    public String[] getCarName() {
        Scanner scan = new Scanner(System.in);
        boolean isOverFive = true;
        String[] carNames=null;
        String insertCarName = null;
        while(isOverFive) {
            System.out.println("차명을 적어주세요.");
            insertCarName = scan.next();
            carNames = setCarName(insertCarName);
            isOverFive = isOverFive(carNames);
        }
        return carNames;
    }

    protected String[] setCarName(String insertCarName) {
        String[] carNames = insertCarName.split(",");
        return carNames;
    }

    protected boolean isOverFive(String[] carNames) {
        for(String car : carNames) {
            if(car.length()>5) {
                return true;
            }
        }
        return false;
    }
}
