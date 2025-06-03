public class DiceSimulation {
    public static void main(String[] args) {
        int[] frequency = new int[6];
        int totalRolls = 1000;

        for (int i = 0; i < totalRolls; i++) {
            double randomValue = Math.random();

            if (randomValue < 1.0 / 6) {
                frequency[0]++;
            } else if (randomValue < 2.0 / 6) {
                frequency[1]++;
            } else if (randomValue < 3.0 / 6) {
                frequency[2]++;
            } else if (randomValue < 4.0 / 6) {
                frequency[3]++;
            } else if (randomValue < 5.0 / 6) {
                frequency[4]++;
            } else {
                frequency[5]++;
            }
        }


        System.out.println("Face\tFrequency\tPercentage");
        int totalFrequency = 0;
        double totalPercentage = 0.0;
        for (int i = 0; i < frequency.length; i++) {
            int face = i + 1;
            int freq = frequency[i];
            double percentage = (freq / (double) totalRolls) * 100;
            totalFrequency += freq;
            totalPercentage += percentage;
            System.out.printf("%d\t%d\t\t%.1f%%\n", face, freq, percentage);
        }

        System.out.printf("Total\t%d\t\t%.1f%%\n", totalFrequency, totalPercentage);
    }
} 