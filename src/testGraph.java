public class testGraph {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		String ACREDITADO = "acreditado";
		String CURSANDO = "acreditado";
		String NO_ACREDITADO = "acreditado";
		
		WeightedGraph<gNode> system = new WeightedGraph<gNode>();
		WeightedGraph<gNode> degree = new WeightedGraph<gNode>();
		WeightedGraph<gNode> student = new WeightedGraph<gNode>();
		
		gNode SYTC1001 = new gNode("TC1001","Introducción a la Computación","info");
		system.addVertex(SYTC1001);
		
		gNode DTC1001 = new gNode(0,"Introducción a la Computación","TC1001");
		degree.addVertex(DTC1001);

		
	}

}
