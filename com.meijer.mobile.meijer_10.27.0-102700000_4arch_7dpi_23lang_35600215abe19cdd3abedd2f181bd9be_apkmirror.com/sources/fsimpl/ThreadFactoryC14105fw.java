package fsimpl;

import java.util.concurrent.ThreadFactory;

/* renamed from: fsimpl.fw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class ThreadFactoryC14105fw implements ThreadFactory {
    ThreadFactoryC14105fw() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new fM(runnable, "fs-background-pool");
    }
}
