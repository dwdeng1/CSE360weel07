package cse360assignment02;
/**
 * This is a package called cse360assignment02
 *  It contains main.java
 *  The purpose of this class is to demonstrate that the AddingMachine.java functions work.
 *  I used the sample output as an example, with a little bit added to the end.
 */
public class main {

    public static void main(String[] args)
    {
        AddingMachine machineObject = new AddingMachine(); //create machine object
        machineObject.add(4); // this is just adding and subtracting multiple values below, just to demonstrate it works as expected
        machineObject.subtract(2); //subtracts 2
        machineObject.add(5);//adds 5
       System.out.println( machineObject.toString());//shows history
       machineObject.clear();//resets command back to 0
       machineObject.subtract(40);//subtracts 40
        System.out.println( machineObject.toString());//display output after clearing and subtracting 40

    }
}