package bb;

import Nb.j;
import eb.C13784a;
import eb.C13785b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f60239d = C13785b.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private ThreadFactory f60240a;

    /* renamed from: b, reason: collision with root package name */
    protected Thread f60241b;

    /* renamed from: c, reason: collision with root package name */
    protected AtomicBoolean f60242c;

    public void b(Throwable th2) {
    }

    public abstract void c(AtomicBoolean atomicBoolean) throws Exception;

    public abstract String e();

    public void f() {
    }

    public final synchronized void g() {
        try {
            if (this.f60241b == null && this.f60242c == null) {
                try {
                    this.f60242c = new AtomicBoolean(false);
                    if (this.f60240a == null) {
                        this.f60240a = new j(e());
                    }
                    Thread threadNewThread = this.f60240a.newThread(this);
                    this.f60241b = threadNewThread;
                    threadNewThread.start();
                    h();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void i() {
        AtomicBoolean atomicBoolean;
        if (this.f60241b != null && (atomicBoolean = this.f60242c) != null && !atomicBoolean.get()) {
            this.f60242c.set(true);
            this.f60241b.interrupt();
            this.f60241b = null;
            this.f60242c = null;
        }
    }

    public final synchronized boolean j() {
        AtomicBoolean atomicBoolean = this.f60242c;
        if (atomicBoolean != null) {
            if (atomicBoolean.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicBoolean atomicBoolean = this.f60242c;
        try {
            try {
                c(atomicBoolean);
                f();
                synchronized (this) {
                    try {
                        if (this.f60242c == atomicBoolean) {
                            this.f60241b = null;
                            this.f60242c = null;
                        }
                        notifyAll();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    try {
                        if (this.f60242c == atomicBoolean) {
                            this.f60241b = null;
                            this.f60242c = null;
                        }
                        notifyAll();
                        throw th2;
                    } finally {
                    }
                }
            }
        } catch (Error e10) {
            b(e10);
            throw e10;
        } catch (InterruptedException e11) {
            b(e11);
            synchronized (this) {
                try {
                    if (this.f60242c == atomicBoolean) {
                        this.f60241b = null;
                        this.f60242c = null;
                    }
                    notifyAll();
                } finally {
                }
            }
        } catch (Exception e12) {
            b(e12);
            synchronized (this) {
                try {
                    if (this.f60242c == atomicBoolean) {
                        this.f60241b = null;
                        this.f60242c = null;
                    }
                    notifyAll();
                } finally {
                }
            }
        }
    }

    public void h() {
        e();
    }
}
