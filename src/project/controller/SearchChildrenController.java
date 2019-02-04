package project.controller;
import java.util.ArrayList;

import project.entity.*;

/**
 * SearchChildrenController class is created for the purpose of searching through the
 * node entity. Other functions can be implemented for different search criteria.
 * @author Jordan Grotz
 *
 */
public class SearchChildrenController {
	//controller has a global variable to store the state
	//of whether the node was found.
	boolean found = false;
	
	public SearchChildrenController() {	
		}
	
	/**
	 * 
	 * @param aNode starting node of the tree you wish to search through
	 * @param name the name of the node you are trying to find
	 * @return returns a boolean if the function finds the given node
	 * and returns false if the node wasn't found. 
	 */
	public boolean searchFor(Node aNode, String name) {
		
		while(!found) {
			//checks to see if the name of the node equals the given name
			if(aNode.isNode(name)) {
				System.out.println("We have found the node: " + name);
				found = true;
				break;
			} else {
				// if the state isn't changed, this part of the code recursively 
				// searches through the other nodes to find if the node exists
				// in the rest of the tree.
				if(!found) {
					System.out.println(aNode.getName());
					ArrayList<Node> children = aNode.getChildren();
					for(Node nextNode : children) {
						searchFor(nextNode, name);
					}
			
				}
			}
			//returns variable of found
			return found;
		}
		//returns true if the loop is exited.
		return true;
	}	
}	 
	