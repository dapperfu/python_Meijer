package androidx.compose.runtime.snapshots;

import M0.p;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0011\u001a\u00020\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/a;", "Landroidx/compose/runtime/snapshots/b;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/i;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/i;)V", "Lkotlin/Function1;", "", "", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "R", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/b;", "o", "()V", "snapshot", "", "V", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "U", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "d", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a extends androidx.compose.runtime.snapshots.b {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.snapshots.a$a, reason: collision with other inner class name */
    static final class C1043a extends Lambda implements Function1<Object, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final C1043a f50374f = new C1043a();

        C1043a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            synchronized (j.J()) {
                try {
                    List list = j.f50426j;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((Function1) list.get(i10)).invoke(obj);
                    }
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public a(long j10, i iVar) {
        super(j10, iVar, null, C1043a.f50374f);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "invalid", "Landroidx/compose/runtime/snapshots/b;", "a", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/b;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<i, androidx.compose.runtime.snapshots.b> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f50375f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f50376g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.f50375f = function1;
            this.f50376g = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.b invoke(i iVar) {
            long j10;
            synchronized (j.J()) {
                j10 = j.f50422f;
                j.f50422f++;
            }
            return new androidx.compose.runtime.snapshots.b(j10, iVar, this.f50375f, this.f50376g);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "invalid", "Landroidx/compose/runtime/snapshots/f;", "a", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/f;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function1<i, f> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f50377f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1<Object, Unit> function1) {
            super(1);
            this.f50377f = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(i iVar) {
            long j10;
            synchronized (j.J()) {
                j10 = j.f50422f;
                j.f50422f++;
            }
            return new f(j10, iVar, this.f50377f);
        }
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.b
    public androidx.compose.runtime.snapshots.b R(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Function1<Object, Unit> function1;
        Map<N0.b, N0.a> mapD;
        E0.e eVar = N0.c.f21265a;
        if (eVar != null) {
            Pair<N0.a, Map<N0.b, N0.a>> pairE = N0.c.e(eVar, null, false, readObserver, writeObserver);
            N0.a aVarC = pairE.c();
            Function1<Object, Unit> function1A = aVarC.a();
            Function1<Object, Unit> function1B = aVarC.b();
            mapD = pairE.d();
            readObserver = function1A;
            function1 = function1B;
        } else {
            function1 = writeObserver;
            mapD = null;
        }
        androidx.compose.runtime.snapshots.b bVar = (androidx.compose.runtime.snapshots.b) j.b0(new b(readObserver, function1));
        if (eVar != null) {
            N0.c.b(eVar, null, bVar, mapD);
        }
        return bVar;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        synchronized (j.J()) {
            q();
            Unit unit = Unit.f142422a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void o() {
        j.C();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public g x(Function1<Object, Unit> readObserver) {
        Map<N0.b, N0.a> mapD;
        E0.e eVar = N0.c.f21265a;
        if (eVar != null) {
            Pair<N0.a, Map<N0.b, N0.a>> pairE = N0.c.e(eVar, null, true, readObserver, null);
            N0.a aVarC = pairE.c();
            Function1<Object, Unit> function1A = aVarC.a();
            aVarC.b();
            mapD = pairE.d();
            readObserver = function1A;
        } else {
            mapD = null;
        }
        f fVar = (f) j.b0(new c(readObserver));
        if (eVar != null) {
            N0.c.b(eVar, null, fVar, mapD);
        }
        return fVar;
    }
}
