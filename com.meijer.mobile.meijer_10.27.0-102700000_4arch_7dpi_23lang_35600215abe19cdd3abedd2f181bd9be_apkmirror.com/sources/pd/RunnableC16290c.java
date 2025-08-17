package pd;

import android.os.Process;

/* renamed from: pd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC16290c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f155713a;

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f155713a.run();
    }

    public RunnableC16290c(Runnable runnable, int i10) {
        this.f155713a = runnable;
    }
}
