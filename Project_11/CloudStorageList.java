import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
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
public class CloudStorageList {
/**
* Provides methods for reading in the data file and
* generating reports.
*/

//fields
   private CloudStorage[] cStorageList;
   private String[] invalidRecords;

//constructor
/**
* Constructor for CloudStorageList.
*/
   public CloudStorageList() {
      cStorageList = new CloudStorage[0];
      invalidRecords = new String[0];
   }
   
//methods 
/**
* Method getCloudStorageArray for CloudStorageList.
* @return cStorageList
*/
   public CloudStorage[] getCloudStorageArray() {
      return cStorageList;
   }
   
/**
* Method getInvalidRecordsArray for CloudStorageList.
* @return invalidRecords
*/
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
/**
* Method addCloudStorage for CloudStorageList.
* @param cStorageListIn of type CloudStorage
*/   
   public void addCloudStorage(CloudStorage cStorageListIn) {
      cStorageList = Arrays.copyOf(cStorageList, cStorageList.length + 1);
      cStorageList[cStorageList.length - 1] = cStorageListIn;
   }

/**
* Method addInvalidRecord for CloudStorageList.
* @param invalidRecordsIn of type String.
*/
   public void addInvalidRecord(String invalidRecordsIn) {
      invalidRecords = Arrays.copyOf(invalidRecords, 
                              invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = invalidRecordsIn;
   }
   
/**
* Method addInvalidRecord for CloudStorageList.
* @param fileNameIn of type String.
*@throws FileNotFoundException if file can't open
*/
   public void readFile(String fileNameIn) 
                               throws IOException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Scanner scanLine;
      while (scanFile.hasNext()) {
         String line = scanFile.nextLine();
         
         try {
            scanLine = new Scanner(line);
            scanLine.useDelimiter(",");
         
            char type = scanLine.next().toUpperCase().charAt(0);
            String name = scanLine.next().trim();
            double baseStorageCost = Double.parseDouble(scanLine.next().trim());
            double cost = Double.parseDouble(scanLine.next().trim());
            double stored = Double.parseDouble(scanLine.next().trim());
            double limit = Double.parseDouble(scanLine.next().trim());
         
            switch (type) {
               case 'D':
               
                  CloudStorage c1 = new DedicatedCloud(name, 
                     baseStorageCost, cost);
                  addCloudStorage(c1);
                  break;
            
               case 'S':
               
               
                  CloudStorage c2 = new SharedCloud(name, baseStorageCost, 
                                             stored, limit);
                  addCloudStorage(c2);
                  break;
            
               case 'C':
               
               
                  CloudStorage c3 = new PublicCloud(name, baseStorageCost, 
                                             stored, limit);
                  addCloudStorage(c3);
                  break;
            
               case 'P':
               
               
                  CloudStorage c4 = new PersonalCloud(name, baseStorageCost, 
                                             stored, limit);
                  addCloudStorage(c4);
                  break;
            
               default: 
                  addInvalidRecord(line);
                  break;
            } 
         } 
         catch (NumberFormatException m) {
            addInvalidRecord(m + " in:\n" + line);
         }
         catch (NoSuchElementException m) {
            addInvalidRecord(m + " in:\n" + line);
         } 
           
      }
   }

/**
* Method generateReport for CloudStorageList.
* @return result.
*/
   public String generateReport() {
      String result = "";
   
      result = "\n-------------------------------\n"
         + "Monthly Cloud Storage Report" 
         + "\n-------------------------------";
      result += getCloudStorageArray();      
      return result + "\n";
   }

/**
* Method generateReportByName for CloudStorageList.
* @return result.
*/
   public String generateReportByName() {
      Arrays.sort(getCloudStorageArray());
      String result = "";
   
      result = "\n-------------------------------\n"
         + "Monthly Cloud Storage Report (by Name)" 
         + "\n-------------------------------";
      for (CloudStorage cItem : cStorageList) {
         result += "\n" + cItem + "\n";
      }
      return result + "\n";
   }

/**
* Method generateReportByMonthlyCost for CloudStorageList.
* @return result.
*/
   public String generateReportByMonthlyCost() {
      Arrays.sort(getCloudStorageArray(), new MonthlyCostComparator());
      String result = "";
   
      result = "\n-------------------------------\n"
         + "Monthly Cloud Storage Report (by Monthly Cost)" 
         + "\n-------------------------------";
      for (CloudStorage cItem : cStorageList) {
         result += "\n" + cItem + "\n";
      }
      return result + "\n";
   }









}