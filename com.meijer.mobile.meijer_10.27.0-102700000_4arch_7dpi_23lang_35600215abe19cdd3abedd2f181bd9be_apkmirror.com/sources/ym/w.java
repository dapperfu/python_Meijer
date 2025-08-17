package ym;

import Ji.I;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator;
import j0.C14802K;
import j0.InterfaceC14814f;
import java.util.Iterator;
import java.util.List;
import ji.q1;
import kotlin.C17917Z;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;
import ym.w;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "cartOrderSummaryDecorator", "Lkotlin/Function0;", "", "onShowExtendedRangeInfoClicked", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/cart/n0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartOrderSummaryDecorator f170773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f170775c;

        a(CartOrderSummaryDecorator cartOrderSummaryDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f170773a = cartOrderSummaryDecorator;
            this.f170774b = localThemeScope;
            this.f170775c = function0;
        }

        public final void b(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            int i11;
            Composer composer2 = composer;
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1839513718, i10, -1, "com.meijer.mobile.meijer.activity.cart.composables.OrderSummaryTotalsContent.<anonymous> (OrderSummaryTotalsContent.kt:38)");
            }
            composer2.startReplaceGroup(-1753839074);
            List<CartOrderSummaryDecorator.PriceDecorator> listB = this.f170773a.b();
            LocalThemeScope localThemeScope = this.f170774b;
            Iterator<T> it = listB.iterator();
            while (true) {
                i11 = 6;
                if (!it.hasNext()) {
                    break;
                }
                CartOrderSummaryDecorator.PriceDecorator priceDecorator = (CartOrderSummaryDecorator.PriceDecorator) it.next();
                I iM = t.m(localThemeScope.getAdsTypography().getBody().getTwo(), H1.w.i(22));
                FontWeight.Companion companion = FontWeight.INSTANCE;
                FontWeight fontWeightF = priceDecorator.getIsLabelSemiBold() ? companion.f() : null;
                if (fontWeightF == null) {
                    fontWeightF = companion.e();
                }
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, iM.f(fontWeightF), null, 383, null);
                AbstractC5607a label2 = priceDecorator.getLabel();
                int i12 = AbstractC5607a.f45514b;
                t.g(localThemeScope, null, label, null, C6408b.a(label2, composer2, i12), C6408b.a(priceDecorator.getValue(), composer2, i12), false, null, composer2, LocalThemeScope.f15770g | (q1.Label.f140080j << 6), 101);
            }
            composer2.P();
            composer2.startReplaceGroup(-1753817908);
            List<CartOrderSummaryDecorator.PriceDecorator> listI = this.f170773a.i();
            LocalThemeScope localThemeScope2 = this.f170774b;
            final Function0<Unit> function0 = this.f170775c;
            for (CartOrderSummaryDecorator.PriceDecorator priceDecorator2 : listI) {
                I iM2 = t.m(localThemeScope2.getAdsTypography().getBody().getTwo(), H1.w.i(22));
                FontWeight.Companion companion2 = FontWeight.INSTANCE;
                FontWeight fontWeightF2 = companion2.f();
                if (!priceDecorator2.getIsLabelSemiBold()) {
                    fontWeightF2 = null;
                }
                if (fontWeightF2 == null) {
                    fontWeightF2 = companion2.e();
                }
                q1.Label label3 = new q1.Label(null, null, null, null, 0, false, 0, iM2.f(fontWeightF2), null, 383, null);
                AbstractC5607a label4 = priceDecorator2.getLabel();
                int i13 = AbstractC5607a.f45514b;
                String strA = C6408b.a(label4, composer2, i13);
                String strA2 = C6408b.a(priceDecorator2.getValue(), composer2, i13);
                boolean isInfoIcon = priceDecorator2.getIsInfoIcon();
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(function0);
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: ym.v
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return w.a.c(function0);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                int i14 = i11;
                t.g(localThemeScope2, null, label3, null, strA, strA2, isInfoIcon, (Function0) objB, composer2, LocalThemeScope.f15770g | (q1.Label.f140080j << i11), 5);
                LocalThemeScope localThemeScope3 = localThemeScope2;
                composer2.startReplaceGroup(-1753796962);
                if (priceDecorator2.getHasDivider()) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    float f10 = 16;
                    C14802K.a(J.i(companion3, H1.h.p(f10)), composer2, i14);
                    C17917Z.a(D.m(companion3, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), localThemeScope3.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 6, 12);
                }
                composer2.P();
                localThemeScope2 = localThemeScope3;
                i11 = i14;
            }
            int i15 = i11;
            composer2.P();
            composer2.startReplaceGroup(-1753785486);
            List<CartOrderSummaryDecorator.PriceDecorator> listK = this.f170773a.k();
            LocalThemeScope localThemeScope4 = this.f170774b;
            composer2.startReplaceGroup(-1753784190);
            for (CartOrderSummaryDecorator.PriceDecorator priceDecorator3 : listK) {
                I iM3 = t.m(localThemeScope4.getAdsTypography().getBody().getTwo(), H1.w.i(22));
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                FontWeight fontWeightF3 = companion4.f();
                if (!priceDecorator3.getIsLabelSemiBold()) {
                    fontWeightF3 = null;
                }
                if (fontWeightF3 == null) {
                    fontWeightF3 = companion4.e();
                }
                q1.Label label5 = new q1.Label(null, null, null, null, 0, false, 0, iM3.f(fontWeightF3), null, 383, null);
                AbstractC5607a label6 = priceDecorator3.getLabel();
                int i16 = AbstractC5607a.f45514b;
                t.g(localThemeScope4, null, label5, null, C6408b.a(label6, composer2, i16), C6408b.a(priceDecorator3.getValue(), composer2, i16), false, null, composer2, LocalThemeScope.f15770g | (q1.Label.f140080j << i15), 101);
                composer2.startReplaceGroup(-1753766596);
                if (priceDecorator3.getHasDivider()) {
                    C14802K.a(J.i(Modifier.INSTANCE, H1.h.p(16)), composer2, i15);
                }
                composer2.P();
            }
            composer2.P();
            Modifier.Companion companion5 = Modifier.INSTANCE;
            float f11 = 16;
            C17917Z.a(D.m(companion5, 0.0f, 0.0f, 0.0f, H1.h.p(f11), 7, null), localThemeScope4.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 6, 12);
            Unit unit = Unit.f142422a;
            composer2.P();
            CartOrderSummaryDecorator.PriceDecorator ebtOveragePrice = this.f170773a.getEbtOveragePrice();
            composer2.startReplaceGroup(-1753755902);
            if (ebtOveragePrice != null) {
                LocalThemeScope localThemeScope5 = this.f170774b;
                I iM4 = t.m(localThemeScope5.getAdsTypography().getBody().getTwo(), H1.w.i(22));
                FontWeight.Companion companion6 = FontWeight.INSTANCE;
                FontWeight fontWeightF4 = companion6.f();
                if (!ebtOveragePrice.getIsLabelSemiBold()) {
                    fontWeightF4 = null;
                }
                if (fontWeightF4 == null) {
                    fontWeightF4 = companion6.e();
                }
                q1.Label label7 = new q1.Label(null, null, null, null, 0, false, 0, iM4.f(fontWeightF4), null, 383, null);
                AbstractC5607a label8 = ebtOveragePrice.getLabel();
                int i17 = AbstractC5607a.f45514b;
                t.g(localThemeScope5, null, label7, null, C6408b.a(label8, composer2, i17), C6408b.a(ebtOveragePrice.getValue(), composer2, i17), false, null, composer2, LocalThemeScope.f15770g | (q1.Label.f140080j << i15), 101);
                C14802K.a(J.i(companion5, H1.h.p(f11)), composer2, i15);
                C17917Z.a(D.m(companion5, 0.0f, 0.0f, 0.0f, H1.h.p(f11), 7, null), localThemeScope5.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
                composer2 = composer;
            }
            composer2.P();
            CartOrderSummaryDecorator.PriceDecorator estimatedPrice = this.f170773a.getEstimatedPrice();
            LocalThemeScope localThemeScope6 = this.f170774b;
            q1.Label label9 = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope6.getAdsTypography().getHeadings().getSix().f(FontWeight.INSTANCE.a()), null, 383, null);
            AbstractC5607a label10 = estimatedPrice.getLabel();
            int i18 = AbstractC5607a.f45514b;
            t.g(localThemeScope6, null, label9, null, C6408b.a(label10, composer2, i18), C6408b.a(estimatedPrice.getValue(), composer2, i18), false, null, composer2, LocalThemeScope.f15770g | (q1.Label.f140080j << i15), 101);
            C14802K.a(J.i(companion5, H1.h.p(f11)), composer2, i15);
            C17917Z.a(D.m(companion5, 0.0f, 0.0f, 0.0f, H1.h.p(f11), 7, null), localThemeScope6.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            b(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final CartOrderSummaryDecorator cartOrderSummaryDecorator, final Function0<Unit> onShowExtendedRangeInfoClicked, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(cartOrderSummaryDecorator, "cartOrderSummaryDecorator");
        Intrinsics.j(onShowExtendedRangeInfoClicked, "onShowExtendedRangeInfoClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(406619520);
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
            i12 |= composerStartRestartGroup.D(cartOrderSummaryDecorator) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onShowExtendedRangeInfoClicked) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(406619520, i12, -1, "com.meijer.mobile.meijer.activity.cart.composables.OrderSummaryTotalsContent (OrderSummaryTotalsContent.kt:32)");
            }
            C16088n.e(localThemeScope, new q1.Column(modifier3, null, null, 6, null), ComposableLambdaKt.c(1839513718, true, new a(cartOrderSummaryDecorator, localThemeScope, onShowExtendedRangeInfoClicked), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i12 & 14) | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ym.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.c(localThemeScope, modifier2, cartOrderSummaryDecorator, onShowExtendedRangeInfoClicked, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, CartOrderSummaryDecorator cartOrderSummaryDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, cartOrderSummaryDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
