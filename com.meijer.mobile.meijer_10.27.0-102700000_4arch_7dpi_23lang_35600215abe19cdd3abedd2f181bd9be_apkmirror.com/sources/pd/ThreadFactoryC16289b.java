package pd;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: pd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ThreadFactoryC16289b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f155711a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f155712b = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f155712b.newThread(new RunnableC16290c(runnable, 0));
        threadNewThread.setName(this.f155711a);
        return threadNewThread;
    }

    public ThreadFactoryC16289b(String str) {
        r.m(str, "Name must not be null");
        this.f155711a = str;
    }
}
