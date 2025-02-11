import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args){

    int[][] ray = new int[2][3];

    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3; 
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;

    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));
    System.out.print("\n");


    for(int row=0; row<ray.length; row++)
      System.out.println(Arrays.toString(ray[row]));

      //Change every value in 2d array to 7. Must use loops

    for(int row=0; row<ray.length; row++)
      for(int col=0; col<ray[row].length; col++)
        ray[row][col]=7;

    System.out.print("\n");

    for(int row=0; row<ray.length; row++)
      System.out.println(Arrays.toString(ray[row]));

    //fill the array with random numbers from 0-10 inclusive

    System.out.print("\n");

    for(int row=0; row<ray.length; row++)
      for(int col=0; col<ray[row].length; col++)
        ray[row][col]= (int)(Math.random()*11);

    for(int row=0; row<ray.length; row++)
      System.out.println(Arrays.toString(ray[row]));

    System.out.println("\n\n");
  
//SUM==================================================

      int sum = 0;
    for(int row=0; row<ray.length; row++)
    {
      for(int col=0; col<ray[row].length; col++)
        sum+=ray[row][col];

      System.out.println(Arrays.toString(ray[row]));
      System.out.println("The sum of row " + row + " is: " + sum + "\n");
        sum=0;
    }

//Add up the columns of each row using for each loops
   
    for(int[] row: ray)
      for(int col: row)
          sum+=col;

    System.out.println("The sum of all values in ray is: " + sum);
    sum=0;
  }
}
