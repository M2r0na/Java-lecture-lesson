import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("이승현", 100);
        Student s2 = new Student("대림대", 10);

        s1.printinfo();

        System.out.println(s1.name + "의 점수는 " + s1.score + "이고, Pass 여부는 " + s1.isPass() + " 입니다.");

        s2.printinfo();

        System.out.println(s2.name + "의 점수는 " + s2.score + "이고, Pass 여부는 " + s2.isPass() + " 입니다.");
    }
}
