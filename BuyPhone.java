import java.util.Scanner;

public class BuyPhone{
	private static Scanner scanner = new Scanner(System.in);

	public static void Phone() {
		
		String phoneBrand = "";
        String phoneModel = "";
        String storageVariant = "";
        String color = "";
        String camera = "";
        String screenSize = "";
        String battery = "";
        String os = "";
        String chargerAvailable = "";
        String ram = "";
        int price = 0;
        
        String response;
        
        do {
        	System.out.println("Do you want to buy a phone? (Yes/No)");
        	response = getValidInput("Yes", "No", scanner);
        }while (!response.equalsIgnoreCase("Yes") && !response.equalsIgnoreCase("No"));
        
        if (response.equalsIgnoreCase("Yes")) {
            String choice;
            do {
                System.out.println("Great! Which phone do you want? (iPhone/Samsung)");
                choice = getValidInput("iPhone", "Samsung", scanner);
            } while (!choice.equalsIgnoreCase("iPhone") && !choice.equalsIgnoreCase("Samsung"));

            if (choice.equalsIgnoreCase("iPhone")) {
                phoneBrand = "iPhone";
                String iphoneModel;
                do {
                    System.out.println("You chose iPhone. Which model do you want? (iPhone 15 Pro/iPhone 16/iPhone 16 Plus)");
                    iphoneModel = scanner.nextLine().trim();
                } while (!iphoneModel.equalsIgnoreCase("iPhone 15 Pro") && !iphoneModel.equalsIgnoreCase("iPhone 16") && !iphoneModel.equalsIgnoreCase("iPhone 16 Plus"));
                switch (iphoneModel.toLowerCase()) {
                case "iphone 15 pro":
                    phoneModel = "iPhone 15 Pro";
                    camera = "48MP Triple Camera";
                    screenSize = "6.1 inches";
                    battery = "3095mAh";
                    os = "iOS 16";
                    chargerAvailable = "No";
                    ram = "6GB";
                    price = 92900;
                    break;
                case "iphone 16":
                    phoneModel = "iPhone 16";
                    camera = "48MP Dual Camera";
                    screenSize = "6.1 inches";
                    battery = "3279mAh";
                    os = "iOS 17";
                    chargerAvailable = "No";
                    ram = "6GB";
                    price = 89900;
                    break;
                case "iphone 16 plus":
                    phoneModel = "iPhone 16 Plus";
                    camera = "48MP Dual Camera";
                    screenSize = "6.7 inches";
                    battery = "4323mAh";
                    os = "iOS 17";
                    chargerAvailable = "No";
                    ram = "6GB";
                    price = 120000;
                    break;
            }
            } else {
                phoneBrand = "Samsung";
                String samsungModel;
                do {
                    System.out.println("You chose Samsung. Which model do you want? (Galaxy S23/Galaxy S23+/Galaxy Z Fold5)");
                    samsungModel = scanner.nextLine().trim();
                } while (!samsungModel.equalsIgnoreCase("Galaxy S23") && !samsungModel.equalsIgnoreCase("Galaxy S23+") && !samsungModel.equalsIgnoreCase("Galaxy Z Fold5"));

                switch (samsungModel.toLowerCase()) {
                    case "galaxy s23":
                        phoneModel = "Samsung Galaxy S23";
                        camera = "50MP Triple Camera";
                        screenSize = "6.1 inches";
                        battery = "3900mAh";
                        os = "Android 13";
                        chargerAvailable = "Yes";
                        ram = "8GB";
                        price = 74999;
                        break;
                    case "galaxy s23+":
                        phoneModel = "Samsung Galaxy S23+";
                        camera = "50MP Triple Camera";
                        screenSize = "6.6 inches";
                        battery = "4700mAh";
                        os = "Android 13";
                        chargerAvailable = "Yes";
                        ram = "8GB";
                        price = 94999;
                        break;
                    case "galaxy z fold5":
                        phoneModel = "Samsung Galaxy Z Fold5";
                        camera = "50MP Triple Camera";
                        screenSize = "7.6 inches (unfolded)";
                        battery = "4400mAh";
                        os = "Android 13";
                        chargerAvailable = "Yes";
                        ram = "12GB";
                        price = 154999;
                        break;
                }
            }
            String variant;
            do {
                System.out.println("Which storage variant do you want? (128GB/256GB/512GB)");
                variant = scanner.nextLine().trim();
            } while (!variant.equalsIgnoreCase("128GB") && !variant.equalsIgnoreCase("256GB") && !variant.equalsIgnoreCase("512GB"));

            storageVariant = variant.toUpperCase();
            switch (storageVariant) {
                case "256GB":
                    price += 20000;
                    break;
                case "512GB":
                    price += 40000;
                    break;
            }

            String colorChoice;
            if (phoneBrand.equalsIgnoreCase("iPhone")) {
                do {
                    System.out.println("Which color do you want? (Red/White/Black)");
                    colorChoice = scanner.nextLine().trim();
                } while (!colorChoice.equalsIgnoreCase("Red") && !colorChoice.equalsIgnoreCase("White") && !colorChoice.equalsIgnoreCase("Black"));
            } else {
                do {
                    System.out.println("Which color do you want? (Purple/White/Black)");
                    colorChoice = scanner.nextLine().trim();
                } while (!colorChoice.equalsIgnoreCase("Purple") && !colorChoice.equalsIgnoreCase("White") && !colorChoice.equalsIgnoreCase("Black"));
            }
            color = colorChoice.substring(0, 1).toUpperCase() + colorChoice.substring(1).toLowerCase();

            System.out.println("\nYou have selected the following specifications:");
            System.out.println("Brand: " + phoneBrand);
            System.out.println("Model: " + phoneModel);
            System.out.println("Storage: " + storageVariant);
            System.out.println("Color: " + color);
            System.out.println("Camera: " + camera);
            System.out.println("Screen Size: " + screenSize);
            System.out.println("Battery: " + battery);
            System.out.println("OS: " + os);
            System.out.println("Charger Available: " + chargerAvailable);
            System.out.println("RAM: " + ram);
            System.out.println("Price: ₹" + price);

        } else {
            System.out.println("No worries! Maybe next time.");
        }

        scanner.close();
    }

    private static String getValidInput(String option1, String option2, Scanner scanner) {
        String input;
        do {
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase(option1) || input.equalsIgnoreCase(option2)) {
                return input;
            } else {
                System.out.println("Invalid input. Please enter '" + option1 + "' or '" + option2 + "'.");
            }
        } while (true);
    	
 }
}
