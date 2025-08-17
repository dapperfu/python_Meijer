package net.zetetic.database.sqlcipher;

import android.database.Cursor;
import android.os.CancellationSignal;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes13.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f151356a;

    /* renamed from: b, reason: collision with root package name */
    private final String f151357b;

    /* renamed from: c, reason: collision with root package name */
    private final String f151358c;

    /* renamed from: d, reason: collision with root package name */
    private final CancellationSignal f151359d;

    /* renamed from: e, reason: collision with root package name */
    private SQLiteQuery f151360e;

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
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.f151356a, this.f151358c, this.f151359d);
        try {
            sQLiteQuery.h(strArr);
            Cursor sQLiteCursor = cursorFactory == null ? new SQLiteCursor(this, this.f151357b, sQLiteQuery) : cursorFactory.a(this.f151356a, this, this.f151357b, sQLiteQuery);
            this.f151360e = sQLiteQuery;
            return sQLiteCursor;
        } catch (RuntimeException e10) {
            sQLiteQuery.close();
            throw e10;
        }
    }

    public Cursor b(SQLiteDatabase.CursorFactory cursorFactory, Object... objArr) {
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.f151356a, this.f151358c, this.f151359d);
        try {
            sQLiteQuery.g(objArr);
            Cursor sQLiteCursor = cursorFactory == null ? new SQLiteCursor(this, this.f151357b, sQLiteQuery) : cursorFactory.a(this.f151356a, this, this.f151357b, sQLiteQuery);
            this.f151360e = sQLiteQuery;
            return sQLiteCursor;
        } catch (RuntimeException e10) {
            sQLiteQuery.close();
            throw e10;
        }
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.f151358c;
    }

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.f151356a = sQLiteDatabase;
        this.f151357b = str2;
        this.f151358c = str;
        this.f151359d = cancellationSignal;
    }
}
