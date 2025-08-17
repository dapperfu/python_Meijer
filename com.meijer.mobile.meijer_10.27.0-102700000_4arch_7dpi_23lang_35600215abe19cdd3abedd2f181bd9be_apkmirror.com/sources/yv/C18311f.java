package yv;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import qv.AbstractC16665s0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001a\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u000f\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lyv/f;", "Lqv/s0;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lyv/a;", "X0", "()Lyv/a;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "L0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "N0", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "Y0", "(Ljava/lang/Runnable;ZZ)V", "d", "I", "e", "f", "J", "g", "Ljava/lang/String;", "h", "Lyv/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "W0", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yv.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C18311f extends AbstractC16665s0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int corePoolSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int maxPoolSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long idleWorkerKeepAliveNs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String schedulerName;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ExecutorC18306a coroutineScheduler = X0();

    private final ExecutorC18306a X0() {
        return new ExecutorC18306a(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // qv.AbstractC16618K
    public void L0(CoroutineContext context, Runnable block) {
        ExecutorC18306a.i(this.coroutineScheduler, block, false, false, 6, null);
    }

    @Override // qv.AbstractC16618K
    public void N0(CoroutineContext context, Runnable block) {
        ExecutorC18306a.i(this.coroutineScheduler, block, false, true, 2, null);
    }

    @Override // qv.AbstractC16665s0
    /* renamed from: W0 */
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    public final void Y0(Runnable block, boolean context, boolean fair) {
        this.coroutineScheduler.h(block, context, fair);
    }

    public C18311f(int i10, int i11, long j10, String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
    }
}
