
public class arraytest {
	public static void main(String[] args)
	{
		int[] myList = {1,2,3,4,5};
		//System.out.println(myList.length);
		for (int i = 0; i < myList.length ; ++i)
		{
			System.out.println(myList[i]);
		}
		for (int i : myList)
		{
			System.out.println(i);
		}
		System.out.println();
	}
}
