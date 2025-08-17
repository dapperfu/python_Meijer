package com.meijer.mobile.meijer.activity.substitution;

import Ji.LocalThemeScope;
import L1.C4039g;
import L1.x;
import P0.e;
import V0.C5346q0;
import ak.AbstractC5607a;
import android.content.Context;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.C13439f;
import es.OrderSubstitutionsDetailBannerDecorator;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.C14898A;
import ji.j1;
import ji.q1;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.N1;
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
import p1.C16187a;
import p1.C16190d;
import r0.C16692i;
import r1.C16705m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJi/M;", "Les/J;", "orderSubstitutionDetailBanner", "Lkotlin/Function0;", "", "onClickSubstitutionBanner", "c", "(LJi/M;Les/J;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lak/a;", "buttonActionText", "viewSubstitutionBannerClicked", "e", "(LJi/M;Lak/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.substitution.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12532d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f112853f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f112853f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f112853f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f112854f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f112855g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f112856h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderSubstitutionsDetailBannerDecorator f112857i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112858j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f112859k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f112855g = nVar;
            this.f112856h = function0;
            this.f112857i = orderSubstitutionsDetailBannerDecorator;
            this.f112858j = localThemeScope;
            this.f112859k = function02;
            this.f112854f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f112855g.getHelpersHashCode();
            this.f112855g.i();
            L1.n nVar = this.f112855g;
            composer.startReplaceGroup(1986548428);
            L1.h hVarL = nVar.l();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f112860a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierD = androidx.compose.foundation.b.d(C13439f.g(nVar.k(companion, hVarL, (Function1) objB), H1.h.p(1), C16187a.a(this.f112857i.getSubstitutionScreenType().getBannerBorderColor(), composer, 0), C16692i.c(H1.h.p(5))), C16187a.a(this.f112857i.getSubstitutionScreenType().getBannerBackgroundColor(), composer, 0), null, 2, null);
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyA, companion4.e());
            D1.c(composerA, interfaceC5742sR, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14815g c14815g = C14815g.f139108a;
            e.c cVarI = companion3.i();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(16), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), cVarI, composer, 48);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
            Function0<InterfaceC5811g> function0A2 = companion4.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion4.e());
            D1.c(composerA2, interfaceC5742sR2, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C14801J c14801j = C14801J.f139030a;
            C17988z0.a(C16190d.c(this.f112857i.getSubstitutionScreenType().getBannerIcon(), composer, 0), null, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.H(companion, null, false, 3, null), null, false, 3, null), H1.h.p(18), 0.0f, 0.0f, 0.0f, 14, null), C5346q0.INSTANCE.j(), composer, 3504, 0);
            N1.b(this.f112857i.getSubstitutionScreenType().getBannerTitle().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.D.m(companion, H1.h.p(10), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Ej.c.a().getSubtitle1(), composer, 48, 0, 65532);
            composer.v();
            N1.b(this.f112857i.getSubstitutionScreenType().getBannerDescription().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.D.m(companion, H1.h.p(50), H1.h.p(8), 0.0f, 0.0f, 12, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Ej.c.a().getSubtitle2(), composer, 0, 0, 65532);
            LocalThemeScope localThemeScope = this.f112858j;
            AbstractC5607a bannerActionText = this.f112857i.getSubstitutionScreenType().getBannerActionText();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f112859k);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new C1790d(this.f112859k);
                composer.t(objB2);
            }
            composer.P();
            C12532d.e(localThemeScope, bannerActionText, (Function0) objB2, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3));
            composer.v();
            composer.P();
            if (this.f112855g.getHelpersHashCode() != helpersHashCode) {
                this.f112856h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$c */
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f112860a = new c();

        c() {
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$d, reason: collision with other inner class name */
    static final class C1790d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f112861a;

        C1790d(Function0<Unit> function0) {
            this.f112861a = function0;
        }

        public final void a() {
            this.f112861a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$e */
    static final class e implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f112863b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f112864c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$e$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112865a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f112866b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f112867c;

            a(LocalThemeScope localThemeScope, j1 j1Var, AbstractC5607a abstractC5607a) {
                this.f112865a = localThemeScope;
                this.f112866b = j1Var;
                this.f112867c = abstractC5607a;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-758697355, i10, -1, "com.meijer.mobile.meijer.activity.substitution.ViewSubstitutionDetailsPassiveButton.<anonymous>.<anonymous>.<anonymous> (EnhancedSubstitutionBanner.kt:135)");
                }
                ri.j.h(this.f112865a, this.f112866b.getLabels().getEnabledLabel(), this.f112867c.b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        e(LocalThemeScope localThemeScope, Function0<Unit> function0, AbstractC5607a abstractC5607a) {
            this.f112862a = localThemeScope;
            this.f112863b = function0;
            this.f112864c = abstractC5607a;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1018935368, i10, -1, "com.meijer.mobile.meijer.activity.substitution.ViewSubstitutionDetailsPassiveButton.<anonymous>.<anonymous> (EnhancedSubstitutionBanner.kt:131)");
            }
            E0.b(this.f112862a, Assemble.getButtons().getEnabledButton(), this.f112863b, ComposableLambdaKt.c(-758697355, true, new a(this.f112862a, Assemble, this.f112864c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
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

    public static final void c(LocalThemeScope localThemeScope, OrderSubstitutionsDetailBannerDecorator orderSubstitutionDetailBanner, Function0<Unit> onClickSubstitutionBanner, Composer composer, final int i10) {
        int i11;
        final OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator;
        final LocalThemeScope localThemeScope2;
        final Function0<Unit> function0;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(orderSubstitutionDetailBanner, "orderSubstitutionDetailBanner");
        Intrinsics.j(onClickSubstitutionBanner, "onClickSubstitutionBanner");
        Composer composerStartRestartGroup = composer.startRestartGroup(1959047727);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(orderSubstitutionDetailBanner) : composerStartRestartGroup.D(orderSubstitutionDetailBanner) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onClickSubstitutionBanner) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            orderSubstitutionsDetailBannerDecorator = orderSubstitutionDetailBanner;
            localThemeScope2 = localThemeScope;
            function0 = onClickSubstitutionBanner;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1959047727, i11, -1, "com.meijer.mobile.meijer.activity.substitution.EnhancedSubstitutionBanner (EnhancedSubstitutionBanner.kt:46)");
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, H1.h.p(16), 7, null);
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
            MeasurePolicy measurePolicyA = pairH.a();
            Function0<Unit> function0B = pairH.b();
            Modifier modifierD = C16705m.d(modifierM, false, new a(a10), 1, null);
            orderSubstitutionsDetailBannerDecorator = orderSubstitutionDetailBanner;
            localThemeScope2 = localThemeScope;
            function0 = onClickSubstitutionBanner;
            androidx.compose.ui.layout.A.a(modifierD, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new b(nVar, 6, function0B, orderSubstitutionDetailBanner, localThemeScope, onClickSubstitutionBanner)), measurePolicyA, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.substitution.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12532d.d(localThemeScope2, orderSubstitutionsDetailBannerDecorator, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, Function0 function0, int i10, Composer composer, int i11) {
        c(localThemeScope, orderSubstitutionsDetailBannerDecorator, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void e(final LocalThemeScope localThemeScope, final AbstractC5607a buttonActionText, final Function0<Unit> viewSubstitutionBannerClicked, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(buttonActionText, "buttonActionText");
        Intrinsics.j(viewSubstitutionBannerClicked, "viewSubstitutionBannerClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-56671522);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(buttonActionText) : composerStartRestartGroup.D(buttonActionText) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(viewSubstitutionBannerClicked) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-56671522, i11, -1, "com.meijer.mobile.meijer.activity.substitution.ViewSubstitutionDetailsPassiveButton (EnhancedSubstitutionBanner.kt:123)");
            }
            float f10 = 16;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, H1.h.p(f10), H1.h.p(f10), H1.h.p(8), 1, null);
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.f(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
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
            Ji.Q.e(localThemeScope, C14898A.f139596a, ComposableLambdaKt.c(1018935368, true, new e(localThemeScope, viewSubstitutionBannerClicked, buttonActionText), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (C14898A.f139597b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.substitution.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12532d.f(localThemeScope, buttonActionText, viewSubstitutionBannerClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Function0 function0, int i10, Composer composer, int i11) {
        e(localThemeScope, abstractC5607a, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
