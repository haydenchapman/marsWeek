import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("HOLD UP! that last one is not a rock we need to delete that one from the list");

        rockList.remove("not rock");

        System.out.println(rockList);

        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded.");

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implying there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        Scanner scan = new Scanner(System.in);

        String userFossil = scan.nextLine();

        if (userFossil.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + userFossil + "\nDescription: " + fossilDirectory.get(userFossil));
        } else if (userFossil.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + userFossil + "\nDescription: " + fossilDirectory.get(userFossil));
        } else if (userFossil.equalsIgnoreCase("Tooth")){
            System.out.println("Fossil: " + userFossil + "\nDescription " + fossilDirectory.get(userFossil));
        }

        Thread.sleep(700);

        HashSet<String> supplyOne = new HashSet<>();

        supplyOne.add("Phaser");
        supplyOne.add("Space Ice Cream");
        supplyOne.add("Flashlight");

        supplyOne.remove("Space Ice Cream");
        Iterator itr = supplyOne.iterator();

        while (itr.hasNext()){
            System.out.println(itr.hasNext());
        }
    }
}
