package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.SyncStateContract;

/**
 * Created by Mrityunjay on 21-05-2017.
 */

public class TableClass extends SQLiteOpenHelper{

    public class Constant {

        public static final String DATABASE_NAME = "data.db";

        public static final int DATABASE_VERSION =1 ;
        public  final  static String KEY_ID="id";
        public  final  static String KEY_TITLE="key_title";
        public  final  static String KEY_DESCRIPTION="key_description";
        public  final  static String KEY_DATE="key_date";
        public  final  static int KEY_STATUS=0;

    }
    Context context;
    public TableClass(Context context, String dataBaseName, String nullColumnHack, int databsaeversion ) {
        super(context, Constant.DATABASE_NAME, null,Constant.DATABASE_VERSION );
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String table1 = "CREATE TABLE IF NOT EXISTS " + Constant.KEY_DATE+ " ("
                + Constant.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Constant.KEY_TITLE + " TEXT, "
                + Constant.KEY_DESCRIPTION+ " TEXT, "+Constant.KEY_STATUS+"0)";

        db.execSQL(table1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        context.deleteDatabase(Constant.DATABASE_NAME);
        onCreate(db);

    }
}
