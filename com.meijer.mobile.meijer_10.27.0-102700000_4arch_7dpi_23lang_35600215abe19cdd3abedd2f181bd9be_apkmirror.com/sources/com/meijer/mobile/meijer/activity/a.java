package com.meijer.mobile.meijer.activity;

import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Mn.AbstractC4302x0;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CreditCardChargesDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EbtCardChargesDecorator;
import j0.InterfaceC14814f;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;
import ym.C18258d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aU\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LMn/x0;", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "cartOrderSummaryDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "creditCardChargesDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "ebtCardChargesDecorator", "", "shouldUpdateVisibilityForTipText", "Lkotlin/Function0;", "", "onAdjustAmountClicked", "onShowExtendedRangeInfoClicked", "a", "(LMn/x0;Lcom/meijer/mobile/meijer/activity/cart/n0;Lcom/meijer/mobile/meijer/activity/checkout/review/L1;Lcom/meijer/mobile/meijer/activity/checkout/review/N1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.a$a, reason: collision with other inner class name */
    static final class C1409a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartOrderSummaryDecorator f100985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f100986b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f100987c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f100988d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f100989e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.a$a$a, reason: collision with other inner class name */
        static final class C1410a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CartOrderSummaryDecorator f100990a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f100991b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CreditCardChargesDecorator f100992c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ EbtCardChargesDecorator f100993d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f100994e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.a$a$a$a, reason: collision with other inner class name */
            static final class C1411a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f100995a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CartOrderSummaryDecorator f100996b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f100997c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ CreditCardChargesDecorator f100998d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ EbtCardChargesDecorator f100999e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f101000f;

                C1411a(LocalThemeScope localThemeScope, CartOrderSummaryDecorator cartOrderSummaryDecorator, Function0<Unit> function0, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, Function0<Unit> function02) {
                    this.f100995a = localThemeScope;
                    this.f100996b = cartOrderSummaryDecorator;
                    this.f100997c = function0;
                    this.f100998d = creditCardChargesDecorator;
                    this.f100999e = ebtCardChargesDecorator;
                    this.f101000f = function02;
                }

                public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1186630724, i10, -1, "com.meijer.mobile.meijer.activity.update.<anonymous>.<anonymous>.<anonymous> (CartOrderSummaryBindingExt.kt:34)");
                    }
                    LocalThemeScope localThemeScope = this.f100995a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = J.h(companion, 0.0f, 1, null);
                    CartOrderSummaryDecorator cartOrderSummaryDecorator = this.f100996b;
                    Function0<Unit> function0 = this.f100997c;
                    int i11 = LocalThemeScope.f15770g;
                    ym.w.b(localThemeScope, modifierH, cartOrderSummaryDecorator, function0, composer, i11 | 48, 0);
                    LocalThemeScope localThemeScope2 = this.f100995a;
                    Modifier modifierH2 = J.h(companion, 0.0f, 1, null);
                    CreditCardChargesDecorator creditCardChargesDecorator = this.f100998d;
                    EbtCardChargesDecorator ebtCardChargesDecorator = this.f100999e;
                    Function0<Unit> function02 = this.f101000f;
                    int i12 = AbstractC5607a.f45514b;
                    int i13 = C.g.f15525d;
                    C18258d.d(localThemeScope2, modifierH2, creditCardChargesDecorator, ebtCardChargesDecorator, function02, composer, i11 | 48 | (((((i12 | i13) | i12) | i12) | i12) << 6) | ((i12 | ((i13 | i12) | i12)) << 9), 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    a(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C1410a(CartOrderSummaryDecorator cartOrderSummaryDecorator, Function0<Unit> function0, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, Function0<Unit> function02) {
                this.f100990a = cartOrderSummaryDecorator;
                this.f100991b = function0;
                this.f100992c = creditCardChargesDecorator;
                this.f100993d = ebtCardChargesDecorator;
                this.f100994e = function02;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(866486266, i11, -1, "com.meijer.mobile.meijer.activity.update.<anonymous>.<anonymous> (CartOrderSummaryBindingExt.kt:31)");
                }
                C16088n.e(AdsTheme, new q1.Column(J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(1186630724, true, new C1411a(AdsTheme, this.f100990a, this.f100991b, this.f100992c, this.f100993d, this.f100994e), composer, 54), composer, LocalThemeScope.f15770g | 384 | (i11 & 14) | (q1.Column.f139985d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        C1409a(CartOrderSummaryDecorator cartOrderSummaryDecorator, Function0<Unit> function0, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, Function0<Unit> function02) {
            this.f100985a = cartOrderSummaryDecorator;
            this.f100986b = function0;
            this.f100987c = creditCardChargesDecorator;
            this.f100988d = ebtCardChargesDecorator;
            this.f100989e = function02;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1233350315, i10, -1, "com.meijer.mobile.meijer.activity.update.<anonymous> (CartOrderSummaryBindingExt.kt:30)");
            }
            K.b(null, ComposableLambdaKt.c(866486266, true, new C1410a(this.f100985a, this.f100986b, this.f100987c, this.f100988d, this.f100989e), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(AbstractC4302x0 abstractC4302x0, CartOrderSummaryDecorator cartOrderSummaryDecorator, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, boolean z10, Function0<Unit> onAdjustAmountClicked, Function0<Unit> onShowExtendedRangeInfoClicked) {
        Intrinsics.j(abstractC4302x0, "<this>");
        Intrinsics.j(cartOrderSummaryDecorator, "cartOrderSummaryDecorator");
        Intrinsics.j(onAdjustAmountClicked, "onAdjustAmountClicked");
        Intrinsics.j(onShowExtendedRangeInfoClicked, "onShowExtendedRangeInfoClicked");
        abstractC4302x0.f21083z.setContent(ComposableLambdaKt.composableLambdaInstance(1233350315, true, new C1409a(cartOrderSummaryDecorator, onShowExtendedRangeInfoClicked, creditCardChargesDecorator, ebtCardChargesDecorator, onAdjustAmountClicked)));
        if (z10) {
            MaterialTextView tipText = abstractC4302x0.f21082B;
            Intrinsics.i(tipText, "tipText");
            tipText.setVisibility(cartOrderSummaryDecorator.getFinalDiscountTextIsVisible() ? 0 : 8);
        }
        ComposeView promoCodeView = abstractC4302x0.f21081A;
        Intrinsics.i(promoCodeView, "promoCodeView");
        promoCodeView.setVisibility(cartOrderSummaryDecorator.getPromoCodeFieldVisibility() ? 0 : 8);
    }
}
