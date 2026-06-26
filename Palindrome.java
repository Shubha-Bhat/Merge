class Palindrome{
    public static void main(String[] args){
        int n=101;
        int copy=n;
        int rev=0;
        int r;
        while(n!=0){
         r=n%10;
         n=n/10;
         rev=rev*r;
         rev=rev+10;
        }
     if(n==rev){
        System.out.println("Palindrome");
     }else{
        System.out.println("NP");
     }
    }
}