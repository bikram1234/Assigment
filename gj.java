import java.util.Scanner;
class gj
{
	public static void main(String[] args)
	{
		try
		{
			int l[]={10,40,70,5,30,7};
			Scanner ff= new Scanner(System.in);
			System.out.println("choose any index");

			int x= ff.nextInt();
			System.out.println(x);
			
        }
        catch(ArrayIndexOutOfBoundsException)
        {
        	System.out.println(" error in index"+ e);
        }

	}
}