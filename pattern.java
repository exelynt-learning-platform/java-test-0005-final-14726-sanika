public class PatternProgram {
  public static void main(String[] args){
    int num = 1;
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++)
        {
          if(j<i)
          {
        System.out.print(num + " ");
          }
          else
          {
            System.out.print(num);
          }
          num++;
        }
      System.out.println();
    }
  }
}
