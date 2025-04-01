class  Arrays
{
	public static void main(String[] args) 
	{
		int a[] =  {1,2,3,4,5,6};
		for(int i= 0 ; i < a.length;i ++ ){
			if (a[i] % 2==0 ) 
			{
				int j = i +1 ;
				while(a[j] % 2 == 0 && a[j] < a.length){
					j++;
			}
			
			if (a[j] == a.length-1)
			{
				break;
			}
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			}
		}
		System.out.println("Resultant Array " + a);
	}
}

		
