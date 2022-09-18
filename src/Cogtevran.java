public class Cogtevran extends HogwartsStudents {

    //Чжоу Чанг, Падма Патил и Маркус Белби

    private int mind;
    private int wisdom;
    private int wit;
    private int creative;

    public Cogtevran (String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit,int creative){
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }
    public int getMind(){
        return mind;
    }
    public int getWisdom(){
        return wisdom;
    }
    public int getWit(){
        return wit;
    }
    public int getCreative(){
        return creative;
    }
    public String toString(){
        return "Имя = " + getName() + "; Сила магии = " + getMagicPower() + "; Расстояние трансгресии = " + getTransgressionDistance()
                + "; Ум = " + mind + "; Мудрость = " + wisdom + "; Остроумие = " + wit + "; Полон творчества = " + creative;
    }
    public void compareStudents(Cogtevran student1){
        int sumPower1 = this.mind + this.wisdom + this. wit + this.creative;
        int sumPower2 = student1.mind + student1.wisdom + student1. wit + student1.creative;
        if(sumPower1 > sumPower2){
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }




}
