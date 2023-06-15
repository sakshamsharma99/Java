import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0, r=0;
        int temp = x;
        while (x > 0)
        {
            r = x % 10;
            sum = (sum*10)+r;
            x = x / 10;
        }

        if (temp == sum)
        {
            return true;
        }else {
            return false;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        boolean answer = s.isPalindrome(number);
        if(answer == true)
        {
            System.out.printf("true\n%d reads as %d from left to right and from right to left.",number,number);
        }else
        {
            System.out.printf("false\nFrom left to right, it reads %d. From right to left, it becomes %d. Therefore it is not a palindrome.",number,number);
        }
    }
}