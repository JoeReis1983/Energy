package reis.joe.energy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;


public class CalculoActivity extends AppCompatActivity {
    public TextView estado;
    public TextView resultado;
    public Dados dados = new Dados();
    public String fornecedores [];
    public Intent i = getIntent();
    public Spinner spForncedores;
    public String fornecedorSelecionado;
    public Double valorKwh;
    public TextView consumo;
    public Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        getSupportActionBar().setTitle("Calculadora de consumo elétrico");

        estado=findViewById(R.id.id_txt_Estado);
        spForncedores=findViewById(R.id.id_sp_Fornecedores);
        resultado = findViewById(R.id.id_txt_Resultado);
        consumo=findViewById(R.id.id_txt_Kwh);
        btnCalcular=findViewById(R.id.id_bt_Calcular);




        estado.setText("ESTADO: "+getIntent().getStringExtra("z"));
        fornecedores = dados.FornEstados(getIntent().getStringExtra("z"));


        ArrayAdapter<String> adapterForn = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,fornecedores);
         spForncedores.setAdapter(adapterForn);
        spForncedores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fornecedorSelecionado=fornecedores[position];

                valorKwh = dados.precoKwh(getIntent().getStringExtra("z"), fornecedores[position]);
                resultado.setText("R$ ");

                            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Double total = (Double.parseDouble(consumo.getText().toString())/1000) * Double.parseDouble(valorKwh.toString());
                Locale ptBr = new Locale("pt", "BR");
                String result = NumberFormat.getCurrencyInstance(ptBr).format(total);

                resultado.setText(result+" por hora");
            }
        });






    }
}
