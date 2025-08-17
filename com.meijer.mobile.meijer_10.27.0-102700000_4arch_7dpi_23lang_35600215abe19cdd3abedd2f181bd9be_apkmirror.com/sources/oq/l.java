package oq;

import F1.j;
import Ji.I;
import Ji.LocalThemeScope;
import Ji.Q;
import L1.A;
import L1.C;
import L1.C4039g;
import L1.n;
import L1.x;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import eq.Asset;
import eq.C13729d;
import g1.J;
import g1.U;
import hq.ShopAndScanStoreDecorator;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import java.util.List;
import ji.InterfaceC14920X;
import ji.InterfaceC14971y;
import ji.Q0;
import ji.j1;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17988z0;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15339A;
import l0.C15340B;
import l0.C15342b;
import l0.InterfaceC15343c;
import l0.w;
import ni.E0;
import oq.l;
import oq.p;
import p1.C16190d;
import p1.C16193g;
import r0.C16692i;
import r1.C16705m;
import r1.u;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\u0016\u0010\u0013\u001a1\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001c\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\u001c\u0010\u0015\u001a1\u0010!\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\b!\u0010\"¨\u0006%²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Loq/p;", "viewModel", "Landroidx/compose/ui/Modifier;", "modifier", "", "B", "(LJi/M;Loq/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Loq/p$b;", "viewState", "Lkotlin/Function1;", "Loq/p$a;", "onAction", "w", "(LJi/M;Landroidx/compose/ui/Modifier;Loq/p$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lhq/j;", "stores", "r", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "l", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "y", "decorator", "Lkotlin/Function0;", "onClick", "t", "(LJi/M;Landroidx/compose/ui/Modifier;Lhq/j;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "p", "", "isVisible", "Lak/a;", "text", "n", "(LJi/M;Landroidx/compose/ui/Modifier;ZLak/a;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154774a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f154775b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f154776c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: oq.l$a$a, reason: collision with other inner class name */
        static final class C2402a implements PointerInputEventHandler {

            /* renamed from: a, reason: collision with root package name */
            public static final C2402a f154777a = new C2402a();

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(J j10, Continuation<? super Unit> continuation) {
                return Unit.f142422a;
            }

            C2402a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f154778a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154779b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f154780c;

            b(AbstractC5607a abstractC5607a, LocalThemeScope localThemeScope, Modifier modifier) {
                this.f154778a = abstractC5607a;
                this.f154779b = localThemeScope;
                this.f154780c = modifier;
            }

            public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(486716878, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.LoadingSpinner.<anonymous>.<anonymous>.<anonymous> (ShopAndScanStoreSelectionScreen.kt:314)");
                }
                Bi.m.d(this.f154779b, this.f154780c, Assemble.getLoading().getLargeLoading(), Bi.o.f2584a, C6408b.a(this.f154778a, composer, AbstractC5607a.f45514b), null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 48);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                a(interfaceC14920X, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Modifier modifier) {
            this.f154774a = localThemeScope;
            this.f154775b = abstractC5607a;
            this.f154776c = modifier;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-1992648231, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.LoadingSpinner.<anonymous> (ShopAndScanStoreSelectionScreen.kt:304)");
            }
            Modifier modifierB = androidx.compose.foundation.g.b(androidx.compose.foundation.b.d(T0.a.a(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), 0.97f), this.f154774a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), true, null, 2, null);
            Unit unit = Unit.f142422a;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C2402a.f154777a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierC = U.c(modifierB, unit, (PointerInputEventHandler) objB);
            P0.e eVarE = P0.e.INSTANCE.e();
            LocalThemeScope localThemeScope = this.f154774a;
            AbstractC5607a abstractC5607a = this.f154775b;
            Modifier modifier = this.f154776c;
            MeasurePolicy measurePolicyG = C5662h.g(eVarE, false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(486716878, true, new b(abstractC5607a, localThemeScope, modifier), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            a(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f154782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<p.a, Unit> f154783c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f154784a;

            a(LocalThemeScope localThemeScope) {
                this.f154784a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1045747470, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionButtonsComponent.<anonymous>.<anonymous>.<anonymous> (ShopAndScanStoreSelectionScreen.kt:281)");
                }
                LocalThemeScope localThemeScope = this.f154784a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f154784a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(com.meijer.mobile.shopandscan.e.f116966e, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Modifier modifier, Function1<? super p.a, Unit> function1) {
            this.f154781a = localThemeScope;
            this.f154782b = modifier;
            this.f154783c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(p.a.b.f154832a);
            return Unit.f142422a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(995438497, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionButtonsComponent.<anonymous>.<anonymous> (ShopAndScanStoreSelectionScreen.kt:270)");
            }
            LocalThemeScope localThemeScope = this.f154781a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, T0.l.b(D.i(this.f154782b, H1.h.p(16)), H1.h.p(2), C16692i.c(H1.h.p(5)), false, 0L, 0L, 28, null), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f154783c);
            final Function1<p.a, Unit> function1 = this.f154783c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: oq.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l.b.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1045747470, true, new a(this.f154781a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f154785f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(A a10) {
            super(1);
            this.f154785f = a10;
        }

        public final void a(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f154785f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f154786f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f154787g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f154788h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f154789i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154790j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Modifier f154791k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f154792l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L1.n nVar, int i10, Function0 function0, List list, LocalThemeScope localThemeScope, Modifier modifier, Function1 function1) {
            super(2);
            this.f154787g = nVar;
            this.f154788h = function0;
            this.f154789i = list;
            this.f154790j = localThemeScope;
            this.f154791k = modifier;
            this.f154792l = function1;
            this.f154786f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f154787g.getHelpersHashCode();
            this.f154787g.i();
            L1.n nVar = this.f154787g;
            composer.startReplaceGroup(-1473868352);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            if (this.f154789i.isEmpty()) {
                composer.startReplaceGroup(-1473812646);
                LocalThemeScope localThemeScope = this.f154790j;
                Modifier modifierF = androidx.compose.foundation.layout.J.f(this.f154791k, 0.0f, 1, null);
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = e.f154793a;
                    composer.t(objB);
                }
                composer.P();
                l.l(localThemeScope, nVar.k(modifierF, hVarC, (Function1) objB), this.f154792l, composer, LocalThemeScope.f15770g);
                composer.P();
            } else {
                composer.startReplaceGroup(-1473572365);
                LocalThemeScope localThemeScope2 = this.f154790j;
                Modifier modifierF2 = androidx.compose.foundation.layout.J.f(this.f154791k, 0.0f, 1, null);
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = f.f154794a;
                    composer.t(objB2);
                }
                composer.P();
                l.y(localThemeScope2, nVar.k(modifierF2, hVarA, (Function1) objB2), this.f154789i, this.f154792l, composer, LocalThemeScope.f15770g);
                composer.P();
            }
            composer.P();
            if (this.f154787g.getHelpersHashCode() != helpersHashCode) {
                this.f154788h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f154793a = new e();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f154794a = new f();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f154795f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(A a10) {
            super(1);
            this.f154795f = a10;
        }

        public final void a(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f154795f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f154796f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f154797g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f154798h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154799i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f154800j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStoreDecorator f154801k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanStoreDecorator shopAndScanStoreDecorator) {
            super(2);
            this.f154797g = nVar;
            this.f154798h = function0;
            this.f154799i = localThemeScope;
            this.f154800j = modifier;
            this.f154801k = shopAndScanStoreDecorator;
            this.f154796f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f154797g.getHelpersHashCode();
            this.f154797g.i();
            L1.n nVar = this.f154797g;
            composer.startReplaceGroup(-150102216);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            LocalThemeScope localThemeScope = this.f154799i;
            Modifier modifier = this.f154800j;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = i.f154802a;
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(nVar.k(modifier, hVarA, (Function1) objB), this.f154801k.getIsGreenville() ? this.f154799i.getAdsColors().getAdsColorSupportSuccess() : this.f154799i.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f154799i.getAdsTypography().getHeadings().getSeven(), null, 380, null);
            String strA = C6408b.a(this.f154801k.getName(), composer, AbstractC5607a.f45514b);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strA, null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f154799i;
            Modifier modifier2 = this.f154800j;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarA);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new j(hVarA);
                composer.t(objB2);
            }
            composer.P();
            ri.j.h(localThemeScope2, new q1.Label(nVar.k(modifier2, hVarC, (Function1) objB2), this.f154799i.getAdsColors().getAdsColorPlaceholder(), null, null, 0, false, 0, this.f154799i.getAdsTypography().getBody().getTwo(), null, 380, null), this.f154801k.getAddress().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f154799i;
            Modifier modifier3 = this.f154800j;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarC);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion.a()) {
                objB3 = new k(hVarC);
                composer.t(objB3);
            }
            composer.P();
            ri.j.h(localThemeScope3, new q1.Label(nVar.k(modifier3, hVarD, (Function1) objB3), this.f154799i.getAdsColors().getAdsColorPlaceholder(), null, null, 0, false, 0, this.f154799i.getAdsTypography().getBody().getTwo(), null, 380, null), this.f154801k.getCityStateZip().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, i11 | (i12 << 3), 4);
            composer.P();
            if (this.f154797g.getHelpersHashCode() != helpersHashCode) {
                this.f154798h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f154802a = new i();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        i() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f154803a;

        j(L1.h hVar) {
            this.f154803a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f154803a.getBottom(), H1.h.p(4), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f154804a;

        k(L1.h hVar) {
            this.f154804a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f154804a.getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: oq.l$l, reason: collision with other inner class name */
    static final class C2403l implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<p.a, Unit> f154806b;

        /* JADX WARN: Multi-variable type inference failed */
        C2403l(LocalThemeScope localThemeScope, Function1<? super p.a, Unit> function1) {
            this.f154805a = localThemeScope;
            this.f154806b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(p.a.C2404a.f154831a);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-751786626, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionLayout.<anonymous> (ShopAndScanStoreSelectionScreen.kt:91)");
            }
            LocalThemeScope localThemeScope = this.f154805a;
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116957b, new Object[0]);
            Asset asset = new Asset(Bj.i.f2765n0, com.meijer.mobile.shopandscan.e.f116992m1);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f154806b);
            final Function1<p.a, Unit> function1 = this.f154806b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: oq.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l.C2403l.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13729d.d(localThemeScope, abstractC5607aD, asset, null, (Function0) objB, null, composer, 196608 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f154808b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p.ViewState f154809c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<p.a, Unit> f154810d;

        /* JADX WARN: Multi-variable type inference failed */
        m(LocalThemeScope localThemeScope, Modifier modifier, p.ViewState viewState, Function1<? super p.a, Unit> function1) {
            this.f154807a = localThemeScope;
            this.f154808b = modifier;
            this.f154809c = viewState;
            this.f154810d = function1;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = (composer.V(paddingValues) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1430076663, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionLayout.<anonymous> (ShopAndScanStoreSelectionScreen.kt:102)");
            }
            LocalThemeScope localThemeScope = this.f154807a;
            Modifier modifierH = D.h(this.f154808b, paddingValues);
            List<ShopAndScanStoreDecorator> listC = this.f154809c.c();
            Function1<p.a, Unit> function1 = this.f154810d;
            int i12 = LocalThemeScope.f15770g;
            l.r(localThemeScope, modifierH, listC, function1, composer, i12);
            l.n(this.f154807a, null, this.f154809c.getLoadingSpinner() != null, this.f154809c.getLoadingSpinner(), composer, i12 | (AbstractC5607a.f45514b << 9), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<p.a, Unit> f154811a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStoreDecorator f154812b;

        /* JADX WARN: Multi-variable type inference failed */
        n(Function1<? super p.a, Unit> function1, ShopAndScanStoreDecorator shopAndScanStoreDecorator) {
            this.f154811a = function1;
            this.f154812b = shopAndScanStoreDecorator;
        }

        public final void a() {
            this.f154811a.invoke(new p.a.StoreSelected(this.f154812b.getId()));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final o f154813f = new o();

        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ShopAndScanStoreDecorator shopAndScanStoreDecorator) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class p extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f154814f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f154815g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Function1 function1, List list) {
            super(1);
            this.f154814f = function1;
            this.f154815g = list;
        }

        public final Object a(int i10) {
            return this.f154814f.invoke(this.f154815g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class q extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f154816f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154817g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f154818h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f154816f = list;
            this.f154817g = localThemeScope;
            this.f154818h = function1;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ShopAndScanStoreDecorator shopAndScanStoreDecorator = (ShopAndScanStoreDecorator) this.f154816f.get(i10);
            composer.startReplaceGroup(-198758927);
            LocalThemeScope localThemeScope = this.f154817g;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f154818h) | composer.D(shopAndScanStoreDecorator);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new n(this.f154818h, shopAndScanStoreDecorator);
                composer.t(objB);
            }
            composer.P();
            l.t(localThemeScope, modifierH, shopAndScanStoreDecorator, (Function0) objB, composer, LocalThemeScope.f15770g | 48 | (AbstractC5607a.f45514b << 6));
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, List list, Function1 function1, int i10, Composer composer, int i11) {
        y(localThemeScope, modifier, list, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(final Ji.LocalThemeScope r16, final oq.p r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.l.B(Ji.M, oq.p, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(oq.p pVar, p.a action) {
        Intrinsics.j(action, "action");
        pVar.N(action);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, oq.p pVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, pVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void l(LocalThemeScope localThemeScope, final Modifier modifier, final Function1<? super p.a, Unit> onAction, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2011846833);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2011846833, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.EmptyStoreListComponent (ShopAndScanStoreSelectionScreen.kt:150)");
            }
            Modifier modifierI = D.i(modifier, H1.h.p(40));
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.b(), P0.e.INSTANCE.g(), composerStartRestartGroup, 54);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            C17988z0.a(C16190d.c(Bj.i.f2672L1, composerStartRestartGroup, 0), null, null, 0L, composerStartRestartGroup, 48, 12);
            I six = localThemeScope2.getAdsTypography().getHeadings().getSix();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 4;
            Modifier modifierM = D.m(companion2, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null);
            j.Companion companion3 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(modifierM, null, null, F1.j.h(companion3.a()), 0, false, 0, six, null, 374, null);
            String strC = C16193g.c(com.meijer.mobile.shopandscan.e.f116960c, composerStartRestartGroup, 0);
            int i12 = LocalThemeScope.f15770g;
            int i13 = i11 & 14;
            int i14 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            localThemeScope2 = localThemeScope;
            ri.j.h(localThemeScope2, new q1.Label(D.m(companion2, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), null, null, F1.j.h(companion3.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 374, null), C16193g.c(com.meijer.mobile.shopandscan.e.f116963d, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
            p(localThemeScope2, androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), onAction, composerStartRestartGroup, i12 | 48 | i13 | (i11 & 896));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.m(localThemeScope2, modifier, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, Composer composer, int i11) {
        l(localThemeScope, modifier, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ji.LocalThemeScope r15, androidx.compose.ui.Modifier r16, final boolean r17, ak.AbstractC5607a r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.l.n(Ji.M, androidx.compose.ui.Modifier, boolean, ak.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, AbstractC5607a abstractC5607a, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, modifier, z10, abstractC5607a, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void p(final LocalThemeScope localThemeScope, final Modifier modifier, final Function1<? super p.a, Unit> onAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-715564345);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-715564345, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionButtonsComponent (ShopAndScanStoreSelectionScreen.kt:267)");
            }
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            Q.e(localThemeScope, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(995438497, true, new b(localThemeScope, modifier, onAction), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.d.f140293b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.q(localThemeScope, modifier, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, Composer composer, int i11) {
        p(localThemeScope, modifier, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void r(final LocalThemeScope localThemeScope, final Modifier modifier, final List<ShopAndScanStoreDecorator> stores, final Function1<? super p.a, Unit> onAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(stores, "stores");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1167583944);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(stores) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1167583944, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionContent (ShopAndScanStoreSelectionScreen.kt:119)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(modifier, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            A a10 = (A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierF, false, new c(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new d(nVar, 0, pairH.b(), stores, localThemeScope, modifier, onAction)), pairH.a(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.s(localThemeScope, modifier, stores, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Modifier modifier, List list, Function1 function1, int i10, Composer composer, int i11) {
        r(localThemeScope, modifier, list, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void t(final LocalThemeScope localThemeScope, final Modifier modifier, final ShopAndScanStoreDecorator decorator, final Function0<Unit> onClick, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1315539238);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(decorator) : composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1315539238, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionItemComponent (ShopAndScanStoreSelectionScreen.kt:219)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 7168) == 2048;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: oq.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l.u(onClick);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Modifier modifierI = D.i(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), H1.h.p(16));
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB2 == companion2.a()) {
                objB2 = new A();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            A a10 = (A) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion2.a()) {
                objB3 = new L1.n();
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB3;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion2.a()) {
                objB4 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB4, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierI, false, new g(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new h(nVar, 0, pairH.b(), localThemeScope, modifier, decorator)), pairH.a(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0.0f, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.v(localThemeScope, modifier, decorator, onClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanStoreDecorator shopAndScanStoreDecorator, Function0 function0, int i10, Composer composer, int i11) {
        t(localThemeScope, modifier, shopAndScanStoreDecorator, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final oq.p.ViewState r35, final kotlin.jvm.functions.Function1<? super oq.p.a, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.l.w(Ji.M, androidx.compose.ui.Modifier, oq.p$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, p.ViewState viewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void y(final LocalThemeScope localThemeScope, final Modifier modifier, final List<ShopAndScanStoreDecorator> stores, final Function1<? super p.a, Unit> onAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(stores, "stores");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(480759566);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(stores) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(480759566, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.storeselection.StoreSelectionListComponent (ShopAndScanStoreSelectionScreen.kt:195)");
            }
            C15339A c15339aB = C15340B.b(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = ((i11 & 7168) == 2048) | ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | composerStartRestartGroup.D(stores);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: oq.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return l.z(stores, localThemeScope, onAction, (w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(modifier, c15339aB, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, (i11 >> 3) & 14, 508);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oq.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.A(localThemeScope, modifier, stores, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(List list, LocalThemeScope localThemeScope, Function1 function1, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new p(o.f154813f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new q(list, localThemeScope, function1)));
        return Unit.f142422a;
    }

    private static final p.ViewState C(z1<p.ViewState> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
