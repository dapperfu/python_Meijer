package sg;

import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
enum u implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C16962g.a().f160457a.post(runnable);
    }
}
