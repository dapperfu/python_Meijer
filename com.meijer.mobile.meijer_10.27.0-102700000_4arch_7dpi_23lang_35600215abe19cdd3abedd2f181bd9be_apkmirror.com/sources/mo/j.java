package mo;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextStyle;
import com.meijer.mobile.mperks.ux.j0;
import g6.C14209i;
import k6.InterfaceC15105h;
import k6.InterfaceC15108k;
import kotlin.C18143m;
import kotlin.C18147q;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15858r0;
import ni.P0;
import p1.C16193g;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u000f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001c²\u0006\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "userFirstName", "balance", "", "animatePoints", "isDashboardSimplifiedUIEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "", "onCalculateExpandedPointsBannerHeight", "Lkotlin/Function0;", "onViewMPerksHistoryClicked", "j", "(LJi/M;Ljava/lang/String;Ljava/lang/String;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "u", "(LJi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LH1/h;", "a", "F", "expandedPointsBannerHeight", "Lg6/i;", "composition", "progress", "lastAction", "isDashboardSimplifiedUI", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final float f150294a = H1.h.p(210);

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r51, final java.lang.String r52, final java.lang.String r53, final boolean r54, final boolean r55, androidx.compose.ui.Modifier r56, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r57, final kotlin.jvm.functions.Function0<kotlin.Unit> r58, androidx.compose.runtime.Composer r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 2741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo.j.j(Ji.M, java.lang.String, java.lang.String, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(float f10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        function1.invoke(Float.valueOf((int) (coordinates.c() & 4294967295L)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.H0(semantics, true);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle p() {
        return new TextStyle(0L, H1.w.i(60), FontWeight.INSTANCE.a(), null, null, C18143m.a(C18147q.b(Bj.j.f2803a, null, 0, 0, 14, null)), null, 0L, null, null, null, 0L, null, null, null, 0, 0, H1.w.i(20), null, null, null, 0, 0, null, 16646105, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, String str, String str2, boolean z10, boolean z11, Modifier modifier, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, str, str2, z10, z11, modifier, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.H0(semantics, true);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        function1.invoke(Float.valueOf((int) (coordinates.c() & 4294967295L)));
        return Unit.f142422a;
    }

    private static final void u(final LocalThemeScope localThemeScope, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1461795431);
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
                ComposerKt.U(1461795431, i11, -1, "com.meijer.mobile.mperks.ux.dashboard.ViewMperksHistoryButton (ExpandedPointsBalanceLayout.kt:282)");
            }
            P0.k(localThemeScope, C15858r0.f151785a, C16193g.c(j0.f114240n2, composerStartRestartGroup, 0), function0, null, null, false, 0L, false, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | (C15858r0.f151786b << 3) | ((i11 << 6) & 7168), 248);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mo.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j.v(localThemeScope, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        u(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(InterfaceC15105h interfaceC15105h) {
        return r(interfaceC15105h);
    }

    private static final C14209i o(InterfaceC15108k interfaceC15108k) {
        return interfaceC15108k.getValue();
    }

    private static final float r(InterfaceC15105h interfaceC15105h) {
        return interfaceC15105h.getValue().floatValue();
    }
}
