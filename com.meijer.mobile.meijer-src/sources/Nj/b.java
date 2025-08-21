package Nj;

import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.AnnotatedString;
import d0.C13590y;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import si.j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/AnnotatedString;", "text", "", "illustration", "", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;ILandroidx/compose/runtime/Composer;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21002a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21003b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f21004c;

        a(LocalThemeScope localThemeScope, int i10, AnnotatedString annotatedString) {
            this.f21002a = localThemeScope;
            this.f21003b = i10;
            this.f21004c = annotatedString;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1936726071, i10, -1, "com.meijer.mobile.core.design.compose.widgets.callout.CalloutView.<anonymous> (CalloutView.kt:45)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(companion, this.f21002a.getAdsColors().getAdsColorSupportInformationalBg().getColor(), null, 2, null);
            C5800d c5800d = C5800d.f48779a;
            C5800d.f fVarB = c5800d.b();
            LocalThemeScope localThemeScope = this.f21002a;
            int i11 = this.f21003b;
            AnnotatedString annotatedString = this.f21004c;
            e.Companion companion2 = e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(fVarB, companion2.k(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
            Modifier modifierD2 = androidx.compose.foundation.b.d(J.h(D.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorSupportInformationalBg().getColor(), null, 2, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.g(), companion2.i(), composer, 48);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierD2);
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
            C13590y.a(C16335d.c(i11, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
            C14890K.a(D.m(companion, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null), composer, 0);
            j.g(localThemeScope, q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 383, null), c14889j.d(companion, companion2.i()), null, null, null, 0, false, 0, null, null, 510, null), annotatedString, null, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 12);
            composer.v();
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final androidx.compose.ui.text.AnnotatedString r21, int r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nj.b.b(Ki.M, androidx.compose.ui.Modifier, androidx.compose.ui.text.AnnotatedString, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, AnnotatedString annotatedString, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, annotatedString, i10, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}
