public class ReverseString {
    public static void main(String[]args){
        String s= "Pennsylvania";
        int len= s.length();
        String rev= "";
        for (int i= len-1;i>=0;i--){
           rev=rev+ s.charAt(i);

        }
System.out.println(rev);


        //Using StringBuffer Class

        String a= "Selenium";
        StringBuffer sb= new StringBuffer(a);
        System.out.println(sb.reverse());

// Practic
        String st= "Java";
        int ln =st.length();
        String rv= "";
        for (int i=ln-1;i>=0;i--){
            rv=rv+st.charAt(i);
        }

System.out.println(rv);


        String str = "Aaid";
        int lnt = str.length();
        String rvs= "";
        for (int i=lnt-1;i>=0;i--){
            rvs= rvs+str.charAt(i);

        }
        System.out.println(rvs);

        //StringBuffer

        String d= "Alam";
        StringBuffer sf= new StringBuffer(d);
        System.out.println(sf.reverse());


        String b = "Aaid Alam";
        int c= b.length();
        String riv = "";
        for (int i=c-1;i>=0;i--){
            riv= riv+b.charAt(i);
        }

System.out.println(riv);


        String v = "This is Reverse";
        int lt= v.length();
        String rs = "";
        for (int i =lt-1;i>=0;i--){
            rs= rs+v.charAt(i);
        }
      System.out.println(rs);
    }

}
