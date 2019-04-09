package array;

public class array {
	public static void main(String[] args) {
		String[] array= {"Rabby","25","101","trainee","019337373"};
		//System.out.println(array[5]);
//	    for(int i=0;i<array.length;i++)
//		{
//	    	for(int j=0;j<array[i].length;j++)
//	    	{
//		//System.out.println(array[i]);
//	    	System.out.print(array[i][j]+" ");
//	    	}
//		}
		for(String i : array)
		{
			System.out.println(i);
		}
	}

}
