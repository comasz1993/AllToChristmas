package matrix;

public class MatrixMain {
    public static void main(String[] args) {
        Matrix matrix=new Matrix(5);
        matrix.display();
        matrix.setValue(5.3f, 1,1);
        System.out.println(matrix.getValue(1,1));
        matrix.fillMatrixWithRandomNumbers(50, 80);
        matrix.display();

        int matrixDim=5;
        Matrix m1=new Matrix(matrixDim);
        m1.fillMatrixWithRandomNumbers(3,10);
        Matrix m2=new Matrix(matrixDim);
        m2.fillMatrixWithRandomNumbers(5,20);
        Matrix result=m1.add(m2);
        Matrix result2=m1.subtract(m2);

        System.out.println();
        result.display();
        System.out.println();
        result2.display();
    }
}
