class base {
	public void show() {
		 System.out.println("\\base::show() called");
		 }
}
	class child  extends base {
		public void show() {
		 System.out.println("\\child::show() called");
	}
	
	
	public static void main(String arg[]) {
		 base  a=new child ();
		 a.show();
		  
	}

}