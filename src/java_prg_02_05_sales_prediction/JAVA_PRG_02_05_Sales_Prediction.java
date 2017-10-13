/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_05_sales_prediction;

/**
 *
 * @author bluebackdev
 * The East Coast sales division of a company generates 62 percent of total
 * sales. Based on that percentage, write a program that will predict how much
 * the East Coast division will generate if the company has $4.6 million in
 * sales this year. Hint: Use the value 0.62 to represent the 62 percent.
 */
public class JAVA_PRG_02_05_Sales_Prediction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final float FLT_PERCENT_EARNED = 0.62f;
        final int INT_ANNUAL_INCOME = 4600000;
        
        float fltAdjustedIncome;
        
        fltAdjustedIncome = FLT_PERCENT_EARNED * (float)INT_ANNUAL_INCOME;
        
        System.out.println("With $4.6 million in sales and a 62% take,\n" +
                            "the East Coast sales division will earn \n$" +
                            fltAdjustedIncome);
    }
}
