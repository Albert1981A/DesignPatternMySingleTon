
public class MyPrototype {

    /**
     * This is a simple class
     */

    private int x = (int)(Math.random()*101);

    public MyPrototype() {
        System.out.println("MyPrototype - CTRO IN ACTION");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MyPrototype{" +
                "x=" + x +
                '}';
    }
}
