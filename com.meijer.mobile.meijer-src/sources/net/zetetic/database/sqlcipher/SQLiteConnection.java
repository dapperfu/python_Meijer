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

/* loaded from: classes14.dex */
public final class SQLiteConnection implements CancellationSignal.OnCancelListener {

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f152258m = new String[0];

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f152259n = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final CloseGuard f152260a;

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteConnectionPool f152261b;

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteDatabaseConfiguration f152262c;

    /* renamed from: d, reason: collision with root package name */
    private final int f152263d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f152264e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f152265f;

    /* renamed from: g, reason: collision with root package name */
    private final PreparedStatementCache f152266g;

    /* renamed from: h, reason: collision with root package name */
    private PreparedStatement f152267h;

    /* renamed from: i, reason: collision with root package name */
    private final OperationLog f152268i;

    /* renamed from: j, reason: collision with root package name */
    private long f152269j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f152270k;

    /* renamed from: l, reason: collision with root package name */
    private int f152271l;

    private static final class Operation {

        /* renamed from: a, reason: collision with root package name */
        public long f152272a;

        /* renamed from: b, reason: collision with root package name */
        public long f152273b;

        /* renamed from: c, reason: collision with root package name */
        public long f152274c;

        /* renamed from: d, reason: collision with root package name */
        public String f152275d;

        /* renamed from: e, reason: collision with root package name */
        public String f152276e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList<Object> f152277f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f152278g;

        /* renamed from: h, reason: collision with root package name */
        public Exception f152279h;

        /* renamed from: i, reason: collision with root package name */
        public int f152280i;

        private Operation() {
        }

        private String b() {
            return !this.f152278g ? "running" : this.f152279h != null ? "failed" : "succeeded";
        }

        public void a(StringBuilder sb2, boolean z10) {
            ArrayList<Object> arrayList;
            sb2.append(this.f152275d);
            if (this.f152278g) {
                sb2.append(" took ");
                sb2.append(this.f152274c - this.f152273b);
                sb2.append("ms");
            } else {
                sb2.append(" started ");
                sb2.append(System.currentTimeMillis() - this.f152272a);
                sb2.append("ms ago");
            }
            sb2.append(" - ");
            sb2.append(b());
            if (this.f152276e != null) {
                sb2.append(", sql=\"");
                sb2.append(SQLiteConnection.P(this.f152276e));
                sb2.append("\"");
            }
            if (z10 && (arrayList = this.f152277f) != null && arrayList.size() != 0) {
                sb2.append(", bindArgs=[");
                int size = this.f152277f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = this.f152277f.get(i10);
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
            if (this.f152279h != null) {
                sb2.append(", exception=\"");
                sb2.append(this.f152279h.getMessage());
                sb2.append("\"");
            }
        }
    }

    private static final class OperationLog {

        /* renamed from: a, reason: collision with root package name */
        private final Operation[] f152281a;

        /* renamed from: b, reason: collision with root package name */
        private int f152282b;

        /* renamed from: c, reason: collision with root package name */
        private int f152283c;

        private OperationLog() {
            this.f152281a = new Operation[20];
        }

        private Operation g(int i10) {
            Operation operation = this.f152281a[i10 & l3.f93323c];
            if (operation.f152280i == i10) {
                return operation;
            }
            return null;
        }

        private int j(int i10) {
            int i11 = this.f152283c;
            this.f152283c = i11 + 1;
            return i10 | (i11 << 8);
        }

