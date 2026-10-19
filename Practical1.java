public class Practical1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman", 80, 75, 90);
        Student s2 = new Student(2, "Rahul", 70, 85, 78);
        Student s3 = new Student(3, "Priya", 88, 92, 95);

        s1.display();
        s2.display();
        s3.display();
    }
}
class Student {
    int rollNo;
    String name;
    int m1, m2, m3;

    Student(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }


    void display() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
      
    }
}


