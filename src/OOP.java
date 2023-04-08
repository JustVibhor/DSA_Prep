public class OOP {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000000; i++) {
            Student stud = new Student();
        }
    }
}

class Student {


    char grade;
    String name;
    int roll_no;

    void changeName(String naam) {
        this.name = naam;
    }

    Student(String name, char grade, int roll) {
        this.name = name;
        this.grade = grade;
        this.roll_no = roll;
    }

    Student(String name) {
        this.name = name;
    }

    Student() {
        this ("Vibhor", 'C', 58);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
