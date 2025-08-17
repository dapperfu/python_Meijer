package pd;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import yd.e;

/* renamed from: pd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ExecutorC16288a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f155710a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f155710a.post(runnable);
    }

    public ExecutorC16288a(Looper looper) {
        this.f155710a = new e(looper);
    }
}
