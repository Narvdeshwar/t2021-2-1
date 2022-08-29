import java.util.Scanner;

class Series{
    public void print(int x){
        int ans=1;
        for(int i=1;i<=x;i++){
            
            if(i!=x){
                System.out.print(ans+",");
            }
            else{
                System.out.print(ans);
            }
            ans+=2;
        }
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Series sr=new Series();
        sr.print(a);
        sc.close();
    }
}
