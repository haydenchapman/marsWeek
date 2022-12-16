public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Tharsis City";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = (meals * 0.75);
        meals = (meals * 0.75);
        System.out.println(meals);
        meals = (meals + (meals * .5));

        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("BBBZZZ!!! LANDING ON THE PLAIN!");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain.");
        }
        landingCheck(4);
    //main end
    }
    public static boolean landingCheck(int minutesLeft) throws InterruptedException{
        for(int minute = 0; minute <= minutesLeft;) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Falcon has landed.");
        return false;
    }
}
