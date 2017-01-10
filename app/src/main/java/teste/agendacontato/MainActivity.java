package teste.agendacontato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnAdicionar;
    private EditText edtPesquisa;
    private ListView lstContatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdicionar = (ImageButton)findViewById(R.id.btnAdicionar);
        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActCadContatos.class);
                startActivity(intent);
                finish();
            }
        });

        edtPesquisa = (EditText)findViewById(R.id.edtpesquisa);
        lstContatos = (ListView)findViewById(R.id.lstContatos);







    }



}
