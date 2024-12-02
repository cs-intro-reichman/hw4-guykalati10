public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean [] arr = new boolean[N+1];
        for(int i = 2 ; i < arr.length ; i++){
            arr[i] = true;
        }

        int check = 2;

        while(check<=Math.sqrt(N)){
            for(int i = check+1 ; i < arr.length ; i++){
                if(arr[i]==true){
                    if(i%check==0){
                        arr[i] = false;
                    }
                }
            }
            check++;
        }

        System.out.println("Prime numbers up to " + N + ":");
        int countPrime = 0;

        for(int i = 2 ; i < arr.length ; i++){
            if(arr[i]==true){
                System.out.println(i);
                countPrime++;
            }
        }

        double doubleCount = (double) countPrime;
        double doubleN = (double) N;

        double precent = (doubleCount/doubleN) * 100;
        int intPrecent = (int) precent;

        System.out.println("There are " + countPrime + " primes between 2 and " + N + " (" + intPrecent + "% are primes)");
    }
}