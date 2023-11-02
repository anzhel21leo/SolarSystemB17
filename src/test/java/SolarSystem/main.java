package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSytemBasics solarsys=new solarSytemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

        //***************Feature Sun************
        FeatureSun Sun=new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.name="123456kelvin";


        //*************Planet 2*************
        Planet2 xaros=new Planet2();
        xaros.name="Nefiro";
        xaros.color="pink";
        xaros.size="1245495484km";

//      Planet 1
        Planet1 plato=new Planet1();
        plato.color="green";
        plato.name="Pluto";
        plato.temp="10000000k";
        plato.radius="800000km";

    }
}
