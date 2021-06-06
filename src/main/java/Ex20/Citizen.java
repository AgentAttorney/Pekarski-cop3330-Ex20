package Ex20;

import java.text.NumberFormat;
import java.util.Locale;

public class Citizen {
    private double principal,tax_rate,change;
    private String state, county;
    private int case_num;

    public void setState(String state)
    {
        this.state = state;
    }
    public String getState()
    {
        return state;
    }
    public void setPrincipal(double principal)
    {
        this.principal = principal;
    }
    public double getPrincipal()
    {
        // TODO Decimal Rounding
        double principal_final =principal;
        return principal_final;
    }
    public void setCounty(String county)
    {
        this.county = county;
    }
    public String getCounty()
    {
        return county;
    }
    public double getFinal(int case_num)
    {
        Locale locale = new Locale("en", "US");
        NumberFormat cur_format = NumberFormat.getCurrencyInstance(locale);

       if(case_num == 2)
       {
           tax_rate = 0.08;
           change = tax_rate * principal;
           principal = change + principal;
       }
       else if(case_num == 6) {
           tax_rate = 0.05;
           change = tax_rate * principal;
           principal = change + principal;
       }
       else{
           if(case_num == 4)
           {
               tax_rate = 0.055;
               change = tax_rate * principal;
               principal = change + principal;
           }
           else{
               // case 5
               tax_rate = 0.054;
               change = tax_rate * principal;
               principal = change + principal;
           }
       }
        System.out.printf("The tax is " + cur_format.format(change) + "%n"
                + "The total is " + cur_format.format(principal) + ".");
        return principal;
    }
}
