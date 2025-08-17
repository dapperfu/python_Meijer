package Td;

/* loaded from: classes6.dex */
final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5232j f34904a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F f34905b;

    E(F f10, AbstractC5232j abstractC5232j) {
        this.f34905b = f10;
        this.f34904a = abstractC5232j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34905b.f34907b) {
            try {
                F f10 = this.f34905b;
                if (f10.f34908c != null) {
                    f10.f34908c.onSuccess(this.f34904a.n());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
