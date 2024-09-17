//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            System.out.println(new Solution().minJumps(arr));
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
      static int minJumps(int[] arr){
        int n = arr.length;
        if (n == 0 || arr[0] == 0) return -1; // If array is empty or start is 0

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            // Update the farthest point that can be reached
            farthest = Math.max(farthest, i + arr[i]);

            // If we have reached the end of the range for current jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // If we can reach the end of the array
                if (currentEnd >= n - 1) return jumps;
            }
        }

        // If we exit the loop and haven't reached the end
        return -1;
    }
}