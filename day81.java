import java.util.Scanner;
public class day81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            System.out.print("nilai siswa " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("siswa " + (i + 1) + " dapat nilai " + a[i]);
        }
    }
}
