public class PentagonalNumber {
    
	
	public static void main(String[] args){
       //Output
		System.out.println("The first 100 pentagonal number are:");
    
        
        for (int i = 1; i < 101; i++){
            System.out.printf("%7d ", getPentagonalNumber(i));
        if (i % 10 == 0)
                System.out.println();
        }
    }

    public static int getPentagonalNumber(int n){
      //Convert  
    	  return (n * (3 * n - 1)) / 2;
    }
}