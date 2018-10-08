package CharlesHuang;

public class CHuangLib {
    public static void fooBarBaz(int n1){
        String out="";
        //output is blank
        for(int n=1;n<=n1;n++) {
            if (n % 15 == 0) {
                out += "baz,";
                //adds baz if multiple of 3 and 5
            } else if (n % 5 == 0) {
                out += "bar,";
                //adds bar if multiple of just 5
            } else if (n % 3 == 0) {
                out += "foo,";
                //adds foo if multiple of just 3
            } else {
                out += n + ",";
                //adds number if the number isn't multiple of 3 or 5 or both
            }
        }
        System.out.println(out);
    }
    public static void multiplicationTable(int b, int r){
        String out="";
        for(int n=0;n<=r;n++){
            out+=(b*n)+",";
            //b is base and is multiplied by every value of n as n increase until the range r
        }
        System.out.println(out);
    }
    public static int sumUpTo(int x){
        int out=0;
        for(int n=0;n<=x;n++){
            out+=n;
            //n is added for every integer between 0 and x
        }
        return out;
    }
    public static boolean isPalindrome(String str){
        String rts=str.substring(str.length());
        //first value of rts is the last value of str
        for(int n=str.length()-1;n>=0;n--){
            rts+=str.substring(n,n+1);
            //rts is str being built backwards
        }
        if(rts.equals(str)){
            return true;
            //if rts and str are the same, then str is a palindrome
        }else{
            return false;
        }
    }
    public static String dateStr(String str){
        String month=str.substring(0,2);
        //the month is the first two values of the date
        String date=str.substring(3,5);
        //the date is the two values after the slash
        String year=str.substring(6);
        //the year is the rest of the values, skipping the second slash
        String out=month+"-"+date+"-"+year;
        //out is the date with dashes placed where the slashes used to be
        return out+'\n';
    }
    
}
