public class Board extends Grid{
  private int numMines;

  private final int coverVal = 10;
  private final int mineVal = 9;
  private final int coveredMineVal = mineVal + coverVal;

  public Board(int row, int col, int m){
    super(row, col);
    numMines = m;

    fillGridVals(getRows(), getCols());
    fillMines(numMines);
    checkColumns();
  }

  public void fillGridVals(int r, int c){
    for (int i = 0; i < r; i++){
      for (int j = 0; j < c; j++){
        getLocVal(i, j).addCover();
      }
    }
  }

  public void fillMines(int mines){
    int counter = 0;
    while (counter < mines){
      int posX = (int)(getCols() * Math.random());
      int posY = (int)(getRows() * Math.random());

      if(getLocVal(posX, posY).getVal() != coveredMineVal){
        getLocVal(posX, posY).addMine();
        counter++;
      }

    }
  }

  public void checkColumns(){
    for(int i = 0; i < getRows(); i++){
      for (int j = 0; j < getCols(); j++){
        if(getLocVal(i, j).getVal() == coveredMineVal){
          for (int r = -1; r <= 1; r++){
            for (int c = -1; c <= 1; c++){
              int newX = i + r;
              int newY = j + c;

              if(newX >= 0 && newX < getRows() && newY >= 0 && newY < getCols()){
                if(getLocVal(newX, newY).getVal() != coveredMineVal){
                  inc(newX, newY);
                }
              }
            }
          }
        }
      }
    }
  }


  public int getMines(){
    return numMines;
  }
  
}