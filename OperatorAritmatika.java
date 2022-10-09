import java.util.Scanner;
public class OperatorAritmatika {
 
 public static void main(String[] args) {
 int angka1,angka2;
 double hasil;
 
 Scanner keyboard = new Scanner(System.in);
 
 System.out.print("Masukan angka ke-1: ");
 angka1 = keyboard.nextInt();
 System.out.println("Masukan angka ke-2: ");
 angka2 = keyboard.nextInt();
 
 // penjumlahan
 hasil = angka1 + angka2;
 System.out.println("\nHasil Penjumlahan = " + hasil);
 
 // pengurangan
 hasil = angka1 - angka2;
 System.out.println("Hasil Pengurangan = " + hasil);
 
 // perkalian
 hasil = angka1 * angka2;
 System.out.println("Hasil Perkalian = " + hasil);
 
 // Pembagian
 hasil = angka1 / angka2;
 System.out.println("Hasil Pembagian = " + hasil);
 
 // Sisa Bagi
 hasil = angka1 % angka2;
 System.out.println("Hasil Sisa Bagi = " + hasil);
 
 }
 
}
