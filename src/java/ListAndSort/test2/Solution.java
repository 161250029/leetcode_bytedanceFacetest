package ListAndSort.test2;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
          int max = 0 ;
          for(int i = 0 ; i < grid.length ; i ++) {
              for(int j = 0 ; j < grid[0].length ; j ++) {
                    if(grid[i][j] != 0) {
                        max = Math.max(getlandOfMaxSize(i ,j , grid) , max);
                    }
              }
          }
          return max;
    }
    public int getlandOfMaxSize(int i , int j , int[][] grid) {
         if(grid[i][j] == 0)
             return 0;
        if (grid[i].length == 1 && grid.length == 1)
            return 1;
         if (grid.length == 1) {
             grid[i][j] = 0;
             if (j != grid[i].length - 1 && j != 0 )
                return 1 +  getlandOfMaxSize(i  , j + 1 , grid) + getlandOfMaxSize(i  , j - 1 , grid);
             if (j ==0)
                 return 1 +  getlandOfMaxSize(i  , j + 1 , grid);
             if (j == grid[i].length - 1)
                 return 1 +  getlandOfMaxSize(i  , j - 1 , grid);
         }
         else if (grid[i].length == 1) {
             grid[i][j] = 0;
             if (i != grid.length - 1)
                 return 1 +  getlandOfMaxSize(i + 1 , j , grid);
         }
         else {
             grid[i][j] = 0;
             if(i == grid.length - 1 && j == grid[0].length - 1)
                 return  1 + getlandOfMaxSize(i , j - 1 ,grid );
             if(i == grid.length - 1 && j == 0)
                 return  1 + getlandOfMaxSize(i , j + 1 , grid);
             if(j == 0)
                 return  1 + getlandOfMaxSize(i , j + 1 , grid) + getlandOfMaxSize( i + 1 , j , grid);
             if (i == grid.length - 1)
                 return 1 + getlandOfMaxSize(i , j -1 ,grid) + getlandOfMaxSize(i , j + 1 , grid);
             if (j == grid[0].length - 1)
                 return 1 + getlandOfMaxSize( i , j - 1 , grid) + getlandOfMaxSize(i + 1 , j , grid);
             return 1 + getlandOfMaxSize(i , j -1 ,grid) + getlandOfMaxSize(i , j + 1 , grid) + getlandOfMaxSize(i + 1 , j , grid);
         }
         return 0;
    }
}
