public class Teacher extends Person {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void introduce() {
        System.out.println("저는 " + subject + " 담당 " + name + "입니다.");
    }
}