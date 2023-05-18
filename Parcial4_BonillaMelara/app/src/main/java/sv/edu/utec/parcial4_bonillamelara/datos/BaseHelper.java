package sv.edu.utec.parcial4_bonillamelara.datos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BaseHelper extends SQLiteOpenHelper {

    private static final int VERSION_BASEDATOS=1;
    private static final String NOMBRE_BASE="BDClientes.db";
    public static final String NOMBRE_TABLACL="MD_Clientes";
    private static final String NOMBRE_TABLAVL="MD_Vehiculos";
    private static final String NOMBRE_TABLACLVL="MD_ClientesVehiculos";

    public BaseHelper(@Nullable Context context) {
        super(context, NOMBRE_BASE, null, VERSION_BASEDATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+NOMBRE_TABLACL+" ("+
                "ID_Cliente INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                "sNombreCliente TEXT NOT NULL ,"+
                "sApellidosCliente TEXT NOT NULL ,"+
                "sDireccionClientes TEXT NOT NULL ,"+
                "sCiudadCliente TEXT NOT NULL"
                +")");

        db.execSQL("CREATE TABLE "+NOMBRE_TABLAVL+" ("+
                "ID_Vehiculo INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                "sMarca TEXT NOT NULL ,"+
                "sModelo TEXT NOT NULL"
                +")");

        db.execSQL("CREATE TABLE "+NOMBRE_TABLACLVL+" ("+
                "ID_Cliente INTEGER REFERENCES "+NOMBRE_TABLACL+"(ID_Cliente),"+
                "ID_Vehiculo INTEGER REFERENCES "+NOMBRE_TABLAVL+"(ID_Vehiculo),"+
                "sMatricula TEXT NOT NULL,"+
                "iKilometros INTEGER"
                +")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE "+NOMBRE_TABLACL);
        db.execSQL("DROP TABLE "+NOMBRE_TABLAVL);
        db.execSQL("DROP TABLE "+NOMBRE_TABLACLVL);

        onCreate(db);

    }
}
