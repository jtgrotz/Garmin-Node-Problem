package test.controller;
import project.controller.*;
import project.entity.Model;
import junit.framework.TestCase;

public class TestSearchChildrenController extends TestCase {

	
//tests both the constructor and the success or failure of the one method.
	public void testController() {
		SearchChildrenController c = new SearchChildrenController();
		Model m = new Model(); 
		boolean x = c.searchFor(m.getStart(), "Find Me");
		assertEquals(x, true);
		SearchChildrenController cc = new SearchChildrenController();
		boolean z = cc.searchFor(m.getStart(), "ABC");
		assertFalse(z);
	}
	
}
