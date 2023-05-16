
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter(900);
        c.increase(50);
        c.decrease();
        c.decrease(50);
        System.out.println(c.value());
    }
}
