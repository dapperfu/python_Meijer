package yv;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.ranges.RangesKt;
import vv.C17632F;
import vv.C17634H;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n*\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010\"\u0016\u0010\u001c\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b*\f\b\u0000\u0010\u001d\"\u00020\u00002\u00020\u0000¨\u0006\u001e"}, d2 = {"", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "", "c", "(Z)Ljava/lang/String;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "Lyv/h;", "b", "(Ljava/lang/Runnable;JZ)Lyv/h;", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Lyv/g;", "f", "Lyv/g;", "schedulerTimeSource", "TaskContext", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yv.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C18315j {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final String f171357a = C17632F.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final long f171358b = C17634H.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final int f171359c = C17634H.e("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.f(C17632F.a(), 2), 1, 0, 8, null);

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final int f171360d = C17634H.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final long f171361e = TimeUnit.SECONDS.toNanos(C17634H.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static AbstractC18312g f171362f = C18310e.f171348a;

    public static final AbstractRunnableC18313h b(Runnable runnable, long j10, boolean z10) {
        return new C18314i(runnable, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
