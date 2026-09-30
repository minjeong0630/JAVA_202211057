import java.util.Scanner;

class Student {
    int id;
    String name;
    String major;
    long phone;

    int getId() { return id; }
    void setId(int id) { this.id = id; }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    String getMajor() { return major; }
    void setMajor(String major) { this.major = major; }

    long getPhone() { return phone; }
    void setPhone(long phone) { this.phone = phone; }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            s[i] = new Student();
            s[i].setId(Integer.parseInt(sc.next()));
            s[i].setName(sc.next());
            s[i].setMajor(sc.next());
            s[i].setPhone(Long.parseLong(sc.next()));
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            String p = "0" + Long.toString(s[i].getPhone());
            String phone = p.substring(0, 3) + "-" + p.substring(3, 7) + "-" + p.substring(7);
            System.out.println((i + 1) + "번째 학생: " + s[i].getId() + " " + s[i].getName() + " " + s[i].getMajor() + " " + phone);
        }
    }
}
