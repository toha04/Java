package HW3;

public class Task4 {
    public static void main(String[] args) {
        int count = 6;
        int i = 0;
        while ( i < count ) {
            i++;
            int j = 0;
            while ( j < count - i) {
                j++;
                System.out.print("  ");
            }
            int count2 = (j = i);
            while ( j > 0) {
                j--;
                System.out.print("* ");
            }
            System.out.println();
        }
        while (i <= count) {
            i--;
            int j = 0;
            while( j < count - i) {
                j++;
                System.out.print("  ");
            }
            int count2 = ( j = i );
            while ( j > 0) {
                j--;
                System.out.print("* ");
            }
            System.out.println();
            if (i == 0) {
                break;
        }
        }
    }
}
