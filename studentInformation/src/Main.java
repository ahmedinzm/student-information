public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("John Smith", "123", "Math");
        Teacher t2 = new Teacher("Jane Doe", "456", "Physics");

        Course math = new Course("Matematik", "MAT101", "MAT", 0, t1);
        Course physics = new Course("Fizik", "PHY101", "PHY", 0, t2);

        math.setVerbalEffect(0.2); // Matematik dersinde sözlü notun etkisi %20
        physics.setVerbalEffect(0.15); // Fizik dersinde sözlü notun etkisi %15

        Student s1 = new Student("Alice Wonderland", 1, "A", math, physics, null);
        Student s2 = new Student("Bob Dylan", 2, "A", math, null, physics);

        s1.addBulkExamNote(80, 90, 70); // Alice Matematik'ten 80, Fizik'ten 90, diğer dersi almadığı için not girmedi
        s2.addBulkExamNote(70, 65, 85); // Bob Matematik'ten 70, Fizik'ten 85, diğer dersi almadığı için not girmedi

        math.printTeacher();
        physics.printTeacher();

        t1.addCourse(math);
        t2.addCourse(physics);

        s1.calcAverage();
        s2.calcAverage();
    }
}
