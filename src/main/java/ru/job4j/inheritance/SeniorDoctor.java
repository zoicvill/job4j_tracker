package ru.job4j.inheritance;

public class SeniorDoctor extends Doctor{

    private String grosSalary;

    public SeniorDoctor(String salary, String grosSalary) {
        super(salary);
        this.grosSalary = grosSalary;
    }

    public SeniorDoctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    @Override
    void salaryMy() {
        System.out.println(grosSalary);
        super.salaryMy();
    }
}
