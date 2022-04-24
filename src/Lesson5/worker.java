package Lesson5;

import javax.sound.sampled.Line;
// загружено на git
public class worker {
    //задаем класс worker
    String name;
    String position;
    String email;
    String tel;
    double salary;
    int age;
    public worker(String name, String position, String email, String tel, double salary, int age){
        //создаем конструктор с необходимыми полями
        this.name=name;
        this.position=position;
        this.email=email;
        this.tel=tel;
        this.salary=salary;
        this.age=age;
        info();
    }

    public  void info(){
        // выводим инфу об объекте
                    System.out.println("Name: '" + name + "', Age: '" + age + "', Position: '" + position + "', Tel: '" + tel + "', Email: '" + email + "', Salary: " + salary);
                    System.out.println("------------------------------------------------------------------------");

    }

    public static void main(String[] args){
        worker[] workarray=new worker[5];
        workarray[0]=new worker("Dima", "engineer", "dima@gmail.com", "8977766555", 5000, 56);
        workarray[1]=new worker("Pima", "pincher", "pima@gmail.com", "8977766777", 50000, 16 );
        workarray[2]=new worker("Sima", "catcher", "sima@gmail.com", "8977766774", 40000, 11 );
        workarray[3]=new worker("Lima", "slave", "lima@gmail.com", "8977766775", 10000, 200 );
        workarray[4]=new worker("Rimma", "master", "Rimma@gmail.com", "8977766772", 100000, 133 );
        System.out.println("Выводим информацию о сотрудниках старше 40 лет:");



        for (int i=0; i<5; i++) {
            //проверяем возраст, выводим старше 40
            if (workarray[i].age>40){
                System.out.println(workarray[i].name+" "+workarray[i].position+" "+workarray[i].age);
            }

        }








    }
}
