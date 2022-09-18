public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor ("Harry Potter", 99, 70, 6,5, 6);
        Griffindor germionaGrenjer = new Griffindor ("Germiona Grenjer", 80, 50, 4,5,6 );
        Griffindor ronUizly = new Griffindor("Ron Uizly", 40, 60, 5, 4, 3);

        Slizerin drakoMalfoy = new Slizerin("Drako Malfoy", 80, 60, 4,5,6,3,6);
        Slizerin grehemMontegu = new Slizerin("Grehem Montegu", 70,40, 3,2,4,5,3);
        Slizerin gregoryGoil = new Slizerin("Gregory Goil", 40,50,4,3,6,5,2);

        Puffenduy zahariyaSmit = new Puffenduy("Zahariya Smit", 80,40,5,4,4);
        Puffenduy sederikDiggory = new Puffenduy("Sederik Diggory", 90,70, 5,6,4);
        Puffenduy jastinFinchFletchly = new Puffenduy("Jastin Finch-Fletchly", 75,60,4,5,6);

        Cogtevran chjoyChang = new Cogtevran("Chjoy Chang", 80,70,5,4,5,6);
        Cogtevran padmaPatil = new Cogtevran("Padma Patil", 85,55,6,4,4,5);
        Cogtevran markusBelby = new Cogtevran("Markus Belby", 85,70,4,6,6,3);

        System.out.println(harryPotter.toString()); // Вместо harryPotter можно указать любого студента
        sederikDiggory.compareStudents(zahariyaSmit);
        HogwartsStudents.compareStudents(drakoMalfoy, ronUizly);



    }




}