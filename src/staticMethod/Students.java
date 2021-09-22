package staticMethod;

public class Students {
    private int rollno;
    private String name;
    private static String college = "Bach Khoa";

    public Students(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
