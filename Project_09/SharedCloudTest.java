import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*
* Program that tests SharedCloud class.
*
* Project 09
*
* @author Will May
* @4/1/20
*
*/
public class SharedCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Method that tests get/set name method. **/
   @Test public void getSetNameTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
   
      c2.setName("Cloud Two");
      Assert.assertEquals("Get Name", "Cloud Two", c2.getName());
   }
   
   /** Method that tests get/set baseStorageCost method. **/
   @Test public void getSetBaseStorageCostTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
   
      c2.setBaseStorageCost(50.00);
      Assert.assertEquals("Get Base Storage Cost", 50.00, 
            c2.getBaseStorageCost(), 0.000001);
   }
   
   /** Method that tests get/set dataStored method. **/
   @Test public void getSetDataStored() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
   
      c2.setDataStored(40.00);
      Assert.assertEquals("Get Data Stored", 
            40.00, c2.getDataStored(), 0.000001);
   }
   
   /** Method that tests get/set dataLimit method. **/
   @Test public void getSetDataLimit() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
   
      c2.setDataLimit(40.00);
      Assert.assertEquals("Get Data Stored", 
            40.00, c2.getDataLimit(), 0.000001);
   }

/** Method that tests monthlyCost method. **/
   @Test public void monthlyCostTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
   
      c2.setBaseStorageCost(50.00);
      Assert.assertEquals("Monthly Cost", 50.00, c2.monthlyCost(), 0.000001);
   }

/** Method that tests dataOverage method. **/
   @Test public void dataOverageTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
   
      Assert.assertEquals("False dataOverage Test", 00, 
            c2.dataOverage(), 0.000001);
      c2.setDataLimit(2.00);
      Assert.assertEquals("SetA Test", 10.000, c2.dataOverage(), 0.000001);     
   }
   
   /** Method that tests toString method. **/
   @Test public void toStringTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
   
      Assert.assertEquals("toString test", true, 
                  c2.toString().contains("Cloud Two (class SharedCloud) "
                  + "Monthly Cost: $9.00"
                  + "\nBase Storage Cost: $9.00"
                  + "\nData Stored: 12.000 GB"
                  + "\nData Limit: 20.000 GB"
                  + "\nOverage: 0.000 GB"
                  + "\nCost Factor: 1.0"
                  + "\n"));
                  
                  
                  
                  
                  
   
   }



   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
}
