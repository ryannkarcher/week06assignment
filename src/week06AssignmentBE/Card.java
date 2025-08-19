package week06AssignmentBE;
import java.util.Objects;

public class Card { 

    private int value; // numbered, 1-13
    private String name; //name of the card; king, etc
	//create int value and string name to be assigned later

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    } //made a constructor to create a new Card object; value and name are the arguments
    	//value and name are assigned with "this." keyword
    
    public void describe() {
        System.out.println(this.name + " (value: " + this.value + ")");
    } //made a method to print a description of the card: name "king of clubs" with value "13"
    	
  //getters and setters - to retrieve the value and assign it, or set it
    public int getValue() {
        return value;
    } //getter method for the value field

    public void setValue(int value) {
        this.value = value;
    } //setter method for the value field

    public String getName() {
        return name;
    } //getter for the name field

    public void setName(String name) {
        this.name = name;
    } //setter for the name field

    //method to check card equivalencies
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(name, card.name);
    } //section handles the null; shows that Card objects are equal if they have the same value and assigned name.

    //method of hash to create a code for objects with the same value and name.
    public int hashCode() {
        return Objects.hash(value, name);
    }
}