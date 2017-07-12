/*
 Write a program to accept movie details like ( all 9 items) 
Analysis to be performed: Total number of movies released in 2015, total net income of all movies, total movie of rating more than 4
Count the number of movies whose language is English
Total movies whose director name is "John", and movies whose duration is >1.5 hours
 */
package arraylistex;

import java.util.Scanner;

public class MovieDetails {
    String MovieID;
    String Moviename, Language;
    String ActorName, DirectorName;
    int YearofRelease, Income, Rating;
    float Duration;
    
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Movie Details:");
    
        System.out.println("Enter Movie ID:");
        MovieID = sc.next();
    
        System.out.println("Enter Movie Name:");
         Moviename = sc.next();
    
        System.out.println("Enter Movie Language:");
     Language = sc.next();
    
        System.out.println("Enter Actor of the Movie:");
        ActorName = sc.next();
    
        System.out.println("Enter Director of the Movie:");
        DirectorName = sc.next();
    
        System.out.println("Enter Year of Movie Release");
        YearofRelease = sc.nextInt();
    
    System.out.println("Enter Total Income:");
    Income =sc.nextInt();
    
    System.out.println("Enter Movie Rating:");
    Rating = sc.nextInt();
    
    System.out.println("Enter Movie Duration:");
    Duration =sc.nextFloat();
    
    }
    
    public void movieedits(){
    
    Scanner sc = new Scanner(System.in);
    int count = 0, counton =0, countin = 0, counts = 0, county =0, sumIncome =0;
    
    for( int i=0;i<3;i++){
        
    getData();
    
    if(YearofRelease == 2015)
    {
    count=count+1;
    }
    if(Rating>=4){
    
        counton =counton + 1;
    }
    
    if(Language == "English"){
    
        countin =countin + 1;
    }
    if(DirectorName == "John"){
    
        counts =counts + 1;
    }
    sumIncome =sumIncome + Income;
    
    if(Duration > 1.5){
    
        county =county + 1;
    }
    }
    
    System.out.println("The number of movies released in the year 2015 are :" + count);
    System.out.println("The number of movies with ratings more than 4 are :" + counton);
    System.out.println("Movies in English language are:" + countin);
    System.out.println("Total Income of the movies is " + sumIncome);
    System.out.println("Total Movies with Director name John:" + counts);
    System.out.println("Total Movies with duration more than 1.5 hours:" + county);
    }
    
   
    public static void main(String args[]){
    
        MovieDetails obj =new MovieDetails();
        obj.movieedits();
    
    }
}
