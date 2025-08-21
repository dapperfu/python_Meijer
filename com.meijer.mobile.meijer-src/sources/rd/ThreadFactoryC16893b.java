package rd;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: rd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ThreadFactoryC16893b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f159468a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f159469b = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f159469b.newThread(new RunnableC16894c(runnable, 0));
        threadNewThread.setName(this.f159468a);
        return threadNewThread;
    }

    public ThreadFactoryC16893b(String str) {
        r.m(str, "Name must not be null");
        this.f159468a = str;
    }
}
