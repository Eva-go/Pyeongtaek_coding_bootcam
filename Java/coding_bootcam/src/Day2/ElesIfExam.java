package Day2;

import java.util.Scanner;

public class ElesIfExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("국어 점수 입력 : ");
        int score = scanner.nextInt();
        if(score >=90){
            System.out.println("맛있는 자장면을 먹을수 있습니다.");
        } else if (score>=80) {
            System.out.println("맛있는 짬뽕을 먹을수 있습니다.");
        } else if (score>=70) {
            System.out.println("맛있는 탕수육을 다음 기회에 먹을수 있습니다.");
        }
        else
            System.out.println("순대국을 사드세요");
        scanner.close();
    }
}
