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
        String str1="";
        for (int i=0; i<str.length();i++){
            char c =str.charAt(i);
            if (c>=65 && c<=90){
                c+=32;
            }
            str1+=""+c;
        }
        return str1;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int sameLatters=0;
        if (str2.length()>str1.length()){
            return false;
        }
        for (int i=0; i<str1.length();i++){
            char char1=str1.charAt(i);
            char char2=str2.charAt(0);
            if (char1==char2){
                String contain= str1.substring(i, str2.length()+i);
                for (int j=0; j<str2.length();j++){
                    char2=str2.charAt(j);
                    char containChar=contain.charAt(j);
                    if (char2==containChar){
                        sameLatters++;
                    }else{
                        break;
                    }
                }
            }
            if (sameLatters==str2.length()){
                return true;
            }
        }
        return false;
    }
}
