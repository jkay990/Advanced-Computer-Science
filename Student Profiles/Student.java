public class Student {

    private int grade;
    private String name;
    private String id;

    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }
   
    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public String generateId() {
        int id1 = (int) (Math.random() * 8 + 1);
        int id2 = (int) (Math.random() * 8 + 1);
        int id3 = (int) (Math.random() * 8 + 1);
        int id4 = (int) (Math.random() * 8 + 1);
        int id5 = (int) (Math.random() * 8 + 1);
        int id6 = (int) (Math.random() * 8 + 1);
        int id7 = (int) (Math.random() * 8 + 1);
        id = "" + id1 + id2 + id3 + "-" + id4 + id5 + id6 + id7;
        return id;
    }

    public String toString() {
        return name + " is a " + grade + " student. " + "Their id is " + id;
    }

    public boolean equals(Student other) {
        if (this.grade == other.grade && this.name.equals(other.name) && this.id.equals(other.id)) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

}