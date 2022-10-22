package behavioral.CodeForTemplateMethod;

public class SeniorCitizenTaxCalculator extends TaxCalculator {
    
    @Override
    public int applyStandardDeduction(int income) {
        return income - 100000;
    }

    @Override
    public int applyTaxRate(int income) {
        return (int)(income * 0.1);
    }

    @Override
    public int applySurchare(int tax) {
        return (int)(tax * 1.00);
    }
}
