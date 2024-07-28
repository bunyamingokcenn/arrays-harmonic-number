
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double total = 0;

        for (int i = 0; i < list.length; i++){
            total += ((double) 1 /list[i]);
        }
        total += 1;
        System.out.println(total);
    }
}