package ua.com.alevel.anonim;

public class AnonimTest {

    public void test() {
        int sum = 0;
        IAnonim iAnonim1 = new IAnonimImpl();
        sum = iAnonim1.sum(10, 5);
        IAnonim iAnonim2 = new IAnonim() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        IAnonim iAnonim3 = (a, b) -> a + b;
        System.out.println("iAnonim3 = " + iAnonim3.sum(10, 8));
        IEmpty iEmpty = () -> {};
        IOneParameter iOneParameter = a -> { };
    }
}
