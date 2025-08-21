package eq;

import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import dk.C13698b;
import eq.I;
import fq.C14052b;
import hq.ShopAndScanCouponDecorator;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.q1;
import kotlin.C17956L;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;
import r0.C16806i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhq/e;", "decorator", "Lkotlin/Function0;", "", "onCouponAction", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lhq/e;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "expandedState", "", "rotationState", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class I {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ShopAndScanCouponDecorator f130329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f130331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1<Float> f130332d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f130333e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ShopAndScanCouponDecorator f130334f;

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
            ShopAndScanCouponDecorator shopAndScanCouponDecorator = this.f130329a;
            LocalThemeScope localThemeScope2 = this.f130330b;
            final Function0<Unit> function0 = this.f130331c;
            z1<Float> z1Var = this.f130332d;
            InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f130333e;
            ShopAndScanCouponDecorator shopAndScanCouponDecorator2 = this.f130334f;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            float f10 = 8;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), 0.0f, H1.h.p(f10), 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion3.i(), composer, 48);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK);
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
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, H1.h.p(4), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion3.i(), composer, 48);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM);
            Function0<InterfaceC5953g> function0A3 = companion4.a();
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
            D1.c(composerA3, measurePolicyB2, companion4.e());
            D1.c(composerA3, interfaceC5884sR3, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion4.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion4.f());
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.J.B(companion2, 0.0f, H1.h.p(BinsView.TOTE_HEIGHT_DP), 1, null), null, null, null, 0, false, 2, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 318, null);
            AbstractC6392a title = shopAndScanCouponDecorator.getTitle();
            int i13 = AbstractC6392a.f60445b;
            String strA = C13698b.a(title, composer, i13);
            int i14 = LocalThemeScope.f17314g;
            int i15 = q1.Label.f142335j;
            si.j.h(localThemeScope2, label, strA, null, composer, i14 | (i15 << 3), 4);
            C18054z0.a(C16335d.c(com.meijer.mobile.shopandscan.b.f117703d, composer, 0), null, T0.k.a(T0.a.a(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(10), 0.0f, 0.0f, 0.0f, 14, null), C17956L.f168212a.d(composer, C17956L.f168213b)), I.f(z1Var)), localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 0);
            composer.v();
            C14890K.a(InterfaceC14888I.b(c14889j, companion2, 0.75f, false, 2, null), composer, 0);
            if (shopAndScanCouponDecorator.getIsClipped()) {
                composer.startReplaceGroup(-250067111);
                Modifier modifierD = androidx.compose.foundation.b.d(InterfaceC14888I.b(c14889j, androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(companion2, H1.h.p(32)), H1.h.p(76)), 1.0f, false, 2, null), localThemeScope2.getAdsColors().getAdsColorsEnabled02().getColor(), null, 2, null);
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
                MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.b(), companion3.i(), composer, 54);
                int iA4 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR4 = composer.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierD2);
                Function0<InterfaceC5953g> function0A4 = companion4.a();
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
                D1.c(composerA4, measurePolicyB3, companion4.e());
                D1.c(composerA4, interfaceC5884sR4, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion4.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion4.f());
                C18054z0.a(C16335d.c(com.meijer.mobile.shopandscan.b.f117704e, composer, 0), null, null, 0L, composer, 48, 12);
                composer2 = composer;
                localThemeScope = localThemeScope2;
                si.j.h(localThemeScope, new q1.Label(null, null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 375, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117926j, composer2, 0), null, composer2, i14 | (i15 << 3), 4);
                composer2.v();
                composer2.P();
                companion = companion2;
                i11 = 0;
            } else {
                composer.startReplaceGroup(-248890878);
                Modifier modifierB = InterfaceC14888I.b(c14889j, companion2, 1.0f, false, 2, null);
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
                MeasurePolicy measurePolicyG = C5804h.g(companion3.e(), false);
                int iA5 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR5 = composer.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierD3);
                Function0<InterfaceC5953g> function0A5 = companion4.a();
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
                D1.c(composerA5, measurePolicyG, companion4.e());
                D1.c(composerA5, interfaceC5884sR5, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion4.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                D1.c(composerA5, modifierE5, companion4.f());
                C5806j c5806j = C5806j.f48836a;
                i11 = 0;
                companion = companion2;
                C13590y.a(C16335d.c(com.meijer.mobile.shopandscan.b.f117701b, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
                composer2 = composer;
                localThemeScope = localThemeScope2;
                si.j.h(localThemeScope, new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorBrandPrimary(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 373, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117923i, composer2, 0), null, composer2, i14 | (i15 << 3), 4);
                composer2.v();
                composer2.P();
            }
            composer2.v();
            composer2.startReplaceGroup(1408187948);
            if (I.d(interfaceC5872l0)) {
                Modifier modifierK2 = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), 0.0f, H1.h.p(f10), 1, null);
                MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion3.l(), composer2, i11);
                int iA6 = C5859f.a(composer2, i11);
                InterfaceC5884s interfaceC5884sR6 = composer2.r();
                Modifier modifierE6 = androidx.compose.ui.b.e(composer2, modifierK2);
                Function0<InterfaceC5953g> function0A6 = companion4.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A6);
                } else {
                    composer2.s();
                }
                Composer composerA6 = D1.a(composer2);
                D1.c(composerA6, measurePolicyB4, companion4.e());
                D1.c(composerA6, interfaceC5884sR6, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B6 = companion4.b();
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
                    unit = Unit.f143329a;
                }
                composer2.P();
                composer2.startReplaceGroup(1989265628);
                if (unit == null) {
                    float f12 = 80;
                    composer3 = composer2;
                    C14052b.b(localThemeScope, T0.e.a(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f12)), H1.h.p(f12)), C16806i.c(H1.h.p(5))), false, composer3, i14, 2);
                    i12 = i14;
                } else {
                    composer3 = composer2;
                    i12 = i14;
                }
                composer3.P();
                Modifier.Companion companion5 = companion;
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion5, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.e(), companion3.k(), composer3, 6);
                int iA7 = C5859f.a(composer3, i11);
                InterfaceC5884s interfaceC5884sR7 = composer3.r();
                Modifier modifierE7 = androidx.compose.ui.b.e(composer3, modifierM2);
                Function0<InterfaceC5953g> function0A7 = companion4.a();
                if (composer3.k() == null) {
                    C5859f.c();
                }
                composer3.F();
                if (composer3.getInserting()) {
                    composer3.I(function0A7);
                } else {
                    composer3.s();
                }
                Composer composerA7 = D1.a(composer3);
                D1.c(composerA7, measurePolicyA2, companion4.e());
                D1.c(composerA7, interfaceC5884sR7, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B7 = companion4.b();
                if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                    composerA7.t(Integer.valueOf(iA7));
                    composerA7.n(Integer.valueOf(iA7), function2B7);
                }
                D1.c(composerA7, modifierE7, companion4.f());
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion5, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), null, null, null, 0, false, 5, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 318, null), C13698b.a(shopAndScanCouponDecorator.getDescription(), composer3, i13), null, composer, i12 | (i15 << 3), 4);
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion5, 0.0f, H1.h.p(6), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null), C13698b.a(shopAndScanCouponDecorator2.getDate(), composer, i13), null, composer, i12 | (i15 << 3), 4);
                composer.v();
                composer.v();
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(ShopAndScanCouponDecorator shopAndScanCouponDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0, z1<Float> z1Var, InterfaceC5872l0<Boolean> interfaceC5872l0, ShopAndScanCouponDecorator shopAndScanCouponDecorator2) {
            this.f130329a = shopAndScanCouponDecorator;
            this.f130330b = localThemeScope;
            this.f130331c = function0;
            this.f130332d = z1Var;
            this.f130333e = interfaceC5872l0;
            this.f130334f = shopAndScanCouponDecorator2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
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
    public static final void c(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final hq.ShopAndScanCouponDecorator r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.I.c(Ki.M, androidx.compose.ui.Modifier, hq.e, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanCouponDecorator shopAndScanCouponDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, shopAndScanCouponDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void e(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(InterfaceC5872l0 interfaceC5872l0) {
        e(interfaceC5872l0, !d(interfaceC5872l0));
        return Unit.f143329a;
    }
}
