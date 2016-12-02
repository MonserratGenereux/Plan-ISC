package planISC;

import java.util.LinkedList;

/**
 * @author Ilse Monserrat Sánchez Genereux and Mark Octavio Rivera Acosta
 * @version 1.0
 * @since 2016-12-01 
 * @description
 * The Vertex program implements the nodes that are contained in the 
 * graph. The vertex stores all the needed information for the methods 
 * in the Graph Class.
 */

public class Vertex implements Comparable<Vertex>{
	
	//The info in the Vertex
	protected String key;
	protected String name;                
	protected String info;
	protected String status;
	protected int semester;
    public LinkedList<Edge> adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    
    /**
     * @return name. Is the name of the Vertex which is unique.
     */
    public String toString() { 
    	return name; 
    }
    
   /**
    * @param other. This is the Vertex to compare to.
    * This method compares the semester attribute from one Vertex
    * to another.
    */
    public int compareTo(Vertex other){
        return Double.compare(semester, other.semester);
    }
	
    /**
     * Constructor method
     * @param semester This is the first parameter. Sets the semester value to the Vertex
     * @param name This is the second parameter. Sets the name value to the Vertex
     * @param key This is the third parameter. Sets the key value to the Vertex
     */
	public Vertex(int semester, String name, String key){
		// TODO Auto-generated constructor stub
		this.key = key;
		this.name = name;
		this.semester = semester;
	}
}
