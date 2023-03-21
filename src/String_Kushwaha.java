
public class String_Kushwaha {
    public static void main(String[] args) {
       /* String list="";
        for(int i=0;i<26;i++)
        {
            char ch=((char)('a'+i));
            System.out.print(ch+" ");
            list+=ch;
        }*/
     //   System.out.println(list);
     
     //STRING BILDER 
     StringBuilder builder=new StringBuilder();
      String list="";
        for(int i=0;i<26;i++)
        {
            char ch=((char)('a'+i));
            System.out.print(ch+" ");
            builder.append(ch);
        }
        System.out.println(builder.toString());
                System.out.println(builder.toString());

    }
}
