package Odevlerim;
import java.util.Scanner;
public class ikinciDerecedenDenkleminKokleri {

	public static void main(String[] args) {
	
         Scanner tarayici=new Scanner(System.in);
         System.out.println("(ax�+bx+c) ikinci dereceden bir denklemdir.\n Denklemdeki sabitleri a�a��daki gibi s�rayla girin"); 
         
         System.out.print("a de�erini giriniz :"); 
         double a = tarayici.nextInt(); 
         System.out.print("b de�erini giriniz   :"); 
         double b = tarayici.nextInt(); 
         System.out.print("c de�erini giriniz   :"); 
         double c = tarayici.nextInt();
         double diskriminant = (b * b) - (4 * a * c); 
         
         if (diskriminant > 0){ 
             double x1 = ((-1 * b) - Math.sqrt(diskriminant)) / (2 * a); 
             double x2 = ((-1 * b) + Math.sqrt(diskriminant)) / (2 * a); 
             System.out.println("x1= " + x1 + " x2= " + x2); 
         } 
         if (diskriminant < 0){
             System.out.println("Denklemin Ger�el K�k� Yoktur."); 
         } 
         if (diskriminant == 0){ 
             double x = (-1 * b) / (2 * a);
             System.out.println("�ak���k k�k� var x1= x2= " + x); 
         }
  
     } 
	}

