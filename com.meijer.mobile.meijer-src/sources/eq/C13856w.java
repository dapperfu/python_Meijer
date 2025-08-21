package eq;

import Ki.LocalThemeScope;
import P0.e;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
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
import ki.q1;
import kotlin.C18051y;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/Function0;", "", "onClick", "c", "(LKi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: eq.w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13856w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: eq.w$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f130606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130607b;

        a(boolean z10, LocalThemeScope localThemeScope) {
            this.f130606a = z10;
            this.f130607b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-664070810, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.CheckoutButtonComponent.<anonymous> (CheckoutButtonComponent.kt:58)");
            }
            e.c cVarI = P0.e.INSTANCE.i();
            C5800d.f fVarF = C5800d.f48779a.f();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            boolean z10 = this.f130606a;
            LocalThemeScope localThemeScope = this.f130607b;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarF, cVarI, composer, 54);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            Z0.c cVarC = C16335d.c(com.meijer.mobile.shopandscan.b.f117717r, composer, 0);
            Modifier modifierV = androidx.compose.foundation.layout.J.v(companion, H1.h.p(25));
            Ki.z adsColors = localThemeScope.getAdsColors();
            C18054z0.a(cVarC, null, modifierV, (z10 ? adsColors.getAdsColorInverse() : adsColors.getAdsColorText01()).getColor(), composer, 432, 0);
            si.j.h(localThemeScope, z10 ? new q1.Label(null, localThemeScope.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null) : new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117959u, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            composer.v();
            if (!this.f130606a) {
                C18051y.a(T0.e.a(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), C16806i.c(H1.h.p(4))), null, C5489q0.q(this.f130607b.getAdsColors().getAdsColorInverse().getColor(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, H1.h.p(0), C13834D.f130315a.a(), composer, 1769472, 26);
            }
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, final boolean r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.C13856w.c(Ki.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, z10, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
