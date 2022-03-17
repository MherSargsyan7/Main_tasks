package training.java;

public class Person {
    String name;
    int age;
    double weight;

    Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void job() {
        System.out.println(this.name + " is working");
    }

    void relax() {
        System.out.println(this.name + " is relaxing");
    }

    public static class Main {
        public static void main(String[] args) {
            Person person1 = new Person("Valod", 66, 70);
            Person person2 = new Person("Poxosik", 50, 45);

            person1.job();
            person2.relax();
        }
    }
}