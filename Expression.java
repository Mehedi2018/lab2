
package expression;

/**
 *
 * @author MEHEDI
 */
public class Expression {

    public static void main(String[] args) {
        int a = 2, b = 3, c = 4, countIdentifier = 0, count = 0, lastCount = 0;
        String E = "a+b+c/d";
        
        char[] str = E.toCharArray();
        int length = str.length;    
        
        for (int i = 0; i < length; i++) {
            if (str[i] >= 'a' && str[i] <= 'z' && countIdentifier % 2 == 0) {
                count++;
            }
            if (str[i] == '+' || str[i] == '-' || str[i] == '*' || str[i] == '/' && countIdentifier % 2 != 0) {
                count++;
            }
            countIdentifier++;
        }
        
        if (str[length - 1] == '+' || str[length - 1] == '-' || str[length - 1] == '*' || str[length- 1] == '/') {
            lastCount++;
        }
        
        if (count == length && lastCount == 0) {
            System.out.println("The Expression is Correct");
        } else {
            System.out.println("The Expression is not Correct ");
        }
        
        if (count == length && lastCount == 0) {
            
        }
    }
}
