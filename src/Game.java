import java.util.ArrayList;

public class Game {

    ArrayList<Integer> taarnA = new ArrayList<>();
    ArrayList<Integer> taarnB = new ArrayList<>();
    ArrayList<Integer> taarnC = new ArrayList<>();

    public Game(int amountDiscs){

        setup(amountDiscs);
        move(taarnA, taarnB, taarnC);

        System.out.println("1: " + taarnA);
        System.out.println("2: " + taarnB);
        System.out.println("3: " + taarnC);
    }

    private void setup(int amount){

        for (int i = 0; i < amount; i++){

            taarnA.add(i + 1);
        }
    }

    private void move(ArrayList<Integer> al1, ArrayList<Integer> al2, ArrayList<Integer> al3){

        System.out.println("1: " + al1);
        System.out.println("2: " + al2);
        System.out.println("3: " + al3);
        System.out.println();

        if (al2.size() == 0 || al1.get(0) < al2.get(0)) {

                al2.add(0, al1.get(0));
                al1.remove(0);
                move(al1, al2, al3);

        }
        else if (al3.size() == 0 || al1.get(0) < al3.get(0)) {

            al3.add(0, al1.get(0));
            al1.remove(0);
            move(al1, al2, al3);
        }
        else if (al2.get(0) < al3.get(0)){

            al3.add(0,al2.get(0));
            al2.remove(0);
            move(al1, al2, al3);
        }
        else if (al1.size() != 0 || al3.get(0) < al1.get(0)){

            al1.add(0,al3.get(0));
            al3.remove(0);
            move(al1, al2, al3);
        }
        else if (al3.get(0) < al2.get(0)) {

            al2.add(0,al3.get(0));
            al3.remove(0);
            move(al1, al2, al3);
        }

        else if (al1.size() != 0 || al2.get(0) < al1.get(0)) {

            al1.add(0,al2.get(0));
            al2.remove(0);
            move(al1, al2, al3);
        }



    }


}

