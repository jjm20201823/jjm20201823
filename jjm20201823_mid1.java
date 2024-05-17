package jjm20201823_mid1;

import java.util.Scanner;
import java.util.Random;

public class jjm20201823_mid1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"가위", "바위", "보"};
        String computerMove = rps[random.nextInt(3)];

        System.out.println("가위, 바위, 보 중 하나를 입력하세요: ");
        String playerMove = scanner.nextLine();

        System.out.println("컴퓨터: " + computerMove);
        System.out.println("플레이어: " + playerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("비겼습니다!");
        } else if ((playerMove.equals("가위") && computerMove.equals("보")) ||
                   (playerMove.equals("바위") && computerMove.equals("가위")) ||
                   (playerMove.equals("보") && computerMove.equals("바위"))) {
            System.out.println("플레이어 승리!");
        } else {
            System.out.println("컴퓨터 승리!");
        }

        scanner.close();
    }
}
