package Vd;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* loaded from: classes6.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5516j f39880a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f39881b;

    u(v vVar, AbstractC5516j abstractC5516j) {
        this.f39881b = vVar;
        this.f39880a = abstractC5516j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f39880a.p()) {
            this.f39881b.f39884c.w();
            return;
        }
        try {
            this.f39881b.f39884c.v(this.f39881b.f39883b.then(this.f39880a));
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f39881b.f39884c.u((Exception) e10.getCause());
            } else {
                this.f39881b.f39884c.u(e10);
            }
        } catch (Exception e11) {
            this.f39881b.f39884c.u(e11);
        }
    }
}
