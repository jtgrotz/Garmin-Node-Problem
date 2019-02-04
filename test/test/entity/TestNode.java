package test.entity;
import java.util.ArrayList;

import junit.framework.TestCase;
import project.entity.*;

public class TestNode extends TestCase {

	//all tests prove the validity of the various methods in the Node class.
	public void testConstructor() {
		Node x = new Node("AA");
		assertEquals(x.getName(), "AA");
		assertEquals(x.getChildren().size(), 0);
	}
	
	public void testGetName() {
		Node x = new Node("AA");
		assertEquals(x.getName(), "AA");
	}
	public void testSetName() {
		Node x = new Node("AA");
		x.setName("BB");
		assertEquals(x.getName(), "BB");
	}
	public void testGetChildren() {
		Node x = new Node("AA");
		Node y = new Node("ABC");
		x.addChild(y);
		ArrayList<Node> n = new ArrayList<Node>();
		n.add(y);
		assertEquals(x.getChildren(), n);
	}
	public void testAddChild() {
		Node x = new Node("AA");
		ArrayList<Node> n = new ArrayList<Node>();
		n.add(new Node("ABC"));
		assertTrue(x.addChild("ABC"));
	}
	
	public void testIsNode() {
		Node x = new Node("AA");
		assertTrue(x.isNode("AA"));
		assertFalse(x.isNode("ABC"));
	}
}
