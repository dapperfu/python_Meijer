package Av;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;
import qv.C16662r;
import qv.InterfaceC16654n;
import qv.h1;
import vv.AbstractC17628B;
import vv.C17629C;
import vv.C17646b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004R\u000b\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004R\u0011\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004R\u000b\u0010*\u001a\u00020\u00018\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¨\u0006,"}, d2 = {"LAv/j;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "()I", "l", "()V", "Lqv/h1;", "waiter", "", "k", "(Lqv/h1;)Z", "v", "()Z", "u", "(Ljava/lang/Object;)Z", "t", "d", "Lqv/n;", "i", "(Lqv/n;)V", "release", "a", "I", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/jvm/functions/Function3;", "onCancellationRelease", "availablePermits", "LAv/m;", "head", "deqIdx", "tail", "enqIdx", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1630c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f1631d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1632e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f1633f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1634g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int permits;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function3<Throwable, Unit, CoroutineContext, Unit> onCancellationRelease;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function2<Long, m, m> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1637b = new a();

        a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ m invoke(Long l10, m mVar) {
            return a(l10.longValue(), mVar);
        }

        public final m a(long j10, m mVar) {
            return l.j(j10, mVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function2<Long, m, m> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f1638b = new b();

        b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ m invoke(Long l10, m mVar) {
            return a(l10.longValue(), mVar);
        }

        public final m a(long j10, m mVar) {
            return l.j(j10, mVar);
        }
    }

    private final boolean u(Object obj) {
        if (!(obj instanceof InterfaceC16654n)) {
            if (obj instanceof zv.k) {
                return ((zv.k) obj).e(this, Unit.f142422a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC16654n interfaceC16654n = (InterfaceC16654n) obj;
        Object objW = interfaceC16654n.W(Unit.f142422a, null, this.onCancellationRelease);
        if (objW == null) {
            return false;
        }
        interfaceC16654n.X(objW);
        return true;
    }

    public j(int i10, int i11) {
        this.permits = i10;
        if (i10 > 0) {
            if (i11 >= 0 && i11 <= i10) {
                m mVar = new m(0L, null, 2);
                this.head$volatile = mVar;
                this.tail$volatile = mVar;
                this._availablePermits$volatile = i10 - i11;
                this.onCancellationRelease = new Function3() { // from class: Av.i
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return j.s(this.f1629a, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                    }
                };
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
    }

    private final Object j(Continuation<? super Unit> continuation) {
        C16658p c16658pB = C16662r.b(IntrinsicsKt.c(continuation));
        try {
            if (!k(c16658pB)) {
                i(c16658pB);
            }
            Object objV = c16658pB.v();
            if (objV == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            if (objV == IntrinsicsKt.f()) {
                return objV;
            }
            return Unit.f142422a;
        } catch (Throwable th2) {
            c16658pB.O();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(h1 waiter) {
        Object objC;
        m mVar = (m) f1632e.get(this);
        long andIncrement = f1633f.getAndIncrement(this);
        a aVar = a.f1637b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1632e;
        long j10 = andIncrement / l.f1644f;
        loop0: while (true) {
            objC = C17646b.c(mVar, j10, aVar);
            if (!C17629C.c(objC)) {
                AbstractC17628B abstractC17628BB = C17629C.b(objC);
                while (true) {
                    AbstractC17628B abstractC17628B = (AbstractC17628B) atomicReferenceFieldUpdater.get(this);
                    if (abstractC17628B.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String >= abstractC17628BB.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String) {
                        break loop0;
                    }
                    if (!abstractC17628BB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC17628B, abstractC17628BB)) {
                        if (abstractC17628B.p()) {
                            abstractC17628B.n();
                        }
                    } else if (abstractC17628BB.p()) {
                        abstractC17628BB.n();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) C17629C.b(objC);
        int i10 = (int) (andIncrement % l.f1644f);
        if (!sv.l.a(mVar2.getF1645e(), i10, null, waiter)) {
            if (sv.l.a(mVar2.getF1645e(), i10, l.f1640b, l.f1641c)) {
                if (waiter instanceof InterfaceC16654n) {
                    Intrinsics.h(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((InterfaceC16654n) waiter).U(Unit.f142422a, this.onCancellationRelease);
                } else if (waiter instanceof zv.k) {
                    ((zv.k) waiter).d(Unit.f142422a);
                } else {
                    throw new IllegalStateException(("unexpected: " + waiter).toString());
                }
                return true;
            }
            return false;
        }
        waiter.f(mVar2, i10);
        return true;
    }

    private final void l() {
        int i10;
        do {
            i10 = f1634g.get(this);
            if (i10 <= this.permits) {
                return;
            }
        } while (!f1634g.compareAndSet(this, i10, this.permits));
    }

    private final int m() {
        int andDecrement;
        do {
            andDecrement = f1634g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(j jVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        jVar.release();
        return Unit.f142422a;
    }

    private final boolean v() {
        Object objC;
        m mVar = (m) f1630c.get(this);
        long andIncrement = f1631d.getAndIncrement(this);
        long j10 = andIncrement / l.f1644f;
        b bVar = b.f1638b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1630c;
        loop0: while (true) {
            objC = C17646b.c(mVar, j10, bVar);
            if (C17629C.c(objC)) {
                break;
            }
            AbstractC17628B abstractC17628BB = C17629C.b(objC);
            while (true) {
                AbstractC17628B abstractC17628B = (AbstractC17628B) atomicReferenceFieldUpdater.get(this);
                if (abstractC17628B.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String >= abstractC17628BB.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String) {
                    break loop0;
                }
                if (!abstractC17628BB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC17628B, abstractC17628BB)) {
                    if (abstractC17628B.p()) {
                        abstractC17628B.n();
                    }
                } else if (abstractC17628BB.p()) {
                    abstractC17628BB.n();
                }
            }
        }
        m mVar2 = (m) C17629C.b(objC);
        mVar2.b();
        if (mVar2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % l.f1644f);
        Object andSet = mVar2.getF1645e().getAndSet(i10, l.f1640b);
        if (andSet == null) {
            int i11 = l.f1639a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (mVar2.getF1645e().get(i10) == l.f1641c) {
                    return true;
                }
            }
            return !sv.l.a(mVar2.getF1645e(), i10, l.f1640b, l.f1642d);
        }
        if (andSet == l.f1643e) {
            return false;
        }
        return u(andSet);
    }

    public final int a() {
        return Math.max(f1634g.get(this), 0);
    }

    public final Object d(Continuation<? super Unit> continuation) {
        if (m() > 0) {
            return Unit.f142422a;
        }
        Object objJ = j(continuation);
        if (objJ == IntrinsicsKt.f()) {
            return objJ;
        }
        return Unit.f142422a;
    }

    protected final void i(InterfaceC16654n<? super Unit> waiter) {
        while (m() <= 0) {
            Intrinsics.h(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (k((h1) waiter)) {
                return;
            }
        }
        waiter.U(Unit.f142422a, this.onCancellationRelease);
    }

    public final void release() {
        do {
            int andIncrement = f1634g.getAndIncrement(this);
            if (andIncrement < this.permits) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                l();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
        } while (!v());
    }

    public final boolean t() {
        while (true) {
            int i10 = f1634g.get(this);
            if (i10 > this.permits) {
                l();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f1634g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
