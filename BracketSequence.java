import java.util.Scanner;
import java.util.Stack;

public class BracketSequence {

    public  static int check(int n, int[] arr){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            if(arr[i]>0){
                if(stack.isEmpty() || arr[i] != -stack.pop())
                    return 0;
            }
            else {
                stack.push(arr[i]);
            }
        }
        return (stack.size() ==0) ? 1 : 0;
    }
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<num; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(check(num, arr));
    }
}
