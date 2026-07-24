class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li= new ArrayList<>();
        int c=matrix.length;
        int r=matrix[0].length;
        int top=0;
        int bot=c-1;
        int left=0;
        int right=r-1;
        while(left<=right && top<=bot){
            for(int i=left;i<=right;i++){
                li.add(matrix[left][i]);
            }
            top++;
            for(int j=top;j<=bot;j++){
                li.add(matrix[j][right]);
            }
            right--;
           if(top<=bot){
             for(int i=right;i>=left;i--){
                li.add(matrix[bot][i]);
            }
            bot--;
           }
           if(left<=right){
            for(int j=bot;j>=top;j--){
                li.add(matrix[j][left]);
            }
            left++;
           }

        }
        return li;
    }
}