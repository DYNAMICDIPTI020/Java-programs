class factor{
	public static void main(String[]args)
	{
		int number = 24;
		int i;
		System.out.println("factors of"+ number +"are:");
		for ( i =1 ; i <= number ;i++ ) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}
}