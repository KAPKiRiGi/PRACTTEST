
package roadaccidentreport;

/**
 *
 * @author khayd
 */
import java.util.Scanner;
public class RoadAccidentReport
{


    public static void main(String[] args)
    {
Scanner scanner = new Scanner(System.in);
//gets the input for accident in cape town
        System.out.println("Enter the number of car accidents in Cape Town: ");
        String carCrashCPTString=scanner.next();
        int carCrashCPT = Integer.parseInt(carCrashCPTString);
        System.out.println("Enter the number of motorbike accidents in Cape Town: ");
        String bikeCrashCPTString=scanner.next();
        int bikeCrashCPT = Integer.parseInt(bikeCrashCPTString);

//gets the input for accidents in Johannesburg        
        System.out.println("Enter the number of motorbike accidents in Johannesburg : ");
        String carCrashJoburgString=scanner.next();
         int carCrashJoburg = Integer.parseInt(carCrashJoburgString);
        System.out.println("Enter the number of motorbike accidents in Johannesburg : ");
        String bikeCrashJoburgString=scanner.next();
         int bikeCrashJoburg = Integer.parseInt(bikeCrashJoburgString);
        
//gets the inout for accidents in Port Elizabeth        
        System.out.println("Enter the number of motorbike accidents Port Elizabeth: ");
        String carCrashPEString=scanner.next();
                 int carCrashPE = Integer.parseInt(carCrashPEString);
        System.out.println("Enter the number of motorbike accidents in Port Elizabeth: ");
        String bikeCrashPEString=scanner.next();
                 int bikeCrashPE = Integer.parseInt(bikeCrashPEString);
        
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT   ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        
        //string arry for displaying report
        String[][] roadAccident
                = {
                    {" ","CAR","MOTOR BIKE"}, //r0
                    {"CAPE TOWN ", carCrashCPTString, bikeCrashCPTString}, //r0
                    {"Johannesburg ", "178", "145"}, //r0
                    {"Port Elixabeth ", "112", "89"}, //r0
                };
        
  //integer array to house user input      
int [] [] roadAccidentArray=
{   {carCrashCPT, bikeCrashCPT},
     {carCrashJoburg, bikeCrashJoburg},
     {carCrashPE, bikeCrashPE},
        
};
int totalCarCrashCPT= roadAccidentArray [0][0] + roadAccidentArray [0][1];
int totalCarCrashJoburg= roadAccidentArray [1][0] +roadAccidentArray [1][1];
int totalCarCrashPE= roadAccidentArray [2][0] +roadAccidentArray [2][1];


//single dim aray to strore town  names
String [] names = { "CAPE TOWN"," JOHANNESBURG","PORT ELIZABETH"};


//report section
 //Title:What is += Addition Assignment Operator in Java?
          //Author:Jayant Verma
          //Date: 3 August 2023
          //Version:1
          //Available:https://www.digitalocean.com/community/tutorials/addition-assignment-operator-in-java

String text =" ";
text +=  carCrashCPT + bikeCrashCPT + "\n";
text += carCrashJoburg + bikeCrashJoburg+  "\n";
text += carCrashPE + bikeCrashPE + "\n";

        System.out.println(text);
       System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("CAPE TOWN: ");
        System.out.println(totalCarCrashCPT);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("JOHANNESBURG: ");
        System.out.println(totalCarCrashJoburg);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("PORT ELIZABETH: ");
        System.out.println(totalCarCrashPE);
        
        
        
        if ( totalCarCrashCPT > totalCarCrashJoburg )
        {
            if ( totalCarCrashCPT > totalCarCrashPE )
            {
                System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + totalCarCrashCPT);
            }
            else
            {
                System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + totalCarCrashPE);
            }
        }
        else
        {
            if ( totalCarCrashJoburg > totalCarCrashPE )
            {
                System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + totalCarCrashJoburg);
            }
            else 
            {
                System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + totalCarCrashPE);
            }
        }
 

        
        
        
        
        
        


    

    }
    
}
