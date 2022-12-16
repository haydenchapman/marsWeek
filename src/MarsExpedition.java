import java.util.Scanner;

public class MarsExpedition {
    //MarsExpedition expeditionOne = new MarsExpedition();

    public static void main (String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂\n" +
                "╲▂▂▂▂╱╲▂▂▂▂╱╲▂▂▂\n" +
                "▔╲▂▂▂╱▔╲▂▂▂╱▔╲▂▂\n" +
                "▔▔╲▂▂╱▔▔╲▂▂╱▔▔╲▂\n" +
                "▔▔▔╲▂╱▔▔▔╲▂╱▔▔▔╲\n" +
                "▔▔▔▔╲╱▔▔▔▔╲╱▔▔▔▔\n" +
                "▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔\n");
        System.out.println("Expedition 1 prep sequence initializing...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("Booting up...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂\n" +
                "╲▂▂▂▂╱╲▂▂▂▂╱╲▂▂▂\n" +
                "▔╲▂▂▂╱▔╲▂▂▂╱▔╲▂▂\n" +
                "▔▔╲▂▂╱▔▔╲▂▂╱▔▔╲▂\n" +
                "▔▔▔╲▂╱▔▔▔╲▂╱▔▔▔╲\n" +
                "▔▔▔▔╲╱▔▔▔▔╲╱▔▔▔▔\n" +
                "▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔\n");
        Thread.sleep(2000);
        System.out.println("Tharsis System: Activated");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + ". Welcome to the Tharsis City Expedition One Preparation Program.");
        System.out.println("Are you ready to head out into the new world?");

        //ready select
        System.out.println("Please select Y or N:");
        String readySelect = scan.next();
        readySelect.toLowerCase();
        if (readySelect.equals("y")) {
            System.out.println("I knew you would say that. You are squad leader for a reason.");
        } else {
            System.out.println("Too bad you are squad leader. You are required to go.");
        }
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("How many people would you like on your squad?");
        int squadSelect = scan.nextInt();
        if (squadSelect > 2) {
            System.out.println("WHOA WHOA WHOA! That's way too many people. Only you and 2 squad members per away mission. ");
            squadSelect = 2;
        } else if (squadSelect < 2){
            System.out.println("HOLD UP! You can't go alone! That's not enough people. You need 2 other squad members per away mission!");
                squadSelect = 2;
        } else if (squadSelect == 2){
            System.out.println(("That's a good lookin' squad you got there. Good job!"));
        }
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);

        //snacc
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snackOne = scan.next();

        System.out.println("Nice choice, you will be bringing a single " + snackOne + " with you." );
        //break
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        //vehicle select
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("""
                Please select between 3 vehicles:
                A:Kebral Space Program Rover Unit 002
                B:Nissian Skyline GTR BNR34
                C:Magic Broom""");
        String userVehicle = scan.nextLine();

        if (userVehicle.equalsIgnoreCase("A")){
            userVehicle = "Kebral Space Program Rover Unit 002";
        } else if (userVehicle.equalsIgnoreCase("B")) {
            userVehicle = "Nissian Skyline GTR BNR34";
        } else if (userVehicle.equalsIgnoreCase("C")){
            userVehicle = "Magic Broom";
        } userVehicle = "Kebral Space Program Rover Unit 002";
        //time
        Thread.sleep(5000);
        System.out.println("\nloading rocket fuel...");
        Thread.sleep(5000);
        System.out.println("loading nutrition rations...");
        Thread.sleep(5000);
        System.out.println("loading EVA suits...");
        Thread.sleep(5000);
        //mission launch
        System.out.println("\nYour expedition team is now read" +
                "\nLed by " + name + " with " + squadSelect+ " squad members" +
        "\nTo explore strange new worlds....the surface of Mars using a" + userVehicle + "." +
        "\nAway team mission heads out in:") ;
        System.out.println("5");
        Thread.sleep(2000);
        System.out.println("4");
        Thread.sleep(2000);
        System.out.println("3");
        Thread.sleep(2000);
        System.out.println("2");
        Thread.sleep(2000);
        System.out.println("1");
        Thread.sleep(2000);
        System.out.println("░░░░░░░░░░░▄▄▀▀▀▀▀▀▀▀▄▄\n" +
                "░░░░░░░░▄▀▀░░░░░░░░░░░░▀▄▄\n" +
                "░░░░░░▄▀░░░░░░░░░░░░░░░░░░▀▄\n" +
                "░░░░░▌░░░░░░░░░░░░░▀▄░░░░░░░▀▀▄\n" +
                "░░░░▌░░░░░░░░░░░░░░░░▀▌░░░░░░░░▌\n" +
                "░░░▐░░░░░░░░░░░░▒░░░░░▌░░░░░░░░▐\n" +
                "░░░▌▐░░░░▐░░░░▐▒▒░░░░░▌░░░░░░░░░▌\n" +
                "░░▐░▌░░░░▌░░▐░▌▒▒▒░░░▐░░░░░▒░▌▐░▐\n" +
                "░░▐░▌▒░░░▌▄▄▀▀▌▌▒▒░▒░▐▀▌▀▌▄▒░▐▒▌░▌\n" +
                "░░░▌▌░▒░░▐▀▄▌▌▐▐▒▒▒▒▐▐▐▒▐▒▌▌░▐▒▌▄▐\n" +
                "░▄▀▄▐▒▒▒░▌▌▄▀▄▐░▌▌▒▐░▌▄▀▄░▐▒░▐▒▌░▀▄\n" +
                "▀▄▀▒▒▌▒▒▄▀░▌█▐░░▐▐▀░░░▌█▐░▀▄▐▒▌▌░░░▀\n" +
                "░▀▀▄▄▐▒▀▄▀░▀▄▀░░░░░░░░▀▄▀▄▀▒▌░▐\n" +
                "░░░░▀▐▀▄▒▀▄░░░░░░░░▐░░░░░░▀▌▐\n" +
                "░░░░░░▌▒▌▐▒▀░░░░░░░░░░░░░░▐▒▐\n" +
                "░░░░░░▐░▐▒▌░░░░▄▄▀▀▀▀▄░░░░▌▒▐\n" +
                "░░░░░░░▌▐▒▐▄░░░▐▒▒▒▒▒▌░░▄▀▒░▐\n" +
                "░░░░░░▐░░▌▐▐▀▄░░▀▄▄▄▀░▄▀▐▒░░▐\n" +
                "░░░░░░▌▌░▌▐░▌▒▀▄▄░░░░▄▌▐░▌▒░▐\n" +
                "░░░░░▐▒▐░▐▐░▌▒▒▒▒▀▀▄▀▌▐░░▌▒░▌\n" +
                "░░░░░▌▒▒▌▐▒▌▒▒▒▒▒▒▒▒▐▀▄▌░▐▒▒");
        //main end
    }
}
