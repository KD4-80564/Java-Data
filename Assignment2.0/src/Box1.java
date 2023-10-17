



public class Box1
{
	class Box<T extends SalesManager> 
	{
		private T obj;
		public T get()
		{
			return this.obj;
		}
		public void setObj(T obj)
		{
			this.obj=obj;
		}
		public float  getTotalsalary()
		{
			return  obj.CalculateSal();
			   
		}
		
	}
}
Class Main
{
	public static void main(String args[])
	{
		
	}
}
