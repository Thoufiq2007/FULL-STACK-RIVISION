package Day4;

import java.util.*;

public class D3T25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> products = new LinkedHashSet<>();

      
        products.add("Laptop");
        products.add("Smartphone");
        products.add("Headphones");
        products.add("Smartwatch");

        System.out.println("Recently Viewed Products:");
        System.out.println(products);

      
        System.out.print("\nEnter a product to view: ");
        String newProduct = sc.nextLine();

        if (products.add(newProduct)) {
            System.out.println("Product added to recently viewed list.");
        } else {
            System.out.println("Product already viewed.");
        }

        
        System.out.print("\nEnter product name to search: ");
        String searchProduct = sc.nextLine();

        if (products.contains(searchProduct)) {
            System.out.println("Product was viewed.");
        } else {
            System.out.println("Product was not viewed.");
        }

       
        System.out.print("\nEnter product name to remove: ");
        String removeProduct = sc.nextLine();

        if (products.remove(removeProduct)) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }

        
        System.out.println("\nRecently Viewed Products:");
        for (String product : products) {
            System.out.println(product);
        }

        
        System.out.println("\nTotal Unique Viewed Products: " + products.size());

        sc.close();
    }
}