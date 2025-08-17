package of;

import android.os.Process;

/* renamed from: of.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractRunnableC16036d implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        a();
    }
}
