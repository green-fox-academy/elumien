public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int allSecondsInOneDay = 24*60*60;

        int spentHoursInSeconds = currentHours*60*60;
        int spentMinutesInSeconds = currentMinutes*60;

        int remainingSeconds = allSecondsInOneDay - spentHoursInSeconds - spentMinutesInSeconds - currentSeconds;

        System.out.println(remainingSeconds + " seconds are remaining in the current day.");

    }
}