package Rc;

/* loaded from: classes4.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private long f32339a;

    /* renamed from: b, reason: collision with root package name */
    private long f32340b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private final Object f32341c = new Object();

    public final void a(long j10) {
        synchronized (this.f32341c) {
            this.f32339a = j10;
        }
    }

    public final boolean b() {
        synchronized (this.f32341c) {
            try {
                long jC = Nc.v.c().c();
                if (this.f32340b + this.f32339a > jC) {
                    return false;
                }
                this.f32340b = jC;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Z(long j10) {
        this.f32339a = j10;
    }
}
