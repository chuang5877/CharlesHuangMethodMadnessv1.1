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
}
