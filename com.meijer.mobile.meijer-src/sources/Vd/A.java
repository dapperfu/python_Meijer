package Vd;

/* loaded from: classes6.dex */
final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5516j f39827a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B f39828b;

    A(B b10, AbstractC5516j abstractC5516j) {
        this.f39828b = b10;
        this.f39827a = abstractC5516j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f39828b.f39830b) {
            try {
                B b10 = this.f39828b;
                if (b10.f39831c != null) {
                    b10.f39831c.onComplete(this.f39827a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
