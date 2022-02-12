package ua.com.alevel;

public class Test {

    final String s;
    int a;
    String f;
    String k;
    Object b;
    Test t;

    public Test() {
        this.s = "=";
    }


    public Test(String s, String s1) {
        this.f = s;
        this.s = s1;
        this.test();
    }

    String g;

    public Test(int a) {
        // todo
        this.s = "=";
    }

    public void test() {}

    public void test(int i, long l) {}

    public void test(long i, int l) {}

    public void test(String s) {}

    public void test(int a) {
//        System.out.println(this.getClass().getName());
//        System.out.println(this.getClass().getSimpleName());

        System.out.println("a = " + this.a);
//        System.out.println("a = " + a);
    }

    public String getS() {
        return s;
    }

    public int getA() {
        return a;
    }

    public String getF() {
        return f;
    }

    public String getK() {
        return k;
    }

    public Object getB() {
        return b;
    }

    public Test getT() {
        return t;
    }

    public String getG() {
        return g;
    }
}
