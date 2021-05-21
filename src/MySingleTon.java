
public class MySingleTon {

    /**
     * This class does a collection of method actions to create a single instance of the class
     * This Singleton is thread safe
     */

    // Step 1 - create an instance of the class and make it lazily loaded
    //          (the "= new MySingleTon;" will be in the getter)
    private static MySingleTon instance = null;
    private int x = (int)(Math.random()*101);

    // Step 2 - Mate the constructor private
    private MySingleTon() {
        System.out.println("MySingleTon - CTOR IN ACTION");
    }

    // Step 3 - make a static getter for the instance
    public static MySingleTon getInstance() {
        if (instance == null) {
            synchronized (MySingleTon.class) {
                if (instance == null) {
                    instance = new MySingleTon();
                }
            }
        }
        return instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MySingleTon{" +
                "x=" + x +
                '}';
    }
}
