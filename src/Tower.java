public class Tower {

    int[] taarn;
    int index = -1;

    Tower(int size){

        taarn = new int[size];
    }

    public void setup(){

        for(int i = 0; i < taarn.length; i++){

            taarn[i] = taarn.length - i;
        }
        index = taarn.length - 1;
    }

    public boolean add(int roundThing){

        // System.out.println("trying to move " + roundThing);
        if (index == -1 || taarn[index] > roundThing){
            taarn[index + 1] = roundThing;
            index += 1;
            return true;
        }
        return false;
    }

    public int getTop(){

        if (index < 0){
            //Works when moving to this return value, not from.
            //when no value present return value greater than the currently biggest
            //so all values can move there as it is open
            return taarn.length + 1;
        }

        return taarn[index];
    }

    public void remove(){

        taarn[index] = 0;

        index -= 1;

    }

    public String getString(){

        String returnString = "[";

        for (int i = 0; i <= index; i++){
            returnString += taarn[i];
        }

        return returnString + "]";
    }
}
