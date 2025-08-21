package Jh;

import Jh.y;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14890K;
import j0.C14903g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKi/M;", "", "LJh/y$a;", "rules", "Landroidx/compose/ui/Modifier;", "modifier", "", "c", "(LKi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rule", "e", "(LKi/M;LJh/y$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Jh.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3874p {
    public static final void c(final LocalThemeScope localThemeScope, final List<y.PasswordCriteria> rules, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(rules, "rules");
        Composer composerStartRestartGroup = composer.startRestartGroup(74456249);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(rules) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(74456249, i12, -1, "com.meijer.mobile.accounts.ux.composables.PasswordRules (PasswordRules.kt:30)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            composerStartRestartGroup.startReplaceGroup(-534261114);
            for (y.PasswordCriteria passwordCriteria : rules) {
                e(localThemeScope, passwordCriteria, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14), 2);
                composerStartRestartGroup.startReplaceGroup(-534258861);
                if (Intrinsics.e(passwordCriteria, CollectionsKt.D0(rules))) {
                    C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.P();
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Jh.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C3874p.d(localThemeScope, rules, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, List list, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, list, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e(final Ki.LocalThemeScope r26, Jh.y.PasswordCriteria r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.C3874p.e(Ki.M, Jh.y$a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, y.PasswordCriteria passwordCriteria, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, passwordCriteria, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
