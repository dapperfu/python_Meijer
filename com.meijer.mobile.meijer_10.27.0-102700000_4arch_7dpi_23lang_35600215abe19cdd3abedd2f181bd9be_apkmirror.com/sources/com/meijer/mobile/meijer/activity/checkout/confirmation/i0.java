package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import android.text.util.Linkify;
import android.util.Patterns;
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
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator;
import j0.C14801J;
import j0.C14815g;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16705m;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "", "isRoktAdEnabled", "", "g", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;ZLandroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$e;", "whatsNextItemDecorator", "j", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$e;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class i0 {
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r34, final com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator r35, boolean r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.i0.g(Ji.M, com.meijer.mobile.meijer.activity.checkout.confirmation.p, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, boolean z10, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, orderConfirmationDecorator, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final void j(final LocalThemeScope localThemeScope, final OrderConfirmationDecorator.WhatsNextItemDecorator whatsNextItemDecorator, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-578302234);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(whatsNextItemDecorator) : composerStartRestartGroup.D(whatsNextItemDecorator) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-578302234, i12, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.WhatsNextItem (OrderConfirmationWhatsNextSection.kt:70)");
            }
            AbstractC5607a stepNumberContentDescription = whatsNextItemDecorator.getStepNumberContentDescription();
            int i13 = AbstractC5607a.f45514b;
            final String strA = C6408b.a(stepNumberContentDescription, composerStartRestartGroup, i13);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10));
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
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
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zV = composerStartRestartGroup.V(strA);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i0.l(strA, (r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Modifier modifierD = C16705m.d(companion, false, (Function1) objB, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i14 = i12 & 14;
            boolean z10 = i14 == 4 || ((i12 & 8) != 0 && composerStartRestartGroup.D(localThemeScope));
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i0.m(localThemeScope, (X0.f) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            ri.j.h(localThemeScope, new q1.Label(androidx.compose.ui.draw.b.b(modifierD, (Function1) objB2), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo().d(localThemeScope.getAdsColors().getAdsColorActiveInverse()), null, 382, null), C6408b.a(whatsNextItemDecorator.getStepNumber(), composerStartRestartGroup, i13), null, composerStartRestartGroup, LocalThemeScope.f15770g | i14 | (q1.Label.f140080j << 3), 4);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z11 = ((i12 & 112) == 32 || ((i12 & 64) != 0 && composerStartRestartGroup.D(whatsNextItemDecorator))) | (i14 == 4 || ((i12 & 8) != 0 && composerStartRestartGroup.D(localThemeScope)));
            Object objB3 = composerStartRestartGroup.B();
            if (z11 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i0.k(whatsNextItemDecorator, localThemeScope, (Context) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            androidx.compose.ui.viewinterop.e.a((Function1) objB3, androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null), null, composerStartRestartGroup, 48, 4);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i0.n(localThemeScope, whatsNextItemDecorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView k(OrderConfirmationDecorator.WhatsNextItemDecorator whatsNextItemDecorator, LocalThemeScope localThemeScope, Context context) {
        Intrinsics.j(context, "context");
        TextView textView = new TextView(context);
        bk.d.f(textView, whatsNextItemDecorator.getInstruction());
        textView.setTextSize(H1.v.h(localThemeScope.getAdsTypography().getBodyCompact().getTwo().getStyle().l()));
        if (whatsNextItemDecorator.getIsUrlIncluded()) {
            Linkify.addLinks(textView, Patterns.PHONE, "sms:", Linkify.sPhoneNumberMatchFilter, Linkify.sPhoneNumberTransformFilter);
            CharSequence text = textView.getText();
            Intrinsics.i(text, "getText(...)");
            textView.setText(Ek.b.a(text));
        }
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, X0.f drawBehind) {
        Intrinsics.j(drawBehind, "$this$drawBehind");
        X0.f.f1(drawBehind, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), U0.k.h(drawBehind.b()), 0L, 0.0f, null, null, 0, 124, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, OrderConfirmationDecorator.WhatsNextItemDecorator whatsNextItemDecorator, int i10, Composer composer, int i11) {
        j(localThemeScope, whatsNextItemDecorator, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
