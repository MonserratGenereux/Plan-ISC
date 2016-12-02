package planISC;

/**
 * 
 * @author Ilse Monserrat Sánchez Genereux and Mark Octavio Rivera Acosta
 * @version 1.0
 * @since 2016-12-01
 * @description
 * The Edge Program implements edges between 
 * vertexes using target and weight.
 */
public class Edge{
	
    public final Vertex target;
    public final double weight;
    
    /**
     * This method is used to create the Edge.
     * @param argTarget First parameter. Vertex target of the Edge
     * @param argWeight Second parameter. Weight of the Edge
     */
    public Edge(Vertex argTarget, double argWeight){ 
    	target = argTarget; 
    	weight = argWeight; 
    }
}
