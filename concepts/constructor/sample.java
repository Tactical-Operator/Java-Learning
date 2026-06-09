class Student {

    int age;
    String name;
    int roll_number;
    
    // Default constructor
    // Student() // overloading default constructor with default values set by the user
    //  {
    //     name = "Mactavish";
    //     age = 10;
    //     roll_number = 6;
    // }

    // Paramterized Constructor
    Student(String name,int age,int roll_number){
        this.name=name;
        this.age=age;
        this.roll_number=roll_number;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) { 
        this.roll_number = roll_number;
    }
}

class sample {
    public static void main(String[] args) {
        Student object = new Student("Ashwin",10,5);

        object.age=30;
        object.roll_number=40;
        object.name="Jadhav";

        System.out.println("Name is " + object.getName());

        System.out.println("Age is " + object.getAge());

        System.out.println("Roll number is " + object.getRoll_number());
    }
}