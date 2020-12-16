package packete;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double anualIcome, int numberOfEmployees) {
        super(name, anualIcome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14;
        }
        else {
            return getAnualIncome() * 0.16;
        }

    }
    
}
