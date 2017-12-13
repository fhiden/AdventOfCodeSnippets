
import java.util.Arrays;
class FifthDay{
  public static void main(String[] args){
    FifthDay m = new FifthDay();
    int[] maze = m.createMaze(args[0]);
    System.out.println(m.traverseMazeA(maze));
    System.out.println(m.traverseMazeB(maze));
  }
  private int traverseMazeA(final int[] array) {
    int tot = 0, current = 0;
    int[] arr = Arrays.copyOf(array, array.length);
    while (true){
      try{
        int cur = current + arr[current];
        arr[current]+=1;
        tot++;
        current = cur;
      } catch(Exception ex){
        return tot;
      }
    }
  }
  private int traverseMazeB(final int[] array) {
    int tot = 0, current = 0;
    int[] arr = Arrays.copyOf(array, array.length);

    while (current<arr.length){
      try{
        int cur = current + arr[current];

        if(arr[current]<3){
          arr[current]+=1;
        }else{
          arr[current] -=1;
        }
        tot++;
        current = cur;
      } catch(IndexOutOfBoundsException ex){
        return tot;
      }
    }
    return tot;
  }
  private int[] createMaze(final String s){
    String[] st = s.split("\n");
    int[] arr = new int[st.length];
    int i = 0;
    for(String v : st){
        arr[i] = Integer.parseInt(v);
        i++;
    }
    return arr;
  }
}
