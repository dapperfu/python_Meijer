package q8;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import i8.w;
import i8.x;
import io.constructor.data.local.PreferencesHelper;
import java.util.Iterator;
import java.util.LinkedList;
import q8.C16611b;
import z8.f;

/* renamed from: q8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16612c extends SQLiteOpenHelper {

    /* renamed from: d, reason: collision with root package name */
    static final int f158065d = w.f137400q.e();

    /* renamed from: e, reason: collision with root package name */
    private static final String f158066e = x.f137411a + "EventsDbHelper";

    /* renamed from: a, reason: collision with root package name */
    private SQLiteStatement f158067a;

    /* renamed from: b, reason: collision with root package name */
    private SQLiteStatement f158068b;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteStatement f158069c;

    public C16612c(Context context) {
        super(context, "DTXDb", (SQLiteDatabase.CursorFactory) null, 10);
        this.f158067a = getWritableDatabase().compileStatement("DELETE FROM Events WHERE session_start + event_start < ?");
        this.f158068b = getWritableDatabase().compileStatement("DELETE FROM Events WHERE session_start + event_start < ? AND event_id <> " + f158065d);
        this.f158069c = getWritableDatabase().compileStatement("DELETE FROM Events WHERE event_id= ? AND id NOT IN (SELECT id FROM Events WHERE event_id= ? ORDER BY (session_start + event_start) DESC LIMIT ?)");
    }

    private void i(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (Exception e10) {
            if (x.f137412b) {
                f.x(f158066e, "could not delete table " + str, e10);
            }
        }
    }

    private void p(SQLiteDatabase sQLiteDatabase, int i10, int i11, String str) throws SQLException {
        if (x.f137412b) {
            f.u(f158066e, String.format("%s Db.Table(%s.%s) from version %s to %s.", str, "DTXDb", "Events", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        i(sQLiteDatabase, "Events");
        onCreate(sQLiteDatabase);
    }

    public void b(long j10, boolean z10) {
        SQLiteStatement sQLiteStatement = z10 ? this.f158068b : this.f158067a;
        sQLiteStatement.bindLong(1, j10);
        int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
        if (x.f137412b) {
            f.u(f158066e, "Rows deleted: " + iExecuteUpdateDelete);
        }
    }

    public int c(int i10, int i11) {
        long j10 = i10;
        this.f158069c.bindLong(1, j10);
        this.f158069c.bindLong(2, j10);
        this.f158069c.bindLong(3, i11);
        int iExecuteUpdateDelete = this.f158069c.executeUpdateDelete();
        if (x.f137412b) {
            f.u(f158066e, "Rows deleted: " + iExecuteUpdateDelete);
        }
        return iExecuteUpdateDelete;
    }

    public Cursor j() {
        return l(0L);
    }

    public Cursor l(long j10) {
        String[] strArr = {PreferencesHelper.PREF_ID, "visitor_id", PreferencesHelper.SESSION_ID, "sequence_nr", "basic_segment", "event_segment", "event_id", "session_start", "event_start", "multiplicity", "server_id", "app_id", "sr_param"};
        return getReadableDatabase().query(true, "Events", strArr, "id >= " + j10, null, null, null, "visitor_id ASC, session_id ASC, sequence_nr ASC, server_id ASC, id ASC", null);
    }

    public void m(LinkedList<C16611b.a> linkedList) {
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        Iterator<C16611b.a> it = linkedList.iterator();
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            while (it.hasNext()) {
                try {
                    C16611b.a next = it.next();
                    p8.b bVar = next.f158060c;
                    int i10 = bVar.f156196e;
                    if (i10 == -1) {
                        i10 = 1;
                    }
                    if (bVar.m()) {
                        p8.b bVar2 = next.f158060c;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("visitor_id", Long.valueOf(bVar2.f156193b));
                        contentValues.put(PreferencesHelper.SESSION_ID, Integer.valueOf(bVar2.f156194c));
                        contentValues.put("sequence_nr", Integer.valueOf(bVar2.f156195d));
                        contentValues.put("basic_segment", next.f158058a);
                        contentValues.put("event_segment", next.f158059b);
                        contentValues.put("event_id", Integer.valueOf(next.f158061d));
                        contentValues.put("session_start", Long.valueOf(bVar2.f156192a));
                        contentValues.put("event_start", Long.valueOf(next.f158062e));
                        contentValues.put("multiplicity", Integer.valueOf(i10));
                        contentValues.put("server_id", Integer.valueOf(next.f158063f));
                        contentValues.put("app_id", next.f158064g);
                        contentValues.put("sr_param", bVar2.f156197f);
                        writableDatabase.insert("Events", null, contentValues);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Exception e10) {
            if (x.f137412b) {
                f.x(f158066e, "Error inserting batch record into database.", e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (x.f137412b) {
            f.u(f158066e, String.format("Creating Db.Table(%s.%s)", "DTXDb", "Events"));
        }
        try {
            sQLiteDatabase.execSQL("CREATE table Events (id INTEGER PRIMARY KEY AUTOINCREMENT, visitor_id INTEGER NOT NULL, session_id INTEGER NOT NULL, sequence_nr INTEGER NOT NULL, basic_segment TEXT NOT NULL, event_segment TEXT NOT NULL, event_id INTEGER NOT NULL, session_start INTEGER NOT NULL, event_start INTEGER NOT NULL, multiplicity INTEGER NOT NULL,server_id INTEGER NOT NULL,app_id TEXT NOT NULL,sr_param TEXT);");
        } catch (Exception e10) {
            if (x.f137412b) {
                f.x(f158066e, "CREATE table Events (id INTEGER PRIMARY KEY AUTOINCREMENT, visitor_id INTEGER NOT NULL, session_id INTEGER NOT NULL, sequence_nr INTEGER NOT NULL, basic_segment TEXT NOT NULL, event_segment TEXT NOT NULL, event_id INTEGER NOT NULL, session_start INTEGER NOT NULL, event_start INTEGER NOT NULL, multiplicity INTEGER NOT NULL,server_id INTEGER NOT NULL,app_id TEXT NOT NULL,sr_param TEXT);", e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        p(sQLiteDatabase, i10, i11, "Downgrading");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        p(sQLiteDatabase, i10, i11, "Upgrading");
    }

    public boolean u(p8.b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("multiplicity", Integer.valueOf(bVar.f156196e));
        contentValues.put("sr_param", bVar.f156197f);
        return getWritableDatabase().update("Events", contentValues, "visitor_id= ? AND session_id= ?", new String[]{String.valueOf(bVar.f156193b), String.valueOf(bVar.f156194c)}) > 0;
    }

    boolean a() {
        if (getWritableDatabase().delete("Events", null, null) > 0) {
            return true;
        }
        return false;
    }

    void d(long j10, int i10) {
        getWritableDatabase().delete("Events", "visitor_id= ? AND session_id= ?", new String[]{String.valueOf(j10), String.valueOf(i10)});
    }

    public void g(String str) {
        getWritableDatabase().delete("Events", "app_id!= ?", new String[]{str});
    }

    void h(long j10, int i10, int i11, int i12, long j11) {
        int iDelete = getWritableDatabase().delete("Events", "visitor_id= ? AND session_id= ? AND sequence_nr= ? AND server_id= ? AND id<= ?", new String[]{String.valueOf(j10), String.valueOf(i10), String.valueOf(i11), String.valueOf(i12), String.valueOf(j11)});
        if (x.f137412b) {
            f.u(f158066e, "Rows removed: " + iDelete);
        }
    }
}
