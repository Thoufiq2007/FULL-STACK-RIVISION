import java.util.*;

public class InventoryProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> pname = new HashMap<>();
        HashMap<Integer, String> pcategory = new HashMap<>();
        HashMap<Integer, Double> pprice = new HashMap<>();
        HashMap<Integer, Integer> stock = new HashMap<>();

        HashSet<String> categories = new HashSet<>();
        LinkedHashSet<String> recentProducts = new LinkedHashSet<>();

        int choice;

        do {
            System.out.println("\n===== PRODUCT INVENTORY SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Sell Product");
            System.out.println("6. Remove Product");
            System.out.println("7. Add Product Category");
            System.out.println("8. Display Unique Categories");
            System.out.println("9. Display Sorted Categories");
            System.out.println("10. Display Recently Added Products");
            System.out.println("11. Generate Inventory Report");
            System.out.println("12. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (stock.containsKey(id)) {
                        System.out.println("Product ID already exists");
                    } else {

                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Category: ");
                        String cat = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        pname.put(id, name);
                        pcategory.put(id, cat);
                        pprice.put(id, price);
                        stock.put(id, qty);

                        categories.add(cat);
                        recentProducts.add(name);

                        System.out.println("Product Added Successfully");
                    }
                    break;

                case 2:

                    if (stock.isEmpty()) {
                        System.out.println("No Products Available");
                    } else {

                        System.out.println("\nID\tName\tCategory\tPrice\tQuantity");

                        for (int pid : stock.keySet()) {
                            System.out.println(
                                    pid + "\t" +
                                    pname.get(pid) + "\t" +
                                    pcategory.get(pid) + "\t" +
                                    pprice.get(pid) + "\t" +
                                    stock.get(pid));
                        }

                        System.out.println("Total Products : " + stock.size());
                    }
                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    int searchId = sc.nextInt();

                    if (stock.containsKey(searchId)) {
                        System.out.println("Name : " + pname.get(searchId));
                        System.out.println("Category : " + pcategory.get(searchId));
                        System.out.println("Price : " + pprice.get(searchId));
                        System.out.println("Quantity : " + stock.get(searchId));
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();

                    if (stock.containsKey(updateId)) {

                        System.out.print("Enter Quantity to Add: ");
                        int addQty = sc.nextInt();

                        int current = stock.get(updateId);
                        stock.put(updateId, current + addQty);

                        System.out.println("Stock Updated");
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 5:

                    System.out.print("Enter Product ID: ");
                    int sellId = sc.nextInt();

                    if (stock.containsKey(sellId)) {

                        System.out.print("Enter Quantity Sold: ");
                        int sold = sc.nextInt();

                        int available = stock.get(sellId);

                        if (sold <= available) {

                            stock.put(sellId, available - sold);

                            System.out.println("Sale Completed");
                            System.out.println("Remaining Quantity : " + stock.get(sellId));

                        } else {
                            System.out.println("Insufficient Stock");
                        }

                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 6:

                    System.out.print("Enter Product ID: ");
                    int removeId = sc.nextInt();

                    if (stock.containsKey(removeId)) {

                        String removedName = pname.get(removeId);

                        pname.remove(removeId);
                        pcategory.remove(removeId);
                        pprice.remove(removeId);
                        stock.remove(removeId);

                        recentProducts.remove(removedName);

                        System.out.println("Product Removed");
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 7:

                    sc.nextLine();

                    System.out.print("Enter Category Name: ");
                    String newCat = sc.nextLine();

                    if (categories.add(newCat)) {
                        System.out.println("Category Added");
                    } else {
                        System.out.println("Category Already Exists");
                    }
                    break;

                case 8:

                    System.out.println("\nUnique Categories");

                    for (String c : categories) {
                        System.out.println(c);
                    }

                    System.out.println("Total Categories : " + categories.size());
                    break;

                case 9:

                    TreeSet<String> sorted = new TreeSet<>(categories);

                    System.out.println("\nSorted Categories");

                    for (String c : sorted) {
                        System.out.println(c);
                    }

                    if (!sorted.isEmpty()) {
                        System.out.println("First Category : " + sorted.first());
                        System.out.println("Last Category : " + sorted.last());

                        System.out.println("\nDescending Order");

                        for (String c : sorted.descendingSet()) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 10:

                    System.out.println("\nRecently Added Products");

                    for (String p : recentProducts) {
                        System.out.println(p);
                    }
                    break;

                case 11:

                    int totalStock = 0;
                    int maxQty = -1;
                    int maxId = -1;

                    System.out.println("\nINVENTORY REPORT");

                    for (int pid : stock.keySet()) {

                        System.out.println(
                                pid + " " +
                                pname.get(pid) + " " +
                                pcategory.get(pid) + " " +
                                pprice.get(pid) + " " +
                                stock.get(pid));

                        totalStock += stock.get(pid);

                        if (stock.get(pid) > maxQty) {
                            maxQty = stock.get(pid);
                            maxId = pid;
                        }
                    }

                    System.out.println("\nProducts Below Quantity 5");

                    for (int pid : stock.keySet()) {
                        if (stock.get(pid) < 5) {
                            System.out.println(pname.get(pid) + " - " + stock.get(pid));
                        }
                    }

                    System.out.println("\nTotal Units Available : " + totalStock);

                    if (maxId != -1) {
                        System.out.println("Highest Stock Product : " + pname.get(maxId));
                    }

                    System.out.println("\nUnique Categories");

                    for (String c : categories) {
                        System.out.println(c);
                    }

                    System.out.println("Total Categories : " + categories.size());

                    break;

                case 12:

                    System.out.println("Thank You");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 12);

        sc.close();
    }
}