package net.zetetic.database.sqlcipher;

import android.database.CursorWindow;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.util.LruCache;
import com.fullstory.FS;
import com.google.maps.android.BuildConfig;
import com.medallia.digital.mobilesdk.l3;
import java.util.ArrayList;
import net.zetetic.database.DatabaseUtils;

/* loaded from: classes13.dex */
public final class SQLiteConnection implements CancellationSignal.OnCancelListener {

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f151249m = new String[0];

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f151250n = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final CloseGuard f151251a;

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteConnectionPool f151252b;

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteDatabaseConfiguration f151253c;

    /* renamed from: d, reason: collision with root package name */
    private final int f151254d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f151255e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f151256f;

    /* renamed from: g, reason: collision with root package name */
    private final PreparedStatementCache f151257g;

    /* renamed from: h, reason: collision with root package name */
    private PreparedStatement f151258h;

    /* renamed from: i, reason: collision with root package name */
    private final OperationLog f151259i;

    /* renamed from: j, reason: collision with root package name */
    private long f151260j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f151261k;

    /* renamed from: l, reason: collision with root package name */
    private int f151262l;

    private static final class Operation {

        /* renamed from: a, reason: collision with root package name */
        public long f151263a;

        /* renamed from: b, reason: collision with root package name */
        public long f151264b;

        /* renamed from: c, reason: collision with root package name */
        public long f151265c;

        /* renamed from: d, reason: collision with root package name */
        public String f151266d;

        /* renamed from: e, reason: collision with root package name */
        public String f151267e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList<Object> f151268f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f151269g;

        /* renamed from: h, reason: collision with root package name */
        public Exception f151270h;

        /* renamed from: i, reason: collision with root package name */
        public int f151271i;

        private Operation() {
        }

        private String b() {
            return !this.f151269g ? "running" : this.f151270h != null ? "failed" : "succeeded";
        }

