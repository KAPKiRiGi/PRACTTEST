/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roadaccidents;

      //Title:Abstract Classes in Java
          //Author:Alejandro Ugarte
          //Date: 8 January 2024
          //Version:1
          //Available:https://www.baeldung.com/java-abstract-class
public abstract class RoadAccidents implements iRoadAccidents {
    private String AccidentVehicleType;
    private String City;
    private int AccidentTotal;
    
    
    
    
       //Title:Java Constructors
          //Author:W3Schools
          //Date: 12 August 2024
          //Version:1
          //Available:https://www.geeksforgeeks.org/constructors-in-java/

    public RoadAccidents(String AccidentVehicleType, String City, int AccidentTotal) {
        this.AccidentVehicleType = AccidentVehicleType;
        this.City = City;
        this.AccidentTotal = AccidentTotal;
    }

           //Title:Overriding in Java
          //Author:GeeksForGeeks
          //Date: 1 November 2023
          //Version:1
          //Available:https://www.geeksforgeeks.org/overriding-in-java/
   @Override
    public String getAccidentVehicleType() {
        return AccidentVehicleType;
    }

    public void setAccidentVehicleType(String AccidentVehicleType) {
        this.AccidentVehicleType = AccidentVehicleType;
    }
   @Override
    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
   @Override
    public int getAccidentTotal() {
        return AccidentTotal;
    }

    public void setAccidentTotal(int AccidentTotal) {
        this.AccidentTotal = AccidentTotal;
    }
    
    
  
        
           //Title:What are Getter and Setter in Java?
          //Author:Mohit Sahay
          //Date: 4 May 2023
          //Version:1
          //Available:https://www.scaler.com/topics/getter-and-setter-in-java/
    }

