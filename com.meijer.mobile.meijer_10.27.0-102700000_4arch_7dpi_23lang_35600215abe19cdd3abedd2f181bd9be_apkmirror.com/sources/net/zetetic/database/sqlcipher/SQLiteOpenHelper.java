package net.zetetic.database.sqlcipher;

import A4.d;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.fullstory.FS;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes13.dex */
public abstract class SQLiteOpenHelper implements d {

    /* renamed from: l, reason: collision with root package name */
    private static final String f151363l = "SQLiteOpenHelper";

    /* renamed from: a, reason: collision with root package name */
    private final Context f151364a;

    /* renamed from: b, reason: collision with root package name */
    private final String f151365b;

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteDatabase.CursorFactory f151366c;

    /* renamed from: d, reason: collision with root package name */
    private final int f151367d;

    /* renamed from: e, reason: collision with root package name */
    private final int f151368e;

    /* renamed from: f, reason: collision with root package name */
    private SQLiteDatabase f151369f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f151370g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f151371h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f151372i;

    /* renamed from: j, reason: collision with root package name */
    private final DatabaseErrorHandler f151373j;

    /* renamed from: k, reason: collision with root package name */
    private final SQLiteDatabaseHook f151374k;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        this(context, str, cursorFactory, i10, null);
    }

    @Override // A4.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SQLiteDatabase D2() {
        SQLiteDatabase sQLiteDatabaseB;
        synchronized (this) {
            sQLiteDatabaseB = b(true);
        }
        return sQLiteDatabaseB;
    }

    @Override // A4.d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f151371h) {
            throw new IllegalStateException("Closed during initialization");
        }
        SQLiteDatabase sQLiteDatabase = this.f151369f;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f151369f.close();
            this.f151369f = null;
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

    @Override // A4.d
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this) {
            try {
                if (this.f151372i != z10) {
                    SQLiteDatabase sQLiteDatabase = this.f151369f;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.f151369f.J()) {
                        if (z10) {
                            this.f151369f.p();
                        } else {
                            this.f151369f.l();
                        }
                    }
                    this.f151372i = z10;
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
        SQLiteDatabase sQLiteDatabase = this.f151369f;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.f151369f = null;
            } else if (!z10 || !this.f151369f.J()) {
                return this.f151369f;
            }
        }
        if (this.f151371h) {
            throw new IllegalStateException("getDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabaseC0 = this.f151369f;
        try {
            this.f151371h = true;
            if (sQLiteDatabaseC0 == null) {
                String path = this.f151365b;
                if (path == null) {
                    sQLiteDatabaseC0 = SQLiteDatabase.h(null);
                } else {
                    try {
                        if (!path.startsWith("file:")) {
                            path = this.f151364a.getDatabasePath(path).getPath();
                        }
                        String str = path;
                        File file = new File(new File(str).getParent());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        sQLiteDatabaseC0 = SQLiteDatabase.c0(str, this.f151370g, this.f151366c, this.f151372i ? 805306368 : 268435456, this.f151373j, this.f151374k);
                    } catch (SQLiteException e10) {
                        if (z10) {
                            throw e10;
                        }
                        FS.log_e(f151363l, "Couldn't open " + this.f151365b + " for writing (will try read-only):", e10);
                        sQLiteDatabaseC0 = SQLiteDatabase.c0(this.f151364a.getDatabasePath(this.f151365b).getPath(), this.f151370g, this.f151366c, 1, this.f151373j, this.f151374k);
                    }
                }
            } else if (z10 && sQLiteDatabaseC0.J()) {
                sQLiteDatabaseC0.l0();
            }
            g(sQLiteDatabaseC0);
            int iB = sQLiteDatabaseC0.B();
            if (iB != this.f151367d) {
                if (sQLiteDatabaseC0.J()) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabaseC0.B() + " to " + this.f151367d + ": " + this.f151365b);
                }
                if (iB > 0 && iB < this.f151368e) {
                    File file2 = new File(sQLiteDatabaseC0.getPath());
                    d(sQLiteDatabaseC0);
                    sQLiteDatabaseC0.close();
                    if (SQLiteDatabase.j(file2)) {
                        this.f151371h = false;
                        SQLiteDatabase sQLiteDatabaseB = b(z10);
                        this.f151371h = false;
                        if (sQLiteDatabaseC0 != this.f151369f) {
                            sQLiteDatabaseC0.close();
                        }
                        return sQLiteDatabaseB;
                    }
                    throw new IllegalStateException("Unable to delete obsolete database " + this.f151365b + " with version " + iB);
                }
                sQLiteDatabaseC0.n();
                try {
                    if (iB == 0) {
                        h(sQLiteDatabaseC0);
                    } else {
                        int i10 = this.f151367d;
                        if (iB > i10) {
                            i(sQLiteDatabaseC0, iB, i10);
                        } else {
                            l(sQLiteDatabaseC0, iB, i10);
                        }
                    }
                    sQLiteDatabaseC0.m0(this.f151367d);
                    sQLiteDatabaseC0.q();
                    sQLiteDatabaseC0.r();
                } catch (Throwable th2) {
                    sQLiteDatabaseC0.r();
                    throw th2;
                }
            }
            j(sQLiteDatabaseC0);
            if (sQLiteDatabaseC0.J()) {
                FS.log_w(f151363l, "Opened " + this.f151365b + " in read-only mode");
            }
            this.f151369f = sQLiteDatabaseC0;
            this.f151371h = false;
            return sQLiteDatabaseC0;
        } finally {
        }
    }

    @Override // A4.d
    /* renamed from: getDatabaseName */
    public String getName() {
        return this.f151365b;
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
            this.f151364a = context;
            this.f151365b = str;
            this.f151370g = bArr;
            this.f151366c = cursorFactory;
            this.f151367d = i10;
            this.f151373j = databaseErrorHandler;
            this.f151374k = sQLiteDatabaseHook;
            this.f151372i = z10;
            this.f151368e = Math.max(0, i11);
            return;
        }
        throw new IllegalArgumentException("Version must be >= 1, was " + i10);
    }
}
