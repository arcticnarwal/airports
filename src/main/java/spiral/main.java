package spiral;

public class main {

    public main () {}

    public int[] spiral(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;
        int[] spiral = new int[(endRow + 1) * (endColumn + 1)];
        int index = 0;

        while(index < spiral.length) {
            index = square(spiral, index, matrix, startRow, startColumn, endRow, endColumn);
            ++startRow;
            ++startColumn;
            --endRow;
            --endColumn;
        }

        return spiral;
    }

    private int square(int[] spiral, int index, int[][] matrix, int startRow, int startColumn, int endRow, int endColumn) {
        int rowIndex = startRow;
        int columnIndex = startColumn;

        while(columnIndex <= endColumn) {
            spiral[index] = matrix[rowIndex][columnIndex];
            ++columnIndex;
            ++index;
        }
        --columnIndex;
        ++rowIndex;
        while(rowIndex <= endRow && rowIndex > startRow) {
            spiral[index] = matrix[rowIndex][columnIndex];
            ++rowIndex;
            ++index;
        }
        --rowIndex;
        --columnIndex;
        while(columnIndex >= startColumn && rowIndex > startRow) {
            spiral[index] = matrix[rowIndex][columnIndex];
            --columnIndex;
            ++index;
        }
        ++columnIndex;
        --rowIndex;
        while(rowIndex > startRow && columnIndex < endColumn) {
            spiral[index] = matrix[rowIndex][columnIndex];
            --rowIndex;
            ++index;
        }

        return index;
    }
}
