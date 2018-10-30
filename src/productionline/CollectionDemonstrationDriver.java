///////////////////////////////////////////////////////////////////////////////
// File: CollectionDemonstrationDriver.java
// By:   Greening, Zachary
// Date: October 22, 2018
// Description: The driver class for demonstrating a collection of products
//    and the ability to sort them alphabetically by name
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemonstrationDriver {

  /**
   * A test driver class for testing the printing and sorting of an arrayList of Products.
   *
   * @param arrayList list of products to print and sort
   */
  public static void testCollectionSort(ArrayList arrayList) {
    System.out.println(arrayList);
    System.out.println();

    Collections.sort(arrayList, Comparator.comparing(Product::getName));

    System.out.println(arrayList);
  }
}
