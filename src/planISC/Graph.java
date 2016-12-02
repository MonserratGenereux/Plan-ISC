package planISC;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/** 
 * @author Ilse Monserrat Sánchez Genereux and Mark Octavio Rivera Acosta
 * @version 1.0
 * @since 2016-12-01
 * 
 * The Graph program implements a graph using the Vertex 
 * and Edge programs.
 * It implements some methods that are used to determine
 * paths from and to some Vertexes.
 */

public class Graph{
	
	/**
	 * This method creates an Edge from Vertex vertexInicio to Vertex vertexFinal
	 * Use the Edge class which contains all the targets of a single Vertex
	 * @param vertexInicio
	 * @param vertexFinal
	 * @param weight
	 */
	
	public void addEdge(Vertex vertexInicio, Vertex vertexFinal,double weight){
		Edge edge = new Edge(vertexFinal, weight);
		if (vertexInicio.adjacencies == null) {
			vertexInicio.adjacencies = new LinkedList<Edge>();
			vertexInicio.adjacencies.add(edge);
		}
		else{
			vertexInicio.adjacencies.add(edge);
		}	
	}	
	
	/**
	 * This method creates the path from a Vertex source to
	 * all other vertexes.
	 * This method is the one who defines the Graph.
	 * @param source This is the Vertex source, which is the "father" of all other vertexes. 
	 */
    public void computePaths(Vertex source){
    	
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(source);
        Edge e = null;
    //Assigns the previous Vertex to every vertex
        //Use the minimun distance between vertexes
    while (!vertexQueue.isEmpty()) {
        Vertex u = vertexQueue.poll();
        if (u.adjacencies != null){
        	for (int i = 0; i < u.adjacencies.size(); i++){
            		e = u.adjacencies.get(i);
					Vertex v = e.target;
            		double weight = e.weight;
            		double distanceThroughU = u.minDistance + weight;
            		if (distanceThroughU < v.minDistance) {
            			vertexQueue.remove(v);
            			v.minDistance = distanceThroughU ;
            			v.previous = u;
            			if(v != source.previous){
           					vertexQueue.add(v);
           				}
            		}
            	}
            }
        }
    }
    
    /**
     * This method compares the vName with the name or key of every vertex 
     * in the Graph to return the full vertex with all its attributes.
     * @param root This parameter its necessary because it is the root of the Graph, here is where the travel begins. 
     * @param vName Is the name or key of the vertex that needs to be found.
     * @return vertexN This is the vertex that contains what is needed.
     */
    public Vertex returnVertex(Vertex root, String vName){
		
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        Edge e = null;
        vertexQueue.add(root);
        Vertex vertexN = null;
        
    	while (!vertexQueue.isEmpty()){
    		Vertex u = vertexQueue.poll();
    		if (u.name.equals(vName) || u.key.equals(vName)){
    			vertexN = u;
    		}
    		else{
    		if(u.adjacencies!=null){
    			for (int i = 0; i < u.adjacencies.size(); i++){
            		e = u.adjacencies.get(i);
					Vertex v = e.target;
           				vertexQueue.add(v);
           				}
            		}
    			}
    	}
		return vertexN;
    }
    
    /**
     * 
     * @param root
     * @param vName
     * @return
     */
    public List<Vertex> requirements(Vertex root, String vName){
    	PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
    	List<Vertex> requirements = new ArrayList<Vertex>();
        vertexQueue.add(root);
        Vertex subject = returnVertex(root, vName);
    	while (!vertexQueue.isEmpty()){
    		Vertex u = vertexQueue.poll();
    		if (u.adjacencies!=null) {
    			for (int i = 0; i < u.adjacencies.size(); i++) {
    				vertexQueue.add(u.adjacencies.get(i).target);
            		if(u.adjacencies.get(i).target == subject){
            			requirements.addAll(getShortestPathTo(u));
            		}
        		}
			}
    	}
    	for (int i = 0; i < requirements.size(); i++) {
			for (int j = i+1; j < requirements.size(); j++) {
				if (requirements.get(i)==requirements.get(j)) {
					requirements.remove(j);
				}
			}
		}
		return requirements;
    }
    
    public List<Vertex> getShortestPathTo(Vertex target){
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);
        Collections.reverse(path);
        return path;
    }
    
    public String canI(List<Vertex> student, String subject, Vertex root){
    	String bool="";
	    List<Vertex> require = getShortestPathTo(returnVertex(root, subject).previous);
		int cont = 0;
    	for (int i = 0; i < require.size(); i++) {
    		for (int j = 0; j < student.size(); j++) {
				if(require.get(i) == student.get(j))
					cont++;
			}
		}
		if (cont >= require.size()) {
			bool= "You can course it";
	
		}else{
			bool="You can not course it";
		}
		return bool;
	}
    
    public List<Vertex> nextSem(List<Vertex> student){    	
        List<Vertex> adjacencies = new ArrayList<Vertex>();
    	for (int i = 0; i < student.size(); i++) {
    		if(student.get(i).adjacencies!=null){
    			for (int j = 0; j < student.get(i).adjacencies.size(); j++) {
    				if(!student.contains(student.get(i).adjacencies.get(j).target)){
    					adjacencies.add(student.get(i).adjacencies.get(j).target);
    				}
    			}
    		}
		}
    	Collections.sort(adjacencies);
    	for (int i = adjacencies.size()-1; i >= 6; i--) {
			adjacencies.remove(i);
		}
    	return adjacencies;
    }
}
