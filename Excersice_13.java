public class Excersice_13 {
    public static void main(String[] args) {
        String str1= "Mithunalini";
        String str2= "mithunalini";

        boolean bool= str1.equals(str1);
        if(bool){
            System.out.println("This is Palindrome String..");
        }else{
            System.out.println("This is not a Palindrome String..");
        }
    }
}
