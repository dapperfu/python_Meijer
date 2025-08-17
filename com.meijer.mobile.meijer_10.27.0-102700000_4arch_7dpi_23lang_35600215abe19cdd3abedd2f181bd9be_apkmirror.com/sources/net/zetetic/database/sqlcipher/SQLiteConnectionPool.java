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

/* loaded from: classes13.dex */
public final class SQLiteConnectionPool implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    private final SQLiteDatabaseConfiguration f151287d;

    /* renamed from: e, reason: collision with root package name */
    private int f151288e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f151289f;

    /* renamed from: g, reason: collision with root package name */
    private int f151290g;

    /* renamed from: h, reason: collision with root package name */
    private ConnectionWaiter f151291h;

    /* renamed from: i, reason: collision with root package name */
    private ConnectionWaiter f151292i;

    /* renamed from: k, reason: collision with root package name */
    private SQLiteConnection f151294k;

    /* renamed from: a, reason: collision with root package name */
    private final CloseGuard f151284a = CloseGuard.b();

    /* renamed from: b, reason: collision with root package name */
    private final Object f151285b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f151286c = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList<SQLiteConnection> f151293j = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> f151295l = new WeakHashMap<>();

    enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    private static final class ConnectionWaiter {

        /* renamed from: a, reason: collision with root package name */
        public ConnectionWaiter f151303a;

        /* renamed from: b, reason: collision with root package name */
        public Thread f151304b;

        /* renamed from: c, reason: collision with root package name */
        public long f151305c;

        /* renamed from: d, reason: collision with root package name */
        public int f151306d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f151307e;

        /* renamed from: f, reason: collision with root package name */
        public String f151308f;

        /* renamed from: g, reason: collision with root package name */
        public int f151309g;

        /* renamed from: h, reason: collision with root package name */
        public SQLiteConnection f151310h;

        /* renamed from: i, reason: collision with root package name */
        public RuntimeException f151311i;

        /* renamed from: j, reason: collision with root package name */
        public int f151312j;

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
        ConnectionWaiter connectionWaiter = this.f151291h;
        if (connectionWaiter != null) {
            this.f151291h = connectionWaiter.f151303a;
            connectionWaiter.f151303a = null;
        } else {
            connectionWaiter = new ConnectionWaiter();
        }
        connectionWaiter.f151304b = thread;
        connectionWaiter.f151305c = j10;
        connectionWaiter.f151306d = i10;
        connectionWaiter.f151307e = z10;
        connectionWaiter.f151308f = str;
        connectionWaiter.f151309g = i11;
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
        this.f151294k = J(this.f151287d, true);
        this.f151289f = true;
        this.f151284a.c("close");
    }

    private SQLiteConnection J(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z10) {
        int i10 = this.f151290g;
        this.f151290g = i10 + 1;
        return SQLiteConnection.z(this, sQLiteDatabaseConfiguration, i10, z10);
    }

    private void O() {
        SQLiteConnection sQLiteConnection = this.f151294k;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.C(this.f151287d);
            } catch (RuntimeException e10) {
                FS.log_e("SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.f151294k, e10);
                i(this.f151294k);
                this.f151294k = null;
            }
        }
        int size = this.f151293j.size();
        int i10 = 0;
        while (i10 < size) {
            SQLiteConnection sQLiteConnection2 = this.f151293j.get(i10);
            try {
                sQLiteConnection2.C(this.f151287d);
            } catch (RuntimeException e11) {
                FS.log_e("SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e11);
                i(sQLiteConnection2);
                this.f151293j.remove(i10);
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
                sQLiteConnection.C(this.f151287d);
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
        connectionWaiter.f151303a = this.f151291h;
        connectionWaiter.f151304b = null;
        connectionWaiter.f151308f = null;
        connectionWaiter.f151310h = null;
        connectionWaiter.f151311i = null;
        connectionWaiter.f151312j++;
        this.f151291h = connectionWaiter;
    }

    private void c0() {
        if ((this.f151287d.f151341c & 536870912) != 0) {
            this.f151288e = SQLiteGlobal.f();
        } else {
            this.f151288e = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.f151310h == null && connectionWaiter.f151311i == null) {
            ConnectionWaiter connectionWaiter2 = null;
            for (ConnectionWaiter connectionWaiter3 = this.f151292i; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.f151303a) {
                connectionWaiter2 = connectionWaiter3;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.f151303a = connectionWaiter.f151303a;
            } else {
                this.f151292i = connectionWaiter.f151303a;
            }
            connectionWaiter.f151311i = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.f151304b);
            l0();
        }
    }

    private void e0() {
        if (!this.f151289f) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    private void h() {
        int size = this.f151293j.size();
        for (int i10 = 0; i10 < size; i10++) {
            i(this.f151293j.get(i10));
        }
        this.f151293j.clear();
    }

    private SQLiteConnection h0(String str, int i10) {
        int size = this.f151293j.size();
        if (size > 1 && str != null) {
            for (int i11 = 0; i11 < size; i11++) {
                SQLiteConnection sQLiteConnection = this.f151293j.get(i11);
                if (sQLiteConnection.w(str)) {
                    this.f151293j.remove(i11);
                    p(sQLiteConnection, i10);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnectionRemove = this.f151293j.remove(size - 1);
            p(sQLiteConnectionRemove, i10);
            return sQLiteConnectionRemove;
        }
        int size2 = this.f151295l.size();
        if (this.f151294k != null) {
            size2++;
        }
        if (size2 >= this.f151288e) {
            return null;
        }
        SQLiteConnection sQLiteConnectionJ = J(this.f151287d, false);
        p(sQLiteConnectionJ, i10);
        return sQLiteConnectionJ;
    }

    private SQLiteConnection i0(int i10) {
        SQLiteConnection sQLiteConnection = this.f151294k;
        if (sQLiteConnection != null) {
            this.f151294k = null;
            p(sQLiteConnection, i10);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it = this.f151295l.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().x()) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionJ = J(this.f151287d, true);
        p(sQLiteConnectionJ, i10);
        return sQLiteConnectionJ;
    }

    private void j() {
        int size = this.f151293j.size();
        while (true) {
            int i10 = size - 1;
            if (size <= this.f151288e - 1) {
                return;
            }
            i(this.f151293j.remove(i10));
            size = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private net.zetetic.database.sqlcipher.SQLiteConnection j0(java.lang.String r18, int r19, android.os.CancellationSignal r20) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.zetetic.database.sqlcipher.SQLiteConnectionPool.j0(java.lang.String, int, android.os.CancellationSignal):net.zetetic.database.sqlcipher.SQLiteConnection");
    }

    private void l() {
        z(AcquiredConnectionStatus.DISCARD);
    }

    private void l0() {
        SQLiteConnection sQLiteConnectionI0;
        ConnectionWaiter connectionWaiter = this.f151292i;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z10 = false;
        boolean z11 = false;
        while (connectionWaiter != null) {
            boolean z12 = true;
            if (this.f151289f) {
                try {
                    if (connectionWaiter.f151307e || z10) {
                        sQLiteConnectionI0 = null;
                    } else {
                        sQLiteConnectionI0 = h0(connectionWaiter.f151308f, connectionWaiter.f151309g);
                        if (sQLiteConnectionI0 == null) {
                            z10 = true;
                        }
                    }
                    if (sQLiteConnectionI0 == null && !z11 && (sQLiteConnectionI0 = i0(connectionWaiter.f151309g)) == null) {
                        z11 = true;
                    }
                    if (sQLiteConnectionI0 != null) {
                        connectionWaiter.f151310h = sQLiteConnectionI0;
                    } else if (z10 && z11) {
                        return;
                    } else {
                        z12 = false;
                    }
                } catch (RuntimeException e10) {
                    connectionWaiter.f151311i = e10;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.f151303a;
            if (z12) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.f151303a = connectionWaiter3;
                } else {
                    this.f151292i = connectionWaiter3;
                }
                connectionWaiter.f151303a = null;
                LockSupport.unpark(connectionWaiter.f151304b);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    private void m(boolean z10) {
        CloseGuard closeGuard = this.f151284a;
        if (closeGuard != null) {
            if (z10) {
                closeGuard.d();
            }
            this.f151284a.a();
        }
        if (z10) {
            return;
        }
        synchronized (this.f151285b) {
            try {
                e0();
                this.f151289f = false;
                g();
                int size = this.f151295l.size();
                if (size != 0) {
                    FS.log_i("SQLiteConnectionPool", "The connection pool for " + this.f151287d.f151340b + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                }
                l0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void p(SQLiteConnection sQLiteConnection, int i10) {
        try {
            sQLiteConnection.K((i10 & 1) != 0);
            this.f151295l.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e10) {
            FS.log_e("SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i10);
            i(sQLiteConnection);
            throw e10;
        }
    }

    private void z(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.f151295l.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f151295l.size());
        for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.f151295l.entrySet()) {
            AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f151295l.put((SQLiteConnection) arrayList.get(i10), acquiredConnectionStatus);
        }
    }

    void B() {
        FS.log_w("SQLiteConnectionPool", "A SQLiteConnection object for database '" + this.f151287d.f151340b + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.f151286c.set(true);
    }

    public void K(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.f151285b) {
            try {
                e0();
                boolean z10 = ((sQLiteDatabaseConfiguration.f151341c ^ this.f151287d.f151341c) & 536870912) != 0;
                if (z10) {
                    if (!this.f151295l.isEmpty()) {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    h();
                }
                if (sQLiteDatabaseConfiguration.f151344f != this.f151287d.f151344f && !this.f151295l.isEmpty()) {
                    throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                if (!Arrays.equals(sQLiteDatabaseConfiguration.f151345g, this.f151287d.f151345g)) {
                    this.f151294k.i(sQLiteDatabaseConfiguration.f151345g);
                    this.f151287d.c(sQLiteDatabaseConfiguration);
                    h();
                    O();
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f151287d;
                if (sQLiteDatabaseConfiguration2.f151341c != sQLiteDatabaseConfiguration.f151341c) {
                    if (z10) {
                        g();
                    }
                    SQLiteConnection sQLiteConnectionJ = J(sQLiteDatabaseConfiguration, true);
                    g();
                    l();
                    this.f151294k = sQLiteConnectionJ;
                    this.f151287d.c(sQLiteDatabaseConfiguration);
                    c0();
                } else {
                    sQLiteDatabaseConfiguration2.c(sQLiteDatabaseConfiguration);
                    c0();
                    j();
                    O();
                }
                l0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void Z(SQLiteConnection sQLiteConnection) {
        synchronized (this.f151285b) {
            try {
                AcquiredConnectionStatus acquiredConnectionStatusRemove = this.f151295l.remove(sQLiteConnection);
                if (acquiredConnectionStatusRemove == null) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.f151289f) {
                    i(sQLiteConnection);
                } else if (sQLiteConnection.x()) {
                    if (R(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.f151294k = sQLiteConnection;
                    }
                    l0();
                } else if (this.f151293j.size() >= this.f151288e - 1) {
                    i(sQLiteConnection);
                } else {
                    if (R(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.f151293j.add(sQLiteConnection);
                    }
                    l0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "SQLiteConnectionPool: " + this.f151287d.f151339a;
    }

    private SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f151287d = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        c0();
    }

    private void g() {
        h();
        SQLiteConnection sQLiteConnection = this.f151294k;
        if (sQLiteConnection != null) {
            i(sQLiteConnection);
            this.f151294k = null;
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
        sb2.append(this.f151287d.f151340b);
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
        if (!this.f151295l.isEmpty()) {
            Iterator<SQLiteConnection> it = this.f151295l.keySet().iterator();
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
        int size = this.f151293j.size();
        if (this.f151294k != null) {
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
        return j0(str, i10, cancellationSignal);
    }
}
