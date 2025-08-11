public class MaxSubArraySum{  // Method to find the maximum sum of all possible subarrays
   
    public static void maxsubarraysum(int numbers[]){
        int currSum=0; // Variable to store current subarray sum
        int maxSum= Integer.MIN_VALUE; // Variable to store maximum subarray sum found so far
        
        // Outer loop: iterate through each element as starting point
        for(int i=0; i<numbers.length; i++){
            int start =i; // Set starting index of subarray
            
            // Middle loop: iterate through each element as ending point from current start
            for(int j=i; j<numbers.length; j++){
                int end= j; // Set ending index of subarray
                currSum=0; // Reset current sum for new subarray
                
                // Inner loop: calculate sum of elements from start to end index
                for(int k=start; k<=end; k++){
                    currSum+= numbers[k]; // Add current element to sum
                } // End of inner loop
                
                System.out.println(currSum); // Print current subarray sum
                
                // Check if current sum is greater than maximum sum found so far
                if(maxSum< currSum){
                    maxSum= currSum; // Update maximum sum
                } // End of if statement
            } // End of middle loop
        } // End of outer loop
        
        System.out.println("max sum= " +maxSum); // Print the maximum subarray sum
    } // End of maxsubarraysum method

    // Main method - entry point of the program
    public static void main(String args[]){
        int numbers[]={2,4,6,8,20}; // Initialize array with sample values
        maxsubarraysum(numbers); // Call the method to find maximum subarray sum
    } // End of main method
} // End of LinearSearch class
