import java.math.RoundingMode;
import java.math.BigDecimal;
import java.lang.*;
import java.text.DecimalFormat;

public class HelloWorld{

     public static void main(String []args){
        CustomerDecimalFormat df = new CustomerDecimalFormat();
        BigDecimal bd = new BigDecimal("30000");
        System.out.println(df.format(bd));
     }
     
    public static class CustomerDecimalFormat {
        BigDecimal dividend, divisor, value;
        public String format(BigDecimal o) {
            if(o != null) {
                if(o instanceof BigDecimal){
                    BigDecimal divisor = o;
                    BigDecimal dividend = new BigDecimal("1000000");
                    value = divisor.divide(dividend, 2, RoundingMode.CEILING);
                    return value.toString();
                }
                else {
                    return "" + o;
                }
            } else{
                return "";
            }
        }
    }
}