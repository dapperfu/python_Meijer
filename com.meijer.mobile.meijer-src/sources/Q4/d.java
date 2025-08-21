package Q4;

import O4.I;
import P4.K;
import P4.y;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LQ4/d;", "", "LO4/I;", "runnableScheduler", "LP4/K;", "launcher", "", "timeoutMs", "<init>", "(LO4/I;LP4/K;J)V", "LP4/y;", "token", "", "c", "(LP4/y;)V", "b", "a", "LO4/I;", "LP4/K;", "J", "d", "Ljava/lang/Object;", "lock", "", "Ljava/lang/Runnable;", "e", "Ljava/util/Map;", "tracked", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I runnableScheduler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final K launcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timeoutMs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<y, Runnable> tracked;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public d(I runnableScheduler, K launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        Intrinsics.j(runnableScheduler, "runnableScheduler");
        Intrinsics.j(launcher, "launcher");
    }

    @JvmOverloads
    public d(I runnableScheduler, K launcher, long j10) {
        Intrinsics.j(runnableScheduler, "runnableScheduler");
        Intrinsics.j(launcher, "launcher");
        this.runnableScheduler = runnableScheduler;
        this.launcher = launcher;
        this.timeoutMs = j10;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d dVar, y yVar) {
        dVar.launcher.c(yVar, 3);
    }

    public final void b(y token) {
        Runnable runnableRemove;
        Intrinsics.j(token, "token");
        synchronized (this.lock) {
            runnableRemove = this.tracked.remove(token);
        }
        if (runnableRemove != null) {
            this.runnableScheduler.a(runnableRemove);
        }
    }

    public final void c(final y token) {
        Intrinsics.j(token, "token");
        Runnable runnable = new Runnable() { // from class: Q4.c
            @Override // java.lang.Runnable
            public final void run() {
                d.d(this.f27788a, token);
            }
        };
        synchronized (this.lock) {
            this.tracked.put(token, runnable);
        }
        this.runnableScheduler.b(this.timeoutMs, runnable);
    }

    public /* synthetic */ d(I i10, K k10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, k10, (i11 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j10);
    }
}
