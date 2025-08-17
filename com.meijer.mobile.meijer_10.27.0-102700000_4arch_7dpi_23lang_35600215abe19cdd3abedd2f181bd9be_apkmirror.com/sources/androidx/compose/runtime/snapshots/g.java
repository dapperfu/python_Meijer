package androidx.compose.runtime.snapshots;

import J0.n;
import M0.w;
import androidx.compose.runtime.C5757z0;
import androidx.compose.runtime.snapshots.g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 22\u00020\u0001:\u0001$B\u001d\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH ¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00058\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R2\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010*\u001a\u00060\u0002j\u0002`\u00038\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00109\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\n\u00107\u0012\u0004\b8\u0010\u000bR$\u0010>\u001a\u00020!2\u0006\u0010:\u001a\u00020!8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b;\u0010#\"\u0004\b<\u0010=R\u0014\u0010@\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u00103R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X¡\u0004¢\u0006\f\u0012\u0004\bC\u0010\u000b\u001a\u0004\bA\u0010BR\"\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X \u0004¢\u0006\u0006\u001a\u0004\bD\u0010B\u0082\u0001\u0004FGHI¨\u0006J"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/i;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/i;)V", "", "d", "()V", "Lkotlin/Function1;", "readObserver", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "l", "()Landroidx/compose/runtime/snapshots/g;", "snapshot", "s", "(Landroidx/compose/runtime/snapshots/g;)V", "m", "n", "LM0/w;", "state", "p", "(LM0/w;)V", "o", "b", "c", "r", "z", "q", "", "y", "()I", "a", "Landroidx/compose/runtime/snapshots/i;", "f", "()Landroidx/compose/runtime/snapshots/i;", "u", "(Landroidx/compose/runtime/snapshots/i;)V", "<set-?>", "J", "i", "()J", "v", "(J)V", "", "Z", "e", "()Z", "t", "(Z)V", "disposed", "I", "getPinningTrackingHandle$annotations", "pinningTrackingHandle", "value", "j", "w", "(I)V", "writeCount", "h", "readOnly", "g", "()Lkotlin/jvm/functions/Function1;", "getReadObserver$annotations", "k", "writeObserver", "Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/d;", "Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/m;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f50398f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private i invalid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long snapshotId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pinningTrackingHandle;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u001c2\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u001c2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u0003R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010$¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/g$a;", "", "<init>", "()V", "Lkotlin/Function1;", "", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "o", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "Landroidx/compose/runtime/snapshots/b;", "n", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/b;", "T", "Lkotlin/Function0;", "block", "g", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "previous", "e", "(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;", "nonObservable", "observer", "l", "(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "LM0/b;", "h", "(Lkotlin/jvm/functions/Function2;)LM0/b;", "j", "(Lkotlin/jvm/functions/Function1;)LM0/b;", "f", "m", "c", "()Landroidx/compose/runtime/snapshots/g;", "current", "d", "getCurrentThreadSnapshot$annotations", "currentThreadSnapshot", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.snapshots.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @PublishedApi
        public final g e(g previous) {
            if (previous instanceof l) {
                l lVar = (l) previous;
                if (lVar.getThreadId() == n.a()) {
                    lVar.Y(null);
                    return previous;
                }
            }
            if (previous instanceof m) {
                m mVar = (m) previous;
                if (mVar.C() == n.a()) {
                    mVar.F(null);
                    return previous;
                }
            }
            g gVarF = j.F(previous, null, false, 6, null);
            gVarF.l();
            return gVarF;
        }

        public final <T> T g(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver, Function0<? extends T> block) {
            g lVar;
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            g gVar = (g) j.f50419c.a();
            if (gVar instanceof l) {
                l lVar2 = (l) gVar;
                if (lVar2.getThreadId() == n.a()) {
                    Function1<Object, Unit> function1H = lVar2.g();
                    Function1<Object, Unit> function1K = lVar2.k();
                    try {
                        ((l) gVar).Y(j.L(readObserver, function1H, false, 4, null));
                        ((l) gVar).Z(j.M(writeObserver, function1K));
                        return block.invoke();
                    } finally {
                        lVar2.Y(function1H);
                        lVar2.Z(function1K);
                    }
                }
            }
            if (gVar == null || (gVar instanceof b)) {
                lVar = new l(gVar instanceof b ? (b) gVar : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                lVar = gVar.x(readObserver);
            }
            try {
                g gVarL = lVar.l();
                try {
                    T tInvoke = block.invoke();
                    lVar.s(gVarL);
                    lVar.d();
                    return tInvoke;
                } catch (Throwable th2) {
                    lVar.s(gVarL);
                    throw th2;
                }
            } catch (Throwable th3) {
                lVar.d();
                throw th3;
            }
        }

        @PublishedApi
        public final void l(g previous, g nonObservable, Function1<Object, Unit> observer) {
            if (previous != nonObservable) {
                nonObservable.s(previous);
                nonObservable.d();
            } else if (previous instanceof l) {
                ((l) previous).Y(observer);
            } else {
                if (previous instanceof m) {
                    ((m) previous).F(observer);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function2 function2) {
            synchronized (j.J()) {
                j.f50425i = CollectionsKt.M0(j.f50425i, function2);
                Unit unit = Unit.f142422a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(Function1 function1) {
            synchronized (j.J()) {
                j.f50426j = CollectionsKt.M0(j.f50426j, function1);
                Unit unit = Unit.f142422a;
            }
            j.C();
        }

        public final g c() {
            return j.I();
        }

        public final g d() {
            return (g) j.f50419c.a();
        }

        public final void f() {
            j.I().o();
        }

        public final M0.b h(final Function2<? super Set<? extends Object>, ? super g, Unit> observer) {
            j.B(j.f50417a);
            synchronized (j.J()) {
                j.f50425i = CollectionsKt.Q0(j.f50425i, observer);
                Unit unit = Unit.f142422a;
            }
            return new M0.b() { // from class: M0.c
                @Override // M0.b
                public final void dispose() {
                    g.Companion.i(observer);
                }
            };
        }

        public final M0.b j(final Function1<Object, Unit> observer) {
            synchronized (j.J()) {
                j.f50426j = CollectionsKt.Q0(j.f50426j, observer);
                Unit unit = Unit.f142422a;
            }
            j.C();
            return new M0.b() { // from class: M0.d
                @Override // M0.b
                public final void dispose() {
                    g.Companion.k(observer);
                }
            };
        }

        public final void m() {
            boolean zI;
            synchronized (j.J()) {
                zI = j.f50427k.I();
            }
            if (zI) {
                j.C();
            }
        }

        public final b n(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
            b bVar;
            b bVarR;
            g gVarI = j.I();
            if (gVarI instanceof b) {
                bVar = (b) gVarI;
            } else {
                bVar = null;
            }
            if (bVar != null && (bVarR = bVar.R(readObserver, writeObserver)) != null) {
                return bVarR;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }

        public final g o(Function1<Object, Unit> readObserver) {
            return j.I().x(readObserver);
        }
    }

    public /* synthetic */ g(long j10, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, iVar);
    }

    public void d() {
        this.disposed = true;
        synchronized (j.J()) {
            q();
            Unit unit = Unit.f142422a;
        }
    }

    public abstract Function1<Object, Unit> g();

    public abstract boolean h();

    public int j() {
        return 0;
    }

    public abstract Function1<Object, Unit> k();

    public abstract void m(g snapshot);

    public abstract void n(g snapshot);

    public abstract void o();

    public abstract void p(w state);

    public abstract g x(Function1<Object, Unit> readObserver);

    private g(long j10, i iVar) {
        this.invalid = iVar;
        this.snapshotId = j10;
        this.pinningTrackingHandle = j10 != j.f50418b ? j.c0(j10, getInvalid()) : -1;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    /* renamed from: f, reason: from getter */
    public i getInvalid() {
        return this.invalid;
    }

    /* renamed from: i, reason: from getter */
    public long getSnapshotId() {
        return this.snapshotId;
    }

    public final void q() {
        int i10 = this.pinningTrackingHandle;
        if (i10 >= 0) {
            j.Y(i10);
            this.pinningTrackingHandle = -1;
        }
    }

    public final void t(boolean z10) {
        this.disposed = z10;
    }

    public void u(i iVar) {
        this.invalid = iVar;
    }

    public void v(long j10) {
        this.snapshotId = j10;
    }

    public void w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public final int y() {
        int i10 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i10;
    }

    public final void z() {
        if (this.disposed) {
            C5757z0.a("Cannot use a disposed snapshot");
        }
    }

    public final void b() {
        synchronized (j.J()) {
            c();
            r();
            Unit unit = Unit.f142422a;
        }
    }

    public void c() {
        j.f50421e = j.f50421e.p(getSnapshotId());
    }

    @PublishedApi
    public g l() {
        g gVar = (g) j.f50419c.a();
        j.f50419c.b(this);
        return gVar;
    }

    public void r() {
        q();
    }

    @PublishedApi
    public void s(g snapshot) {
        j.f50419c.b(snapshot);
    }
}
