package Bm;

import Bm.I0;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import j0.InterfaceC14902f;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16196t0;
import p1.C16335d;
import p1.C16338g;
import pi.C16453n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LKi/M;", "Lkotlin/Function0;", "", "onAgreeClicked", "b", "(LKi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f3233b;

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f3232a = localThemeScope;
            this.f3233b = function0;
        }

        public final void b(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsColumn) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1743303402, i11, -1, "com.meijer.mobile.meijer.activity.checkout.composables.TermsAndConditionBottomSheetContent.<anonymous> (TermsAndConditionBottomSheetContent.kt:50)");
            }
            Z0.c cVarC = C16335d.c(com.meijer.mobile.meijer.S.f99588k, composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 12;
            C13590y.a(cVarC, null, AdsColumn.c(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.z(companion, H1.h.p(32)), null, false, 3, null), 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), P0.e.INSTANCE.g()), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
            LocalThemeScope localThemeScope = this.f3232a;
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(f10), 1, null), 0.0f, 1, null), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 374, null);
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100408Eg, composer, 0);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i12 | (i13 << 3), 4);
            C17983Z.a(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(1)), this.f3232a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
            LocalThemeScope localThemeScope2 = this.f3232a;
            float f11 = 16;
            si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f11)), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 382, null), C16338g.c(com.meijer.mobile.meijer.Y.f100485Ig, composer, 0), null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f3232a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f11)), 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f3233b);
            final Function0<Unit> function0 = this.f3233b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Bm.H0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return I0.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C3013x.b(localThemeScope3, modifierH, (Function0) objB, Gk.g.f13088a.f(C16338g.c(yr.Q.f171761b, composer, 0)), true, null, C16196t0.f154256a, false, composer, i12 | 24624 | (C16196t0.f154257b << 18), 80);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            b(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, final Function0<Unit> onAgreeClicked, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onAgreeClicked, "onAgreeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-345486772);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onAgreeClicked) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-345486772, i11, -1, "com.meijer.mobile.meijer.activity.checkout.composables.TermsAndConditionBottomSheetContent (TermsAndConditionBottomSheetContent.kt:44)");
            }
            C16453n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(-1743303402, true, new a(localThemeScope, onAgreeClicked), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bm.G0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I0.c(localThemeScope, onAgreeClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        b(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
