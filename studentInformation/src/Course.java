public class Course {
    String name;
    String code;
    String prefix;
    Teacher teacher;
    int note;
    double verbalEffect; //sözlü not etki yüzdesi

    public Course(String name, String code, String prefix, int note, Teacher teacher)
    {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        this.teacher = teacher;
    }


    public void addTeacher(Teacher teacher) {
        if (this.teacher == null) {
            this.teacher = teacher;
            System.out.println("Öğretmen eklendi: " + teacher.name);
        }
        else {
            System.out.println(this.name + " dersine zaten öğretmen atanmış.");
        }
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin öğretmeni: " + teacher.name);
        }
        else {
            System.out.println(this.name + " dersine öğretmen atanmamış.");
        }
    }

    public void setVerbalEffect(double verbalEffect) {
        this.verbalEffect = verbalEffect;
    }
}
