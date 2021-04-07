import java.util.*;
class RockPaperScissors
{
    public static void main ()
    {
        Scanner obj = new Scanner(System.in);char repeat; int c1,c2,c3;c1=0;c2=0;c3=0;
        do
       {
        System.out.println("WELCOME TO ROCK PAPER SCISSORS! \nChose one of the following");  
        System.out.println("1 - Rock \n2 - Paper \n3 - Scissor");
        int choose = obj.nextInt();
        int c_choose = (int)(Math.random()*3)+1;String c_rps = "";
        if(c_choose == 1)
         c_rps = "Rock";
        else if (c_choose == 2)
        c_rps = "Paper";
        else if(c_choose == 3)
        c_rps = "Scissor";
        System.out.println("The computer chose "+ c_rps);
        if(choose ==1)//when we choose rock
        {
         if(c_choose==1)
         {System.out.println("DRAW");c1++;}
         else if(c_choose == 2)
         {System.out.println("LOSE"); c2++;}
         else if(c_choose == 3)
         {System.out.println("WIN"); c3++;}
        }
        
        if(choose ==2)//when we choose paper
        {
         if(c_choose==1)
         {System.out.println("WIN");c3++;}
         else if(c_choose == 2)
         {System.out.println("DRAW");c1++;}
         else if(c_choose == 3)
         {System.out.println("LOSE");c2++;}
        }
        
        
        if(choose ==3)//when we choose Scissor
        {
         if(c_choose==1)
         {System.out.println("LOSE");c2++;}
         else if(c_choose == 2)
         {System.out.println("WIN");c3++;}
         else if(c_choose == 3)
         {System.out.println("DRAW"); c1++;}
        }
        
        System.out.println("If you want to play again press R \nTo exit press E");
        repeat = obj.next().charAt(0);
        if(repeat=='E')
            {
             System.out.println("Thanks for playing.");
             System.out.println("You won "+c3+" times");
             System.out.println("You lost "+c2+" times");
             System.out.println("You drew "+c1+" times");
             System.out.println("*EXIT*");
             System.exit(0);
            }
            else if(repeat !='R')
            {
             System.out.println("sorry wrong input. "+ "\n*EXIT*");
             System.exit(0);
            }
        
    }while(repeat == 'R');
}
}
    
