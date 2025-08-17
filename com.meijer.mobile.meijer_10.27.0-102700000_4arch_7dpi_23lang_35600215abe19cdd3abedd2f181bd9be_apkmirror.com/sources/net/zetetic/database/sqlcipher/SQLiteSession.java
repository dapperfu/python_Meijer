package net.zetetic.database.sqlcipher;

import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.os.CancellationSignal;

/* loaded from: classes13.dex */
public final class SQLiteSession {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteConnectionPool f151389a;

    /* renamed from: b, reason: collision with root package name */
    private SQLiteConnection f151390b;

    /* renamed from: c, reason: collision with root package name */
    private int f151391c;

    /* renamed from: d, reason: collision with root package name */
    private int f151392d;

    /* renamed from: e, reason: collision with root package name */
    private Transaction f151393e;

    /* renamed from: f, reason: collision with root package name */
    private Transaction f151394f;

    private static final class Transaction {

        /* renamed from: a, reason: collision with root package name */
        public Transaction f151395a;

        /* renamed from: b, reason: collision with root package name */
        public int f151396b;

        /* renamed from: c, reason: collision with root package name */
        public SQLiteTransactionListener f151397c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f151398d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f151399e;

        private Transaction() {
        }
    }

    private void a(String str, int i10, CancellationSignal cancellationSignal) {
        if (this.f151390b == null) {
            this.f151390b = this.f151389a.c(str, i10, cancellationSignal);
            this.f151391c = i10;
        }
        this.f151392d++;
    }

    private void c(int i10, SQLiteTransactionListener sQLiteTransactionListener, int i11, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.f151394f == null) {
            a(null, i11, cancellationSignal);
        }
        try {
            if (this.f151394f == null) {
                if (i10 == 1) {
                    this.f151390b.n("BEGIN IMMEDIATE;", null, cancellationSignal);
                } else if (i10 != 2) {
                    this.f151390b.n("BEGIN;", null, cancellationSignal);
                } else {
                    this.f151390b.n("BEGIN EXCLUSIVE;", null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (RuntimeException e10) {
                    if (this.f151394f == null) {
                        this.f151390b.n("ROLLBACK;", null, cancellationSignal);
                    }
                    throw e10;
                }
            }
            Transaction transactionM = m(i10, sQLiteTransactionListener);
            transactionM.f151395a = this.f151394f;
            this.f151394f = transactionM;
        } catch (Throwable th2) {
            if (this.f151394f == null) {
                p();
            }
            throw th2;
        }
    }

    private void e(CancellationSignal cancellationSignal, boolean z10) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.f151394f;
        boolean z11 = false;
        boolean z12 = (transaction.f151398d || z10) && !transaction.f151399e;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.f151397c;
        if (sQLiteTransactionListener != null) {
            try {
                if (z12) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
                z11 = z12;
                e = null;
            } catch (RuntimeException e10) {
                e = e10;
            }
        } else {
            z11 = z12;
            e = null;
        }
        this.f151394f = transaction.f151395a;
        o(transaction);
        Transaction transaction2 = this.f151394f;
        if (transaction2 == null) {
            try {
                if (z11) {
                    this.f151390b.n("COMMIT;", null, cancellationSignal);
                } else {
                    this.f151390b.n("ROLLBACK;", null, cancellationSignal);
                }
                p();
            } catch (Throwable th2) {
                p();
                throw th2;
            }
        } else if (!z11) {
            transaction2.f151399e = true;
        }
        if (e != null) {
            throw e;
        }
    }

    private boolean k(String str, Object[] objArr, int i10, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            b(2, null, i10, cancellationSignal);
            return true;
        }
        if (sqlStatementType == 5) {
            q();
            d(cancellationSignal);
            return true;
        }
        if (sqlStatementType != 6) {
            return false;
        }
        d(cancellationSignal);
        return true;
    }

    private Transaction m(int i10, SQLiteTransactionListener sQLiteTransactionListener) {
        Transaction transaction = this.f151393e;
        if (transaction != null) {
            this.f151393e = transaction.f151395a;
            transaction.f151395a = null;
            transaction.f151398d = false;
            transaction.f151399e = false;
        } else {
            transaction = new Transaction();
        }
        transaction.f151396b = i10;
        transaction.f151397c = sQLiteTransactionListener;
        return transaction;
    }

    private void o(Transaction transaction) {
        transaction.f151395a = this.f151393e;
        transaction.f151397c = null;
        this.f151393e = transaction;
    }

    private void p() {
        int i10 = this.f151392d - 1;
        this.f151392d = i10;
        if (i10 == 0) {
            try {
                this.f151389a.Z(this.f151390b);
            } finally {
                this.f151390b = null;
            }
        }
    }

    private void r() {
        if (this.f151394f == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    private void s() {
        Transaction transaction = this.f151394f;
        if (transaction != null && transaction.f151398d) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    public void f(String str, Object[] objArr, int i10, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (k(str, objArr, i10, cancellationSignal)) {
            return;
        }
        a(str, i10, cancellationSignal);
        try {
            this.f151390b.n(str, objArr, cancellationSignal);
        } finally {
            p();
        }
    }

    public int g(String str, Object[] objArr, int i10, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (k(str, objArr, i10, cancellationSignal)) {
            return 0;
        }
        a(str, i10, cancellationSignal);
        try {
            return this.f151390b.o(str, objArr, cancellationSignal);
        } finally {
            p();
        }
    }

    public int h(String str, Object[] objArr, CursorWindow cursorWindow, int i10, int i11, boolean z10, int i12, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        if (k(str, objArr, i12, cancellationSignal)) {
            cursorWindow.clear();
            return 0;
        }
        a(str, i12, cancellationSignal);
        try {
            return this.f151390b.p(str, objArr, cursorWindow, i10, i11, z10, cancellationSignal);
        } finally {
            p();
        }
    }

    public long i(String str, Object[] objArr, int i10, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (k(str, objArr, i10, cancellationSignal)) {
            return 0L;
        }
        a(str, i10, cancellationSignal);
        try {
            return this.f151390b.q(str, objArr, cancellationSignal);
        } finally {
            p();
        }
    }

    public long j(String str, Object[] objArr, int i10, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (k(str, objArr, i10, cancellationSignal)) {
            return 0L;
        }
        a(str, i10, cancellationSignal);
        try {
            return this.f151390b.r(str, objArr, cancellationSignal);
        } finally {
            p();
        }
    }

    public boolean l() {
        return this.f151394f != null;
    }

    public void n(String str, int i10, CancellationSignal cancellationSignal, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        a(str, i10, cancellationSignal);
        try {
            this.f151390b.B(str, sQLiteStatementInfo);
        } finally {
            p();
        }
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool != null) {
            this.f151389a = sQLiteConnectionPool;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    public void b(int i10, SQLiteTransactionListener sQLiteTransactionListener, int i11, CancellationSignal cancellationSignal) {
        s();
        c(i10, sQLiteTransactionListener, i11, cancellationSignal);
    }

    public void d(CancellationSignal cancellationSignal) {
        r();
        e(cancellationSignal, false);
    }

    public void q() {
        r();
        s();
        this.f151394f.f151398d = true;
    }
}
