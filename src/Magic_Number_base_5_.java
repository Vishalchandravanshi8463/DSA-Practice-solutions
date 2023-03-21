
public class Magic_Number_base_5_ {
    public static void main(String[] args) {
        int a=1;
        int ans=0, base=5;
        while(a>0)
        {
            
           int last=a&1;
           a=a>>1;
           
           ans+=last*base;
           base=base*5;
        }
        System.out.println(ans);
    }
}
