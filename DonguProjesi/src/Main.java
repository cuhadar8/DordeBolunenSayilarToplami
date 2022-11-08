import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean tekMi = false;
		
		int toplam = 0;
		
		while(!tekMi) {
			
			System.out.print("Lütfen sayı giriniz: ");
			int sayi = scanner.nextInt();
			
			if(!(sayi % 2 == 0)) {
				tekMi = true;
			}
			
			else if(sayi % 4 == 0) {
				
				toplam += sayi;
			}
			
		}
		System.out.println("4'e bölünen sayıların toplamı = " + toplam);
	}

}
