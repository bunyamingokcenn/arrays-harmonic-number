
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double total = 1;

        for (int i = 0; i < list.length; i++){
            total += ((double) 1 /list[i]);
        }

        System.out.println(total);
    }
}