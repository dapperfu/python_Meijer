package net.zetetic.database.sqlcipher;

import android.database.Cursor;
import android.os.CancellationSignal;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes14.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f152365a;

    /* renamed from: b, reason: collision with root package name */
    private final String f152366b;

    /* renamed from: c, reason: collision with root package name */
    private final String f152367c;

    /* renamed from: d, reason: collision with root package name */
    private final CancellationSignal f152368d;

    /* renamed from: e, reason: collision with root package name */
    private SQLiteQuery f152369e;

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void cursorClosed() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void cursorDeactivated() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void cursorRequeried(Cursor cursor) {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public Cursor a(SQLiteDatabase.CursorFactory cursorFactory, String[] strArr) {
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.f152365a, this.f152367c, this.f152368d);
        try {
            sQLiteQuery.h(strArr);
            Cursor sQLiteCursor = cursorFactory == null ? new SQLiteCursor(this, this.f152366b, sQLiteQuery) : cursorFactory.a(this.f152365a, this, this.f152366b, sQLiteQuery);
            this.f152369e = sQLiteQuery;
            return sQLiteCursor;
        } catch (RuntimeException e10) {
            sQLiteQuery.close();
            throw e10;
        }
    }

    public Cursor b(SQLiteDatabase.CursorFactory cursorFactory, Object... objArr) {
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.f152365a, this.f152367c, this.f152368d);
        try {
            sQLiteQuery.g(objArr);
            Cursor sQLiteCursor = cursorFactory == null ? new SQLiteCursor(this, this.f152366b, sQLiteQuery) : cursorFactory.a(this.f152365a, this, this.f152366b, sQLiteQuery);
            this.f152369e = sQLiteQuery;
            return sQLiteCursor;
        } catch (RuntimeException e10) {
            sQLiteQuery.close();
            throw e10;
        }
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.f152367c;
    }

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.f152365a = sQLiteDatabase;
        this.f152366b = str2;
        this.f152367c = str;
        this.f152368d = cancellationSignal;
    }
}
