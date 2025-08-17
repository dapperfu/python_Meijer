package j2;

import android.os.CancellationSignal;

@Deprecated
/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14836d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f139170a;

    /* renamed from: b, reason: collision with root package name */
    private a f139171b;

    /* renamed from: c, reason: collision with root package name */
    private Object f139172c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f139173d;

    /* renamed from: j2.d$a */
    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f139170a) {
                    return;
                }
                this.f139170a = true;
                this.f139173d = true;
                a aVar = this.f139171b;
                Object obj = this.f139172c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f139173d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f139173d = false;
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
                if (this.f139172c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f139172c = cancellationSignal;
                    if (this.f139170a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f139172c;
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
                if (this.f139171b == aVar) {
                    return;
                }
                this.f139171b = aVar;
                if (this.f139170a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    private void d() throws InterruptedException {
        while (this.f139173d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
