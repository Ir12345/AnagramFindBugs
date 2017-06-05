package core;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramFindBugsTests {

	
	 
	
  @Test
  public void testAnagramFindBugs1() {
	  
	  String s = new String("Debit Card");
	  String t = new String("Bad Credit");
	  
	  System.out.println("Debit Card and Bad Credit is anagram? - " + AnagramFindBugs.validate(s, t));
	  Assert.assertTrue(AnagramFindBugs.validate(s, t));
	  
	   
  }

@Test
  public void testAnagramFindBugs2() {
	  
	  String s = new String("Охренеть");
	  String t = new String("Не хрена себе");
	  
	  System.out.println("Охренеть and Не хрена себе is anagram? - " + AnagramFindBugs.validate(s, t));
	  Assert.assertFalse(AnagramFindBugs.validate(s, t));
  }
  
}
