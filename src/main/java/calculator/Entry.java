package calculator;

import java.util.Objects;

/**
 * Printable container class for either a Float, a String or a Symbol.
 * 
 * @author dhoot
 *
 */
public class Entry {
  /**
   * Float to be stored in entry.
   */
  private Float number;
  /**
   * Symbol(enumerated type) to be stored in entry.
   */
  private Symbol other;
  /**
   * String to be stored in entry.
   */
  private String str;
  /**
   * Type(enumerated type) of the entry.
   */
  private Type type;

  /**
   * Constructor for (Float) entry and sets the type of the entry.
   * 
   * @param value (Float) value to put into the entry.
   */
  public Entry(float value) {
    number = value;
    type = Type.NUMBER;
  }

  /**
   * Constructor for (Symbol) entry and sets the type of the entry.
   * 
   * @param value (Symbol) value to put into the entry.
   */
  public Entry(Symbol which) {
    other = which;
    type = Type.SYMBOL;
  }

  /**
   * Constructor for (String) entry and sets the type of the entry.
   * 
   * @param i value (String) value to put into the entry.
   */
  public Entry(String i) {
    str = i;
    type = Type.STRING;
  }


  /**
   * Returns the value stored in entry.
   * 
   * @return the value stored when entry is created.
   * @throws BadTypeException if you use this on something that is not a Float.
   */
  public Float getValue() throws BadTypeException {
    if (number != null) { // using Float instead of float as float cannot be null
      return number;
    } else {
      throw new BadTypeException("Wrong type");
    }
  }

  /**
   * Returns the value stored in entry.
   * 
   * @return the value stored when entry is created.
   * @throws BadTypeException if you use this on something that is not a Symbol.
   */
  public Symbol getSymbol() throws BadTypeException {
    if (other != null) {
      return other;
    } else {
      throw new BadTypeException("Wrong type");
    }
  }

  /**
   * Returns the value stored in entry.
   * 
   * @return the value stored when entry is created.
   * @throws BadTypeException if you use this on something that is not a String.
   */
  public String getString() throws BadTypeException {
    if (str != null) {
      return str;
    } else {
      throw new BadTypeException("Wrong type");
    }
  }

  /**
   * Returns the enumerated type of the value held.
   * 
   * @return the enumerated type of the value stored in the entry.
   */
  public Type getType() {
    return type;
  }

  /**
   * A method to check if two entry's are the same.
   *
   * @return true or false if two objects are the same.
   */
  @Override
  public boolean equals(Object obj) { // auto-generated equals method
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Entry other = (Entry) obj;
    return Objects.equals(number, other.number) && this.other == other.other
        && Objects.equals(str, other.str) && type == other.type;
  }

  /**
   * A method to return an integer hashCode for an entry.
   */
  @Override
  public int hashCode() { // auto-generated hashCode method
    return Objects.hash(number, other, str, type);
  }

  /**
   * Prints an entry as a string.
   */
  @Override
  public String toString() { // auto-generated toString method
    return "Entry [number=" + number + ", other=" + other + ", str=" + str + ", type=" + type + "]";
  }

}
