public class Program9_FindLCMOfTwoNumbers {
    public static void main(String[] args) {
        int n1 = 2, n2 = 8;

        FindLCM c1 = new FindLCM();
        System.out.println(c1.LCM(n1, n2));

        // Using HCF: n1 X n2 = LCM X HCF
        FindHCF c2 = new FindHCF();
        int LCM = (n1*n2)/c2.HCF(8, 4);
        System.out.println(LCM);
        
    }
}

class FindLCM {
    int LCM(int n1, int n2) {
        int min = Math.min(n1, n2);

        
        if((n1/min == 0) && (n2/min == 0))
            return min;
        min++;

        return 0;
    }
}

class FindHCF {
    int HCF(int x, int y){
        if(x == 0)
            return y;
        
        if(x > y)
            x = x -y;
        else
            y = y - x;
        
        return HCF(y, x);
    }
}
