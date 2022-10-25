import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*
* Program that tests Ellipsoid class.
*
* Project 08A
*
* @author Will May
* @3/19/20
*
*/
public class EllipsoidTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A test of setters and getters. **/
   @Test public void gettersAndSettersTest() {
   
      Ellipsoid e = new Ellipsoid("Ex 1", 3.0, 4.0, 5.0);
      
      Assert.assertEquals("False Label Test", false, e.setLabel(null));
      e.setLabel("Ex 2");
      Assert.assertEquals("Label test", "Ex 2", e.getLabel());
      
      e.resetCount();
      Assert.assertEquals("Reset count Test", 0, e.getCount());
      
      Assert.assertEquals("False SetA Test", false, e.setA(0));
      e.setA(2);
      Assert.assertEquals("SetA Test", 2, e.getA(), 0.000001);
      
      Assert.assertEquals("False SetB Test", false, e.setB(0));
      e.setB(2);
      Assert.assertEquals("SetB Test", 
             2, e.getB(), 
               0.000001);                                                    
      
      Assert.assertEquals("False SetC Test", false, e.setC(0));
      e.setC(2);
      Assert.assertEquals("SetC Test", 
             2, e.getC(), 0.000001);                       
   }
      
  /** A test of Volume. **/
   @Test public void volumeTest() {
   
      Ellipsoid t = new Ellipsoid("Ex 2", 1, 2, 3);
   
      Assert.assertEquals("volume test",
                           25.1327412, t.volume(), .000001);
   }
   
   /** A test of Surface Area. **/ 
   @Test public void surfaceAreaTest() {
   
      Ellipsoid r = new Ellipsoid("Ex 2", 1, 2, 3);
      
      Assert.assertEquals("surface area test",
                           48.93662539, r.surfaceArea(), .000001);
   }
   
   /** A test of toString. **/
   @Test public void toStringTest() {
   
      Ellipsoid f = new Ellipsoid("Ex 1", 1, 2, 3);
      
      Assert.assertEquals("toString test", 
                           true, 
                           f.toString().contains("Ellipsoid \"Ex 1\" with "
                              + "axes a = 1.0, b = 2.0, c = 3.0 units has: " 
                              + "\n\tvolume = 25.1327 cubic units"
                              + "\n\tsurface area = 48.9366 square units")
                              
                          );                    
   }
   
   /** Test for equals method. */
   @Test public void equalsTest() {
   
      Ellipsoid e1 = new Ellipsoid("Ex 1", 8, 10, 8);
      Ellipsoid e2 = new Ellipsoid("Ex 1", 8, 10, 8);
      Assert.assertEquals("equals test",
                        true, e1.equals(e2));
   
      e2 = new Ellipsoid("Ex 2", 8, 10, 8);
      Assert.assertEquals("equals false test",
                        false, e1.equals(e2));
   
   
      e2 = new Ellipsoid("Ex 1", 9, 10, 8);
      Assert.assertEquals("equals false test",
                        false, e1.equals(e2));
   
      e2 = new Ellipsoid("Ex 1", 8, 11, 8);
      Assert.assertEquals("equals false test",
                        false, e1.equals(e2));
                        
      e2 = new Ellipsoid("Ex 1", 8, 10, 9);
      Assert.assertEquals("equals false test",
                        false, e1.equals(e2));
   
      Assert.assertEquals("equals false test",
                        false, e1.equals("obj"));       
   
      Assert.assertEquals("equals false test",
                        0, e1.hashCode());
   }

  



   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
}
