package d3;

/* renamed from: d3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C13609k {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13606h f127926a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f127927b;

    public C13609k() {
        this(InterfaceC13606h.f127918a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f127927b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f127927b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f127927b;
        this.f127927b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f127927b;
    }

    public synchronized boolean e() {
        if (this.f127927b) {
            return false;
        }
        this.f127927b = true;
        notifyAll();
        return true;
    }

    public C13609k(InterfaceC13606h interfaceC13606h) {
        this.f127926a = interfaceC13606h;
    }
}
