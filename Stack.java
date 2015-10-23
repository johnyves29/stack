
public class Stack
{
    private int MAXSIZE;
    private int top;
    private int[] stackArray;
    public Stack(int size)
    {
        MAXSIZE = size;
        stackArray = new int[MAXSIZE];
        top = -1;
    }
    private boolean isEmpty()
    {
        return (top == -1);
    }
    private boolean isFull()
    {
        return (top == (MAXSIZE - 1));
    }
    private int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty.");
            return 0;
        }
        else
        {
            int value = stackArray[top];
            stackArray[top] = 0;
            top--;
            return value;
        }
    }
    private boolean push(int number)
    {
        if(isFull())
        {
            return false;
        }
        else
        {
            stackArray[top] = number;
            top++;
            return true;
        }
    }
    private int peek()
    {
        return stackArray[top];
    }
}
