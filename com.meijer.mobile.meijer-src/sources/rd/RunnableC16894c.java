package rd;

import android.os.Process;

/* renamed from: rd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC16894c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f159470a;

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f159470a.run();
    }

    public RunnableC16894c(Runnable runnable, int i10) {
        this.f159470a = runnable;
    }
}
