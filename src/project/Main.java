package project;

import project.controller.SearchChildrenController;
import project.entity.Model;
/**
 * initialized the different objects, and runs the given tasks. 
 * @author Jordan Grotz
 *
 */
public class Main {

//execute this code to run the program
	public static void main(String[] args) {
		Model m = new Model();
		SearchChildrenController c = new SearchChildrenController();
// enter any name of a node to find it.
	c.searchFor(m.getStart(), "Find Me");

	}

}
