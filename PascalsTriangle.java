
package pascalstriangle;

class PascalsTriangle {

    static void makeRows(int[][] rows, int length)
    {
        rows[0][1]=1;
        for(int x=1; x<length; x++)
        {
            for(int y=1; y<x+2; y++)
            {
                rows[x][y]= rows[x-1][y-1]+ rows[x-1][y];
            }
        }
    }
    static void printRows(int[][] rows, int length)
    {
        String[] printed = new String[length];
        
        for(int x=0; x<length;x++)
        {
            for(int tab=0; tab<(length-x/2); tab++)
                System.out.print("      ");
            if(x%2==0)
                System.out.print("   ");
            
            for(int y=1; y<x+2;y++)  
            {
                System.out.printf("%6s",rows[x][y]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows=10;
        int[][] nums = new int[rows][rows+2];
        
        makeRows(nums,rows);
        printRows(nums,rows);  
    }
}
