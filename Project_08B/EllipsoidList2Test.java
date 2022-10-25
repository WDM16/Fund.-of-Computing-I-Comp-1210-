import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
//import java.io.IOException;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;



/**
*
* Program that tests EllipsoidList2 class.
*
* Project 08A
*
* @author Will May
* @3/19/20
*
*/
public class EllipsoidList2Test {

 /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before
   public void setUp() {
   }

  /** method to test calculation and get methods. */
   @Test public void gettersTest() {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[0];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);
      
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2("Test List Null",
         nullArray, 0);
      
      Assert.assertEquals("Get Name Test", "Test List", eList.getName());
      Assert.assertEquals("Get List Test", eArray, eList.getList());
      Assert.assertEquals("Get numOfEllip Test", 3,
         eList.numberOfEllipsoids());
      Assert.assertEquals("Get numOfEllip when 0", 0,
         eListNull.numberOfEllipsoids());
      Assert.assertEquals("Surface Area Test", 1164.0658,
         eList.totalSurfaceArea(), 0.0001);
      Assert.assertEquals("Surface Area Test when 0", 0,
         eListNull.totalSurfaceArea(), 0.0000001);
      Assert.assertEquals("Volume Test", 2638.9378,
         eList.totalVolume(), 0.0001);
      Assert.assertEquals("Volume Test when 0", 0,
         eListNull.totalVolume(), 0.0001);
      Assert.assertEquals("Avg. Surface Area Test", 388.02195,
         eList.averageSurfaceArea(), 0.0001);
      Assert.assertEquals("Avg. Surface Area Test when 0", 0,
         eListNull.averageSurfaceArea(), 0.0001);
      Assert.assertEquals("Avg. Volume Test", 879.6459,
         eList.averageVolume(), 0.0001);
      Assert.assertEquals("Avg. Volume Test when 0", 0,
         eListNull.averageVolume(), 0.0001);
      
   }
   
   /** method to test methods that return string. */
   @Test public void stringsTest() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[0];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);
      
      EllipsoidList2 eList = new EllipsoidList2("Test List", eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2("Test List Null",
         nullArray, 0);
      
      Assert.assertEquals("toString Test", false, eList.toString().contains(
                  "Test List"  + eArray[0].toString() + "\n"
                   + eArray[1].toString() + "\n" 
                   + eArray[2].toString()));
      Assert.assertEquals("toString Test when numOfEllips = 0", true, 
         eListNull.toString().contains("Test List Null"));
      Assert.assertEquals("Summary Info test", true, eList.summaryInfo()
                   .contains("----- Summary for " + eList.getName()
                   + " -----\n"));
   }
   
   /** Method to test the readFile method.
   *@throws FileNotFoundException xd. */
   @Test public void readFileTest() throws FileNotFoundException {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[10];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);
      
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2(
         "Test List Null", nullArray, 0);
      EllipsoidList2 eListNull2 = new EllipsoidList2(
         "Test List for reading file", nullArray, 0);
      
      eListNull.readFile("Ellipsoid_data_1.txt");
      Assert.assertEquals("File with objects", 3,
         eListNull.numberOfEllipsoids());
      
      eList.readFile("Ellipsoid_data_0.txt");
      Assert.assertEquals("File with no objects", 3,
         eList.numberOfEllipsoids());
   }
   
   /** Method to test the addEllipsoid method. */
   @Test public void addETest() {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[10];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);
      
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2("Test List Null",
         nullArray, 0);
      
      eListNull.addEllipsoid("Test", 3, 2, 1);
      Assert.assertEquals("Added Ellipsoid", "Test", nullArray[0].getLabel());
      eListNull.addEllipsoid("Test2", 10, 9, 8);
      Assert.assertEquals("Added Ellipsoid 2", 
         "Test2", nullArray[1].getLabel());
   }
   
   /** Method to test the findEllipsoid method. */
   @Test public void findEllipsoidTest() {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[10];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);
      
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2(
         "Test List Null", nullArray, 0);
      
      Assert.assertEquals("Found", eArray[1],
         eList.findEllipsoid("Ex 2"));
      Assert.assertEquals("Not Found", null,
         eListNull.findEllipsoid("n/a"));
   }
   
   /** Method to test the deleteEllipsoid method. */
   @Test public void deleteEllipsoidTest() {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[10];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);
      
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2(
         "Test List Null", nullArray, 0);
      
      Assert.assertEquals("Deleted", eArray[1],
         eList.deleteEllipsoid("Ex 2"));
      
      eList.deleteEllipsoid("Ex 2");
      Assert.assertEquals("Deleted2", eArray[1],
         eList.findEllipsoid("Ex 3"));
      
      eList.deleteEllipsoid("Ex 3");
      Assert.assertEquals("Deleted3", null, eArray[1]);
   }
   
   /** Method to test the editEllipsoid method. */
   @Test public void editEllipsoidTest() {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[10];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);
      
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2(
         "Test List Null", nullArray, 0);
      
      eList.editEllipsoid("Ex 1", 2, 3, 4);
      Assert.assertEquals("Edited A", 2, eArray[0].getA(), 0.0001);
      Assert.assertEquals("Edited B", 3, eArray[0].getB(), 0.0001);
      Assert.assertEquals("Edited C", 4, eArray[0].getC(), 0.0001);
      
      Assert.assertEquals("not found", null,
         eList.editEllipsoid("Ex 5", 4, 8, 1));
      
   }
         
       /** Method to test the smallest volume method. */
   @Test public void smallestVolumeTest() {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[10];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);         
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2(
         "Test List Null", nullArray, 0);
      
      Assert.assertEquals("Small Volume pass", eArray[0],
         eList.findEllipsoidWithSmallestVolume());
      Assert.assertEquals("Small Volume fail", null,
         eListNull.findEllipsoidWithSmallestVolume());
   }
   
   /** Method to test the largest volume method. */
   @Test public void largestVolumeTest() {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[10];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);          
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2(
         "Test List Null", nullArray, 0);
      
      Assert.assertEquals("Large Volume pass", eArray[2],
         eList.findEllipsoidWithLargestVolume());
      Assert.assertEquals("Large Volume fail", null,
         eListNull.findEllipsoidWithLargestVolume());
      
   }
   
    /** Method to test the smallest Surface Area method. */
   @Test public void smallestSurfaceArea() {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[10];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);         
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2(
         "Test List Null", nullArray, 0);
      
      Assert.assertEquals("Small Surface Area pass", eArray[0],
         eList.findEllipsoidWithSmallestSurfaceArea());
      Assert.assertEquals("Small Surface Area fail", null,
         eListNull.findEllipsoidWithSmallestSurfaceArea());
   }
   
   /** Method to test the largest Surface Area method. */
   @Test public void largestSurfaceAreaTest() {
      Ellipsoid[] eArray = new Ellipsoid[100];
      Ellipsoid[] nullArray = new Ellipsoid[10];
      eArray[0] = new Ellipsoid("Ex 1", 1, 2, 3);
      eArray[1] = new Ellipsoid("Ex 2", 4, 5, 6);
      eArray[2] = new Ellipsoid("Ex 3", 7, 8, 9);          
      EllipsoidList2 eList = new EllipsoidList2("Test List",
         eArray, 3);
      EllipsoidList2 eListNull = new EllipsoidList2(
         "Test List Null", nullArray, 0);
      
      Assert.assertEquals("Large Surface Area pass", eArray[2],
         eList.findEllipsoidWithLargestSurfaceArea());
      Assert.assertEquals("Large Surface Area fail", null,
         eListNull.findEllipsoidWithLargestSurfaceArea());
      
   }

      











   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
         //   + "this test once you have added your own.", 0, 1);
   //}
}
