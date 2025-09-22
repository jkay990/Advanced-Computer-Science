public class StudentTester {

    public static void main(String[] args) {
        //creating students and then printing their info
        Student hwNormie = new Student("Bob");
        System.out.println(hwNormie.toString());
        Student hwStudent = new Student("John", 11);
        System.out.println(hwStudent.toString());
        Student hwAthlete = new Student("Joe");
        System.out.println(hwAthlete.toString());
        Student hwJunior = new Student("Luke", 11);
        System.out.println(hwJunior.toString());
        //Calling setters to change grade up 1 yr
        hwNormie.setGrade(11);
        hwStudent.setGrade(12);
        hwAthlete.setGrade(11);
        hwJunior.setGrade(12);
        //Test after grade has been moved up 1 year
        System.out.println(hwNormie.toString());
        System.out.println(hwStudent.toString());
        System.out.println(hwAthlete.toString());
        System.out.println(hwJunior.toString());
        //Test whether the 4 students are the same
        System.out.println(hwAthlete.equals(hwJunior));
        System.out.println(hwStudent.equals(hwNormie));
    }



}