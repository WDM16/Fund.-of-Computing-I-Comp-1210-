import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*
* Program that tests DedicatedCloud class.
*
* Project 09
*
* @author Will May
* @4/1/20
*
*/
public class DedicatedCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Method that tests get/set name method. **/
   @Test public void getSetNameTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
   
      c1.setName("Cloud Two");
      Assert.assertEquals("Get Name", "Cloud Two", c1.getName());
   }
   
   /** Method that tests get/set baseStorageCost method. **/
   @Test public void getSetBaseStorageCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
   
      c1.setBaseStorageCost(50.00);
      Assert.assertEquals("Get Base Storage Cost", 50.00, 
            c1.getBaseStorageCost(), 0.000001);
   }
   
   /** Method that tests get/set ServerCost method. **/
   @Test public void getSetServerCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
   
      c1.setServerCost(20.00);
      Assert.assertEquals("Get Server Cost", 
            20.00, c1.getServerCost(), 0.000001);
   }

/** Method that tests get/set ServerCost method. **/
   @Test public void monthlyCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
   
      c1.setBaseStorageCost(50.00);
      Assert.assertEquals("Monthly Cost", 60.00, c1.monthlyCost(), 0.000001);
   }
   
   /** Method that tests get/reset Count method. **/
   @Test public void getCountTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
   
      c1.resetCount();
      Assert.assertEquals("Reset count Test", 0, c1.getCount());
   
   }

   /** Method that tests toString method. **/
   @Test public void toStringTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
   
      Assert.assertEquals("toString test", true, 
                  c1.toString().contains("Cloud One (class DedicatedCloud) "
                  + "Monthly Cost: $50.00"
                  + "\nBase Storage Cost: $40.00"
                  + "\nServer Cost: $10.00"
                  + "\n"));
                  
                  
                  
                  
                  
   
   }



   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
}
