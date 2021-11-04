package Odevlerim;
import java.util.Scanner;
public class ikinciDerecedenDenkleminKokleri {

	public static void main(String[] args) {
	
         Scanner tarayici=new Scanner(System.in);
         System.out.println("(ax²+bx+c) ikinci dereceden bir denklemdir.\n Denklemdeki sabitleri aşağıdaki gibi sırayla girin"); 
         
         System.out.print("a değerini giriniz :"); 
         double a = tarayici.nextInt(); 
         System.out.print("b değerini giriniz   :"); 
         double b = tarayici.nextInt(); 
         System.out.print("c değerini giriniz   :"); 
         double c = tarayici.nextInt();
         double diskriminant = (b * b) - (4 * a * c); 
         
         if (diskriminant > 0){ 
             double x1 = ((-1 * b) - Math.sqrt(diskriminant)) / (2 * a); 
             double x2 = ((-1 * b) + Math.sqrt(diskriminant)) / (2 * a); 
             System.out.println("x1= " + x1 + " x2= " + x2); 
         } 
         if (diskriminant < 0){
             System.out.println("Denklemin Gerçel Kökü Yoktur."); 
         } 
         if (diskriminant == 0){ 
             double x = (-1 * b) / (2 * a);
             System.out.println("Çakışık kökü var x1= x2= " + x); 
         }
  
     } 
	}

