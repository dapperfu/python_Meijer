package Td;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5232j f34952a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f34953b;

    w(x xVar, AbstractC5232j abstractC5232j) {
        this.f34953b = xVar;
        this.f34952a = abstractC5232j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC5232j abstractC5232j = (AbstractC5232j) this.f34953b.f34955b.then(this.f34952a);
            if (abstractC5232j == null) {
                this.f34953b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            x xVar = this.f34953b;
            Executor executor = C5234l.f34934b;
            abstractC5232j.h(executor, xVar);
            abstractC5232j.f(executor, this.f34953b);
            abstractC5232j.b(executor, this.f34953b);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f34953b.f34956c.u((Exception) e10.getCause());
            } else {
                this.f34953b.f34956c.u(e10);
            }
        } catch (Exception e11) {
            this.f34953b.f34956c.u(e11);
        }
    }
}
