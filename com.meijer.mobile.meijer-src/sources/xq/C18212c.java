package xq;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import j4.k;
import kotlin.C14678s;
import kotlin.C14680u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yq.C18340b;
import yq.C18341c;
import yq.C18343e;
import yq.C18344f;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LKi/M;", "Li4/u;", "navController", "", "c", "(LKi/M;Li4/u;Landroidx/compose/runtime/Composer;I)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: xq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18212c {
    public static final void c(final LocalThemeScope localThemeScope, final C14680u navController, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(navController, "navController");
        Composer composerStartRestartGroup = composer.startRestartGroup(2109443239);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(navController) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2109443239, i11, -1, "com.meijer.mobile.shopandscan.utils.navigation.NavigationComponent (NavigationComponent.kt:25)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | composerStartRestartGroup.D(navController);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: xq.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18212c.d(localThemeScope, navController, (C14678s) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            k.b(navController, "landing", null, null, null, null, null, null, null, (Function1) objB, composerStartRestartGroup, ((i11 >> 3) & 14) | 48, 508);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: xq.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C18212c.e(localThemeScope, navController, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, C14680u c14680u, C14678s NavHost) {
        Intrinsics.j(NavHost, "$this$NavHost");
        C18341c.a(NavHost, localThemeScope);
        C18344f.a(NavHost, c14680u, localThemeScope);
        C18340b.b(NavHost, c14680u, localThemeScope);
        C18343e.b(NavHost, c14680u, localThemeScope);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, C14680u c14680u, int i10, Composer composer, int i11) {
        c(localThemeScope, c14680u, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
