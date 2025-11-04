
public class DoOp {
    public static String operate(String[] args) {
        
        if (args.length !=3 ){
            return "it depend on the input."; 
        }
        
        // your code here
        int left = Integer.valueOf(args[0]);
        int right = Integer.valueOf(args[2]);
        switch (args[1]) {
            case "+":
                return String.valueOf(left + right);
            case "-":
                return String.valueOf(left - right);

            case "*":
                return String.valueOf(left * right);
            case "/":
                if (right == 0) {
                    return "Error";
                }

                return String.valueOf(left / right);

            case "%":
                if (right == 0) {
                    return "Error";
                }
                return String.valueOf(left % right);
            default:
                return "Error";
        }
    }
}