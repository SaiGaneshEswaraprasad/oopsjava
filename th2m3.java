public class th2m3 {

    public static void main(String[] args) {

        // Multidimensional array
        int[][] multiArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Multidimensional Array:");

        // Displaying elements of multidimensional array
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged array
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("\nJagged Array:");

        // Displaying elements of jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Finding the length of an array
        int[] singleArray = {10, 20, 30, 40, 50};

        System.out.println("\nLength of Single Array: " + singleArray.length);
    }
}
