package com.example.examenu1_desarrollomvil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calc extends AppCompatActivity implements View.OnClickListener{

    boolean suma;
    boolean resta;
    boolean mult;
    boolean div;
    boolean pot;
    boolean sen;
    boolean cos;
    boolean log;
    boolean tan;
    boolean raiz;
    boolean flotante;

    Double[] numeros = new Double[20];
    Double resultado;

    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve;

    Button btnSuma, btnResta, btnMult, btnDiv, btnPunto, btnPot, btnSin, btnCos, btnTan, btnLog, btnBorrar, btnRaiz, btnIgual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        btnCero = (Button)findViewById(R.id.btnCero);
        btnCero.setOnClickListener(this);

        btnUno = (Button)findViewById(R.id.btnUno);
        btnUno.setOnClickListener(this);

        btnDos = (Button)findViewById(R.id.btnDos);
        btnDos.setOnClickListener(this);

        btnTres = (Button)findViewById(R.id.btnTres);
        btnTres.setOnClickListener(this);

        btnCuatro = (Button)findViewById(R.id.btnCuatro);
        btnCuatro.setOnClickListener(this);

        btnCinco = (Button)findViewById(R.id.btnCinco);
        btnCinco.setOnClickListener(this);

        btnSeis = (Button)findViewById(R.id.btnSeis);
        btnSeis.setOnClickListener(this);

        btnSiete = (Button)findViewById(R.id.btnSiete);
        btnSiete.setOnClickListener(this);

        btnOcho = (Button)findViewById(R.id.btnOcho);
        btnOcho.setOnClickListener(this);

        btnNueve = (Button)findViewById(R.id.btnNueve);
        btnNueve.setOnClickListener(this);

        btnSuma = (Button)findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(this);

        btnResta = (Button)findViewById(R.id.btnResta);
        btnResta.setOnClickListener(this);

        btnMult = (Button)findViewById(R.id.btnMult);
        btnMult.setOnClickListener(this);

        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);

        btnPunto = (Button)findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener(this);

        btnSin = (Button)findViewById(R.id.btnSin);
        btnSin.setOnClickListener(this);

        btnCos = (Button)findViewById(R.id.btnCos);
        btnCos.setOnClickListener(this);

        btnTan = (Button)findViewById(R.id.btnTan);
        btnTan.setOnClickListener(this);

        btnLog = (Button)findViewById(R.id.btnLog);
        btnLog.setOnClickListener(this);

        btnRaiz = (Button)findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener(this);

        btnPot = (Button)findViewById(R.id.btnPot);
        btnPot.setOnClickListener(this);

        btnIgual = (Button)findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(this);

        btnBorrar = (Button)findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(this);
    }

    public void regresar(View view){
        Intent i = new Intent(this, Opciones.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        TextView tv1 = (TextView)findViewById(R.id.tvResultado);
        int opcion = v.getId();

        String dato1 = tv1.getText().toString();
        try{
            switch(opcion){
                case R.id.btnCero:
                    tv1.setText(dato1+"0");
                    break;
                case R.id.btnUno:
                    tv1.setText(dato1+"1");
                    break;
                case R.id.btnDos:
                    tv1.setText(dato1+"2");
                    break;
                case R.id.btnTres:
                    tv1.setText(dato1+"3");
                    break;
                case R.id.btnCuatro:
                    tv1.setText(dato1+"4");
                    break;
                case R.id.btnCinco:
                    tv1.setText(dato1+"5");
                    break;
                case R.id.btnSeis:
                    tv1.setText(dato1+"6");
                    break;
                case R.id.btnSiete:
                    tv1.setText(dato1+"7");
                    break;
                case R.id.btnOcho:
                    tv1.setText(dato1+"8");
                    break;
                case R.id.btnNueve:
                    tv1.setText(dato1+"9");
                    break;
                case R.id.btnPunto:
                    if(flotante == false){
                        tv1.setText(dato1+".");
                        flotante=true;
                    }else{
                        return;
                    }
                    break;
                case R.id.btnResta:
                    resta=true;
                    numeros[0]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"-");
                    flotante=false;
                    break;
                case R.id.btnSuma:
                    suma=true;
                    numeros[0]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"+");
                    flotante=false;
                    break;
                case R.id.btnMult:
                    mult=true;
                    numeros[0]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"*");
                    flotante=false;
                    break;
                case R.id.btnDiv:
                    div=true;
                    numeros[0]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"/");
                    flotante=false;
                    break;
                case R.id.btnPot:
                    pot=true;
                    numeros[0]=Double.parseDouble(dato1);
                    numeros[1]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"^");
                    resultado = Math.pow(numeros[0], numeros[1]);
                    tv1.setText(String.valueOf(resultado));
                    flotante=false;
                    break;
                case R.id.btnRaiz:
                    raiz=true;
                    numeros[0]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"√");
                    resultado = Math.sqrt(numeros[0]);
                    tv1.setText(String.valueOf(resultado));
                    flotante=false;
                    break;
                case R.id.btnSin:
                    sen=true;
                    numeros[0]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"Sin");
                    resultado = Math.sqrt(numeros[0]);
                    resultado = Math.sin(numeros[0]*Math.PI/180);
                    flotante=false;
                    break;
                case R.id.btnCos:
                    cos=true;
                    numeros[0]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"Cos");
                    resultado = Math.cos(numeros[0]*Math.PI/180);
                    tv1.setText(String.valueOf(resultado));
                    flotante=false;
                    break;
                case R.id.btnTan:
                    tan=true;
                    numeros[0]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"Tan");
                    resultado = Math.tan(numeros[0]*Math.PI/180);
                    tv1.setText(String.valueOf(resultado));
                    flotante=false;
                    break;
                case R.id.btnLog:
                    log=true;
                    numeros[0]=Double.parseDouble(dato1);
                    tv1.setText(dato1+"Log");
                    resultado = Math.log(numeros[0]);
                    tv1.setText(String.valueOf(resultado));
                    flotante=false;
                    break;
                case R.id.btnIgual:
                    numeros[1]=Double.parseDouble(dato1);
                    if(suma==true){
                        resultado = numeros[0]+numeros[1];
                        tv1.setText(String.valueOf(resultado));
                    }else if(resta==true){
                        resultado = numeros[1]-numeros[2];
                        tv1.setText(String.valueOf(resultado));
                    }else if(mult==true){
                        resultado = numeros[0]*numeros[1];
                        tv1.setText(String.valueOf(resultado));
                    }else if(div==true){
                        resultado = numeros[0]/numeros[1];
                        tv1.setText(String.valueOf(resultado));
                    }
                    flotante=false;
                    suma=false;
                    resta=false;
                    mult=false;
                    div=false;
                    sen=false;
                    cos=false;
                    tan=false;
                    log=false;
                    pot=false;
                    break;
                case R.id.btnBorrar:
                    tv1.setText("");
                    flotante=false;
                    break;
            }
        }catch(Exception ex){
            tv1.setText("Error");
        }
    }
}