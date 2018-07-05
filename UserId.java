import java.util.*;
import java.lang.*;
public class UserId{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String First=sc.next();
        String Last=sc.next();
        int pin1=sc.nextInt();
        String pin=""+pin1;
        int N=sc.nextInt();
    if(N>pin.length()){
        System.out.print("ERROR");
    }
    String longer="";
    String smaller="";
    if(First.length()==Last.length()){
        String longest=(First.compareTo(Last)<0)?Last:First;
        String smallest=(First.compareTo(Last)>0)?Last:First;
        longer=longer+longest;
        smaller=smaller+smallest;
    }
    else{
        String longest=(First.length()>Last.length()?First:Last);
        String smallest=(First.length()>Last.length()?Last:First);
        longer=longer+longest;
        smaller=smaller+smallest;
    }
    char firstletter=smaller.charAt(smaller.length()-1);
    String secondletter=longer;
    char thirdletter=pin.charAt(N-1);
    char fourthletter=pin.charAt(pin.length()-N);
    String result=(firstletter+secondletter);
    String answer="";
    for(int i=0;i<result.length();i++)
    {
        char c=result.charAt(i);
        if(Character.isUpperCase(c)==true)
        {
            c=Character.toLowerCase(c);
            answer=answer+c;
        }
        else if(Character.isLowerCase(c)==true)
        {
            c=Character.toUpperCase(c);
            answer=answer+c;
        }
        }
        answer=answer+thirdletter+fourthletter;
        if(pin.length()>=N){
            System.out.print(answer);
        }
    }
}
        
    
    

    
    
