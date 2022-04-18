
public interface Stack {
	public int size();
	
	public boolean isEmpty();
	
	public Object top() throws StackEmpty;
	
	public void push(Object element) throws StackFull;
	
	public Object pop() throws StackEmpty; 
	
}

