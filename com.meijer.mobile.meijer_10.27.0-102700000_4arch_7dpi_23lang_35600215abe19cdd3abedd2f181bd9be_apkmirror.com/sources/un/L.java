package un;

import Ji.LocalThemeScope;
import P0.e;
import V0.F1;
import X0.Stroke;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6407a;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.Y;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13443j;
import d0.C13457y;
import j0.C14802K;
import j0.C14815g;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15872y0;
import ni.P0;
import p1.C16190d;
import p1.C16193g;
import r0.C16692i;
import un.L;
import xn.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lxn/e$c;", "viewState", "Lkotlin/Function1;", "Lxn/e$a;", "", "onAction", "g", "(LJi/M;Landroidx/compose/ui/Modifier;Lxn/e$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "d", "(LJi/M;Landroidx/compose/ui/Modifier;Lxn/e$c;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class L {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f163124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<e.a, Unit> f163125b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e.ViewState f163126c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super e.a, Unit> function1, e.ViewState viewState) {
            this.f163124a = localThemeScope;
            this.f163125b = function1;
            this.f163126c = viewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(e.a.b.f169758a);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(666497063, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.InProgressPrimaryViewCard.<anonymous> (InProgressPrimaryViewCard.kt:73)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10), 0.0f, 2, null);
            e.Companion companion2 = P0.e.INSTANCE;
            e.b bVarG = companion2.g();
            LocalThemeScope localThemeScope = this.f163124a;
            final Function1<e.a, Unit> function1 = this.f163125b;
            e.ViewState viewState = this.f163126c;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), bVarG, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
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
            D1.c(composerA2, measurePolicyG, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            Modifier modifierG = c5664j.g(androidx.compose.foundation.layout.J.v(companion, H1.h.p(195)), companion2.e());
            int i11 = LocalThemeScope.f15770g;
            L.d(localThemeScope, modifierG, viewState, composer, i11, 0);
            float f11 = 10;
            Modifier modifierG2 = c5664j.g(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.b.d(T0.e.a(companion, C16692i.f()), localThemeScope.getAdsColors().getAdsColorHoverTransparent().getColor(), null, 2, null), H1.h.p(f11)), companion2.e());
            MeasurePolicy measurePolicyG2 = C5662h.g(companion2.o(), false);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierG2);
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
            D1.c(composerA3, measurePolicyG2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C13457y.a(C16190d.c(S.f98716c0, composer, 0), null, androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.v(companion, H1.h.p(BinsView.TOTE_WIDTH_DP)), H1.h.p(f11)), null, InterfaceC5784k.INSTANCE.f(), 0.0f, null, composer, 25008, 104);
            composer.v();
            composer.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
            String strC = C16193g.c(Y.f100176l8, composer, 0);
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            ri.j.g(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 373, null), C6407a.a(Y.f99977b8, composer, 0), null, null, composer, i11 | (i12 << 3), 12);
            C15872y0 c15872y0 = C15872y0.f151823a;
            String strC2 = C16193g.c(Y.f99509Cg, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function1);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: un.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return L.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            P0.k(localThemeScope, c15872y0, strC2, (Function0) objB, null, null, false, 0L, false, composer, i11 | (C15872y0.f151824b << 3), 248);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, e.ViewState viewState, X0.f Canvas) {
        Intrinsics.j(Canvas, "$this$Canvas");
        X0.f.f1(Canvas, localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0L, 0.8f, new Stroke(18.0f, 0.0f, 0, 0, null, 30, null), null, 0, 102, null);
        X0.f.k1(Canvas, localThemeScope.getAdsColors().getAdsColorSupportSuccess().getColor(), 0.0f, viewState.b(), false, 0L, Canvas.b(), 0.8f, new Stroke(18.0f, 0.0f, F1.INSTANCE.b(), 0, null, 26, null), null, 0, 784, null);
        double dB = viewState.b() - 90.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.b() >> 32)) / 2;
        double d10 = fIntBitsToFloat;
        float f10 = (-((float) (Math.sin(Math.toRadians(dB)) * d10))) + fIntBitsToFloat;
        float fCos = ((float) (d10 * Math.cos(Math.toRadians(dB)))) + fIntBitsToFloat;
        X0.f.f1(Canvas, localThemeScope.getAdsColors().getAdsColorSupportSuccess().getColor(), 20.0f, U0.f.e((Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(fCos))), 0.0f, null, null, 0, BinsView.TOTE_HEIGHT_DP, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, e.ViewState viewState, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, viewState, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final xn.e.ViewState r20, final kotlin.jvm.functions.Function1<? super xn.e.a, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un.L.g(Ji.M, androidx.compose.ui.Modifier, xn.e$c, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, e.ViewState viewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, viewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final LocalThemeScope localThemeScope, Modifier modifier, final e.ViewState viewState, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1571031795);
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
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(viewState)) {
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
                ComposerKt.U(1571031795, i12, -1, "com.meijer.mobile.meijer.activity.rewards.compose.InProgressGauge (InProgressPrimaryViewCard.kt:141)");
            }
            Modifier modifierA = T0.k.a(modifier, -90.0f);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i12 & 14) != 4 && ((i12 & 8) == 0 || !composerStartRestartGroup.D(localThemeScope))) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean zD2 = z10 | composerStartRestartGroup.D(viewState);
            Object objB = composerStartRestartGroup.B();
            if (zD2 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: un.I
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return L.e(localThemeScope, viewState, (X0.f) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C13443j.a(modifierA, (Function1) objB, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: un.J
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return L.f(localThemeScope, modifier2, viewState, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
