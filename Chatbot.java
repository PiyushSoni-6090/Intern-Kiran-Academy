import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("....CHATBOT....");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.println("Choose an option");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Choose cab type");
                System.out.println("1. Auto - 12 Rs/km");
                System.out.println("2. Sedan - 18 Rs/km");
                System.out.println("3. SUV - 25 Rs/km");

                int type = sc.nextInt();

                String cabtype;
                int rate;

                if (type == 1) {
                    cabtype = "Auto";
                    rate = 12;
                } else if (type == 2) {
                    cabtype = "Sedan";
                    rate = 18;
                } else if (type == 3) {
                    cabtype = "SUV";
                    rate = 25;
                } else {
                    System.out.println("Invalid cab choice!");
                    continue;
                }

                System.out.println("Choose route");
                System.out.println("1. Pune Station to Shivajinagar - 5 km");
                System.out.println("2. Swargate to Kothrud - 8 km");
                System.out.println("3. Hinjawadi to Wakad - 10 km");

                int route = sc.nextInt();

                String source;
                String destination;
                int distance;

                if (route == 1) {
                    source = "Pune Station";
                    destination = "Shivajinagar";
                    distance = 5;
                } else if (route == 2) {
                    source = "Swargate";
                    destination = "Kothrud";
                    distance = 8;
                } else if (route == 3) {
                    source = "Hinjawadi";
                    destination = "Wakad";
                    distance = 10;
                } else {
                    System.out.println("Invalid route choice!");
                    continue;
                }

                int fare = distance * rate;

                System.out.println("....Fare Details....");
                System.out.println("Cab Type: " + cabtype);
                System.out.println("Source: " + source);
                System.out.println("Destination: " + destination);
                System.out.println("Distance: " + distance + " km");
                System.out.println("Rate: " + rate + " Rs/km");
                System.out.println("Fare: " + fare + " Rs");

                System.out.println("1. Confirm and share OTP");
                System.out.println("2. Cancel ride");
                int confirm = sc.nextInt();

                if (confirm == 1) {
                    int otp = (int)(Math.random() * 9000) + 1000;
                    System.out.println("Your OTP is " + otp);
                    System.out.println("Your ride has been booked");
                    System.out.println("Once OTP is shared, you cannot cancel the ride.");
                } else if (confirm == 2) {
                    System.out.println("Your ride has been cancelled");
                    System.out.println("OTP was not shared.");
                } else {
                    System.out.println("Invalid option");
                }

            } else if (choice == 2) {
                System.out.println("Thank you for using our chatbot!");
                break;
            } else {
                System.out.println("Invalid menu choice!");
                continue;
            }
        }

        sc.close();
    }
}