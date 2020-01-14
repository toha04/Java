package HW3;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        while ( count < 5) {
            count++;
            int i = 0;
            while ( i < count) {
                i++;
                System.out.print("* ");
            }
            System.out.println();
        }
        while (count > 0) {
            count--;
            int i = 0;
            while ( i < count) {
                i++;
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
