package behavioral.CodeForTemplateMethod;

public abstract class TaxCalculator {
    
    public final int calculateTax(int income){
        int incAfterSD = applyStandardDeduction(income);
        int tax = applyTaxRate(incAfterSD);
        int taxAfterSurcharge = applySurchare(tax);
        return taxAfterSurcharge;
    }

    public abstract int applyStandardDeduction(int income);
    public abstract int applyTaxRate(int income);
    public abstract int applySurchare(int tax);
}
