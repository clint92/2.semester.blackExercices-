package kap12;
/**
 * Created by clint on 19-09-2016.
 */
/////////////////////////Kap12 opgave 4. Loan class/////////////////////

public class kap12opg4 {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

         /** Default constructor */
         public kap12opg4() {
             this(2.5, 1, 1000);
             }
            /** Construct a loan with specified annual interest rate,number of years, and loan amount
             14 */

            public kap12opg4(double annualInterestRate, int numberOfYears, double loanAmount) {
                checkInput(annualInterestRate, numberOfYears, loanAmount);

            }

            public void checkInput(double a, int n, double l) throws IllegalArgumentException
            {
                if(a > 0 && n > 0 && l > 0)
                {
                    this.annualInterestRate = a;
                    this.numberOfYears = n;
                    this.loanAmount = l;
                    loanDate = new java.util.Date();
                }
                else
                {
                    throw new IllegalArgumentException("annualInterestRate, numberOfYears and loanAmount can not be less or equal to 0");
                }
            }

            /** Return annualInterestRate */
            public double getAnnualInterestRate() {
                return annualInterestRate;
            }


            /** Set a new annualInterestRate */
            public void setAnnualInterestRate(double annualInterestRate) {
                this.annualInterestRate = annualInterestRate;
            }

            /** Return numberOfYears */
            public int getNumberOfYears() {
                return numberOfYears;
            }

            /** Set a new numberOfYears */
            public void setNumberOfYears(int numberOfYears) {
                this.numberOfYears = numberOfYears;
            }

            /** Return loanAmount */
            public double getLoanAmount() {
                return loanAmount;
            }

            /** Set a new loanAmount */
            public void setLoanAmount(double loanAmount) {
                this.loanAmount = loanAmount;
            }


            /** Find monthly payment */
            public double getMonthlyPayment() {
                double monthlyInterestRate = annualInterestRate / 1200;
                double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
                return monthlyPayment;
            }

            /** Find total payment */
            public double getTotalPayment() {
                double totalPayment = getMonthlyPayment() * numberOfYears * 12;
                return totalPayment;
            }


            /** Return loan date */
            public java.util.Date getLoanDate() {
                return loanDate;
            }
}

