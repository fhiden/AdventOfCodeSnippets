class ThirdDay{
  public static void main(String[] args){
    ThirdDay thiss = new ThirdDay();
    int result = thiss.gofind(1, 1, 1,Integer.parseInt(args[0]));
    int value  = 0;
    System.out.println(result);
    //System.out.println(result[0]+" "+result[1]+" "+result[2]+" " );
  }
  public int[] findPoss(int step, int value, int current, int ceiling){
    if(current > ceiling)
      return new int[] {current, value, ((step+1)/4)};
      step++;
      current+=value;
    if( current > ceiling)
          return new int[] {current, value, ((step+1)/4)};

    return findPoss(step++, value+1, current + value, ceiling);
  }
  public int gofind(int step, int value, int current, int ceiling){
    if(current>ceiling)
      return  Math.abs(current - (value/2) - ceiling) +1+ (step/4);
      
    step++;
    current+=value;

    if (current>ceiling)
      return Math.abs(current - value/2 - ceiling) -1 + ((step)/4);

    return gofind(step+1, value, current+value, ceiling);
  }
}
