import java.util.*;

public class ContainerWithMostWater{
    public static void main(String[] args){
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.print(maxArea(height));  
    }
    public static int maxArea(int height[]){
        // Two Pointer approach =====================;
        int maxWater = 0;
        int lp = 0;    // Left pointer===
        int rp = height.length-1;  // Right Pointer ===
        while(lp<rp){
            int w = rp-lp; 
            int h = Math.min(height[lp],height[rp]);
            int water = h*w;
            maxWater = Math.max(water,maxWater);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}