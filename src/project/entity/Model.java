package project.entity;

/**
 * Model class holds the data for the given tree. Can be updated to store multiple trees.
 * @author Jordan Grotz
 *
 */
public class Model {

	
	public Node start = new Node("Start");
	Node a1 = new  Node("A1");
	Node a2 = new  Node("A2");
	Node b1 = new  Node("B1");
	Node b2 = new  Node("B2");
	Node d1 = new  Node("D1");
	//Node e1= new  Node("E1");
	//Node findMe = new  Node("findMe");
	//Node c1 = new  Node("C1");
	
	
	public Model() {
		start.addChild(a1);
		start.addChild(a2);
		a1.addChild(d1);
		d1.addChild("E1");
		a2.addChild(b1);
		a2.addChild(b2);
		b1.addChild("Find Me");
		b2.addChild("C1");
	}
	
	/**
	 * 
	 * @return the starting node of the model.
	 */
	public Node getStart() {
		return this.start;
	}
	
}
