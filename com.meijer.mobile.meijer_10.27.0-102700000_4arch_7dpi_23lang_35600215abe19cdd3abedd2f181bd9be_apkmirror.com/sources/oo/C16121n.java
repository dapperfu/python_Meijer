package oo;

import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import bo.EarnReward;
import bo.g;
import bo.h;
import com.meijer.mobile.mperks.ux.j0;
import j0.C14815g;
import java.util.List;
import kotlin.C15444k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import no.MccEnrollmentState;
import p1.C16193g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a[\u0010\u0014\u001a\u00020\t*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LJi/M;", "Loo/o;", "earnAvailableViewState", "Lno/c;", "mccEnrollmentState", "", "isDashboardSimplifiedUIEnabled", "Lkotlin/Function1;", "Lbo/g;", "", "onNavigationRequest", "Lbo/h;", "onResourceAction", "h", "(LJi/M;Loo/o;Lno/c;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "Lbo/f;", "availableRewards", "Landroidx/compose/ui/Modifier;", "modifier", "j", "(LJi/M;Ljava/util/List;Lno/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "f", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: oo.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16121n {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.C16121n.f(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void h(final LocalThemeScope localThemeScope, final EarnAvailableViewState earnAvailableViewState, final MccEnrollmentState mccEnrollmentState, final boolean z10, final Function1<? super bo.g, Unit> onNavigationRequest, final Function1<? super bo.h, Unit> onResourceAction, Composer composer, final int i10) {
        int i11;
        Modifier.Companion companion;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(earnAvailableViewState, "earnAvailableViewState");
        Intrinsics.j(mccEnrollmentState, "mccEnrollmentState");
        Intrinsics.j(onNavigationRequest, "onNavigationRequest");
        Intrinsics.j(onResourceAction, "onResourceAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(715712243);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(earnAvailableViewState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(mccEnrollmentState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onNavigationRequest) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onResourceAction) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((74899 & i12) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(715712243, i12, -1, "com.meijer.mobile.mperks.ux.earn.EarnAvailablePillView (EarnAvailablePillView.kt:63)");
            }
            if (earnAvailableViewState.getIsError()) {
                composerStartRestartGroup.startReplaceGroup(1566149622);
                if (z10) {
                    composerStartRestartGroup.startReplaceGroup(1566195409);
                    C15444k.b(localThemeScope, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), j0.f114210g0, z10, composerStartRestartGroup, LocalThemeScope.f15770g | 48 | (i12 & 14) | (i12 & 7168), 0);
                    composerStartRestartGroup.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1566477974);
                    f(localThemeScope, null, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14), 1);
                    composerStartRestartGroup.P();
                }
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(1566593573);
                List<EarnReward> listC = earnAvailableViewState.c();
                onResourceAction.invoke(new h.TrackEarnPillState(bo.e.f60516c));
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
                int iA = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion2);
                InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion3.a();
                if (composerStartRestartGroup.k() == null) {
                    C5717f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA = D1.a(composerStartRestartGroup);
                D1.c(composerA, measurePolicyA, companion3.e());
                D1.c(composerA, interfaceC5742sR, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                composerStartRestartGroup.startReplaceGroup(-1335618244);
                if (listC.isEmpty()) {
                    companion = companion2;
                } else {
                    companion = companion2;
                    C16131y.c(localThemeScope, C16193g.d(j0.f114263u, new Object[]{Integer.valueOf(listC.size())}, composerStartRestartGroup, 0), C16193g.c(j0.f114222j0, composerStartRestartGroup, 0), androidx.compose.foundation.layout.D.k(companion2, 0.0f, H1.h.p(16), 1, null), composerStartRestartGroup, LocalThemeScope.f15770g | 3072 | (i12 & 14), 0);
                }
                composerStartRestartGroup.P();
                j(localThemeScope, listC, mccEnrollmentState, androidx.compose.foundation.layout.D.k(companion, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 1, null), onNavigationRequest, onResourceAction, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (i12 & 896) | (57344 & i12) | (458752 & i12), 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.v();
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: oo.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16121n.i(localThemeScope, earnAvailableViewState, mccEnrollmentState, z10, onNavigationRequest, onResourceAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, EarnAvailableViewState earnAvailableViewState, MccEnrollmentState mccEnrollmentState, boolean z10, Function1 function1, Function1 function12, int i10, Composer composer, int i11) {
        h(localThemeScope, earnAvailableViewState, mccEnrollmentState, z10, function1, function12, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r22, final java.util.List<bo.EarnReward> r23, final no.MccEnrollmentState r24, androidx.compose.ui.Modifier r25, final kotlin.jvm.functions.Function1<? super bo.g, kotlin.Unit> r26, final kotlin.jvm.functions.Function1<? super bo.h, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.C16121n.j(Ji.M, java.util.List, no.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1) {
        function1.invoke(g.a.f60544a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, List list, MccEnrollmentState mccEnrollmentState, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, list, mccEnrollmentState, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1) {
        function1.invoke(g.a.f60544a);
        return Unit.f142422a;
    }
}
