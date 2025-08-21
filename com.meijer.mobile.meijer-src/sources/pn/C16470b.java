package pn;

import Ci.m;
import Ci.o;
import Ki.LocalThemeScope;
import Ki.Q;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LKi/M;", "", "progressIsVisible", "", "b", "(LKi/M;ZLandroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: pn.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16470b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pn.b$a */
    static final class a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156785a;

        a(LocalThemeScope localThemeScope) {
            this.f156785a = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1458442313, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderdetail.LoadingOrderDetails.<anonymous> (LoadingOrderDetails.kt:23)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            o oVar = o.f4629a;
            m.d(this.f156785a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, final boolean z10, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1405019309);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1405019309, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderdetail.LoadingOrderDetails (LoadingOrderDetails.kt:20)");
            }
            if (z10) {
                Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-1458442313, true, new a(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pn.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16470b.c(localThemeScope, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, boolean z10, int i10, Composer composer, int i11) {
        b(localThemeScope, z10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
