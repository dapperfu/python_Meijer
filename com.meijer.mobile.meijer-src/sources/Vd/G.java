package Vd;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5516j f39842a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f39843b;

    G(H h10, AbstractC5516j abstractC5516j) {
        this.f39843b = h10;
        this.f39842a = abstractC5516j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC5516j abstractC5516jThen = this.f39843b.f39845b.then(this.f39842a.n());
            if (abstractC5516jThen == null) {
                this.f39843b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            H h10 = this.f39843b;
            Executor executor = C5518l.f39867b;
            abstractC5516jThen.h(executor, h10);
            abstractC5516jThen.f(executor, this.f39843b);
            abstractC5516jThen.b(executor, this.f39843b);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f39843b.onFailure((Exception) e10.getCause());
            } else {
                this.f39843b.onFailure(e10);
            }
        } catch (CancellationException unused) {
            this.f39843b.onCanceled();
        } catch (Exception e11) {
            this.f39843b.onFailure(e11);
        }
    }
}
