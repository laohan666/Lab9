import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    private void testZeros() {
		// TODO Auto-generated method stub
		
	}

	public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
        
        /** Test data contains negative values only **/
    }
    
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 0;
        
        SelectionSort temp1 = new SelectionSort();
        temp1.basicSelectionSort(arr);
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 0;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        
        assertArrayEquals(Sortedarr, arr);
        /** Test data contains with both positive, negative and zeros **/
    }
    
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 8;
        arr[3] = -10;
        arr[4] = 0;
        
        SelectionSort temp1 = new SelectionSort();
        temp1.basicSelectionSort(arr);
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 0;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;
        
        assertArrayEquals(Sortedarr, arr);
        /** Test data contains duplicates **/
    }


}
