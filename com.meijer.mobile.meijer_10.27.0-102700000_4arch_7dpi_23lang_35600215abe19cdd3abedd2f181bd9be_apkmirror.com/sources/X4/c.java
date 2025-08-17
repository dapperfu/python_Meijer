package X4;

import W4.D;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import qv.AbstractC16618K;
import qv.C16669u0;

/* loaded from: classes4.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final D f39115a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16618K f39116b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f39117c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private final Executor f39118d = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f39117c.post(runnable);
        }
    }

    @Override // X4.b
    public Executor a() {
        return this.f39118d;
    }

    @Override // X4.b
    public AbstractC16618K b() {
        return this.f39116b;
    }

    @Override // X4.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public D c() {
        return this.f39115a;
    }

    public c(Executor executor) {
        D d10 = new D(executor);
        this.f39115a = d10;
        this.f39116b = C16669u0.b(d10);
    }
}
