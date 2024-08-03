public class Sequential {
    private static void demo1() {
        for(int i = 0;i < 5;i++) {
            System.out.println("From demo 1 " + i);
        }
    }

    private static void demo2() {
        for(int i = 0;i < 5;i++) {
            System.out.println("From demo 2 " + i);
        }
    }
    public static void main(String[] args) {
        //Learning how threads work and how to use them in Java

        demo1();
        demo2();
    }
}