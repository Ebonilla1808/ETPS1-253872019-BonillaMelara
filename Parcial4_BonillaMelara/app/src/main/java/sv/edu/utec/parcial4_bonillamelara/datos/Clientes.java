package sv.edu.utec.parcial4_bonillamelara.datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import sv.edu.utec.parcial4_bonillamelara.entidades.EntClientes;

public class Clientes extends BaseHelper{

    Context contex;
    public Clientes(@Nullable Context context) {
        super(context);
    }

    public long insertar(String sNombreCliente,String sApellidosCliente, String sDireccionClientes, String sCiudadCliente){

        long codigo=0;
        try {

            BaseHelper baseHelp = new BaseHelper(contex);
            SQLiteDatabase bd = baseHelp.getWritableDatabase();

            ContentValues valoresProv = new ContentValues();
            valoresProv.put("sNombreCliente", sNombreCliente);
            valoresProv.put("sApellidosCliente", sApellidosCliente);
            valoresProv.put("sDireccionClientes", sDireccionClientes);
            valoresProv.put("sCiudadCliente", sCiudadCliente);

            codigo= bd.insert(NOMBRE_TABLACL, null, valoresProv);
            return codigo;
        }
        catch (Exception ex){
            ex.toString();
            return codigo=0;
        }

    }

    public ArrayList<EntClientes> mostrar(){
        BaseHelper baseHelp = new BaseHelper(contex);
        SQLiteDatabase bd = baseHelp.getWritableDatabase();
        ArrayList<EntClientes>listaProvedores=new ArrayList<>();
        EntClientes entClientes=null;
        Cursor cursor;

        cursor=bd.rawQuery("SELECT * from "+NOMBRE_TABLACL,null);
        if(cursor.moveToFirst())
        {
            do{
                entClientes= new EntClientes();
                entClientes.setID_Cliente(cursor.getInt(0));
                entClientes.setsNombreCliente(cursor.getString(1));
                entClientes.setsApellidosCliente(cursor.getString(2));
                entClientes.setsDireccionClientes(cursor.getString(3));
                entClientes.setsCiudadCliente(cursor.getString(4));
                listaProvedores.add(entClientes);
            }
            while(cursor.moveToNext());
        }
        cursor.close();
        return listaProvedores;
    }

}
