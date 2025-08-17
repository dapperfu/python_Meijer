package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.r0;
import d0.T;
import d0.V;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6292E;
import kotlin.C6327j;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import q0.C16424a;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042)\b\u0002\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u008b\u0001\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142)\b\u0002\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "LV0/q0;", "backgroundColor", "contentColor", "Lkotlin/Function1;", "", "Lx0/B1;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "indicator", "Lkotlin/Function0;", "divider", "tabs", "b", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "edgePadding", "a", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "F", "ScrollableTabRowMinimumTabWidth", "Lc0/i;", "", "Lc0/i;", "ScrollableTabRowScrollSpec", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f166814a = H1.h.p(90);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC6326i<Float> f166815b = C6327j.l(250, 0, C6292E.c(), 2, null);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f166816f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(3);
            this.f166816f = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            a(list, composer, num.intValue());
            return Unit.f142422a;
        }

        public final void a(List<TabPosition> list, Composer composer, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(-655609869, i10, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:232)");
            }
            C1 c12 = C1.f166781a;
            c12.b(c12.e(Modifier.INSTANCE, list.get(this.f166816f)), 0.0f, 0L, composer, 3072, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f166817f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f166818g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f166819h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166820i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f166821j;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r0;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/r0;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function2<r0, H1.b, J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f166822f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f166823g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f166824h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C17930d1 f166825i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f166826j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166827k;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: x0.D1$b$a$a, reason: collision with other inner class name */
            static final class C2650a extends Lambda implements Function1<f0.a, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f166828f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ List<f0> f166829g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ r0 f166830h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f166831i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ C17930d1 f166832j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ int f166833k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ long f166834l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ Ref.IntRef f166835m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.IntRef f166836n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166837o;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.D1$b$a$a$a, reason: collision with other inner class name */
                static final class C2651a extends Lambda implements Function2<Composer, Integer, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166838f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ List<TabPosition> f166839g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2651a(Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list) {
                        super(2);
                        this.f166838f = function3;
                        this.f166839g = list;
                    }

                    public final void a(Composer composer, int i10) {
                        if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-411868839, i10, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:292)");
                        }
                        this.f166838f.invoke(this.f166839g, composer, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        a(composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2650a(int i10, List<? extends f0> list, r0 r0Var, Function2<? super Composer, ? super Integer, Unit> function2, C17930d1 c17930d1, int i11, long j10, Ref.IntRef intRef, Ref.IntRef intRef2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3) {
                    super(1);
                    this.f166828f = i10;
                    this.f166829g = list;
                    this.f166830h = r0Var;
                    this.f166831i = function2;
                    this.f166832j = c17930d1;
                    this.f166833k = i11;
                    this.f166834l = j10;
                    this.f166835m = intRef;
                    this.f166836n = intRef2;
                    this.f166837o = function3;
                }

                public final void a(f0.a aVar) {
                    ArrayList arrayList = new ArrayList();
                    int i10 = this.f166828f;
                    List<f0> list = this.f166829g;
                    r0 r0Var = this.f166830h;
                    int size = list.size();
                    int width = i10;
                    for (int i11 = 0; i11 < size; i11++) {
                        f0 f0Var = list.get(i11);
                        f0.a.l(aVar, f0Var, width, 0, 0.0f, 4, null);
                        arrayList.add(new TabPosition(r0Var.K(width), r0Var.K(f0Var.getWidth()), null));
                        width += f0Var.getWidth();
                    }
                    List<I> listZ = this.f166830h.Z(E1.f166882b, this.f166831i);
                    long j10 = this.f166834l;
                    Ref.IntRef intRef = this.f166835m;
                    Ref.IntRef intRef2 = this.f166836n;
                    int size2 = listZ.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        I i13 = listZ.get(i12);
                        int i14 = intRef.f142833a;
                        f0 f0VarK0 = i13.k0(H1.b.d(j10, i14, i14, 0, 0, 8, null));
                        f0.a.l(aVar, f0VarK0, 0, intRef2.f142833a - f0VarK0.getHeight(), 0.0f, 4, null);
                    }
                    List<I> listZ2 = this.f166830h.Z(E1.f166883c, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new C2651a(this.f166837o, arrayList)));
                    Ref.IntRef intRef3 = this.f166835m;
                    Ref.IntRef intRef4 = this.f166836n;
                    int size3 = listZ2.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        f0.a.l(aVar, listZ2.get(i15).k0(H1.b.INSTANCE.c(intRef3.f142833a, intRef4.f142833a)), 0, 0, 0.0f, 4, null);
                    }
                    this.f166832j.c(this.f166830h, this.f166828f, arrayList, this.f166833k);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                    a(aVar);
                    return Unit.f142422a;
                }
            }

            public final J a(r0 r0Var, long j10) {
                int iE0 = r0Var.E0(D1.f166814a);
                int iE02 = r0Var.E0(this.f166822f);
                long jD = H1.b.d(j10, iE0, 0, 0, 0, 14, null);
                List<I> listZ = r0Var.Z(E1.f166881a, this.f166823g);
                ArrayList arrayList = new ArrayList(listZ.size());
                int size = listZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(listZ.get(i10).k0(jD));
                }
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.f142833a = iE02 * 2;
                Ref.IntRef intRef2 = new Ref.IntRef();
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    f0 f0Var = (f0) arrayList.get(i11);
                    intRef.f142833a += f0Var.getWidth();
                    intRef2.f142833a = Math.max(intRef2.f142833a, f0Var.getHeight());
                }
                return K.G0(r0Var, intRef.f142833a, intRef2.f142833a, null, new C2650a(iE02, arrayList, r0Var, this.f166824h, this.f166825i, this.f166826j, j10, intRef, intRef2, this.f166827k), 4, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(float f10, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, C17930d1 c17930d1, int i10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f166822f = f10;
                this.f166823g = function2;
                this.f166824h = function22;
                this.f166825i = c17930d1;
                this.f166826j = i10;
                this.f166827k = function3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ J invoke(r0 r0Var, H1.b bVar) {
                return a(r0Var, bVar.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(float f10, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f166817f = f10;
            this.f166818g = function2;
            this.f166819h = function22;
            this.f166820i = function3;
            this.f166821j = i10;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1455860572, i10, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:238)");
            }
            V vC = T.c(0, composer, 0, 1);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
            boolean zV = composer.V(vC) | composer.V(interfaceC16622O);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new C17930d1(vC, interfaceC16622O);
                composer.t(objB2);
            }
            C17930d1 c17930d1 = (C17930d1) objB2;
            Modifier modifierB = T0.e.b(C16424a.a(T.b(androidx.compose.foundation.layout.J.F(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), P0.e.INSTANCE.h(), false, 2, null), vC, false, null, false, 14, null)));
            boolean zB = composer.b(this.f166817f) | composer.V(this.f166818g) | composer.V(this.f166819h) | composer.V(this.f166820i) | composer.D(c17930d1) | composer.d(this.f166821j);
            float f10 = this.f166817f;
            Function2<Composer, Integer, Unit> function2 = this.f166818g;
            Function2<Composer, Integer, Unit> function22 = this.f166819h;
            int i11 = this.f166821j;
            Function3<List<TabPosition>, Composer, Integer, Unit> function3 = this.f166820i;
            Object objB3 = composer.B();
            if (zB || objB3 == companion.a()) {
                Object aVar = new a(f10, function2, function22, c17930d1, i11, function3);
                composer.t(aVar);
                objB3 = aVar;
            }
            p0.a(modifierB, (Function2) objB3, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f166840f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f166841g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f166842h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f166843i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f166844j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166845k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f166846l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f166847m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f166848n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f166849o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(int i10, Modifier modifier, long j10, long j11, float f10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i11, int i12) {
            super(2);
            this.f166840f = i10;
            this.f166841g = modifier;
            this.f166842h = j10;
            this.f166843i = j11;
            this.f166844j = f10;
            this.f166845k = function3;
            this.f166846l = function2;
            this.f166847m = function22;
            this.f166848n = i11;
            this.f166849o = i12;
        }

        public final void a(Composer composer, int i10) {
            D1.a(this.f166840f, this.f166841g, this.f166842h, this.f166843i, this.f166844j, this.f166845k, this.f166846l, this.f166847m, composer, J0.a(this.f166848n | 1), this.f166849o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f166850f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(3);
            this.f166850f = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            a(list, composer, num.intValue());
            return Unit.f142422a;
        }

        public final void a(List<TabPosition> list, Composer composer, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(-553782708, i10, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:141)");
            }
            C1 c12 = C1.f166781a;
            c12.b(c12.e(Modifier.INSTANCE, list.get(this.f166850f)), 0.0f, 0L, composer, 3072, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f166851f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f166852g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166853h;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r0;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/r0;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function2<r0, H1.b, J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f166854f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f166855g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166856h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: x0.D1$e$a$a, reason: collision with other inner class name */
            static final class C2652a extends Lambda implements Function1<f0.a, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ List<f0> f166857f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ r0 f166858g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f166859h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ int f166860i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ long f166861j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ int f166862k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166863l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ List<TabPosition> f166864m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ int f166865n;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.D1$e$a$a$a, reason: collision with other inner class name */
                static final class C2653a extends Lambda implements Function2<Composer, Integer, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166866f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ List<TabPosition> f166867g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2653a(Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list) {
                        super(2);
                        this.f166866f = function3;
                        this.f166867g = list;
                    }

                    public final void a(Composer composer, int i10) {
                        if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-641946361, i10, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:176)");
                        }
                        this.f166866f.invoke(this.f166867g, composer, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        a(composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2652a(List<? extends f0> list, r0 r0Var, Function2<? super Composer, ? super Integer, Unit> function2, int i10, long j10, int i11, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list2, int i12) {
                    super(1);
                    this.f166857f = list;
                    this.f166858g = r0Var;
                    this.f166859h = function2;
                    this.f166860i = i10;
                    this.f166861j = j10;
                    this.f166862k = i11;
                    this.f166863l = function3;
                    this.f166864m = list2;
                    this.f166865n = i12;
                }

                public final void a(f0.a aVar) {
                    List<f0> list = this.f166857f;
                    int i10 = this.f166860i;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        f0.a.l(aVar, list.get(i11), i11 * i10, 0, 0.0f, 4, null);
                    }
                    List<I> listZ = this.f166858g.Z(E1.f166882b, this.f166859h);
                    long j10 = this.f166861j;
                    int i12 = this.f166862k;
                    int size2 = listZ.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        f0 f0VarK0 = listZ.get(i13).k0(H1.b.d(j10, 0, 0, 0, 0, 11, null));
                        f0.a.l(aVar, f0VarK0, 0, i12 - f0VarK0.getHeight(), 0.0f, 4, null);
                    }
                    List<I> listZ2 = this.f166858g.Z(E1.f166883c, ComposableLambdaKt.composableLambdaInstance(-641946361, true, new C2653a(this.f166863l, this.f166864m)));
                    int i14 = this.f166865n;
                    int i15 = this.f166862k;
                    int size3 = listZ2.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        f0.a.l(aVar, listZ2.get(i16).k0(H1.b.INSTANCE.c(i14, i15)), 0, 0, 0.0f, 4, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                    a(aVar);
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f166854f = function2;
                this.f166855g = function22;
                this.f166856h = function3;
            }

            public final J a(r0 r0Var, long j10) {
                int i10;
                Object obj;
                int iL = H1.b.l(j10);
                List<I> listZ = r0Var.Z(E1.f166881a, this.f166854f);
                int size = listZ.size();
                int i11 = iL / size;
                ArrayList arrayList = new ArrayList(listZ.size());
                int size2 = listZ.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    I i13 = listZ.get(i12);
                    int i14 = i11;
                    long jD = H1.b.d(j10, i14, i11, 0, 0, 12, null);
                    i11 = i14;
                    arrayList.add(i13.k0(jD));
                }
                if (arrayList.isEmpty()) {
                    obj = null;
                    i10 = 0;
                } else {
                    i10 = 0;
                    obj = arrayList.get(0);
                    int height = ((f0) obj).getHeight();
                    int iO = CollectionsKt.o(arrayList);
                    int i15 = 1;
                    if (1 <= iO) {
                        while (true) {
                            Object obj2 = arrayList.get(i15);
                            int height2 = ((f0) obj2).getHeight();
                            if (height < height2) {
                                obj = obj2;
                                height = height2;
                            }
                            if (i15 == iO) {
                                break;
                            }
                            i15++;
                        }
                    }
                }
                f0 f0Var = (f0) obj;
                int height3 = f0Var != null ? f0Var.getHeight() : i10;
                ArrayList arrayList2 = new ArrayList(size);
                for (int i16 = i10; i16 < size; i16++) {
                    arrayList2.add(new TabPosition(H1.h.p(r0Var.K(i11) * i16), r0Var.K(i11), null));
                }
                return K.G0(r0Var, iL, height3, null, new C2652a(arrayList, r0Var, this.f166855g, i11, j10, height3, this.f166856h, arrayList2, iL), 4, null);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ J invoke(r0 r0Var, H1.b bVar) {
                return a(r0Var, bVar.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f166851f = function2;
            this.f166852g = function22;
            this.f166853h = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1961746365, i10, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:151)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            boolean zV = composer.V(this.f166851f) | composer.V(this.f166852g) | composer.V(this.f166853h);
            Function2<Composer, Integer, Unit> function2 = this.f166851f;
            Function2<Composer, Integer, Unit> function22 = this.f166852g;
            Function3<List<TabPosition>, Composer, Integer, Unit> function3 = this.f166853h;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(function2, function22, function3);
                composer.t(objB);
            }
            p0.a(modifierH, (Function2) objB, composer, 6, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f166868f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f166869g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f166870h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f166871i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f166872j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f166873k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f166874l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f166875m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f166876n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(int i10, Modifier modifier, long j10, long j11, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i11, int i12) {
            super(2);
            this.f166868f = i10;
            this.f166869g = modifier;
            this.f166870h = j10;
            this.f166871i = j11;
            this.f166872j = function3;
            this.f166873k = function2;
            this.f166874l = function22;
            this.f166875m = i11;
            this.f166876n = i12;
        }

        public final void a(Composer composer, int i10) {
            D1.b(this.f166868f, this.f166869g, this.f166870h, this.f166871i, this.f166872j, this.f166873k, this.f166874l, composer, J0.a(this.f166875m | 1), this.f166876n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r25, androidx.compose.ui.Modifier r26, long r27, long r29, float r31, kotlin.jvm.functions.Function3<? super java.util.List<kotlin.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.D1.a(int, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r23, androidx.compose.ui.Modifier r24, long r25, long r27, kotlin.jvm.functions.Function3<? super java.util.List<kotlin.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.D1.b(int, androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
