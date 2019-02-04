package project.entity;

import java.util.ArrayList;
/**
 * Node class has a name and an ArrayList of child nodes.
 * @author Jordan Grotz
 *
 */
public class Node {
	//defined as package private for encapsulation
	String Name;
	ArrayList<Node> Children;
	
	public Node(String Name) {
		this.Name = Name;
		this.Children = new ArrayList<Node>();
		//Children will be added through a setter to make instantiation 
		//of the list easier.
	}
	
	/**
	 * 
	 * @return A String that is the name of the node.
	 */
	public String getName() {
		return this.Name;
	}
	
	/**
	 * Returns a boolean to confirm that the name has been set
	 */
	public boolean setName(String newname) {
		this.Name = newname;
		return true;
	}
	
	/**
	 * 
	 * @return the children of the given node.
	 */
	public ArrayList<Node> getChildren(){
		return this.Children;
	}
	
	/**
	 * 
	 * @param name of the node you want to add to the tree.
	 * @return boolean to confirm the addition.
	 */
	public boolean addChild(String name) {
		Node e = new Node(name); 
		return this.Children.add(e); 
	}
	
	/**
	 * 
	 * @param aNode to add to the children of the parent node.
	 * this function allows the child node to have been created before 
	 * its addition
	 * @return a boolean to signify that the child was properly added.
	 */
	public boolean addChild(Node aNode) {
		return this.Children.add(aNode);
	}
	
	/**
	 * 
	 * @param name of the node you are trying to confirm exists.
	 * @return true if the node has the same name, and false if the name is different
	 */
	public boolean isNode(String name) {
		return (this.Name == name);
	}
}
