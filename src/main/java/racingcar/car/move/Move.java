package racingcar.car.move;

import java.util.Random;
import java.util.Scanner;

public class Move {
    public String[] carMove;
    public String[] carName;

    public void moveCar(String[] carName) {
        this.carName = carName;
        this.carMove = new String[carName.length];
        Scanner scan = new Scanner(System.in);
        System.out.println("횟수를 적어주세요.");
        int runNo = scan.nextInt();
        for(int i=0; i<carMove.length; i++) {
            carMove[i]="-";
        }
        for(int i=0;i<runNo;i++) {
            moveLogic();
            System.out.println("");
        }
    }
    private void moveLogic() {
        Random random = new Random();
        for(int j=0; j<carMove.length; j++) {
            int moveCheck = random.nextInt(9)+1;
            if(moveCheck>=4) {
                carMove[j]=carMove[j]+"-";
            }
            System.out.print(carName[j]+" : "+ carMove[j] + "\t");
        }
    }
}
