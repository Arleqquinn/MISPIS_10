public class Simulation {
    public static void main(String[] args) {
        Student student = new Student("ФКН", 3, 7, "Александр", "Мирошников");
        Dean dean = new Dean("Александр", "Крыловецкий", "aakryl@cs.vsu.ru", "+7 952-958-6639", "Декан");
        Professor professor = new Professor("Андрей", "Малыхин", "", "", "Старший преподаватель");

        dean.appointEmployee(professor);
        dean.approveCurriculum("MISPIS");
        professor.postHomework("task");
        student.doHomework("task");
        student.sendHomework("task");
        professor.checkHomework("task");
    }
}

