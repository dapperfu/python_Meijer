package fsimpl;

import java.util.concurrent.ThreadFactory;

/* renamed from: fsimpl.fw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class ThreadFactoryC14230fw implements ThreadFactory {
    ThreadFactoryC14230fw() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new fM(runnable, "fs-background-pool");
    }
}
