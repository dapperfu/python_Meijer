package Oh;

import Gh.a;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import j0.C14890K;
import j0.C14903g;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00108\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lbk/a;", "headerMessage", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "i", "(LKi/M;Lbk/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "g", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "header", "e", "(LKi/M;Lbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f23935b;

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(241272958, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsEmptyOrErrorCard.<anonymous> (PaymentsEmptyOrErrorCard.kt:64)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f23934a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f23934a;
            AbstractC6392a abstractC6392a = this.f23935b;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            int i11 = LocalThemeScope.f17314g;
            e0.g(localThemeScope, null, composer, i11, 1);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            e0.e(localThemeScope, abstractC6392a, null, composer, i11 | (AbstractC6392a.f60445b << 3), 2);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f23934a = localThemeScope;
            this.f23935b = abstractC6392a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r30, final bk.AbstractC6392a r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.e0.e(Ki.M, bk.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, abstractC6392a, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(Ki.LocalThemeScope r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.e0.g(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r21, final bk.AbstractC6392a r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.e0.i(Ki.M, bk.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1) {
        function1.invoke(new a.Payments(false));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, abstractC6392a, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
