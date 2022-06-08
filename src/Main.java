public class Main {

    public static void main(String[] args) {

        String[][] arrayNoException = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        String[][] arraySizeException = new String[][]{{"1", "2", "3"}, {"2", "2", "2"}, {"1", "2", "2"}};
        String[][] arrayDataException = new String[][]{{"5", "9", "ERROR", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "8"}};

        //array with no exception
        try {
            System.out.println("Summa of all elements is " + Summa.getSumma(arrayNoException) + ".\n");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }

        //array with wrong size
        try {
            System.out.println("Summa of all elements is " + Summa.getSumma(arraySizeException) + ".\n");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }

        //array with string element
        try {
            System.out.println("Summa of all elements is " + Summa.getSumma(arrayDataException) + ".\n");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
