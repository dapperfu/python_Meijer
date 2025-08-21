package net.zetetic.database.sqlcipher;

import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.os.CancellationSignal;

/* loaded from: classes14.dex */
public final class SQLiteSession {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteConnectionPool f152398a;

    /* renamed from: b, reason: collision with root package name */
    private SQLiteConnection f152399b;

    /* renamed from: c, reason: collision with root package name */
    private int f152400c;

    /* renamed from: d, reason: collision with root package name */
    private int f152401d;

    /* renamed from: e, reason: collision with root package name */
    private Transaction f152402e;

    /* renamed from: f, reason: collision with root package name */
    private Transaction f152403f;

    private static final class Transaction {

        /* renamed from: a, reason: collision with root package name */
        public Transaction f152404a;

        /* renamed from: b, reason: collision with root package name */
        public int f152405b;

        /* renamed from: c, reason: collision with root package name */
        public SQLiteTransactionListener f152406c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f152407d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f152408e;

        private Transaction() {
        }
    }

    private void a(String str, int i10, CancellationSignal cancellationSignal) {
        if (this.f152399b == null) {
            this.f152399b = this.f152398a.c(str, i10, cancellationSignal);
            this.f152400c = i10;
        }
        this.f152401d++;
    }

    private void c(int i10, SQLiteTransactionListener sQLiteTransactionListener, int i11, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.f152403f == null) {
            a(null, i11, cancellationSignal);
        }
        try {
            if (this.f152403f == null) {
                if (i10 == 1) {
                    this.f152399b.n("BEGIN IMMEDIATE;", null, cancellationSignal);
                } else if (i10 != 2) {
                    this.f152399b.n("BEGIN;", null, cancellationSignal);
                } else {
                    this.f152399b.n("BEGIN EXCLUSIVE;", null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (RuntimeException e10) {
                    if (this.f152403f == null) {
                        this.f152399b.n("ROLLBACK;", null, cancellationSignal);
                    }
                    throw e10;
                }
            }
            Transaction transactionM = m(i10, sQLiteTransactionListener);
            transactionM.f152404a = this.f152403f;
            this.f152403f = transactionM;
        } catch (Throwable th2) {
            if (this.f152403f == null) {
                p();
            }
            throw th2;
        }
    }

    private void e(CancellationSignal cancellationSignal, boolean z10) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.f152403f;
        boolean z11 = false;
        boolean z12 = (transaction.f152407d || z10) && !transaction.f152408e;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.f152406c;
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
        this.f152403f = transaction.f152404a;
        o(transaction);
        Transaction transaction2 = this.f152403f;
        if (transaction2 == null) {
            try {
                if (z11) {
                    this.f152399b.n("COMMIT;", null, cancellationSignal);
                } else {
                    this.f152399b.n("ROLLBACK;", null, cancellationSignal);
                }
                p();
            } catch (Throwable th2) {
                p();
                throw th2;
            }
        } else if (!z11) {
            transaction2.f152408e = true;
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
        Transaction transaction = this.f152402e;
        if (transaction != null) {
            this.f152402e = transaction.f152404a;
            transaction.f152404a = null;
            transaction.f152407d = false;
            transaction.f152408e = false;
        } else {
            transaction = new Transaction();
        }
        transaction.f152405b = i10;
        transaction.f152406c = sQLiteTransactionListener;
        return transaction;
    }

    private void o(Transaction transaction) {
        transaction.f152404a = this.f152402e;
        transaction.f152406c = null;
        this.f152402e = transaction;
    }

    private void p() {
        int i10 = this.f152401d - 1;
        this.f152401d = i10;
        if (i10 == 0) {
            try {
                this.f152398a.Y(this.f152399b);
            } finally {
                this.f152399b = null;
            }
        }
    }

    private void r() {
        if (this.f152403f == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    private void s() {
        Transaction transaction = this.f152403f;
        if (transaction != null && transaction.f152407d) {
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
            this.f152399b.n(str, objArr, cancellationSignal);
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
            return this.f152399b.o(str, objArr, cancellationSignal);
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
            return this.f152399b.p(str, objArr, cursorWindow, i10, i11, z10, cancellationSignal);
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
            return this.f152399b.q(str, objArr, cancellationSignal);
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
            return this.f152399b.r(str, objArr, cancellationSignal);
        } finally {
            p();
        }
    }

    public boolean l() {
        return this.f152403f != null;
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
            this.f152399b.B(str, sQLiteStatementInfo);
        } finally {
            p();
        }
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool != null) {
            this.f152398a = sQLiteConnectionPool;
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
        this.f152403f.f152407d = true;
    }
}
