class Day{

public static void main(String args[])

{
	int n=0;
	int i;
	for(i=0;i<args.length;i++)
	{
	n=Integer.parseInt(args[i]);
	}

	switch(n)
	{
	case 1:
	System.out.println("Sunday");
	break;

	case 2:
	System.out.println("Monday");
	break;

	case 3:
	System.out.println("Tuesday");
	break;

	case 4:
	System.out.println("Wedensday");
	break;

	case 5:
	System.out.println("Thursday");
	break;

	case 6:
	System.out.println("Friday");
	break;

	case 7:
	System.out.println("Saturday");
	break;
	
	default:
		System.out.println("invalid");
	}
	

}

}
