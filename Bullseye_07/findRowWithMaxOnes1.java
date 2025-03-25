package Bullseye_07;

public class findRowWithMaxOnes1 {
    
    public static int findRowWithMaxOnes(int[][] parkingLot) {
        int maxOnes = 0;
        int rowIndex = -1;

        for (int i = 0; i < parkingLot.length; i++) {
            int countOnes = 0;
            for (int j = 0; j < parkingLot[i].length; j++) {
                if (parkingLot[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > maxOnes) {
                maxOnes = countOnes;
                rowIndex = i + 1; 
            }
        }

        return rowIndex;
    }

    public static void main(String[] args) {
       
        int[][] parkingLot = {
            {0, 1, 0},
            {1, 1, 0},
            {1, 1, 1}
        };

        int result = findRowWithMaxOnes(parkingLot);
        System.out.println(result); 
    }
}
