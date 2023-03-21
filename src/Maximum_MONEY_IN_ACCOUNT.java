import java.util.*;
public class Maximum_MONEY_IN_ACCOUNT {
    public static void main(String[] args) {
        int [][]accounts=new int [][]{
            {
                1,2,3
            },
            {
                4,5,6
            },
            {
                7,8,9
            }};
        maximumWealth(accounts);
    }
    public static void maximumWealth(int [][] accounts)
    {
        int ans=Integer.MIN_VALUE;
        for (int[] account1 : accounts) {
            int sum=0;
            for (int account = 0; account < account1.length; account++) {
                sum += account1[account];
            }
            if(sum>ans){
                ans=sum;
                
            }
        }
        System.out.println("maximum wealth is "+ans);
    }
    
}
