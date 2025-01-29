
class Person{
    String name;
    int age;
    Person(){
        name = "Unknown";
        age = 0;

    }
    Person(int age, String name){
        this.name = name;
        this.age = age;

    }
}
class Main {

    public static void main(String[] args) {
    Person pp = new Person(22, "Rahul");
    System.out.println(pp.age);
    System.out.println(pp.name);
    }
}