        public int a(String str, String str2, Object[] objArr) {
            int iJ;
            synchronized (this.f152281a) {
                try {
                    int i10 = (this.f152282b + 1) % 20;
                    Operation operation = this.f152281a[i10];
                    if (operation == null) {
                        operation = new Operation();
                        this.f152281a[i10] = operation;
                    } else {
                        operation.f152278g = false;
                        operation.f152279h = null;
                        ArrayList<Object> arrayList = operation.f152277f;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    }
                    operation.f152272a = System.currentTimeMillis();
                    operation.f152273b = SystemClock.uptimeMillis();
                    operation.f152275d = str;
                    operation.f152276e = str2;
                    if (objArr != null) {
                        ArrayList<Object> arrayList2 = operation.f152277f;
                        if (arrayList2 == null) {
                            operation.f152277f = new ArrayList<>();
                        } else {
                            arrayList2.clear();
                        }
                        for (Object obj : objArr) {
                            if (obj == null || !(obj instanceof byte[])) {
                                operation.f152277f.add(obj);
                            } else {
                                operation.f152277f.add(SQLiteConnection.f152259n);
                            }
                        }
                    }
                    iJ = j(i10);
                    operation.f152280i = iJ;
                    this.f152282b = i10;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iJ;
        }

        public String b() {
            synchronized (this.f152281a) {
                try {
                    Operation operation = this.f152281a[this.f152282b];
                    if (operation == null || operation.f152278g) {
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
            synchronized (this.f152281a) {
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
            synchronized (this.f152281a) {
                zE = e(i10);
            }
            return zE;
        }

        public void f(int i10, Exception exc) {
            synchronized (this.f152281a) {
                try {
                    Operation operationG = g(i10);
                    if (operationG != null) {
                        operationG.f152279h = exc;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void h(int i10, String str) {
            synchronized (this.f152281a) {
                i(i10, str);
            }
        }

        private boolean e(int i10) {
            Operation operationG = g(i10);
            if (operationG != null) {
                operationG.f152274c = SystemClock.uptimeMillis();
                operationG.f152278g = true;
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
        public PreparedStatement f152284a;

        /* renamed from: b, reason: collision with root package name */
        public String f152285b;

        /* renamed from: c, reason: collision with root package name */
        public long f152286c;

        /* renamed from: d, reason: collision with root package name */
        public int f152287d;

        /* renamed from: e, reason: collision with root package name */
        public int f152288e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f152289f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f152290g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f152291h;

        private PreparedStatement() {
        }
    }

    private final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z10, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            preparedStatement.f152290g = false;
            if (preparedStatement.f152291h) {
                return;
            }
            SQLiteConnection.this.t(preparedStatement);
        }

        public PreparedStatementCache(int i10) {
            super(i10);
        }
    }

    private void D(PreparedStatement preparedStatement) {
        preparedStatement.f152285b = null;
        preparedStatement.f152284a = this.f152267h;
        this.f152267h = preparedStatement;
    }

    private void E(PreparedStatement preparedStatement) {
        preparedStatement.f152291h = false;
        if (!preparedStatement.f152290g) {
            t(preparedStatement);
            return;
        }
        try {
            nativeResetStatementAndClearBindings(this.f152269j, preparedStatement.f152286c);
        } catch (SQLiteException unused) {
            this.f152266g.remove(preparedStatement.f152285b);
        }
    }

    private void e(PreparedStatement preparedStatement) {
    }

    private void g(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.f152287d) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.f152287d + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long j10 = preparedStatement.f152286c;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            int iC = DatabaseUtils.c(obj);
            if (iC == 0) {
                nativeBindNull(this.f152269j, j10, i10 + 1);
            } else if (iC == 1) {
                nativeBindLong(this.f152269j, j10, i10 + 1, ((Number) obj).longValue());
            } else if (iC == 2) {
                nativeBindDouble(this.f152269j, j10, i10 + 1, ((Number) obj).doubleValue());
            } else if (iC == 4) {
                nativeBindBlob(this.f152269j, j10, i10 + 1, (byte[]) obj);
            } else if (obj instanceof Boolean) {
                nativeBindLong(this.f152269j, j10, i10 + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                nativeBindString(this.f152269j, j10, i10 + 1, obj.toString());
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
        this.f152270k = false;
        int size = sQLiteDatabaseConfiguration.f152356i.size();
        for (int i10 = 0; i10 < size; i10++) {
            SQLiteCustomFunction sQLiteCustomFunction = sQLiteDatabaseConfiguration.f152356i.get(i10);
            if (!this.f152262c.f152356i.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.f152269j, sQLiteCustomFunction);
            }
        }
        boolean z10 = sQLiteDatabaseConfiguration.f152353f;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f152262c;
        boolean z11 = z10 != sQLiteDatabaseConfiguration2.f152353f;
        boolean z12 = ((sQLiteDatabaseConfiguration.f152350c ^ sQLiteDatabaseConfiguration2.f152350c) & 536870912) != 0;
        boolean zEquals = sQLiteDatabaseConfiguration.f152352e.equals(sQLiteDatabaseConfiguration2.f152352e);
        this.f152262c.c(sQLiteDatabaseConfiguration);
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
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f152262c;
        this.f152269j = nativeOpen(sQLiteDatabaseConfiguration.f152348a, sQLiteDatabaseConfiguration.f152350c, sQLiteDatabaseConfiguration.f152349b, SQLiteDebug.f152358b, SQLiteDebug.f152359c);
        SQLiteDatabaseHook sQLiteDatabaseHook = this.f152262c.f152355h;
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.b(this);
        }
        byte[] bArr = this.f152262c.f152354g;
        if (bArr != null && bArr.length > 0) {
            FS.log_i("SQLiteConnection", String.format("Database keying operation returned:%s", Integer.valueOf(nativeKey(this.f152269j, bArr))));
        }
        SQLiteDatabaseHook sQLiteDatabaseHook2 = this.f152262c.f152355h;
        if (sQLiteDatabaseHook2 != null) {
            sQLiteDatabaseHook2.a(this);
        }
        byte[] bArr2 = this.f152262c.f152354g;
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
        int size = this.f152262c.f152356i.size();
        for (int i10 = 0; i10 < size; i10++) {
            nativeRegisterCustomFunction(this.f152269j, this.f152262c.f152356i.get(i10));
        }
    }

    private void F() {
        if (this.f152262c.a() || this.f152265f) {
            return;
        }
        long jE = SQLiteGlobal.e();
        if (r("PRAGMA wal_autocheckpoint", null, null) != jE) {
            r("PRAGMA wal_autocheckpoint=" + jE, null, null);
        }
    }

    private void G() {
        if (this.f152265f) {
            return;
        }
        long j10 = this.f152262c.f152353f ? 1L : 0L;
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
        FS.log_w("SQLiteConnection", "Could not change the database journal mode of '" + this.f152262c.f152349b + "' from '" + strS + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
    }

    private void I() {
        if (this.f152262c.a() || this.f152265f) {
            return;
        }
        long jD = SQLiteGlobal.d();
        if (r("PRAGMA journal_size_limit", null, null) != jD) {
            r("PRAGMA journal_size_limit=" + jD, null, null);
        }
    }

    private void J() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f152262c;
        if ((sQLiteDatabaseConfiguration.f152350c & 16) != 0) {
            return;
        }
        String string = sQLiteDatabaseConfiguration.f152352e.toString();
        nativeRegisterLocalizedCollators(this.f152269j, string);
        if (this.f152265f) {
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
            throw new SQLiteException("Failed to change locale for db '" + this.f152262c.f152349b + "' to '" + string + "'.", e10);
        }
    }

    private void L() {
        if (this.f152262c.a() || this.f152265f || SQLiteDatabase.D()) {
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
        if (this.f152262c.a() || this.f152265f) {
            return;
        }
        if ((this.f152262c.f152350c & 536870912) != 0) {
            H("WAL");
            M(SQLiteGlobal.g());
        } else {
            H(SQLiteGlobal.a());
            M(SQLiteGlobal.c());
        }
    }

    private void O(PreparedStatement preparedStatement) {
        if (this.f152270k && !preparedStatement.f152289f) {
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
        PreparedStatement preparedStatementY = this.f152266g.get(str);
        if (preparedStatementY == null) {
            z10 = false;
        } else {
            if (!preparedStatementY.f152291h) {
                return preparedStatementY;
            }
            z10 = true;
        }
        long jNativePrepareStatement = nativePrepareStatement(this.f152269j, str);
        try {
            iNativeGetParameterCount = nativeGetParameterCount(this.f152269j, jNativePrepareStatement);
            iB = DatabaseUtils.b(str);
            sQLiteConnection = this;
        } catch (RuntimeException e10) {
            e = e10;
            sQLiteConnection = this;
        }
        try {
            preparedStatementY = sQLiteConnection.y(str, jNativePrepareStatement, iNativeGetParameterCount, iB, nativeIsReadOnly(this.f152269j, jNativePrepareStatement));
            if (!z10 && v(iB)) {
                sQLiteConnection.f152266g.put(str, preparedStatementY);
                preparedStatementY.f152290g = true;
            }
            preparedStatementY.f152291h = true;
            return preparedStatementY;
        } catch (RuntimeException e11) {
            e = e11;
            RuntimeException runtimeException = e;
            if (preparedStatementY != null && preparedStatementY.f152290g) {
                throw runtimeException;
            }
            nativeFinalizeStatement(sQLiteConnection.f152269j, jNativePrepareStatement);
            throw runtimeException;
        }
    }

    private void f(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i10 = this.f152271l + 1;
            this.f152271l = i10;
            if (i10 == 1) {
                nativeResetCancel(this.f152269j, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    private static String h(String str) {
        return str.equals("0") ? "OFF" : str.equals("1") ? "NORMAL" : str.equals("2") ? "FULL" : str;
    }

    private void l(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i10 = this.f152271l - 1;
            this.f152271l = i10;
            if (i10 == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.f152269j, false);
            }
        }
    }

    private void m(boolean z10) {
        CloseGuard closeGuard = this.f152260a;
        if (closeGuard != null) {
            if (z10) {
                closeGuard.d();
            }
            this.f152260a.a();
        }
        if (this.f152269j != 0) {
            int iA = this.f152268i.a("close", null, null);
            try {
                this.f152266g.evictAll();
                nativeClose(this.f152269j);
                this.f152269j = 0L;
            } finally {
                this.f152268i.c(iA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.f152269j, preparedStatement.f152286c);
        D(preparedStatement);
    }

    private PreparedStatement y(String str, long j10, int i10, int i11, boolean z10) {
        PreparedStatement preparedStatement = this.f152267h;
        if (preparedStatement != null) {
            this.f152267h = preparedStatement.f152284a;
            preparedStatement.f152284a = null;
            preparedStatement.f152290g = false;
        } else {
            preparedStatement = new PreparedStatement();
        }
        preparedStatement.f152285b = str;
        preparedStatement.f152286c = j10;
        preparedStatement.f152287d = i10;
        preparedStatement.f152288e = i11;
        preparedStatement.f152289f = z10;
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
        int iA = this.f152268i.a("prepare", str, null);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                if (sQLiteStatementInfo != null) {
                    try {
                        sQLiteStatementInfo.f152409a = preparedStatementD.f152287d;
                        sQLiteStatementInfo.f152411c = preparedStatementD.f152289f;
                        int iNativeGetColumnCount = nativeGetColumnCount(this.f152269j, preparedStatementD.f152286c);
                        if (iNativeGetColumnCount == 0) {
                            sQLiteStatementInfo.f152410b = f152258m;
                        } else {
                            sQLiteStatementInfo.f152410b = new String[iNativeGetColumnCount];
                            for (int i10 = 0; i10 < iNativeGetColumnCount; i10++) {
                                sQLiteStatementInfo.f152410b[i10] = nativeGetColumnName(this.f152269j, preparedStatementD.f152286c, i10);
                            }
                        }
                    } catch (Throwable th2) {
                        E(preparedStatementD);
                        throw th2;
                    }
                }
                E(preparedStatementD);
                this.f152268i.c(iA);
            } catch (RuntimeException e10) {
                this.f152268i.f(iA, e10);
                throw e10;
            }
        } catch (Throwable th3) {
            this.f152268i.c(iA);
            throw th3;
        }
    }

    void K(boolean z10) {
        this.f152270k = z10;
    }

    protected void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.f152261b;
            if (sQLiteConnectionPool != null && this.f152269j != 0) {
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
        int iNativeReKey = nativeReKey(this.f152269j, bArr);
        FS.log_i("SQLiteConnection", String.format("Database rekey operation returned:%s", Integer.valueOf(iNativeReKey)));
        if (iNativeReKey != 0) {
            throw new SQLiteException(String.format("Failed to rekey database, result code:%s", Integer.valueOf(iNativeReKey)));
        }
    }

    String k() {
        return this.f152268i.b();
    }

    public void n(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f152268i.a("execute", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        nativeExecute(this.f152269j, preparedStatementD.f152286c);
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (RuntimeException e10) {
                this.f152268i.f(iA, e10);
                throw e10;
            }
        } finally {
            this.f152268i.c(iA);
        }
    }

    public int o(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f152268i.a("executeForChangedRowCount", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        int iNativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.f152269j, preparedStatementD.f152286c);
                        if (this.f152268i.d(iA)) {
                            this.f152268i.h(iA, "changedRows=" + iNativeExecuteForChangedRowCount);
                        }
                        return iNativeExecuteForChangedRowCount;
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (Throwable th2) {
                if (this.f152268i.d(iA)) {
                    this.f152268i.h(iA, "changedRows=0");
                }
                throw th2;
            }
        } catch (RuntimeException e10) {
            this.f152268i.f(iA, e10);
            throw e10;
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        nativeCancel(this.f152269j);
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
        int iA = this.f152268i.a("executeForLastInsertedRowId", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        return nativeExecuteForLastInsertedRowId(this.f152269j, preparedStatementD.f152286c);
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (RuntimeException e10) {
                this.f152268i.f(iA, e10);
                throw e10;
            }
        } finally {
            this.f152268i.c(iA);
        }
    }

    public long r(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f152268i.a("executeForLong", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        return nativeExecuteForLong(this.f152269j, preparedStatementD.f152286c);
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (RuntimeException e10) {
                this.f152268i.f(iA, e10);
                throw e10;
            }
        } finally {
            this.f152268i.c(iA);
        }
    }

    public String s(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iA = this.f152268i.a("executeForString", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementD = d(str);
                try {
                    O(preparedStatementD);
                    g(preparedStatementD, objArr);
                    e(preparedStatementD);
                    f(cancellationSignal);
                    try {
                        return nativeExecuteForString(this.f152269j, preparedStatementD.f152286c);
                    } finally {
                        l(cancellationSignal);
                    }
                } finally {
                    E(preparedStatementD);
                }
            } catch (RuntimeException e10) {
                this.f152268i.f(iA, e10);
                throw e10;
            }
        } finally {
            this.f152268i.c(iA);
        }
    }

    public String toString() {
        return "SQLiteConnection: " + this.f152262c.f152348a + " (" + this.f152263d + ")";
    }

    boolean w(String str) {
        return this.f152266g.get(str) != null;
    }

    public boolean x() {
        return this.f152264e;
    }

    private SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i10, boolean z10) {
        CloseGuard closeGuardB = CloseGuard.b();
        this.f152260a = closeGuardB;
        this.f152268i = new OperationLog();
        this.f152261b = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.f152262c = sQLiteDatabaseConfiguration2;
        this.f152263d = i10;
        this.f152264e = z10;
        this.f152265f = (sQLiteDatabaseConfiguration.f152350c & 1) != 0;
        this.f152266g = new PreparedStatementCache(sQLiteDatabaseConfiguration2.f152351d);
        closeGuardB.c("close");
    }

    public static boolean u() {
        return nativeHasCodec();
    }
}
