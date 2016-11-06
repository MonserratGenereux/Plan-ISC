package Queue;

import Stack.LLNode;
import planISC.gNode;

//---------------------------------------------------------------------------
// LinkedUnbndQueue.java         by Dale/Joyce/Weems                Chapter 5
//
// Implements UnboundedQueueInterface using a linked list
//---------------------------------------------------------------------------

public class LinkedUnbndQueue<T> implements UnboundedQueueInterface<T> {
	protected LLNode<gNode> front; // reference to the front of this queue
	protected LLNode<gNode> rear; // reference to the rear of this queue
	int numElements;

	public LinkedUnbndQueue() {
		front = null;
		rear = null;
		numElements = 0;
	}

	public void enqueue(gNode element)
	// Adds element to the rear of this queue.
	{
		LLNode<gNode> newNode = new LLNode<gNode>(element);
		if (rear == null)
			front = newNode;
		else
			rear.setLink(newNode);
		rear = newNode;
		numElements = numElements + 1;
	}

	public gNode dequeue()
	// Throws QueueUnderflowException if this queue is empty;
	// otherwise, removes front element from this queue and returns it.
	{
		if (isEmpty())
			throw new QueueUnderflowException(
					"Dequeue attempted on empty queue.");
		else {
			gNode element;
			element = front.getInfo();
			front = front.getLink();
			if (front == null)
				rear = null;
			
			numElements = numElements - 1;
			return element;
		}
	}

	public boolean isEmpty()
	// Returns true if this queue is empty; otherwise, returns false.
	{
		if (front == null)
			return true;
		else
			return false;
	}
	
	public int size(){
		return numElements;
	}

}
