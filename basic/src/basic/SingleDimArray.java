package basic;

public class SingleDimArray {

	public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	System.out.println("--For Each--");
	for (int k:arr)
	{
		System.out.println(k);
	}

}
}