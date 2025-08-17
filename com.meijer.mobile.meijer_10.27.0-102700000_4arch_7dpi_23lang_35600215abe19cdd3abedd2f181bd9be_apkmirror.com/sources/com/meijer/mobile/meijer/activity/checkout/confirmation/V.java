package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import android.widget.TextView;
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
import ck.C6408b;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import j0.C14802K;
import j0.C14815g;
import ji.q1;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;
import r1.C16705m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "", "e", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class V {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    public static final void e(LocalThemeScope localThemeScope, final OrderConfirmationDecorator orderConfirmationDecorator, Composer composer, final int i10) {
        int i11;
        String str;
        int i12;
        boolean z10;
        int i13;
        String str2;
        Modifier.Companion companion;
        ?? r12;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1964296647);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(orderConfirmationDecorator) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1964296647, i11, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationSection (OrderConfirmationSection.kt:43)");
            }
            C5658d.f fVarB = C5658d.f48555a.b();
            e.b bVarG = P0.e.INSTANCE.g();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), localThemeScope2.getAdsSpacing().getFive().getDp(), localThemeScope2.getAdsSpacing().getEight().getDp());
            MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composerStartRestartGroup, 54);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierJ);
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
            Integer imageResourceId = orderConfirmationDecorator != null ? orderConfirmationDecorator.getImageResourceId() : null;
            composerStartRestartGroup.startReplaceGroup(1430403444);
            if (imageResourceId == null) {
                str = null;
            } else {
                int iIntValue = imageResourceId.intValue();
                str = null;
                C13457y.a(C16190d.c(iIntValue, composerStartRestartGroup, 0), C6408b.a(orderConfirmationDecorator.h(), composerStartRestartGroup, AbstractC5607a.f45514b), androidx.compose.foundation.layout.J.F(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(companion2, H1.h.p(208)), H1.h.p(41)), null, false, 3, null), null, null, 0.0f, null, composerStartRestartGroup, 384, BinsView.TOTE_HEIGHT_DP);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.P();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, localThemeScope2.getAdsSpacing().getSeven().getDp()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1430416501);
            if (orderConfirmationDecorator == null) {
                str2 = str;
                i12 = i11;
                i13 = 0;
                companion = companion2;
                z10 = true;
            } else {
                Ji.I iF = ym.t.m(localThemeScope2.getAdsTypography().getHeadings().getFour(), H1.w.i(35)).f(FontWeight.INSTANCE.f());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.Q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return V.h((r1.u) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                i12 = i11;
                z10 = true;
                i13 = 0;
                str2 = str;
                companion = companion2;
                ri.j.h(localThemeScope2, new q1.Label(C16705m.d(companion2, false, (Function1) objB, 1, str), null, null, null, 0, false, 0, iF, null, 382, null), C6408b.a(orderConfirmationDecorator.e(), composerStartRestartGroup, AbstractC5607a.f45514b), null, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | (q1.Label.f140080j << 3), 4);
            }
            composerStartRestartGroup.P();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, i13);
            String orderNumber = orderConfirmationDecorator != null ? orderConfirmationDecorator.getOrderNumber() : str2;
            composerStartRestartGroup.startReplaceGroup(1430433193);
            if (orderNumber == null) {
                r12 = i13;
            } else {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zD = composerStartRestartGroup.D(orderConfirmationDecorator);
                Object objB2 = composerStartRestartGroup.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.S
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return V.f(orderConfirmationDecorator, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                r12 = i13;
                androidx.compose.ui.viewinterop.e.a((Function1) objB2, null, null, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zD2 = composerStartRestartGroup.D(orderConfirmationDecorator);
                Object objB3 = composerStartRestartGroup.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.T
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return V.g(orderConfirmationDecorator, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB3);
                }
                composerStartRestartGroup.P();
                androidx.compose.ui.viewinterop.e.a((Function1) objB3, null, null, composerStartRestartGroup, 0, 6);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1430452423);
            if ((orderConfirmationDecorator == null || orderConfirmationDecorator.getEarlyDelivery() != z10) ? r12 : z10) {
                localThemeScope2 = localThemeScope;
                ri.j.h(localThemeScope2, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 383, null), C16193g.c(com.meijer.mobile.meijer.Y.f99496C3, composerStartRestartGroup, r12), null, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (q1.Label.f140080j << 3), 4);
            } else {
                localThemeScope2 = localThemeScope;
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.U
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return V.i(localThemeScope2, orderConfirmationDecorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView f(OrderConfirmationDecorator orderConfirmationDecorator, Context context) {
        Intrinsics.j(context, "context");
        TextView textView = new TextView(context);
        bk.d.f(textView, orderConfirmationDecorator.s());
        textView.setGravity(1);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView g(OrderConfirmationDecorator orderConfirmationDecorator, Context context) {
        Intrinsics.j(context, "context");
        TextView textView = new TextView(context);
        OrderDetailsPickUpTimeDecorator timeSlot = orderConfirmationDecorator.getTimeSlot();
        bk.d.f(textView, timeSlot != null ? timeSlot.f() : null);
        textView.setGravity(1);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, int i10, Composer composer, int i11) {
        e(localThemeScope, orderConfirmationDecorator, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
