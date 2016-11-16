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
        return Double.compare(minDistance, other.minDistance);
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


class Edge
{
    public final Vertex target;
    public final double weight;
    
    public Edge(Vertex argTarget, double argWeight){ 
    	target = argTarget; 
    	weight = argWeight; 
    }
}

public class Dijkstra
{
	public void addVertexStudent(Vertex vertex){
		 new Vertex(vertex.key, vertex.status);
	}
	
	public void addVertexDegree(Vertex vertex){
		 new Vertex(vertex.semester,vertex.key, vertex.name);
	}
	
	public void addVertexSystem(Vertex vertex){
		 new Vertex(vertex.key,vertex.name, vertex.info);
	}
	
	public void addEdge(Vertex vertexInicio, Vertex vertexFinal,double weight){
		Edge edge = new Edge(vertexFinal, weight);
		if (vertexInicio.adjacencies == null) {
			vertexInicio.adjacencies = new LinkedList<Edge>();
			vertexInicio.adjacencies.add(edge);
		}else{
				vertexInicio.adjacencies.add(edge);
				}
			
			
	}	
	
    public void computePaths(Vertex source)
    {
    	
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(source);
        Edge e = null;

    while (!vertexQueue.isEmpty()) {
        Vertex u = vertexQueue.poll();
            // Visit each edge exiting u
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

    public List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }

       
   
}
