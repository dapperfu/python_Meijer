package Vd;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5516j f39885a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f39886b;

    w(x xVar, AbstractC5516j abstractC5516j) {
        this.f39886b = xVar;
        this.f39885a = abstractC5516j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC5516j abstractC5516j = (AbstractC5516j) this.f39886b.f39888b.then(this.f39885a);
            if (abstractC5516j == null) {
                this.f39886b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            x xVar = this.f39886b;
            Executor executor = C5518l.f39867b;
            abstractC5516j.h(executor, xVar);
            abstractC5516j.f(executor, this.f39886b);
            abstractC5516j.b(executor, this.f39886b);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f39886b.f39889c.u((Exception) e10.getCause());
            } else {
                this.f39886b.f39889c.u(e10);
            }
        } catch (Exception e11) {
            this.f39886b.f39889c.u(e11);
        }
    }
}
