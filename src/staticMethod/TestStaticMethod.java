package staticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Students.change();
        Students s1 = new Students(111,"Cuong Tien");
        Students s2 = new Students(222,"Mai Huyen");
        Students s3 = new Students(333,"Thanh Long");
        s1.display();
        s2.display();
        s3.display();
    }
}
