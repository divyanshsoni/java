import java.util.*;
public class javaOutputformatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-14s ",s1);
           // System.out.printf("               ");
            System.out.printf("%03d",x);
            System.out.printf("\n");
            
        }
        System.out.println("================================");

	}

}
