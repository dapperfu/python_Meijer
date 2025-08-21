package Gs;

import Ki.LocalThemeScope;
import P0.e;
import Ps.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.C6484c;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import j0.C14890K;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import p1.C16335d;
import p1.C16338g;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aK\u0010\r\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "imageUrl", "", "buttonResource", "Lm5/h$a;", "builder", "Lkotlin/Function1;", "LPs/e$e;", "", "onAction", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;ILm5/h$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f13237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15669h.a f13238b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13239c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13240d;

        a(LocalThemeScope localThemeScope, C15669h.a aVar, String str, int i10) {
            this.f13237a = localThemeScope;
            this.f13238b = aVar;
            this.f13239c = str;
            this.f13240d = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(100354341, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdDetail.WeeklyAdDetailFeaturedVideoCard.<anonymous> (WeeklyAdFeaturedVideoCard.kt:61)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, H1.h.p(16));
            LocalThemeScope localThemeScope = this.f13237a;
            C15669h.a aVar = this.f13238b;
            String str = this.f13239c;
            int i11 = this.f13240d;
            C5800d.m mVarH = C5800d.f48779a.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16338g.c(com.meijer.mobile.weeklyad.c.f120251c, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            C14890K.a(J.i(companion, H1.h.p(8)), composer, 6);
            Modifier modifierF = J.f(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorIcon01().getColor(), null, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierF);
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
            C6484c.e(aVar.f(str).e(true).c(), null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), c5806j.g(J.v(companion, H1.h.p(160)), companion2.e()), null, null, null, InterfaceC5926k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
            C13590y.a(C16335d.c(i11, composer, 0), null, c5806j.g(companion, companion2.e()), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final java.lang.String r23, final int r24, final m5.C15669h.a r25, final kotlin.jvm.functions.Function1<? super Ps.e.AbstractC0495e, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gs.p.c(Ki.M, androidx.compose.ui.Modifier, java.lang.String, int, m5.h$a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1) {
        function1.invoke(e.AbstractC0495e.c.f26955a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, C15669h.a aVar, Function1 function1, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, str, i10, aVar, function1, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}
