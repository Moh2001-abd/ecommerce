import com.ecomerce.Customer;
import com.ecomerce.Product;
import com.ecomerce.orders.Order;
import java.util.Scanner;
import java.util.Arrays;

/**
 * The Main class is the entry point of the e-commerce system project.
 * It contains the main method which serves as the starting point of the application.
 */

    
    public class Main {
        public static void main(String[] args) {
            // storing products informations in an array
            String[][] productInfo = {
                {"1", "Head First Java", "38.79", "22", "Java", "Head First Java is a book for learning Java programming. This book is designed to help beginners learn Java programming through a unique method that is engaging, fun, and effective.", "head_first_java.jpg"},
                {"2", "Effective Java", "40.00", "30", "Java", "Effective Java is a book for learning Java programming. This book is designed to help experienced Java developers improve their skills and write better code.", "effective_java.jpg"},
                {"3", "Thinking in Java", "30.00", "20", "Java", "Thinking in Java is a book for learning Java programming. This book is designed to help programmers understand the principles of Java programming and how to apply them in practice.", "thinking_in_java.jpg"},
                {"4", "Python Crash Course", "25.00", "25", "Python", "Python Crash Course is a book for learning Python programming. This book is designed to help beginners learn Python programming through a hands-on approach that is easy to follow and understand.", "python_crash_course.jpg"},
                {"5", "Fluent Python", "30.00", "15", "Python", "Fluent Python is a book for learning Python programming. This book is designed to help experienced Python developers improve their skills and write more idiomatic and effective code.", "fluent_python.jpg"},
                {"6", "Python Cookbook", "35.00", "10", "Python", "Python Cookbook is a book for learning Python programming. This book is designed to help programmers solve common problems and implement best practices in Python programming.", "python_cookbook.jpg"},
                {"7", "Soft Skills", "20.00", "40", "Soft Skills", "Soft Skills is a book for learning soft skills. This book is designed to help professionals develop essential skills such as communication, teamwork, and leadership.", "soft_skills.jpg"},
                {"8", "The 7 Habits of Highly Effective People", "18.00", "35", "Soft Skills", "The 7 Habits of Highly Effective People is a book for learning soft skills. This book is designed to help individuals develop effective habits that can lead to personal and professional success.", "7_habits.jpg"},
                {"9", "How to Win Friends and Influence People", "15.00", "45", "Soft Skills", "How to Win Friends and Influence People is a book for learning soft skills. This book is designed to help individuals improve their social skills and build meaningful relationships.", "how_to_win_friends.jpg"},
                {"10", "The Art of Public Speaking", "22.00", "50", "Soft Skills", "The Art of Public Speaking is a book for learning soft skills. This book is designed to help individuals become effective public speakers and communicators.", "public_speaking.jpg"},
                {"11", "The Lean Startup", "28.00", "30", "Soft Skills", "The Lean Startup is a book for learning soft skills. This book is designed to help entrepreneurs and business professionals build successful and sustainable businesses.", "lean_startup.jpg"},
                {"12", "The Innovator's Dilemma", "32.00", "25", "Soft Skills", "The Innovator's Dilemma is a book for learning soft skills. This book is designed to help individuals understand the challenges of innovation and how to overcome them.", "innovators_dilemma.jpg"}
        };
        
        // creating an array of Product objects
        Product[] products = new Product[productInfo.length];

        // creating Product objects and storing them in the array
        for (int i = 0; i < productInfo.length; i++) {
            products[i] = new Product(
                Integer.parseInt(productInfo[i][0]),
                productInfo[i][1],
                Double.parseDouble(productInfo[i][2]),
                Integer.parseInt(productInfo[i][3]),
                productInfo[i][4],
                productInfo[i][5],
                productInfo[i][6]
            );
        }

        //Start of the program and welcome message
        System.out.println("Welcome to the E-commerce System");
        System.out.println("Please Enter Your Informations To Brows the Products:");

        // behind the scene of the program set an ID for the customer
        int customerID;
        String firstName;
        String lastName;
        String email;
        String phone;

        System.out.println("Are you new to this E-commerce System? (yes/no)");
        boolean isNewCustomer = true;
        Scanner scanner = new Scanner(System.in);
        String isNewCustomerInput = scanner.nextLine();

        if (isNewCustomerInput.equalsIgnoreCase("no")) {
            isNewCustomer = false;
        }
        else if (isNewCustomerInput.equalsIgnoreCase("yes")) {
            isNewCustomer = true;

            //set the customer ID to the number of customers in the system + 1
            customerID = Customer.getNumberOfCustomers() + 1;

            //get the customer's first name
            System.out.println("Please enter your first name:");
            firstName = scanner.nextLine();

            //get the customer's last name
            System.out.println("Please enter your last name:");
            lastName = scanner.nextLine();

            //get the customer's email
            System.out.println("Please enter your email:");
            email = scanner.nextLine();

            //get the customer's phone number
            System.out.println("Please enter your phone number:");
            phone = scanner.nextLine();
            // creating a new customer object
            Customer customer = new Customer(customerID, firstName, lastName, email, phone);
            
        }
        else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            return;
    
        }

        
        
        //display the list of products and their details in 2d view table
        System.out.println("===============================");
        System.out.println("Here are the available products:");
        System.out.println("ID | Name | Price | Quantity | Category | Description |");

        Arrays.stream(productInfo)
            .map(row -> String.join(" | ", row))
            .forEach(System.out::println);
        
            //add to cart and submit order
            System.out.println("Please enter the ID of the product you want to add to cart /n" 
            +"and enter blank if you want to exit /n and enter 0 to submit the order:");

           int productID;
            Order order = new Order();
            while (true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    break;
                }
                else if (input.equals("0")) {
                    System.out.println("Order submitted successfully!");
                    // display the order summary
                    System.out.println("===============================");
                    System.out.println(order.generateOrderSummary());
                    System.out.println("===============================");

                    break;
                }
                else {
                    productID = Integer.parseInt(input);
                    Product product = null;
                    for (Product p : products) {
                        if (p.getProductID() == productID) {
                            product = p;
                            break;
                        }
                    }
                    if (product != null) {
                        order.addToCart(product);
                        System.out.println(product.getProductName() + " added to cart.");
                        System.out.println("===============================");
                        System.out.println("You have these  products in the cart:");
                        order.displayCart();
                        System.out.println("===============================");
                        System.out.println("Add another product or submit?");
                    }
                    else {
                        System.out.println("Invalid product ID. Please try again.");
                    }
                }
            }
         

        
    }
}

            
           
           
        