public class test 
{
    public static void main(String[] args) 
    {
        Student model=new Student("Rupsa Nandy","1","A++");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Rupsa Nandy");
        controller.setStudentGrade("A++");
        controller.updateView();
    }
}
