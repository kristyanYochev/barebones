package uk.ac.soton.ky5u21.barebones;

import java.util.HashMap;

/**
 * Instances of this class store the variable values during program execution
 */
public class Environment {

  private final HashMap<String, Integer> variables = new HashMap<>();

  /**
   * Retrieves the value of a variable given the name. If the variable has not been encountered yet,
   * its value is cleared and a 0 is returned.
   *
   * @param name The name of the variable
   * @return The value of the variable
   */
  public int valueOf(String name) {
    Integer value = variables.get(name);

    if (value == null) {
      clear(name);
      return 0;
    } else {
      return value;
    }
  }

  /**
   * Sets the value of a variable to 0.
   *
   * @param name The name of the variable
   */
  public void clear(String name) {
    variables.put(name, 0);
  }

  /**
   * Adds 1 to the value of a variable and stores it back in itself.
   *
   * @param name The name of the variable
   */
  public void increment(String name) {
    variables.put(name, valueOf(name) + 1);
  }

  /**
   * Subtracts 1 from the value of the variable and stores it back in itself.
   *
   * @param name The name of the variable
   */
  public void decrement(String name) {
    variables.put(name, valueOf(name) - 1);
  }
}
