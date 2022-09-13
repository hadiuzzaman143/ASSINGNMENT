package Intoduction_To_Java_Hands;

class DisplayMessage
{
    void printMessage()
    {
     System.out.println(("Hello My Message"));
    }
}  
  
class  MyProgram
{ 
public static void main(String arg[])
    {
        MyProgram program=new MyProgram();
        program.printMessage();
    }
}

//handle compile time errors in line number 16 program.printMessage();