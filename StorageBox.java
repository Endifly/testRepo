
import java.util.Arrays;
import java.util.ArrayList;

public class StorageBox 
{
			ArrayList<Object> box = new ArrayList<>();
			private int max=5;
//construction
			public void StorageBox()
			{
			}
//construction2
			public void StorageBox(int max)
			{
				
			}
//IsEmpty
			public void IsEmpty()
			{
				System.out.println(this.box.isEmpty());;
			}
//len
			public void len()
			{
				System.out.println(this.box.size());
			}
//push
			public void push(Object x)
			{
				this.box.add(x);
			}
//tostring
			public void tostring()
			{
				for (int i = 0; i < this.box.size() ; ++i)
				{
					System.out.print(this.box.get(i)+" ");
				}
			}
//IsFull
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
//pop
			public void pop()
			{
				System.out.println(this.box.get(this.box.size()-1));
				this.box.remove(this.box.size()-1);
			}
//top
			public void top()
			{
				System.out.println(this.box.get(this.box.size()-1));
			}
}

