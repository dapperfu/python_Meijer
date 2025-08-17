package Td;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* loaded from: classes6.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5232j f34947a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f34948b;

    u(v vVar, AbstractC5232j abstractC5232j) {
        this.f34948b = vVar;
        this.f34947a = abstractC5232j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f34947a.p()) {
            this.f34948b.f34951c.w();
            return;
        }
        try {
            this.f34948b.f34951c.v(this.f34948b.f34950b.then(this.f34947a));
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f34948b.f34951c.u((Exception) e10.getCause());
            } else {
                this.f34948b.f34951c.u(e10);
            }
        } catch (Exception e11) {
            this.f34948b.f34951c.u(e11);
        }
    }
}
