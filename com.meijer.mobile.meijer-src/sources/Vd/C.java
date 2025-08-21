package Vd;

/* loaded from: classes6.dex */
final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5516j f39832a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D f39833b;

    C(D d10, AbstractC5516j abstractC5516j) {
        this.f39833b = d10;
        this.f39832a = abstractC5516j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f39833b.f39835b) {
            try {
                D d10 = this.f39833b;
                if (d10.f39836c != null) {
                    d10.f39836c.onFailure((Exception) com.google.android.gms.common.internal.r.l(this.f39832a.m()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
