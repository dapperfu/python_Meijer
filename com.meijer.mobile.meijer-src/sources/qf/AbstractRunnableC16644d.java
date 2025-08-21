package qf;

import android.os.Process;

/* renamed from: qf.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractRunnableC16644d implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        a();
    }
}
