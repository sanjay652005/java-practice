package collectionOfFramework;
import java.util.ArrayList;
public class ArrayList1 {
	 public static void main(String[] args) {

	        ArrayList<String> skills = new ArrayList<>();

	        // Add elements
	        skills.add("Java");
	        skills.add("React");
	        skills.add("MongoDB");

	        // Print list
	        System.out.println("Skills: " + skills);

	        // Access element
	        System.out.println("First Skill: " + skills.get(0));

	        // Remove element
	        skills.remove("React");

	        // Loop
	        for(String skill : skills){
	            System.out.println(skill);
	        }
	    }
}
