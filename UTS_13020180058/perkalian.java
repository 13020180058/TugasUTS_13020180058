import java.util.Scanner;

public class perkalian{
        public static void main (String [] args){


Scanner input = new Scanner(System.in);
        int angka1, angka2, angka3, angka4, angka5,angka6, angka7, angka8, angka9, hasil_perkalian;
	
	System.out.println("jumlah bilangan : 9 ");

        System.out.print("Masukan Input Pertama: ");
        angka1 = input.nextInt();
        System.out.print("Masukan Input Kedua: ");
        angka2 = input.nextInt();
	System.out.print("Masukan Input ketiga: ");
        angka3 = input.nextInt();
        System.out.print("Masukan Input Keempat: ");
        angka4 = input.nextInt();
	System.out.print("Masukan Input kelima: ");
        angka5 = input.nextInt();
        System.out.print("Masukan Input Keenam: ");
        angka6 = input.nextInt();
	System.out.print("Masukan Input ketujuh: ");
        angka7 = input.nextInt();
        System.out.print("Masukan Input Kedelapan: ");
        angka8 = input.nextInt();
	System.out.print("Masukan Input kesembilan: ");
        angka9 = input.nextInt();


            // rumus untuk perkalian
            hasil_perkalian=angka1 * angka2 * angka3 * angka4 * angka5 * angka6 * angka7 * angka8 * angka9;

            // menampilkan output
            System.out.println("Hasil perkalian: "+hasil_perkalian);     
        }
}