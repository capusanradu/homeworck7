package HomeWorck7;

public class ThrePersoans {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person();
        person1.setName("Antrei");
        person1.setAge(17);
        person1.setMarried(false);

        Person person2 = new Person();
        person2.setName("Radu");
        person2.setAge(33);
        person2.setMarried(true);

        Person person3 = new Person();
        person3.setName("Mirecea");
        person3.setAge(36);
        person3.setMarried(false);

        System.out.println("Name: " + person1.getName() + " " + "Age: " + person1.getAge()+ " " + "Married: " + person1.isMarried());
        System.out.println("Name: " + person2.getName() + " " + "Age: " + person2.getAge()+ " " + "Married: " + person2.isMarried());
        System.out.println("Name: " + person3.getName() + " " + "Age: " + person3.getAge()+ " "  + "Married: " + person3.isMarried());

    }
}
