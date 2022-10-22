package behavioral.CodeForTemplateMethod;

public class YoungMaleTaxCalculator extends TaxCalculator {

    @Override
    public int applyStandardDeduction(int income) {
        return income - 50000;
    }

    @Override
    public int applyTaxRate(int income) {
        return (int)(income * 0.2);
    }

    @Override
    public int applySurchare(int tax) {
        return (int)(tax * 1.02);
    }
}
