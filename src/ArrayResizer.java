public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r){
        for (int x = 0; x < array2D[r].length; x++){
            if (array2D[r][x] == 0){
                return false;
            }
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D){
        int counter = 0;
        for (int x = 0; x < array2D.length; x++){
            if (isNonZeroRow(array2D, x) == true){
                counter += 1;
            }
        }
        return counter;
    }

    public static int[][] resize(int[][] array2D){
        int[][] newArr = new int[numNonZeroRows(array2D)][array2D[0].length];
        int counter = 0;
        for (int x = 0; x < array2D.length; x++){
            for (int y = 0; y < array2D[x].length; y++){
                if (isNonZeroRow(array2D, x) == true){
                    for (int z = 0; z < newArr[0].length; z++){
                        newArr[counter][y] = array2D[x][y];
                    }
                    counter++;
                }
            }
        }
        return newArr;
    }
}
