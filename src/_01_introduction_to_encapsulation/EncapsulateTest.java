package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EncapsulateTest {
	EncapsulateTheData ed = new EncapsulateTheData();

	@Test
	public void testItemsReceived() {
		ed.setItemsReceived(-5);
		assertEquals(ed.getItemsReceived(), 0);

		ed.setItemsReceived(3);
		assertEquals(ed.getItemsReceived(), 3);
	}
	@Test
	public void testDegreesTurned() {
		ed.setDegreesTurned(450);
		assertEquals(ed.getDegreesTurned(), 360);
		
		ed.setDegreesTurned(-5);
		assertEquals(ed.getDegreesTurned(), 0);
	}
	
	@Test
	public void testNomenclature() {
		ed.setNomenclature("");
		assertEquals(ed.getNomenclature(), " ");

		ed.setNomenclature("hello");
		assertEquals(ed.getNomenclature(), "hello");
	}
	
	@Test
	public void testMemberObj() {
		ed.setMemberObj(new String());
		assertEquals(ed.getMemberObj().getClass(), Object.class);
	}
}
