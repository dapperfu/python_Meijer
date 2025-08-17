package yv;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;
import qv.AbstractC16618K;
import qv.AbstractC16665s0;
import vv.C17632F;
import vv.C17634H;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lyv/b;", "Lqv/s0;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "", "name", "Lqv/K;", "U0", "(ILjava/lang/String;)Lqv/K;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "L0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "N0", "close", "toString", "()Ljava/lang/String;", "e", "Lqv/K;", "default", "W0", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yv.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ExecutorC18307b extends AbstractC16665s0 implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final ExecutorC18307b f171345d = new ExecutorC18307b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final AbstractC16618K default = AbstractC16618K.V0(C18316k.f171363c, C17634H.e("kotlinx.coroutines.io.parallelism", RangesKt.f(64, C17632F.a()), 0, 0, 12, null), null, 2, null);

    @Override // qv.AbstractC16665s0
    /* renamed from: W0 */
    public Executor getExecutor() {
        return this;
    }

    @Override // qv.AbstractC16618K
    public void L0(CoroutineContext context, Runnable block) {
        default.L0(context, block);
    }

    @Override // qv.AbstractC16618K
    public void N0(CoroutineContext context, Runnable block) {
        default.N0(context, block);
    }

    @Override // qv.AbstractC16618K
    public AbstractC16618K U0(int parallelism, String name) {
        return C18316k.f171363c.U0(parallelism, name);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        L0(EmptyCoroutineContext.f142646a, command);
    }

    @Override // qv.AbstractC16618K
    /* renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    private ExecutorC18307b() {
    }
}
