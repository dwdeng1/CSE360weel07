/**
* This is a package called cse360assignment02
 *  It contains AddingMachine.java
 *  Has 2 variables, a total and a string that shows the commands done.
*/
package cse360assignment02;
public class AddingMachine {
    private int total;
    private String commands ="0"; // define this as 0, because it should always start as 0 for the history. Its labelled commands because these are the commands you told it to do.
    /**
     * AddingMachine initializes total.
     *  It is a public method, using total.
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity

    }
    /**
     * getTotal is a method that returns total's current value.
     *  It is a public method, using total.
     * @return total
     */
    public int getTotal () {
        return total; // should return total
    }
    /**
     * add should add a parameter to total.
     *  It is a public method, using total and a parameter. It is void, so it returns nothing.
     * @param value
     */
    public void add (int value) {
        total= total + value; // add parameter to  total
        commands=commands.concat(" + " +Integer.toString(value)); //prints the added value
    }
    /**
     * subtract should subtract the parameter from total.
     *  It is a public method, using total and a parameter. It is void, so it returns nothing.
     * @param value
     */
    public void subtract (int value) {
        total = total - value; // subtract parameter from total variable
        commands=commands.concat(" - " +Integer.toString(value)); //prints the subtracted value
    }
    /**
     * toString should display the keep a history of methods, and print them
     *  It is a public method and returns commands, which is a "history" of commands.
     * @return commands
     */
    public String toString () {
        return commands; //returns a string, which shows the user what they did
    }
    /**
     * clear should delete the messages from toString
     *  It is a public method. It just resets the commands back to 0, so it can now display a new string of values.
     */
    public void clear() {
        commands="0"; // reset the commands to 0, so everything you do should start from 0.
    }
}