        public void a(StringBuilder sb2, boolean z10) {
            ArrayList<Object> arrayList;
            sb2.append(this.f151266d);
            if (this.f151269g) {
                sb2.append(" took ");
                sb2.append(this.f151265c - this.f151264b);
                sb2.append("ms");
            } else {
                sb2.append(" started ");
                sb2.append(System.currentTimeMillis() - this.f151263a);
                sb2.append("ms ago");
            }
            sb2.append(" - ");
            sb2.append(b());
            if (this.f151267e != null) {
                sb2.append(", sql=\"");
                sb2.append(SQLiteConnection.P(this.f151267e));
                sb2.append("\"");
            }
            if (z10 && (arrayList = this.f151268f) != null && arrayList.size() != 0) {
                sb2.append(", bindArgs=[");
                int size = this.f151268f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = this.f151268f.get(i10);
                    if (i10 != 0) {
                        sb2.append(", ");
                    }
                    if (obj == null) {
                        sb2.append(BuildConfig.TRAVIS);
                    } else if (obj instanceof byte[]) {
                        sb2.append("<byte[]>");
                    } else if (obj instanceof String) {
                        sb2.append("\"");
                        sb2.append((String) obj);
                        sb2.append("\"");
                    } else {
                        sb2.append(obj);
                    }
                }
                sb2.append("]");
            }
            if (this.f151270h != null) {
                sb2.append(", exception=\"");
                sb2.append(this.f151270h.getMessage());
                sb2.append("\"");
            }
        }
    }

    private static final class OperationLog {

        /* renamed from: a, reason: collision with root package name */
        private final Operation[] f151272a;

        /* renamed from: b, reason: collision with root package name */
        private int f151273b;

        /* renamed from: c, reason: collision with root package name */
        private int f151274c;

        private OperationLog() {
            this.f151272a = new Operation[20];
        }

        private Operation g(int i10) {
            Operation operation = this.f151272a[i10 & l3.f92484c];
            if (operation.f151271i == i10) {
                return operation;
            }
            return null;
        }

        private int j(int i10) {
            int i11 = this.f151274c;
            this.f151274c = i11 + 1;
            return i10 | (i11 << 8);
        }

        public int a(String str, String str2, Object[] objArr) {
            int iJ;
            synchronized (this.f151272a) {
                try {
                    int i10 = (this.f151273b + 1) % 20;
                    Operation operation = this.f151272a[i10];
                    if (operation == null) {
                        operation = new Operation();
                        this.f151272a[i10] = operation;
                    } else {
                        operation.f151269g = false;
                        operation.f151270h = null;
                        ArrayList<Object> arrayList = operation.f151268f;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    }
                    operation.f151263a = System.currentTimeMillis();
                    operation.f151264b = SystemClock.uptimeMillis();
                    operation.f151266d = str;
                    operation.f151267e = str2;
                    if (objArr != null) {
                        ArrayList<Object> arrayList2 = operation.f151268f;
                        if (arrayList2 == null) {
                            operation.f151268f = new ArrayList<>();
                        } else {
                            arrayList2.clear();
                        }
                        for (Object obj : objArr) {
                            if (obj == null || !(obj instanceof byte[])) {
                                operation.f151268f.add(obj);
                            } else {
                                operation.f151268f.add(SQLiteConnection.f151250n);
                            }
                        }
                    }
                    iJ = j(i10);
                    operation.f151271i = iJ;
                    this.f151273b = i10;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iJ;
        }

        public String b() {
            synchronized (this.f151272a) {
                try {
                    Operation operation = this.f151272a[this.f151273b];
                    if (operation == null || operation.f151269g) {
                        return null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    operation.a(sb2, false);
                    return sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c(int i10) {
            synchronized (this.f151272a) {
                try {
                    if (e(i10)) {
                        i(i10, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public boolean d(int i10) {
            boolean zE;
            synchronized (this.f151272a) {
                zE = e(i10);
            }
            return zE;
        }

        public void f(int i10, Exception exc) {
            synchronized (this.f151272a) {
                try {
                    Operation operationG = g(i10);
                    if (operationG != null) {
                        operationG.f151270h = exc;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void h(int i10, String str) {
            synchronized (this.f151272a) {
                i(i10, str);
            }
        }

        private boolean e(int i10) {
            Operation operationG = g(i10);
            if (operationG != null) {
                operationG.f151265c = SystemClock.uptimeMillis();
                operationG.f151269g = true;
            }
            return false;
        }

        private void i(int i10, String str) {
            Operation operationG = g(i10);
            StringBuilder sb2 = new StringBuilder();
            operationG.a(sb2, false);
            if (str != null) {
                sb2.append(", ");
                sb2.append(str);
            }
            FS.log_d("SQLiteConnection", sb2.toString());
        }
    }

    private static final class PreparedStatement {

        /* renamed from: a, reason: collision with root package name */
        public PreparedStatement f151275a;

        /* renamed from: b, reason: collision with root package name */
        public String f151276b;

        /* renamed from: c, reason: collision with root package name */
        public long f151277c;

        /* renamed from: d, reason: collision with root package name */
        public int f151278d;

        /* renamed from: e, reason: collision with root package name */
        public int f151279e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f151280f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f151281g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f151282h;

        private PreparedStatement() {
        }
    }

    private final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z10, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            preparedStatement.f151281g = false;
            if (preparedStatement.f151282h) {
                return;
            }
            SQLiteConnection.this.t(preparedStatement);
        }

        public PreparedStatementCache(int i10) {
            super(i10);
        }
    }

    private void D(PreparedStatement preparedStatement) {
        preparedStatement.f151276b = null;
        preparedStatement.f151275a = this.f151258h;
        this.f151258h = preparedStatement;
    }

    private void E(PreparedStatement preparedStatement) {
        preparedStatement.f151282h = false;
        if (!preparedStatement.f151281g) {
            t(preparedStatement);
            return;
        }
        try {
            nativeResetStatementAndClearBindings(this.f151260j, preparedStatement.f151277c);
        } catch (SQLiteException unused) {
            this.f151257g.remove(preparedStatement.f151276b);
        }
    }

    private void e(PreparedStatement preparedStatement) {
    }

    private void g(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.f151278d) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.f151278d + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long j10 = preparedStatement.f151277c;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            int iC = DatabaseUtils.c(obj);
            if (iC == 0) {
                nativeBindNull(this.f151260j, j10, i10 + 1);
            } else if (iC == 1) {
                nativeBindLong(this.f151260j, j10, i10 + 1, ((Number) obj).longValue());
            } else if (iC == 2) {
                nativeBindDouble(this.f151260j, j10, i10 + 1, ((Number) obj).doubleValue());
            } else if (iC == 4) {
                nativeBindBlob(this.f151260j, j10, i10 + 1, (byte[]) obj);
            } else if (obj instanceof Boolean) {
                nativeBindLong(this.f151260j, j10, i10 + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                nativeBindString(this.f151260j, j10, i10 + 1, obj.toString());
            }
        }
    }

    private static native void nativeBindBlob(long j10, long j11, int i10, byte[] bArr);

    private static native void nativeBindDouble(long j10, long j11, int i10, double d10);

    private static native void nativeBindLong(long j10, long j11, int i10, long j12);

    private static native void nativeBindNull(long j10, long j11, int i10);

    private static native void nativeBindString(long j10, long j11, int i10, String str);

    private static native void nativeCancel(long j10);

    private static native void nativeClose(long j10);

    private static native void nativeExecute(long j10, long j11);

    private static native int nativeExecuteForBlobFileDescriptor(long j10, long j11);

    private static native int nativeExecuteForChangedRowCount(long j10, long j11);

    private static native long nativeExecuteForCursorWindow(long j10, long j11, CursorWindow cursorWindow, int i10, int i11, boolean z10);

    private static native long nativeExecuteForLastInsertedRowId(long j10, long j11);

    private static native long nativeExecuteForLong(long j10, long j11);

    private static native String nativeExecuteForString(long j10, long j11);

    private static native void nativeExecuteRaw(long j10, long j11);

    private static native void nativeFinalizeStatement(long j10, long j11);

    private static native int nativeGetColumnCount(long j10, long j11);

    private static native String nativeGetColumnName(long j10, long j11, int i10);

    private static native int nativeGetDbLookaside(long j10);

    private static native int nativeGetParameterCount(long j10, long j11);

    private static native boolean nativeHasCodec();

    private static native boolean nativeIsReadOnly(long j10, long j11);

    private static native int nativeKey(long j10, byte[] bArr);

    private static native long nativeOpen(String str, int i10, String str2, boolean z10, boolean z11);

    private static native long nativePrepareStatement(long j10, String str);

    private static native int nativeReKey(long j10, byte[] bArr);

    private static native void nativeRegisterCustomFunction(long j10, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j10, String str);

    private static native void nativeResetCancel(long j10, boolean z10);

    private static native void nativeResetStatementAndClearBindings(long j10, long j11);

    private static boolean v(int i10) {
        return i10 == 2 || i10 == 1;
    }

    void C(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f151261k = false;
        int size = sQLiteDatabaseConfiguration.f151347i.size();
        for (int i10 = 0; i10 < size; i10++) {
            SQLiteCustomFunction sQLiteCustomFunction = sQLiteDatabaseConfiguration.f151347i.get(i10);
            if (!this.f151253c.f151347i.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.f151260j, sQLiteCustomFunction);
            }
        }
        boolean z10 = sQLiteDatabaseConfiguration.f151344f;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f151253c;
        boolean z11 = z10 != sQLiteDatabaseConfiguration2.f151344f;
        boolean z12 = ((sQLiteDatabaseConfiguration.f151341c ^ sQLiteDatabaseConfiguration2.f151341c) & 536870912) != 0;
        boolean zEquals = sQLiteDatabaseConfiguration.f151343e.equals(sQLiteDatabaseConfiguration2.f151343e);
        this.f151253c.c(sQLiteDatabaseConfiguration);
        if (z11) {
            G();
        }
        if (z12) {
            N();
        }
        if (zEquals) {
            return;
        }
        J();
    }

    void j() {
        m(false);
    }

    private void A() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f151253c;
        this.f151260j = nativeOpen(sQLiteDatabaseConfiguration.f151339a, sQLiteDatabaseConfiguration.f151341c, sQLiteDatabaseConfiguration.f151340b, SQLiteDebug.f151349b, SQLiteDebug.f151350c);
        SQLiteDatabaseHook sQLiteDatabaseHook = this.f151253c.f151346h;
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.b(this);
        }
        byte[] bArr = this.f151253c.f151345g;
        if (bArr != null && bArr.length > 0) {
            FS.log_i("SQLiteConnection", String.format("Database keying operation returned:%s", Integer.valueOf(nativeKey(this.f151260j, bArr))));
        }
        SQLiteDatabaseHook sQLiteDatabaseHook2 = this.f151253c.f151346h;
        if (sQLiteDatabaseHook2 != null) {
            sQLiteDatabaseHook2.a(this);
        }
        byte[] bArr2 = this.f151253c.f151345g;
        if (bArr2 != null && bArr2.length > 0) {
            r("SELECT COUNT(*) FROM sqlite_schema;", null, null);
        }
        L();
        G();
        I();
        F();
        N();
        if (!nativeHasCodec()) {
            J();
        }
        int size = this.f151253c.f151347i.size();
        for (int i10 = 0; i10 < size; i10++) {
            nativeRegisterCustomFunction(this.f151260j, this.f151253c.f151347i.get(i10));
        }
    }

    private void F() {
        if (this.f151253c.a() || this.f151256f) {
            return;
        }
        long jE = SQLiteGlobal.e();
        if (r("PRAGMA wal_autocheckpoint", null, null) != jE) {
            r("PRAGMA wal_autocheckpoint=" + jE, null, null);
        }
    }

    private void G() {
        if (this.f151256f) {
            return;
        }
        long j10 = this.f151253c.f151344f ? 1L : 0L;
        if (r("PRAGMA foreign_keys", null, null) != j10) {
            n("PRAGMA foreign_keys=" + j10, null, null);
        }
    }

    private void H(String str) {
        String strS = s("PRAGMA journal_mode", null, null);
        if (strS.equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (s("PRAGMA journal_mode=" + str, null, null).equalsIgnoreCase(str)) {
                return;
            }
        } catch (SQLiteDatabaseLockedException unused) {
        }
        FS.log_w("SQLiteConnection", "Could not change the database journal mode of '" + this.f151253c.f151340b + "' from '" + strS + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
    }

    private void I() {
        if (this.f151253c.a() || this.f151256f) {
            return;
        }
        long jD = SQLiteGlobal.d();
        if (r("PRAGMA journal_size_limit", null, null) != jD) {
            r("PRAGMA journal_size_limit=" + jD, null, null);
        }
    }

    private void J() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f151253c;
        if ((sQLiteDatabaseConfiguration.f151341c & 16) != 0) {
            return;
        }
        String string = sQLiteDatabaseConfiguration.f151343e.toString();
        nativeRegisterLocalizedCollators(this.f151260j, string);
        if (this.f151256f) {
            return;
        }
        try {
            n("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String strS = s("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
            if (strS == null || !strS.equals(string)) {
                n("BEGIN", null, null);
                try {
                    n("DELETE FROM android_metadata", null, null);
                    n("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{string}, null);
                    n("REINDEX LOCALIZED", null, null);
                    n("COMMIT", null, null);
                } catch (Throwable th2) {
                    n("ROLLBACK", null, null);
                    throw th2;
                }
            }
        } catch (RuntimeException e10) {
            throw new SQLiteException("Failed to change locale for db '" + this.f151253c.f151340b + "' to '" + string + "'.", e10);
        }
    }

    private void L() {
        if (this.f151253c.a() || this.f151256f || SQLiteDatabase.D()) {
            return;
        }
        long jB = SQLiteGlobal.b();
        if (r("PRAGMA page_size", null, null) != jB) {
            n("PRAGMA page_size=" + jB, null, null);
        }
    }

    private void M(String str) {
        if (h(s("PRAGMA synchronous", null, null)).equalsIgnoreCase(h(str))) {
            return;
        }
        n("PRAGMA synchronous=" + str, null, null);
    }

    private void N() {
        if (this.f151253c.a() || this.f151256f) {
            return;
        }
        if ((this.f151253c.f151341c & 536870912) != 0) {
            H("WAL");
            M(SQLiteGlobal.g());
        } else {
            H(SQLiteGlobal.a());
            M(SQLiteGlobal.c());
        }
    }

    private void O(PreparedStatement preparedStatement) {
        if (this.f151261k && !preparedStatement.f151280f) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String P(String str) {
        return str.replaceAll("[\\s]*\\n+[\\s]*", " ");
    }

    private PreparedStatement d(String str) {
        boolean z10;
        SQLiteConnection sQLiteConnection;
        int iNativeGetParameterCount;
        int iB;
        PreparedStatement preparedStatementY = this.f151257g.get(str);
        if (preparedStatementY == null) {
            z10 = false;
        } else {
            if (!preparedStatementY.f151282h) {
                return preparedStatementY;
            }
            z10 = true;
        }
        long jNativePrepareStatement = nativePrepareStatement(this.f151260j, str);
        try {
            iNativeGetParameterCount = nativeGetParameterCount(this.f151260j, jNativePrepareStatement);
            iB = DatabaseUtils.b(str);
            sQLiteConnection = this;
        } catch (RuntimeException e10) {
            e = e10;
            sQLiteConnection = this;
        }
        try {
            preparedStatementY = sQLiteConnection.y(str, jNativePrepareStatement, iNativeGetParameterCount, iB, nativeIsReadOnly(this.f151260j, jNativePrepareStatement));
            if (!z10 && v(iB)) {
                sQLiteConnection.f151257g.put(str, preparedStatementY);
                preparedStatementY.f151281g = true;
            }
            preparedStatementY.f151282h = true;
            return preparedStatementY;
        } catch (RuntimeException e11) {
            e = e11;
            RuntimeException runtimeException = e;
            if (preparedStatementY != null && preparedStatementY.f151281g) {
                throw runtimeException;
            }
            nativeFinalizeStatement(sQLiteConnection.f151260j, jNativePrepareStatement);
            throw runtimeException;
        }
    }

    private void f(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i10 = this.f151262l + 1;
            this.f151262l = i10;
            if (i10 == 1) {
                nativeResetCancel(this.f151260j, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    private static String h(String str) {
        return str.equals("0") ? "OFF" : str.equals("1") ? "NORMAL" : str.equals("2") ? "FULL" : str;
    }

    private void l(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i10 = this.f151262l - 1;
            this.f151262l = i10;
            if (i10 == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.f151260j, false);
            }
        }
    }

    private void m(boolean z10) {
        CloseGuard closeGuard = this.f151251a;
        if (closeGuard != null) {
            if (z10) {
                closeGuard.d();
            }
            this.f151251a.a();
        }
        if (this.f151260j != 0) {
            int iA = this.f151259i.a("close", null, null);
            try {
                this.f151257g.evictAll();
                nativeClose(this.f151260j);
                this.f151260j = 0L;
            } finally {
                this.f151259i.c(iA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.f151260j, preparedStatement.f151277c);
        D(preparedStatement);
    }

    private PreparedStatement y(String str, long j10, int i10, int i11, boolean z10) {
        PreparedStatement preparedStatement = this.f151258h;
        if (preparedStatement != null) {
            this.f151258h = preparedStatement.f151275a;
            preparedStatement.f151275a = null;
            preparedStatement.f151281g = false;
        } else {
            preparedStatement = new PreparedStatement();
        }
        preparedStatement.f151276b = str;
        preparedStatement.f151277c = j10;
        preparedStatement.f151278d = i10;
        preparedStatement.f151279e = i11;
        preparedStatement.f151280f = z10;
        return preparedStatement;
    }

    static SQLiteConnection z(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i10, boolean z10) {
        SQLiteConnection sQLiteConnection = new SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i10, z10);
        try {
            sQLiteConnection.A();
            return sQLiteConnection;
        } catch (SQLiteException e10) {
            sQLiteConnection.m(false);
            throw e10;
        }
    }

    public void B(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f151259i.a("prepare", str, null);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                if (sQLiteStatementInfo != null) {
                    try {
                        sQLiteStatementInfo.f151400a = preparedStatementD.f151278d;
                        sQLiteStatementInfo.f151402c = preparedStatementD.f151280f;
                        int iNativeGetColumnCount = nativeGetColumnCount(this.f151260j, preparedStatementD.f151277c);
                        if (iNativeGetColumnCount == 0) {
                            sQLiteStatementInfo.f151401b = f151249m;
                        } else {
                            sQLiteStatementInfo.f151401b = new String[iNativeGetColumnCount];
                            for (int i10 = 0; i10 < iNativeGetColumnCount; i10++) {
                                sQLiteStatementInfo.f151401b[i10] = nativeGetColumnName(this.f151260j, preparedStatementD.f151277c, i10);
                            }
                        }
                    } catch (Throwable th2) {
                        E(preparedStatementD);
                        throw th2;
                    }
                }
                E(preparedStatementD);
                this.f151259i.c(iA);
            } catch (RuntimeException e10) {
                this.f151259i.f(iA, e10);
                throw e10;
            }
        } catch (Throwable th3) {
            this.f151259i.c(iA);
            throw th3;
        }
    }

    void K(boolean z10) {
        this.f151261k = z10;
    }

    protected void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.f151252b;
            if (sQLiteConnectionPool != null && this.f151260j != 0) {
                sQLiteConnectionPool.B();
            }
            m(true);
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    void i(byte[] bArr) {
        int iNativeReKey = nativeReKey(this.f151260j, bArr);
        FS.log_i("SQLiteConnection", String.format("Database rekey operation returned:%s", Integer.valueOf(iNativeReKey)));
        if (iNativeReKey != 0) {
            throw new SQLiteException(String.format("Failed to rekey database, result code:%s", Integer.valueOf(iNativeReKey)));
        }
    }

    String k() {
        return this.f151259i.b();
    }

    public void n(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f151259i.a("execute", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        nativeExecute(this.f151260j, preparedStatementD.f151277c);
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (RuntimeException e10) {
                this.f151259i.f(iA, e10);
                throw e10;
            }
        } finally {
            this.f151259i.c(iA);
        }
    }

    public int o(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f151259i.a("executeForChangedRowCount", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        int iNativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.f151260j, preparedStatementD.f151277c);
                        if (this.f151259i.d(iA)) {
                            this.f151259i.h(iA, "changedRows=" + iNativeExecuteForChangedRowCount);
                        }
                        return iNativeExecuteForChangedRowCount;
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (Throwable th2) {
                if (this.f151259i.d(iA)) {
                    this.f151259i.h(iA, "changedRows=0");
                }
                throw th2;
            }
        } catch (RuntimeException e10) {
            this.f151259i.f(iA, e10);
            throw e10;
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        nativeCancel(this.f151260j);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0126 A[Catch: all -> 0x0098, TryCatch #11 {all -> 0x0098, blocks: (B:21:0x005f, B:23:0x0067, B:65:0x011e, B:67:0x0126, B:68:0x0152), top: B:93:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int p(java.lang.String r20, java.lang.Object[] r21, android.database.CursorWindow r22, int r23, int r24, boolean r25, android.os.CancellationSignal r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.zetetic.database.sqlcipher.SQLiteConnection.p(java.lang.String, java.lang.Object[], android.database.CursorWindow, int, int, boolean, android.os.CancellationSignal):int");
    }

    public long q(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f151259i.a("executeForLastInsertedRowId", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        return nativeExecuteForLastInsertedRowId(this.f151260j, preparedStatementD.f151277c);
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (RuntimeException e10) {
                this.f151259i.f(iA, e10);
                throw e10;
            }
        } finally {
            this.f151259i.c(iA);
        }
    }

    public long r(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f151259i.a("executeForLong", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        return nativeExecuteForLong(this.f151260j, preparedStatementD.f151277c);
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (RuntimeException e10) {
                this.f151259i.f(iA, e10);
                throw e10;
            }
        } finally {
            this.f151259i.c(iA);
        }
    }

    public String s(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f151259i.a("executeForString", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        return nativeExecuteForString(this.f151260j, preparedStatementD.f151277c);
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (RuntimeException e10) {
                this.f151259i.f(iA, e10);
                throw e10;
            }
        } finally {
            this.f151259i.c(iA);
        }
    }

    public String toString() {
        return "SQLiteConnection: " + this.f151253c.f151339a + " (" + this.f151254d + ")";
    }

    boolean w(String str) {
        return this.f151257g.get(str) != null;
    }

    public boolean x() {
        return this.f151255e;
    }

    private SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i10, boolean z10) {
        CloseGuard closeGuardB = CloseGuard.b();
        this.f151251a = closeGuardB;
        this.f151259i = new OperationLog();
        this.f151252b = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.f151253c = sQLiteDatabaseConfiguration2;
        this.f151254d = i10;
        this.f151255e = z10;
        this.f151256f = (sQLiteDatabaseConfiguration.f151341c & 1) != 0;
        this.f151257g = new PreparedStatementCache(sQLiteDatabaseConfiguration2.f151342d);
        closeGuardB.c("close");
    }

    public static boolean u() {
        return nativeHasCodec();
    }
}
