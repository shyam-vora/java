import java.lang.String;
class student {
    String name;
    String gender;
    int mark;
    int enrollmentno;

    student(String name, String gender, int mark, int enrollmentno) {
        this.name = name;
        this.gender = gender;
        this.mark = mark;
        this.enrollmentno = enrollmentno;
    }
    void dispalydetils() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(mark);
        System.out.println(enrollmentno);
    }
}
public class p39 {
    public static void main(String[] args) {
        student sp = new student(null, null, 120, 220304);
        sp.dispalydetils();
    }

}
