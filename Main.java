
class Main{


public static void main (String args[]){
 Student madhav = new Student("Madhav","OOP Assignment", 4 , true , true );
 madhav.submit();
 madhav.getProfile();

}
public class IMG_Member{
    protected String name;
    protected String description;
    protected boolean isSubmitted = false;
    protected boolean isReviewed = false;
    protected boolean isDeveloper;
    protected boolean isFresher;

   
       class Student extends IMG_Member{
        int pendingAssignmentsToBeSubmitted;
        
         Student(String name , String description , int pendingAssignmentsToBeSubmitted , boolean isDeveloper , boolean isFresher){
            this.name = name;
            this.description = description;
            this.pendingAssignmentsToBeSubmitted = pendingAssignmentsToBeSubmitted;
            this.isDeveloper = isDeveloper;
            this.isFresher = isFresher;
          }
        
        public void getProfile(){
            System.out.println("Name: "+name);
            System.out.println("Pending Assignments Left to be reviewed or submitted: "+pendingAssignments);
            if(isDeveloper){
                System.out.println("This person is a developer");
            }
            else{
                System.out.println("This person is a designer");
            }
           
            System.out.println("This person is a student");
            if(isSubmitted){
                System.out.println("This person has submitted his/her assignment");
            }
            if(isReviewed)
            System.out.println("This person has his/her assignment reviewed");
            
           
        }

        public void submit(){
         this.isSubmitted = true;
        }
    }

    class Reviewer extends IMG_Member{
        int pendingAssignmentsToBeReviewed;
        
        Reviewer (String name , String description , int pendingAssignmentsToBeReviewed, boolean isDeveloper , boolean isFresher){
            this.name = name;
            this.description = description;
            this.pendingAssignmentsToBeReviewed = pendingAssignmentsToBeReviewed;
            this.isDeveloper = isDeveloper;
            this.isFresher = isFresher;
          }
        
        public void getProfile(){
            System.out.println("Name: "+name);
            System.out.println("Pending Assignments Left to be reviewed "+pendingAssignments);
            if(isDeveloper){
                System.out.println("This person is a developer");
            }
            else{
                System.out.println("This person is a designer");
            }
           
            System.out.println("This person is a student");
            
           
        }

        public void review(){
            if(isSubmitted)
            this.isReviewed = true;
        }

    } 
}




}