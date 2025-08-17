package hn;

import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import gn.OrderDetailPaymentDecorator;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lgn/j;", "decorator", "", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lgn/j;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hn.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14532e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.e$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135912a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderDetailPaymentDecorator f135913b;

        a(LocalThemeScope localThemeScope, OrderDetailPaymentDecorator orderDetailPaymentDecorator) {
            this.f135912a = localThemeScope;
            this.f135913b = orderDetailPaymentDecorator;
        }

        public final void a(Composer composer, int i10) {
            Composer composer2;
            LocalThemeScope localThemeScope;
            LocalThemeScope localThemeScope2;
            Composer composer3;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1683478080, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderDetailPaymentView.<anonymous> (OrderDetailPaymentView.kt:50)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), this.f135912a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope3 = this.f135912a;
            OrderDetailPaymentDecorator orderDetailPaymentDecorator = this.f135913b;
            C5658d c5658d = C5658d.f48555a;
            C5658d.e eVarG = c5658d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion2.l(), composer, 0);
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
            C17988z0.a(C16190d.c(Bj.i.f2673M, composer, 0), null, null, localThemeScope3.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            Modifier.Companion companion4 = companion;
            Modifier modifierB = InterfaceC14800I.b(c14801j, androidx.compose.foundation.layout.D.m(companion, localThemeScope3.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, localThemeScope3.getAdsSpacing().getFive().getDp(), 6, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion2.k(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierB);
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
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope3.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100399wb, composer, 0);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope3, label, strC, null, composer, i11 | (i12 << 3), 4);
            AbstractC5607a ebtCardInfo = orderDetailPaymentDecorator.getEbtCardInfo();
            composer.startReplaceGroup(-1732402632);
            if (ebtCardInfo == null) {
                composer2 = composer;
                localThemeScope = localThemeScope3;
            } else {
                Ji.I one = localThemeScope3.getAdsTypography().getBody().getOne();
                Ji.T adsColorText01 = localThemeScope3.getAdsColors().getAdsColorText01();
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion4, 0.0f, localThemeScope3.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                companion4 = companion4;
                composer2 = composer;
                localThemeScope = localThemeScope3;
                ri.j.h(localThemeScope, new q1.Label(modifierM, adsColorText01, null, null, 0, false, 0, one, null, 380, null), C6408b.a(ebtCardInfo, composer, AbstractC5607a.f45514b), null, composer2, i11 | (i12 << 3), 4);
                Unit unit = Unit.f142422a;
            }
            composer2.P();
            AbstractC5607a ebtCardExpiration = orderDetailPaymentDecorator.getEbtCardExpiration();
            composer2.startReplaceGroup(-1732386320);
            if (ebtCardExpiration != null) {
                ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), C6408b.a(ebtCardExpiration, composer2, AbstractC5607a.f45514b), null, composer2, i11 | (i12 << 3), 4);
                Unit unit2 = Unit.f142422a;
            }
            composer2.P();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion4, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, 0);
            AbstractC5607a cardInfo = orderDetailPaymentDecorator.getCardInfo();
            composer2.startReplaceGroup(-1732371203);
            if (cardInfo != null) {
                ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), C6408b.a(cardInfo, composer2, AbstractC5607a.f45514b), null, composer2, i11 | (i12 << 3), 4);
                Unit unit3 = Unit.f142422a;
            }
            composer2.P();
            AbstractC5607a cardExpiration = orderDetailPaymentDecorator.getCardExpiration();
            composer2.startReplaceGroup(-1732358838);
            if (cardExpiration == null) {
                localThemeScope2 = localThemeScope;
                composer3 = composer2;
            } else {
                ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), C6408b.a(cardExpiration, composer2, AbstractC5607a.f45514b), null, composer2, i11 | (i12 << 3), 4);
                localThemeScope2 = localThemeScope;
                composer3 = composer2;
                Unit unit4 = Unit.f142422a;
            }
            composer3.P();
            Modifier.Companion companion5 = companion4;
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion5, 0.0f, localThemeScope2.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer3, 0);
            int iA3 = C5717f.a(composer3, 0);
            InterfaceC5742s interfaceC5742sR3 = composer3.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer3, modifierM2);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer3.k() == null) {
                C5717f.c();
            }
            composer3.F();
            if (composer3.getInserting()) {
                composer3.I(function0A3);
            } else {
                composer3.s();
            }
            Composer composerA3 = D1.a(composer3);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            Composer composer4 = composer3;
            LocalThemeScope localThemeScope4 = localThemeScope2;
            ri.j.h(localThemeScope4, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16193g.c(com.meijer.mobile.meijer.Y.f99825T9, composer3, 0), null, composer4, i11 | (i12 << 3), 4);
            q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(companion5, localThemeScope4.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null), localThemeScope4.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope4.getAdsTypography().getBody().getOne(), null, 380, null);
            AbstractC5607a mperksNumber = orderDetailPaymentDecorator.getMperksNumber();
            int i13 = AbstractC5607a.f45514b;
            ri.j.h(localThemeScope4, label2, C6408b.a(mperksNumber, composer4, i13), null, composer4, i11 | (i12 << 3), 4);
            composer4.v();
            composer4.startReplaceGroup(-1732321257);
            if (orderDetailPaymentDecorator.getAuthorizationCodeVisibility()) {
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion5, 0.0f, localThemeScope4.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer4, 0);
                int iA4 = C5717f.a(composer4, 0);
                InterfaceC5742s interfaceC5742sR4 = composer4.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer4, modifierM3);
                Function0<InterfaceC5811g> function0A4 = companion3.a();
                if (composer4.k() == null) {
                    C5717f.c();
                }
                composer4.F();
                if (composer4.getInserting()) {
                    composer4.I(function0A4);
                } else {
                    composer4.s();
                }
                Composer composerA4 = D1.a(composer4);
                D1.c(composerA4, measurePolicyB3, companion3.e());
                D1.c(composerA4, interfaceC5742sR4, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion3.f());
                ri.j.h(localThemeScope4, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope4.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16193g.c(com.meijer.mobile.meijer.Y.f99749P9, composer4, 0), null, composer4, i11 | (i12 << 3), 4);
                ri.j.h(localThemeScope4, new q1.Label(androidx.compose.foundation.layout.D.m(companion5, localThemeScope4.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 0.0f, 14, null), localThemeScope4.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope4.getAdsTypography().getBody().getOne(), null, 380, null), C6408b.a(orderDetailPaymentDecorator.getAuthorizationCode(), composer4, i13), null, composer4, i11 | (i12 << 3), 4);
                composer.v();
            }
            composer.P();
            composer.v();
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final gn.OrderDetailPaymentDecorator r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14532e.b(Ji.M, androidx.compose.ui.Modifier, gn.j, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailPaymentDecorator orderDetailPaymentDecorator, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, orderDetailPaymentDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
