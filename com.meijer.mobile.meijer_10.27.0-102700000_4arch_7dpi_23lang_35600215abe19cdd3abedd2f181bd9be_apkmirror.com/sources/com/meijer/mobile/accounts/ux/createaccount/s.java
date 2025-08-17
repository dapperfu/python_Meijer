package com.meijer.mobile.accounts.ux.createaccount;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import kotlin.C14675s;
import kotlin.C14677u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJi/M;", "Li4/u;", "navController", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "c", "(LJi/M;Li4/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class s {
    public static final void c(final LocalThemeScope localThemeScope, final C14677u navController, final Function1<? super Fh.a, Unit> onNavigationRequest, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(navController, "navController");
        Intrinsics.j(onNavigationRequest, "onNavigationRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-829649541);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(navController) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onNavigationRequest) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-829649541, i11, -1, "com.meijer.mobile.accounts.ux.createaccount.NavigationComponent (NavigationComponent.kt:23)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 896) == 256);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.accounts.ux.createaccount.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.d(localThemeScope, onNavigationRequest, (C14675s) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            j4.k.b(navController, "CreateAccount", null, null, null, null, null, null, null, (Function1) objB, composerStartRestartGroup, ((i11 >> 3) & 14) | 48, 508);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.accounts.ux.createaccount.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s.e(localThemeScope, navController, onNavigationRequest, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Function1 function1, C14675s NavHost) {
        Intrinsics.j(NavHost, "$this$NavHost");
        j.e(NavHost, localThemeScope, function1);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, C14677u c14677u, Function1 function1, int i10, Composer composer, int i11) {
        c(localThemeScope, c14677u, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
