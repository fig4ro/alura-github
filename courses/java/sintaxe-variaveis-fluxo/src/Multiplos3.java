
public class Multiplos3 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++)
		{
			if (i % 3 == 0)
			{
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		for (int i = 3; i < 100; i += 3)
		{
			System.out.print(i + "\t");
		}
		
	}
	
}
