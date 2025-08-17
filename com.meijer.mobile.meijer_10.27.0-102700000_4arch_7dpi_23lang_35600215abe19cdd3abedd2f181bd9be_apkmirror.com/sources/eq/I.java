package eq;

import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import eq.I;
import fq.C13927b;
import hq.ShopAndScanCouponDecorator;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.C17890L;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;
import r0.C16692i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhq/e;", "decorator", "Lkotlin/Function0;", "", "onCouponAction", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Lhq/e;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "expandedState", "", "rotationState", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class I {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ShopAndScanCouponDecorator f129488a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129489b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f129490c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1<Float> f129491d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f129492e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ShopAndScanCouponDecorator f129493f;

        public final void c(Composer composer, int i10) {
            int i11;
            Modifier.Companion companion;
            Composer composer2;
            LocalThemeScope localThemeScope;
            Unit unit;
            Composer composer3;
            int i12;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1374613938, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.CouponComponent.<anonymous>.<anonymous> (CouponComponent.kt:79)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion2, H1.h.p(12));
            ShopAndScanCouponDecorator shopAndScanCouponDecorator = this.f129488a;
            LocalThemeScope localThemeScope2 = this.f129489b;
            final Function0<Unit> function0 = this.f129490c;
            z1<Float> z1Var = this.f129491d;
            InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f129492e;
            ShopAndScanCouponDecorator shopAndScanCouponDecorator2 = this.f129493f;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            float f10 = 8;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), 0.0f, H1.h.p(f10), 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion3.i(), composer, 48);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK);
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
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, H1.h.p(4), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion3.i(), composer, 48);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM);
            Function0<InterfaceC5811g> function0A3 = companion4.a();
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
            D1.c(composerA3, measurePolicyB2, companion4.e());
            D1.c(composerA3, interfaceC5742sR3, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion4.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion4.f());
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.J.B(companion2, 0.0f, H1.h.p(BinsView.TOTE_HEIGHT_DP), 1, null), null, null, null, 0, false, 2, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 318, null);
            AbstractC5607a title = shopAndScanCouponDecorator.getTitle();
            int i13 = AbstractC5607a.f45514b;
            String strA = C6408b.a(title, composer, i13);
            int i14 = LocalThemeScope.f15770g;
            int i15 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, strA, null, composer, i14 | (i15 << 3), 4);
            C17988z0.a(C16190d.c(com.meijer.mobile.shopandscan.b.f116758d, composer, 0), null, T0.k.a(T0.a.a(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(10), 0.0f, 0.0f, 0.0f, 14, null), C17890L.f167124a.d(composer, C17890L.f167125b)), I.f(z1Var)), localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 0);
            composer.v();
            C14802K.a(InterfaceC14800I.b(c14801j, companion2, 0.75f, false, 2, null), composer, 0);
            if (shopAndScanCouponDecorator.getIsClipped()) {
                composer.startReplaceGroup(-250067111);
                Modifier modifierD = androidx.compose.foundation.b.d(InterfaceC14800I.b(c14801j, androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(companion2, H1.h.p(32)), H1.h.p(76)), 1.0f, false, 2, null), localThemeScope2.getAdsColors().getAdsColorsEnabled02().getColor(), null, 2, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function0);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: eq.G
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I.a.d(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierD2 = ClickableKt.d(modifierD, false, null, null, (Function0) objB, 7, null);
                MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.b(), companion3.i(), composer, 54);
                int iA4 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierD2);
                Function0<InterfaceC5811g> function0A4 = companion4.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A4);
                } else {
                    composer.s();
                }
                Composer composerA4 = D1.a(composer);
                D1.c(composerA4, measurePolicyB3, companion4.e());
                D1.c(composerA4, interfaceC5742sR4, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion4.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion4.f());
                C17988z0.a(C16190d.c(com.meijer.mobile.shopandscan.b.f116759e, composer, 0), null, null, 0L, composer, 48, 12);
                composer2 = composer;
                localThemeScope = localThemeScope2;
                ri.j.h(localThemeScope, new q1.Label(null, null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 375, null), C16193g.c(com.meijer.mobile.shopandscan.e.f116981j, composer2, 0), null, composer2, i14 | (i15 << 3), 4);
                composer2.v();
                composer2.P();
                companion = companion2;
                i11 = 0;
            } else {
                composer.startReplaceGroup(-248890878);
                Modifier modifierB = InterfaceC14800I.b(c14801j, companion2, 1.0f, false, 2, null);
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function0);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: eq.H
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I.a.e(function0);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                Modifier modifierD3 = ClickableKt.d(modifierB, false, null, null, (Function0) objB2, 7, null);
                MeasurePolicy measurePolicyG = C5662h.g(companion3.e(), false);
                int iA5 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR5 = composer.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierD3);
                Function0<InterfaceC5811g> function0A5 = companion4.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A5);
                } else {
                    composer.s();
                }
                Composer composerA5 = D1.a(composer);
                D1.c(composerA5, measurePolicyG, companion4.e());
                D1.c(composerA5, interfaceC5742sR5, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion4.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                D1.c(composerA5, modifierE5, companion4.f());
                C5664j c5664j = C5664j.f48612a;
                i11 = 0;
                companion = companion2;
                C13457y.a(C16190d.c(com.meijer.mobile.shopandscan.b.f116756b, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
                composer2 = composer;
                localThemeScope = localThemeScope2;
                ri.j.h(localThemeScope, new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorBrandPrimary(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 373, null), C16193g.c(com.meijer.mobile.shopandscan.e.f116978i, composer2, 0), null, composer2, i14 | (i15 << 3), 4);
                composer2.v();
                composer2.P();
            }
            composer2.v();
            composer2.startReplaceGroup(1408187948);
            if (I.d(interfaceC5730l0)) {
                Modifier modifierK2 = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), 0.0f, H1.h.p(f10), 1, null);
                MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion3.l(), composer2, i11);
                int iA6 = C5717f.a(composer2, i11);
                InterfaceC5742s interfaceC5742sR6 = composer2.r();
                Modifier modifierE6 = androidx.compose.ui.b.e(composer2, modifierK2);
                Function0<InterfaceC5811g> function0A6 = companion4.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A6);
                } else {
                    composer2.s();
                }
                Composer composerA6 = D1.a(composer2);
                D1.c(composerA6, measurePolicyB4, companion4.e());
                D1.c(composerA6, interfaceC5742sR6, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B6 = companion4.b();
                if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                    composerA6.t(Integer.valueOf(iA6));
                    composerA6.n(Integer.valueOf(iA6), function2B6);
                }
                D1.c(composerA6, modifierE6, companion4.f());
                String imageUrl = shopAndScanCouponDecorator.getImageUrl();
                composer2.startReplaceGroup(1989265983);
                if (imageUrl == null) {
                    unit = null;
                } else {
                    float f11 = 80;
                    M.b(localThemeScope, androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f11)), H1.h.p(f11)), imageUrl, null, composer2, i14 | 48, 4);
                    unit = Unit.f142422a;
                }
                composer2.P();
                composer2.startReplaceGroup(1989265628);
                if (unit == null) {
                    float f12 = 80;
                    composer3 = composer2;
                    C13927b.b(localThemeScope, T0.e.a(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f12)), H1.h.p(f12)), C16692i.c(H1.h.p(5))), false, composer3, i14, 2);
                    i12 = i14;
                } else {
                    composer3 = composer2;
                    i12 = i14;
                }
                composer3.P();
                Modifier.Companion companion5 = companion;
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion5, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.e(), companion3.k(), composer3, 6);
                int iA7 = C5717f.a(composer3, i11);
                InterfaceC5742s interfaceC5742sR7 = composer3.r();
                Modifier modifierE7 = androidx.compose.ui.b.e(composer3, modifierM2);
                Function0<InterfaceC5811g> function0A7 = companion4.a();
                if (composer3.k() == null) {
                    C5717f.c();
                }
                composer3.F();
                if (composer3.getInserting()) {
                    composer3.I(function0A7);
                } else {
                    composer3.s();
                }
                Composer composerA7 = D1.a(composer3);
                D1.c(composerA7, measurePolicyA2, companion4.e());
                D1.c(composerA7, interfaceC5742sR7, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B7 = companion4.b();
                if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                    composerA7.t(Integer.valueOf(iA7));
                    composerA7.n(Integer.valueOf(iA7), function2B7);
                }
                D1.c(composerA7, modifierE7, companion4.f());
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion5, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), null, null, null, 0, false, 5, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 318, null), C6408b.a(shopAndScanCouponDecorator.getDescription(), composer3, i13), null, composer, i12 | (i15 << 3), 4);
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion5, 0.0f, H1.h.p(6), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null), C6408b.a(shopAndScanCouponDecorator2.getDate(), composer, i13), null, composer, i12 | (i15 << 3), 4);
                composer.v();
                composer.v();
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(ShopAndScanCouponDecorator shopAndScanCouponDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0, z1<Float> z1Var, InterfaceC5730l0<Boolean> interfaceC5730l0, ShopAndScanCouponDecorator shopAndScanCouponDecorator2) {
            this.f129488a = shopAndScanCouponDecorator;
            this.f129489b = localThemeScope;
            this.f129490c = function0;
            this.f129491d = z1Var;
            this.f129492e = interfaceC5730l0;
            this.f129493f = shopAndScanCouponDecorator2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final hq.ShopAndScanCouponDecorator r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.I.c(Ji.M, androidx.compose.ui.Modifier, hq.e, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanCouponDecorator shopAndScanCouponDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, shopAndScanCouponDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final void e(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(InterfaceC5730l0 interfaceC5730l0) {
        e(interfaceC5730l0, !d(interfaceC5730l0));
        return Unit.f142422a;
    }
}
