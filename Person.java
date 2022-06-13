package HomeWorck7;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    String getName() {
        return name;
    }

     int getAge() {
        return age;
    }

     boolean isMarried() {
        return married;
    }
}
