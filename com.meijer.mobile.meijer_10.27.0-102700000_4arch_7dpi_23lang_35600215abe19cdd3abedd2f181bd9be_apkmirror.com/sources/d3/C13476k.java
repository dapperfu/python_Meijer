package d3;

/* renamed from: d3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C13476k {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13473h f127124a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f127125b;

    public C13476k() {
        this(InterfaceC13473h.f127116a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f127125b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f127125b) {
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
        z10 = this.f127125b;
        this.f127125b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f127125b;
    }

    public synchronized boolean e() {
        if (this.f127125b) {
            return false;
        }
        this.f127125b = true;
        notifyAll();
        return true;
    }

    public C13476k(InterfaceC13473h interfaceC13473h) {
        this.f127124a = interfaceC13473h;
    }
}
