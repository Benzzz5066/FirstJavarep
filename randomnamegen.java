
import java.util.Random;

public class randomnamegen {


    public static void main(String[] args) {


       String firstname[] = {"Kamari" , "Lorenzo" , "Leo" , "Kale" , "Cory" , "Izayah" , "Jaiden" , 
       "Ezekiel" , "Eduardo" , "Rylee" , "Timothy" , "Jaron" , "Vicente" , "Emmanuel" , 
       "Zack" , "Saul" , "Nicholas" , "Johnathan" , "Conrad" , "River" , "River" , "Nick" , "Rishi" , "Zaire" , "Zayne" , "Mauricio" , "Oswaldo" , "Efrain" , "Hezekiah" , "Aaron" ,
       "Jayvion" , "Alfredo" , "Bryson" , "Reginald" , "Kieran" , 
       "Xavier" , "Jairo" , "Joel" , "Rhett" , "Rodrigo" , "Julius" , "Joe" , "Shamar" , "Tyson" , "Leonard" , "Chandler" ,
       "Christian" , "Jamal" , "Nicholas" , "Remington" , "Carsen" , "Cierra" , "Hayley" , "Whitney" , "Kelly" , "Gabriella" , "Kianna" , "Alisson" , "Kyra" , "Lilah" , 
       "Cheyenne" , "Ashanti" , "Ellen" , "Shayna" , 
       "Arianna" , "Courtney" , "Shania" , 
       "Irene" , "Jazlyn" , "Allison" , "Janiya" , "Alaina" , "Adalynn" , "Ryleigh" , "Yazmin" , "Isabel" , 
       "Alivia" , "Mercedes" , "Kaila" , "Damaris" , "Abigail" , "Diana" , "Julianne" , 
       "Natalia" , "Alejandra" , "Rylee" , "Arabella" , "Adyson" , "Angel" , "Elaina" , "Cristina" , "Kamari" , "Shiloh" , "Liberty" , "Audrey" , "Denisse" , "Abril" , "Milagros" , "Aria" , 
       "Brittany" , "Rose" , "ocean"
    };

    String lastname[] = {"Mcpherson" , "Robinson" , "Daniel" , "Dillon" , "Carpenter" , "Brandt" , "Clements" , "Garrison" , "Turner" , "Cantrell" , "Sharp" , "Juarez" , 
    "Allen" , "Butler" , "Sweeney" , "Morris" , "Stevenson" , "Hall" , "Hampton" , "Collins" , "Brennan" , 
    "Cisneros" , "Buchanan" , "Owen" , "Morton" , "Howard" , "Washington" , "Fields" , "Suarez" ,
    "Schultz" , "Sutton" , "Holland" , "Roth" , "Daniels" , "Sanford" , "Rios" , "Wu" , "Pham" , "Kramer" , "Robles" , "Cole" , "Alvarez" , "Boyle" , "Conway" , 
    "Duncan" , "Matthews" , "Avila" , "Le" , "Mooney" , "Riley" , "Gallego" , "Serrano" , "Martin" , "Soler" , 
    "Carrasco" , "Velasco" , "Santiago" , "Gil" , "Garcia" , "Herrera" , "Soto" , "Ramirez" , "Ferrer" , "Hernandez" , "Vargas"
};
       
       
        System.out.println( firstname[new Random().nextInt(firstname.length)]);
        System.out.println( lastname[new Random().nextInt(lastname.length)]);
    
    }





}