public class year {

    public boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int startYear = 2000;
        int endYear = 2025;
        int count = 0;

        year y = new year();
        System.out.println("Leap years between " + startYear + " and " + endYear + ":");

        for (int currentYear = startYear; currentYear <= endYear; currentYear++) {
            if (y.isLeap(currentYear)) {
               count++;
                System.out.print(currentYear + " ");
            }
        }
        System.out.println("\nTotal leap years: " + count);

        int totalYears = endYear - startYear + 1;
        int normalYears = totalYears - count;
        System.out.println("Total normal years: " + normalYears);

        int oddDays = (normalYears * 365 + count * 366) % 7;
        System.out.println("Total odd days: " + oddDays);
         int startingDay = 0;
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Starting day of the week: " + daysOfWeek[startingDay]);
        System.out.println("Day of the week for " + startYear + ": " + daysOfWeek[(startingDay + oddDays) % 7]);
        System.out.println("Day of the week for " + endYear + ": " + daysOfWeek[(startingDay + (oddDays + (endYear - startYear))) % 7]);
        System.out.println("Day of the week for " + (startYear + 1) + ": " + daysOfWeek[(startingDay + (oddDays + 1)) % 7]);

    }
}
