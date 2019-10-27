
public class BigSum {

	// Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long resultado = 0;
        
        for(int i = 0; i<ar.length; i++)
            resultado += ar[i];
   
        return resultado;
    }
    	
}
