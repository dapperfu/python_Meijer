package Pc;

/* loaded from: classes4.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private long f25125a;

    /* renamed from: b, reason: collision with root package name */
    private long f25126b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private final Object f25127c = new Object();

    public final void a(long j10) {
        synchronized (this.f25127c) {
            this.f25125a = j10;
        }
    }

    public final boolean b() {
        synchronized (this.f25127c) {
            try {
                long jC = Lc.v.c().c();
                if (this.f25126b + this.f25125a > jC) {
                    return false;
                }
                this.f25126b = jC;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Z(long j10) {
        this.f25125a = j10;
    }
}
