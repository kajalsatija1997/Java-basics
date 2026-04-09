package Swetha.Employee;

public class Student {
    int sid, smarks;
    String sname, sbranch;
    char sgrade;

    public Student()
    {
        sid=0;
        smarks=0;
    }

    public Student(int sid, int smarks)
    {
        this.sid=sid;
        this.smarks=smarks;
    }


    void calcGrade() {
        if (smarks >= 80)
            sgrade = 'A';
        else if ((smarks >= 60) && (smarks < 80))
            sgrade = 'B';
        else
            sgrade = 'C';
    }

    void dispStdDetails() {
        System.out.println(sid + "\nsname=" + sname + "\nmarks=" + smarks + "\nsbranch" + sbranch + "\nsgrade=" + sgrade);
    }

    public static void main(String[] a) {
        Student s1 = new Student();
        s1.sid = 123;
        s1.sname = "ABC";
        s1.smarks = 82;
        s1.sbranch = "csis";
        Student s2 = new Student();
        s2.sid = 132;
        s2.sname = "XYZ";
        s2.smarks = 65;
        s2.sbranch = "csis";
        s1.calcGrade();
        s1.dispStdDetails();
        s2.calcGrade();
        s2.dispStdDetails();
    }
}
