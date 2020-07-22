public class Excersice_7 {
    public static void main(String[] args){
        String str = "MithunaliniMMMMM";

        int  occurrence = 0;

        for (int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == 'M') {
                occurrence++;
            }
        }
        System.out.println("Char 'M' occurred "+ occurrence+" times in the string");
    }
}

