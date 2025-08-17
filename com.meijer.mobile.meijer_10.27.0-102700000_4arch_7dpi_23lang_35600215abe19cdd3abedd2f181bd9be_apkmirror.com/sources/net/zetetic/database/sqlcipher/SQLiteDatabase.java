package net.zetetic.database.sqlcipher;

import A4.c;
import A4.f;
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

/* loaded from: classes13.dex */
public final class SQLiteDatabase extends SQLiteClosable implements c {

    /* renamed from: j, reason: collision with root package name */
    private static WeakHashMap<SQLiteDatabase, Object> f151324j = new WeakHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f151325k = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    private final CursorFactory f151327c;

    /* renamed from: d, reason: collision with root package name */
    private final DatabaseErrorHandler f151328d;

    /* renamed from: g, reason: collision with root package name */
    private final SQLiteDatabaseConfiguration f151331g;

    /* renamed from: h, reason: collision with root package name */
    private SQLiteConnectionPool f151332h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f151333i;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal<SQLiteSession> f151326b = new ThreadLocal<SQLiteSession>() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SQLiteSession initialValue() {
            return SQLiteDatabase.this.i();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final Object f151329e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final CloseGuard f151330f = CloseGuard.b();

    /* renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$2, reason: invalid class name */
    class AnonymousClass2 implements SQLiteTransactionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.database.sqlite.SQLiteTransactionListener f151335a;

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onBegin() {
            this.f151335a.onBegin();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onCommit() {
            this.f151335a.onCommit();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onRollback() {
            this.f151335a.onRollback();
        }
    }

    /* renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$3, reason: invalid class name */
    class AnonymousClass3 implements SQLiteTransactionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.database.sqlite.SQLiteTransactionListener f151336a;

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onBegin() {
            this.f151336a.onBegin();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onCommit() {
            this.f151336a.onCommit();
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
        public void onRollback() {
            this.f151336a.onRollback();
        }
    }

    public interface CursorFactory {
        Cursor a(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    public interface CustomFunction {
        void a(String[] strArr);
    }

    public static SQLiteDatabase T(String str, CursorFactory cursorFactory, int i10) {
        return Z(str, cursorFactory, i10, null);
    }

    public static SQLiteDatabase Z(String str, CursorFactory cursorFactory, int i10, DatabaseErrorHandler databaseErrorHandler) {
        return c0(str, new byte[0], cursorFactory, i10, databaseErrorHandler, null);
    }

    @Override // A4.c
    public void C0() {
        d(null, false);
    }

    @Override // A4.c
    public Cursor F2(String str) {
        return h0(str, new Object[0]);
    }

    @Override // A4.c
    public void S(String str) throws SQLException {
        u(str, null);
    }

    @Override // A4.c
    public Cursor X2(f fVar) {
        return M0(fVar, null);
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

    public Cursor i0(String str, String[] strArr) {
        return j0(null, str, strArr, null, null);
    }

    @Override // A4.c
    public void n() {
        d(null, true);
    }

    @Override // A4.c
    public int v2(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            strArr[i11] = objArr[i11].toString();
        }
        return q0(str, contentValues, str2, strArr, i10);
    }

    private boolean K() {
        return (this.f151331g.f151341c & 1) == 1;
    }

    public static SQLiteDatabase c0(String str, byte[] bArr, CursorFactory cursorFactory, int i10, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, bArr, i10, cursorFactory, databaseErrorHandler, sQLiteDatabaseHook);
        sQLiteDatabase.R();
        return sQLiteDatabase;
    }

    private void e0() {
        synchronized (this.f151329e) {
            this.f151332h = SQLiteConnectionPool.D(this.f151331g);
            this.f151330f.c("close");
        }
        synchronized (f151324j) {
            f151324j.put(this, null);
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
        synchronized (this.f151329e) {
            try {
                CloseGuard closeGuard = this.f151330f;
                if (closeGuard != null) {
                    if (z10) {
                        closeGuard.d();
                    }
                    this.f151330f.a();
                }
                sQLiteConnectionPool = this.f151332h;
                this.f151332h = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        synchronized (f151324j) {
            f151324j.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.close();
        }
    }

    private void n0() {
        if (this.f151332h != null) {
            return;
        }
        throw new IllegalStateException("The database '" + this.f151331g.f151340b + "' is not open.");
    }

    SQLiteSession A() {
        return this.f151326b.get();
    }

    @Override // A4.c
    public boolean A3() {
        boolean z10;
        synchronized (this.f151329e) {
            n0();
            z10 = (this.f151331g.f151341c & 536870912) != 0;
        }
        return z10;
    }

    public int B() {
        return Long.valueOf(DatabaseUtils.d(this, "PRAGMA user_version;", null)).intValue();
    }

    @Override // A4.c
    public void B0(String str, Object[] objArr) throws SQLException {
        if (objArr == null) {
            throw new IllegalArgumentException("Empty bindArgs");
        }
        u(str, objArr);
    }

    public boolean J() {
        boolean zK;
        synchronized (this.f151329e) {
            zK = K();
        }
        return zK;
    }

    @Override // A4.c
    public Cursor M0(f fVar, CancellationSignal cancellationSignal) {
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

    @Override // A4.c
    public List<Pair<String, String>> N() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f151329e) {
            try {
                Cursor cursorI0 = null;
                if (this.f151332h == null) {
                    return null;
                }
                if (!this.f151333i) {
                    arrayList.add(new Pair("main", this.f151331g.f151339a));
                    return arrayList;
                }
                a();
                try {
                    try {
                        cursorI0 = i0("pragma database_list;", null);
                        while (cursorI0.moveToNext()) {
                            arrayList.add(new Pair(cursorI0.getString(1), cursorI0.getString(2)));
                        }
                        cursorI0.close();
                        return arrayList;
                    } catch (Throwable th2) {
                        if (cursorI0 != null) {
                            cursorI0.close();
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

    @Override // A4.c
    public final String getPath() {
        String str;
        synchronized (this.f151329e) {
            str = this.f151331g.f151339a;
        }
        return str;
    }

    SQLiteSession i() {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.f151329e) {
            n0();
            sQLiteConnectionPool = this.f151332h;
        }
        return new SQLiteSession(sQLiteConnectionPool);
    }

    @Override // A4.c
    public boolean isOpen() {
        boolean z10;
        synchronized (this.f151329e) {
            z10 = this.f151332h != null;
        }
        return z10;
    }

    public void l() {
        synchronized (this.f151329e) {
            try {
                n0();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f151331g;
                int i10 = sQLiteDatabaseConfiguration.f151341c;
                if ((i10 & 536870912) == 0) {
                    return;
                }
                sQLiteDatabaseConfiguration.f151341c = i10 & (-536870913);
                try {
                    this.f151332h.K(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e10) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f151331g;
                    sQLiteDatabaseConfiguration2.f151341c = 536870912 | sQLiteDatabaseConfiguration2.f151341c;
                    throw e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l0() {
        synchronized (this.f151329e) {
            try {
                n0();
                if (K()) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f151331g;
                    int i10 = sQLiteDatabaseConfiguration.f151341c;
                    sQLiteDatabaseConfiguration.f151341c = i10 & (-2);
                    try {
                        this.f151332h.K(sQLiteDatabaseConfiguration);
                    } catch (RuntimeException e10) {
                        this.f151331g.f151341c = i10;
                        throw e10;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m0(int i10) throws SQLException {
        S("PRAGMA user_version = " + i10);
    }

    public boolean p() {
        synchronized (this.f151329e) {
            try {
                n0();
                if ((this.f151331g.f151341c & 536870912) != 0) {
                    return true;
                }
                if (K()) {
                    return false;
                }
                if (this.f151331g.a()) {
                    FS.log_i("SQLiteDatabase", "can't enable WAL for memory databases.");
                    return false;
                }
                if (this.f151333i) {
                    if (Log.isLoggable("SQLiteDatabase", 3)) {
                        FS.log_d("SQLiteDatabase", "this database: " + this.f151331g.f151340b + " has attached databases. can't  enable WAL.");
                    }
                    return false;
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f151331g;
                sQLiteDatabaseConfiguration.f151341c = 536870912 | sQLiteDatabaseConfiguration.f151341c;
                try {
                    this.f151332h.K(sQLiteDatabaseConfiguration);
                    return true;
                } catch (RuntimeException e10) {
                    this.f151331g.f151341c &= -536870913;
                    throw e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int q0(String str, ContentValues contentValues, String str2, String[] strArr, int i10) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        a();
        try {
            StringBuilder sb2 = new StringBuilder(BinsView.TOTE_HEIGHT_DP);
            sb2.append("UPDATE ");
            sb2.append(f151325k[i10]);
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
                int iB0 = sQLiteStatement.b0();
                c();
                return iB0;
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
        synchronized (this.f151329e) {
            str = this.f151331g.f151340b;
        }
        return str;
    }

    int z(boolean z10) {
        int i10 = z10 ? 1 : 2;
        return H() ? i10 | 4 : i10;
    }

    private SQLiteDatabase(String str, byte[] bArr, int i10, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.f151327c = cursorFactory;
        this.f151328d = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler() : databaseErrorHandler;
        this.f151331g = new SQLiteDatabaseConfiguration(str, i10, bArr, sQLiteDatabaseHook);
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
                synchronized (this.f151329e) {
                    try {
                        if (!this.f151333i) {
                            z10 = true;
                            this.f151333i = true;
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
                return sQLiteStatement.b0();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            c();
        }
    }

    void O() {
        EventLog.writeEvent(75004, w());
        this.f151328d.a(this);
    }

    @Override // A4.c
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
            return new SQLiteDirectCursorDriver(this, str, null, null).b(this.f151327c, objArr);
        } finally {
            c();
        }
    }

    public Cursor j0(CursorFactory cursorFactory, String str, String[] strArr, String str2, CancellationSignal cancellationSignal) {
        a();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2, cancellationSignal);
            if (cursorFactory == null) {
                cursorFactory = this.f151327c;
            }
            return sQLiteDirectCursorDriver.a(cursorFactory, strArr);
        } finally {
            c();
        }
    }

    @Override // A4.c
    public boolean j3() {
        a();
        try {
            return A().l();
        } finally {
            c();
        }
    }

    @Override // A4.c
    public void q() {
        a();
        try {
            A().q();
        } finally {
            c();
        }
    }

    @Override // A4.c
    public void r() {
        a();
        try {
            A().d(null);
        } finally {
            c();
        }
    }
}
