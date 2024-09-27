public class q8 {
    public static void main(String[] args) {

        String a = "Ram is going to school";
        String vowels = "aeiouAEIOU";
        int vow = 0;
        int words = 1;
        int consonant = 0;
        for(int i = 0; i <  a.length(); i ++){
            if(vowels.indexOf(a.charAt(i)) != -1 ){
                vow++;
            }else if(a.charAt(i) == ' '){
                words ++;
            }else{
                consonant ++;
            }
        }
        System.out.println("Vowels: " + vow);
        System.out.println("WOrds: " + words);
        System.out.println("consonants: " + consonant);
    }
}
