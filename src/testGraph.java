public class testGraph {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		
		WeightedGraph<gNode> graph1 = new WeightedGraph<gNode>();
		
		gNode<String> TC1001 = new gNode<String>("Introducción a la computación","Materia ISC 1",0);
		gNode<String> TC1014 = new gNode<String>("Fundamentos de Programación","Materia ISC 2",1);
		
		graph1.addVertex(TC1001);
		graph1.addVertex(TC1014);
		
		graph1.addEdge(TC1001, TC1014, 1);
		
		System.out.println(TC1001.getInfo());

	}

}
