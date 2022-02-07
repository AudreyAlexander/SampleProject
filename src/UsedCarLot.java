import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;
    private static int index;

    public UsedCarLot(){
        inventory = new ArrayList<>();
        index = 0;
    }
    public ArrayList getInventory(){
        return inventory;
    }
    public void addCar(Car newCar){
        inventory.add(index, newCar);
        index ++;
    }
    public boolean swap(int num1, int num2){
        if (((num1 > 0) && (num1 < inventory.size())) && ((num2 > 0) && (num2 < inventory.size())))
        {
            Car prevNum1 = inventory.get(num1);
            Car prevNum2 = inventory.get(num2);

            inventory.set(num2, prevNum1);
            inventory.set(num1, prevNum2);

            return true;
        }
        else{
            return false;
        }
    }
    // ADD THESE FOUR NEW METHODS TO UsedCarLot

    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);

    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car saveCar = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return saveCar;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car saveCar = inventory.get(indexOfCarToMove);
        inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, saveCar);

    }


}
