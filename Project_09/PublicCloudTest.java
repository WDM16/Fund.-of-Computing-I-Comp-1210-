import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*
* Program that tests PublicCloud class.
*
* Project 09
*
* @author Will May
* @4/1/20
*
*/
public class PublicCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Method that tests get/set name method. **/
   @Test public void getSetNameTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
   
      c4.setName("Cloud Two");
      Assert.assertEquals("Get Name", "Cloud Two", c4.getName());
   }
   
   /** Method that tests get/set baseStorageCost method. **/
   @Test public void getSetBaseStorageCostTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
   
      c4.setBaseStorageCost(50.00);
      Assert.assertEquals("Get Base Storage Cost", 50.00, 
            c4.getBaseStorageCost(), 0.000001);
   }
   
   /** Method that tests get/set ServerCost method. **/
   @Test public void getSetDataStored() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
   
      c4.setDataStored(40.00);
      Assert.assertEquals("Get Data Stored", 
            40.00, c4.getDataStored(), 0.000001);
   }

/** Method that tests monthlyCost method. **/
   @Test public void monthlyCostTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
   
      c4.setBaseStorageCost(50.00);
      Assert.assertEquals("Monthly Cost", 60.00, c4.monthlyCost(), 0.000001);
   }

/** Method that tests dataOverage method. **/
   @Test public void dataOverageTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
   
      Assert.assertEquals("False dataOverage Test", 
            5.0, c4.dataOverage(), 0.000001);
      c4.setDataLimit(2.00);
      Assert.assertEquals("SetA Test", 23.000, c4.dataOverage(), 0.000001);     
   }
   
   /** Method that tests toString method. **/
   @Test public void toStringTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
   
      Assert.assertEquals("toString test", true, 
                  c4.toString().contains("Cloud Four (class PublicCloud) "
                  + "Monthly Cost: $19.00"
                  + "\nBase Storage Cost: $9.00"
                  + "\nData Stored: 25.000 GB"
                  + "\nData Limit: 20.000 GB"
                  + "\nOverage: 5.000 GB"
                  + "\nCost Factor: 2.0"
                  + "\n"));
                  
                  
                  
                  
                  
   
   }



   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
}
