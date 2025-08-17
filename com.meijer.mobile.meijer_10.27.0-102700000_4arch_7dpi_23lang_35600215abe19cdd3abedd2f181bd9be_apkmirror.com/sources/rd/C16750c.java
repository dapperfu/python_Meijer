package rd;

import android.os.Process;

/* renamed from: rd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16750c extends Thread {
    C16750c(ThreadGroup threadGroup, String str) {
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
