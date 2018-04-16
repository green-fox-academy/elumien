public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        float codingHours = 6;
        float semesterWeeks = 17;
        float workdays = 5;
        float workingHoursPerWeek = 52;

        System.out.println(codingHours * semesterWeeks * workdays + " hours is spent with coding in a semester by an attendee.");
        System.out.println("The percentage of the coding hours in the semester is: " + ((codingHours * workdays) / workingHoursPerWeek * 100) + "%");


    }
}