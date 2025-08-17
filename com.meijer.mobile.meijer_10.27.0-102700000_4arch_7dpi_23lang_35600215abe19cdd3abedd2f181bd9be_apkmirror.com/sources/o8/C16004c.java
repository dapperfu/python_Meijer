package o8;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import g8.w;
import g8.x;
import io.constructor.data.local.PreferencesHelper;
import java.util.Iterator;
import java.util.LinkedList;
import o8.C16003b;
import x8.f;

/* renamed from: o8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16004c extends SQLiteOpenHelper {

    /* renamed from: d, reason: collision with root package name */
    static final int f153213d = w.f133184q.e();

    /* renamed from: e, reason: collision with root package name */
    private static final String f153214e = x.f133195a + "EventsDbHelper";

    /* renamed from: a, reason: collision with root package name */
    private SQLiteStatement f153215a;

    /* renamed from: b, reason: collision with root package name */
    private SQLiteStatement f153216b;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteStatement f153217c;

    public C16004c(Context context) {
        super(context, "DTXDb", (SQLiteDatabase.CursorFactory) null, 10);
        this.f153215a = getWritableDatabase().compileStatement("DELETE FROM Events WHERE session_start + event_start < ?");
        this.f153216b = getWritableDatabase().compileStatement("DELETE FROM Events WHERE session_start + event_start < ? AND event_id <> " + f153213d);
        this.f153217c = getWritableDatabase().compileStatement("DELETE FROM Events WHERE event_id= ? AND id NOT IN (SELECT id FROM Events WHERE event_id= ? ORDER BY (session_start + event_start) DESC LIMIT ?)");
    }

    private void i(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (Exception e10) {
            if (x.f133196b) {
                f.x(f153214e, "could not delete table " + str, e10);
            }
        }
    }

    private void p(SQLiteDatabase sQLiteDatabase, int i10, int i11, String str) throws SQLException {
        if (x.f133196b) {
            f.u(f153214e, String.format("%s Db.Table(%s.%s) from version %s to %s.", str, "DTXDb", "Events", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        i(sQLiteDatabase, "Events");
        onCreate(sQLiteDatabase);
    }

    public void b(long j10, boolean z10) {
        SQLiteStatement sQLiteStatement = z10 ? this.f153216b : this.f153215a;
        sQLiteStatement.bindLong(1, j10);
        int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
        if (x.f133196b) {
            f.u(f153214e, "Rows deleted: " + iExecuteUpdateDelete);
        }
    }

    public int c(int i10, int i11) {
        long j10 = i10;
        this.f153217c.bindLong(1, j10);
        this.f153217c.bindLong(2, j10);
        this.f153217c.bindLong(3, i11);
        int iExecuteUpdateDelete = this.f153217c.executeUpdateDelete();
        if (x.f133196b) {
            f.u(f153214e, "Rows deleted: " + iExecuteUpdateDelete);
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

    public void m(LinkedList<C16003b.a> linkedList) {
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        Iterator<C16003b.a> it = linkedList.iterator();
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            while (it.hasNext()) {
                try {
                    C16003b.a next = it.next();
                    n8.b bVar = next.f153208c;
                    int i10 = bVar.f151065e;
                    if (i10 == -1) {
                        i10 = 1;
                    }
                    if (bVar.m()) {
                        n8.b bVar2 = next.f153208c;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("visitor_id", Long.valueOf(bVar2.f151062b));
                        contentValues.put(PreferencesHelper.SESSION_ID, Integer.valueOf(bVar2.f151063c));
                        contentValues.put("sequence_nr", Integer.valueOf(bVar2.f151064d));
                        contentValues.put("basic_segment", next.f153206a);
                        contentValues.put("event_segment", next.f153207b);
                        contentValues.put("event_id", Integer.valueOf(next.f153209d));
                        contentValues.put("session_start", Long.valueOf(bVar2.f151061a));
                        contentValues.put("event_start", Long.valueOf(next.f153210e));
                        contentValues.put("multiplicity", Integer.valueOf(i10));
                        contentValues.put("server_id", Integer.valueOf(next.f153211f));
                        contentValues.put("app_id", next.f153212g);
                        contentValues.put("sr_param", bVar2.f151066f);
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
            if (x.f133196b) {
                f.x(f153214e, "Error inserting batch record into database.", e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (x.f133196b) {
            f.u(f153214e, String.format("Creating Db.Table(%s.%s)", "DTXDb", "Events"));
        }
        try {
            sQLiteDatabase.execSQL("CREATE table Events (id INTEGER PRIMARY KEY AUTOINCREMENT, visitor_id INTEGER NOT NULL, session_id INTEGER NOT NULL, sequence_nr INTEGER NOT NULL, basic_segment TEXT NOT NULL, event_segment TEXT NOT NULL, event_id INTEGER NOT NULL, session_start INTEGER NOT NULL, event_start INTEGER NOT NULL, multiplicity INTEGER NOT NULL,server_id INTEGER NOT NULL,app_id TEXT NOT NULL,sr_param TEXT);");
        } catch (Exception e10) {
            if (x.f133196b) {
                f.x(f153214e, "CREATE table Events (id INTEGER PRIMARY KEY AUTOINCREMENT, visitor_id INTEGER NOT NULL, session_id INTEGER NOT NULL, sequence_nr INTEGER NOT NULL, basic_segment TEXT NOT NULL, event_segment TEXT NOT NULL, event_id INTEGER NOT NULL, session_start INTEGER NOT NULL, event_start INTEGER NOT NULL, multiplicity INTEGER NOT NULL,server_id INTEGER NOT NULL,app_id TEXT NOT NULL,sr_param TEXT);", e10);
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

    public boolean u(n8.b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("multiplicity", Integer.valueOf(bVar.f151065e));
        contentValues.put("sr_param", bVar.f151066f);
        return getWritableDatabase().update("Events", contentValues, "visitor_id= ? AND session_id= ?", new String[]{String.valueOf(bVar.f151062b), String.valueOf(bVar.f151063c)}) > 0;
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
        if (x.f133196b) {
            f.u(f153214e, "Rows removed: " + iDelete);
        }
    }
}
