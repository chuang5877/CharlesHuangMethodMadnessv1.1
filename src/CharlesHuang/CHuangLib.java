package CharlesHuang;

public class CHuangLib {
    public static void fooBarBaz(int n1){
        String out="";
        for(int n=1;n<=n1;n++) {
            if (n % 15 == 0) {
                out += "baz,";
            } else if (n % 5 == 0) {
                out += "bar,";
            } else if (n % 3 == 0) {
                out += "foo,";
            } else {
                out += n + ",";
            }
        }
        System.out.println(out);
    }
    public static void multiplicationTable(int b, int r){
        String out="";
        for(int n=0;n<=r;n++){
            out+=(b*n)+",";
        }
        System.out.println(out);
    }
    public static int sumUpTo(int x){
        int out=0;
        for(int n=0;n<=x;n++){
            out+=n;
        }
        return out;
    }
    public static boolean isPalindrome(String str){
        String rts=str.substring(str.length());
        for(int n=str.length()-1;n>=0;n--){
            rts+=str.substring(n,n+1);
        }
        if(rts.equals(str)){
            return true;
        }else{
            return false;
        }
    }
    public static String dateStr(String str){
        String month=str.substring(0,2);
        String date=str.substring(3,5);
        String year=str.substring(6);
        String out=month+"-"+date+"-"+year;
        return out+'\n';
    }
    
}
