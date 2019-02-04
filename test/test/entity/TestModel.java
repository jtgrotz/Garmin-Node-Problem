package test.entity;
import junit.framework.TestCase;
import project.entity.*;

public class TestModel extends TestCase{

	//tests that the Model constructor creates a tree.
	public void testModel() {
		Model m = new Model();
		assertEquals(m.getStart().getName(), "Start");
	}
}
