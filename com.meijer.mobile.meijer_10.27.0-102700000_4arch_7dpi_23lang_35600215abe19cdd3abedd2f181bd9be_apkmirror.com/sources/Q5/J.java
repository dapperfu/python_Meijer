package Q5;

import L5.m;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes4.dex */
final class J implements InterfaceC5073e {

    /* renamed from: a, reason: collision with root package name */
    private final String f29782a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29783b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29784c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Object f29785d = new Object();

    @Override // Q5.InterfaceC5073e
    public List<C5072d> a(final int i10) {
        if (i10 <= 0) {
            t.f("Services", this.f29782a, "peek n - Returning null, n <= 0.", new Object[0]);
            return null;
        }
        final ArrayList<ContentValues> arrayList = new ArrayList();
        synchronized (this.f29785d) {
            try {
                if (this.f29784c) {
                    t.f("Services", this.f29782a, "peek n - Returning null, DataQueue is closed.", new Object[0]);
                    return null;
                }
                L5.m.f(this.f29783b, m.a.READ_ONLY, new L5.d() { // from class: Q5.H
                    @Override // L5.d
                    public final boolean a(SQLiteDatabase sQLiteDatabase) {
                        return J.e(this.f29777a, i10, arrayList, sQLiteDatabase);
                    }
                });
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (ContentValues contentValues : arrayList) {
                    arrayList2.add(new C5072d(contentValues.getAsString("uniqueIdentifier"), new Date(contentValues.getAsLong("timestamp").longValue()), contentValues.getAsString("data")));
                }
                t.e("Services", this.f29782a, String.format("peek n - Successfully returned %d DataEntities", Integer.valueOf(arrayList2.size())), new Object[0]);
                return arrayList2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Q5.InterfaceC5073e
    public boolean b(C5072d c5072d) {
        if (c5072d == null) {
            t.a("Services", this.f29782a, "add - Returning false, DataEntity is null.", new Object[0]);
            return false;
        }
        synchronized (this.f29785d) {
            try {
                if (this.f29784c) {
                    t.a("Services", this.f29782a, "add - Returning false, DataQueue is closed.", new Object[0]);
                    return false;
                }
                boolean zI = i(c5072d);
                if (!zI) {
                    h();
                    zI = i(c5072d);
                }
                return zI;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean g(final int i10) {
        if (i10 <= 0) {
            t.a("Services", this.f29782a, "remove n - Returning false, n <= 0", new Object[0]);
            return false;
        }
        synchronized (this.f29785d) {
            try {
                if (this.f29784c) {
                    t.f("Services", this.f29782a, "remove n - Returning false, DataQueue is closed", new Object[0]);
                    return false;
                }
                boolean zF = L5.m.f(this.f29783b, m.a.READ_WRITE, new L5.d() { // from class: Q5.I
                    @Override // L5.d
                    public final boolean a(SQLiteDatabase sQLiteDatabase) {
                        return J.c(this.f29780a, i10, sQLiteDatabase);
                    }
                });
                if (!zF) {
                    h();
                }
                return zF;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Q5.InterfaceC5073e
    public C5072d peek() {
        List<C5072d> listA = a(1);
        if (listA == null) {
            t.a("Services", this.f29782a, "peek - Unable to fetch DataEntity, returning null", new Object[0]);
            return null;
        }
        if (listA.isEmpty()) {
            t.a("Services", this.f29782a, "peek - 0 DataEntities fetch, returning null", new Object[0]);
            return null;
        }
        t.e("Services", this.f29782a, String.format("peek - Successfully returned DataEntity (%s)", listA.get(0).toString()), new Object[0]);
        return listA.get(0);
    }

    @Override // Q5.InterfaceC5073e
    public boolean remove() {
        return g(1);
    }

    private void f() {
        synchronized (this.f29785d) {
            try {
                if (L5.m.c(this.f29783b, "CREATE TABLE IF NOT EXISTS TB_AEP_DATA_ENTITY (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, uniqueIdentifier TEXT NOT NULL UNIQUE, timestamp INTEGER NOT NULL, data TEXT);")) {
                    t.e("Services", this.f29782a, "createTableIfNotExists - Successfully created/already existed table.", new Object[0]);
                } else {
                    t.f("Services", this.f29782a, "createTableIfNotExists - Error creating/accessing table.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void h() {
        t.f("Services", this.f29782a, "resetDatabase - Resetting database (%s) as it is corrupted", this.f29783b);
        try {
            L5.g.b(new File(this.f29783b), false);
            f();
        } catch (Exception unused) {
            t.f("Services", this.f29782a, "resetDatabase - Error resetting database (%s)  ", this.f29783b);
        }
    }

    private boolean i(final C5072d c5072d) {
        return L5.m.f(this.f29783b, m.a.READ_WRITE, new L5.d() { // from class: Q5.G
            @Override // L5.d
            public final boolean a(SQLiteDatabase sQLiteDatabase) {
                return J.d(this.f29775a, c5072d, sQLiteDatabase);
            }
        });
    }

    @Override // Q5.InterfaceC5073e
    public boolean clear() {
        synchronized (this.f29785d) {
            try {
                if (this.f29784c) {
                    t.f("Services", this.f29782a, "clear - Returning false, DataQueue is closed", new Object[0]);
                    return false;
                }
                boolean zA = L5.m.a(this.f29783b, "TB_AEP_DATA_ENTITY");
                t.e("Services", this.f29782a, String.format("clear - %s in clearing table", zA ? "Successful" : "Failed"), new Object[0]);
                if (!zA) {
                    h();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Q5.InterfaceC5073e
    public void close() {
        synchronized (this.f29785d) {
            this.f29784c = true;
        }
    }

    @Override // Q5.InterfaceC5073e
    public int count() {
        synchronized (this.f29785d) {
            try {
                if (this.f29784c) {
                    t.f("Services", this.f29782a, "count - Returning 0, DataQueue is closed", new Object[0]);
                    return 0;
                }
                return L5.m.d(this.f29783b, "TB_AEP_DATA_ENTITY");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    J(String str, String str2) {
        this.f29782a = "SQLiteDataQueue-" + str;
        this.f29783b = str2;
        f();
    }

    public static /* synthetic */ boolean c(J j10, int i10, SQLiteDatabase sQLiteDatabase) throws SQLException {
        boolean z10;
        j10.getClass();
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("DELETE FROM TB_AEP_DATA_ENTITY WHERE id in (SELECT id from TB_AEP_DATA_ENTITY order by id ASC limit " + i10 + ')');
            try {
                int iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
                t.e("Services", j10.f29782a, String.format("remove n - Removed %d DataEntities", Integer.valueOf(iExecuteUpdateDelete)), new Object[0]);
                if (iExecuteUpdateDelete > -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sQLiteStatementCompileStatement.close();
                return z10;
            } finally {
            }
        } catch (SQLiteException e10) {
            t.f("Services", j10.f29782a, String.format("removeRows - Error in deleting rows from table. Returning 0. Error: (%s)", e10.getMessage()), new Object[0]);
            return false;
        }
    }

    public static /* synthetic */ boolean d(J j10, C5072d c5072d, SQLiteDatabase sQLiteDatabase) throws SQLException {
        String strA;
        j10.getClass();
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("INSERT INTO TB_AEP_DATA_ENTITY (uniqueIdentifier, timestamp, data) VALUES (?, ?, ?)");
            try {
                boolean z10 = true;
                sQLiteStatementCompileStatement.bindString(1, c5072d.c());
                sQLiteStatementCompileStatement.bindLong(2, c5072d.b().getTime());
                if (c5072d.a() != null) {
                    strA = c5072d.a();
                } else {
                    strA = "";
                }
                sQLiteStatementCompileStatement.bindString(3, strA);
                if (sQLiteStatementCompileStatement.executeInsert() < 0) {
                    z10 = false;
                }
                sQLiteStatementCompileStatement.close();
                return z10;
            } finally {
            }
        } catch (Exception e10) {
            t.a("Services", j10.f29782a, "add - Returning false: " + e10.getLocalizedMessage(), new Object[0]);
            return false;
        }
    }

    public static /* synthetic */ boolean e(J j10, int i10, List list, SQLiteDatabase sQLiteDatabase) {
        j10.getClass();
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase.query("TB_AEP_DATA_ENTITY", new String[]{"timestamp", "uniqueIdentifier", "data"}, null, null, null, null, "id ASC", String.valueOf(i10));
            try {
                if (cursorQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                        list.add(contentValues);
                    } while (cursorQuery.moveToNext());
                }
                t.e("Services", j10.f29782a, String.format("query - Successfully read %d rows from table.", Integer.valueOf(list.size())), new Object[0]);
                cursorQuery.close();
                return true;
            } finally {
            }
        } catch (SQLiteException e10) {
            t.f("Services", j10.f29782a, String.format("query - Error in querying database table. Error: (%s)", e10.getLocalizedMessage()), new Object[0]);
            return false;
        }
    }
}
