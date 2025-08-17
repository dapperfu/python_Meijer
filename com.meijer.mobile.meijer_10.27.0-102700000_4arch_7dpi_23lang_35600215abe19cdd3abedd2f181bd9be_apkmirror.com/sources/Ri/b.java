package Ri;

import H1.h;
import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ri.j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "name", "iteration", "description", "Lkotlin/Function0;", "", "content", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32249a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32250b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f32251c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f32252d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f32253e;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, String str, String str2, String str3, Function2<? super Composer, ? super Integer, Unit> function2) {
            this.f32249a = localThemeScope;
            this.f32250b = str;
            this.f32251c = str2;
            this.f32252d = str3;
            this.f32253e = function2;
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
            Modifier modifierH = J.h(D.l(companion2, this.f32249a.getAdsSpacing().getThree().getDp(), this.f32249a.getAdsSpacing().getThree().getDp(), this.f32249a.getAdsSpacing().getThree().getDp(), this.f32249a.getAdsSpacing().getSeven().getDp()), 0.0f, 1, null);
            LocalThemeScope localThemeScope2 = this.f32249a;
            String str = this.f32250b;
            String str2 = this.f32251c;
            String str3 = this.f32252d;
            Function2<Composer, Integer, Unit> function2 = this.f32253e;
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarK, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            Modifier modifierH2 = J.h(D.l(companion2, localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getTwo().getDp()), 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5658d.e(), companion.l(), composer, 6);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH2);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            j.h(localThemeScope2, new q1.Label(InterfaceC14800I.b(c14801j, companion2, 0.9f, false, 2, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getEight(), null, 382, null), str2, null, composer, 0, 4);
            C14802K.a(J.z(companion2, h.p(8)), composer, 6);
            j.h(localThemeScope2, new q1.Label(InterfaceC14800I.b(c14801j, companion2, 0.1f, false, 2, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 382, null), 'v' + str3, null, composer, 0, 4);
            composer.v();
            composer.startReplaceGroup(-1217325722);
            if (StringsKt.r0(str)) {
                localThemeScope = localThemeScope2;
                i11 = 1;
                i12 = 0;
            } else {
                i11 = 1;
                Modifier modifierH3 = J.h(D.l(companion2, localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getTwo().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp()), 0.0f, 1, null);
                MeasurePolicy measurePolicyB2 = G.b(c5658d.g(), companion.l(), composer, 6);
                i12 = 0;
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH3);
                Function0<InterfaceC5811g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = D1.a(composer);
                D1.c(composerA3, measurePolicyB2, companion3.e());
                D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
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
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            Modifier modifierI = D.i(J.h(companion2, 0.0f, i11, null), localThemeScope.getAdsSpacing().getThree().getDp());
            MeasurePolicy measurePolicyB3 = G.b(c5658d.g(), companion.l(), composer, i12);
            int iA4 = C5717f.a(composer, i12);
            InterfaceC5742s interfaceC5742sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierI);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyB3, companion3.e());
            D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
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
            return Unit.f142422a;
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
    public static final void b(final Ji.LocalThemeScope r20, androidx.compose.ui.Modifier r21, final java.lang.String r22, final java.lang.String r23, java.lang.String r24, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ri.b.b(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, Function2 function2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, str2, str3, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
