package Inheritance.TASK_2;

public class Employee extends Person {

   private String jobTitle;

   public Employee(String name,int age,String jobTItle){
    super(name,age);
    this.jobTitle=jobTItle;

   }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public void print(){
        System.out.println("Name "+ getName());
        System.out.println("Age:" + getAge());
        System.out.println("Job Title : "+ jobTitle);
    }

    
}
