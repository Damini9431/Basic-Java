package com.assignment;
class CountryNotValidException extends Exception {
 public CountryNotValidException(String message) {
     super(message);
 }
}

class EmployeeNameInvalidException extends Exception {
 public EmployeeNameInvalidException(String message) {
     super(message);
 }
}

class TaxNotEligibleException extends Exception {
 public TaxNotEligibleException(String message) {
     super(message);
 }
}

 class TaxCalculator {
      public double calculateTax(String empName, boolean isIndian, double empSal) 
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }

        if (empSal > 100000) {
            return empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000) {
            return empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000) {
            return empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
    }
}

public class CalculatorSimulator {
     public static void main(String[] args) {
        TaxCalculator c1 = new TaxCalculator();
        testCalculateTax(c1, "Damini", false, 34000);    
        testCalculateTax(c1, "Riya", true, 1000);    
        testCalculateTax(c1, "Sara", true, 55000);
        testCalculateTax(c1, "Prem", true, 15000);  
        testCalculateTax(c1, "", true, 30000);      
    }

    public static void testCalculateTax(TaxCalculator calculator, String empName, boolean isIndian, double empSal) {
        try {
            double tax = calculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
