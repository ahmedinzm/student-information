public class Student {
    String name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    int verbalNote1; //sözlü notları
    int verbalNote2;
    int verbalNote3;
    double average;
    boolean isPass;

    Student(String name, int stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.verbalNote1 = 0;
        this.verbalNote2 = 0;
        this.verbalNote3 = 0;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int verbalNote1, int verbalNote2, int verbalNote3) {
        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            this.verbalNote1 = verbalNote1;
        }
        if (verbalNote2 >= 0 && verbalNote2 <= 100) {
            this.verbalNote2 = verbalNote2;
        }
        if (verbalNote3 >= 0 && verbalNote3 <= 100) {
            this.verbalNote3 = verbalNote3;
        }
    }

    public void isPass() {
        calcAverage();
        if (this.average >= 55) {
            System.out.println("Öğrenci geçti.");
            this.isPass = true;
        } else {
            System.out.println("Öğrenci kaldı.");
            this.isPass = false;
        }
    }

    public void calcAverage() {
        if (course1.note == 0 || course2.note == 0 || course3.note == 0) {
            System.out.println("Notlar henüz girilmemiş.");
        } else {
            this.average = ((course1.note * (1 - course1.verbalEffect)) + (verbalNote1 * course1.verbalEffect) +
                    (course2.note * (1 - course2.verbalEffect)) + (verbalNote2 * course2.verbalEffect) +
                    (course3.note * (1 - course3.verbalEffect)) + (verbalNote3 * course3.verbalEffect)) / 3.0;
            printNote();
        }
    }

    public void printNote() {
        System.out.println("=============================");
        System.out.println("Öğrenci Adı: " + this.name);
        System.out.println("Öğrenci No: " + this.stuNo);
        System.out.println("Sınıfı: " + this.classes);
        System.out.println("-> " + course1.name + " Sınav Notu: " + course1.note + " Sözlü Notu: " + verbalNote1);
        System.out.println("-> " + course2.name + " Sınav Notu: " + course2.note + " Sözlü Notu: " + verbalNote2);
        System.out.println("-> " + course3.name + " Sınav Notu: " + course3.note + " Sözlü Notu: " + verbalNote3);
        System.out.println("Ortalama: " + this.average);
        isPass();
    }
}