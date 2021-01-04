package edu.upc.dsa.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double valorSumado = 0, resultado, valorTrigo;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSuma, btnResta, btnMulti, btnDivi, btnBorrar, btnIgual, btnSin, btnCos, btnTan;
    private TextView textDisplay;
    private String mostrar, operador, operadorTrigo, checkedTrigonometria;
    private boolean primeraOperacion = true;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnSin = (Button) findViewById(R.id.btnSin);
        btnCos = (Button) findViewById(R.id.btnCos);
        btnTan = (Button) findViewById(R.id.btnTan);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDivi = (Button) findViewById(R.id.btnDivi);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        textDisplay = (TextView) findViewById(R.id.textDisplay);
    }

    public void btn1Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "1";
        textDisplay.setText(mostrar);
    }

    public void btn2Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "2";
        textDisplay.setText(mostrar);
    }

    public void btn3Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "3";
        textDisplay.setText(mostrar);
    }

    public void btn4Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "4";
        textDisplay.setText(mostrar);
    }

    public void btn5Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "5";
        textDisplay.setText(mostrar);
    }

    public void btn6Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "6";
        textDisplay.setText(mostrar);
    }

    public void btn7Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "7";
        textDisplay.setText(mostrar);
    }

    public void btn8Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "8";
        textDisplay.setText(mostrar);
    }

    public void btn9Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "9";
        textDisplay.setText(mostrar);
    }

    public void btn0Clicked(View v){
        mostrar = textDisplay.getText().toString();
        mostrar = mostrar + "0";
        textDisplay.setText(mostrar);
    }

    public void btnSinClicked(View v){
        mostrar = textDisplay.getText().toString();
        if(checkedTrigonometria == "radiantes"){
            valorTrigo = Math.sin((Double.parseDouble(mostrar)));
            textDisplay.setText(String.valueOf(valorTrigo));
            operadorTrigo = "sin";
        }
        else{
            valorTrigo = Math.sin(Math.toRadians((Double.parseDouble(mostrar))));
            textDisplay.setText(String.valueOf(valorTrigo));
            operadorTrigo = "sin";
        }
    }

    public void btnCosClicked(View v){
        mostrar = textDisplay.getText().toString();
        valorTrigo = Math.cos((Double.parseDouble(mostrar)));
        textDisplay.setText(String.valueOf(valorTrigo));
        operadorTrigo = "cos";
    }

    public void btnTanClicked(View v){
        mostrar = textDisplay.getText().toString();
        valorTrigo = Math.tan((Double.parseDouble(mostrar)));
        textDisplay.setText((String.valueOf(valorTrigo)));
        operadorTrigo = "tan";
    }

    public void btnSumaClicked(View v){
        mostrar = textDisplay.getText().toString();
        if (primeraOperacion == true){
            valorSumado = Double.parseDouble(mostrar);
        }
        else
            calculo(operador);

        textDisplay.setText("");
        primeraOperacion = false;
        operador = "suma";
    }

    public void btnRestaClicked(View v){
        mostrar = textDisplay.getText().toString();
        if (primeraOperacion == true) {
            valorSumado = Double.parseDouble(mostrar);
        }
        else
            calculo(operador);

        textDisplay.setText("");
        primeraOperacion = false;
        operador = "resta";
    }

    public void BtnMultiClicked(View v){
        mostrar = textDisplay.getText().toString();
        if(valorSumado == 0){
            valorSumado = 1;
        }
        if (primeraOperacion == true){
            valorSumado = Double.parseDouble(mostrar);
        }
        else
            calculo(operador);

        textDisplay.setText("");
        primeraOperacion = false;
        operador = "multiplicar";
    }

    public void btnDiviClicked(View v){
        mostrar = textDisplay.getText().toString();
        if(valorSumado == 0){
            valorSumado = 1;
        }
        if(primeraOperacion == true){
            valorSumado = valorSumado / Double.parseDouble(mostrar);
        }
        else
            calculo(operador);

        textDisplay.setText("");
        primeraOperacion = false;
        operador = "dividir";
    }

    public void btnBorrarClicked(View v){
        textDisplay.setText("");
        valorSumado = 0;
        mostrar = "";
        primeraOperacion = true;
        operador = "";
    }

    public void btnIgualClicked(View v){
        mostrar = textDisplay.getText().toString();
        if(operador == "suma"){
            resultado = Double.parseDouble(mostrar) + valorSumado;
        }
        else if(operador == "resta"){
            resultado = Double.parseDouble(mostrar) - valorSumado;
        }
        else if(operador == "multiplicar"){
            resultado = Double.parseDouble(mostrar) * valorSumado;
        }
        else if(operador == "dividir"){
            resultado = Double.parseDouble(mostrar) / valorSumado;
        }
        else if (((operadorTrigo == "sin") || (operadorTrigo == "cos") || (operadorTrigo == "tan")) && (primeraOperacion == true)){
            resultado = valorTrigo;
        }
        textDisplay.setText(String.valueOf(resultado));
    }

    public void calculo(String opera){
        if(primeraOperacion == false){
            mostrar = textDisplay.getText().toString();
            switch (opera){
                case "suma":
                    valorSumado = valorSumado + Double.parseDouble(mostrar);
                    break;
                case "resta":
                    valorSumado = valorSumado - Double.parseDouble(mostrar);
                    break;
                case "multiplicar":
                    valorSumado = valorSumado * Double.parseDouble(mostrar);
                    break;
                case "dividir":
                    valorSumado = valorSumado / Double.parseDouble(mostrar);
                    break;
            }
        }
    }

    public void onRadioBtn(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.btnDegrees:
                if (checked)
                    checkedTrigonometria = "degress";// Pirates are the best
                break;
            case R.id.btnRadians:
                if (checked)
                    checkedTrigonometria = "radianes";// Ninjas rule
                break;
        }
    }
}
