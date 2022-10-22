package behavioral.CodeForTemplateMethod;

public class Test {
    
    public static void main(String[] args){

        TaxCalculator taxCalculator = new YoungMaleTaxCalculator();
        System.out.println(taxCalculator.calculateTax(1000000));

        taxCalculator = new SeniorCitizenTaxCalculator();
        System.out.println(taxCalculator.calculateTax(1200000)); 

        taxCalculator = new YoungFemaleTaxCalculator();
        System.out.println(taxCalculator.calculateTax(1000000));
    }
}
