public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String finalStr = "";
        char c = '1';
        for(int i = 0 ; i < str.length() ; i++){
            if((str.charAt(i)>=65)&&(str.charAt(i)<=90)){
                c = (char) (str.charAt(i) + 32);
                finalStr += c;
            }
            else{
                finalStr += str.charAt(i);
            }

        }
        return finalStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean check = false;
        if(str2.length()>str1.length()){
            return false;
        }
        if((str2.length()==0)){
            return true;
        }
        if(str1.length()==0){
            return false;
        }
        
        for(int i = 0 ; i <= str1.length() - str2.length() ; i++){
            if (str1.charAt(i) == str2.charAt(0)) {
                 int count = i+1;
                for(int j = 1; j < str2.length() ; j++){
                    if(str1.charAt(count)==str2.charAt(j)){
                        check = true; 
                        count++;   
                    }
                    else{
                        check = false;
                        count++;
                        break;
                    }

                    
                }
                
                
            }
            if(check==true){
                return true;
            }
        }
        return false;

    }
}
