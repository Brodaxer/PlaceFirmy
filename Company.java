class Company {
    private final int COMPANY_LIMIT = 5;
    private int count;
    private Employee[] employees = new Employee[COMPANY_LIMIT];

    public void addEmployee(Employee employee) {
        employees[count] = employee;
        count++;
    }

    public void printEmployee() {
        for (Employee employe : employees
        ) {
            System.out.println(employe);
        }
    }

    public double totalMonthCost() {
        double a = 0;
        for (int i = 0; i < COMPANY_LIMIT; i++) {
            a = a + employees[i].calculateMonthWage();
        }
        return a;
    }
    public double totalYearCost(){
        return totalMonthCost()*12;
    }
    public String printCompanyInfo(){
        String build = "Suma miesiecznych wynagrodzen " +
                totalMonthCost() +
                "\nSuma rocznych wynagrodzen " +
                totalYearCost();
        return build;
    }
    public void infoFinal(){
        printEmployee();
        System.out.println(printCompanyInfo());
    }
}