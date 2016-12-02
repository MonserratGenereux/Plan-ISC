package planISC;

import java.util.LinkedList;

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
    
    public String toString() { 
    	return name; 
    }
    //Compare method used to order the subjects by its semester
    public int compareTo(Vertex other){
        return Double.compare(semester, other.semester);
    }
	
	public Vertex (String key, String status){
		this.key = key;
		this.status = status;
	}
	
	//Degree Node
	public Vertex(int semester2, String name2, String key2){
		// TODO Auto-generated constructor stub
		this.key = key2;
		this.name = name2;
		this.semester = semester2;
	}
}
