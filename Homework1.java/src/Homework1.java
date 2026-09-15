import java.util.Scanner;

class Homework1 {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("**0을 누르면 입력이 종료됩니다**");

        while(true){
            int a = sc.nextInt();

            if (a == 0){
                break;
            }
            sum += a;
            System.out.println("총합: " +sum);
        }
        System.out.println("총합: " +sum);
    }
}

