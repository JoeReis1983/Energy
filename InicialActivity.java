package reis.joe.energy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class InicialActivity extends AppCompatActivity {

    public Dados dados = new Dados();
    public Spinner sp_estados;
    public Button btn_avancar;
    public String estadoSelecionado;
    public Intent i = new Intent();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        getSupportActionBar().setTitle("Calculadora de consumo elétrico");
        sp_estados = findViewById(R.id.id_sp_Estados);
        btn_avancar=findViewById(R.id.id_bt_Avancar);
        final String estados[]= dados.TodosEstado();


        ArrayAdapter<String> adapterEstados = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,estados);
        sp_estados.setAdapter(adapterEstados);
        sp_estados.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               estadoSelecionado=estados[position];

           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }});
        btn_avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(v.getContext(),CalculoActivity.class);

                i.putExtra("z",estadoSelecionado);


               startActivity(i);
            }
        });




    }
}
