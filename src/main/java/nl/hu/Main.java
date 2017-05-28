package nl.hu;

import nl.hu.generated_sources.*;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ObjectFactory factory = new ObjectFactory();
    private static FruitShopService service = new FruitShopService();
    private static IFruitShopService server = service.getBasicHttpBindingIFruitShopService();
    private static LoginDetails loginDetails = factory.createLoginDetails();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your next action:\n 1: Register\n 2: Login");
        int choice;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e){
            choice = getValidInt("Please type the number 1 or 2.");
        }

        while(choice != 1 && choice != 2){
            System.out.println("Please choose 1 or 2.");
            Scanner scanner1 = new Scanner(System.in);
            try {
                choice = scanner1.nextInt();
            } catch (InputMismatchException e){
                choice = getValidInt("Please choose 1 or 2.");
            }
        }

        if(choice == 1){
            Register();
        } else {
            Login();
        }
    }

    private static int getValidInt(String reminder) {
        boolean valid = false;
        int result = 0;
        while (!valid){
            System.out.println(reminder);
            try {
                Scanner scanner2 = new Scanner(System.in);
                result = scanner2.nextInt();
                valid = true;
            } catch (InputMismatchException e){
            }
        }
        return result;
    }

    private static void Login() {
        System.out.println("#########\n# login #\n#########");
        boolean succes = false;
        while (!succes) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Username: ");
            loginDetails.setUsername(factory.createLoginDetailsUsername(scanner.nextLine()));
            System.out.println("Password: ");
            loginDetails.setPassword(factory.createLoginDetailsPassword(scanner.nextLine()));
            System.out.println(server.loginCustomer(loginDetails));
            if(server.loginCustomer(loginDetails))
                succes = true;
        }
        Store();
    }

    private static void Store() {
        System.out.println("#########\n# store #\n#########");
        RenderStore();
    }

    private static void RenderStore() {
        List<ProductType> availableProducts = server.getAvailableProducts().getProductType();
        List<OwnedProductType> ownedProducts = server.getBoughtProducts(loginDetails).getOwnedProductType();
        double balance = server.getBalance(loginDetails);
        System.out.println("\nYour currently owned products:");
        for (OwnedProductType ownedProduct : ownedProducts){
            System.out.println(ownedProduct.getProductDetails().getValue().getName().getValue() + ", " + ownedProduct.getQuantity());
        }

        System.out.println("Products currently available in our store:");
        int i = 1;
        for (ProductType availableProduct : availableProducts){
            System.out.println(" " + i + ": " + availableProduct.getProductDetails().getValue().getName().getValue() +
                    ", number available: " + availableProduct.getProductDetails().getValue().getQuantity() +
                    "   $" + availableProduct.getProductDetails().getValue().getPrice());
            i++;
        }

        System.out.println("Current balance: $" + balance);
        StoreChoice1();
    }

    private static void StoreChoice1() {
        System.out.println("\nPlease choose your next action:\n 'buy': Proceed to buy one of our products.\n 'refresh': Refresh the current stock.\n 'quit': Terminates this program.");
        String input = "";
        while (!input.equals("buy") && !input.equals("refresh") && !input.equals("quit")) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        }

        if (input.equals("buy")) {
            System.out.println("Please choose from the products listed above. You can select a product by typing the number in front of it.");
            List<ProductType> availableProducts = server.getAvailableProducts().getProductType();
            Scanner scanner = new Scanner(System.in);
            int choice;
            while(true) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    choice = getValidInt("Please type one of the numbers listed above.");
                }
                if (choice <= availableProducts.size() && choice >= 1){
                    Message message = server.buyProduct(loginDetails, availableProducts.get(choice-1).getId());
                    System.out.println(message.getContent().getValue());

                    System.out.println("\nDo you want to re-enter the shop? (Y/N)");
                    scanner = new Scanner(System.in);
                    String answer = scanner.nextLine();
                    if (answer.toUpperCase().equals("Y") || answer.toUpperCase().equals("YH") || answer.toUpperCase().equals("YES") || answer.toUpperCase().equals("YEAH")){
                        RenderStore();
                    } else {
                        System.exit(0);
                    }
                } else {
                    System.out.println("Please type one of the numbers listed above.");
                }
            }
        } else if (input.equals("refresh")){
            RenderStore();
        } else if (input.equals("quit")){
            System.exit(0);
        }
    }

    private static void Register() {
        System.out.println("############\n# register #\n############");
        RegisterForm();
    }

    private static void RegisterForm() {
        Scanner scanner = new Scanner(System.in);
        LoginDetails loginDetails = factory.createLoginDetails();
        System.out.println("Username:");
        loginDetails.setUsername(factory.createLoginDetailsUsername(scanner.nextLine()));
        System.out.println("Password:");
        loginDetails.setPassword(factory.createLoginDetailsPassword(scanner.nextLine()));
        Message message = server.registerCustomer(loginDetails);
        System.out.println(message.getContent().getValue());

        if(!message.isIsError()) {
            Login();
        } else {
            RegisterForm();
        }
    }
}
