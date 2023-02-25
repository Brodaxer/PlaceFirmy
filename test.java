public class test {
    public static void main(String[] args) {
        Company test = new Company();
        test.addEmployee(new FullTime("Jan","Kowalski",1233));
        test.addEmployee(new FullTime("Kloc", "Nowak", 5500));
        test.addEmployee(new PartTime("Tuba", "Bak", 59, 40));
        test.addEmployee(new PartTime("Kot", "Pstrag", 59, 40));
        test.addEmployee(new FullTime("Lol", "lol", 14000));
        test.infoFinal();
    }
}
