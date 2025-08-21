package net.zetetic.database.sqlcipher;

import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import com.fullstory.FS;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes14.dex */
public final class SQLiteConnectionPool implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    private final SQLiteDatabaseConfiguration f152296d;

    /* renamed from: e, reason: collision with root package name */
    private int f152297e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f152298f;

    /* renamed from: g, reason: collision with root package name */
    private int f152299g;

    /* renamed from: h, reason: collision with root package name */
    private ConnectionWaiter f152300h;

    /* renamed from: i, reason: collision with root package name */
    private ConnectionWaiter f152301i;

    /* renamed from: k, reason: collision with root package name */
    private SQLiteConnection f152303k;

    /* renamed from: a, reason: collision with root package name */
    private final CloseGuard f152293a = CloseGuard.b();

    /* renamed from: b, reason: collision with root package name */
    private final Object f152294b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f152295c = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList<SQLiteConnection> f152302j = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> f152304l = new WeakHashMap<>();

    enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    private static final class ConnectionWaiter {

        /* renamed from: a, reason: collision with root package name */
        public ConnectionWaiter f152312a;

        /* renamed from: b, reason: collision with root package name */
        public Thread f152313b;

        /* renamed from: c, reason: collision with root package name */
        public long f152314c;

        /* renamed from: d, reason: collision with root package name */
        public int f152315d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f152316e;

        /* renamed from: f, reason: collision with root package name */
        public String f152317f;

        /* renamed from: g, reason: collision with root package name */
        public int f152318g;

        /* renamed from: h, reason: collision with root package name */
        public SQLiteConnection f152319h;

        /* renamed from: i, reason: collision with root package name */
        public RuntimeException f152320i;

        /* renamed from: j, reason: collision with root package name */
        public int f152321j;

        private ConnectionWaiter() {
        }
    }

    private static int u(int i10) {
        return (i10 & 4) != 0 ? 1 : 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m(false);
    }

    protected void finalize() throws Throwable {
        try {
            m(true);
        } finally {
            super.finalize();
        }
    }

    private ConnectionWaiter A(Thread thread, long j10, int i10, boolean z10, String str, int i11) {
        ConnectionWaiter connectionWaiter = this.f152300h;
        if (connectionWaiter != null) {
            this.f152300h = connectionWaiter.f152312a;
            connectionWaiter.f152312a = null;
        } else {
            connectionWaiter = new ConnectionWaiter();
        }
        connectionWaiter.f152313b = thread;
        connectionWaiter.f152314c = j10;
        connectionWaiter.f152315d = i10;
        connectionWaiter.f152316e = z10;
        connectionWaiter.f152317f = str;
        connectionWaiter.f152318g = i11;
        return connectionWaiter;
    }

    public static SQLiteConnectionPool D(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
        sQLiteConnectionPool.H();
        return sQLiteConnectionPool;
    }

    private void H() {
        this.f152303k = J(this.f152296d, true);
        this.f152298f = true;
        this.f152293a.c("close");
    }

    private SQLiteConnection J(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z10) {
        int i10 = this.f152299g;
        this.f152299g = i10 + 1;
        return SQLiteConnection.z(this, sQLiteDatabaseConfiguration, i10, z10);
    }

    private void O() {
        SQLiteConnection sQLiteConnection = this.f152303k;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.C(this.f152296d);
            } catch (RuntimeException e10) {
                FS.log_e("SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.f152303k, e10);
                i(this.f152303k);
                this.f152303k = null;
            }
        }
        int size = this.f152302j.size();
        int i10 = 0;
        while (i10 < size) {
            SQLiteConnection sQLiteConnection2 = this.f152302j.get(i10);
            try {
                sQLiteConnection2.C(this.f152296d);
            } catch (RuntimeException e11) {
                FS.log_e("SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e11);
                i(sQLiteConnection2);
                this.f152302j.remove(i10);
                size += -1;
                i10--;
            }
            i10++;
        }
        z(AcquiredConnectionStatus.RECONFIGURE);
    }

    private boolean R(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.C(this.f152296d);
            } catch (RuntimeException e10) {
                FS.log_e("SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e10);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        i(sQLiteConnection);
        return false;
    }

    private void T(ConnectionWaiter connectionWaiter) {
        connectionWaiter.f152312a = this.f152300h;
        connectionWaiter.f152313b = null;
        connectionWaiter.f152317f = null;
        connectionWaiter.f152319h = null;
        connectionWaiter.f152320i = null;
        connectionWaiter.f152321j++;
        this.f152300h = connectionWaiter;
    }

    private void b0() {
        if ((this.f152296d.f152350c & 536870912) != 0) {
            this.f152297e = SQLiteGlobal.f();
        } else {
            this.f152297e = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.f152319h == null && connectionWaiter.f152320i == null) {
            ConnectionWaiter connectionWaiter2 = null;
            for (ConnectionWaiter connectionWaiter3 = this.f152301i; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.f152312a) {
                connectionWaiter2 = connectionWaiter3;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.f152312a = connectionWaiter.f152312a;
            } else {
                this.f152301i = connectionWaiter.f152312a;
            }
            connectionWaiter.f152320i = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.f152313b);
            m0();
        }
    }

    private void e0() {
        if (!this.f152298f) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    private void h() {
        int size = this.f152302j.size();
        for (int i10 = 0; i10 < size; i10++) {
            i(this.f152302j.get(i10));
        }
        this.f152302j.clear();
    }

    private SQLiteConnection h0(String str, int i10) {
        int size = this.f152302j.size();
        if (size > 1 && str != null) {
            for (int i11 = 0; i11 < size; i11++) {
                SQLiteConnection sQLiteConnection = this.f152302j.get(i11);
                if (sQLiteConnection.w(str)) {
                    this.f152302j.remove(i11);
                    p(sQLiteConnection, i10);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnectionRemove = this.f152302j.remove(size - 1);
            p(sQLiteConnectionRemove, i10);
            return sQLiteConnectionRemove;
        }
        int size2 = this.f152304l.size();
        if (this.f152303k != null) {
            size2++;
        }
        if (size2 >= this.f152297e) {
            return null;
        }
        SQLiteConnection sQLiteConnectionJ = J(this.f152296d, false);
        p(sQLiteConnectionJ, i10);
        return sQLiteConnectionJ;
    }

    private void j() {
        int size = this.f152302j.size();
        while (true) {
            int i10 = size - 1;
            if (size <= this.f152297e - 1) {
                return;
            }
            i(this.f152302j.remove(i10));
            size = i10;
        }
    }

    private SQLiteConnection j0(int i10) {
        SQLiteConnection sQLiteConnection = this.f152303k;
        if (sQLiteConnection != null) {
            this.f152303k = null;
            p(sQLiteConnection, i10);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it = this.f152304l.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().x()) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionJ = J(this.f152296d, true);
        p(sQLiteConnectionJ, i10);
        return sQLiteConnectionJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private net.zetetic.database.sqlcipher.SQLiteConnection k0(java.lang.String r18, int r19, android.os.CancellationSignal r20) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.zetetic.database.sqlcipher.SQLiteConnectionPool.k0(java.lang.String, int, android.os.CancellationSignal):net.zetetic.database.sqlcipher.SQLiteConnection");
    }

    private void l() {
        z(AcquiredConnectionStatus.DISCARD);
    }

    private void m(boolean z10) {
        CloseGuard closeGuard = this.f152293a;
        if (closeGuard != null) {
            if (z10) {
                closeGuard.d();
            }
            this.f152293a.a();
        }
        if (z10) {
            return;
        }
        synchronized (this.f152294b) {
            try {
                e0();
                this.f152298f = false;
                g();
                int size = this.f152304l.size();
                if (size != 0) {
                    FS.log_i("SQLiteConnectionPool", "The connection pool for " + this.f152296d.f152349b + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                }
                m0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m0() {
        SQLiteConnection sQLiteConnectionJ0;
        ConnectionWaiter connectionWaiter = this.f152301i;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z10 = false;
        boolean z11 = false;
        while (connectionWaiter != null) {
            boolean z12 = true;
            if (this.f152298f) {
                try {
                    if (connectionWaiter.f152316e || z10) {
                        sQLiteConnectionJ0 = null;
                    } else {
                        sQLiteConnectionJ0 = h0(connectionWaiter.f152317f, connectionWaiter.f152318g);
                        if (sQLiteConnectionJ0 == null) {
                            z10 = true;
                        }
                    }
                    if (sQLiteConnectionJ0 == null && !z11 && (sQLiteConnectionJ0 = j0(connectionWaiter.f152318g)) == null) {
                        z11 = true;
                    }
                    if (sQLiteConnectionJ0 != null) {
                        connectionWaiter.f152319h = sQLiteConnectionJ0;
                    } else if (z10 && z11) {
                        return;
                    } else {
                        z12 = false;
                    }
                } catch (RuntimeException e10) {
                    connectionWaiter.f152320i = e10;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.f152312a;
            if (z12) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.f152312a = connectionWaiter3;
                } else {
                    this.f152301i = connectionWaiter3;
                }
                connectionWaiter.f152312a = null;
                LockSupport.unpark(connectionWaiter.f152313b);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    private void p(SQLiteConnection sQLiteConnection, int i10) {
        try {
            sQLiteConnection.K((i10 & 1) != 0);
            this.f152304l.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e10) {
            FS.log_e("SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i10);
            i(sQLiteConnection);
            throw e10;
        }
    }

    private void z(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.f152304l.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f152304l.size());
        for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.f152304l.entrySet()) {
            AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f152304l.put((SQLiteConnection) arrayList.get(i10), acquiredConnectionStatus);
        }
    }

    void B() {
        FS.log_w("SQLiteConnectionPool", "A SQLiteConnection object for database '" + this.f152296d.f152349b + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.f152295c.set(true);
    }

    public void K(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.f152294b) {
            try {
                e0();
                boolean z10 = ((sQLiteDatabaseConfiguration.f152350c ^ this.f152296d.f152350c) & 536870912) != 0;
                if (z10) {
                    if (!this.f152304l.isEmpty()) {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    h();
                }
                if (sQLiteDatabaseConfiguration.f152353f != this.f152296d.f152353f && !this.f152304l.isEmpty()) {
                    throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                if (!Arrays.equals(sQLiteDatabaseConfiguration.f152354g, this.f152296d.f152354g)) {
                    this.f152303k.i(sQLiteDatabaseConfiguration.f152354g);
                    this.f152296d.c(sQLiteDatabaseConfiguration);
                    h();
                    O();
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f152296d;
                if (sQLiteDatabaseConfiguration2.f152350c != sQLiteDatabaseConfiguration.f152350c) {
                    if (z10) {
                        g();
                    }
                    SQLiteConnection sQLiteConnectionJ = J(sQLiteDatabaseConfiguration, true);
                    g();
                    l();
                    this.f152303k = sQLiteConnectionJ;
                    this.f152296d.c(sQLiteDatabaseConfiguration);
                    b0();
                } else {
                    sQLiteDatabaseConfiguration2.c(sQLiteDatabaseConfiguration);
                    b0();
                    j();
                    O();
                }
                m0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void Y(SQLiteConnection sQLiteConnection) {
        synchronized (this.f152294b) {
            try {
                AcquiredConnectionStatus acquiredConnectionStatusRemove = this.f152304l.remove(sQLiteConnection);
                if (acquiredConnectionStatusRemove == null) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.f152298f) {
                    i(sQLiteConnection);
                } else if (sQLiteConnection.x()) {
                    if (R(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.f152303k = sQLiteConnection;
                    }
                    m0();
                } else if (this.f152302j.size() >= this.f152297e - 1) {
                    i(sQLiteConnection);
                } else {
                    if (R(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.f152302j.add(sQLiteConnection);
                    }
                    m0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "SQLiteConnectionPool: " + this.f152296d.f152348a;
    }

    private SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f152296d = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        b0();
    }

    private void g() {
        h();
        SQLiteConnection sQLiteConnection = this.f152303k;
        if (sQLiteConnection != null) {
            i(sQLiteConnection);
            this.f152303k = null;
        }
    }

    private void i(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.j();
        } catch (RuntimeException e10) {
            FS.log_e("SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection, e10);
        }
    }

    private void w(long j10, int i10) {
        int i11;
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The connection pool for database '");
        sb2.append(this.f152296d.f152349b);
        sb2.append("' has been unable to grant a connection to thread ");
        sb2.append(threadCurrentThread.getId());
        sb2.append(" (");
        sb2.append(threadCurrentThread.getName());
        sb2.append(") ");
        sb2.append("with flags 0x");
        sb2.append(Integer.toHexString(i10));
        sb2.append(" for ");
        sb2.append(j10 * 0.001f);
        sb2.append(" seconds.\n");
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        if (!this.f152304l.isEmpty()) {
            Iterator<SQLiteConnection> it = this.f152304l.keySet().iterator();
            i11 = 0;
            while (it.hasNext()) {
                String strK = it.next().k();
                if (strK != null) {
                    arrayList.add(strK);
                    i12++;
                } else {
                    i11++;
                }
            }
        } else {
            i11 = 0;
        }
        int size = this.f152302j.size();
        if (this.f152303k != null) {
            size++;
        }
        sb2.append("Connections: ");
        sb2.append(i12);
        sb2.append(" active, ");
        sb2.append(i11);
        sb2.append(" idle, ");
        sb2.append(size);
        sb2.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb2.append("\nRequests in progress:\n");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                sb2.append("  ");
                sb2.append(str);
                sb2.append("\n");
            }
        }
        FS.log_w("SQLiteConnectionPool", sb2.toString());
    }

    public SQLiteConnection c(String str, int i10, CancellationSignal cancellationSignal) {
        return k0(str, i10, cancellationSignal);
    }
}
