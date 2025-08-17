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
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import d0.C13442i;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import java.util.Locale;
import ji.C14899B;
import ji.C14900C;
import ji.j1;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17979v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import nn.C15911x;
import p1.C16193g;
import rn.C16811l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000b\"\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "", "toolbarTitle", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onUpPressed", "g", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "e", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "k", "i", "Lrn/l;", "a", "Lrn/l;", "viewModel", "Lrn/l$e;", "viewState", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: nn.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15911x {

    /* renamed from: a, reason: collision with root package name */
    private static C16811l f152152a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.x$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152153a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f152154b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f152155c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nn.x$a$a, reason: collision with other inner class name */
        static final class C2357a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152156a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f152157b;

            C2357a(LocalThemeScope localThemeScope, String str) {
                this.f152156a = localThemeScope;
                this.f152157b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1267784308, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyConfirmationScreen.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:73)");
                }
                Dr.g.g(this.f152156a, this.f152157b, null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f152153a = localThemeScope;
            this.f152154b = function0;
            this.f152155c = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(557106996, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyConfirmationScreen.<anonymous> (FlyBuyConfirmationScreen.kt:71)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            C.f.d dVar = C.f.d.f15507e;
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99653K8, new Object[0]);
            LocalThemeScope localThemeScope = this.f152153a;
            Dr.g.f(localThemeScope, modifierH, null, null, ComposableLambdaKt.c(1267784308, true, new C2357a(localThemeScope, this.f152155c), composer, 54), this.f152154b, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24624 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 198);
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
    /* renamed from: nn.x$b */
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152158a;

        b(LocalThemeScope localThemeScope) {
            this.f152158a = localThemeScope;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(730496795, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyConfirmationScreen.<anonymous> (FlyBuyConfirmationScreen.kt:80)");
            }
            C15911x.e(this.f152158a, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), composer, LocalThemeScope.f15770g, 0);
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
    /* renamed from: nn.x$c */
    public static final class c extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f152159f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.A a10) {
            super(1);
            this.f152159f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f152159f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: nn.x$d */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f152160f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f152161g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f152162h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f152163i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152164j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L1.n nVar, int i10, Function0 function0, Modifier modifier, LocalThemeScope localThemeScope) {
            super(2);
            this.f152161g = nVar;
            this.f152162h = function0;
            this.f152163i = modifier;
            this.f152164j = localThemeScope;
            this.f152160f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f152161g.getHelpersHashCode();
            this.f152161g.i();
            L1.n nVar = this.f152161g;
            composer.startReplaceGroup(1859841411);
            L1.h hVarL = nVar.l();
            Modifier modifier = this.f152163i;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = e.f152165a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifier, hVarL, (Function1) objB);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            C17917Z.a(null, this.f152164j.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 384, 9);
            LocalThemeScope localThemeScope = this.f152164j;
            C14899B c14899b = C14899B.f139602a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-426531243, true, new f(localThemeScope), composer, 54);
            int i11 = LocalThemeScope.f15770g;
            Ji.Q.e(localThemeScope, c14899b, composableLambdaC, composer, i11 | 384 | (C14899B.f139603b << 3));
            LocalThemeScope localThemeScope2 = this.f152164j;
            Ji.Q.e(localThemeScope2, C14900C.f139605a, ComposableLambdaKt.c(1366362430, true, new g(localThemeScope2), composer, 54), composer, i11 | 384 | (C14900C.f139606b << 3));
            composer.v();
            composer.P();
            if (this.f152161g.getHelpersHashCode() != helpersHashCode) {
                this.f152162h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nn.x$e */
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f152165a = new e();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
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
    @SourceDebugExtension
    /* renamed from: nn.x$f */
    static final class f implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152166a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nn.x$f$b */
        static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152168a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f152169b;

            b(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f152168a = localThemeScope;
                this.f152169b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2014994488, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:191)");
                }
                LocalThemeScope localThemeScope = this.f152168a;
                q1.Label enabledLabel = this.f152169b.getLabels().getEnabledLabel();
                String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f100330t2, composer, 0).toUpperCase(Locale.ROOT);
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
        /* renamed from: nn.x$f$a */
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f152167a = new a();

            a() {
            }

            public final void a() {
                C16811l c16811l = C15911x.f152152a;
                if (c16811l == null) {
                    Intrinsics.y("viewModel");
                    c16811l = null;
                }
                c16811l.q(C16811l.d.a.f159651a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        f(LocalThemeScope localThemeScope) {
            this.f152166a = localThemeScope;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-426531243, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:183)");
            }
            LocalThemeScope localThemeScope = this.f152166a;
            float f10 = 16;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), 0.0f, 8, null), false, null, 895, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f152167a;
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-2014994488, true, new b(this.f152166a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3456 | (q1.d.StandardButton.f139974k << 3));
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
    /* renamed from: nn.x$g */
    static final class g implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152170a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nn.x$g$b */
        static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152172a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f152173b;

            b(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f152172a = localThemeScope;
                this.f152173b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-433425935, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:210)");
                }
                LocalThemeScope localThemeScope = this.f152172a;
                q1.Label labelY = q1.Label.y(this.f152173b.getLabels().getEnabledLabel(), null, this.f152172a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, null, null, 509, null);
                String upperCase = C16193g.c(com.meijer.mobile.meijer.Y.f100270q2, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
        /* renamed from: nn.x$g$a */
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f152171a = new a();

            a() {
            }

            public final void a() {
                C16811l c16811l = C15911x.f152152a;
                if (c16811l == null) {
                    Intrinsics.y("viewModel");
                    c16811l = null;
                }
                c16811l.q(C16811l.d.b.f159652a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        g(LocalThemeScope localThemeScope) {
            this.f152170a = localThemeScope;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1366362430, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:199)");
            }
            LocalThemeScope localThemeScope = this.f152170a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            float f10 = 16;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), 0.0f, 8, null);
            C17979v c17979v = C17979v.f168713a;
            long color = this.f152170a.getAdsColors().getAdsColorHoverInverse().getColor();
            int i11 = C17979v.f168724l;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, c17979v.b(H1.h.p(2), 0.0f, 0.0f, 0.0f, 0.0f, composer, (i11 << 15) | 6, 30), null, C13442i.a(H1.h.p(0), this.f152170a.getAdsColors().getAdsColorHoverInverse().getColor()), c17979v.a(color, 0L, 0L, 0L, composer, i11 << 12, 14), null, modifierM, false, null, 843, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f152171a;
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-433425935, true, new b(this.f152170a, Assemble), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3456);
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
    /* renamed from: nn.x$h */
    static final class h implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152174a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nn.x$h$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f152175a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f152176b;

            a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f152175a = localThemeScope;
                this.f152176b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1203402713, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:143)");
                }
                ri.j.h(this.f152175a, this.f152176b.getLabels().getEnabledLabel(), C16193g.c(com.meijer.mobile.meijer.Y.f100310s2, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        h(LocalThemeScope localThemeScope) {
            this.f152174a = localThemeScope;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-639155852, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainContent.<anonymous>.<anonymous> (FlyBuyConfirmationScreen.kt:141)");
            }
            LocalThemeScope localThemeScope = this.f152174a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: nn.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15911x.h.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1203402713, true, new a(this.f152174a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3456 | (q1.d.StandardButton.f139974k << 3));
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
        public static final Unit c() {
            C16811l c16811l = C15911x.f152152a;
            if (c16811l == null) {
                Intrinsics.y("viewModel");
                c16811l = null;
            }
            c16811l.q(C16811l.d.c.f159653a);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r33, final java.lang.String r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C15911x.g(Ji.M, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, str, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void i(final Ji.LocalThemeScope r15, androidx.compose.ui.Modifier r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C15911x.i(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void k(Ji.LocalThemeScope r47, androidx.compose.ui.Modifier r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.C15911x.k(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1103525782);
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
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1103525782, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyConfirmationMainContent (FlyBuyConfirmationScreen.kt:86)");
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
            int i16 = LocalThemeScope.f15770g;
            int i17 = i12 & 14;
            k(localThemeScope, null, composerStartRestartGroup, i16 | i17, 1);
            i(localThemeScope, null, composerStartRestartGroup, i16 | i17, 1);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15911x.f(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final C16811l.ViewState l(z1<C16811l.ViewState> z1Var) {
        return z1Var.getValue();
    }
}
