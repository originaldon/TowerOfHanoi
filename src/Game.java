public class Game {

    Tower towerA;
    Tower towerB;
    Tower towerC;

    public Game(int amountDiscs){

        towerA = new Tower(amountDiscs);
        towerB = new Tower(amountDiscs);
        towerC = new Tower(amountDiscs);
        towerA.setup();

        writeTowers();
        solve(amountDiscs, towerA, towerB, towerC);

    }

    public void solve(int amount, Tower tStart, Tower tExtra, Tower tEnd){

            if (amount == 1){

                move(tStart, tEnd);
                writeTowers();
            }else{
                solve(amount - 1, tStart, tEnd, tExtra);
                move(tStart, tEnd);
                writeTowers();
                solve(amount -1, tExtra, tStart, tEnd);
            }
    }

    private boolean move(Tower tA, Tower tB){

        if(tB.add(tA.getTop())){
            tA.remove();
            return true;
        }
        return false;
    }

    private void writeTowers(){

        System.out.println("1: " + towerA.getString());
        System.out.println("2: " + towerB.getString());
        System.out.println("3: " + towerC.getString());
        System.out.println();
    }
}

