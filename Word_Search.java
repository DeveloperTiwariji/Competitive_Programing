import java.util.*;


public class Word_Search{
    public static void main(String[] args){
        char [][] board = {{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'},{'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
         
         int flag = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0) == board[i][j]){
                    boolean ans = wordSearch(board, i, j, word, 0);
                    if(ans){
                        System.out.println(ans);
                        flag =1;
                        break;
                    }
                }
            }
        }
        if(flag == 0){
        System.out.println(false);
        }
    }
    public static boolean wordSearch(char board[][], int r, int c, String word, int idx){
         
         if(idx == word.length()){
            return true;
         }

        if(r<0 || c<0 || r>= board.length || c>= board[0].length || board[r][c]!= word.charAt(idx)){
            return false;
        }

        board[r][c] = '*';
        int cr[] ={0, 0, -1, 1};
        int cc[] ={-1, 1, 0, 0};
        for(int i=0;i<cr.length;i++){
            boolean ans = wordSearch(board, r+cr[i], c+cc[i], word, idx+1);

            if(ans){
                return true;
            }
        }
        board[r][c] = word.charAt(idx);
        return false;
    }
}