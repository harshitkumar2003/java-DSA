package arrays;

//! Array of object in java 
// class 
class Student {
    // properties
    int rollno;
    String name;
    double marks;
}

class Shop {
    int serial;
    String item;
    int quan;
    double prize;
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

        //! display arrray of object
        //! using for loop

        // for (int i = 0 ; i < Student.length ; i++) {
        //     System.out.println(Student[i].rollno + ") " + Student[i].name + "  -  " + Student[i].marks);
        // }

        //! using enhanced for loop
        for (Student St : Student) {
            System.out.println(St.rollno + ") " + St.name + "  -  " + St.marks);
        }

        Shop sh1 = new Shop();
        sh1.serial = 1;
        sh1.item = "Chocklate";
        sh1.quan = 200;
        sh1.prize = 4000.32;

        Shop sh2 = new Shop();
        sh2.serial = 2;
        sh2.item = "Biscuit";
        sh2.quan = 100;
        sh2.prize = 500.18;

        Shop sh3 = new Shop();
        sh3.serial = 3;
        sh3.item = "Chips";
        sh3.quan = 200;
        sh3.prize = 1000.23;

        Shop sh4 = new Shop();
        sh4.serial = 4;
        sh4.item = "Coldrink";
        sh4.quan = 200;
        sh4.prize = 400.56;

        Shop Shop[] = new Shop[4];
        Shop[0] = sh1;
        Shop[1] = sh2;
        Shop[2] = sh3;
        Shop[3] = sh4;

        for (Shop sho : Shop) {
        System.out.println(sho.serial+") "+sho.item+"  -  "+sho.quan+"  =  "+sho.prize);
        }

    }
}
