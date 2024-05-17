package jjm20201823_mid2;

import java.util.Scanner;
import java.util.Random;

public class jjm20201823_mid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"가위", "바위", "보"};

        
        System.out.println("가위, 바위, 보 중 하나를 입력하세요 (첫 번째 선택): ");
        String playerFirstMove = scanner.nextLine();
        System.out.println("가위, 바위, 보 중 하나를 입력하세요 (두 번째 선택): ");
        String playerSecondMove = scanner.nextLine();

       
        String computerFirstMove = rps[random.nextInt(3)];
        String computerSecondMove = rps[random.nextInt(3)];

        System.out.println("컴퓨터의 첫 번째 선택: " + computerFirstMove);
        System.out.println("컴퓨터의 두 번째 선택: " + computerSecondMove);

        
        String finalPlayerMove = random.nextBoolean() ? playerFirstMove : playerSecondMove;
        String finalComputerMove = random.nextBoolean() ? computerFirstMove : computerSecondMove;

        System.out.println("플레이어의 최종 선택: " + finalPlayerMove);
        System.out.println("컴퓨터의 최종 선택: " + finalComputerMove);

        
        if (finalPlayerMove.equals(finalComputerMove)) {
            System.out.println("비겼습니다!");
        } else if ((finalPlayerMove.equals("가위") && finalComputerMove.equals("보")) ||
                   (finalPlayerMove.equals("바위") && finalComputerMove.equals("가위")) ||
                   (finalPlayerMove.equals("보") && finalComputerMove.equals("바위"))) {
            System.out.println("플레이어 승리!");
        } else {
            System.out.println("컴퓨터 승리!");
        }

        scanner.close();
    }
}

