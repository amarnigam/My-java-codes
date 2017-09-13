
public class Task9 {

	public static void main(String[] args) {
		int n=7;
		int first=n*(n-1);
		String str="";
		str=str+first;
		for(int i=2;i<=n-1;i++)
		{
			int temp=first*i;
			str=str+"#"+temp;
		}
          System.out.println(str+"#");
	}

}
