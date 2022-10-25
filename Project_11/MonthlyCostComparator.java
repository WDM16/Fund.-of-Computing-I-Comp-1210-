import java.util.Comparator;
/**
*
* Program that involves the monthly cost
* and reporting for cloud storage.
*
* Project 10
*
* @author Will May
* @4/8/20
*
*/

public class MonthlyCostComparator implements Comparator<CloudStorage> {
/**
* Provides methods for reading in the data file and
* generating reports.
* @param c1 of type CloudStorage
* @param c2 of type CloudStorage
* @return -
*/
   public int compare(CloudStorage c1, CloudStorage c2) {
      if (c1.monthlyCost() > c2.monthlyCost()) {
         return 1;
      }
      else if (c1.monthlyCost() < c2.monthlyCost()) {
         return -1;
      }
      return 0;
   }
}