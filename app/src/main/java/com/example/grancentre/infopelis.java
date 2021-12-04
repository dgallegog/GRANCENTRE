package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

public class infopelis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infopelis);

        String textoPeli = new String();

        AppCompatTextView pelisT = ((AppCompatTextView)findViewById(R.id.infopeli));
        Bundle sac_recuperat = getIntent().getExtras();
        String nom = sac_recuperat.getString("tipoPeli");

        if(nom.equals("GuardianesGalaxia")) textoPeli = "Continúan las aventuras del equipo en su travesía por los confines del cosmos. Los Guardianes deberán luchar para mantener unida a su nueva familia mientras intentan resolver el misterio de los verdaderos orígenes de Peter Quill. Viejos rivales se convertirán en nuevos aliados, y queridos personajes de los cómics clásicos acudirán en ayuda de nuestros héroes a medida que el universo cinematográfico de Marvel continúa expandiéndose.";
        else if(nom.equals("starWarsinfo"))textoPeli = "Un año después de los eventos de Los últimos Jedi, tras recibir una transmisión proveniente del difunto Emperador Palpatine clamando venganza, el Líder Supremo Kylo Ren aparece atacando junto con algunas de sus tropas de la Primera Orden y mata a algunos de los habitantes en el planeta Mustafar, luego de terminar el asalto, él llega hasta las ruinas del castillo de su difunto abuelo Darth Vader y obtiene un dispositivo secreto Sith Wayfinder, entonces él con la ayuda del dispositivo viaja hasta el planeta Exegol en las regiones desconocidas de la galaxia, con el objetivo de eliminar al malvado lord Sith, quien supone una amenaza a su poder en el futuro.";
        else textoPeli = "La acción se sitúa en torno al año 2287. El capitán James T. Kirk, el Sr. Spock y el Dr. Leonard McCoy ven bruscamente interrumpido su permiso en el planeta Tierra cuando se les ordena liberar a unos rehenes que un grupo de insurgentes ha tomado en la llamada Ciudad Paraíso, en el planeta Nimbus III. Los rehenes son los embajadores terrestre, klingon y romulana en el citado asentamiento, y el líder de los insurgentes es Sybok, un vulcano que reniega de la filosofía de la lógica pura, y que resulta ser, además, hermanastro de Spock. Sybok ha conseguido seguidores (incluidos los propios rehenes) mediante una extraña técnica de manipulación mental mediante la cual libera de su dolor a sus víctimas, a cambio de que le ayuden a buscar... el lugar donde comenzó la creación, convencido de que hallará el Edén y al mismísimo Dios en un planeta situado en el centro de la Vía Láctea. ";
        pelisT.setText(textoPeli);

    }
}