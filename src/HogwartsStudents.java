public abstract class HogwartsStudents {
    private String name;
    private int magicPower;
    private int transgressionDistance;
    public HogwartsStudents(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName() {
        return name;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public static void compareStudents(HogwartsStudents student1, HogwartsStudents student2) {
        int sumPowerStudent1 = student1.magicPower + student1.transgressionDistance;
        int sumPowerStudent2 = student2.magicPower + student2.transgressionDistance;
        if (sumPowerStudent1 > sumPowerStudent2) {
            System.out.println(student1.name + " обладает бОльшей мощностью магии, чем " + student2.name);
        } else if (sumPowerStudent2 > sumPowerStudent1) {
            System.out.println(student2.name + " обладает бОльшей мощностью магии, чем " + student1.name);
        } else {
            System.out.println("Силы студентов равны");
        }
    }

        //Реализованы методы, которые выводят на экран результат сравнения двух учеников одного факультета по свойствам только это факультета
    //Как распечатать сравнение?
    // Как сделать метод с суммами и распечатать? И в каком классе его делать?





    }



