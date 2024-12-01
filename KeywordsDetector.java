public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
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

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[] newKeyword=keywords;
        String[] newSentences= sentences;
        for (int i=0; i<keywords.length;i++){
            newKeyword[i]=lowerCase(keywords[i]);
        }
        for (int j=0; j<sentences.length;j++){
            newSentences[j]=lowerCase(sentences[j]);
        }
        for (int k=0; k<newSentences.length;k++){
            for (int m=0; m<newKeyword.length; m++){
                if (contains(newSentences[k], newKeyword[m])==true){
                    String printSentence= sentences[k];
                    System.out.println(printSentence);
                }
            }
        }
    }
  

    public static boolean contains(String str1, String str2) {
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean contain = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    contain = false;
                    break;
                }
            }
            if (contain) return true;
        }
        return false;
    }
}
