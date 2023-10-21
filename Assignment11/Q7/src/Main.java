interface Emp {
    double getSal();
    default double calcIncentives() {
        return 0.0;
    }

    static double calcTotalIncome(Emp[] arr) {
        double totalIncome = 0.0;
        for (Emp emp : arr) {
            totalIncome += emp.getSal() + emp.calcIncentives();
        }
        return totalIncome;
    }
}

class Manager implements Emp {
    private double basicSalary;
    private double dearnessAllowance;

    public Manager(double basicSalary, double dearnessAllowance) {
        this.basicSalary = basicSalary;
        this.dearnessAllowance = dearnessAllowance;
    }

    @Override
    public double getSal() {
        return basicSalary + dearnessAllowance;
    }

    @Override
    public double calcIncentives() {
        return 0.2 * basicSalary;
    }
}

class Labor implements Emp {
    private int hours;
    private double rate;

    public Labor(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double getSal() {
        return hours * rate;
    }

    @Override
    public double calcIncentives() {
        if (hours > 300) {
            return 0.05 * getSal();
        } else {
            return 0.0;
        }
    }
}

class Clerk implements Emp {
    private double salary;

    public Clerk(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSal() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Emp[] employees = new Emp[3];
        employees[0] = new Manager(50000, 10000);
        employees[1] = new Labor(320, 15.0);
        employees[2] = new Clerk(35000);

        double totalIncome = Emp.calcTotalIncome(employees);
        System.out.println("Total Income of all employees: " + totalIncome);
    }
}
