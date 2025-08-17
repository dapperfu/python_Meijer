package u6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class h implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f162698d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private final ThreadGroup f162699a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f162700b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final String f162701c;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f162699a, runnable, this.f162701c + this.f162700b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }

    public h() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f162699a = threadGroup;
        this.f162701c = "lottie-" + f162698d.getAndIncrement() + "-thread-";
    }
}
