
	import java.util.Arrays;
	import java.util.ArrayList;
	public class StroagBox {
			ArrayList<Object> box = new ArrayList<>();
			private int max=5;
			public StroagBox()
			{
			}
			public void IsEmpty()
			{
				System.out.println(this.box.isEmpty());;
			}
			public void len()
			{
				System.out.println(this.box.size());
			}
			public void push(Object x)
			{
				this.box.add(x);
			}
			public void tostring()
			{
				for (int i = 0; i < this.box.size() ; ++i)
				{
					System.out.print(this.box.get(i)+" ");
				}
			}
			public boolean IsFull()
			{
				if (this.box.size() == max )
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			public void pop()
			{
				System.out.println(this.box.get(this.box.size()-1));
				this.box.remove(this.box.size()-1);
			}
			public void top()
			{
				System.out.println(this.box.get(this.box.size()-1));
			}
		}

	}

}
