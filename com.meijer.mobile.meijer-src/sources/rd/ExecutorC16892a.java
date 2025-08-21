package rd;

import Ad.e;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: rd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ExecutorC16892a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f159467a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f159467a.post(runnable);
    }

    public ExecutorC16892a(Looper looper) {
        this.f159467a = new e(looper);
    }
}
