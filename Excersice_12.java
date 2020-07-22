public class Excersice_12 {
    public void convertBinary(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public static void main(String a[]){
        Excersice_12 obj = new Excersice_12();
        System.out.println("Binary representation of 124: ");
        obj.convertBinary(124);
        System.out.println("\nBinary representation of 45: ");
        obj.convertBinary(45);
        System.out.println("\nBinary representation of 999: ");
        obj.convertBinary(999);
    }
}
