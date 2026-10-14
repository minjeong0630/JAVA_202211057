import java.util.Scanner;

class Homework4 {

    static int gcd(int a, int b){
        if(b==0) {return a;}
        else if (a>b) {return gcd(b,a%b);}
        else {return gcd(a, b%a);}
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("두 수의 최대공약수는 %d입니다.", gcd(a,b));

    }
}

