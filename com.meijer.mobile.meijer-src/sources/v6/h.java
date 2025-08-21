package v6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class h implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f165627d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private final ThreadGroup f165628a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f165629b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final String f165630c;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f165628a, runnable, this.f165630c + this.f165629b.getAndIncrement(), 0L);
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
        this.f165628a = threadGroup;
        this.f165630c = "lottie-" + f165627d.getAndIncrement() + "-thread-";
    }
}
