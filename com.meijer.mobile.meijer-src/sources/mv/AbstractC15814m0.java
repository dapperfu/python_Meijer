package mv;

import com.radiusnetworks.flybuy.sdk.data.order.OrderState;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.Y;
import rv.C16961P;
import rv.C16980q;
import rv.InterfaceC16962Q;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004>?@AB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J%\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00132\n\u0010 \u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\n\u0010 \u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0004¢\u0006\u0004\b.\u0010\u0004R$\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00106\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0013\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109098\u0002X\u0082\u0004R\u0013\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;098\u0002X\u0082\u0004R\u000b\u0010=\u001a\u0002098\u0002X\u0082\u0004¨\u0006B"}, d2 = {"Lmv/m0;", "Lmv/n0;", "Lmv/Y;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "D1", "(Ljava/lang/Runnable;)Z", "z1", "()Ljava/lang/Runnable;", "", "B1", "y1", "Lmv/m0$c;", "a2", "(Lmv/m0$c;)Z", "", "now", "delayedTask", "", "V1", "(JLmv/m0$c;)I", "Q1", "shutdown", "timeMillis", "Lmv/n;", "continuation", "H0", "(JLmv/n;)V", "block", "Lmv/h0;", "W1", "(JLjava/lang/Runnable;)Lmv/h0;", "f1", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "J0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "A1", "(Ljava/lang/Runnable;)V", "T1", "(JLmv/m0$c;)V", "R1", "value", "A", "()Z", "X1", "(Z)V", "isCompleted", "P1", "isEmpty", "Z0", "nextTime", "", "_queue", "Lmv/m0$d;", "_delayed", "_isCompleted", "c", "a", "b", "d", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.m0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC15814m0 extends AbstractC15816n0 implements Y {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f151750f = AtomicReferenceFieldUpdater.newUpdater(AbstractC15814m0.class, Object.class, "_queue$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f151751g = AtomicReferenceFieldUpdater.newUpdater(AbstractC15814m0.class, Object.class, "_delayed$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f151752h = AtomicIntegerFieldUpdater.newUpdater(AbstractC15814m0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmv/m0$a;", "Lmv/m0$c;", "", "nanoTime", "Lmv/n;", "", "cont", "<init>", "(Lmv/m0;JLmv/n;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Lmv/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: mv.m0$a */
    private final class a extends c {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15815n<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, InterfaceC15815n<? super Unit> interfaceC15815n) {
            super(j10);
            this.cont = interfaceC15815n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.B(AbstractC15814m0.this, Unit.f143329a);
        }

        @Override // mv.AbstractC15814m0.c
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmv/m0$b;", "Lmv/m0$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mv.m0$b */
    private static final class b extends c {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Runnable block;

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // mv.AbstractC15814m0.c
        public String toString() {
            return super.toString() + this.block;
        }

        public b(long j10, Runnable runnable) {
            super(j10);
            this.block = runnable;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lmv/m0$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lmv/h0;", "Lrv/Q;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "l", "(Lmv/m0$c;)I", "now", "", "o", "(J)Z", "Lmv/m0$d;", OrderState.DELAYED, "Lmv/m0;", "eventLoop", "m", "(JLmv/m0$d;Lmv/m0;)I", "", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "a", "J", "_heap", "Ljava/lang/Object;", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lrv/P;", "value", "()Lrv/P;", "e", "(Lrv/P;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: mv.m0$c */
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC15804h0, InterfaceC16962Q {
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public long nanoTime;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        @Override // mv.InterfaceC15804h0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == C15820p0.f151765a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = C15820p0.f151765a;
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final int m(long now, d delayed, AbstractC15814m0 eventLoop) {
            synchronized (this) {
                if (this._heap == C15820p0.f151765a) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c cVarB = delayed.b();
                        if (eventLoop.A()) {
                            return 1;
                        }
                        if (cVarB == null) {
                            delayed.timeNow = now;
                        } else {
                            long j10 = cVarB.nanoTime;
                            if (j10 - now < 0) {
                                now = j10;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j11 = this.nanoTime;
                        long j12 = delayed.timeNow;
                        if (j11 - j12 < 0) {
                            this.nanoTime = j12;
                        }
                        delayed.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // rv.InterfaceC16962Q
        public C16961P<?> a() {
            Object obj = this._heap;
            if (obj instanceof C16961P) {
                return (C16961P) obj;
            }
            return null;
        }

        @Override // rv.InterfaceC16962Q
        public void e(C16961P<?> c16961p) {
            if (this._heap == C15820p0.f151765a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c16961p;
        }

        @Override // rv.InterfaceC16962Q
        public int getIndex() {
            return this.index;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            long j10 = this.nanoTime - other.nanoTime;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final boolean o(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // rv.InterfaceC16962Q
        public void setIndex(int i10) {
            this.index = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }

        public c(long j10) {
            this.nanoTime = j10;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmv/m0$d;", "Lrv/P;", "Lmv/m0$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mv.m0$d */
    public static final class d extends C16961P<c> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public long timeNow;

        public d(long j10) {
            this.timeNow = j10;
        }
    }

    @Override // mv.AbstractC15812l0
    public void shutdown() {
        a1.f151702a.c();
        X1(true);
        y1();
        while (f1() <= 0) {
        }
        Q1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A() {
        if (f151752h.get(this) == 1) {
            return true;
        }
        return false;
    }

    private final void B1() {
        c cVarI;
        boolean zD1;
        d dVar = (d) f151751g.get(this);
        if (dVar != null && !dVar.e()) {
            C15793c.a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        c cVarB = dVar.b();
                        cVarI = null;
                        if (cVarB != null) {
                            c cVar = cVarB;
                            if (cVar.o(jNanoTime)) {
                                zD1 = D1(cVar);
                            } else {
                                zD1 = false;
                            }
                            if (zD1) {
                                cVarI = dVar.i(0);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (cVarI != null);
        }
    }

    private final boolean D1(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151750f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (A()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f151750f, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof C16980q) {
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C16980q c16980q = (C16980q) obj;
                int iA = c16980q.a(task);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    if (iA == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.b.a(f151750f, this, obj, c16980q.l());
                }
            } else {
                if (obj == C15820p0.f151766b) {
                    return false;
                }
                C16980q c16980q2 = new C16980q(8, true);
                Intrinsics.h(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c16980q2.a((Runnable) obj);
                c16980q2.a(task);
                if (androidx.concurrent.futures.b.a(f151750f, this, obj, c16980q2)) {
                    return true;
                }
            }
        }
    }

    private final void Q1() {
        c cVarJ;
        C15793c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f151751g.get(this);
            if (dVar != null && (cVarJ = dVar.j()) != null) {
                n1(jNanoTime, cVarJ);
            } else {
                return;
            }
        }
    }

    private final int V1(long now, c delayedTask) {
        if (A()) {
            return 1;
        }
        d dVar = (d) f151751g.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f151751g, this, null, new d(now));
            Object obj = f151751g.get(this);
            Intrinsics.g(obj);
            dVar = (d) obj;
        }
        return delayedTask.m(now, dVar, this);
    }

    private final void X1(boolean z10) {
        f151752h.set(this, z10 ? 1 : 0);
    }

    private final boolean a2(c task) {
        c cVarF;
        d dVar = (d) f151751g.get(this);
        if (dVar != null) {
            cVarF = dVar.f();
        } else {
            cVarF = null;
        }
        if (cVarF == task) {
            return true;
        }
        return false;
    }

    private final void y1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151750f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f151750f, this, null, C15820p0.f151766b)) {
                    return;
                }
            } else if (obj instanceof C16980q) {
                ((C16980q) obj).d();
                return;
            } else if (obj != C15820p0.f151766b) {
                C16980q c16980q = new C16980q(8, true);
                Intrinsics.h(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c16980q.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f151750f, this, obj, c16980q)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final Runnable z1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151750f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C16980q) {
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C16980q c16980q = (C16980q) obj;
                Object objM = c16980q.m();
                if (objM != C16980q.f159667h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f151750f, this, obj, c16980q.l());
            } else {
                if (obj == C15820p0.f151766b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f151750f, this, obj, null)) {
                    Intrinsics.h(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void A1(Runnable task) {
        B1();
        if (D1(task)) {
            q1();
        } else {
            RunnableC15788U.f151695i.A1(task);
        }
    }

    @Override // mv.Y
    public void H0(long timeMillis, InterfaceC15815n<? super Unit> continuation) {
        long jC = C15820p0.c(timeMillis);
        if (jC < 4611686018427387903L) {
            C15793c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, continuation);
            T1(jNanoTime, aVar);
            C15823r.a(continuation, aVar);
        }
    }

    @Override // mv.AbstractC15779K
    public final void J0(CoroutineContext context, Runnable block) {
        A1(block);
    }

    protected boolean P1() {
        if (!e1()) {
            return false;
        }
        d dVar = (d) f151751g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f151750f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C16980q) {
            return ((C16980q) obj).j();
        }
        if (obj != C15820p0.f151766b) {
            return false;
        }
        return true;
    }

    protected final void R1() {
        f151750f.set(this, null);
        f151751g.set(this, null);
    }

    public final void T1(long now, c delayedTask) {
        int iV1 = V1(now, delayedTask);
        if (iV1 != 0) {
            if (iV1 != 1) {
                if (iV1 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            } else {
                n1(now, delayedTask);
                return;
            }
        }
        if (a2(delayedTask)) {
            q1();
        }
    }

    protected final InterfaceC15804h0 W1(long timeMillis, Runnable block) {
        long jC = C15820p0.c(timeMillis);
        if (jC < 4611686018427387903L) {
            C15793c.a();
            long jNanoTime = System.nanoTime();
            b bVar = new b(jC + jNanoTime, block);
            T1(jNanoTime, bVar);
            return bVar;
        }
        return O0.f151684a;
    }

    @Override // mv.AbstractC15812l0
    protected long Z0() {
        c cVarF;
        if (super.Z0() == 0) {
            return 0L;
        }
        Object obj = f151750f.get(this);
        if (obj != null) {
            if (obj instanceof C16980q) {
                if (!((C16980q) obj).j()) {
                    return 0L;
                }
            } else {
                if (obj != C15820p0.f151766b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        d dVar = (d) f151751g.get(this);
        if (dVar == null || (cVarF = dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarF.nanoTime;
        C15793c.a();
        return RangesKt.g(j10 - System.nanoTime(), 0L);
    }

    @Override // mv.AbstractC15812l0
    public long f1() {
        if (h1()) {
            return 0L;
        }
        B1();
        Runnable runnableZ1 = z1();
        if (runnableZ1 != null) {
            runnableZ1.run();
            return 0L;
        }
        return Z0();
    }

    public InterfaceC15804h0 w(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return Y.a.a(this, j10, runnable, coroutineContext);
    }
}
