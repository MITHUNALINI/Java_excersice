public class Excersice_9 {
    public static void main(String[] args){
        String [] arry = {"Tamil", "English" ,"Science","Maths","History"};

        System.out.println("Array in reverse order: ");

        for (int i = arry.length-1; i >= 0; i--) {
            System.out.print(arry[i] + " ");
        }

    }
}
