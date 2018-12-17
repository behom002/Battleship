

public class Battleship{

//Creates the array on which will be played
public static int[][] createTableTop(int amountOfRows, int amountOfColumns){
  int[][] arr = new int[amountOfRows][amountOfColumns];

  for(int row = 0; row < amountOfRows; row++){
    for(int column = 0; column < amountOfColumns; column++){
      arr[row][column] = 0;
    }
  }
  return arr;
}

//Sets a ship into the array
//rotation: true means horizontal ; false means vertical
public static boolean setShip(int lengthOfShip, boolean rotation){
  int[] typesOfShips = {2,3,4,5};

  //Check if ship is allowed
  boolean foundBoat = false;
  for(int shipEntry : typesOfShips){

    if(shipEntry == lengthOfShip){
      foundBoat = true;
    }
  }

  //
  if(foundBoat){

  }

}


public static void main(String... args){
int[][] playingField = new int[][];

playingField = createTableTop(10,10);

System.out.println(setShip(4,true));
//This is a to check a GitHub Theory

}

}
