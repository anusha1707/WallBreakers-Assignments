class Solution {
    public int findMinArrowShots(int[][] points) {
          if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        int count =1;
        int temp = points[0][1];
        for(int[] bp : points)
        {
            if(temp>=bp[0])
                continue;
            count++;
            temp = bp[1];
        }
        return count;
    }
}