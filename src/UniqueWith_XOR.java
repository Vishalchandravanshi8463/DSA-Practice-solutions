
public class UniqueWith_XOR {
    public static void main(String[] args) {
        int[]arr={1,2,4,3,2,1};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr)
    {
        int un=0;
        for(int ar:arr)
        {
            un^=ar;
        }
        return un;
    }
}
