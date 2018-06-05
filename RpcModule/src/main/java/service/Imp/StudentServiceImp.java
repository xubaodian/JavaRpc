package service.Imp;

import Entity.Student;
import service.StudentService;

public class StudentServiceImp implements StudentService {
    @Override
    public Student getInfo() {
        Student stu = new Student();
        stu.setID("123456");
        stu.setAge(10);
        stu.setName("xxxx");
        return stu;
    }

    @Override
    public void print(Student stu) {

    }
}
