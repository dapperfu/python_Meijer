package com.meijer.mobile.meijer.activity;

import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Nn.AbstractC4307x0;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import bk.AbstractC6392a;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CreditCardChargesDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EbtCardChargesDecorator;
import j0.InterfaceC14902f;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16453n;
import zm.C18534d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aU\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNn/x0;", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "cartOrderSummaryDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "creditCardChargesDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "ebtCardChargesDecorator", "", "shouldUpdateVisibilityForTipText", "Lkotlin/Function0;", "", "onAdjustAmountClicked", "onShowExtendedRangeInfoClicked", "a", "(LNn/x0;Lcom/meijer/mobile/meijer/activity/cart/n0;Lcom/meijer/mobile/meijer/activity/checkout/review/L1;Lcom/meijer/mobile/meijer/activity/checkout/review/N1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.a$a, reason: collision with other inner class name */
    static final class C1418a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartOrderSummaryDecorator f101840a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f101841b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f101842c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f101843d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f101844e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.a$a$a, reason: collision with other inner class name */
        static final class C1419a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CartOrderSummaryDecorator f101845a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f101846b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CreditCardChargesDecorator f101847c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ EbtCardChargesDecorator f101848d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f101849e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.a$a$a$a, reason: collision with other inner class name */
            static final class C1420a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f101850a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CartOrderSummaryDecorator f101851b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f101852c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ CreditCardChargesDecorator f101853d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ EbtCardChargesDecorator f101854e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f101855f;

                C1420a(LocalThemeScope localThemeScope, CartOrderSummaryDecorator cartOrderSummaryDecorator, Function0<Unit> function0, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, Function0<Unit> function02) {
                    this.f101850a = localThemeScope;
                    this.f101851b = cartOrderSummaryDecorator;
                    this.f101852c = function0;
                    this.f101853d = creditCardChargesDecorator;
                    this.f101854e = ebtCardChargesDecorator;
                    this.f101855f = function02;
                }

                public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1186630724, i10, -1, "com.meijer.mobile.meijer.activity.update.<anonymous>.<anonymous>.<anonymous> (CartOrderSummaryBindingExt.kt:34)");
                    }
                    LocalThemeScope localThemeScope = this.f101850a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = J.h(companion, 0.0f, 1, null);
                    CartOrderSummaryDecorator cartOrderSummaryDecorator = this.f101851b;
                    Function0<Unit> function0 = this.f101852c;
                    int i11 = LocalThemeScope.f17314g;
                    zm.w.b(localThemeScope, modifierH, cartOrderSummaryDecorator, function0, composer, i11 | 48, 0);
                    LocalThemeScope localThemeScope2 = this.f101850a;
                    Modifier modifierH2 = J.h(companion, 0.0f, 1, null);
                    CreditCardChargesDecorator creditCardChargesDecorator = this.f101853d;
                    EbtCardChargesDecorator ebtCardChargesDecorator = this.f101854e;
                    Function0<Unit> function02 = this.f101855f;
                    int i12 = AbstractC6392a.f60445b;
                    int i13 = C.g.f17069d;
                    C18534d.d(localThemeScope2, modifierH2, creditCardChargesDecorator, ebtCardChargesDecorator, function02, composer, i11 | 48 | (((((i12 | i13) | i12) | i12) | i12) << 6) | ((i12 | ((i13 | i12) | i12)) << 9), 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    a(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C1419a(CartOrderSummaryDecorator cartOrderSummaryDecorator, Function0<Unit> function0, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, Function0<Unit> function02) {
                this.f101845a = cartOrderSummaryDecorator;
                this.f101846b = function0;
                this.f101847c = creditCardChargesDecorator;
                this.f101848d = ebtCardChargesDecorator;
                this.f101849e = function02;
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
                C16453n.e(AdsTheme, new q1.Column(J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(1186630724, true, new C1420a(AdsTheme, this.f101845a, this.f101846b, this.f101847c, this.f101848d, this.f101849e), composer, 54), composer, LocalThemeScope.f17314g | 384 | (i11 & 14) | (q1.Column.f142240d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        C1418a(CartOrderSummaryDecorator cartOrderSummaryDecorator, Function0<Unit> function0, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, Function0<Unit> function02) {
            this.f101840a = cartOrderSummaryDecorator;
            this.f101841b = function0;
            this.f101842c = creditCardChargesDecorator;
            this.f101843d = ebtCardChargesDecorator;
            this.f101844e = function02;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1233350315, i10, -1, "com.meijer.mobile.meijer.activity.update.<anonymous> (CartOrderSummaryBindingExt.kt:30)");
            }
            K.b(null, ComposableLambdaKt.c(866486266, true, new C1419a(this.f101840a, this.f101841b, this.f101842c, this.f101843d, this.f101844e), composer, 54), composer, 48, 1);
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

    public static final void a(AbstractC4307x0 abstractC4307x0, CartOrderSummaryDecorator cartOrderSummaryDecorator, CreditCardChargesDecorator creditCardChargesDecorator, EbtCardChargesDecorator ebtCardChargesDecorator, boolean z10, Function0<Unit> onAdjustAmountClicked, Function0<Unit> onShowExtendedRangeInfoClicked) {
        Intrinsics.j(abstractC4307x0, "<this>");
        Intrinsics.j(cartOrderSummaryDecorator, "cartOrderSummaryDecorator");
        Intrinsics.j(onAdjustAmountClicked, "onAdjustAmountClicked");
        Intrinsics.j(onShowExtendedRangeInfoClicked, "onShowExtendedRangeInfoClicked");
        abstractC4307x0.f22415z.setContent(ComposableLambdaKt.composableLambdaInstance(1233350315, true, new C1418a(cartOrderSummaryDecorator, onShowExtendedRangeInfoClicked, creditCardChargesDecorator, ebtCardChargesDecorator, onAdjustAmountClicked)));
        if (z10) {
            MaterialTextView tipText = abstractC4307x0.f22414B;
            Intrinsics.i(tipText, "tipText");
            tipText.setVisibility(cartOrderSummaryDecorator.getFinalDiscountTextIsVisible() ? 0 : 8);
        }
        ComposeView promoCodeView = abstractC4307x0.f22413A;
        Intrinsics.i(promoCodeView, "promoCodeView");
        promoCodeView.setVisibility(cartOrderSummaryDecorator.getPromoCodeFieldVisibility() ? 0 : 8);
    }
}
