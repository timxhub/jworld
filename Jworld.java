public class Jworld
{

  public static void main (String[]args)
  {

    System.out.println ("Jworld starts");

    for (int i = 0; i < args.length; i++)
      {
	System.out.println ("  Param: " + args[i]);
      }

    System.out.println ("Jworld ends");
  }
}
