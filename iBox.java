import java.util.ArrayList;
import java.util.Scanner;
public class iBox {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		StroagBox ibox = new StroagBox(kb.nextInt());
		//System.out.println(ibox.len());
		//System.out.println(ibox.tostring());
		ibox.isEmpty();;
		ibox.push(true);
		ibox.isEmpty();
		//System.out.println(ibox.tostring());
		//System.out.println(ibox.len());
		ibox.push(123);
		ibox.len();
		ibox.isEmpty();
		System.out.println(ibox.isFull());
		ibox.push("qwerty");
		ibox.len();
		ibox.isEmpty();
		System.out.println(ibox.isFull());
		ibox.pop();
		ibox.len();
		ibox.top();
		ibox.tostring();
		
	}
}
