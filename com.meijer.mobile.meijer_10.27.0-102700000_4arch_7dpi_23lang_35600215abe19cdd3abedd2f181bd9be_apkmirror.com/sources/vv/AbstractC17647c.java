package vv;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vv.AbstractC17647c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0013\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004R\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00028\u0002X\u0082\u0004¨\u0006!"}, d2 = {"Lvv/c;", "N", "", "prev", "<init>", "(Lvv/c;)V", "value", "", "o", "(Lvv/c;)Z", "", "b", "()V", "m", "()Z", "n", "g", "()Ljava/lang/Object;", "nextOrClosed", "d", "()Lvv/c;", "aliveSegmentLeft", "e", "aliveSegmentRight", "f", "next", "l", "isTail", "h", "k", "isRemoved", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vv.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC17647c<N extends AbstractC17647c<N>> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f165105a = AtomicReferenceFieldUpdater.newUpdater(AbstractC17647c.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f165106b = AtomicReferenceFieldUpdater.newUpdater(AbstractC17647c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public abstract boolean k();

    public AbstractC17647c(N n10) {
        this._prev$volatile = n10;
    }

    private final N d() {
        N n10 = (N) h();
        while (n10 != null && n10.k()) {
            n10 = (N) f165106b.get(n10);
        }
        return n10;
    }

    private final N e() {
        AbstractC17647c abstractC17647cF;
        N n10 = (N) f();
        Intrinsics.g(n10);
        while (n10.k() && (abstractC17647cF = n10.f()) != null) {
            n10 = (N) abstractC17647cF;
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f165105a.get(this);
    }

    public final void b() {
        f165106b.set(this, null);
    }

    public final N f() {
        Object objG = g();
        if (objG == C17646b.f165104a) {
            return null;
        }
        return (N) objG;
    }

    public final N h() {
        return (N) f165106b.get(this);
    }

    public final boolean l() {
        if (f() == null) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f165105a, this, null, C17646b.f165104a);
    }

    public final void n() {
        Object obj;
        AbstractC17647c abstractC17647c;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC17647c abstractC17647cD = d();
            AbstractC17647c abstractC17647cE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f165106b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC17647cE);
                if (((AbstractC17647c) obj) == null) {
                    abstractC17647c = null;
                } else {
                    abstractC17647c = abstractC17647cD;
                }
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC17647cE, obj, abstractC17647c));
            if (abstractC17647cD != null) {
                f165105a.set(abstractC17647cD, abstractC17647cE);
            }
            if (!abstractC17647cE.k() || abstractC17647cE.l()) {
                if (abstractC17647cD == null || !abstractC17647cD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(N value) {
        return androidx.concurrent.futures.b.a(f165105a, this, null, value);
    }
}
