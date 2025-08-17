package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import Ji.LocalThemeScope;
import Ji.Q;
import P0.e;
import V0.C5306c0;
import V0.C5347r0;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.Resources;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.X;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o;
import d0.C13457y;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.List;
import ji.InterfaceC14914Q;
import ji.InterfaceC14920X;
import ji.InterfaceC14971y;
import ji.Q0;
import ji.j1;
import ji.q1;
import ji.s1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import ni.E0;
import p1.C16190d;
import p1.C16193g;
import r0.C16692i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u0012\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0014\u001a\u00020\r*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0016\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0019\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001d\u001a\u00020\r*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LJi/M;", "", "points", "", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f;", "offers", "", "isLoading", "isApplyButtonEnabled", "appliedOffers", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "", "onOfferSelected", "Lkotlin/Function0;", "onApplyOffers", "navigateToClaimRewards", "r", "(LJi/M;ILjava/util/List;ZZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "k", "(LJi/M;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "i", "(LJi/M;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "offerCount", "m", "(LJi/M;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "offer", "Lkotlin/Function1;", "o", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103405a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103406b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o$a$a, reason: collision with other inner class name */
        static final class C1473a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103407a;

            C1473a(LocalThemeScope localThemeScope) {
                this.f103407a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1693381066, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoClaimSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:251)");
                }
                LocalThemeScope localThemeScope = this.f103407a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f103407a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(Y.f100070g1, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f103405a = localThemeScope;
            this.f103406b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(254448073, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoClaimSection.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:245)");
            }
            E0.b(this.f103405a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, C16692i.c(H1.h.p(12)), null, null, null, null, false, null, 1015, null), this.f103406b, ComposableLambdaKt.c(-1693381066, true, new C1473a(this.f103405a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
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
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103408a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f103409b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103410c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f103411d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103412a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f103413b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f103414c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f103415d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o$b$a$a, reason: collision with other inner class name */
            static final class C1474a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f103416a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f103417b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ j1 f103418c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f103419d;

                C1474a(LocalThemeScope localThemeScope, boolean z10, j1 j1Var, int i10) {
                    this.f103416a = localThemeScope;
                    this.f103417b = z10;
                    this.f103418c = j1Var;
                    this.f103419d = i10;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1838278672, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoFooter.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:174)");
                    }
                    ri.j.h(this.f103416a, this.f103417b ? this.f103418c.getLabels().getEnabledLabel() : this.f103418c.getLabels().getDisabledLabel(), C16193g.c(this.f103419d == 0 ? Y.f100436y8 : Y.f99662Kh, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            a(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0, int i10) {
                this.f103412a = localThemeScope;
                this.f103413b = z10;
                this.f103414c = function0;
                this.f103415d = i10;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(435294429, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoFooter.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:164)");
                }
                E0.b(this.f103412a, q1.d.StandardButton.y(this.f103413b ? Assemble.getButtons().getEnabledButton() : Assemble.getButtons().getDisabledButton(), false, null, null, C16692i.c(H1.h.p(12)), null, null, null, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), false, null, 887, null), this.f103414c, ComposableLambdaKt.c(1838278672, true, new C1474a(this.f103412a, this.f103413b, Assemble, this.f103415d), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
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

        b(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0, int i10) {
            this.f103408a = localThemeScope;
            this.f103409b = z10;
            this.f103410c = function0;
            this.f103411d = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-181414521, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoFooter.<anonymous> (HighValuePromoSelectionsLayout.kt:157)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(Modifier.INSTANCE, this.f103408a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), 0.0f, 1, null), H1.h.p(16));
            LocalThemeScope localThemeScope = this.f103408a;
            boolean z10 = this.f103409b;
            Function0<Unit> function0 = this.f103410c;
            int i11 = this.f103411d;
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            Q.e(localThemeScope, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(435294429, true, new a(localThemeScope, z10, function0, i11), composer, 54), composer, LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.d.f140293b << 3));
            composer.v();
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
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103420a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HighValuePromoOfferDecorator f103421b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f103422c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103423a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HighValuePromoOfferDecorator f103424b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f103425c;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, HighValuePromoOfferDecorator highValuePromoOfferDecorator, Function1<? super Boolean, Unit> function1) {
                this.f103423a = localThemeScope;
                this.f103424b = highValuePromoOfferDecorator;
                this.f103425c = function1;
            }

            public final void b(InterfaceC14914Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1444546264, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoOfferCard.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:328)");
                }
                LocalThemeScope localThemeScope = this.f103423a;
                q1.s.Checkbox defaultToggleButton = Assemble.getToggleButtons().getDefaultToggleButton();
                boolean isChecked = this.f103424b.getIsChecked();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f103425c);
                final Function1<Boolean, Unit> function1 = this.f103425c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return o.c.a.c(function1, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                vi.s.b(localThemeScope, defaultToggleButton, isChecked, false, false, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.s.Checkbox.f140173e << 3), 12);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                b(interfaceC14914Q, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, boolean z10) {
                function1.invoke(Boolean.valueOf(z10));
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, HighValuePromoOfferDecorator highValuePromoOfferDecorator, Function1<? super Boolean, Unit> function1) {
            this.f103420a = localThemeScope;
            this.f103421b = highValuePromoOfferDecorator;
            this.f103422c = function1;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1329736520, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoOfferCard.<anonymous> (HighValuePromoSelectionsLayout.kt:322)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            C5658d c5658d = C5658d.f48555a;
            C5658d.f fVarO = c5658d.o(H1.h.p(f10));
            e.Companion companion2 = P0.e.INSTANCE;
            e.c cVarL = companion2.l();
            LocalThemeScope localThemeScope = this.f103420a;
            HighValuePromoOfferDecorator highValuePromoOfferDecorator = this.f103421b;
            Function1<Boolean, Unit> function1 = this.f103422c;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarO, cVarL, composer, 54);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            s1.b bVar = s1.b.f140196a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1444546264, true, new a(localThemeScope, highValuePromoOfferDecorator, function1), composer, 54);
            int i12 = LocalThemeScope.f15770g;
            Q.e(localThemeScope, bVar, composableLambdaC, composer, i12 | 384 | (s1.b.f140197b << 3));
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.o(H1.h.p(2)), companion2.k(), composer, 6);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 383, null);
            String promoDesc = highValuePromoOfferDecorator.getPromoDesc();
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, promoDesc, null, composer, i12 | (i13 << 3), 4);
            AbstractC5607a validThroughExpirationDate = highValuePromoOfferDecorator.getValidThroughExpirationDate();
            composer.startReplaceGroup(1643946165);
            if (validThroughExpirationDate == null) {
                i11 = 0;
            } else {
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.i(), composer, 48);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
                Function0<InterfaceC5811g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = D1.a(composer);
                D1.c(composerA3, measurePolicyB2, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), validThroughExpirationDate.b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, i12 | (i13 << 3), 4);
                composer.startReplaceGroup(1792080798);
                if (highValuePromoOfferDecorator.getDaysUntilExpired() == null || highValuePromoOfferDecorator.getDaysUntilExpired().intValue() > 7) {
                    i11 = 0;
                } else {
                    C5662h.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.D.k(companion, H1.h.p(6), 0.0f, 2, null), H1.h.p(12)), H1.h.p(1)), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 2, null), composer, 0);
                    i11 = 0;
                    ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorDanger(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 381, null), AbstractC5607a.INSTANCE.b(X.f99446e, highValuePromoOfferDecorator.getDaysUntilExpired().intValue(), new Object[0]).b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, i12 | (i13 << 3), 4);
                }
                composer.P();
                composer.v();
                Unit unit = Unit.f142422a;
            }
            composer.P();
            composer.v();
            int i14 = i11;
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, i14);
            float f11 = 32;
            C13457y.a(C16190d.c(S.f98689E, composer, i14), C16193g.c(Y.f100416x8, composer, i14), c14801j.d(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), H1.h.p(f11)), companion2.i()), null, null, 0.0f, C5347r0.INSTANCE.b(localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), C5306c0.INSTANCE.y()), composer, 0, 56);
            composer.v();
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
    static final class d implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<HighValuePromoOfferDecorator, Boolean, Unit> f103426a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HighValuePromoOfferDecorator f103427b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super HighValuePromoOfferDecorator, ? super Boolean, Unit> function2, HighValuePromoOfferDecorator highValuePromoOfferDecorator) {
            this.f103426a = function2;
            this.f103427b = highValuePromoOfferDecorator;
        }

        public final void a(boolean z10) {
            this.f103426a.invoke(this.f103427b, Boolean.valueOf(z10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103428a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103429a;

            a(LocalThemeScope localThemeScope) {
                this.f103429a = localThemeScope;
            }

            public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(229716084, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoSelectionsLayout.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:137)");
                }
                q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                Bi.o oVar = Bi.o.f2584a;
                Bi.m.d(this.f103429a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 56);
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

        e(LocalThemeScope localThemeScope) {
            this.f103428a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1657427643, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoSelectionsLayout.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:136)");
            }
            LocalThemeScope localThemeScope = this.f103428a;
            Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(229716084, true, new a(localThemeScope), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final f f103430f = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(HighValuePromoOfferDecorator highValuePromoOfferDecorator) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f103431f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f103432g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1, List list) {
            super(1);
            this.f103431f = function1;
            this.f103432g = list;
        }

        public final Object a(int i10) {
            return this.f103431f.invoke(this.f103432g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f103433f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103434g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f103435h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, LocalThemeScope localThemeScope, Function2 function2) {
            super(4);
            this.f103433f = list;
            this.f103434g = localThemeScope;
            this.f103435h = function2;
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
            HighValuePromoOfferDecorator highValuePromoOfferDecorator = (HighValuePromoOfferDecorator) this.f103433f.get(i10);
            composer.startReplaceGroup(819199085);
            LocalThemeScope localThemeScope = this.f103434g;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f103435h) | composer.D(highValuePromoOfferDecorator);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(this.f103435h, highValuePromoOfferDecorator);
                composer.t(objB);
            }
            composer.P();
            o.o(localThemeScope, highValuePromoOfferDecorator, (Function1) objB, null, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final Ji.LocalThemeScope r48, final int r49, final java.util.List<com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoOfferDecorator> r50, final boolean r51, final boolean r52, final int r53, androidx.compose.ui.Modifier r54, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoOfferDecorator, ? super java.lang.Boolean, kotlin.Unit> r55, final kotlin.jvm.functions.Function0<kotlin.Unit> r56, final kotlin.jvm.functions.Function0<kotlin.Unit> r57, androidx.compose.runtime.Composer r58, final int r59, final int r60) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.r(Ji.M, int, java.util.List, boolean, boolean, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void i(final Ji.LocalThemeScope r35, final int r36, androidx.compose.ui.Modifier r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.i(Ji.M, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, int i10, Modifier modifier, Function0 function0, int i11, int i12, Composer composer, int i13) {
        i(localThemeScope, i10, modifier, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void k(final Ji.LocalThemeScope r19, final boolean r20, final int r21, androidx.compose.ui.Modifier r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.k(Ji.M, boolean, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, boolean z10, int i10, Modifier modifier, Function0 function0, int i11, int i12, Composer composer, int i13) {
        k(localThemeScope, z10, i10, modifier, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m(final Ji.LocalThemeScope r27, final int r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.m(Ji.M, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) throws Resources.NotFoundException {
        m(localThemeScope, i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ji.LocalThemeScope r26, final com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoOfferDecorator r27, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.o(Ji.M, com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.f, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, HighValuePromoOfferDecorator highValuePromoOfferDecorator, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, highValuePromoOfferDecorator, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, int i10, List list, boolean z10, boolean z11, int i11, Modifier modifier, Function2 function2, Function0 function0, Function0 function02, int i12, int i13, Composer composer, int i14) throws Resources.NotFoundException {
        r(localThemeScope, i10, list, z10, z11, i11, modifier, function2, function0, function02, composer, J0.a(i12 | 1), i13);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(List list, LocalThemeScope localThemeScope, Function2 function2, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new g(f.f103430f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new h(list, localThemeScope, function2)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, HighValuePromoOfferDecorator highValuePromoOfferDecorator) {
        function1.invoke(Boolean.valueOf(!highValuePromoOfferDecorator.getIsChecked()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function2 function2, HighValuePromoOfferDecorator highValuePromoOfferDecorator, boolean z10) {
        function2.invoke(highValuePromoOfferDecorator, Boolean.valueOf(z10));
        return Unit.f142422a;
    }
}
