package amstrogSayi;

import java.util.Scanner;

public class amstrogSayi {

	public static void main(String[] args) {
		// basamakların toplamını yazan program
		
		
		 System.out.print("Bir Sayı Girin: ");
		 
		 Scanner input = new Scanner(System.in);

	        int num = input.nextInt();

	        int toplam=0;

	        while(num != 0)
	        {
	            toplam=(num%10)+toplam;
	            num /= 10;
	            System.out.println(toplam+ "--->"+ num);

	        }

	        System.out.println("Basamak Toplamı: " + toplam);


	}

}
