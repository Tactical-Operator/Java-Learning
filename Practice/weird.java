//A
//b C
//D e F
//g H i J




public class weird {
    public static void main(String[] args) {
        char ch = 'A'; 
        int rows = 4; 
       for (int i = 1; i <= rows; i++) { 
            for (int j = 1; j <= i; j++) { 
                if ((i + j)%2==0){
                    System.out.print(Character.toUpperCase(ch) + " ");
                } else{
                    System.out.print(Character.toLowerCase(ch) + " "); 
                }
                ch++; 
            }
            System.out.println(); 
        }
    }
}

