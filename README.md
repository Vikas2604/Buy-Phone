# BuyPhone Java Application

This is a simple Java console application that simulates the process of buying a phone. The user can choose between two major phone brands (iPhone or Samsung) and customize the phone by selecting the model, storage variant, and color. After making selections, the program displays the phone specifications and the total price.

## Features

- Choose between iPhone and Samsung phone models.
- Select from different phone models such as:
  - iPhone 15 Pro, iPhone 16, iPhone 16 Plus
  - Samsung Galaxy S23, Galaxy S23+, Galaxy Z Fold5
- Customize the phone's storage capacity (128GB, 256GB, 512GB).
- Choose the phone's color based on the brand.
- Displays the selected phone's specifications, including camera, screen size, battery, and operating system.
- The total price is calculated based on the phone model and storage variant.

## Requirements

- Java Development Kit (JDK) version 8 or later.

## How to Run

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/your-username/buyphone-java.git
    ```

2. Navigate into the project directory:

    ```bash
    cd buyphone-java
    ```

3. Compile the Java file:

    ```bash
    javac BuyPhone.java
    ```

4. Run the compiled Java program:

    ```bash
    java BuyPhone
    ```

5. Follow the on-screen instructions to purchase a phone.

## Example Usage

```bash
Do you want to buy a phone? (Yes/No)
Yes
Great! Which phone do you want? (iPhone/Samsung)
iPhone
You chose iPhone. Which model do you want? (iPhone 15 Pro/iPhone 16/iPhone 16 Plus)
iPhone 15 Pro
Which storage variant do you want? (128GB/256GB/512GB)
256GB
Which color do you want? (Red/White/Black)
Red

You have selected the following specifications:
Brand: iPhone
Model: iPhone 15 Pro
Storage: 256GB
Color: Red
Camera: 48MP Triple Camera
Screen Size: 6.1 inches
Battery: 3095mAh
OS: iOS 16
Charger Available: No
RAM: 6GB
Price: ₹112900
