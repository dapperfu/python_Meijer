package Qc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f29934a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f29935b;

    b(String str) {
        this.f29935b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f29935b + ") #" + this.f29934a.getAndIncrement());
    }
}
