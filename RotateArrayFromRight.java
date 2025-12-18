public class RotateArrayFromRight{
	
	public static void main(String x[])
	{
		int arr[] = {1,2,3,4,5,10,8,90};
		int k = 3;

		for(int i = 0 ; i<k ; i++)
		{
			int temp = arr[arr.length-1]; //5
			for(int j = arr.length-2; j>=0; j--)
			{
				arr[j+1] = arr[j];
			}
			arr[0]=temp;
		}
		
		for(int i =0 ; i<arr.length; i++)
			System.out.print(arr[i]+"\t");
	}
}