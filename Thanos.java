import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero blackwidow = new Hero("Black Widow", 34);
        Hero captainamerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironman = new Hero("Iron Man", 48);
        Hero scarletwitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero spiderman = new Hero("Spider Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorstrange = new Hero("Doctor Strange", 42);

        
        ArrayList<Hero> heros = new ArrayList<>();
        heros.add(blackwidow);
        heros.add(captainamerica);
        heros.add(vision);
        heros.add(ironman);
        heros.add(scarletwitch);
        heros.add(thor);
        heros.add(spiderman);
        heros.add(hulk);
        heros.add(doctorstrange);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heros);

        // TODO 5 : Keep only the half of the list
       List <Hero> heros2 = heros.subList(0,heros.size()/2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        for (Hero i : heros2) {
            System.out.println(i.getName());
          }
    }
}