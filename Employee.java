abstract class Employee implements Paycheck{
    private String firstName;
    private String lastName;


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "}\n";
    }
}

class FullTime extends Employee implements Paycheck{
    private static final double bonus = 0.05;
    private double wage;

    public FullTime(String firstName, String lastName, double wage) {
        super(firstName, lastName);
        this.wage=wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateMonthWage() {
        return wage;
    }

    @Override
    public double calculateYearWage() {
        return (calculateMonthWage()*Year) +((calculateMonthWage()*Year)*bonus);
    }

    @Override
    public String toString() {
        return "FullTime{} " + super.toString() + "wypłata miesieczna " + calculateMonthWage()+ "wypłata roczna "+ calculateYearWage();
    }
}

class PartTime extends Employee implements Paycheck{
    private double hoursInMonth;
    private double hourlyRate;

    public PartTime(String firstName, String lastName,  double hoursInMonth, double hourlyRate) {
        super(firstName, lastName);
        this.hoursInMonth = hoursInMonth;
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hoursInMonth;
    }

    public void setHoursInMonth(double hoursInMonth) {
        this.hoursInMonth = hoursInMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthWage() {
        return hoursInMonth*hourlyRate;
    }

    @Override
    public double calculateYearWage() {
        return calculateMonthWage()*Year;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "hoursInMonth=" + hoursInMonth +
                ", hourlyRate=" + hourlyRate +
                "} " + super.toString()+ "wypłata miesieczna " + calculateMonthWage()+ "wypłata roczna "+ calculateYearWage();
    }
}
