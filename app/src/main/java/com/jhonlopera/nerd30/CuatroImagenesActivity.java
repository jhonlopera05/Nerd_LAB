package com.jhonlopera.nerd30;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CuatroImagenesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView im1,im2,im3,im4;
    Button bavanzar,bdel;
    LinearLayout Linear1,Linear2,Linear3,Linear4,Linear5,Linear6,Linear7;
    Chronometer tiempo;
    SharedPreferences preferencias;
    SharedPreferences.Editor editor_preferencias;
    int level;
    int casillanumero=0;
    final Button botones[]=new Button[10];
    final  TextView letras[] =new TextView[7];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro_imagenes);

        preferencias=getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
        editor_preferencias=preferencias.edit();

        //Casillas de las letras
        letras[0]=(TextView) findViewById(R.id.tletra1);
        letras[1]=(TextView) findViewById(R.id.tletra2);
        letras[2]=(TextView) findViewById(R.id.tletra3);
        letras[3]=(TextView) findViewById(R.id.tletra4);
        letras[4]=(TextView) findViewById(R.id.tletra5);
        letras[5]=(TextView) findViewById(R.id.tletra6);
        letras[6]=(TextView) findViewById(R.id.tletra7);

        //Imágenes
        im1=(ImageView) findViewById(R.id.im1);
        im2=(ImageView) findViewById(R.id.im2);
        im3=(ImageView) findViewById(R.id.im3);
        im4=(ImageView) findViewById(R.id.im4);

        botones[0]=(Button) findViewById(R.id.b1);
        botones[1]=(Button) findViewById(R.id.b2);
        botones[2]=(Button) findViewById(R.id.b3);
        botones[3]=(Button) findViewById(R.id.b4);
        botones[4]=(Button) findViewById(R.id.b5);
        botones[5]=(Button) findViewById(R.id.b6);
        botones[6]=(Button) findViewById(R.id.b7);
        botones[7]=(Button) findViewById(R.id.b8);
        botones[8]=(Button) findViewById(R.id.b9);
        botones[9]=(Button) findViewById(R.id.b10);
        bavanzar=(Button) findViewById(R.id.bavanzar);
        bdel=(Button) findViewById(R.id.bdel);

        bavanzar.setOnClickListener(this);
        bdel.setOnClickListener(this);

        for (int i=0;i<10;i++){
            botones[i].setOnClickListener(this);
        }

        level=preferencias.getInt("level",1);
        cargarnivel(level);

    }

    @Override
    public void onClick(View v) {

        if(v==bavanzar){
            level++;
            editor_preferencias.putInt("level",level).commit();
            cargarnivel(level);

            if (level==5){
                level=0;
                editor_preferencias.putInt("level",level).commit();
            }
        }
    }

    private void cargarnivel(int level) {

        String palabra;
        switch(level){
            case 1:

                palabra="ROJO";

                cambiarletras(palabra);
                Linear5=(LinearLayout) findViewById(R.id.linear5);
                Linear5.setVisibility(View.GONE);
                Linear6=(LinearLayout) findViewById(R.id.linear6);
                Linear6.setVisibility(View.GONE);
                Linear7=(LinearLayout) findViewById(R.id.linear7);
                Linear7.setVisibility(View.GONE);
                im1.setImageDrawable(getResources().getDrawable(R.drawable.nivel1_1));
                im2.setImageDrawable(getResources().getDrawable(R.drawable.nivel1_2));
                im3.setImageDrawable(getResources().getDrawable(R.drawable.nivel1_3));
                im4.setImageDrawable(getResources().getDrawable(R.drawable.nivel1_4));

                break;
            case 2:

                int aux[]=new int[10];
                palabra="TIRO";

                cambiarletras(palabra);
                Linear5=(LinearLayout) findViewById(R.id.linear5);
                Linear5.setVisibility(View.GONE);
                Linear6=(LinearLayout) findViewById(R.id.linear6);
                Linear6.setVisibility(View.GONE);
                Linear7=(LinearLayout) findViewById(R.id.linear7);
                Linear7.setVisibility(View.GONE);





                im1.setImageDrawable(getResources().getDrawable(R.drawable.nivel2_1));
                im2.setImageDrawable(getResources().getDrawable(R.drawable.nivel2_2));
                im3.setImageDrawable(getResources().getDrawable(R.drawable.nivel2_3));
                im4.setImageDrawable(getResources().getDrawable(R.drawable.nivel2_4));
                break;
            case 3:
                palabra="PRESA";

                cambiarletras(palabra);
                Linear5=(LinearLayout) findViewById(R.id.linear5);
                Linear5.setVisibility(View.VISIBLE);
                Linear6=(LinearLayout) findViewById(R.id.linear6);
                Linear6.setVisibility(View.GONE);
                Linear7=(LinearLayout) findViewById(R.id.linear7);
                Linear7.setVisibility(View.GONE);


                Linear5=(LinearLayout) findViewById(R.id.linear5);
                Linear5.setVisibility(View.VISIBLE);

                im1.setImageDrawable(getResources().getDrawable(R.drawable.nivel3_1));
                im2.setImageDrawable(getResources().getDrawable(R.drawable.nivel3_2));
                im3.setImageDrawable(getResources().getDrawable(R.drawable.nivel3_3));
                im4.setImageDrawable(getResources().getDrawable(R.drawable.nivel3_4));
                break;
            case 4:
                palabra="TRAMPA";

                cambiarletras(palabra);
                Linear5=(LinearLayout) findViewById(R.id.linear5);
                Linear5.setVisibility(View.VISIBLE);
                Linear6=(LinearLayout) findViewById(R.id.linear6);
                Linear6.setVisibility(View.VISIBLE);
                Linear7=(LinearLayout) findViewById(R.id.linear7);
                Linear7.setVisibility(View.GONE);


                im1.setImageDrawable(getResources().getDrawable(R.drawable.nivel4_1));
                im2.setImageDrawable(getResources().getDrawable(R.drawable.nivel4_2));
                im3.setImageDrawable(getResources().getDrawable(R.drawable.nivel4_3));
                im4.setImageDrawable(getResources().getDrawable(R.drawable.nivel4_4));
                break;

            case 5:
                palabra="EMOCION";

                cambiarletras(palabra);
                Linear5=(LinearLayout) findViewById(R.id.linear5);
                Linear5.setVisibility(View.VISIBLE);
                Linear6=(LinearLayout) findViewById(R.id.linear6);
                Linear6.setVisibility(View.VISIBLE);
                Linear7=(LinearLayout) findViewById(R.id.linear7);
                Linear7.setVisibility(View.VISIBLE);
                im1.setImageDrawable(getResources().getDrawable(R.drawable.nivel5_1));
                im2.setImageDrawable(getResources().getDrawable(R.drawable.nivel5_2));
                im3.setImageDrawable(getResources().getDrawable(R.drawable.nivel5_3));
                im4.setImageDrawable(getResources().getDrawable(R.drawable.nivel5_4));


                break;
        }



    }

    private void cambiarletras(String palabra) {

        for (int i=palabra.length();i<10;i++){
            palabra=palabra+aleatorio();
        }

        String palabraper=shuffle(palabra);
        String letra;
        for (int j=0;j<10;j++){
            letra=String.valueOf(palabraper.charAt(j));
            botones[j].setText(letra);
        }
    }

    private String aleatorio(){
        //Colocar letras aleatorias
        int num1 = 97;
        int num2 = 122;
        int numAleatorio = (int)Math.floor(Math.random()*(num2 -num1)+num1);
        char letra=(char)numAleatorio;
        return String.valueOf(letra);

    }

    private static String shuffle(String str) {

        List<String> letters = Arrays.asList(str.split(""));
        Collections.shuffle(letters);

        String salida = "";
        for (String s : letters)
            salida += s;

        return salida;

    }
}
