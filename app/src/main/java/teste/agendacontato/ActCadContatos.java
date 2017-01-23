package teste.agendacontato;

import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;
@RequiresApi(api = Build.VERSION_CODES.M)
public class ActCadContatos extends AppCompatActivity
{
    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtTelefone;
    private EditText edtEndereco;
    private EditText edtDatasEspeciais;
    private EditText edtGrupos;


    private Spinner spnTipoEmail;
    private Spinner spnTipoTelefone;
    private Spinner spnTipoEndereco;
    private Spinner spnTipoDatasEspeciais;

    private ArrayAdapter<String> adtTipoEmail;
    private ArrayAdapter<String> adtTipoEndereco;
    private ArrayAdapter<String> adtTipoTelefone;
    private ArrayAdapter<String> adtTipoDatasEspeciais;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cad_contatos);


       /* edtNome=(EditText)findViewById(R.id.edtNome);
        edtEndereco=(EditText)findViewById(R.id.edtEndereco);
        edtEmail=(EditText)findViewById(R.id.edtEmail);
        edtDatasEspeciais=(EditText)findViewById(R.id.edtDatasEspeciais);
        edtGrupos=(EditText)findViewById(R.id.edtGrupos);  esse pedaco ta fazendo crashar  */

        spnTipoEmail=(Spinner)findViewById(R.id.spnTipoEmail);
        spnTipoTelefone=(Spinner)findViewById(R.id.spnTipotelefone);
        spnTipoEndereco=(Spinner)findViewById(R.id.spnTipoEndereco);
        spnTipoDatasEspeciais=(Spinner)findViewById(R.id.spnDatasEspeciais);


        adtTipoEmail= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
        adtTipoTelefone= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
        adtTipoEndereco= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
        adtTipoDatasEspeciais= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);

        adtTipoEmail.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adtTipoEndereco.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adtTipoTelefone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adtTipoDatasEspeciais.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);



        spnTipoEmail.setAdapter(adtTipoEmail);
        spnTipoEndereco.setAdapter(adtTipoEndereco);
        spnTipoTelefone.setAdapter(adtTipoTelefone);
        spnTipoDatasEspeciais.setAdapter(adtTipoDatasEspeciais);


        adtTipoEmail.add("Casa");
        adtTipoEmail.add("Trabalho");
        adtTipoEmail.add("Outros");


        adtTipoTelefone.add("Celular");
        adtTipoTelefone.add("Casa");
        adtTipoTelefone.add("Trabalho");
        adtTipoTelefone.add("Outros...?");

        adtTipoEndereco.add("Casa");
        adtTipoEndereco.add("Trabalho");
        adtTipoEndereco.add("Outros");


        adtTipoDatasEspeciais.add("Birthday");
        adtTipoDatasEspeciais.add("Data comemorativa");
        adtTipoDatasEspeciais.add("outros");






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu_act_cad_contatos,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())

        {
                case R.id.mni_acao1:

                break;

                case R.id.mni_acao2:

                break;


        }



        return super.onOptionsItemSelected(item);
    }
}
