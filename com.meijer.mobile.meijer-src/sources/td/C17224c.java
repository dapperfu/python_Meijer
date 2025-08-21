package td;

import android.os.Process;

/* renamed from: td.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17224c extends Thread {
    C17224c(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
