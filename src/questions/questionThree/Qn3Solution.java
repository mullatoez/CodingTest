package questions.questionThree;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Qn3Solution {
    /*
    Write a function solution that, given two integers A and B, returns a string containing
exactly A letters 'a' and exactly B letters 'b' with no three consecutive letters being the
same (in other words, neither "aaa" nor "bbb" may occur in the returned string).
Examples:
1. Given A = 5 and B = 3, your function may return "aabaabab". Note that "abaabbaa"
would also be a correct answer. Your function may return any correct answer.
2. Given A = 3 and B = 3, your function should return "ababab", "aababb", "abaabb" or any
of several other strings.
3. Given A = 1 and B = 4, your function should return "bbabb", which is the only correct
answer in this case.
Assume that:
A and B are integers within the range [0..100];
at least one solution exists for the given A and B.
     */

    static String printLetters(int aletters, int bletters) {
        /*
        BIG - O Notation
        Time Complexity: - 0(n)
        Space Complexity: - 0(1)
         */
        return printLetters(aletters, bletters, 'a', 'b');
    }

    static String printLetters(int As, int Bs, char acharacters, char bcharacters)
    {
        if (Bs > As)
        {
            return printLetters(Bs, As, bcharacters, acharacters);
        }
        StringBuilder output = new StringBuilder();
        while (As > Bs)
        {
            output.append(acharacters);
            As--;
            if (As > 0 && As <= 100)
            {
                output.append(acharacters);
                As--;
            }
            if (Bs > 0 && Bs <= 100)
            {
                output.append(bcharacters);
                Bs--;
            }
        }
        while (As > 0 && As <= 100)
        {
            output.append(acharacters).append(bcharacters);
            As--;
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String letters = printLetters(1, 4);
        System.out.println(letters);
    }
}
