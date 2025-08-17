package qv;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;
import vv.C17656l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010&\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\nR\u0011\u0010*\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0011\u0010,\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b+\u0010\f¨\u0006-"}, d2 = {"Lqv/l0;", "Lqv/K;", "<init>", "()V", "", "unconfined", "", "Y0", "(Z)J", "f1", "()J", "g1", "()Z", "i1", "Lqv/c0;", "task", "", "Z0", "(Lqv/c0;)V", "b1", "(Z)V", "W0", "", "parallelism", "", "name", "U0", "(ILjava/lang/String;)Lqv/K;", "shutdown", "c", "J", "useCount", "d", "Z", "shared", "Lkotlin/collections/ArrayDeque;", "e", "Lkotlin/collections/ArrayDeque;", "unconfinedQueue", "a1", "nextTime", "d1", "isUnconfinedLoopActive", "e1", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.l0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC16651l0 extends AbstractC16618K {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long useCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean shared;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ArrayDeque<AbstractC16633c0<?>> unconfinedQueue;

    public boolean i1() {
        return false;
    }

    public void shutdown() {
    }

    public static /* synthetic */ void X0(AbstractC16651l0 abstractC16651l0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC16651l0.W0(z10);
    }

    private final long Y0(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    public static /* synthetic */ void c1(AbstractC16651l0 abstractC16651l0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC16651l0.b1(z10);
    }

    public final void W0(boolean unconfined) {
        long jY0 = this.useCount - Y0(unconfined);
        this.useCount = jY0;
        if (jY0 <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void Z0(AbstractC16633c0<?> task) {
        ArrayDeque<AbstractC16633c0<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.unconfinedQueue = arrayDeque;
        }
        arrayDeque.addLast(task);
    }

    protected long a1() {
        ArrayDeque<AbstractC16633c0<?>> arrayDeque = this.unconfinedQueue;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void b1(boolean unconfined) {
        this.useCount += Y0(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }

    public final boolean d1() {
        return this.useCount >= Y0(true);
    }

    public final boolean e1() {
        ArrayDeque<AbstractC16633c0<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public final boolean g1() {
        AbstractC16633c0<?> abstractC16633c0Y;
        ArrayDeque<AbstractC16633c0<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null || (abstractC16633c0Y = arrayDeque.y()) == null) {
            return false;
        }
        abstractC16633c0Y.run();
        return true;
    }

    @Override // qv.AbstractC16618K
    public final AbstractC16618K U0(int parallelism, String name) {
        C17656l.a(parallelism);
        return C17656l.b(this, name);
    }

    public long f1() {
        if (!g1()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }
}
