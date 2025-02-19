public class Main {
    public static void main(String[] args) {
        Student student = new Student("ФКН", 3, 7, "Александр", "Мирошников");
        Dean dean = new Dean("Александр", "Крыловецкий", "aakryl@cs.vsu.ru", "+7 952-958-6639", "Декан");
        Professor professor = new Professor("Андрей", "Малыхин", "", "", "Старший преподаватель");

        System.out.print("Студент: ");
        System.out.println(student);
        System.out.print("Преподаватель: ");
        System.out.println(professor);
        System.out.print("Декан ");
        System.out.println(dean);
        System.out.println("изменение факультета преподавателя");
        professor.setFacultyName("ФКН");
        System.out.println("изменение факультета декана");
        dean.setFacultyName("ФКН");
        System.out.print("Студент: ");
        System.out.println(student);
        System.out.print("Преподаватель: ");
        System.out.println(professor);
        System.out.print("Декан ");
        System.out.println(dean);
    }
}