package Hm;

import F1.j;
import Ji.C;
import Ji.I;
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
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14810b;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16307b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "title", "content", "timerText", "", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f12850a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f12851b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f12852c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f12853d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f12854e;

        a(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3) {
            this.f12850a = localThemeScope;
            this.f12851b = modifier;
            this.f12852c = str;
            this.f12853d = str2;
            this.f12854e = str3;
        }

        public final void a(InterfaceC14810b AdsBox, Composer composer, int i10) {
            Intrinsics.j(AdsBox, "$this$AdsBox");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2140976008, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.ebt.view.EBTPinPadTimerSection.<anonymous> (EBTPinPadTimerSection.kt:65)");
            }
            LocalThemeScope localThemeScope = this.f12850a;
            Modifier modifier = this.f12851b;
            String str = this.f12852c;
            String str2 = this.f12853d;
            String str3 = this.f12854e;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.e eVarG = c5658d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(eVarG, companion2.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            C17917Z.a(J.d(J.z(companion, H1.h.p(6)), 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorSupportWarning().getColor(), 0.0f, 0.0f, composer, 6, 12);
            float f10 = 16;
            float f11 = 18;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.n.f15565d, null, null, null, 0.0f, null, J.z(J.i(D.m(companion, H1.h.p(10), H1.h.p(f10), 0.0f, 0.0f, 12, null), H1.h.p(f11)), H1.h.p(f11)), 62, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            Modifier modifierB = InterfaceC14800I.b(c14801j, modifier, 1.0f, false, 2, null);
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
            I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
            float f12 = 9;
            Modifier modifierM = D.m(companion, H1.h.p(f12), H1.h.p(14), 0.0f, 0.0f, 12, null);
            j.Companion companion4 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(modifierM, null, null, F1.j.h(companion4.f()), 0, false, 0, eight, null, 374, null);
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
            I two = localThemeScope.getAdsTypography().getBodyCompact().getTwo();
            ri.j.h(localThemeScope, new q1.Label(D.m(companion, H1.h.p(f12), H1.h.p(4), 0.0f, H1.h.p(f10), 4, null), null, null, F1.j.h(companion4.f()), F1.t.INSTANCE.a(), false, 2, two, null, 294, null), str2, null, composer, i11 | (i12 << 3), 4);
            composer.v();
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion2.k(), composer, 0);
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
            D1.c(composerA3, measurePolicyA2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            q1.Label label2 = new q1.Label(D.m(companion, H1.h.p(f12), H1.h.p(25), H1.h.p(f10), 0.0f, 8, null), null, null, F1.j.h(companion4.b()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getFour(), null, 374, null);
            if (str3 == null) {
                str3 = "00:00";
            }
            ri.j.h(localThemeScope, label2, str3, null, composer, i11 | (i12 << 3), 4);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
            a(interfaceC14810b, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final java.lang.String r19, final java.lang.String r20, final java.lang.String r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hm.j.b(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, str2, str3, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
