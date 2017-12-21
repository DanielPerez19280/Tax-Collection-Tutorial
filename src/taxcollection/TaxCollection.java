/*
Daniel Perez 19280
Mr. Larrubia
Period 2

Program Name - 
Program Description - 
*/
package taxcollection;
import java.util.Scanner;

public class TaxCollection 
{

public static void main(String[] args) 
{

    Scanner in = new Scanner(System.in);
    
    String groceryName []= new String[3];
    double groceryPrice[]= new double[3];
    
    for (int i = 0; i < groceryName.length; i++) 
    {
        System.out.print("Please enter item: ");
        groceryName[i]=in.nextLine();
        
        System.out.print("Please enter price: ");
        groceryPrice[i]=in.nextDouble()*1.07;
        in.nextLine();
        
    }
    
    for (int i = 0; i < groceryName.length; i++) 
    {
    
        System.out.printf("\nThe cost of "+ groceryName[i]+" is "+groceryPrice[i]+"$");
        
    }
    
}
}