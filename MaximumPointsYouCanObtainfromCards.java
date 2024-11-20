import java.util.*;

public class MaximumPointsYouCanObtainfromCards{
    public static void main(String[] args){
        int k =7;
        int cardPoints[] = {9,7,7,9,7,7,9};

        int totalSum = 0;
        int n =cardPoints.length;
        for(int i=0;i<n;i++){
            totalSum+= cardPoints[i];
        }

        if(n==k){
            System.out.println(totalSum);
        }

        int size = n-k;
        int sum =0;
        for(int i=0;i<size;i++){
            sum+= cardPoints[i];
        }

        int ans =sum;
        for(int i=size;i<n;i++){
            sum+= cardPoints[i];
            sum-= cardPoints[i-size];
            ans = Math.min(ans, sum);
        }

        System.out.println(totalSum-ans);
    }
}