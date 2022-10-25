import java.io.FileNotFoundException;
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
public class CloudStoragePart2 {
   /** 
   * Provides a main method.
   * @param args -
   * @throws FileNotFoundException if file can't open.
   */
   public static void main(String[] args) throws FileNotFoundException {
      CloudStorageList cList = new CloudStorageList();
      if (args.length != 0) {
         String fileName = args[0];
         cList.readFile(fileName);
      }
      
      System.out.println(cList.generateReport() + cList.generateReportByName() 
         + cList.generateReportByMonthlyCost());
   
   }
}

