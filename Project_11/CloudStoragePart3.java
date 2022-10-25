import java.io.FileNotFoundException;
import java.io.IOException;

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
public class CloudStoragePart3 {
   /** 
   * Provides a main method.
   * @param args -
   * @throws FileNotFoundException if file can't open.
   */
   public static void main(String[] args) { 
      CloudStorageList cList = new CloudStorageList();
      if (args.length != 0) {
         String fileName = args[0];
      }
      
      System.out.println(cList.generateReport() 
            + cList.generateReportByName() 
            + cList.generateReportByMonthlyCost());
      
   
   
   }
}
