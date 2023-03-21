
package Tree_With_LB_Binary;

public class MinHeap {
    
    int arr[];//=new int[10];
    int size;
    int capacity;
    MinHeap(int c)
    {
        arr=new int[c];
        size=0;
        capacity=c;
    }
   public int left(int i)
    {
        return 2*i+1;
    }
    int right(int i)
    {
        return 2*i+2;
    }
    int parent(int i)
    {
       return (i-1)/2; 
    }
    void insert(int x)
    {
        if(size==capacity)
            return ;
        size++;
        arr[size-1]=x;
        for(int i=size-1;i!=0&&arr[parent(i)]>arr[i];)
        {
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;
            i=parent(i);
        }
        
    }
    
    public static void main(String[] args) {
        MinHeap hp=new MinHeap(43);
        hp.insert(42);
        
    }
}
