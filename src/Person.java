public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("저는 " + name + "입니다.");
    }
}