package nn;

import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.x;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.Locale;
import java.util.Map;
import ji.C14973z;
import ji.InterfaceC14920X;
import ji.InterfaceC14971y;
import ji.Q0;
import ji.j1;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17934f;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import nn.G;
import ok.StoreDetails;
import p1.C16193g;
import r1.C16705m;
import rn.C16816q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u000b\u001a\u001d\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "", "toolbarTitle", "Lok/h;", "storeDetails", "Landroidx/compose/ui/Modifier;", "modifier", "", "i", "(LJi/M;Ljava/lang/String;Lok/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "g", "(LJi/M;Lok/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "visible", "k", "(LJi/M;ZLandroidx/compose/runtime/Composer;I)V", "o", "m", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrn/q;", "a", "Lrn/q;", "viewModel", "Lrn/q$e;", "viewState", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private static C16816q f151909a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151910a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f151911b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nn.G$a$a, reason: collision with other inner class name */
        static final class C2348a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151912a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f151913b;

            C2348a(LocalThemeScope localThemeScope, String str) {
                this.f151912a = localThemeScope;
                this.f151913b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1713346715, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyImHereScreen.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:92)");
                }
                Dr.g.g(this.f151912a, this.f151913b, null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1769677477, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyImHereScreen.<anonymous> (FlyBuyImHereScreen.kt:90)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            C.f.d dVar = C.f.d.f15507e;
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99653K8, new Object[0]);
            LocalThemeScope localThemeScope = this.f151910a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1713346715, true, new C2348a(localThemeScope, this.f151911b), composer, 54);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: nn.F
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return G.a.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, modifierH, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, 221232 | LocalThemeScope.f15770g | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 198);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope, String str) {
            this.f151910a = localThemeScope;
            this.f151911b = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() throws Exception {
            C16816q c16816q = G.f151909a;
            if (c16816q == null) {
                Intrinsics.y("viewModel");
                c16816q = null;
            }
            c16816q.v(C16816q.c.C2489c.f159743a);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151914a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StoreDetails f151915b;

        b(LocalThemeScope localThemeScope, StoreDetails storeDetails) {
            this.f151914a = localThemeScope;
            this.f151915b = storeDetails;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) throws Exception {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1491507934, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyImHereScreen.<anonymous> (FlyBuyImHereScreen.kt:99)");
            }
            G.g(this.f151914a, this.f151915b, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) throws Exception {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151916a;

        c(LocalThemeScope localThemeScope) {
            this.f151916a = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1615787931, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.LoadingState.<anonymous> (FlyBuyImHereScreen.kt:120)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f151916a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 56);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f151917f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L1.A a10) {
            super(1);
            this.f151917f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f151917f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f151918f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f151919g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f151920h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151921i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope) {
            super(2);
            this.f151919g = nVar;
            this.f151920h = function0;
            this.f151921i = localThemeScope;
            this.f151918f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f151919g.getHelpersHashCode();
            this.f151919g.i();
            L1.n nVar = this.f151919g;
            composer.startReplaceGroup(-523480935);
            L1.h hVarL = nVar.l();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = f.f151922a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarL, (Function1) objB);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            C17917Z.a(null, 0L, H1.h.p(1), 0.0f, composer, 384, 11);
            LocalThemeScope localThemeScope = this.f151921i;
            Ji.Q.e(localThemeScope, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(1325127030, true, new g(localThemeScope), composer, 54), composer, LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.d.f140293b << 3));
            composer.v();
            composer.P();
            if (this.f151919g.getHelpersHashCode() != helpersHashCode) {
                this.f151920h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f151922a = new f();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
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
    @SourceDebugExtension
    static final class g implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151923a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151925a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f151926b;

            b(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f151925a = localThemeScope;
                this.f151926b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1842782505, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:393)");
                }
                LocalThemeScope localThemeScope = this.f151925a;
                q1.Label enabledLabel = this.f151926b.getLabels().getEnabledLabel();
                String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f99698Mf, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f151924a = new a();

            a() {
            }

            public final void a() throws Exception {
                C16816q c16816q = G.f151909a;
                if (c16816q == null) {
                    Intrinsics.y("viewModel");
                    c16816q = null;
                }
                c16816q.v(C16816q.c.d.f159744a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
                a();
                return Unit.f142422a;
            }
        }

        g(LocalThemeScope localThemeScope) {
            this.f151923a = localThemeScope;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1325127030, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:386)");
            }
            LocalThemeScope localThemeScope = this.f151923a;
            float f10 = 16;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(f10), H1.h.p(f10)), false, null, 895, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f151924a;
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1842782505, true, new b(this.f151923a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3456 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151927a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC14814f f151928b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1<C16816q.ViewState> f151929c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151930a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f151931b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<C16816q.ViewState> f151932c;

            a(LocalThemeScope localThemeScope, j1 j1Var, z1<C16816q.ViewState> z1Var) {
                this.f151930a = localThemeScope;
                this.f151931b = j1Var;
                this.f151932c = z1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1934268443, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:158)");
                }
                ri.j.h(this.f151930a, this.f151931b.getLabels().getEnabledLabel(), C6408b.a(G.r(this.f151932c).getStoreAddressDetails(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        h(LocalThemeScope localThemeScope, InterfaceC14814f interfaceC14814f, z1<C16816q.ViewState> z1Var) {
            this.f151927a = localThemeScope;
            this.f151928b = interfaceC14814f;
            this.f151929c = z1Var;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2082213368, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:152)");
            }
            LocalThemeScope localThemeScope = this.f151927a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getDestructiveButton(), false, null, null, null, null, null, null, this.f151928b.c(Modifier.INSTANCE, P0.e.INSTANCE.g()), false, null, 895, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: nn.H
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return G.h.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1934268443, true, new a(this.f151927a, Assemble, this.f151929c), composer, 54), composer, LocalThemeScope.f15770g | 3456 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() throws Exception {
            C16816q c16816q = G.f151909a;
            if (c16816q == null) {
                Intrinsics.y("viewModel");
                c16816q = null;
            }
            c16816q.v(C16816q.c.e.f159745a);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f151933a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151934b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C16816q.d f151935c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151936a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f151937b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C16816q.d f151938c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: nn.G$i$a$a, reason: collision with other inner class name */
            static final class C2349a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f151939a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f151940b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C16816q.d f151941c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: nn.G$i$a$a$a, reason: collision with other inner class name */
                static final class C2350a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f151942a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f151943b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C16816q.d f151944c;

                    C2350a(LocalThemeScope localThemeScope, j1 j1Var, C16816q.d dVar) {
                        this.f151942a = localThemeScope;
                        this.f151943b = j1Var;
                        this.f151944c = dVar;
                    }

                    public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(657650032, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:255)");
                        }
                        ri.j.h(this.f151942a, this.f151943b.getLabels().getEnabledLabel(), C16193g.c(((C16816q.d.FailEvent) this.f151944c).getPositiveBtnTxt(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

                C2349a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, C16816q.d dVar) {
                    this.f151939a = localThemeScope;
                    this.f151940b = interfaceC5730l0;
                    this.f151941c = dVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
                    interfaceC5730l0.setValue(Boolean.FALSE);
                    return Unit.f142422a;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-894810243, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:251)");
                    }
                    LocalThemeScope localThemeScope = this.f151939a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f151940b;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: nn.J
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return G.i.a.C2349a.c(interfaceC5730l0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(657650032, true, new C2350a(this.f151939a, Assemble, this.f151941c), composer, 54), composer, LocalThemeScope.f15770g | 3456 | (q1.d.StandardButton.f139974k << 3));
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

            a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, C16816q.d dVar) {
                this.f151936a = localThemeScope;
                this.f151937b = interfaceC5730l0;
                this.f151938c = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-889786271, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:250)");
                }
                LocalThemeScope localThemeScope = this.f151936a;
                Ji.Q.e(localThemeScope, C14973z.f140302a, ComposableLambdaKt.c(-894810243, true, new C2349a(localThemeScope, this.f151937b, this.f151938c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (C14973z.f140303b << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151945a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C16816q.d f151946b;

            b(LocalThemeScope localThemeScope, C16816q.d dVar) {
                this.f151945a = localThemeScope;
                this.f151946b = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1143108158, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:238)");
                }
                ri.j.h(this.f151945a, new q1.Label(null, null, null, null, 0, false, 0, this.f151945a.getAdsTypography().getBody().getTwo(), null, 383, null), C16193g.c(((C16816q.d.FailEvent) this.f151946b).getTitle(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151947a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C16816q.d f151948b;

            c(LocalThemeScope localThemeScope, C16816q.d dVar) {
                this.f151947a = localThemeScope;
                this.f151948b = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(389083869, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:244)");
                }
                ri.j.h(this.f151947a, new q1.Label(null, null, null, null, 0, false, 0, this.f151947a.getAdsTypography().getBody().getTwo(), null, 383, null), C16193g.c(((C16816q.d.FailEvent) this.f151948b).getMessage(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        i(InterfaceC5730l0<Boolean> interfaceC5730l0, LocalThemeScope localThemeScope, C16816q.d dVar) {
            this.f151933a = interfaceC5730l0;
            this.f151934b = localThemeScope;
            this.f151935c = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
            interfaceC5730l0.setValue(Boolean.FALSE);
            return Unit.f142422a;
        }

        public final void b(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-1783418455, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:235)");
            }
            composer.startReplaceGroup(5004770);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f151933a;
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: nn.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return G.i.c(interfaceC5730l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17934f.a((Function0) objB, ComposableLambdaKt.c(-889786271, true, new a(this.f151934b, this.f151933a, this.f151935c), composer, 54), null, null, ComposableLambdaKt.c(1143108158, true, new b(this.f151934b, this.f151935c), composer, 54), ComposableLambdaKt.c(389083869, true, new c(this.f151934b, this.f151935c), composer, 54), null, 0L, 0L, null, composer, 221238, 972);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            b(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f151949a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151950b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C16816q.d f151951c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151952a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f151953b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C16816q.d f151954c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: nn.G$j$a$a, reason: collision with other inner class name */
            static final class C2351a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f151955a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f151956b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C16816q.d f151957c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: nn.G$j$a$a$a, reason: collision with other inner class name */
                static final class C2352a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f151958a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f151959b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C16816q.d f151960c;

                    C2352a(LocalThemeScope localThemeScope, j1 j1Var, C16816q.d dVar) {
                        this.f151958a = localThemeScope;
                        this.f151959b = j1Var;
                        this.f151960c = dVar;
                    }

                    public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1716719081, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:297)");
                        }
                        ri.j.h(this.f151958a, this.f151959b.getLabels().getEnabledLabel(), C16193g.c(((C16816q.d.LocationPermissionInfoDialogEvent) this.f151960c).getPositiveButton(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

                C2351a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, C16816q.d dVar) {
                    this.f151955a = localThemeScope;
                    this.f151956b = interfaceC5730l0;
                    this.f151957c = dVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
                    interfaceC5730l0.setValue(Boolean.FALSE);
                    return Unit.f142422a;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1017575652, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:293)");
                    }
                    LocalThemeScope localThemeScope = this.f151955a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f151956b;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: nn.L
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return G.j.a.C2351a.c(interfaceC5730l0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1716719081, true, new C2352a(this.f151955a, Assemble, this.f151957c), composer, 54), composer, LocalThemeScope.f15770g | 3456 | (q1.d.StandardButton.f139974k << 3));
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

            a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, C16816q.d dVar) {
                this.f151952a = localThemeScope;
                this.f151953b = interfaceC5730l0;
                this.f151954c = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1550645448, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:292)");
                }
                LocalThemeScope localThemeScope = this.f151952a;
                Ji.Q.e(localThemeScope, C14973z.f140302a, ComposableLambdaKt.c(1017575652, true, new C2351a(localThemeScope, this.f151953b, this.f151954c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (C14973z.f140303b << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151961a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f151962b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C16816q.d f151963c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f151964a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f151965b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C16816q.d f151966c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: nn.G$j$b$a$a, reason: collision with other inner class name */
                static final class C2353a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f151967a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f151968b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C16816q.d f151969c;

                    C2353a(LocalThemeScope localThemeScope, j1 j1Var, C16816q.d dVar) {
                        this.f151967a = localThemeScope;
                        this.f151968b = j1Var;
                        this.f151969c = dVar;
                    }

                    public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(747543509, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:312)");
                        }
                        ri.j.h(this.f151967a, this.f151968b.getLabels().getEnabledLabel(), C16193g.c(((C16816q.d.LocationPermissionInfoDialogEvent) this.f151969c).getNegativeButton(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

                a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, C16816q.d dVar) {
                    this.f151964a = localThemeScope;
                    this.f151965b = interfaceC5730l0;
                    this.f151966c = dVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
                    interfaceC5730l0.setValue(Boolean.FALSE);
                    return Unit.f142422a;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-813129054, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:306)");
                    }
                    LocalThemeScope localThemeScope = this.f151964a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f151965b;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: nn.M
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return G.j.b.a.c(interfaceC5730l0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(747543509, true, new C2353a(this.f151964a, Assemble, this.f151966c), composer, 54), composer, LocalThemeScope.f15770g | 3456 | (q1.d.StandardButton.f139974k << 3));
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

            b(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, C16816q.d dVar) {
                this.f151961a = localThemeScope;
                this.f151962b = interfaceC5730l0;
                this.f151963c = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-280059258, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:305)");
                }
                LocalThemeScope localThemeScope = this.f151961a;
                Ji.Q.e(localThemeScope, C14973z.f140302a, ComposableLambdaKt.c(-813129054, true, new a(localThemeScope, this.f151962b, this.f151963c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (C14973z.f140303b << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151970a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C16816q.d f151971b;

            c(LocalThemeScope localThemeScope, C16816q.d dVar) {
                this.f151970a = localThemeScope;
                this.f151971b = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(952072037, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:280)");
                }
                ri.j.h(this.f151970a, new q1.Label(null, null, null, null, 0, false, 0, this.f151970a.getAdsTypography().getBody().getTwo(), null, 383, null), C16193g.c(((C16816q.d.LocationPermissionInfoDialogEvent) this.f151971b).getTitle(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151972a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C16816q.d f151973b;

            d(LocalThemeScope localThemeScope, C16816q.d dVar) {
                this.f151972a = localThemeScope;
                this.f151973b = dVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2110763964, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:286)");
                }
                ri.j.h(this.f151972a, new q1.Label(null, null, null, null, 0, false, 0, this.f151972a.getAdsTypography().getBody().getTwo(), null, 383, null), C16193g.c(((C16816q.d.LocationPermissionInfoDialogEvent) this.f151973b).getMessage(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        j(InterfaceC5730l0<Boolean> interfaceC5730l0, LocalThemeScope localThemeScope, C16816q.d dVar) {
            this.f151949a = interfaceC5730l0;
            this.f151950b = localThemeScope;
            this.f151951c = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
            interfaceC5730l0.setValue(Boolean.FALSE);
            return Unit.f142422a;
        }

        public final void b(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(1763575824, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous> (FlyBuyImHereScreen.kt:277)");
            }
            composer.startReplaceGroup(5004770);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f151949a;
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: nn.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return G.j.c(interfaceC5730l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17934f.a((Function0) objB, ComposableLambdaKt.c(1550645448, true, new a(this.f151950b, this.f151949a, this.f151951c), composer, 54), null, ComposableLambdaKt.c(-280059258, true, new b(this.f151950b, this.f151949a, this.f151951c), composer, 54), ComposableLambdaKt.c(952072037, true, new c(this.f151950b, this.f151951c), composer, 54), ComposableLambdaKt.c(-2110763964, true, new d(this.f151950b, this.f151951c), composer, 54), null, 0L, 0L, null, composer, 224310, 964);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            b(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, StoreDetails storeDetails, Modifier modifier, int i10, int i11, Composer composer, int i12) throws Exception {
        g(localThemeScope, storeDetails, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ji.LocalThemeScope r33, final java.lang.String r34, final ok.StoreDetails r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.G.i(Ji.M, java.lang.String, ok.h, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, String str, StoreDetails storeDetails, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, str, storeDetails, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, boolean z10, int i10, Composer composer, int i11) {
        k(localThemeScope, z10, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void o(final Ji.LocalThemeScope r51, final ok.StoreDetails r52, androidx.compose.ui.Modifier r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.G.o(Ji.M, ok.h, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Map it) throws Exception {
        Intrinsics.j(it, "it");
        C16816q c16816q = f151909a;
        if (c16816q == null) {
            Intrinsics.y("viewModel");
            c16816q = null;
        }
        c16816q.v(C16816q.c.b.f159742a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, StoreDetails storeDetails, Modifier modifier, int i10, int i11, Composer composer, int i12) throws Exception {
        o(localThemeScope, storeDetails, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final LocalThemeScope localThemeScope, final StoreDetails storeDetails, Modifier modifier, Composer composer, final int i10, final int i11) throws Exception {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(1536676919);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(storeDetails)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1536676919, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyImHereMainContent (FlyBuyImHereScreen.kt:108)");
            }
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
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
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            int i17 = LocalThemeScope.f15770g;
            int i18 = i12 & 14;
            o(localThemeScope, storeDetails, null, composerStartRestartGroup, i17 | i18 | (i12 & 112), 2);
            m(localThemeScope, null, composerStartRestartGroup, i17 | i18, 1);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return G.h(localThemeScope, storeDetails, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void k(final LocalThemeScope localThemeScope, final boolean z10, Composer composer, final int i10) {
        int i11;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-517395739);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-517395739, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.LoadingState (FlyBuyImHereScreen.kt:117)");
            }
            if (z10) {
                Ji.Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(1615787931, true, new c(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.E
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return G.l(localThemeScope, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void m(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(622061061);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(622061061, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent (FlyBuyImHereScreen.kt:378)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(modifier, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
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
            androidx.compose.ui.layout.A.a(C16705m.d(modifierF, false, new d(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new e(nVar, 0, pairH.b(), localThemeScope)), pairH.a(), composerStartRestartGroup, 48, 0);
            composer2 = composerStartRestartGroup;
            composer2.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return G.n(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16816q.ViewState r(z1<C16816q.ViewState> z1Var) {
        return z1Var.getValue();
    }
}
