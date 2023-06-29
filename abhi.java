import java.util.*;
class classtest {
	public int add(int a,int b) {
		return a+b;
	}
	public boolean check(int a,int b) {
		if(a!=0) {
			return true;
		}
		return false;
	}

}
class abhi{
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int l=sc.nextInt();
		sc.close();
		classtest s=new classtest();
		System.out.print("executing");
		System.out.println(s.add(k, l));
        
    }
}