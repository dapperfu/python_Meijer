package oo;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
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
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import bk.AbstractC6392a;
import c5.C6484c;
import co.AbstractC6537i;
import co.EarnReward;
import co.EnumC6542n;
import com.meijer.mobile.mperks.ux.g0;
import com.meijer.mobile.mperks.ux.h0;
import com.meijer.mobile.mperks.ux.j0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13590y;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.q1;
import kotlin.C15568x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import m5.C15669h;
import no.MccEnrollmentState;
import oi.C16198u0;
import oi.C16204x0;
import oi.P0;
import oo.J;
import p1.C16335d;
import p1.C16338g;
import ro.EnumC16932b;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u0019\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006!²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lco/g;", "rewardItem", "Lro/b;", "earnRewardCardType", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lco/i;", "", "onResourceAction", "q", "(LKi/M;Lco/g;Lro/b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "z", "(LKi/M;Lco/g;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/geometry/Rect;", "onCalculateTextBound", "k", "(LKi/M;Lco/g;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "E", "(LKi/M;Lco/g;Lro/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lno/c;", "mccEnrollmentState", "Lkotlin/Function0;", "onCreditCardViewClicked", "n", "(LKi/M;Landroidx/compose/ui/Modifier;Lno/c;Lro/b;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "textBounds", "", "parentWidth", "buttonBoxWidth", "Landroidx/compose/ui/text/AnnotatedString;", "displayText", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class J {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155118a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC16932b f155119b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MccEnrollmentState f155120c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155121d;

        a(LocalThemeScope localThemeScope, EnumC16932b enumC16932b, MccEnrollmentState mccEnrollmentState, Function0<Unit> function0) {
            this.f155118a = localThemeScope;
            this.f155119b = enumC16932b;
            this.f155120c = mccEnrollmentState;
            this.f155121d = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1697421544, i10, -1, "com.meijer.mobile.mperks.ux.earn.EarnTabMccRewardCard.<anonymous> (EarnTabRewardCard.kt:432)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.D(companion, null, false, 3, null), 0.0f, 1, null);
            LocalThemeScope localThemeScope = this.f155118a;
            EnumC16932b enumC16932b = this.f155119b;
            MccEnrollmentState mccEnrollmentState = this.f155120c;
            Function0<Unit> function0 = this.f155121d;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.d(companion, 0.0f, 1, null), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 4, null);
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C6484c.e(new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(C.b.e.c.f16973e).p(ns.s.f153128h).j(g0.f115011k).c(), null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.J.v(companion, localThemeScope.getAdsSpacing().getTwelve().getDp()), null, null, null, null, 0.0f, null, 0, false, null, composer, 48, 0, 8176);
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 10, null);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM2);
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
            D1.c(composerA3, measurePolicyA, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 11, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 382, null);
            String strC = C16338g.c(j0.f115092N, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 9, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null), C16338g.c(j0.f115177l1, composer, 0), null, composer, i11 | (i12 << 3), 4);
            if (enumC16932b == EnumC16932b.f159601a) {
                composer.startReplaceGroup(-547449511);
                C15568x.e(localThemeScope, true, mccEnrollmentState.getDollarProgress(), 750.0d, androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 9, null), false, composer, i11 | 3120, 16);
                Ki.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 9, null), localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, eight, null, 380, null), C16338g.c(j0.f115173k1, composer, 0), null, composer, i11 | (i12 << 3), 4);
                composer.P();
            } else {
                composer.startReplaceGroup(-546375175);
                Modifier modifierC = c14903g.c(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 13, null), companion2.j());
                MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
                int iA4 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierC);
                Function0<InterfaceC5953g> function0A4 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A4);
                } else {
                    composer.s();
                }
                Composer composerA4 = D1.a(composer);
                D1.c(composerA4, measurePolicyG2, companion3.e());
                D1.c(composerA4, interfaceC5884sR4, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                P0.k(localThemeScope, C16204x0.f154280a, C16338g.c(j0.f115095O, composer, 0), function0, null, C16338g.c(j0.f115095O, composer, 0), false, 0L, false, composer, i11 | (C16204x0.f154281b << 3), 232);
                composer.v();
                composer.P();
            }
            composer.v();
            composer.v();
            C13590y.a(C16335d.c(ns.s.f153123c, composer, 0), null, c5806j.g(androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 9, null), localThemeScope.getAdsSpacing().getSeven().getDp()), companion2.n()), null, InterfaceC5926k.INSTANCE.d(), 0.0f, null, composer, 24624, 104);
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
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EarnReward f155122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC16932b f155123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f155124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155125d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f155126e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Rect> f155127f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f155128g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC6537i, Unit> f155129h;

        /* JADX WARN: Multi-variable type inference failed */
        b(EarnReward earnReward, EnumC16932b enumC16932b, boolean z10, LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0, InterfaceC5872l0<Rect> interfaceC5872l0, InterfaceC5868j0 interfaceC5868j02, Function1<? super AbstractC6537i, Unit> function1) {
            this.f155122a = earnReward;
            this.f155123b = enumC16932b;
            this.f155124c = z10;
            this.f155125d = localThemeScope;
            this.f155126e = interfaceC5868j0;
            this.f155127f = interfaceC5872l0;
            this.f155128g = interfaceC5868j02;
            this.f155129h = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5868j0 interfaceC5868j0, LayoutCoordinates coords) {
            Intrinsics.j(coords, "coords");
            J.w(interfaceC5868j0, (int) (coords.c() >> 32));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC5872l0 interfaceC5872l0, Rect it) {
            Intrinsics.j(it, "it");
            J.u(interfaceC5872l0, it);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5868j0 interfaceC5868j0, LayoutCoordinates coords) {
            Intrinsics.j(coords, "coords");
            J.y(interfaceC5868j0, (int) (coords.c() >> 32));
            return Unit.f143329a;
        }

        public final void d(Composer composer, int i10) throws Resources.NotFoundException {
            LocalThemeScope localThemeScope;
            EarnReward earnReward;
            EarnReward earnReward2;
            LocalThemeScope localThemeScope2;
            EnumC16932b enumC16932b;
            int i11;
            EnumC16932b enumC16932b2;
            EarnReward earnReward3;
            LocalThemeScope localThemeScope3;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1424267527, i10, -1, "com.meijer.mobile.mperks.ux.earn.EarnTabRewardCard.<anonymous> (EarnTabRewardCard.kt:122)");
            }
            C5800d c5800d = C5800d.f48779a;
            C5800d.f fVarE = c5800d.e();
            EarnReward earnReward4 = this.f155122a;
            EnumC16932b enumC16932b3 = this.f155123b;
            boolean z10 = this.f155124c;
            LocalThemeScope localThemeScope4 = this.f155125d;
            final InterfaceC5868j0 interfaceC5868j0 = this.f155126e;
            final InterfaceC5872l0<Rect> interfaceC5872l0 = this.f155127f;
            final InterfaceC5868j0 interfaceC5868j02 = this.f155128g;
            Function1<AbstractC6537i, Unit> function1 = this.f155129h;
            Modifier.Companion companion = Modifier.INSTANCE;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(fVarE, companion2.k(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierD = androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierD);
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
            D1.c(composerA2, measurePolicyG, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, localThemeScope4.getAdsSpacing().getFive().getDp());
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA3, measurePolicyB, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C15669h c15669hC = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(earnReward4.getImageUrl()).p(ns.s.f153128h).j(ns.s.f153128h).c();
            a5.h hVarA = a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            EnumC16932b enumC16932b4 = EnumC16932b.f159603c;
            C6484c.e(c15669hC, null, hVarA, c14889j.d(androidx.compose.foundation.layout.J.v(companion, enumC16932b3 == enumC16932b4 ? localThemeScope4.getAdsSpacing().getEleven().getDp() : localThemeScope4.getAdsSpacing().getTwelve().getDp()), companion2.i()), null, null, null, null, 0.0f, null, 0, false, null, composer, 48, 0, 8176);
            Modifier modifierD2 = androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.D.m(companion, localThemeScope4.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), null, false, 3, null);
            composer.startReplaceGroup(5004770);
            Object objB = composer.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = new Function1() { // from class: oo.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return J.b.e(interfaceC5868j0, (LayoutCoordinates) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA = androidx.compose.ui.layout.T.a(modifierD2, (Function1) objB);
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA4 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierA);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyA2, companion3.e());
            D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope4.getAdsSpacing().getFive().getDp(), 0.0f, 11, null);
            MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
            int iA5 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR5 = composer.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierM);
            Function0<InterfaceC5953g> function0A5 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A5);
            } else {
                composer.s();
            }
            Composer composerA5 = D1.a(composer);
            D1.c(composerA5, measurePolicyG2, companion3.e());
            D1.c(composerA5, interfaceC5884sR5, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            D1.c(composerA5, modifierE5, companion3.f());
            q1.Label label = new q1.Label(null, null, null, null, 0, false, enumC16932b3 == enumC16932b4 ? 2 : Integer.MAX_VALUE, localThemeScope4.getAdsTypography().getValues().getThree(), null, 319, null);
            String string = earnReward4.getTitle().toString();
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope4, label, string, null, composer, i12 | (i13 << 3), 4);
            composer.v();
            Composer composer2 = composer;
            si.j.h(localThemeScope4, new q1.Label(androidx.compose.foundation.layout.J.H(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope4.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), null, false, 3, null), null, null, null, F1.t.INSTANCE.b(), false, 3, localThemeScope4.getAdsTypography().getBodyCompact().getTwo(), null, HttpResponseStatus.REDIRECTION_FOUND, null), earnReward4.getDescription().toString(), null, composer2, i12 | (i13 << 3), 4);
            if (enumC16932b3 == enumC16932b4) {
                composer2.startReplaceGroup(49618777);
                composer2.startReplaceGroup(5004770);
                Object objB2 = composer2.B();
                if (objB2 == companion4.a()) {
                    objB2 = new Function1() { // from class: oo.L
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return J.b.f(interfaceC5872l0, (Rect) obj);
                        }
                    };
                    composer2.t(objB2);
                }
                composer2.P();
                J.k(localThemeScope4, earnReward4, null, (Function1) objB2, composer2, i12 | 3072, 2);
                localThemeScope = localThemeScope4;
                earnReward = earnReward4;
                composer2.P();
            } else {
                localThemeScope = localThemeScope4;
                earnReward = earnReward4;
                composer2.startReplaceGroup(49927878);
                J.z(localThemeScope, earnReward, composer2, i12);
                composer2.P();
            }
            composer2.startReplaceGroup(-691121284);
            if (enumC16932b3 != EnumC16932b.f159601a || earnReward.getEarnRequirement() == 0.0d) {
                earnReward2 = earnReward;
                localThemeScope2 = localThemeScope;
                enumC16932b = enumC16932b4;
            } else {
                localThemeScope2 = localThemeScope;
                boolean z11 = earnReward.getRewardType() == EnumC6542n.f62805a;
                double dI = earnReward.i();
                double earnRequirement = earnReward.getEarnRequirement();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, 0.0f, (earnReward.getShouldShowDateUI() ? localThemeScope2.getAdsSpacing().getThree() : localThemeScope2.getAdsSpacing().getFive()).getDp(), 0.0f, 0.0f, 13, null);
                earnReward2 = earnReward;
                enumC16932b = enumC16932b4;
                C15568x.e(localThemeScope2, z11, dI, earnRequirement, modifierM2, false, composer, i12, 16);
                composer2 = composer;
            }
            composer2.P();
            composer2.v();
            composer2.v();
            C13590y.a(C16335d.c(ns.s.f153123c, composer2, 0), C16338g.c(ns.u.f153204y, composer2, 0), c5806j.g(androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp(), 0.0f, 9, null), localThemeScope2.getAdsSpacing().getSeven().getDp()), companion2.n()), null, InterfaceC5926k.INSTANCE.d(), 0.0f, null, composer, 24576, 104);
            composer.startReplaceGroup(-878616943);
            if (enumC16932b3 != enumC16932b || z10) {
                i11 = i12;
                enumC16932b2 = enumC16932b3;
                earnReward3 = earnReward2;
                localThemeScope3 = localThemeScope2;
            } else {
                Modifier modifierG = c5806j.g(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope2.getAdsSpacing().getFive().getDp(), localThemeScope2.getAdsSpacing().getFive().getDp(), 3, null), companion2.c());
                composer.startReplaceGroup(5004770);
                Object objB3 = composer.B();
                if (objB3 == companion4.a()) {
                    objB3 = new Function1() { // from class: oo.M
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return J.b.g(interfaceC5868j02, (LayoutCoordinates) obj);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                Modifier modifierA2 = androidx.compose.ui.layout.T.a(modifierG, (Function1) objB3);
                MeasurePolicy measurePolicyG3 = C5804h.g(companion2.o(), false);
                int iA6 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR6 = composer.r();
                Modifier modifierE6 = androidx.compose.ui.b.e(composer, modifierA2);
                Function0<InterfaceC5953g> function0A6 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A6);
                } else {
                    composer.s();
                }
                Composer composerA6 = D1.a(composer);
                D1.c(composerA6, measurePolicyG3, companion3.e());
                D1.c(composerA6, interfaceC5884sR6, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B6 = companion3.b();
                if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                    composerA6.t(Integer.valueOf(iA6));
                    composerA6.n(Integer.valueOf(iA6), function2B6);
                }
                D1.c(composerA6, modifierE6, companion3.f());
                i11 = i12;
                enumC16932b2 = enumC16932b3;
                earnReward3 = earnReward2;
                localThemeScope3 = localThemeScope2;
                J.E(localThemeScope3, earnReward3, enumC16932b2, function1, composer, i11);
                composer.v();
            }
            composer.P();
            composer.v();
            composer.startReplaceGroup(-550705071);
            if (earnReward3.getHasUpcs() && (enumC16932b2 != enumC16932b || z10)) {
                Modifier modifierC = c14903g.c(androidx.compose.foundation.layout.A.c(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope3.getAdsSpacing().getFive().getDp(), localThemeScope3.getAdsSpacing().getThree().getDp(), 3, null), 0.0f, H1.h.p(-localThemeScope3.getAdsSpacing().getThree().getDp()), 1, null), companion2.j());
                MeasurePolicy measurePolicyG4 = C5804h.g(companion2.o(), false);
                int iA7 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR7 = composer.r();
                Modifier modifierE7 = androidx.compose.ui.b.e(composer, modifierC);
                Function0<InterfaceC5953g> function0A7 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A7);
                } else {
                    composer.s();
                }
                Composer composerA7 = D1.a(composer);
                D1.c(composerA7, measurePolicyG4, companion3.e());
                D1.c(composerA7, interfaceC5884sR7, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B7 = companion3.b();
                if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                    composerA7.t(Integer.valueOf(iA7));
                    composerA7.n(Integer.valueOf(iA7), function2B7);
                }
                D1.c(composerA7, modifierE7, companion3.f());
                J.E(localThemeScope3, earnReward3, enumC16932b2, function1, composer, i11);
                composer.v();
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            d(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC16932b.values().length];
            try {
                iArr[EnumC16932b.f159601a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16932b.f159602b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16932b.f159603c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(String str, String str2, String str3, String str4, EarnReward earnReward, LocalThemeScope localThemeScope, InterfaceC5872l0 interfaceC5872l0, TextLayoutResult layout) {
        String str5;
        Intrinsics.j(layout, "layout");
        int iQ0 = StringsKt.q0(str, str2, 0, false, 6, null);
        boolean z10 = iQ0 == layout.u(layout.q(iQ0));
        if (!z10 && layout.n() > 1) {
            str5 = str3 + ' ' + str2 + '\n' + str4;
        } else if (!z10 || layout.n() <= 1) {
            str5 = str;
        } else {
            str5 = str3 + '\n' + str4;
        }
        int iQ02 = StringsKt.q0(str5, str4, 0, false, 6, null);
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        bVar.g(str5);
        if (earnReward.getDaysLeft() <= 7.0d) {
            bVar.a(new SpanStyle(localThemeScope.getAdsColors().getAdsColorBrandSecondary().getColor(), 0L, null, localThemeScope.getAdsTypography().getHeadings().getNine().getStyle().m(), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65526, null), iQ02, str4.length() + iQ02);
        }
        AnnotatedString annotatedStringQ = bVar.q();
        if (!Intrinsics.e(annotatedStringQ, A(interfaceC5872l0))) {
            B(interfaceC5872l0, annotatedStringQ);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, EarnReward earnReward, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        z(localThemeScope, earnReward, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void E(final LocalThemeScope localThemeScope, final EarnReward rewardItem, final EnumC16932b earnRewardCardType, final Function1<? super AbstractC6537i, Unit> onResourceAction, Composer composer, final int i10) {
        int i11;
        String strC;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(rewardItem, "rewardItem");
        Intrinsics.j(earnRewardCardType, "earnRewardCardType");
        Intrinsics.j(onResourceAction, "onResourceAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-644856473);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(rewardItem) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.d(earnRewardCardType.ordinal()) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onResourceAction) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-644856473, i11, -1, "com.meijer.mobile.mperks.ux.earn.ShopButton (EarnTabRewardCard.kt:382)");
            }
            if (earnRewardCardType == EnumC16932b.f159603c) {
                composerStartRestartGroup.startReplaceGroup(-1231772274);
                strC = C16338g.c(j0.f115100P1, composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1231770574);
                strC = C16338g.c(j0.f115094N1, composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            }
            C16198u0 c16198u0 = C16198u0.f154260a;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = ((i11 & 896) == 256) | ((i11 & 7168) == 2048) | composerStartRestartGroup.D(rewardItem);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: oo.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return J.F(onResourceAction, rewardItem, earnRewardCardType);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            P0.k(localThemeScope, c16198u0, strC, (Function0) objB, null, strC, false, 0L, false, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (C16198u0.f154261b << 3), 232);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oo.E
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return J.G(localThemeScope, rewardItem, earnRewardCardType, onResourceAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(Function1 function1, EarnReward earnReward, EnumC16932b enumC16932b) {
        boolean z10 = enumC16932b == EnumC16932b.f159603c;
        int i10 = c.$EnumSwitchMapping$0[enumC16932b.ordinal()];
        String str = "MPERKS_EARN_TAB_IN_PROGRESS";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "MPERKS_EARN_TAB_AVAILABLE";
            } else if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        function1.invoke(new AbstractC6537i.EarnRewardCardClicked(earnReward, z10, str, false, 8, null));
        function1.invoke(new AbstractC6537i.OnTrackShopNowButtonClick(earnReward.getRewardId() + ": " + earnReward.getTitle()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, EarnReward earnReward, EnumC16932b enumC16932b, Function1 function1, int i10, Composer composer, int i11) {
        E(localThemeScope, earnReward, enumC16932b, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r29, final co.EarnReward r30, androidx.compose.ui.Modifier r31, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.J.k(Ki.M, co.g, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1, LayoutCoordinates coords) {
        Intrinsics.j(coords, "coords");
        function1.invoke(LayoutCoordinatesKt.boundsInParent(coords));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, EarnReward earnReward, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        k(localThemeScope, earnReward, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ki.LocalThemeScope r27, androidx.compose.ui.Modifier r28, final no.MccEnrollmentState r29, final ro.EnumC16932b r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.J.n(Ki.M, androidx.compose.ui.Modifier, no.c, ro.b, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, MccEnrollmentState mccEnrollmentState, EnumC16932b enumC16932b, Function0 function0, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, modifier, mccEnrollmentState, enumC16932b, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ki.LocalThemeScope r31, final co.EarnReward r32, final ro.EnumC16932b r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.J.q(Ki.M, co.g, ro.b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, EarnReward earnReward, EnumC16932b enumC16932b) {
        boolean z10 = enumC16932b == EnumC16932b.f159603c;
        int i10 = c.$EnumSwitchMapping$0[enumC16932b.ordinal()];
        String str = "MPERKS_EARN_TAB_IN_PROGRESS";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "MPERKS_EARN_TAB_AVAILABLE";
            } else if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        function1.invoke(new AbstractC6537i.EarnRewardCardClicked(earnReward, z10, str, false, 8, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, EarnReward earnReward, EnumC16932b enumC16932b, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, earnReward, enumC16932b, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void z(final LocalThemeScope localThemeScope, final EarnReward rewardItem, Composer composer, final int i10) throws Resources.NotFoundException {
        int i11;
        final EarnReward earnReward;
        Composer composer2;
        String strA;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Intrinsics.j(rewardItem, "rewardItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(1934768160);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(rewardItem) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            earnReward = rewardItem;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1934768160, i11, -1, "com.meijer.mobile.mperks.ux.earn.EarnThroughAndDayLeftsText (EarnTabRewardCard.kt:254)");
            }
            if (rewardItem.getShouldShowDateUI()) {
                boolean z10 = false;
                C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, localThemeScope2.getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
                final String strD = C16338g.d(j0.f115180m0, new Object[]{rewardItem.getEarnThruDate()}, composerStartRestartGroup, 0);
                if (rewardItem.getDaysLeft() == 0) {
                    composerStartRestartGroup.startReplaceGroup(217582442);
                    strA = C16338g.c(j0.f115218x0, composerStartRestartGroup, 0);
                    composerStartRestartGroup.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-408619726);
                    strA = C13698b.a(AbstractC6392a.INSTANCE.b(h0.f115029b, rewardItem.getDaysLeft(), new Object[0]), composerStartRestartGroup, AbstractC6392a.f60445b);
                    composerStartRestartGroup.P();
                }
                final String strC = C16338g.c(j0.f115188o0, composerStartRestartGroup, 0);
                final String str = strD + ' ' + strC + ' ' + strA;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = t1.e(new AnnotatedString(str, null, 2, null), null, 2, null);
                    composerStartRestartGroup.t(objB);
                }
                final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
                composerStartRestartGroup.P();
                q1.Label label = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 381, null);
                AnnotatedString annotatedStringA = A(interfaceC5872l0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zV = composerStartRestartGroup.V(str) | composerStartRestartGroup.V(strC) | composerStartRestartGroup.V(strD) | composerStartRestartGroup.V(strA) | composerStartRestartGroup.D(rewardItem);
                final String str2 = strA;
                int i12 = i11 & 14;
                if (i12 == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope2))) {
                    z10 = true;
                }
                boolean z11 = zV | z10;
                Object objB2 = composerStartRestartGroup.B();
                if (z11 || objB2 == companion.a()) {
                    Function1 function1 = new Function1() { // from class: oo.H
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return J.C(str, strC, strD, str2, rewardItem, localThemeScope, interfaceC5872l0, (TextLayoutResult) obj);
                        }
                    };
                    earnReward = rewardItem;
                    composerStartRestartGroup.t(function1);
                    objB2 = function1;
                } else {
                    earnReward = rewardItem;
                }
                composerStartRestartGroup.P();
                localThemeScope2 = localThemeScope;
                composer2 = composerStartRestartGroup;
                si.j.g(localThemeScope2, label, annotatedStringA, null, (Function1) objB2, composer2, LocalThemeScope.f17314g | i12 | (q1.Label.f142335j << 3), 4);
            } else {
                earnReward = rewardItem;
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oo.I
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return J.D(localThemeScope2, earnReward, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final AnnotatedString A(InterfaceC5872l0<AnnotatedString> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void B(InterfaceC5872l0<AnnotatedString> interfaceC5872l0, AnnotatedString annotatedString) {
        interfaceC5872l0.setValue(annotatedString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    private static final Rect r(InterfaceC5872l0<Rect> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(InterfaceC5872l0<Rect> interfaceC5872l0, Rect rect) {
        interfaceC5872l0.setValue(rect);
    }

    private static final int v(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    private static final int x(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }
}
