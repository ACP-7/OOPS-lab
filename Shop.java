import java.util.Scanner;

// Interface
interface Calc {
    void calculate();
}

// Class Bill implementing interface
class Bill implements Calc {
    String pid, pname;
    int quantity;
    double price, total;

    Scanner sc = new Scanner(System.in);

    // Method to get product details
    public void getdata() {
        System.out.println("Enter product details");
        System.out.println("----------------------");

        System.out.print("Product id: ");
        pid = sc.nextLine();

        System.out.print("Product name: ");
        pname = sc.nextLine();

        System.out.print("Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Price: ");
        price = sc.nextDouble();
        sc.nextLine(); // consume newline
    }

    // Implement calculate method
    public void calculate() {
        total = quantity * price;
    }

    // Display product details
    public void display() {
        System.out.println(pid + "\t" + pname + "\t" + quantity + "\t" + price + "\t" + total);
    }
}

// Main class
class Shop {
    public static void main(String[] args) {
        int i, n;
        double amount = 0;
        String date, order;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter bill details");
        System.out.println("----------------------");

        System.out.print("Order No: ");
        order = s.nextLine();

        System.out.print("Date: ");
        date = s.nextLine();

        System.out.print("No. of products: ");
        n = s.nextInt();

        Bill obj[] = new Bill[n];

        // Input and calculation
        for (i = 0; i < n; i++) {
            obj[i] = new Bill();
            obj[i].getdata();
            obj[i].calculate();
        }

        // Display bill
        System.out.println("\nOrder No: " + order);
        System.out.println("Date: " + date);
        System.out.println("Product ID\tName\tQty\tPrice\tTotal");
        System.out.println("--------------------------------------------------");

        for (i = 0; i < n; i++) {
            obj[i].display();
            amount += obj[i].total;
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Net Amount = " + amount);
    }
}