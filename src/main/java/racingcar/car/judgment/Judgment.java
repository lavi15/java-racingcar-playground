package racingcar.car.judgment;

import java.util.ArrayList;
import java.util.List;

public class Judgment {

    public void judgmentWinCar(String[] carNames, String[] carMove) {
        List<Integer> winCarNo = new ArrayList<>();
        int maxMove = calculateMaxMove(carMove);
        for(int i=0;i<carMove.length;i++) {
            if(carMove[i].length()==maxMove) {
                winCarNo.add(i);
            }
        }
        printWinCar(carNames, winCarNo);
    }

    protected void printWinCar(String[] carNames, List<Integer> winCarNo) {
        for(int winCar : winCarNo) {
            System.out.print(carNames[winCar]+"\t");
        }
    }

    protected int calculateMaxMove(String[] carMove) {
        int maxMove = 0;
        for(String car : carMove) {
            if(car.length()>maxMove) {
                maxMove=car.length();
            }
        }
        return maxMove;
    }
}
