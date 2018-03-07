package com.example.samirvega.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView display;
    TextView numero1,numero2,numero3,numero4,numero5;
    TextView numero6,numero7,numero8,numero9,numero0;
    TextView mas,menos,por,punto,igual,division;
    String pantalla="";
    String operacion="";
    int estadoOpera=0,estadoMenos=0,estadonum=0;
    float operador1=0,operador2=0,resultado=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero0=findViewById(R.id.idCero);
        numero1=findViewById(R.id.idNumero1);
        numero2=findViewById(R.id.idNumero2);
        numero3=findViewById(R.id.idNumero3);
        numero4=findViewById(R.id.idNumero4);
        numero5=findViewById(R.id.idNumero5);
        numero6=findViewById(R.id.idNumero6);
        numero7=findViewById(R.id.idNumero7);
        numero8=findViewById(R.id.idNumero8);
        numero9=findViewById(R.id.idNumero9);
        mas=findViewById(R.id.idIMas);
        menos=findViewById(R.id.idMenos);
        por=findViewById(R.id.idPor);
        punto=findViewById(R.id.idPunto);
        igual=findViewById(R.id.idIgual);
        division=findViewById(R.id.idDivision);
        display=findViewById(R.id.idDisplay);

        display.setKeyListener(null); //Evita que el display sea editable


    }
    //CONDICIONES INICIALES

    //NUMEROS

    public void clickSiete(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"7";
        display.setText(pantalla);
        estadonum=1;
    }

    public void clickOcho(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"8";
        display.setText(pantalla);
        estadonum=1;
    }

    public void clickNueve(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"9";
        display.setText(pantalla);
        estadonum=1;
    }

    public void clickCuatro(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"4";
        display.setText(pantalla);
        estadonum=1;
    }

    public void clickCinco(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"5";
        display.setText(pantalla);
        estadonum=1;
    }

    public void clickSeis(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"6";
        display.setText(pantalla);
        estadonum=1;
    }

    public void clickUno(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"1";
        display.setText(pantalla);
        estadonum=1;
    }

    public void clickDos(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"2";
        display.setText(pantalla);
        estadonum=1;
    }

    public void clickTres(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"3";
        display.setText(pantalla);
        estadonum=1;
    }
    public void clickCero(View view) {
        display.setTextSize(38);
        pantalla=pantalla+"0";
        display.setText(pantalla);
        estadonum=1;
    }
    public void clickPunto(View view) {
        pantalla=pantalla+".";
        display.setText(pantalla);
    }
    //OPERACIONES

    public void clickMas(View view) {
        if(estadonum==1){
            estadonum=0;
            operador1=Float.parseFloat(display.getText().toString());//convierte el numero que esta en pantalla a float
            display.setText("");//borra la pantalla
            pantalla="";//borra el contenido del string pantalla
        }
        operacion="+";//guarda la operacion que se esta haciendo
    }

    public void clickMenos(View view) {
        if(estadonum==1) {
            estadonum=0;
            operador1 = Float.parseFloat(display.getText().toString());
            display.setText("");
            pantalla= "";
        }
        operacion = "-";
    }

    public void clickDivision(View view) {
        if(estadonum==1){
            estadonum=0;
            operador1=Float.parseFloat(display.getText().toString());
            display.setText("");
            pantalla="";
        }
        operacion="/";
    }

    public void clickPor(View view) {
        if(estadonum==1){
            estadonum=0;
            operador1=Float.parseFloat(display.getText().toString());
            display.setText("");
            pantalla="";
        }
        operacion="*";
    }

    public void clickBorrar(View view) {
        display.setText("");
        operacion="";
        pantalla="";
        resultado=0;
        operador1=0;
        operador2=0;
    }
    public void clickIgual(View view) {
        if (!TextUtils.isEmpty(display.getText().toString().trim())) {

            if (operacion == "+") {
                operador2 = Float.parseFloat(display.getText().toString());
                try {
                    resultado = operador1 + operador2;
                    if (operador2 < 0) {
                        display.setText("" + resultado);

                    } else {
                        display.setText("" + resultado);
                    }

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Ha ocurrido un error", Toast.LENGTH_SHORT).show();
                }
            } else if (operacion == "-") {
                operador2 = Float.parseFloat(display.getText().toString());
                try {
                    resultado = operador1 - operador2;
                    if (operador2 < 0) {
                        display.setText("" + resultado);
                    } else {
                        display.setText("" + resultado);
                    }

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Ha ocurrido un error", Toast.LENGTH_SHORT).show();
                }

            } else if (operacion == "/") {
                operador2 = Float.parseFloat(display.getText().toString());
                try {
                    resultado = operador1 / operador2;
                    if (operador2 < 0) {
                        display.setText("" + resultado);
                    } else {
                        display.setText("" + resultado);
                    }
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Ha ocurrido un error", Toast.LENGTH_SHORT).show();
                }
            } else if (operacion == "*") {
                operador2 = Float.parseFloat(display.getText().toString());
                try {
                    resultado = operador1 * operador2;
                    if (operador2 < 0) {
                        display.setText("" + resultado);
                    } else {
                        display.setText("" + resultado);
                    }
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Ha ocurrido un error", Toast.LENGTH_SHORT).show();
                }

            }

        }
    }

}
