
public class UsingThisKeyWord {
	
	int c=20, d=36,e=98;

	public static void main(String[] args) {
		
		UsingThisKeyWord obj=new UsingThisKeyWord();
		obj.thisExample(5,6);

	}
	public void thisExample(int a, int b){
		
		this.c=a;
		System.out.println(a+" ------- "+b+" --- "+c);
		
	}

}
