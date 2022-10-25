import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

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

// Variables, objects and list
   private String name = "List Test Name";
   private static int numberOfEllipsoid = 0;
   private Ellipsoid[] ellipsoidlist = new Ellipsoid[20];
   private Ellipsoid[] ellipsoidlistNullList = new Ellipsoid[20];

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Before
   public void setUp() throws Exception {
      numberOfEllipsoid = 0;
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void getNameTest() throws Exception {
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      Assert.assertEquals("", "List Test Name", eTest2.getName());
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void numberOfEllipsoidsTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                             i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name, 
                                ellipsoidlist, numberOfEllipsoid);
      Assert.assertEquals("", 5, eTest2.numberOfEllipsoids());
   
      EllipsoidList2 eNullTest2 = new EllipsoidList2(name,  
                                                   ellipsoidlistNullList, 1);
      Assert.assertEquals("", 1, eNullTest2.numberOfEllipsoids());
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void totalSurfaceAreaTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
      
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      double total = 0;
      for (int i = 0; i < numberOfEllipsoid; i++) {
         total += ellipsoidlist[i].surfaceArea();
      }
      Assert.assertEquals("", total, eTest2.totalSurfaceArea(), .001);
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void totalVolumeTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      double total = 0;
      for (int i = 0; i < numberOfEllipsoid; i++) {
         total += ellipsoidlist[i].volume();
      }
      Assert.assertEquals("", total, eTest2.totalVolume(), .001);
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void averageSurfaceAreaTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);         
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      double total = 0;
      for (int i = 0; i < numberOfEllipsoid; i++) {
         total += (ellipsoidlist[i].surfaceArea()) / numberOfEllipsoid;
      }
      Assert.assertEquals("", total, eTest2.averageSurfaceArea(), .001);
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void averageVolumeTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);         
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      double total = 0;
      for (int i = 0; i < numberOfEllipsoid; i++) {
         total += (ellipsoidlist[i].volume()) / numberOfEllipsoid;
      }
      Assert.assertEquals("", total, eTest2.averageVolume(), .001);
   }

   
   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void toStringTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      Assert.assertEquals("", 
          false, 
            eTest2.toString()
               .contains("Total Volume: "));                              
                          
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void summaryInfoTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      Assert.assertEquals("", true, eTest2.summaryInfo()
                                                .contains("Total Volume: "));
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void getListTest() throws Exception {
      setUp();
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      Assert.assertArrayEquals("", ellipsoidlist, eTest2.getList());
   }

   /**
    *
    * @throws IOException thows exception bc it might not fine a file
    */
   @Test
   public void readFileTest() throws IOException {
      EllipsoidList2 eList2 = new EllipsoidList2("test list", null, 0);
      eList2 = eList2.readFile("Ellipsoid_data_1.txt");
      Assert.assertEquals("", "Ellipsoid Test List", eList2.getName());
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void addEllipsoidTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      Ellipsoid eTrue = new Ellipsoid("test", 2.5, 2.5, 2.5);
      eTest2.addEllipsoid("test", 2.5, 2.5, 2.5);
   
      Assert.assertEquals("", eTrue, ellipsoidlist[numberOfEllipsoid]);
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void findEllipsoidTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name,  
                                ellipsoidlist, numberOfEllipsoid);
      Ellipsoid eTrue = new Ellipsoid("test4", 4.25, 4.25, 4.25);
      Assert.assertEquals("", eTrue, eTest2.findEllipsoid("test4"));
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void deleteEllipsoidTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name, 
                                ellipsoidlist, numberOfEllipsoid);
      eTest2.deleteEllipsoid("test4");
      Ellipsoid eTrue = new Ellipsoid("test2", 2.25, 2.25, 2.25);
      Assert.assertFalse("", eTrue == eTest2.findEllipsoid("test2"));
      
      Ellipsoid eFalse = new Ellipsoid("test3", 2.25, 2.25, 2.25);
      Assert.assertFalse("", eFalse == eTest2.findEllipsoid("test3"));
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void editDodecahedronTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name, 
                                ellipsoidlist, numberOfEllipsoid);
      eTest2.editEllipsoid("test4", 425, 425, 425);
      Ellipsoid eTrue = new Ellipsoid("test4", 425, 425, 425);
      Assert.assertEquals("", eTrue, eTest2.findEllipsoid("test4"));
   }

  
    /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void findEllipsoidWithSmallestVolumeTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name, 
                                ellipsoidlist, numberOfEllipsoid);
      Ellipsoid eTrue = new Ellipsoid("test0", 0.25, 0.25, 0.25);
      Assert.assertEquals("", eTrue, 
                           eTest2.findEllipsoidWithSmallestVolume());
   }

   /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void findEllipsoidWithLargestVolumeTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name, 
                                             ellipsoidlist, numberOfEllipsoid);
      Ellipsoid eTrue = new Ellipsoid("test4", 4.25, 4.25, 4.25);
      Assert.assertEquals("", eTrue, 
                        eTest2.findEllipsoidWithLargestVolume());
   }

/**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void findEllipsoidWithSmallestSurfaceAreaTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name, 
                                ellipsoidlist, numberOfEllipsoid);
      Ellipsoid eTrue = new Ellipsoid("test0", 0.25, 0.25, 0.25);
      Assert.assertEquals("", eTrue, 
                           eTest2.findEllipsoidWithSmallestVolume());
   }
   
    /**
    *
    * @throws Exception thows exception bc it might
    */
   @Test
   public void findEllipsoidWithLargestSurfaceAreaTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         Ellipsoid eObj = new Ellipsoid("test" + i, i + .25, 
                                                   i + .25, i + .25);
         ellipsoidlist[i] = eObj;
         numberOfEllipsoid++;
      }
      EllipsoidList2 eTest2 = new EllipsoidList2(name, 
                                ellipsoidlist, numberOfEllipsoid);
      Ellipsoid eTrue = new Ellipsoid("test4", 4.25, 4.25, 4.25);
      Assert.assertEquals("", eTrue, 
                           eTest2.findEllipsoidWithLargestVolume());
   }


      











   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
         //   + "this test once you have added your own.", 0, 1);
   //}
}
