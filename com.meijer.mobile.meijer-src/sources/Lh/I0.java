package Lh;

import Gh.a;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14890K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16194s0;
import oi.C16200v0;
import p1.C16338g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "i", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "e", "(LKi/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class I0 {
    private static final void e(LocalThemeScope localThemeScope, final Function1<? super Gh.a, Unit> function1, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(-381055638);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-381055638, i11, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.SignInCreateAccountButtons (SignInCreateAccountView.kt:65)");
            }
            C16194s0 c16194s0 = C16194s0.f154251a;
            String strC = C16338g.c(Gh.h.f12788R4, composerStartRestartGroup, 0);
            String strC2 = C16338g.c(Gh.h.f12788R4, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i12 = i11 & 112;
            boolean z10 = i12 == 32;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Lh.F0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return I0.f(function1);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i13 = LocalThemeScope.f17314g;
            int i14 = i11 & 14;
            oi.P0.k(localThemeScope2, c16194s0, strC, (Function0) objB, null, strC2, true, 0L, false, composerStartRestartGroup, i13 | 1572864 | i14 | (C16194s0.f154252b << 3), HttpResponseStatus.SUCCESS_OK);
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(8)), composerStartRestartGroup, 6);
            C16200v0 c16200v0 = C16200v0.f154265a;
            String strC3 = C16338g.c(Cj.o.f5090u, composerStartRestartGroup, 0);
            String strC4 = C16338g.c(Cj.o.f5090u, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = i12 == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: Lh.G0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return I0.g(function1);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            oi.P0.k(localThemeScope2, c16200v0, strC3, (Function0) objB2, null, strC4, true, 0L, false, composerStartRestartGroup, i13 | 1572864 | i14 | (C16200v0.f154266b << 3), HttpResponseStatus.SUCCESS_OK);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Lh.H0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I0.h(localThemeScope2, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1) {
        function1.invoke(a.s.f12623a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1) {
        function1.invoke(a.c.f12605a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Function1 function1, int i10, Composer composer, int i11) {
        e(localThemeScope, function1, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r40, androidx.compose.ui.Modifier r41, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.I0.i(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
