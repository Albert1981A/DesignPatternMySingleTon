
public class Test {

    public static void main(String[] args) {

        /**
         * This class does a collection of method actions to create a single instance of the class
         */

        System.out.println("---------- Regular class ---------");
        MyPrototype myPrototype1 = new MyPrototype();
        MyPrototype myPrototype2 = new MyPrototype();
        System.out.println(myPrototype1);
        System.out.println(myPrototype2);

        System.out.println("--------- SingleTon class --------");
        new Thread(() -> {System.out.println(MySingleTon.getInstance()); System.out.println("This is MySingleTon in action");}).start();
        new Thread(() -> {System.out.println(MySingleTon.getInstance()); System.out.println("This is MySingleTon in action");}).start();
    }
}
