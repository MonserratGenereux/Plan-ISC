package planISC;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class Vertex implements Comparable<Vertex>
{
	protected String key;
	protected String name;                // The info in a Graph node
	protected String info;
	protected String status;
	protected int semester;
    public LinkedList<Edge> adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    
    public String toString() { 
    	return name; 
    }
    
    public int compareTo(Vertex other)
    {
        return Double.compare(semester, other.semester);
    }
	
	public Vertex (String key, String status){
		this.key = key;
		this.status = status;
	}
	
	//Degree Node
	public Vertex(int semester2, String name2, String key2) {
		// TODO Auto-generated constructor stub
		this.key = key2;
		this.name = name2;
		this.semester = semester2;
	}
	
	//System Node
	public Vertex(String key, String name, String info){
		this.key = key;
		this.name = name;
		this.info = info;
	}
}


class Edge{
	
    public final Vertex target;
    public final double weight;
    
    public Edge(Vertex argTarget, double argWeight){ 
    	target = argTarget; 
    	weight = argWeight; 
    }
}

public class Dijkstra{
	
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
	
    public void computePaths(Vertex source){
    	
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(source);
        Edge e = null;

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
    
    public void requirements(Vertex root, String vName){
    	PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
    	List<Vertex> requirements = new ArrayList<Vertex>();
        Edge e = null;
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
    		
    		for (int i = 0; i < requirements.size(); i++) {
				for (int j = i+1; j < requirements.size(); j++) {
					if (requirements.get(i)==requirements.get(j)) {
						requirements.remove(j);
					}
				}
			}
    	}
    }
    
    public List<Vertex> getShortestPathTo(Vertex target){
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }
    
    public boolean canI(List<Vertex> student, String subject, Vertex root){
		
    	List<Vertex> require = getShortestPathTo(returnVertex(root, subject).previous);
    	boolean can = true;
    	int cont = 0;
    	
    	for (int i = 0; i < require.size(); i++) {
    		for (int j = 0; j < student.size(); j++) {
				if(require.get(i) == student.get(j))
					cont++;
			}
		}
    	if (cont >= require.size()) {
			can = true;
		}else{
			can = false;
		}
    	System.out.println(can);
    	return can;
    }
    
    public void nextSem(List<Vertex> student){
    	
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
    	
    	for (int i = adjacencies.size()-1; i > 5; i--) {
			adjacencies.remove(i);
		}
    }
}
