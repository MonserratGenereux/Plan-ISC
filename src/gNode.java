//----------------------------------------------------------------------------
// BSTNode.java               by Dale/Joyce/Weems                    Chapter 8
//
// Implements Comparable nodes for a binary search tree.
//----------------------------------------------------------------------------


public class gNode<T extends Comparable<T>>
{
  // Used to hold references to graph nodes for the linked implementation
  protected T name;                // The info in a Graph node
  protected T info;
  protected T status;
  protected int semester;
  

  public gNode(T info, T name, T status)
  {
    this.info = info;
    this.name = name;
    this.status = status;
  }

  public gNode(T info, T name)
  {
    this.info = info;
    this.name = name;
  }
  
  public gNode(T info, T name, int semester)
  {
    this.info = info;
    this.name = name;
    this.semester = semester;
    
  }
  
  public void setInfo(T info)
  // Sets info of this gNode.
  {
    this.info = info;
  }

  public T getInfo()
  // Returns info of this gNodeStudent.
  {
    return info;
  }

  public void setName(T name)
  // Sets name of this gNodeStudent.
  {
    this.name = name;
  }

  public T getName()
  // Returns name of this gNodeStudent.
  {
    return name;
  }
  public void setStatus(T status)
  // Sets status of this gNodeStudent.
  {
    this.status = status;
  }

  public T getStatus()
  // Returns status of this gNodeStudent.
  {
    return status;
  }

}
 
 