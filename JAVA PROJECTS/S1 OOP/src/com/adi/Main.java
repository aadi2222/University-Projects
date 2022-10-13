package com.adi;

public class Main {

    public static void main(String[] args) {
	// SP20-BCS-055
        // ABDULLAH AHMAD
        //CONSTRUCTOR
        Public City(String name,double population){

            cityName=name;
            cityPopulation=1000000;
            if(population>1000000){
                cityPopulation=population;
            }
            cityRegisteredVoters=0.15*cityPopulation;
            if(population>maxPopulation){
                maxPopulation=population;
            }
            totalCities++;

        }
        //testCity main class

        //menu
        System.out.println("1) ADD new city");
        System.out.println("2) Print detail of current city");
        System.out.println("3) Print maximum Population");
        System.out.println("4) exit");
        input=nextInt(System.in);
        switch(input){
            case 1:{
            City c1=new City(LHR,2000000);
            break;}
            case 2:{
                System.out.println("DETAILS:");
                toString();
            break;
            }
            case 3:{
                System.out.println("Max Popu="+City.maxPopulation);
            }
            case 4:
                System.out.println("YOUR PROGRAM EXITTED SUCCESSFULLY");
                break;

        }


    }
}
