package Si;

import H1.h;
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
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import si.j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "name", "iteration", "description", "Lkotlin/Function0;", "", "content", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f34605a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34606b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f34607c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f34608d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f34609e;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, String str, String str2, String str3, Function2<? super Composer, ? super Integer, Unit> function2) {
            this.f34605a = localThemeScope;
            this.f34606b = str;
            this.f34607c = str2;
            this.f34608d = str3;
            this.f34609e = function2;
        }

        public final void a(Composer composer, int i10) {
            LocalThemeScope localThemeScope;
            int i11;
            int i12;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(107682563, i10, -1, "com.meijer.mobile.androidacres.showcase.showcase_templates.ShowcaseContentCard.<anonymous> (ContentCard.kt:38)");
            }
            e.Companion companion = e.INSTANCE;
            e.b bVarK = companion.k();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierH = J.h(D.l(companion2, this.f34605a.getAdsSpacing().getThree().getDp(), this.f34605a.getAdsSpacing().getThree().getDp(), this.f34605a.getAdsSpacing().getThree().getDp(), this.f34605a.getAdsSpacing().getSeven().getDp()), 0.0f, 1, null);
            LocalThemeScope localThemeScope2 = this.f34605a;
            String str = this.f34606b;
            String str2 = this.f34607c;
            String str3 = this.f34608d;
            Function2<Composer, Integer, Unit> function2 = this.f34609e;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), bVarK, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierH2 = J.h(D.l(companion2, localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getTwo().getDp()), 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.e(), companion.l(), composer, 6);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH2);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            j.h(localThemeScope2, new q1.Label(InterfaceC14888I.b(c14889j, companion2, 0.9f, false, 2, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getEight(), null, 382, null), str2, null, composer, 0, 4);
            C14890K.a(J.z(companion2, h.p(8)), composer, 6);
            j.h(localThemeScope2, new q1.Label(InterfaceC14888I.b(c14889j, companion2, 0.1f, false, 2, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 382, null), 'v' + str3, null, composer, 0, 4);
            composer.v();
            composer.startReplaceGroup(-1217325722);
            if (StringsKt.s0(str)) {
                localThemeScope = localThemeScope2;
                i11 = 1;
                i12 = 0;
            } else {
                i11 = 1;
                Modifier modifierH3 = J.h(D.l(companion2, localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getTwo().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp()), 0.0f, 1, null);
                MeasurePolicy measurePolicyB2 = G.b(c5800d.g(), companion.l(), composer, 6);
                i12 = 0;
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH3);
                Function0<InterfaceC5953g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = D1.a(composer);
                D1.c(composerA3, measurePolicyB2, companion3.e());
                D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                j.h(localThemeScope2, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 383, null), str, null, composer, 0, 4);
                localThemeScope = localThemeScope2;
                composer.v();
            }
            composer.P();
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            Modifier modifierI = D.i(J.h(companion2, 0.0f, i11, null), localThemeScope.getAdsSpacing().getThree().getDp());
            MeasurePolicy measurePolicyB3 = G.b(c5800d.g(), companion.l(), composer, i12);
            int iA4 = C5859f.a(composer, i12);
            InterfaceC5884s interfaceC5884sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierI);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyB3, companion3.e());
            D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.h() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            function2.invoke(composer, Integer.valueOf(i12));
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r20, androidx.compose.ui.Modifier r21, final java.lang.String r22, final java.lang.String r23, java.lang.String r24, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Si.b.b(Ki.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, Function2 function2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, str2, str3, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
