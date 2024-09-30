/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roadaccidents;

/**
 *
 * @author khayd
 */
           //Title:Java extends Keyword
          //Author:W3Schools
          //Date: 4 May 2024
          //Version:1
          //Available:https://www.w3schools.com/java/ref_keyword_extends.asp
public class RoadAccidentReport extends RoadAccidents {
    public RoadAccidentReport(String AccidentVehicleType, String City,int AccidentTotal )
    {
       super (AccidentVehicleType, City, AccidentTotal );
    }
    
    
    public void printPropertyReport()
    {
        System.out.println("ESTATE AGENT REPORT");
        System.out.println("***********************");
        System.out.println("ESTATE AGENT NAME: " + getAccidentVehicleType());
        System.out.println("ESTATE PROPERTY PRICE: " +getCity());
        System.out.println("AGENT COMMISSION: " + getAccidentTotal());
    }
            
}
