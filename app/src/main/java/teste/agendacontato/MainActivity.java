package teste.agendacontato;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.*;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnAdicionar;
    private EditText edtPesquisa;
    private ListView lstContatos;
    private DataBase dataBase;
    private SQLiteDatabase conn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdicionar = (ImageButton)findViewById(R.id.btnAdicionar);
        edtPesquisa = (EditText)findViewById(R.id.edtpesquisa);
        lstContatos = (ListView)findViewById(R.id.lstContatos);
       try {
           dataBase = new DataBase(this);
           conn = new dataBase.getReadableDatabase();

           AlertDialog.Builder dlg= new AlertDialog.Builder(this);
           dlg.setMessage("Successful");
           dlg.setNeutralButton("ok",null);
           dlg.show();

       }catch(SQLException ex)

       {
           AlertDialog.Builder dlg= new AlertDialog.Builder(this);
           dlg.setMessage("Failed" +ex.getMessage());
           dlg.setNeutralButton("ok",null);
           dlg.show();

       }



        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActCadContatos.class);
                startActivity(intent);
                finish();
            }
        });









    }



}
