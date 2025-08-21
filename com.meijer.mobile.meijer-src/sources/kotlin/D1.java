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
import kotlin.C6418E;
import kotlin.C6453j;
import kotlin.InterfaceC6452i;
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
import mv.InterfaceC15783O;
import q0.C16579a;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042)\b\u0002\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u008b\u0001\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142)\b\u0002\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "LV0/q0;", "backgroundColor", "contentColor", "Lkotlin/Function1;", "", "Lx0/B1;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "indicator", "Lkotlin/Function0;", "divider", "tabs", "b", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "edgePadding", "a", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "F", "ScrollableTabRowMinimumTabWidth", "Lc0/i;", "", "Lc0/i;", "ScrollableTabRowScrollSpec", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f167902a = H1.h.p(90);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC6452i<Float> f167903b = C6453j.l(250, 0, C6418E.c(), 2, null);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f167904f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(3);
            this.f167904f = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            a(list, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void a(List<TabPosition> list, Composer composer, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(-655609869, i10, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:232)");
            }
            C1 c12 = C1.f167869a;
            c12.b(c12.e(Modifier.INSTANCE, list.get(this.f167904f)), 0.0f, 0L, composer, 3072, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f167905f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167906g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167907h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167908i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f167909j;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r0;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/r0;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function2<r0, H1.b, J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f167910f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167911g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167912h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C17996d1 f167913i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f167914j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167915k;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: x0.D1$b$a$a, reason: collision with other inner class name */
            static final class C2674a extends Lambda implements Function1<f0.a, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f167916f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ List<f0> f167917g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ r0 f167918h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f167919i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ C17996d1 f167920j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ int f167921k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ long f167922l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ Ref.IntRef f167923m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.IntRef f167924n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167925o;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.D1$b$a$a$a, reason: collision with other inner class name */
                static final class C2675a extends Lambda implements Function2<Composer, Integer, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167926f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ List<TabPosition> f167927g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2675a(Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list) {
                        super(2);
                        this.f167926f = function3;
                        this.f167927g = list;
                    }

                    public final void a(Composer composer, int i10) {
                        if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-411868839, i10, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:292)");
                        }
                        this.f167926f.invoke(this.f167927g, composer, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        a(composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2674a(int i10, List<? extends f0> list, r0 r0Var, Function2<? super Composer, ? super Integer, Unit> function2, C17996d1 c17996d1, int i11, long j10, Ref.IntRef intRef, Ref.IntRef intRef2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3) {
                    super(1);
                    this.f167916f = i10;
                    this.f167917g = list;
                    this.f167918h = r0Var;
                    this.f167919i = function2;
                    this.f167920j = c17996d1;
                    this.f167921k = i11;
                    this.f167922l = j10;
                    this.f167923m = intRef;
                    this.f167924n = intRef2;
                    this.f167925o = function3;
                }

                public final void a(f0.a aVar) {
                    ArrayList arrayList = new ArrayList();
                    int i10 = this.f167916f;
                    List<f0> list = this.f167917g;
                    r0 r0Var = this.f167918h;
                    int size = list.size();
                    int width = i10;
                    for (int i11 = 0; i11 < size; i11++) {
                        f0 f0Var = list.get(i11);
                        f0.a.l(aVar, f0Var, width, 0, 0.0f, 4, null);
                        arrayList.add(new TabPosition(r0Var.K(width), r0Var.K(f0Var.getWidth()), null));
                        width += f0Var.getWidth();
                    }
                    List<I> listZ = this.f167918h.Z(E1.f167970b, this.f167919i);
                    long j10 = this.f167922l;
                    Ref.IntRef intRef = this.f167923m;
                    Ref.IntRef intRef2 = this.f167924n;
                    int size2 = listZ.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        I i13 = listZ.get(i12);
                        int i14 = intRef.f143740a;
                        f0 f0VarK0 = i13.k0(H1.b.d(j10, i14, i14, 0, 0, 8, null));
                        f0.a.l(aVar, f0VarK0, 0, intRef2.f143740a - f0VarK0.getHeight(), 0.0f, 4, null);
                    }
                    List<I> listZ2 = this.f167918h.Z(E1.f167971c, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new C2675a(this.f167925o, arrayList)));
                    Ref.IntRef intRef3 = this.f167923m;
                    Ref.IntRef intRef4 = this.f167924n;
                    int size3 = listZ2.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        f0.a.l(aVar, listZ2.get(i15).k0(H1.b.INSTANCE.c(intRef3.f143740a, intRef4.f143740a)), 0, 0, 0.0f, 4, null);
                    }
                    this.f167920j.c(this.f167918h, this.f167916f, arrayList, this.f167921k);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                    a(aVar);
                    return Unit.f143329a;
                }
            }

            public final J a(r0 r0Var, long j10) {
                int iE0 = r0Var.E0(D1.f167902a);
                int iE02 = r0Var.E0(this.f167910f);
                long jD = H1.b.d(j10, iE0, 0, 0, 0, 14, null);
                List<I> listZ = r0Var.Z(E1.f167969a, this.f167911g);
                ArrayList arrayList = new ArrayList(listZ.size());
                int size = listZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(listZ.get(i10).k0(jD));
                }
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.f143740a = iE02 * 2;
                Ref.IntRef intRef2 = new Ref.IntRef();
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    f0 f0Var = (f0) arrayList.get(i11);
                    intRef.f143740a += f0Var.getWidth();
                    intRef2.f143740a = Math.max(intRef2.f143740a, f0Var.getHeight());
                }
                return K.G0(r0Var, intRef.f143740a, intRef2.f143740a, null, new C2674a(iE02, arrayList, r0Var, this.f167912h, this.f167913i, this.f167914j, j10, intRef, intRef2, this.f167915k), 4, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(float f10, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, C17996d1 c17996d1, int i10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f167910f = f10;
                this.f167911g = function2;
                this.f167912h = function22;
                this.f167913i = c17996d1;
                this.f167914j = i10;
                this.f167915k = function3;
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
            this.f167905f = f10;
            this.f167906g = function2;
            this.f167907h = function22;
            this.f167908i = function3;
            this.f167909j = i10;
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
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB;
            boolean zV = composer.V(vC) | composer.V(interfaceC15783O);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new C17996d1(vC, interfaceC15783O);
                composer.t(objB2);
            }
            C17996d1 c17996d1 = (C17996d1) objB2;
            Modifier modifierB = T0.e.b(C16579a.a(T.b(androidx.compose.foundation.layout.J.F(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), P0.e.INSTANCE.h(), false, 2, null), vC, false, null, false, 14, null)));
            boolean zB = composer.b(this.f167905f) | composer.V(this.f167906g) | composer.V(this.f167907h) | composer.V(this.f167908i) | composer.D(c17996d1) | composer.d(this.f167909j);
            float f10 = this.f167905f;
            Function2<Composer, Integer, Unit> function2 = this.f167906g;
            Function2<Composer, Integer, Unit> function22 = this.f167907h;
            int i11 = this.f167909j;
            Function3<List<TabPosition>, Composer, Integer, Unit> function3 = this.f167908i;
            Object objB3 = composer.B();
            if (zB || objB3 == companion.a()) {
                Object aVar = new a(f10, function2, function22, c17996d1, i11, function3);
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f167928f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f167929g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f167930h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f167931i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f167932j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167933k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167934l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167935m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167936n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f167937o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(int i10, Modifier modifier, long j10, long j11, float f10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i11, int i12) {
            super(2);
            this.f167928f = i10;
            this.f167929g = modifier;
            this.f167930h = j10;
            this.f167931i = j11;
            this.f167932j = f10;
            this.f167933k = function3;
            this.f167934l = function2;
            this.f167935m = function22;
            this.f167936n = i11;
            this.f167937o = i12;
        }

        public final void a(Composer composer, int i10) {
            D1.a(this.f167928f, this.f167929g, this.f167930h, this.f167931i, this.f167932j, this.f167933k, this.f167934l, this.f167935m, composer, J0.a(this.f167936n | 1), this.f167937o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f167938f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(3);
            this.f167938f = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            a(list, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void a(List<TabPosition> list, Composer composer, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(-553782708, i10, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:141)");
            }
            C1 c12 = C1.f167869a;
            c12.b(c12.e(Modifier.INSTANCE, list.get(this.f167938f)), 0.0f, 0L, composer, 3072, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167939f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167940g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167941h;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r0;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/r0;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function2<r0, H1.b, J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167942f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167943g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167944h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: x0.D1$e$a$a, reason: collision with other inner class name */
            static final class C2676a extends Lambda implements Function1<f0.a, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ List<f0> f167945f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ r0 f167946g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f167947h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ int f167948i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ long f167949j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ int f167950k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167951l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ List<TabPosition> f167952m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ int f167953n;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: x0.D1$e$a$a$a, reason: collision with other inner class name */
                static final class C2677a extends Lambda implements Function2<Composer, Integer, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167954f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ List<TabPosition> f167955g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2677a(Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list) {
                        super(2);
                        this.f167954f = function3;
                        this.f167955g = list;
                    }

                    public final void a(Composer composer, int i10) {
                        if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-641946361, i10, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:176)");
                        }
                        this.f167954f.invoke(this.f167955g, composer, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        a(composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2676a(List<? extends f0> list, r0 r0Var, Function2<? super Composer, ? super Integer, Unit> function2, int i10, long j10, int i11, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list2, int i12) {
                    super(1);
                    this.f167945f = list;
                    this.f167946g = r0Var;
                    this.f167947h = function2;
                    this.f167948i = i10;
                    this.f167949j = j10;
                    this.f167950k = i11;
                    this.f167951l = function3;
                    this.f167952m = list2;
                    this.f167953n = i12;
                }

                public final void a(f0.a aVar) {
                    List<f0> list = this.f167945f;
                    int i10 = this.f167948i;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        f0.a.l(aVar, list.get(i11), i11 * i10, 0, 0.0f, 4, null);
                    }
                    List<I> listZ = this.f167946g.Z(E1.f167970b, this.f167947h);
                    long j10 = this.f167949j;
                    int i12 = this.f167950k;
                    int size2 = listZ.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        f0 f0VarK0 = listZ.get(i13).k0(H1.b.d(j10, 0, 0, 0, 0, 11, null));
                        f0.a.l(aVar, f0VarK0, 0, i12 - f0VarK0.getHeight(), 0.0f, 4, null);
                    }
                    List<I> listZ2 = this.f167946g.Z(E1.f167971c, ComposableLambdaKt.composableLambdaInstance(-641946361, true, new C2677a(this.f167951l, this.f167952m)));
                    int i14 = this.f167953n;
                    int i15 = this.f167950k;
                    int size3 = listZ2.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        f0.a.l(aVar, listZ2.get(i16).k0(H1.b.INSTANCE.c(i14, i15)), 0, 0, 0.0f, 4, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                    a(aVar);
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.f167942f = function2;
                this.f167943g = function22;
                this.f167944h = function3;
            }

            public final J a(r0 r0Var, long j10) {
                int i10;
                Object obj;
                int iL = H1.b.l(j10);
                List<I> listZ = r0Var.Z(E1.f167969a, this.f167942f);
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
                return K.G0(r0Var, iL, height3, null, new C2676a(arrayList, r0Var, this.f167943g, i11, j10, height3, this.f167944h, arrayList2, iL), 4, null);
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
            this.f167939f = function2;
            this.f167940g = function22;
            this.f167941h = function3;
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
            boolean zV = composer.V(this.f167939f) | composer.V(this.f167940g) | composer.V(this.f167941h);
            Function2<Composer, Integer, Unit> function2 = this.f167939f;
            Function2<Composer, Integer, Unit> function22 = this.f167940g;
            Function3<List<TabPosition>, Composer, Integer, Unit> function3 = this.f167941h;
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f167956f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f167957g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f167958h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f167959i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f167960j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167961k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167962l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f167963m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167964n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(int i10, Modifier modifier, long j10, long j11, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i11, int i12) {
            super(2);
            this.f167956f = i10;
            this.f167957g = modifier;
            this.f167958h = j10;
            this.f167959i = j11;
            this.f167960j = function3;
            this.f167961k = function2;
            this.f167962l = function22;
            this.f167963m = i11;
            this.f167964n = i12;
        }

        public final void a(Composer composer, int i10) {
            D1.b(this.f167956f, this.f167957g, this.f167958h, this.f167959i, this.f167960j, this.f167961k, this.f167962l, composer, J0.a(this.f167963m | 1), this.f167964n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
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
