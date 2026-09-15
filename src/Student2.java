public class Student2 extends Person {
    String school;

    Student2(String name, String school) {
        super(name); // 상속받은 상위 클래스에 있는 생성사 호출

        this.school = school;
    }

    @Override
    void introduce() {
        System.out.println("저는 " + this.name + ", "+this.school+ "에 다닙니다.");
    }
}
