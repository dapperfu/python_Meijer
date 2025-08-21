package Sc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f34484a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f34485b;

    b(String str) {
        this.f34485b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f34485b + ") #" + this.f34484a.getAndIncrement());
    }
}
