public class Summa {
    static int getSumma(String[][] array)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != array.length) throw new MyArraySizeException();
        for (int i = 0; i < array.length; i++) {
            if (4 != array[i].length) throw new MyArraySizeException();
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
