package arrays;

//! Array of object in java 
// class 
class Student {
    // properties
    int rollno;
    String name;
    double marks;
}

public class arrofobj {
    public static void main(String[] args) {
        // Student object 1
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Harsh";
        s1.marks = 98.65;
        // Student object 2
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Chetan";
        s2.marks = 94.25;
        // Student object 3
        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Atul";
        s3.marks = 84.61;
        // Student object 4
        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "Anshul";
        s4.marks = 82.21;

        //! Array of object
        Student Student[] = new Student[4]; //! array of 4 size
        Student[0] = s1;  // [0] -> s1
        Student[1] = s2;  // [1] -> s2
        Student[2] = s3;  // [2] -> s3
        Student[3] = s4;  // [3] -> s4

        // display arrray of object
        for (int i = 0 ; i < Student.length ; i++) {
            System.out.println(Student[i].rollno + ") " + Student[i].name + "  -  " + Student[i].marks);
        }
    }
}
