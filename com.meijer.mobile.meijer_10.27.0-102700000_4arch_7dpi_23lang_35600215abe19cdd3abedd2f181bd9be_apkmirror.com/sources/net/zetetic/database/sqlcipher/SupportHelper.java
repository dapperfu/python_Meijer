package net.zetetic.database.sqlcipher;

import A4.c;
import A4.d;

/* loaded from: classes13.dex */
public class SupportHelper implements d {

    /* renamed from: a, reason: collision with root package name */
    private SQLiteOpenHelper f151403a;

    public SupportHelper(d.b bVar, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z10) {
        this(bVar, bArr, sQLiteDatabaseHook, z10, 0);
    }

    public SupportHelper(final d.b bVar, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z10, int i10) {
        this.f151403a = new SQLiteOpenHelper(bVar.context, bVar.name, bArr, null, bVar.callback.version, i10, null, sQLiteDatabaseHook, z10) { // from class: net.zetetic.database.sqlcipher.SupportHelper.1
            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void g(SQLiteDatabase sQLiteDatabase) {
                bVar.callback.b(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void h(SQLiteDatabase sQLiteDatabase) {
                bVar.callback.d(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void i(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
                bVar.callback.e(sQLiteDatabase, i11, i12);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void j(SQLiteDatabase sQLiteDatabase) {
                bVar.callback.f(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void l(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
                bVar.callback.g(sQLiteDatabase, i11, i12);
            }
        };
    }

    @Override // A4.d
    public c D2() {
        return this.f151403a.D2();
    }

    @Override // A4.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f151403a.close();
    }

    @Override // A4.d
    public String getDatabaseName() {
        return this.f151403a.getDatabaseName();
    }

    @Override // A4.d
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f151403a.setWriteAheadLoggingEnabled(z10);
    }
}
