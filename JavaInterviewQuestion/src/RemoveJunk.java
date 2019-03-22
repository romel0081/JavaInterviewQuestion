public class RemoveJunk {
    public static void main(String[] args){
        String s= "@#$%^&*!!!#$% My Code is Here &*^%$#$$$$";
        String s1= "%$$#@#$ Looks good now &***^%$#";

        //Regular Expression [^a-zA-Z0-9]

       s= s.replaceAll("[^a-zA-Z0-9]" , "");
       s1= s1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        System.out.println(s1);

    }
}
