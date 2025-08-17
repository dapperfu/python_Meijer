package Td;

/* loaded from: classes6.dex */
final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5232j f34894a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B f34895b;

    A(B b10, AbstractC5232j abstractC5232j) {
        this.f34895b = b10;
        this.f34894a = abstractC5232j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34895b.f34897b) {
            try {
                B b10 = this.f34895b;
                if (b10.f34898c != null) {
                    b10.f34898c.onComplete(this.f34894a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
