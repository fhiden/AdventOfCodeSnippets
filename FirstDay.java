class FirstDay{
	public static void main(String[] args){
		int sum = 0;
		int sumb = 0;
		char[] didgets = args[0].toCharArray();
		for (int i = 0; i<didgets.length; i++) {
			if(didgets[i]==didgets[(i+1)%didgets.length])
				sum += Character.getNumericValue(didgets[i]);
			if(didgets[i]==didgets[(i+didgets.length/2)%didgets.length])
				sumb += Character.getNumericValue(didgets[i]);

		}
		System.out.print("\n\t"+sum+"\n\n\t"+sumb+"\n");
	}
}
