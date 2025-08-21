package rv;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rv.AbstractC16966c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0013\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004R\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00028\u0002X\u0082\u0004¨\u0006!"}, d2 = {"Lrv/c;", "N", "", "prev", "<init>", "(Lrv/c;)V", "value", "", "o", "(Lrv/c;)Z", "", "b", "()V", "m", "()Z", "n", "g", "()Ljava/lang/Object;", "nextOrClosed", "d", "()Lrv/c;", "aliveSegmentLeft", "e", "aliveSegmentRight", "f", "next", "l", "isTail", "h", "k", "isRemoved", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC16966c<N extends AbstractC16966c<N>> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f159639a = AtomicReferenceFieldUpdater.newUpdater(AbstractC16966c.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f159640b = AtomicReferenceFieldUpdater.newUpdater(AbstractC16966c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public abstract boolean k();

    public AbstractC16966c(N n10) {
        this._prev$volatile = n10;
    }

    private final N d() {
        N n10 = (N) h();
        while (n10 != null && n10.k()) {
            n10 = (N) f159640b.get(n10);
        }
        return n10;
    }

    private final N e() {
        AbstractC16966c abstractC16966cF;
        N n10 = (N) f();
        Intrinsics.g(n10);
        while (n10.k() && (abstractC16966cF = n10.f()) != null) {
            n10 = (N) abstractC16966cF;
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f159639a.get(this);
    }

    public final void b() {
        f159640b.set(this, null);
    }

    public final N f() {
        Object objG = g();
        if (objG == C16965b.f159638a) {
            return null;
        }
        return (N) objG;
    }

    public final N h() {
        return (N) f159640b.get(this);
    }

    public final boolean l() {
        if (f() == null) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f159639a, this, null, C16965b.f159638a);
    }

    public final void n() {
        Object obj;
        AbstractC16966c abstractC16966c;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC16966c abstractC16966cD = d();
            AbstractC16966c abstractC16966cE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159640b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC16966cE);
                if (((AbstractC16966c) obj) == null) {
                    abstractC16966c = null;
                } else {
                    abstractC16966c = abstractC16966cD;
                }
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC16966cE, obj, abstractC16966c));
            if (abstractC16966cD != null) {
                f159639a.set(abstractC16966cD, abstractC16966cE);
            }
            if (!abstractC16966cE.k() || abstractC16966cE.l()) {
                if (abstractC16966cD == null || !abstractC16966cD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(N value) {
        return androidx.concurrent.futures.b.a(f159639a, this, null, value);
    }
}
