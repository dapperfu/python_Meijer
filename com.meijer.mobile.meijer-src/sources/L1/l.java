package L1;

import L1.v;
import R1.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u001a*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!\"\u0015\u0010'\u001a\u00020$*\u00020#8F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010+\u001a\u00020(*\u00020#8F¢\u0006\u0006\u001a\u0004\b)\u0010**\f\b\u0000\u0010-\"\u00020,2\u00020,*\f\b\u0000\u0010/\"\u00020.2\u00020.*\f\b\u0000\u00101\"\u0002002\u000200*\f\b\u0000\u00103\"\u0002022\u000202¨\u00064"}, d2 = {"", "optimizationLevel", "LL1/n;", "scope", "Landroidx/compose/runtime/l0;", "", "remeasureRequesterState", "LL1/A;", "measurer", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "", "h", "(ILL1/n;Landroidx/compose/runtime/l0;LL1/A;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "", "e", "()Ljava/lang/Object;", "LL1/B;", "state", "", "Landroidx/compose/ui/layout/I;", "measurables", "d", "(LL1/B;Ljava/util/List;)V", "LQ1/e;", "", "i", "(LQ1/e;)Ljava/lang/String;", "LR1/b$a;", "j", "(LR1/b$a;)Ljava/lang/String;", "a", "Z", "DEBUG", "LL1/v$a;", "LL1/v$c;", "f", "(LL1/v$a;)LL1/v$c;", "atLeastWrapContent", "LL1/v$d;", "g", "(LL1/v$a;)LL1/v$d;", "atMostWrapContent", "LO1/e$b;", "SolverChain", "LO1/b;", "SolverDimension", "LO1/e$d;", "SolverDirection", "LO1/e;", "SolverState", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f17902a = false;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f17903a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f17904b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17905c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f17906d;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ A f17907f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<I> f17908g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(A a10, List<? extends I> list) {
                super(1);
                this.f17907f = a10;
                this.f17908g = list;
            }

            public final void a(f0.a layout) {
                Intrinsics.j(layout, "$this$layout");
                this.f17907f.k(layout, this.f17908g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        b(A a10, r rVar, int i10, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f17903a = a10;
            this.f17904b = rVar;
            this.f17905c = i10;
            this.f17906d = interfaceC5872l0;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K MeasurePolicy, List<? extends I> measurables, long j10) {
            Intrinsics.j(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.j(measurables, "measurables");
            long jL = this.f17903a.l(j10, MeasurePolicy.getLayoutDirection(), this.f17904b, measurables, this.f17905c, MeasurePolicy);
            this.f17906d.getValue();
            return K.G0(MeasurePolicy, H1.r.g(jL), H1.r.f(jL), null, new a(this.f17903a, measurables), 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int e(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            return MeasurePolicy.a.b(this, interfaceC5933s, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int g(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            return MeasurePolicy.a.c(this, interfaceC5933s, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int i(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            return MeasurePolicy.a.d(this, interfaceC5933s, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int j(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            return MeasurePolicy.a.a(this, interfaceC5933s, list, i10);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f17909f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f17910g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5872l0<Boolean> interfaceC5872l0, r rVar) {
            super(0);
            this.f17909f = interfaceC5872l0;
            this.f17910g = rVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f17909f.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
            this.f17910g.i(true);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"L1/l$a", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        a() {
        }
    }

    public static final void d(B state, List<? extends I> measurables) {
        Intrinsics.j(state, "state");
        Intrinsics.j(measurables, "measurables");
        int size = measurables.size() - 1;
        if (size < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            I i12 = measurables.get(i10);
            Object objA = C5937w.a(i12);
            if (objA == null && (objA = o.a(i12)) == null) {
                objA = e();
            }
            state.i(objA, i12);
            Object objB = o.b(i12);
            if (objB != null && (objB instanceof String) && (objA instanceof String)) {
                state.m((String) objA, (String) objB);
            }
            if (i11 > size) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static final Object e() {
        return new a();
    }

    public static final v.c f(v.a aVar) {
        Intrinsics.j(aVar, "<this>");
        w wVar = (w) aVar;
        wVar.f(O1.b.f23002j);
        return wVar;
    }

    public static final v.d g(v.a aVar) {
        Intrinsics.j(aVar, "<this>");
        w wVar = (w) aVar;
        wVar.e(O1.b.f23002j);
        return wVar;
    }

    @PublishedApi
    public static final Pair<MeasurePolicy, Function0<Unit>> h(int i10, n scope, InterfaceC5872l0<Boolean> remeasureRequesterState, A measurer, Composer composer, int i11) {
        Intrinsics.j(scope, "scope");
        Intrinsics.j(remeasureRequesterState, "remeasureRequesterState");
        Intrinsics.j(measurer, "measurer");
        composer.startReplaceableGroup(-441911751);
        composer.startReplaceableGroup(-3687241);
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = new r(scope);
            composer.t(objB);
        }
        composer.U();
        r rVar = (r) objB;
        Integer numValueOf = Integer.valueOf(i10);
        composer.startReplaceableGroup(-3686930);
        boolean zV = composer.V(numValueOf);
        Object objB2 = composer.B();
        if (zV || objB2 == companion.a()) {
            objB2 = TuplesKt.a(new b(measurer, rVar, i10, remeasureRequesterState), new c(remeasureRequesterState, rVar));
            composer.t(objB2);
        }
        composer.U();
        Pair<MeasurePolicy, Function0<Unit>> pair = (Pair) objB2;
        composer.U();
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(Q1.e eVar) {
        return ((Object) eVar.o()) + " width " + eVar.M() + " minWidth " + eVar.B() + " maxWidth " + eVar.z() + " height " + eVar.s() + " minHeight " + eVar.A() + " maxHeight " + eVar.y() + " HDB " + eVar.v() + " VDB " + eVar.K() + " MCW " + eVar.f27636w + " MCH " + eVar.f27638x + " percentW " + eVar.f27559B + " percentH " + eVar.f27565E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(b.a aVar) {
        return "measure strategy is ";
    }
}
