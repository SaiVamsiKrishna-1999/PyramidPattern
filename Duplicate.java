import java.util.Scanner;

public class Duplicate {
    public static void main(String... a) {
        System.out.print("Enter the String");
        Scanner Sc = new Scanner(System.in);
        String st=Sc.nextLine();
        StringBuilder sb=new StringBuilder();
        boolean [] bc=new boolean[256];
        for(int i=0;i<st.length();i++)
        {
            int index=st.charAt(i);
            if(bc[index]==false)
            {
                sb.append(st.charAt(i));
                bc[index]=true;
            }

        }
        System.out.print(sb.toString());
    }
}