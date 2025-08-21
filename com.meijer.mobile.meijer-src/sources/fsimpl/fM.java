package fsimpl;

import android.os.Process;

/* loaded from: classes15.dex */
public class fM extends Thread {
    public fM(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(11);
        super.run();
    }
}
