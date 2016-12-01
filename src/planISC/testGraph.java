package planISC;

import java.awt.EventQueue;

public class testGraph {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
/*		degree.canI(student, "Estructura de Datos", root);//Te dice si puede llevar una materia
		degree.nextSem(student);
		
		List<Vertex> path = degree.getShortestPathTo(DTC3002);
		System.out.println("Path: " + path);
		degree.requirements(root, "Programación Avanzada");
		degree.canI(student, "Estructura de Datos", root);//Te dice si puede llevar una materia
		System.out.println(degree.nextSem(student));
		
		List<Vertex> path = degree.getShortestPathTo(DTC3002);
		//System.out.println("Path: " + path);
		degree.requirements(root, "Programación Avanzada");
		
		//List<Vertex> path = degree.getShortestPathTo(degree.returnVertex(root, "Programación Avanzada"));
		//System.out.println("Path: " + path);
		
		/*while(true){
			System.out.println("Ingresa las materias que ya cursaste: ");
			a = in.nextLine();
			if (a.equals("hola"))
				break;
			Vertex sub = degree.returnVertex(root, a);
			
			if (sub != null){
				if(!student.contains(sub)){
					student.add(sub);
				}
			}
		}*/
	}
}