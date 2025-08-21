package In;

import Jn.DailySchedule;
import Jn.StoreHoursPresenter;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import d0.T;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import java.util.List;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LJn/j;", "pharmacyGasStationHours", "", "isNewAddressQualifierEnabled", "", "h", "(LKi/M;Landroidx/compose/ui/Modifier;LJn/j;ZLandroidx/compose/runtime/Composer;II)V", "f", "(LKi/M;Landroidx/compose/ui/Modifier;LJn/j;Landroidx/compose/runtime/Composer;II)V", "d", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: In.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3849l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: In.l$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ StoreHoursPresenter f15162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15163b;

        a(StoreHoursPresenter storeHoursPresenter, LocalThemeScope localThemeScope) {
            this.f15162a = storeHoursPresenter;
            this.f15163b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1101546891, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.LegacyPharmacyGasStationHoursTable.<anonymous>.<anonymous> (PharmacyGasStationHoursTable.kt:89)");
            }
            List<DailySchedule> listA = this.f15162a.a();
            LocalThemeScope localThemeScope = this.f15163b;
            for (DailySchedule dailySchedule : listA) {
                q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
                AbstractC6392a weekdays = dailySchedule.getWeekdays();
                int i11 = AbstractC6392a.f60445b;
                String strA = C13698b.a(weekdays, composer2, i11);
                int i12 = LocalThemeScope.f17314g;
                int i13 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strA, null, composer2, i12 | (i13 << 3), 4);
                C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(10)), composer2, 6);
                si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), C13698b.a(dailySchedule.getTimes(), composer2, i11), null, composer2, i12 | (i13 << 3), 4);
                composer2 = composer;
            }
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

    public static final void d(final LocalThemeScope localThemeScope, Modifier modifier, final StoreHoursPresenter pharmacyGasStationHours, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(pharmacyGasStationHours, "pharmacyGasStationHours");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1068474689);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(pharmacyGasStationHours) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1068474689, i12, -1, "com.meijer.mobile.meijer.activity.store.compose.LegacyPharmacyGasStationHoursTable (PharmacyGasStationHoursTable.kt:85)");
            }
            Modifier modifierB = T.b(modifier3, T.c(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            M.b(null, ComposableLambdaKt.c(1101546891, true, new a(pharmacyGasStationHours, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: In.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C3849l.e(localThemeScope, modifier2, pharmacyGasStationHours, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, StoreHoursPresenter storeHoursPresenter, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, storeHoursPresenter, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r35, androidx.compose.ui.Modifier r36, final Jn.StoreHoursPresenter r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: In.C3849l.f(Ki.M, androidx.compose.ui.Modifier, Jn.j, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, StoreHoursPresenter storeHoursPresenter, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, storeHoursPresenter, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void h(final LocalThemeScope localThemeScope, Modifier modifier, final StoreHoursPresenter pharmacyGasStationHours, boolean z10, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(pharmacyGasStationHours, "pharmacyGasStationHours");
        Composer composerStartRestartGroup = composer.startRestartGroup(-796844124);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(pharmacyGasStationHours) ? 256 : 128;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i14 != 0) {
                z10 = false;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-796844124, i12, -1, "com.meijer.mobile.meijer.activity.store.compose.PharmacyGasStationHoursTable (PharmacyGasStationHoursTable.kt:38)");
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(-498802331);
                f(localThemeScope, modifier3, pharmacyGasStationHours, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | (i12 & 112) | (i12 & 896), 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-498644510);
                d(localThemeScope, modifier3, pharmacyGasStationHours, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | (i12 & 112) | (i12 & 896), 0);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        final boolean z11 = z10;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: In.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C3849l.i(localThemeScope, modifier2, pharmacyGasStationHours, z11, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, StoreHoursPresenter storeHoursPresenter, boolean z10, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, storeHoursPresenter, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
