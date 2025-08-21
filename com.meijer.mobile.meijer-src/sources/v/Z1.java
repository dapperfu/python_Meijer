package v;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Lv/Z1;", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "", "b", "()V", "", "a", "()I", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger mVideoUsage;

    public Z1(Executor executor) {
        Intrinsics.j(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    public final int a() {
        return this.mVideoUsage.get();
    }

    public final void b() {
        this.mVideoUsage.set(0);
        C.P.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
