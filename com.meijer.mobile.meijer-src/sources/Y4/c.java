package Y4;

import X4.D;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import mv.AbstractC15779K;
import mv.C15830u0;

/* loaded from: classes4.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final D f42919a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC15779K f42920b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f42921c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private final Executor f42922d = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f42921c.post(runnable);
        }
    }

    @Override // Y4.b
    public Executor a() {
        return this.f42922d;
    }

    @Override // Y4.b
    public AbstractC15779K b() {
        return this.f42920b;
    }

    @Override // Y4.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public D c() {
        return this.f42919a;
    }

    public c(Executor executor) {
        D d10 = new D(executor);
        this.f42919a = d10;
        this.f42920b = C15830u0.b(d10);
    }
}
