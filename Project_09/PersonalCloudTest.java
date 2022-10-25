import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*
* Program that tests PersonalCloud class.
*
* Project 09
*
* @author Will May
* @4/1/20
*
*/
public class PersonalCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Method that tests get/set name method. **/
   @Test public void getSetNameTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
   
      c5.setName("Cloud Two");
      Assert.assertEquals("Get Name", "Cloud Two", c5.getName());
   }
   
   /** Method that tests get/set baseStorageCost method. **/
   @Test public void getSetBaseStorageCostTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
   
      c5.setBaseStorageCost(50.00);
      Assert.assertEquals("Get Base Storage Cost", 50.00, 
            c5.getBaseStorageCost(), 0.000001);
   }
   
   /** Method that tests get/set ServerCost method. **/
   @Test public void getSetDataStored() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
   
      c5.setDataStored(40.00);
      Assert.assertEquals("Get Data Stored", 
            40.00, c5.getDataStored(), 0.000001);
   }

/** Method that tests monthlyCost method. **/
   @Test public void monthlyCostTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
   
      c5.setBaseStorageCost(50.00);
      Assert.assertEquals("Monthly Cost", 53.00, c5.monthlyCost(), 0.000001);
   }

/** Method that tests dataOverage method. **/
   @Test public void dataOverageTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
   
      Assert.assertEquals("False dataOverage Test", 1.0, 
         c5.dataOverage(), 0.000001);
      c5.setDataLimit(2.00);
      Assert.assertEquals("SetA Test", 19.000, c5.dataOverage(), 0.000001);     
   }
   
   /** Method that tests toString method. **/
   @Test public void toStringTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
   
      Assert.assertEquals("toString test", true, 
                  c5.toString().contains("Cloud Five (class PersonalCloud) "
                  + "Monthly Cost: $12.00"
                  + "\nBase Storage Cost: $9.00"
                  + "\nData Stored: 21.000 GB"
                  + "\nData Limit: 20.000 GB"
                  + "\nOverage: 1.000 GB"
                  + "\nCost Factor: 3.0"
                  + "\n"));
                  
                  
                  
                  
                  
   
   }



   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
}
