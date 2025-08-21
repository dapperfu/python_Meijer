package j2;

import android.os.CancellationSignal;

@Deprecated
/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14924d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f139760a;

    /* renamed from: b, reason: collision with root package name */
    private a f139761b;

    /* renamed from: c, reason: collision with root package name */
    private Object f139762c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f139763d;

    /* renamed from: j2.d$a */
    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f139760a) {
                    return;
                }
                this.f139760a = true;
                this.f139763d = true;
                a aVar = this.f139761b;
                Object obj = this.f139762c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f139763d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f139763d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f139762c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f139762c = cancellationSignal;
                    if (this.f139760a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f139762c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f139761b == aVar) {
                    return;
                }
                this.f139761b = aVar;
                if (this.f139760a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    private void d() throws InterruptedException {
        while (this.f139763d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
