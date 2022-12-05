/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
import java.util.Scanner;//java until kütüphanesi ait scanner sınıf:girdi ve çıktı almamızı sağlar 
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he
        Scanner input=new Scanner (System.in);
        System.out.println("Lütfen hesaplanmasını istediğiniz km giriniiz");
        int km=input.nextInt();
        int m=km*1000;
        System.out.println("hesaplanan metre: "+m);
        
    }
    
}
