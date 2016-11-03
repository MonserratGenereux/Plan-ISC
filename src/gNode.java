//----------------------------------------------------------------------------
// BSTNode.java               by Dale/Joyce/Weems                    Chapter 8
//
// Implements Comparable nodes for a binary search tree.
//----------------------------------------------------------------------------


public class gNode<T extends Comparable<T>>
{
  
// Used to hold references to graph nodes for the linked implementation
	protected String key;
	protected String name;                // The info in a Graph node
	protected String info;
	protected String status;
	protected int semester;
	
	//Student Node
	public gNode(String key, String status){
		this.key = key;
		this.status = status;
	}
	
	//Degree Node
	public gNode(int semester2, String key2, String name2) {
		// TODO Auto-generated constructor stub
		this.key = key2;
		this.name = name2;
		this.semester = semester2;
	}
	
	//System Node
	public gNode(String key, String name, String info){
		this.key = key;
		this.name = name;
		this.info = info;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
}
 
 