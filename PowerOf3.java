package recursionPuzzles;

public class PowerOf3 {
                private static int wer (int n, int a) {
                                // Replace the following function with the recursive function to be tested
                                if (n == 1) return 1;
                                return (a*wer(a,n-1));
                }

                public static void main(String [] args) {
                                // Local variables used for testing
                                int actualResult;
                                int expectedResult;
                                
                                // Test Number 1
                                actualResult = wer(2,4);                // Test the Base Case
                                expectedResult = 4;                                                                         // Replace this line with what the actual expected result should be
                                if (actualResult == expectedResult)
                                                System.out.println("Test 1: Pass; Result: " + actualResult);
                                else
                                                System.out.println("Test 1: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

                                // Test Number 2
                                actualResult = wer(2,6);                // Test one away from the Base Case
                                expectedResult = 6;                                                      // Replace this line with what the actual expected result should be
                                if (actualResult == expectedResult)
                                                System.out.println("Test 2: Pass; Result: " + actualResult);
                                else
                                                System.out.println("Test 2: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

                                // Test Number 3
                                actualResult = wer(4,5);                // Test a number of iterations away from the Base Case
                                expectedResult = 360;                                      // Replace this line with what the actual expected result should be
                                if (actualResult == expectedResult)
                                                System.out.println("Test 3: Pass; Result: " + actualResult);
                                else
                                                System.out.println("Test 3: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
                }


}
