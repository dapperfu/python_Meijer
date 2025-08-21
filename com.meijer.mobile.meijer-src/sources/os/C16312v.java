package os;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16194s0;
import oi.P0;
import p1.C16338g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\b\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\n\u0010\u0007¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onLearnMoreClicked", "k", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "f", "(LKi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "h", "", "lastAction", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: os.v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16312v {
    private static final void f(final LocalThemeScope localThemeScope, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1854170753);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1854170753, i11, -1, "com.meijer.mobile.ui.mperks.homescreen.LearnMoreButton (HomeScreenMperksUnAuth.kt:78)");
            }
            P0.k(localThemeScope, C16194s0.f154251a, C16338g.c(ns.u.f153142F, composerStartRestartGroup, 0), function0, androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), null, false, 0L, false, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | (C16194s0.f154252b << 3) | ((i11 << 6) & 7168), 240);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: os.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16312v.g(localThemeScope, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        f(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r36, androidx.compose.ui.Modifier r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C16312v.h(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r36, androidx.compose.ui.Modifier r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C16312v.k(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
