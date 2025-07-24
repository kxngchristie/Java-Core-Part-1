package task_3;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempName = p1.name;
        p1.name = p2.name;
        p2.name = tempName;

        int tempAge = p1.age;
        p1.age = p2.age;
        p2.age = tempAge;
    }

    public static void main(String[] args) {
        Person personA = new Person("Mark", 25);
        Person personB = new Person("John", 30);

        System.out.println("Before swap:");
        System.out.println("person A: " + personA);
        System.out.println("person B: " + personB);

        MakingChanges.changeIdentities(personA, personB);

        System.out.println("\nAfter swap:");
        System.out.println("person A: " + personA);
        System.out.println("person B: " + personB);
    }
}
