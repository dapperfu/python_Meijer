package mv;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lmv/g;", "T", "Lmv/a;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Lmv/l0;", "eventLoop", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lmv/l0;)V", "", "state", "", "y", "(Ljava/lang/Object;)V", "j1", "()Ljava/lang/Object;", "d", "Ljava/lang/Thread;", "e", "Lmv/l0;", "", "D0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C15801g<T> extends AbstractC15789a<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Thread blockedThread;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15812l0 eventLoop;

    public C15801g(CoroutineContext coroutineContext, Thread thread, AbstractC15812l0 abstractC15812l0) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = abstractC15812l0;
    }

    @Override // mv.H0
    protected boolean D0() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T j1() throws Throwable {
        long jF1;
        C15793c.a();
        try {
            AbstractC15812l0 abstractC15812l0 = this.eventLoop;
            C15771C c15771c = null;
            if (abstractC15812l0 != null) {
                AbstractC15812l0.c1(abstractC15812l0, false, 1, null);
            }
            while (true) {
                try {
                    AbstractC15812l0 abstractC15812l02 = this.eventLoop;
                    if (abstractC15812l02 != null) {
                        jF1 = abstractC15812l02.f1();
                    } else {
                        jF1 = Long.MAX_VALUE;
                    }
                    if (A()) {
                        break;
                    }
                    C15793c.a();
                    LockSupport.parkNanos(this, jF1);
                    if (Thread.interrupted()) {
                        G(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    AbstractC15812l0 abstractC15812l03 = this.eventLoop;
                    if (abstractC15812l03 != null) {
                        AbstractC15812l0.W0(abstractC15812l03, false, 1, null);
                    }
                    throw th2;
                }
            }
            AbstractC15812l0 abstractC15812l04 = this.eventLoop;
            if (abstractC15812l04 != null) {
                AbstractC15812l0.W0(abstractC15812l04, false, 1, null);
            }
            C15793c.a();
            T t10 = (T) I0.h(v0());
            if (t10 instanceof C15771C) {
                c15771c = (C15771C) t10;
            }
            if (c15771c == null) {
                return t10;
            }
            throw c15771c.cause;
        } catch (Throwable th3) {
            C15793c.a();
            throw th3;
        }
    }

    @Override // mv.H0
    protected void y(Object state) {
        if (!Intrinsics.e(Thread.currentThread(), this.blockedThread)) {
            Thread thread = this.blockedThread;
            C15793c.a();
            LockSupport.unpark(thread);
        }
    }
}
