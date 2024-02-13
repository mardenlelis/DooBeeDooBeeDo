class DooBee{

	private void printDooBee(){

		int x = 1;

		while (x < 3){
			System.out.print("Doo");
			System.out.print("Bee");
			x = x + 1;
		}		

		System.out.print("Do");
		
	}

	public static void main(String[] args){
		DooBee dooBee = new DooBee();
		dooBee.printDooBee();
	}

}