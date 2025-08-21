package net.zetetic.database.sqlcipher;

import B4.c;
import B4.f;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.Looper;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import android.util.Pair;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.DefaultDatabaseErrorHandler;

/* loaded from: classes14.dex */
public final class SQLiteDatabase extends SQLiteClosable implements c {

    /* renamed from: j, reason: collision with root package name */
    private static WeakHashMap<SQLiteDatabase, Object> f152333j = new WeakHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f152334k = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    private final CursorFactory f152336c;

    /* renamed from: d, reason: collision with root package name */
    private final DatabaseErrorHandler f152337d;

    /* renamed from: g, reason: collision with root package name */
    private final SQLiteDatabaseConfiguration f152340g;

    /* renamed from: h, reason: collision with root package name */
    private SQLiteConnectionPool f152341h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f152342i;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal<SQLiteSession> f152335b = new ThreadLocal<SQLiteSession>() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SQLiteSession initialValue() {
            return SQLiteDatabase.this.i();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final Object f152338e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final CloseGuard f152339f = CloseGuard.b();

    /* renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$2, reason: invalid class name */
    class AnonymousClass2 implements SQLiteTransactionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.database.sqlite.SQLiteTransactionListener f152344a;

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onBegin() {
            this.f152344a.onBegin();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onCommit() {
            this.f152344a.onCommit();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onRollback() {
            this.f152344a.onRollback();
        }
    }

    /* renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$3, reason: invalid class name */
    class AnonymousClass3 implements SQLiteTransactionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.database.sqlite.SQLiteTransactionListener f152345a;

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onBegin() {
            this.f152345a.onBegin();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onCommit() {
            this.f152345a.onCommit();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onRollback() {
            this.f152345a.onRollback();
        }
    }

    public interface CursorFactory {
        Cursor a(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    public interface CustomFunction {
        void a(String[] strArr);
    }

    public static SQLiteDatabase T(String str, CursorFactory cursorFactory, int i10) {
        return Y(str, cursorFactory, i10, null);
    }

    public static SQLiteDatabase Y(String str, CursorFactory cursorFactory, int i10, DatabaseErrorHandler databaseErrorHandler) {
        return b0(str, new byte[0], cursorFactory, i10, databaseErrorHandler, null);
    }

    @Override // B4.c
    public void A0() {
        d(null, false);
    }

    @Override // B4.c
    public Cursor E2(String str) {
        return h0(str, new Object[0]);
    }

    @Override // B4.c
    public void S(String str) throws SQLException {
        u(str, null);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    protected void b() {
        m(false);
    }

    protected void finalize() throws Throwable {
        try {
            m(true);
        } finally {
            super.finalize();
        }
    }

    @Override // B4.c
    public Cursor i0(f fVar) {
        return T2(fVar, null);
    }

    public Cursor j0(String str, String[] strArr) {
        return k0(null, str, strArr, null, null);
    }

    @Override // B4.c
    public void n() {
        d(null, true);
    }

    @Override // B4.c
    public int u2(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            strArr[i11] = objArr[i11].toString();
        }
        return r0(str, contentValues, str2, strArr, i10);
    }

    private boolean K() {
        return (this.f152340g.f152350c & 1) == 1;
    }

    public static SQLiteDatabase b0(String str, byte[] bArr, CursorFactory cursorFactory, int i10, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, bArr, i10, cursorFactory, databaseErrorHandler, sQLiteDatabaseHook);
        sQLiteDatabase.R();
        return sQLiteDatabase;
    }

    private void e0() {
        synchronized (this.f152338e) {
            this.f152341h = SQLiteConnectionPool.D(this.f152340g);
            this.f152339f.c("close");
        }
        synchronized (f152333j) {
            f152333j.put(this, null);
        }
    }

    public static SQLiteDatabase h(CursorFactory cursorFactory) {
        return T(":memory:", cursorFactory, 268435456);
    }

    public static boolean j(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file must not be null");
        }
        boolean zDelete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            final String str = file.getName() + "-mj";
            File[] fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.4
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return file2.getName().startsWith(str);
                }
            });
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    zDelete |= file2.delete();
                }
            }
        }
        return zDelete;
    }

    private void m(boolean z10) {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.f152338e) {
            try {
                CloseGuard closeGuard = this.f152339f;
                if (closeGuard != null) {
                    if (z10) {
                        closeGuard.d();
                    }
                    this.f152339f.a();
                }
                sQLiteConnectionPool = this.f152341h;
                this.f152341h = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        synchronized (f152333j) {
            f152333j.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.close();
        }
    }

    private void o0() {
        if (this.f152341h != null) {
            return;
        }
        throw new IllegalStateException("The database '" + this.f152340g.f152349b + "' is not open.");
    }

    SQLiteSession A() {
        return this.f152335b.get();
    }

    public int B() {
        return Long.valueOf(DatabaseUtils.d(this, "PRAGMA user_version;", null)).intValue();
    }

    public boolean J() {
        boolean zK;
        synchronized (this.f152338e) {
            zK = K();
        }
        return zK;
    }

    @Override // B4.c
    public List<Pair<String, String>> N() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f152338e) {
            try {
                Cursor cursorJ0 = null;
                if (this.f152341h == null) {
                    return null;
                }
                if (!this.f152342i) {
                    arrayList.add(new Pair("main", this.f152340g.f152348a));
                    return arrayList;
                }
                a();
                try {
                    try {
                        cursorJ0 = j0("pragma database_list;", null);
                        while (cursorJ0.moveToNext()) {
                            arrayList.add(new Pair(cursorJ0.getString(1), cursorJ0.getString(2)));
                        }
                        cursorJ0.close();
                        return arrayList;
                    } catch (Throwable th2) {
                        if (cursorJ0 != null) {
                            cursorJ0.close();
                        }
                        throw th2;
                    }
                } finally {
                    c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // B4.c
    public Cursor T2(f fVar, CancellationSignal cancellationSignal) {
        a();
        try {
            String strA = fVar.getQuery();
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, strA, "", cancellationSignal);
            SQLiteQuery sQLiteQuery = new SQLiteQuery(this, strA, cancellationSignal);
            fVar.b(sQLiteQuery);
            return new SQLiteCursor(sQLiteDirectCursorDriver, "", sQLiteQuery);
        } finally {
            c();
        }
    }

    @Override // B4.c
    public final String getPath() {
        String str;
        synchronized (this.f152338e) {
            str = this.f152340g.f152348a;
        }
        return str;
    }

    SQLiteSession i() {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.f152338e) {
            o0();
            sQLiteConnectionPool = this.f152341h;
        }
        return new SQLiteSession(sQLiteConnectionPool);
    }

    @Override // B4.c
    public boolean isOpen() {
        boolean z10;
        synchronized (this.f152338e) {
            z10 = this.f152341h != null;
        }
        return z10;
    }

    public void l() {
        synchronized (this.f152338e) {
            try {
                o0();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f152340g;
                int i10 = sQLiteDatabaseConfiguration.f152350c;
                if ((i10 & 536870912) == 0) {
                    return;
                }
                sQLiteDatabaseConfiguration.f152350c = i10 & (-536870913);
                try {
                    this.f152341h.K(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e10) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f152340g;
                    sQLiteDatabaseConfiguration2.f152350c = 536870912 | sQLiteDatabaseConfiguration2.f152350c;
                    throw e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m0() {
        synchronized (this.f152338e) {
            try {
                o0();
                if (K()) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f152340g;
                    int i10 = sQLiteDatabaseConfiguration.f152350c;
                    sQLiteDatabaseConfiguration.f152350c = i10 & (-2);
                    try {
                        this.f152341h.K(sQLiteDatabaseConfiguration);
                    } catch (RuntimeException e10) {
                        this.f152340g.f152350c = i10;
                        throw e10;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n0(int i10) throws SQLException {
        S("PRAGMA user_version = " + i10);
    }

    public boolean p() {
        synchronized (this.f152338e) {
            try {
                o0();
                if ((this.f152340g.f152350c & 536870912) != 0) {
                    return true;
                }
                if (K()) {
                    return false;
                }
                if (this.f152340g.a()) {
                    FS.log_i("SQLiteDatabase", "can't enable WAL for memory databases.");
                    return false;
                }
                if (this.f152342i) {
                    if (Log.isLoggable("SQLiteDatabase", 3)) {
                        FS.log_d("SQLiteDatabase", "this database: " + this.f152340g.f152349b + " has attached databases. can't  enable WAL.");
                    }
                    return false;
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f152340g;
                sQLiteDatabaseConfiguration.f152350c = 536870912 | sQLiteDatabaseConfiguration.f152350c;
                try {
                    this.f152341h.K(sQLiteDatabaseConfiguration);
                    return true;
                } catch (RuntimeException e10) {
                    this.f152340g.f152350c &= -536870913;
                    throw e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int r0(String str, ContentValues contentValues, String str2, String[] strArr, int i10) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        a();
        try {
            StringBuilder sb2 = new StringBuilder(BinsView.TOTE_HEIGHT_DP);
            sb2.append("UPDATE ");
            sb2.append(f152334k[i10]);
            sb2.append(str);
            sb2.append(" SET ");
            int size = contentValues.size();
            int length = strArr == null ? size : strArr.length + size;
            Object[] objArr = new Object[length];
            int i11 = 0;
            for (String str3 : contentValues.keySet()) {
                sb2.append(i11 > 0 ? "," : "");
                sb2.append(str3);
                objArr[i11] = contentValues.get(str3);
                sb2.append("=?");
                i11++;
            }
            if (strArr != null) {
                for (int i12 = size; i12 < length; i12++) {
                    objArr[i12] = strArr[i12 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb2.toString(), objArr);
            try {
                int iA0 = sQLiteStatement.a0();
                c();
                return iA0;
            } finally {
                sQLiteStatement.close();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public String toString() {
        return "SQLiteDatabase: " + getPath();
    }

    String w() {
        String str;
        synchronized (this.f152338e) {
            str = this.f152340g.f152349b;
        }
        return str;
    }

    int z(boolean z10) {
        int i10 = z10 ? 1 : 2;
        return H() ? i10 | 4 : i10;
    }

    @Override // B4.c
    public void z0(String str, Object[] objArr) throws SQLException {
        if (objArr == null) {
            throw new IllegalArgumentException("Empty bindArgs");
        }
        u(str, objArr);
    }

    @Override // B4.c
    public boolean z3() {
        boolean z10;
        synchronized (this.f152338e) {
            o0();
            z10 = (this.f152340g.f152350c & 536870912) != 0;
        }
        return z10;
    }

    private SQLiteDatabase(String str, byte[] bArr, int i10, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.f152336c = cursorFactory;
        this.f152337d = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler() : databaseErrorHandler;
        this.f152340g = new SQLiteDatabaseConfiguration(str, i10, bArr, sQLiteDatabaseHook);
    }

    public static boolean D() {
        return SQLiteConnection.u();
    }

    private static boolean H() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    private void R() {
        try {
            try {
                e0();
            } catch (SQLiteDatabaseCorruptException unused) {
                O();
                e0();
            }
        } catch (SQLiteException e10) {
            FS.log_e("SQLiteDatabase", "Failed to open database '" + w() + "'.", e10);
            close();
            throw e10;
        }
    }

    private void d(SQLiteTransactionListener sQLiteTransactionListener, boolean z10) {
        int i10;
        a();
        try {
            SQLiteSession sQLiteSessionA = A();
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            sQLiteSessionA.b(i10, sQLiteTransactionListener, z(false), null);
        } finally {
            c();
        }
    }

    private int u(String str, Object[] objArr) throws SQLException {
        boolean z10;
        a();
        try {
            if (DatabaseUtils.b(str) == 3) {
                synchronized (this.f152338e) {
                    try {
                        if (!this.f152342i) {
                            z10 = true;
                            this.f152342i = true;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    l();
                }
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str, objArr);
            try {
                return sQLiteStatement.a0();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            c();
        }
    }

    void O() {
        EventLog.writeEvent(75004, w());
        this.f152337d.a(this);
    }

    @Override // B4.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public SQLiteStatement Y1(String str) throws SQLException {
        a();
        try {
            return new SQLiteStatement(this, str, null);
        } finally {
            c();
        }
    }

    public Cursor h0(String str, Object... objArr) {
        a();
        try {
            return new SQLiteDirectCursorDriver(this, str, null, null).b(this.f152336c, objArr);
        } finally {
            c();
        }
    }

    @Override // B4.c
    public boolean j3() {
        a();
        try {
            return A().l();
        } finally {
            c();
        }
    }

    public Cursor k0(CursorFactory cursorFactory, String str, String[] strArr, String str2, CancellationSignal cancellationSignal) {
        a();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2, cancellationSignal);
            if (cursorFactory == null) {
                cursorFactory = this.f152336c;
            }
            return sQLiteDirectCursorDriver.a(cursorFactory, strArr);
        } finally {
            c();
        }
    }

    @Override // B4.c
    public void q() {
        a();
        try {
            A().q();
        } finally {
            c();
        }
    }

    @Override // B4.c
    public void r() {
        a();
        try {
            A().d(null);
        } finally {
            c();
        }
    }
}
