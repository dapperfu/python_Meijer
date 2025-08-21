package Vd;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class L implements Executor {
    L() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
