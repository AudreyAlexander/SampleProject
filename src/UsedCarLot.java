import java.util.ArrayList;

/** This class represents a Used Car Lot
 * @author Audrey Alexander
 */

public class UsedCarLot {
    /** The list of the Cars in the lot*/
    private ArrayList<Car> inventory;

    /** Instantiates a UsedCarLot object */
    public UsedCarLot(){
        inventory = new ArrayList<>();
    }

    /**Method that returns inventory*/
    public ArrayList getInventory(){
        return inventory;
    }

    /**Method that adds a newCar to the ArrayList
     * <p>
     * @param newCar new Car object to add to Inventory
     */
    public void addCar(Car newCar){
        inventory.add(newCar);
    }

    /**Method that moves the Car at one index to another
     * <p>
     * @param num1 initial index of the Car
     * @param num2 final index of the Car
     * @return whether or not the swap was successful
     */
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

    /**Method that adds a Car to the inventory list at the index specified by indexToAdd
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     * @param indexToAdd where to put the car
     * @param carToAdd what Car to add
     */


    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }


    /** Method that sells a Car at a certain index, removes it from the Inventory ArrayList
     * <p>
     * PRECONDITION: indexOfCarToSell &lt;= inventory.size()
     * @param indexOfCarToSell the index of the Car being sold
     * @return the car being sold
     */

    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);

    }

    /** Method that sells the Car at a specified index, but instead of shortening the ArrayList replaces it with "null"
     * <p>
     * PRECONDITION: indexOfCarToSell &lt;= inventory.size()
     * @param indexOfCarToSell the index of the Car being sold
     * @return the car being sold
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car saveCar = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return saveCar;
    }


    /**Method that moves Car object located at one index to another index
     *<p>
     * PRECONDITION: indexOfCarToMove &lt;= inventory.size() destinationIndex &lt;= inventory.size()
     * @param indexOfCarToMove original index of car
     * @param destinationIndex final index of car
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car saveCar = inventory.get(indexOfCarToMove);
        inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, saveCar);

    }


}
