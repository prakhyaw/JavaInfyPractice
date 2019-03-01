package project;
class Tester1 {
    static int x;
    static int y;
    void add(int a , int b) {
        x = a + b;
        y = x + b;
    }
}    

public class Main1 {
    public static void main(String args[]) {
        Tester1 obj1 = new Tester1();
        Tester1 obj2 = new Tester1 ();   
        int a = 2;
        obj1.add(a, a + 1);
        obj2.add(5, a);
        System.out.println(obj1.x + " " + obj2.y);     
    }
}