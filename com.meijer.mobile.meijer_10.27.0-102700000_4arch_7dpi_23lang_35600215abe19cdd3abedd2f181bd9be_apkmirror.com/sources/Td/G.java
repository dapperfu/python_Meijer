package Td;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5232j f34909a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f34910b;

    G(H h10, AbstractC5232j abstractC5232j) {
        this.f34910b = h10;
        this.f34909a = abstractC5232j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC5232j abstractC5232jThen = this.f34910b.f34912b.then(this.f34909a.n());
            if (abstractC5232jThen == null) {
                this.f34910b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            H h10 = this.f34910b;
            Executor executor = C5234l.f34934b;
            abstractC5232jThen.h(executor, h10);
            abstractC5232jThen.f(executor, this.f34910b);
            abstractC5232jThen.b(executor, this.f34910b);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f34910b.onFailure((Exception) e10.getCause());
            } else {
                this.f34910b.onFailure(e10);
            }
        } catch (CancellationException unused) {
            this.f34910b.onCanceled();
        } catch (Exception e11) {
            this.f34910b.onFailure(e11);
        }
    }
}
