package mv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import rv.C16946A;
import rv.C16972i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0015\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u0016"}, d2 = {"Lmv/b0;", "T", "Lrv/A;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "n1", "()Z", "m1", "", "state", "", "y", "(Ljava/lang/Object;)V", "f1", "k1", "()Ljava/lang/Object;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.b0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15792b0<T> extends C16946A<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f151704e = AtomicIntegerFieldUpdater.newUpdater(C15792b0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C15792b0(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    private final boolean m1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f151704e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f151704e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean n1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f151704e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f151704e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // rv.C16946A, mv.AbstractC15789a
    protected void f1(Object state) {
        if (m1()) {
            return;
        }
        C16972i.b(IntrinsicsKt.c(this.uCont), C15772D.a(state, this.uCont));
    }

    public final Object k1() {
        if (n1()) {
            return IntrinsicsKt.f();
        }
        Object objH = I0.h(v0());
        if (!(objH instanceof C15771C)) {
            return objH;
        }
        throw ((C15771C) objH).cause;
    }

    @Override // rv.C16946A, mv.H0
    protected void y(Object state) {
        f1(state);
    }
}
