package Td;

/* loaded from: classes6.dex */
final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5232j f34899a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D f34900b;

    C(D d10, AbstractC5232j abstractC5232j) {
        this.f34900b = d10;
        this.f34899a = abstractC5232j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34900b.f34902b) {
            try {
                D d10 = this.f34900b;
                if (d10.f34903c != null) {
                    d10.f34903c.onFailure((Exception) com.google.android.gms.common.internal.r.l(this.f34899a.m()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
