public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void addCourse(Course course) {
        if (course.teacher == null) {
            course.addTeacher(this);
            System.out.println("Ders eklendi: " + course.name);
        }
        else {
            System.out.println("Bu ders için öğretmen zaten atanmış.");
        }
    }
}
