public class TriangleOfAlphabet {
    public static void main(String[] args) {
       
        // outer loop to handle row
        for(int i = 0; i <= 25; i++){
            int Alphabet = 65;

            // inner loop for column

            for(int j = 25; j>=0; j--){
                if (j<=i){

                    // print alphabet
                    System.out.print((char)Alphabet++ +" ");
                } else{

                    // print space
                    System.out.print(" ");
                }
            }

            // print new line after each row
            System.out.println();
        }
    }
}
