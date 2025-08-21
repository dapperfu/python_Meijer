package ug;

import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
enum u implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C17409g.a().f163943a.post(runnable);
    }
}
