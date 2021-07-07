import java.util.ArrayList;

public class EvenArray {
    public static void main(String[] args) {
        ArrayList<Integer> rand = new ArrayList<>();
        int a = rand.size();
        while (a <= 12) {
                rand.add((int) Math.random());
        }
        rand.set(1,0);
        rand.set(3,0);
        rand.set(5,0);
        rand.set(7,0);
        rand.set(9,0);
        rand.set(11,0);

        rand.forEach(System.out::println);
    }
}
