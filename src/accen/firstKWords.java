package accen;

public class firstKWords {
    public static void main(String[] args) {
        String s = "you are doing coding practice for accenture exam";
        int k = 3;
        String[] srr = s.split(" ");
        for(int i = 0; i<k; i++){
            System.out.print(srr[i] +" ");
        }

    }
    public static void printKWords(String s, int k){
        int i = 0;
        int wordCount = 0;
        StringBuilder sb = new StringBuilder(s);
        while(i<sb.length() && wordCount<=k){
            if (s.charAt(i) == ' ') {
                wordCount++; // Increment the word count when a space is encountered
                if (wordCount < k) {
                    System.out.print(s.charAt(i)); // Print the space between words
                }
            } else {
                System.out.print(s.charAt(i)); // Print the current character
            }
            i++;
        }
        System.out.println(wordCount);
    }
}

//
