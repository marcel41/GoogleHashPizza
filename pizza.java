//package com.crunchify;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class pizza
{
  public static void main(String args[])
  {
    File file = new File(args[0]);

    try{
      Scanner sc = new Scanner(file);
    // String input
      int rows = sc.nextInt();
      int columns = sc.nextInt();
      int minimumForIngredient = sc.nextInt();
      int maxCellsPerSlice = sc.nextInt();
      String[] pizzaRows = new String[rows];
      int numberOfTomatoes = 0;
      int numberOfMushorooms = 0;
      int index = 0;
      char [] pizzaCells = null;
      while(sc.hasNext())
      {
        pizzaRows[index] = sc.next();
        pizzaCells = pizzaRows[index].toCharArray();
        for(char cells : pizzaCells)
        {
          if(cells == 'T')
            numberOfTomatoes++;
          else
            numberOfMushorooms++;
          System.out.print(cells);
        }
        System.out.println();
      }
      System.out.println("the number of tomatoes is " + numberOfTomatoes);
      System.out.println("the number of mushorooms is " + numberOfMushorooms);
      sc.close();
    }
    catch(FileNotFoundException e)
    {
      e.printStackTrace();
    }
  }
}
