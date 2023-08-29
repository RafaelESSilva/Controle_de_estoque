package Filial;
import java.util.Scanner;
import Aplication.products;
public class producao {
    
   
 

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        products iten = new products();
        System.out.println("Enter product data: ");
        System.out.println("Nome: ");
        iten.name = sc.nextLine();
        System.out.println("Price: ");
        iten.price = sc.nextDouble();
        System.out.println("Quantity in stock");
        iten.quantity = sc.nextInt();

        System.out.println();
        System.out.println(" Product data : "+ iten);

        System.out.println();
        System.out.println("Enter the number of products to be  added in stock:");
        int quantity = sc.nextInt();
        iten.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+ iten);

        System.out.println();
        System.out.println("Enter the number of products to be removd from stock: ");
        quantity = sc.nextInt();
        iten.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+ iten);
    }
    
}
