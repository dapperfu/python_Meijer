package wv;

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
import mv.C15819p;
import mv.C15823r;
import mv.InterfaceC15815n;
import mv.h1;
import rv.AbstractC16947B;
import rv.C16948C;
import rv.C16965b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004R\u000b\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004R\u0011\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004R\u000b\u0010*\u001a\u00020\u00018\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¨\u0006,"}, d2 = {"Lwv/j;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "()I", "l", "()V", "Lmv/h1;", "waiter", "", "k", "(Lmv/h1;)Z", "v", "()Z", "u", "(Ljava/lang/Object;)Z", "t", "d", "Lmv/n;", "i", "(Lmv/n;)V", "release", "a", "I", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/jvm/functions/Function3;", "onCancellationRelease", "availablePermits", "Lwv/m;", "head", "deqIdx", "tail", "enqIdx", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f167654c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f167655d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f167656e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f167657f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f167658g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
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
        public static final a f167661b = new a();

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
        public static final b f167662b = new b();

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
        if (!(obj instanceof InterfaceC15815n)) {
            if (obj instanceof vv.k) {
                return ((vv.k) obj).f(this, Unit.f143329a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC15815n interfaceC15815n = (InterfaceC15815n) obj;
        Object objW = interfaceC15815n.W(Unit.f143329a, null, this.onCancellationRelease);
        if (objW == null) {
            return false;
        }
        interfaceC15815n.X(objW);
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
                this.onCancellationRelease = new Function3() { // from class: wv.i
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return j.s(this.f167653a, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                    }
                };
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
    }

    private final Object j(Continuation<? super Unit> continuation) {
        C15819p c15819pB = C15823r.b(IntrinsicsKt.c(continuation));
        try {
            if (!k(c15819pB)) {
                i(c15819pB);
            }
            Object objU = c15819pB.u();
            if (objU == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            if (objU == IntrinsicsKt.f()) {
                return objU;
            }
            return Unit.f143329a;
        } catch (Throwable th2) {
            c15819pB.O();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(h1 waiter) {
        Object objC;
        m mVar = (m) f167656e.get(this);
        long andIncrement = f167657f.getAndIncrement(this);
        a aVar = a.f167661b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f167656e;
        long j10 = andIncrement / l.f167668f;
        loop0: while (true) {
            objC = C16965b.c(mVar, j10, aVar);
            if (!C16948C.c(objC)) {
                AbstractC16947B abstractC16947BB = C16948C.b(objC);
                while (true) {
                    AbstractC16947B abstractC16947B = (AbstractC16947B) atomicReferenceFieldUpdater.get(this);
                    if (abstractC16947B.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String >= abstractC16947BB.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String) {
                        break loop0;
                    }
                    if (!abstractC16947BB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC16947B, abstractC16947BB)) {
                        if (abstractC16947B.p()) {
                            abstractC16947B.n();
                        }
                    } else if (abstractC16947BB.p()) {
                        abstractC16947BB.n();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) C16948C.b(objC);
        int i10 = (int) (andIncrement % l.f167668f);
        if (!ov.l.a(mVar2.getF167669e(), i10, null, waiter)) {
            if (ov.l.a(mVar2.getF167669e(), i10, l.f167664b, l.f167665c)) {
                if (waiter instanceof InterfaceC15815n) {
                    Intrinsics.h(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((InterfaceC15815n) waiter).U(Unit.f143329a, this.onCancellationRelease);
                } else if (waiter instanceof vv.k) {
                    ((vv.k) waiter).d(Unit.f143329a);
                } else {
                    throw new IllegalStateException(("unexpected: " + waiter).toString());
                }
                return true;
            }
            return false;
        }
        waiter.b(mVar2, i10);
        return true;
    }

    private final void l() {
        int i10;
        do {
            i10 = f167658g.get(this);
            if (i10 <= this.permits) {
                return;
            }
        } while (!f167658g.compareAndSet(this, i10, this.permits));
    }

    private final int m() {
        int andDecrement;
        do {
            andDecrement = f167658g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(j jVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        jVar.release();
        return Unit.f143329a;
    }

    private final boolean v() {
        Object objC;
        m mVar = (m) f167654c.get(this);
        long andIncrement = f167655d.getAndIncrement(this);
        long j10 = andIncrement / l.f167668f;
        b bVar = b.f167662b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f167654c;
        loop0: while (true) {
            objC = C16965b.c(mVar, j10, bVar);
            if (C16948C.c(objC)) {
                break;
            }
            AbstractC16947B abstractC16947BB = C16948C.b(objC);
            while (true) {
                AbstractC16947B abstractC16947B = (AbstractC16947B) atomicReferenceFieldUpdater.get(this);
                if (abstractC16947B.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String >= abstractC16947BB.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String) {
                    break loop0;
                }
                if (!abstractC16947BB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC16947B, abstractC16947BB)) {
                    if (abstractC16947B.p()) {
                        abstractC16947B.n();
                    }
                } else if (abstractC16947BB.p()) {
                    abstractC16947BB.n();
                }
            }
        }
        m mVar2 = (m) C16948C.b(objC);
        mVar2.b();
        if (mVar2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % l.f167668f);
        Object andSet = mVar2.getF167669e().getAndSet(i10, l.f167664b);
        if (andSet == null) {
            int i11 = l.f167663a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (mVar2.getF167669e().get(i10) == l.f167665c) {
                    return true;
                }
            }
            return !ov.l.a(mVar2.getF167669e(), i10, l.f167664b, l.f167666d);
        }
        if (andSet == l.f167667e) {
            return false;
        }
        return u(andSet);
    }

    public final int a() {
        return Math.max(f167658g.get(this), 0);
    }

    public final Object d(Continuation<? super Unit> continuation) {
        if (m() > 0) {
            return Unit.f143329a;
        }
        Object objJ = j(continuation);
        if (objJ == IntrinsicsKt.f()) {
            return objJ;
        }
        return Unit.f143329a;
    }

    protected final void i(InterfaceC15815n<? super Unit> waiter) {
        while (m() <= 0) {
            Intrinsics.h(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (k((h1) waiter)) {
                return;
            }
        }
        waiter.U(Unit.f143329a, this.onCancellationRelease);
    }

    public final void release() {
        do {
            int andIncrement = f167658g.getAndIncrement(this);
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
            int i10 = f167658g.get(this);
            if (i10 > this.permits) {
                l();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f167658g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
