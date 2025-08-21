package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import Ki.LocalThemeScope;
import Ki.Q;
import P0.e;
import V0.C5449c0;
import V0.C5490r0;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.X;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o;
import d0.C13590y;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.List;
import ki.InterfaceC15148Q;
import ki.InterfaceC15154X;
import ki.InterfaceC15205y;
import ki.Q0;
import ki.j1;
import ki.q1;
import ki.s1;
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
import l0.InterfaceC15433c;
import oi.E0;
import p1.C16335d;
import p1.C16338g;
import r0.C16806i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u0012\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0014\u001a\u00020\r*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0016\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0019\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001d\u001a\u00020\r*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LKi/M;", "", "points", "", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f;", "offers", "", "isLoading", "isApplyButtonEnabled", "appliedOffers", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "", "onOfferSelected", "Lkotlin/Function0;", "onApplyOffers", "navigateToClaimRewards", "r", "(LKi/M;ILjava/util/List;ZZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "k", "(LKi/M;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "i", "(LKi/M;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "offerCount", "m", "(LKi/M;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "offer", "Lkotlin/Function1;", "o", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104260a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104261b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o$a$a, reason: collision with other inner class name */
        static final class C1482a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104262a;

            C1482a(LocalThemeScope localThemeScope) {
                this.f104262a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1693381066, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoClaimSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:251)");
                }
                LocalThemeScope localThemeScope = this.f104262a;
                si.j.h(localThemeScope, new q1.Label(null, this.f104262a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(Y.f100932g1, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f104260a = localThemeScope;
            this.f104261b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(254448073, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoClaimSection.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:245)");
            }
            E0.b(this.f104260a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, C16806i.c(H1.h.p(12)), null, null, null, null, false, null, 1015, null), this.f104261b, ComposableLambdaKt.c(-1693381066, true, new C1482a(this.f104260a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f104264b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104265c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f104266d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104267a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f104268b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f104269c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f104270d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o$b$a$a, reason: collision with other inner class name */
            static final class C1483a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104271a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f104272b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ j1 f104273c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f104274d;

                C1483a(LocalThemeScope localThemeScope, boolean z10, j1 j1Var, int i10) {
                    this.f104271a = localThemeScope;
                    this.f104272b = z10;
                    this.f104273c = j1Var;
                    this.f104274d = i10;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1838278672, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoFooter.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:174)");
                    }
                    si.j.h(this.f104271a, this.f104272b ? this.f104273c.getLabels().getEnabledLabel() : this.f104273c.getLabels().getDisabledLabel(), C16338g.c(this.f104274d == 0 ? Y.f100340B8 : Y.f100619Ph, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0, int i10) {
                this.f104267a = localThemeScope;
                this.f104268b = z10;
                this.f104269c = function0;
                this.f104270d = i10;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(435294429, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoFooter.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:164)");
                }
                E0.b(this.f104267a, q1.d.StandardButton.y(this.f104268b ? Assemble.getButtons().getEnabledButton() : Assemble.getButtons().getDisabledButton(), false, null, null, C16806i.c(H1.h.p(12)), null, null, null, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), false, null, 887, null), this.f104269c, ComposableLambdaKt.c(1838278672, true, new C1483a(this.f104267a, this.f104268b, Assemble, this.f104270d), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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

        b(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0, int i10) {
            this.f104263a = localThemeScope;
            this.f104264b = z10;
            this.f104265c = function0;
            this.f104266d = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-181414521, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoFooter.<anonymous> (HighValuePromoSelectionsLayout.kt:157)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(Modifier.INSTANCE, this.f104263a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), 0.0f, 1, null), H1.h.p(16));
            LocalThemeScope localThemeScope = this.f104263a;
            boolean z10 = this.f104264b;
            Function0<Unit> function0 = this.f104265c;
            int i11 = this.f104266d;
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            Q.e(localThemeScope, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(435294429, true, new a(localThemeScope, z10, function0, i11), composer, 54), composer, LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.d.f142548b << 3));
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104275a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HighValuePromoOfferDecorator f104276b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f104277c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104278a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HighValuePromoOfferDecorator f104279b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f104280c;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, HighValuePromoOfferDecorator highValuePromoOfferDecorator, Function1<? super Boolean, Unit> function1) {
                this.f104278a = localThemeScope;
                this.f104279b = highValuePromoOfferDecorator;
                this.f104280c = function1;
            }

            public final void b(InterfaceC15148Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1444546264, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoOfferCard.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:328)");
                }
                LocalThemeScope localThemeScope = this.f104278a;
                q1.s.Checkbox defaultToggleButton = Assemble.getToggleButtons().getDefaultToggleButton();
                boolean isChecked = this.f104279b.getIsChecked();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f104280c);
                final Function1<Boolean, Unit> function1 = this.f104280c;
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
                wi.s.b(localThemeScope, defaultToggleButton, isChecked, false, false, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.s.Checkbox.f142428e << 3), 12);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                b(interfaceC15148Q, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, boolean z10) {
                function1.invoke(Boolean.valueOf(z10));
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, HighValuePromoOfferDecorator highValuePromoOfferDecorator, Function1<? super Boolean, Unit> function1) {
            this.f104275a = localThemeScope;
            this.f104276b = highValuePromoOfferDecorator;
            this.f104277c = function1;
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
            C5800d c5800d = C5800d.f48779a;
            C5800d.f fVarO = c5800d.o(H1.h.p(f10));
            e.Companion companion2 = P0.e.INSTANCE;
            e.c cVarL = companion2.l();
            LocalThemeScope localThemeScope = this.f104275a;
            HighValuePromoOfferDecorator highValuePromoOfferDecorator = this.f104276b;
            Function1<Boolean, Unit> function1 = this.f104277c;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarO, cVarL, composer, 54);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            s1.b bVar = s1.b.f142451a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1444546264, true, new a(localThemeScope, highValuePromoOfferDecorator, function1), composer, 54);
            int i12 = LocalThemeScope.f17314g;
            Q.e(localThemeScope, bVar, composableLambdaC, composer, i12 | 384 | (s1.b.f142452b << 3));
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.o(H1.h.p(2)), companion2.k(), composer, 6);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 383, null);
            String promoDesc = highValuePromoOfferDecorator.getPromoDesc();
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, promoDesc, null, composer, i12 | (i13 << 3), 4);
            AbstractC6392a validThroughExpirationDate = highValuePromoOfferDecorator.getValidThroughExpirationDate();
            composer.startReplaceGroup(1643946165);
            if (validThroughExpirationDate == null) {
                i11 = 0;
            } else {
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.i(), composer, 48);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
                Function0<InterfaceC5953g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = D1.a(composer);
                D1.c(composerA3, measurePolicyB2, companion3.e());
                D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), validThroughExpirationDate.b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, i12 | (i13 << 3), 4);
                composer.startReplaceGroup(1792080798);
                if (highValuePromoOfferDecorator.getDaysUntilExpired() == null || highValuePromoOfferDecorator.getDaysUntilExpired().intValue() > 7) {
                    i11 = 0;
                } else {
                    C5804h.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.D.k(companion, H1.h.p(6), 0.0f, 2, null), H1.h.p(12)), H1.h.p(1)), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 2, null), composer, 0);
                    i11 = 0;
                    si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorDanger(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 381, null), AbstractC6392a.INSTANCE.b(X.f100303f, highValuePromoOfferDecorator.getDaysUntilExpired().intValue(), new Object[0]).b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), null, composer, i12 | (i13 << 3), 4);
                }
                composer.P();
                composer.v();
                Unit unit = Unit.f143329a;
            }
            composer.P();
            composer.v();
            int i14 = i11;
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, i14);
            float f11 = 32;
            C13590y.a(C16335d.c(S.f99546E, composer, i14), C16338g.c(Y.f100320A8, composer, i14), c14889j.d(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), H1.h.p(f11)), companion2.i()), null, null, 0.0f, C5490r0.INSTANCE.b(localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), C5449c0.INSTANCE.y()), composer, 0, 56);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<HighValuePromoOfferDecorator, Boolean, Unit> f104281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HighValuePromoOfferDecorator f104282b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super HighValuePromoOfferDecorator, ? super Boolean, Unit> function2, HighValuePromoOfferDecorator highValuePromoOfferDecorator) {
            this.f104281a = function2;
            this.f104282b = highValuePromoOfferDecorator;
        }

        public final void a(boolean z10) {
            this.f104281a.invoke(this.f104282b, Boolean.valueOf(z10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104283a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104284a;

            a(LocalThemeScope localThemeScope) {
                this.f104284a = localThemeScope;
            }

            public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(229716084, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoSelectionsLayout.<anonymous>.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:137)");
                }
                q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                Ci.o oVar = Ci.o.f4629a;
                Ci.m.d(this.f104284a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 56);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                a(interfaceC15154X, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        e(LocalThemeScope localThemeScope) {
            this.f104283a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1657427643, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoSelectionsLayout.<anonymous>.<anonymous> (HighValuePromoSelectionsLayout.kt:136)");
            }
            LocalThemeScope localThemeScope = this.f104283a;
            Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(229716084, true, new a(localThemeScope), composer, 54), composer, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final f f104285f = new f();

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
        final /* synthetic */ Function1 f104286f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f104287g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1, List list) {
            super(1);
            this.f104286f = function1;
            this.f104287g = list;
        }

        public final Object a(int i10) {
            return this.f104286f.invoke(this.f104287g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f104288f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104289g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f104290h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, LocalThemeScope localThemeScope, Function2 function2) {
            super(4);
            this.f104288f = list;
            this.f104289g = localThemeScope;
            this.f104290h = function2;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
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
            HighValuePromoOfferDecorator highValuePromoOfferDecorator = (HighValuePromoOfferDecorator) this.f104288f.get(i10);
            composer.startReplaceGroup(819199085);
            LocalThemeScope localThemeScope = this.f104289g;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f104290h) | composer.D(highValuePromoOfferDecorator);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(this.f104290h, highValuePromoOfferDecorator);
                composer.t(objB);
            }
            composer.P();
            o.o(localThemeScope, highValuePromoOfferDecorator, (Function1) objB, null, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 4);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
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
    public static final void r(final Ki.LocalThemeScope r48, final int r49, final java.util.List<com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoOfferDecorator> r50, final boolean r51, final boolean r52, final int r53, androidx.compose.ui.Modifier r54, final kotlin.jvm.functions.Function2<? super com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoOfferDecorator, ? super java.lang.Boolean, kotlin.Unit> r55, final kotlin.jvm.functions.Function0<kotlin.Unit> r56, final kotlin.jvm.functions.Function0<kotlin.Unit> r57, androidx.compose.runtime.Composer r58, final int r59, final int r60) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.r(Ki.M, int, java.util.List, boolean, boolean, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
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
    private static final void i(final Ki.LocalThemeScope r35, final int r36, androidx.compose.ui.Modifier r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.i(Ki.M, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, int i10, Modifier modifier, Function0 function0, int i11, int i12, Composer composer, int i13) {
        i(localThemeScope, i10, modifier, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
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
    private static final void k(final Ki.LocalThemeScope r19, final boolean r20, final int r21, androidx.compose.ui.Modifier r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.k(Ki.M, boolean, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, boolean z10, int i10, Modifier modifier, Function0 function0, int i11, int i12, Composer composer, int i13) {
        k(localThemeScope, z10, i10, modifier, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
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
    private static final void m(final Ki.LocalThemeScope r27, final int r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.m(Ki.M, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) throws Resources.NotFoundException {
        m(localThemeScope, i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
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
    public static final void o(final Ki.LocalThemeScope r26, final com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoOfferDecorator r27, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.o.o(Ki.M, com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.f, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, HighValuePromoOfferDecorator highValuePromoOfferDecorator, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, highValuePromoOfferDecorator, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, int i10, List list, boolean z10, boolean z11, int i11, Modifier modifier, Function2 function2, Function0 function0, Function0 function02, int i12, int i13, Composer composer, int i14) throws Resources.NotFoundException {
        r(localThemeScope, i10, list, z10, z11, i11, modifier, function2, function0, function02, composer, J0.a(i12 | 1), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(List list, LocalThemeScope localThemeScope, Function2 function2, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new g(f.f104285f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new h(list, localThemeScope, function2)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, HighValuePromoOfferDecorator highValuePromoOfferDecorator) {
        function1.invoke(Boolean.valueOf(!highValuePromoOfferDecorator.getIsChecked()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function2 function2, HighValuePromoOfferDecorator highValuePromoOfferDecorator, boolean z10) {
        function2.invoke(highValuePromoOfferDecorator, Boolean.valueOf(z10));
        return Unit.f143329a;
    }
}
