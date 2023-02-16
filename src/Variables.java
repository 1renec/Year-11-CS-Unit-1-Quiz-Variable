public class Variables {

    public static void main(String[] args) {

        // 1.
        int age = 33;

        // 2.
        System.out.println(age);

        // 3.
        double balance = 18.89;

        // 4.
        int dollars = (int)balance;
        System.out.print(dollars);

        // 5.
        int dollarsRounded;
        System.out.println(Math.round(balance));

        // 6.
        char letter = 'A';

        // 7.
        System.out.println(letter);

        // 8.
        System.out.println(((int) letter));

        // 9.
        letter++;

        // 10.
        System.out.println(letter);

        // 11.
        System.out.println(((int) letter));

        // 12.
        /**
         * [In Q6&7 we declared and initialized a variable of type
         * integer with the name letter to the value of A, then
         * we printed the letter out. In Q8, we cast the variable
         * letter to an integer then printed it out. In Q9 & 10, we
         * incremented the variable letter using the postfix operator (++)
         * and printed it out. in Q11 we cast the variable letter to an
         * integer and printed it out.]
         */

    }
}
