class Solution {
    public List<String> fizzBuzz(int n) {
        String a[]=new String[n];
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                a[i-1]="FizzBuzz";
            }
            else if(i%3==0){
                a[i-1]="Fizz";
            }
            else if(i%5==0){
                a[i-1]="Buzz";
            }
            else{
                a[i-1]=Integer.toString(i);
            }
        }
        return Arrays.asList(a);
    }
}