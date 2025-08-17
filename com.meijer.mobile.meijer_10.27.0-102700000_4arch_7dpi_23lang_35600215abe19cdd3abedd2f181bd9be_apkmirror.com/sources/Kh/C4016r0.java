package Kh;

import Hh.o;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000f²\u0006\u0010\u0010\n\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LHh/o$a;", "viewState", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "b", "(LJi/M;LHh/o$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "lastAction", "", "isLoading", "showEmptyState", "showPrimaryCard", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Kh.r0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4016r0 {
    public static final void b(LocalThemeScope localThemeScope, o.PaymentsCardViewState viewState, Function1<? super Fh.a, Unit> onNavigationRequest, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        final Function1<? super Fh.a, Unit> function1;
        final o.PaymentsCardViewState paymentsCardViewState;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onNavigationRequest, "onNavigationRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(1956928115);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(viewState) : composerStartRestartGroup.D(viewState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onNavigationRequest) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
            paymentsCardViewState = viewState;
            function1 = onNavigationRequest;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1956928115, i11, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.PaymentsOverviewCard (PaymentsOverviewCard.kt:29)");
            }
            if (viewState.getEmptyOrErrorCardMessage() != null) {
                composerStartRestartGroup.startReplaceGroup(-1040391385);
                localThemeScope2 = localThemeScope;
                function1 = onNavigationRequest;
                Nh.e0.i(localThemeScope2, viewState.getEmptyOrErrorCardMessage(), null, function1, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | (AbstractC5607a.f45514b << 3) | ((i11 << 3) & 7168), 2);
                composerStartRestartGroup.P();
                paymentsCardViewState = viewState;
            } else {
                localThemeScope2 = localThemeScope;
                function1 = onNavigationRequest;
                composerStartRestartGroup.startReplaceGroup(-1040219552);
                paymentsCardViewState = viewState;
                Nh.j0.i(localThemeScope2, paymentsCardViewState, null, function1, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | (AbstractC5607a.f45514b << 3) | (i11 & 112) | ((i11 << 3) & 7168), 2);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Kh.q0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4016r0.c(localThemeScope2, paymentsCardViewState, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, o.PaymentsCardViewState paymentsCardViewState, Function1 function1, int i10, Composer composer, int i11) {
        b(localThemeScope, paymentsCardViewState, function1, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
