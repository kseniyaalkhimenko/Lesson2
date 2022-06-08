public class MyArrayDataException extends MyException {

    MyArrayDataException(int i, int j) {
        super(String.format("Wrong data format in [%d][%d]\n", i + 1, j + 1));
    }

}
