public class Student {
    String name;
    int score;
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    void printinfo() {
        System.out.println(name + ": " + score + "점");
    }

    boolean isPass() {
        return score >= 60;
    }
}
