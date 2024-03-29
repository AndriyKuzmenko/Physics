package com.example.physics;

public class Languages
{
    public static String springElongation;
    public static String pendulum;
    public static String credits;
    public static String freeFall;
    public static String mass;
    public static String height;
    public static String planet;
    public static String mercury;
    public static String venus;
    public static String earth;
    public static String moon;
    public static String mars;
    public static String phobos;
    public static String deimos;
    public static String jupiter;
    public static String ganymede;
    public static String callisto;
    public static String io;
    public static String europa;
    public static String himalia;
    public static String amalthea;
    public static String saturn;
    public static String titan;
    public static String rhea;
    public static String iapetus;
    public static String dione;
    public static String tethys;
    public static String uranus;
    public static String neptune;
    public static String pluto;
    public static String[] planets;
    public static double[] gravity={3.73, 8.87, 9.807, 1.62, 3.721, 0.0057, 0.03, 24.7, 1.42, 1.236, 1.796, 1.315, 0.062, 0.02, 10.44, 1.352, 0.264, 0.223, 0.232, 0.145, 8.87, 11.5, 0.62};
    public static String whatIsTheGravityOfEarth;

    public static void toEnglish()
    {
        springElongation="String Elongation";
        pendulum="Pendulum";
        credits="Credits";
        freeFall="Free Fall";
        mass="Mass";
        height="Height";
        planet="Planet";
        mercury="Mercury";
        venus="Venus";
        earth="Earth";
        moon="      The Moon";
        mars="Mars";
        phobos="      Phobos";
        deimos="      Deimos";
        jupiter="Jupiter";
        ganymede="      Ganymede";
        callisto="      Callisto";
        io="      Io";
        himalia="      Himalia";
        europa="      Europa";
        amalthea="      Amalthea";
        saturn="Saturn";
        titan="      Titan";
        rhea="      Rhea";
        iapetus="      Iapetus";
        dione="      Dione";
        tethys="      Tethys";
        uranus="Uranus";
        neptune="Neptune";
        pluto="Pluto";
        planets=new String[]{mercury, venus, earth, moon, mars, phobos, deimos, jupiter, ganymede, callisto, io, europa, himalia, amalthea, saturn, titan, rhea, iapetus, dione, tethys, uranus, neptune, pluto};
        whatIsTheGravityOfEarth="You have chosen Planet Earth. Do you want to substitute g=10 or g=9.807?";
    }

    public static void toHebrew()
    {
        springElongation="התארכות קפיץ";
        pendulum="מטוטלת";
        credits="קרדיטים";
        freeFall="נפילה חופשית";
        mass="מסה";
        height="גובה";
        planet="כוכב לכת";
        mercury="כוכב חמה/מרקורי";
        venus="נוגה/ונוס";
        earth="כדור הארץ";
        moon="      הירח";
        mars="מאדים";
        phobos="      פובוס";
        deimos="      דימוס";
        jupiter="צדק/יופיטר";
        ganymede="      גנימד";
        callisto="      קליסטו";
        io="      איו";
        himalia="      הימליה";
        europa="      אירופה";
        amalthea="      אמלתאה";
        saturn="שבתאי";
        titan="      טיטן";
        rhea="      ריאה";
        iapetus="      יאפטוס";
        dione="      דיוני";
        tethys="      טתיס";
        uranus="אורנוס";
        neptune="נפטון";
        pluto="פלוטו";
        planets=new String[]{mercury, venus, earth, moon, mars, phobos, deimos, jupiter, ganymede, callisto, io, europa, himalia, amalthea, saturn, titan, rhea, iapetus, dione, tethys, uranus, neptune, pluto};
        whatIsTheGravityOfEarth="בחרת בכדור הארץ. האם ברצונך להציב בתור תאוצת הכבידה של כדור הארת 9.807 או 10?";
    }
}
