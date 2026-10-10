package PZ2;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------InsertionSort-----------");

        int[] arr_insertion = {4, 8, 3, 1, 6, 2};
        InsertionSort.insertionSort(arr_insertion);
        
        for (int i = 0; i < arr_insertion.length; i++) {
            System.out.println(arr_insertion[i]);
        }

        System.out.println("------------MergeSort---------------");

        int[] arr_merge = {4, 8, 3, 1, 6, 2};
        MergeSort.mergeSort(arr_merge, 0, arr_merge.length - 1);

        for (int i = 0; i < arr_merge.length; i++) {
            System.out.println(arr_merge[i]);
        }

        System.out.println("-------------Vectors------------------");

        Vector v1 = new Vector(8.0, 7.0,1.0);
        Vector v2 = new Vector(1, 3, 2);

        System.out.printf("%f %f %f\n", v1.getX(), v1.getY(), v1.getZ());
        System.out.printf("%f %f %f\n\n", v2.getX(), v2.getY(), v2.getZ());

        v1 = v1.add(v2);
        System.out.printf("%f %f %f\n", v1.getX(), v1.getY(), v1.getZ());
        System.out.printf("%f %f %f\n\n", v2.getX(), v2.getY(), v2.getZ());

        v1 = v1.subtract(v2);
        System.out.printf("%f %f %f\n", v1.getX(), v1.getY(), v1.getZ());
        System.out.printf("%f %f %f\n\n", v2.getX(), v2.getY(), v2.getZ());

        double result = v1.multiplyVectors(v2);
        System.out.printf("Scalar: %f\n", result);
        System.out.printf("%f %f %f\n", v1.getX(), v1.getY(), v1.getZ());
        System.out.printf("%f %f %f\n\n", v2.getX(), v2.getY(), v2.getZ());

        double scalar = 10;
        v1 = v1.multiplyScalar(scalar);
        System.out.printf("Your mult scalar is %f\n", scalar);
        System.out.printf("%f %f %f\n", v1.getX(), v1.getY(), v1.getZ());
        System.out.printf("%f %f %f\n", v2.getX(), v2.getY(), v2.getZ());

    }
}