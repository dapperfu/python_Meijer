package com.meijer.mobile.meijer.activity.substitution;

import Ki.LocalThemeScope;
import L1.C4010g;
import L1.x;
import P0.e;
import V0.C5489q0;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import d0.C13572f;
import es.OrderSubstitutionsDetailBannerDecorator;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.C15132A;
import ki.j1;
import ki.q1;
import kotlin.C18054z0;
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
import oi.E0;
import p1.C16332a;
import p1.C16335d;
import r0.C16806i;
import r1.C16819m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "Les/J;", "orderSubstitutionDetailBanner", "Lkotlin/Function0;", "", "onClickSubstitutionBanner", "c", "(LKi/M;Les/J;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lbk/a;", "buttonActionText", "viewSubstitutionBannerClicked", "e", "(LKi/M;Lbk/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.substitution.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12658d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f113705f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f113705f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f113705f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f113706f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f113707g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f113708h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderSubstitutionsDetailBannerDecorator f113709i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113710j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f113711k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f113707g = nVar;
            this.f113708h = function0;
            this.f113709i = orderSubstitutionsDetailBannerDecorator;
            this.f113710j = localThemeScope;
            this.f113711k = function02;
            this.f113706f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f113707g.getHelpersHashCode();
            this.f113707g.i();
            L1.n nVar = this.f113707g;
            composer.startReplaceGroup(1986548428);
            L1.h hVarL = nVar.l();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f113712a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierD = androidx.compose.foundation.b.d(C13572f.g(nVar.k(companion, hVarL, (Function1) objB), H1.h.p(1), C16332a.a(this.f113709i.getSubstitutionScreenType().getBannerBorderColor(), composer, 0), C16806i.c(H1.h.p(5))), C16332a.a(this.f113709i.getSubstitutionScreenType().getBannerBackgroundColor(), composer, 0), null, 2, null);
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion4.e());
            D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14903g c14903g = C14903g.f139698a;
            e.c cVarI = companion3.i();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(16), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), cVarI, composer, 48);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
            Function0<InterfaceC5953g> function0A2 = companion4.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion4.e());
            D1.c(composerA2, interfaceC5884sR2, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C14889J c14889j = C14889J.f139620a;
            C18054z0.a(C16335d.c(this.f113709i.getSubstitutionScreenType().getBannerIcon(), composer, 0), null, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.H(companion, null, false, 3, null), null, false, 3, null), H1.h.p(18), 0.0f, 0.0f, 0.0f, 14, null), C5489q0.INSTANCE.j(), composer, 3504, 0);
            N1.b(this.f113709i.getSubstitutionScreenType().getBannerTitle().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.D.m(companion, H1.h.p(10), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Fj.c.a().getSubtitle1(), composer, 48, 0, 65532);
            composer.v();
            N1.b(this.f113709i.getSubstitutionScreenType().getBannerDescription().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.D.m(companion, H1.h.p(50), H1.h.p(8), 0.0f, 0.0f, 12, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Fj.c.a().getSubtitle2(), composer, 0, 0, 65532);
            LocalThemeScope localThemeScope = this.f113710j;
            AbstractC6392a bannerActionText = this.f113709i.getSubstitutionScreenType().getBannerActionText();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f113711k);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new C1798d(this.f113711k);
                composer.t(objB2);
            }
            composer.P();
            C12658d.e(localThemeScope, bannerActionText, (Function0) objB2, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3));
            composer.v();
            composer.P();
            if (this.f113707g.getHelpersHashCode() != helpersHashCode) {
                this.f113708h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$c */
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f113712a = new c();

        c() {
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$d, reason: collision with other inner class name */
    static final class C1798d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f113713a;

        C1798d(Function0<Unit> function0) {
            this.f113713a = function0;
        }

        public final void a() {
            this.f113713a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$e */
    static final class e implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f113714a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f113715b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f113716c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.d$e$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f113717a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f113718b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f113719c;

            a(LocalThemeScope localThemeScope, j1 j1Var, AbstractC6392a abstractC6392a) {
                this.f113717a = localThemeScope;
                this.f113718b = j1Var;
                this.f113719c = abstractC6392a;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-758697355, i10, -1, "com.meijer.mobile.meijer.activity.substitution.ViewSubstitutionDetailsPassiveButton.<anonymous>.<anonymous>.<anonymous> (EnhancedSubstitutionBanner.kt:135)");
                }
                si.j.h(this.f113717a, this.f113718b.getLabels().getEnabledLabel(), this.f113719c.b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        e(LocalThemeScope localThemeScope, Function0<Unit> function0, AbstractC6392a abstractC6392a) {
            this.f113714a = localThemeScope;
            this.f113715b = function0;
            this.f113716c = abstractC6392a;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1018935368, i10, -1, "com.meijer.mobile.meijer.activity.substitution.ViewSubstitutionDetailsPassiveButton.<anonymous>.<anonymous> (EnhancedSubstitutionBanner.kt:131)");
            }
            E0.b(this.f113714a, Assemble.getButtons().getEnabledButton(), this.f113715b, ComposableLambdaKt.c(-758697355, true, new a(this.f113714a, Assemble, this.f113716c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composerStartRestartGroup, 4544);
            MeasurePolicy measurePolicyA = pairH.a();
            Function0<Unit> function0B = pairH.b();
            Modifier modifierD = C16819m.d(modifierM, false, new a(a10), 1, null);
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
                    return C12658d.d(localThemeScope2, orderSubstitutionsDetailBannerDecorator, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, Function0 function0, int i10, Composer composer, int i11) {
        c(localThemeScope, orderSubstitutionsDetailBannerDecorator, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void e(final LocalThemeScope localThemeScope, final AbstractC6392a buttonActionText, final Function0<Unit> viewSubstitutionBannerClicked, Composer composer, final int i10) {
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
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.f(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            Ki.Q.e(localThemeScope, C15132A.f141851a, ComposableLambdaKt.c(1018935368, true, new e(localThemeScope, viewSubstitutionBannerClicked, buttonActionText), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (C15132A.f141852b << 3));
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
                    return C12658d.f(localThemeScope, buttonActionText, viewSubstitutionBannerClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Function0 function0, int i10, Composer composer, int i11) {
        e(localThemeScope, abstractC6392a, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
