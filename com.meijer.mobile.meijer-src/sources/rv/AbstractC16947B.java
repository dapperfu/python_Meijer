package rv;

import io.constructor.data.local.PreferencesHelper;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.P0;
import rv.AbstractC16947B;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lrv/B;", "S", "Lrv/c;", "Lmv/P0;", "", PreferencesHelper.PREF_ID, "prev", "", "pointers", "<init>", "(JLrv/B;I)V", "", "u", "()Z", "p", "index", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "s", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "t", "()V", "c", "J", "r", "()I", "numberOfSlots", "k", "isRemoved", "", "cleanedAndPointers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.B, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC16947B<S extends AbstractC16947B<S>> extends AbstractC16966c<S> implements P0 {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f159616d = AtomicIntegerFieldUpdater.newUpdater(AbstractC16947B.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final long id;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public abstract int r();

    public abstract void s(int index, Throwable cause, CoroutineContext context);

    public AbstractC16947B(long j10, S s10, int i10) {
        super(s10);
        this.id = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // rv.AbstractC16966c
    public boolean k() {
        if (f159616d.get(this) == r() && !l()) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (f159616d.addAndGet(this, -65536) == r() && !l()) {
            return true;
        }
        return false;
    }

    public final void t() {
        if (f159616d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f159616d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
