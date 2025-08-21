package net.zetetic.database.sqlcipher;

import B4.d;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.fullstory.FS;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes14.dex */
public abstract class SQLiteOpenHelper implements d {

    /* renamed from: l, reason: collision with root package name */
    private static final String f152372l = "SQLiteOpenHelper";

    /* renamed from: a, reason: collision with root package name */
    private final Context f152373a;

    /* renamed from: b, reason: collision with root package name */
    private final String f152374b;

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteDatabase.CursorFactory f152375c;

    /* renamed from: d, reason: collision with root package name */
    private final int f152376d;

    /* renamed from: e, reason: collision with root package name */
    private final int f152377e;

    /* renamed from: f, reason: collision with root package name */
    private SQLiteDatabase f152378f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f152379g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f152380h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f152381i;

    /* renamed from: j, reason: collision with root package name */
    private final DatabaseErrorHandler f152382j;

    /* renamed from: k, reason: collision with root package name */
    private final SQLiteDatabaseHook f152383k;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        this(context, str, cursorFactory, i10, null);
    }

    @Override // B4.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SQLiteDatabase C2() {
        SQLiteDatabase sQLiteDatabaseB;
        synchronized (this) {
            sQLiteDatabaseB = b(true);
        }
        return sQLiteDatabaseB;
    }

    @Override // B4.d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f152380h) {
            throw new IllegalStateException("Closed during initialization");
        }
        SQLiteDatabase sQLiteDatabase = this.f152378f;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f152378f.close();
            this.f152378f = null;
        }
    }

    public void d(SQLiteDatabase sQLiteDatabase) {
    }

    public void g(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void h(SQLiteDatabase sQLiteDatabase);

    public void j(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void l(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    @Override // B4.d
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this) {
            try {
                if (this.f152381i != z10) {
                    SQLiteDatabase sQLiteDatabase = this.f152378f;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.f152378f.J()) {
                        if (z10) {
                            this.f152378f.p();
                        } else {
                            this.f152378f.l();
                        }
                    }
                    this.f152381i = z10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, cursorFactory, i10, 0, databaseErrorHandler);
    }

    private static byte[] a(String str) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        ByteBuffer byteBufferEncode = Charset.forName("UTF-8").encode(CharBuffer.wrap(str));
        byte[] bArr = new byte[byteBufferEncode.limit()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    private SQLiteDatabase b(boolean z10) {
        SQLiteDatabase sQLiteDatabase = this.f152378f;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.f152378f = null;
            } else if (!z10 || !this.f152378f.J()) {
                return this.f152378f;
            }
        }
        if (this.f152380h) {
            throw new IllegalStateException("getDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabaseB0 = this.f152378f;
        try {
            this.f152380h = true;
            if (sQLiteDatabaseB0 == null) {
                String path = this.f152374b;
                if (path == null) {
                    sQLiteDatabaseB0 = SQLiteDatabase.h(null);
                } else {
                    try {
                        if (!path.startsWith("file:")) {
                            path = this.f152373a.getDatabasePath(path).getPath();
                        }
                        String str = path;
                        File file = new File(new File(str).getParent());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        sQLiteDatabaseB0 = SQLiteDatabase.b0(str, this.f152379g, this.f152375c, this.f152381i ? 805306368 : 268435456, this.f152382j, this.f152383k);
                    } catch (SQLiteException e10) {
                        if (z10) {
                            throw e10;
                        }
                        FS.log_e(f152372l, "Couldn't open " + this.f152374b + " for writing (will try read-only):", e10);
                        sQLiteDatabaseB0 = SQLiteDatabase.b0(this.f152373a.getDatabasePath(this.f152374b).getPath(), this.f152379g, this.f152375c, 1, this.f152382j, this.f152383k);
                    }
                }
            } else if (z10 && sQLiteDatabaseB0.J()) {
                sQLiteDatabaseB0.m0();
            }
            g(sQLiteDatabaseB0);
            int iB = sQLiteDatabaseB0.B();
            if (iB != this.f152376d) {
                if (sQLiteDatabaseB0.J()) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabaseB0.B() + " to " + this.f152376d + ": " + this.f152374b);
                }
                if (iB > 0 && iB < this.f152377e) {
                    File file2 = new File(sQLiteDatabaseB0.getPath());
                    d(sQLiteDatabaseB0);
                    sQLiteDatabaseB0.close();
                    if (SQLiteDatabase.j(file2)) {
                        this.f152380h = false;
                        SQLiteDatabase sQLiteDatabaseB = b(z10);
                        this.f152380h = false;
                        if (sQLiteDatabaseB0 != this.f152378f) {
                            sQLiteDatabaseB0.close();
                        }
                        return sQLiteDatabaseB;
                    }
                    throw new IllegalStateException("Unable to delete obsolete database " + this.f152374b + " with version " + iB);
                }
                sQLiteDatabaseB0.n();
                try {
                    if (iB == 0) {
                        h(sQLiteDatabaseB0);
                    } else {
                        int i10 = this.f152376d;
                        if (iB > i10) {
                            i(sQLiteDatabaseB0, iB, i10);
                        } else {
                            l(sQLiteDatabaseB0, iB, i10);
                        }
                    }
                    sQLiteDatabaseB0.n0(this.f152376d);
                    sQLiteDatabaseB0.q();
                    sQLiteDatabaseB0.r();
                } catch (Throwable th2) {
                    sQLiteDatabaseB0.r();
                    throw th2;
                }
            }
            j(sQLiteDatabaseB0);
            if (sQLiteDatabaseB0.J()) {
                FS.log_w(f152372l, "Opened " + this.f152374b + " in read-only mode");
            }
            this.f152378f = sQLiteDatabaseB0;
            this.f152380h = false;
            return sQLiteDatabaseB0;
        } finally {
        }
    }

    @Override // B4.d
    /* renamed from: getDatabaseName */
    public String getName() {
        return this.f152374b;
    }

    public void i(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        throw new SQLiteException("Can't downgrade database from version " + i10 + " to " + i11);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, int i11, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, new byte[0], cursorFactory, i10, i11, databaseErrorHandler, (SQLiteDatabaseHook) null, false);
    }

    public SQLiteOpenHelper(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i10, int i11, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z10) {
        this(context, str, a(str2), cursorFactory, i10, i11, databaseErrorHandler, sQLiteDatabaseHook, z10);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i10, int i11, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z10) {
        if (i10 >= 1) {
            this.f152373a = context;
            this.f152374b = str;
            this.f152379g = bArr;
            this.f152375c = cursorFactory;
            this.f152376d = i10;
            this.f152382j = databaseErrorHandler;
            this.f152383k = sQLiteDatabaseHook;
            this.f152381i = z10;
            this.f152377e = Math.max(0, i11);
            return;
        }
        throw new IllegalArgumentException("Version must be >= 1, was " + i10);
    }
}
