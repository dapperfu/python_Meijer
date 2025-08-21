package mv;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;
import rv.C16975l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010&\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\nR\u0011\u0010*\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0011\u0010,\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b+\u0010\f¨\u0006-"}, d2 = {"Lmv/l0;", "Lmv/K;", "<init>", "()V", "", "unconfined", "", "X0", "(Z)J", "f1", "()J", "h1", "()Z", "j1", "Lmv/c0;", "task", "", "Y0", "(Lmv/c0;)V", "a1", "(Z)V", "U0", "", "parallelism", "", "name", "S0", "(ILjava/lang/String;)Lmv/K;", "shutdown", "c", "J", "useCount", "d", "Z", "shared", "Lkotlin/collections/ArrayDeque;", "e", "Lkotlin/collections/ArrayDeque;", "unconfinedQueue", "Z0", "nextTime", "d1", "isUnconfinedLoopActive", "e1", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.l0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC15812l0 extends AbstractC15779K {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long useCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean shared;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ArrayDeque<AbstractC15794c0<?>> unconfinedQueue;

    public boolean j1() {
        return false;
    }

    public void shutdown() {
    }

    public static /* synthetic */ void W0(AbstractC15812l0 abstractC15812l0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC15812l0.U0(z10);
    }

    private final long X0(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    public static /* synthetic */ void c1(AbstractC15812l0 abstractC15812l0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC15812l0.a1(z10);
    }

    public final void U0(boolean unconfined) {
        long jX0 = this.useCount - X0(unconfined);
        this.useCount = jX0;
        if (jX0 <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void Y0(AbstractC15794c0<?> task) {
        ArrayDeque<AbstractC15794c0<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.unconfinedQueue = arrayDeque;
        }
        arrayDeque.addLast(task);
    }

    protected long Z0() {
        ArrayDeque<AbstractC15794c0<?>> arrayDeque = this.unconfinedQueue;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void a1(boolean unconfined) {
        this.useCount += X0(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }

    public final boolean d1() {
        return this.useCount >= X0(true);
    }

    public final boolean e1() {
        ArrayDeque<AbstractC15794c0<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public final boolean h1() {
        AbstractC15794c0<?> abstractC15794c0X;
        ArrayDeque<AbstractC15794c0<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null || (abstractC15794c0X = arrayDeque.x()) == null) {
            return false;
        }
        abstractC15794c0X.run();
        return true;
    }

    @Override // mv.AbstractC15779K
    public final AbstractC15779K S0(int parallelism, String name) {
        C16975l.a(parallelism);
        return C16975l.b(this, name);
    }

    public long f1() {
        if (!h1()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }
}
