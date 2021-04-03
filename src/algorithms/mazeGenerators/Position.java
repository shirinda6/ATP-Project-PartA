package algorithms.mazeGenerators;

public class Position {
    private int Row;
    private int Column;

    public Position(int row, int column) {
        Row = row;
        Column = column;
    }
    public Position() {
        Row = 0;
        Column = 0;
    }

    public int getRowIndex(){
        return Row;
    }

    public int getColumnIndex(){
        return Column;
    }

    public void setAll(int row, int column) {
        Row=row;
        Column = column;
    }

    public void setColumn(int column) {

        Column = column;
    }

    public void setRow(int row) {

        Row = row;
    }

    @Override
    public String toString() {
        return "{" +Row +","+ Column + "}";
    }
}
