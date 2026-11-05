import java.util.Scanner;

public class Tugas124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int nilai = sc.nextInt();

        if (nilai < 1) {
            
        } else {
            int totalN = 0;
            for (int i = 1; i <= nilai; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    totalN++;
                }
                System.out.println();
            }

            System.out.println("Total angka tercetak: " + totalN);
        }
        sc.close();
    }    
}
