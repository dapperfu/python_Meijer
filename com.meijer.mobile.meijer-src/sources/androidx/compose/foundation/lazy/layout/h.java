package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.A0;
import androidx.compose.ui.node.B0;
import i0.C14592e;
import java.util.List;
import kotlin.C15861U;
import kotlin.C15883p;
import kotlin.InterfaceC15862V;
import kotlin.InterfaceC15863W;
import kotlin.InterfaceC15864X;
import kotlin.InterfaceC15885r;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h;", "", "Ln0/p;", "itemContentFactory", "Landroidx/compose/ui/layout/q0;", "subcomposeLayoutState", "Ln0/X;", "executor", "<init>", "(Ln0/p;Landroidx/compose/ui/layout/q0;Ln0/X;)V", "", "index", "LH1/b;", "constraints", "Ln0/U;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/d$b;", "d", "(IJLn0/U;)Landroidx/compose/foundation/lazy/layout/d$b;", "Ln0/V;", "c", "(IJLn0/U;)Ln0/V;", "a", "Ln0/p;", "b", "Landroidx/compose/ui/layout/q0;", "Ln0/X;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15883p itemContentFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q0 subcomposeLayoutState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15864X executor;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0014J\u0019\u0010 \u001a\f\u0018\u00010\u001eR\u00060\u0000R\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0016J\u0013\u0010%\u001a\u00020\u000e*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00102R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0016\u00105\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00102R \u00107\u001a\f\u0018\u00010\u001eR\u00060\u0000R\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010+R\u001c\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010+R\u0014\u0010?\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h$a;", "Landroidx/compose/foundation/lazy/layout/d$b;", "Ln0/V;", "", "index", "LH1/b;", "constraints", "Ln0/U;", "prefetchMetrics", "<init>", "(Landroidx/compose/foundation/lazy/layout/h;IJLn0/U;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "available", "average", "", "i", "(JJ)Z", "availableTimeNanos", "", "g", "(J)V", "j", "()V", "Ln0/r;", "itemProvider", "", "contentType", "e", "(Ln0/r;Ljava/lang/Object;)V", "f", "Landroidx/compose/foundation/lazy/layout/h$a$a;", "Landroidx/compose/foundation/lazy/layout/h;", "h", "()Landroidx/compose/foundation/lazy/layout/h$a$a;", "cancel", "a", "Ln0/W;", "b", "(Ln0/W;)Z", "", "toString", "()Ljava/lang/String;", "I", "J", "c", "Ln0/U;", "Landroidx/compose/ui/layout/q0$a;", "d", "Landroidx/compose/ui/layout/q0$a;", "precomposeHandle", "Z", "isMeasured", "isCanceled", "hasResolvedNestedPrefetches", "Landroidx/compose/foundation/lazy/layout/h$a$a;", "nestedPrefetchController", "isUrgent", "k", "elapsedTimeNanos", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "l", "startTime", "()Z", "isComposed", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private final class a implements d.b, InterfaceC15862V {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long constraints;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C15861U prefetchMetrics;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private q0.a precomposeHandle;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean isMeasured;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean isCanceled;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean hasResolvedNestedPrefetches;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private C1014a nestedPrefetchController;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isUrgent;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long availableTimeNanos;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long elapsedTimeNanos;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long startTime;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h$a$a;", "", "", "Landroidx/compose/foundation/lazy/layout/d;", "states", "<init>", "(Landroidx/compose/foundation/lazy/layout/h$a;Ljava/util/List;)V", "Ln0/W;", "", "a", "(Ln0/W;)Z", "Ljava/util/List;", "", "Ln0/V;", "b", "[Ljava/util/List;", "requestsByState", "", "c", "I", "stateIndex", "d", "requestIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.foundation.lazy.layout.h$a$a, reason: collision with other inner class name */
        private final class C1014a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<d> states;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final List<InterfaceC15862V>[] requestsByState;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int stateIndex;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int requestIndex;

            public C1014a(List<d> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    C14592e.a("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean a(InterfaceC15863W interfaceC15863W) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (a.this.isCanceled) {
                    C14592e.c("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.stateIndex < this.states.size()) {
                    try {
                        if (this.requestsByState[this.stateIndex] == null) {
                            if (interfaceC15863W.a() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List<InterfaceC15862V>[] listArr = this.requestsByState;
                            int i10 = this.stateIndex;
                            listArr[i10] = this.states.get(i10).b();
                        }
                        List<InterfaceC15862V> list = this.requestsByState[this.stateIndex];
                        Intrinsics.g(list);
                        while (this.requestIndex < list.size()) {
                            if (list.get(this.requestIndex).b(interfaceC15863W)) {
                                Trace.endSection();
                                return true;
                            }
                            this.requestIndex++;
                        }
                        this.requestIndex = 0;
                        this.stateIndex++;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                Unit unit = Unit.f143329a;
                Trace.endSection();
                return false;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/B0;", "it", "Landroidx/compose/ui/node/A0;", "a", "(Landroidx/compose/ui/node/B0;)Landroidx/compose/ui/node/A0;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class b extends Lambda implements Function1<B0, A0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<List<d>> f49102f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ref.ObjectRef<List<d>> objectRef) {
                super(1);
                this.f49102f = objectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final A0 invoke(B0 b02) {
                T tS;
                Intrinsics.h(b02, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                d dVarK2 = ((i) b02).getPrefetchState();
                Ref.ObjectRef<List<d>> objectRef = this.f49102f;
                List<d> list = objectRef.f143742a;
                if (list != null) {
                    list.add(dVarK2);
                    tS = list;
                } else {
                    tS = CollectionsKt.s(dVarK2);
                }
                objectRef.f143742a = tS;
                return A0.f51385b;
            }
        }

        public /* synthetic */ a(h hVar, int i10, long j10, C15861U c15861u, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, j10, c15861u);
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void a() {
            this.isUrgent = true;
        }

        private a(int i10, long j10, C15861U c15861u) {
            this.index = i10;
            this.constraints = j10;
            this.prefetchMetrics = c15861u;
            this.startTime = TimeSource.Monotonic.f148438a.a();
        }

        private final boolean d() {
            return this.precomposeHandle != null;
        }

        private final void e(InterfaceC15885r itemProvider, Object contentType) {
            if (!(this.precomposeHandle == null)) {
                C14592e.a("Request was already composed!");
            }
            Object objD = itemProvider.d(this.index);
            this.precomposeHandle = h.this.subcomposeLayoutState.i(objD, h.this.itemContentFactory.b(this.index, objD, contentType));
        }

        private final void f(long constraints) {
            if (this.isCanceled) {
                C14592e.a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                C14592e.a("Request was already measured!");
            }
            this.isMeasured = true;
            q0.a aVar = this.precomposeHandle;
            if (aVar == null) {
                C14592e.b("performComposition() must be called before performMeasure()");
                throw new KotlinNothingValueException();
            }
            int iA = aVar.a();
            for (int i10 = 0; i10 < iA; i10++) {
                aVar.c(i10, constraints);
            }
        }

        private final void g(long availableTimeNanos) {
            this.availableTimeNanos = availableTimeNanos;
            this.startTime = TimeSource.Monotonic.f148438a.a();
            this.elapsedTimeNanos = 0L;
        }

        private final C1014a h() {
            q0.a aVar = this.precomposeHandle;
            if (aVar == null) {
                C14592e.b("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            aVar.b("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new b(objectRef));
            List list = (List) objectRef.f143742a;
            if (list != null) {
                return new C1014a(list);
            }
            return null;
        }

        private final boolean i(long available, long average) {
            return (this.isUrgent && available > 0) || average < available;
        }

        private final void j() {
            long jA = TimeSource.Monotonic.f148438a.a();
            long jH = Duration.H(TimeSource.Monotonic.ValueTimeMark.m(jA, this.startTime));
            this.elapsedTimeNanos = jH;
            this.availableTimeNanos -= jH;
            this.startTime = jA;
        }

        @Override // kotlin.InterfaceC15862V
        public boolean b(InterfaceC15863W interfaceC15863W) {
            InterfaceC15885r interfaceC15885rInvoke = h.this.itemContentFactory.d().invoke();
            if (!this.isCanceled) {
                int iA = interfaceC15885rInvoke.a();
                int i10 = this.index;
                if (i10 >= 0 && i10 < iA) {
                    Object objF = interfaceC15885rInvoke.f(i10);
                    g(interfaceC15863W.a());
                    if (!d()) {
                        if (!i(this.availableTimeNanos, this.prefetchMetrics.b(objF))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            e(interfaceC15885rInvoke, objF);
                            Unit unit = Unit.f143329a;
                            Trace.endSection();
                            j();
                            this.prefetchMetrics.d(objF, this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                    if (!this.isUrgent) {
                        if (!this.hasResolvedNestedPrefetches) {
                            if (this.availableTimeNanos <= 0) {
                                return true;
                            }
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            try {
                                this.nestedPrefetchController = h();
                                this.hasResolvedNestedPrefetches = true;
                                Unit unit2 = Unit.f143329a;
                            } finally {
                            }
                        }
                        C1014a c1014a = this.nestedPrefetchController;
                        if (c1014a != null ? c1014a.a(interfaceC15863W) : false) {
                            return true;
                        }
                        j();
                    }
                    if (!this.isMeasured && !H1.b.p(this.constraints)) {
                        if (!i(this.availableTimeNanos, this.prefetchMetrics.c(objF))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            f(this.constraints);
                            Unit unit3 = Unit.f143329a;
                            Trace.endSection();
                            j();
                            this.prefetchMetrics.e(objF, this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            q0.a aVar = this.precomposeHandle;
            if (aVar != null) {
                aVar.dispose();
            }
            this.precomposeHandle = null;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.index + ", constraints = " + ((Object) H1.b.q(this.constraints)) + ", isComposed = " + d() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }
    }

    public final InterfaceC15862V c(int index, long constraints, C15861U prefetchMetrics) {
        return new a(this, index, constraints, prefetchMetrics, null);
    }

    public final d.b d(int index, long constraints, C15861U prefetchMetrics) {
        a aVar = new a(this, index, constraints, prefetchMetrics, null);
        this.executor.a(aVar);
        return aVar;
    }

    public h(C15883p c15883p, q0 q0Var, InterfaceC15864X interfaceC15864X) {
        this.itemContentFactory = c15883p;
        this.subcomposeLayoutState = q0Var;
        this.executor = interfaceC15864X;
    }
}
