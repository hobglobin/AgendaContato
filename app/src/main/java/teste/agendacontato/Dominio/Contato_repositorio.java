package teste.agendacontato.Dominio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;

/**
 * Created by LuizFilipeFerreira on 1/23/2017.
 */

public class Contato_repositorio {

    private SQLiteDatabase conn;

    public Contato_repositorio(SQLiteDatabase conn)
    {
        this.conn= conn;
    }
    public void testeInserircontatos(){
        for (int i = 0; i<10;i++);
        ContentValues value = new ContentValues();
        value.put("TELEFONE","9090");

        conn.insertOrThrow("CONTATO",null,value);
    }

public ArrayAdapter<String> buscacontatos(Context context)
{
ArrayAdapter<String> adpContatos = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1);

    Cursor cursor = conn.query("CONTATO",null,null,null,null,null,null);

    if (cursor.getCount()>0)

    {

        cursor.moveToFirst();
        do {


            String Telefone = cursor.getString(1);
            adpContatos.add(Telefone);
        }while (cursor.moveToNext());

    }
    return adpContatos;



}










}
