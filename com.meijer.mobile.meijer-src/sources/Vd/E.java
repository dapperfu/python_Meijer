package Vd;

/* loaded from: classes6.dex */
final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5516j f39837a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F f39838b;

    E(F f10, AbstractC5516j abstractC5516j) {
        this.f39838b = f10;
        this.f39837a = abstractC5516j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f39838b.f39840b) {
            try {
                F f10 = this.f39838b;
                if (f10.f39841c != null) {
                    f10.f39841c.onSuccess(this.f39837a.n());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
