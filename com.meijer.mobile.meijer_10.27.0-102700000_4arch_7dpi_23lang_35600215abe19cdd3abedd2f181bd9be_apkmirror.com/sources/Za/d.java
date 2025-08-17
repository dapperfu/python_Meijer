package Za;

import Lb.j;
import cb.C6380a;
import cb.C6381b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f42572d = C6381b.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private ThreadFactory f42573a;

    /* renamed from: b, reason: collision with root package name */
    protected Thread f42574b;

    /* renamed from: c, reason: collision with root package name */
    protected AtomicBoolean f42575c;

    public void b(Throwable th2) {
    }

    public abstract void c(AtomicBoolean atomicBoolean) throws Exception;

    public abstract String e();

    public void f() {
    }

    public final synchronized void g() {
        try {
            if (this.f42574b == null && this.f42575c == null) {
                try {
                    this.f42575c = new AtomicBoolean(false);
                    if (this.f42573a == null) {
                        this.f42573a = new j(e());
                    }
                    Thread threadNewThread = this.f42573a.newThread(this);
                    this.f42574b = threadNewThread;
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
        if (this.f42574b != null && (atomicBoolean = this.f42575c) != null && !atomicBoolean.get()) {
            this.f42575c.set(true);
            this.f42574b.interrupt();
            this.f42574b = null;
            this.f42575c = null;
        }
    }

    public final synchronized boolean j() {
        AtomicBoolean atomicBoolean = this.f42575c;
        if (atomicBoolean != null) {
            if (atomicBoolean.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicBoolean atomicBoolean = this.f42575c;
        try {
            try {
                c(atomicBoolean);
                f();
                synchronized (this) {
                    try {
                        if (this.f42575c == atomicBoolean) {
                            this.f42574b = null;
                            this.f42575c = null;
                        }
                        notifyAll();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    try {
                        if (this.f42575c == atomicBoolean) {
                            this.f42574b = null;
                            this.f42575c = null;
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
                    if (this.f42575c == atomicBoolean) {
                        this.f42574b = null;
                        this.f42575c = null;
                    }
                    notifyAll();
                } finally {
                }
            }
        } catch (Exception e12) {
            b(e12);
            synchronized (this) {
                try {
                    if (this.f42575c == atomicBoolean) {
                        this.f42574b = null;
                        this.f42575c = null;
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
