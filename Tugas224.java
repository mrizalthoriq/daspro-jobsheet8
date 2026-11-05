import java.util.Scanner;

public class Tugas224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Minimal nilai n = 3");
        } else {
            int njmlh = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d", (i * j));
                    njmlh += j * i;
                }
                System.out.println();
            }

            System.out.println("Jumlah seluruh angka: " + njmlh );
        }
        sc.close();
    }    
}
