package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 * <p>
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b) {
            System.out.println("a or b is true");
        }

        // write your code below

        if (a & b) {
            System.out.println("a and b is true, which is not in this case");
        }

        if (a && b) {
            System.out.println("a and b is true, this is short circuit and");
        }

        if (a | b) {
            System.out.println("a or b is true");
        }

        if (a || b) {
            System.out.println(" a or b is true, this is short circuit or");
        }

        if (a ^ b) {
            System.out.println(" a or b exclusively true not both");
        }

        if (!(a = b)) {

            System.out.println("This demonstrates not condition");
        }
    }

}

