import java.util.*;

public class AsteroidCollision{
    public static void main(String[] args){
        int asteroids[] ={10,2 , -5};
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else{
                while((!st.isEmpty())&& st.peek() >0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }

                if((!st.isEmpty()) && st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek() <0){
                    st.push(asteroids[i]);
                }
            }
        }

        int size = st.size();
        int ans[] = new int[size];
        while(!st.isEmpty()){

            ans[size-1] = st.peek();
            st.pop();
            size--;
        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}