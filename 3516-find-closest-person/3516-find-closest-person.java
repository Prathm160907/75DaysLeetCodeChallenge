class Solution {
    public int findClosest(int x, int y, int z) {
      int xd , yd;
      xd = Math.abs(z-x);
      yd = Math.abs(z-y);
      if(xd==yd){
        return 0;
      }else if(xd<yd){
        return 1;
      }else{
        return 2;
      }
    }
}