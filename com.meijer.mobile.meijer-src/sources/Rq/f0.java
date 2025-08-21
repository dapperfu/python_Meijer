package Rq;

import Bm.F0;
import Ik.Validation;
import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import Rq.f0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.checkout.payment.CardDetailDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.Z;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState;
import com.meijer.mobile.singlepagecheckout.H2;
import hk.CardHolderName;
import hk.EbtPaymentOption;
import hk.PaymentOption;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.Iterator;
import java.util.List;
import ki.InterfaceC15160b0;
import ki.a1;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import qi.C16671b;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aÃ\u0001\u0010\u0018\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00032\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aW\u0010\u001d\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "viewState", "", "isWicEnabled", "isEditMode", "isPaymentMethodValidated", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onAddNewEbtCard", "onAddNewCreditCardClicked", "onAddNewWicCardClicked", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "checkoutViewState", "onChangeCardClicked", "Lkotlin/Function1;", "", "onConfirmCVVClicked", "onRemoveEbtCard", "displayError", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "onAction", "j", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;ZZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isShowEBTButton", "onAddNewWicCard", "onAddNewCreditCard", "h", "(LKi/M;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "p", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class f0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f33824b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f33825c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<PaymentOptionDecorator> f33826d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f33827e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33828f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f33829g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33830h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33831i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33832j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f33833k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<Z.i, Unit> f33834l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f33835m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33836n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f33837o;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rq.f0$a$a, reason: collision with other inner class name */
        static final class C0756a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33838a;

            C0756a(LocalThemeScope localThemeScope) {
                this.f33838a = localThemeScope;
            }

            public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1055409031, i10, -1, "com.meijer.mobile.singlepagecheckout.payment.PaymentOptionsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentOptionsCard.kt:135)");
                }
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100911f0, composer, 0);
                Di.j.i(this.f33838a, null, C16338g.c(com.meijer.mobile.meijer.Y.f100891e0, composer, 0), strC, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 17);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
                a(interfaceC15160b0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Z.PaymentOptionsViewState paymentOptionsViewState, CheckoutViewState checkoutViewState, List<PaymentOptionDecorator> list, boolean z10, Function0<Unit> function0, boolean z11, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z12, Function1<? super Z.i, Unit> function1, boolean z13, Function0<Unit> function05, Function1<? super String, Unit> function12) {
            this.f33823a = localThemeScope;
            this.f33824b = paymentOptionsViewState;
            this.f33825c = checkoutViewState;
            this.f33826d = list;
            this.f33827e = z10;
            this.f33828f = function0;
            this.f33829g = z11;
            this.f33830h = function02;
            this.f33831i = function03;
            this.f33832j = function04;
            this.f33833k = z12;
            this.f33834l = function1;
            this.f33835m = z13;
            this.f33836n = function05;
            this.f33837o = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p() {
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(String it) {
            Intrinsics.j(it, "it");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r() {
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(Z.PaymentOptionsViewState paymentOptionsViewState, PaymentOptionDecorator paymentOptionDecorator, Function1 function1, String cvv) {
            Object next;
            Intrinsics.j(cvv, "cvv");
            Iterator<T> it = paymentOptionsViewState.getPaymentOptions().h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.e(((PaymentOption) ((Validation) next).e()).getAuthToken(), paymentOptionDecorator.getAuthToken())) {
                    break;
                }
            }
            Validation validation = (Validation) next;
            if (validation != null) {
                function1.invoke(new Z.i.SetCardCVVAction(PaymentOption.b((PaymentOption) validation.e(), null, null, null, null, cvv, false, null, null, null, null, false, null, null, 8175, null)));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t() {
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(Function1 function1, String cvv) {
            Intrinsics.j(cvv, "cvv");
            function1.invoke(cvv);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v() {
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(String it) {
            Intrinsics.j(it, "it");
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            o(composer, num.intValue());
            return Unit.f143329a;
        }

        public final void o(Composer composer, int i10) {
            Object next;
            PaymentOptionDecorator paymentOptionDecoratorB;
            boolean z10;
            Function0<Unit> function0;
            LocalThemeScope localThemeScope;
            Function1<Z.i, Unit> function1;
            String str;
            int i11;
            boolean z11;
            Z.PaymentOptionsViewState paymentOptionsViewState;
            Z.PaymentOptionsViewState paymentOptionsViewState2;
            boolean z12;
            final Function1<String, Unit> function12;
            Z.PaymentOptionsViewState paymentOptionsViewState3;
            CardHolderName cardHolder;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1177481184, i10, -1, "com.meijer.mobile.singlepagecheckout.payment.PaymentOptionsCard.<anonymous> (PaymentOptionsCard.kt:88)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f33823a.getAdsSpacing().getFive().getDp());
            Z.PaymentOptionsViewState paymentOptionsViewState4 = this.f33824b;
            LocalThemeScope localThemeScope2 = this.f33823a;
            CheckoutViewState checkoutViewState = this.f33825c;
            List<PaymentOptionDecorator> list = this.f33826d;
            boolean z13 = this.f33827e;
            final Function0<Unit> function02 = this.f33828f;
            boolean z14 = this.f33829g;
            Function0<Unit> function03 = this.f33830h;
            Function0<Unit> function04 = this.f33831i;
            Function0<Unit> function05 = this.f33832j;
            boolean z15 = this.f33833k;
            Function1<Z.i, Unit> function13 = this.f33834l;
            boolean z16 = this.f33835m;
            Function0<Unit> function06 = this.f33836n;
            Function1<String, Unit> function14 = this.f33837o;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            if (paymentOptionsViewState4.getIsLoading()) {
                composer.startReplaceGroup(-985447769);
                H2.b(localThemeScope2, null, composer, LocalThemeScope.f17314g, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(-985186501);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyB, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100692Te, composer, 0);
                Modifier modifierB = InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null);
                int i12 = LocalThemeScope.f17314g;
                Function1<String, Unit> function15 = function14;
                boolean z17 = z16;
                F0.b(localThemeScope2, strC, modifierB, null, null, false, composer, i12, 28);
                composer.startReplaceGroup(-2129409898);
                if (z15) {
                    C16671b.b(localThemeScope2, q1.h.DrawableIcon.y(new q1.h.DrawableIcon(C.i.b.f17093d, null, null, null, 0.0f, null, null, 126, null), null, null, null, null, 0.0f, null, null, l3.f93324d, null), null, null, composer, i12 | (q1.h.DrawableIcon.f142322h << 3), 6);
                }
                composer.P();
                composer.v();
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope2.getAdsSpacing().getThree().getDp()), composer, 0);
                C17983Z.a(null, localThemeScope2.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                Composer composer2 = composer;
                if (checkoutViewState.getSelectedPaymentOption() != null) {
                    paymentOptionDecoratorB = PaymentOptionDecorator.Companion.b(PaymentOptionDecorator.INSTANCE, new Validation(checkoutViewState.getSelectedPaymentOption(), null, 2, null), false, null, 6, null);
                } else {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((PaymentOptionDecorator) next).getIsSelected()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    paymentOptionDecoratorB = (PaymentOptionDecorator) next;
                }
                if (paymentOptionDecoratorB == null) {
                    composer2.startReplaceGroup(-984276000);
                    f0.p(localThemeScope2, androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, 0.0f, localThemeScope2.getAdsSpacing().getThree().getDp(), 1, null), composer2, LocalThemeScope.f17314g, 0);
                    composer2.P();
                    function0 = function03;
                    localThemeScope = localThemeScope2;
                    z11 = true;
                    paymentOptionsViewState2 = paymentOptionsViewState4;
                } else {
                    composer2.startReplaceGroup(-983998116);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    C14890K.a(androidx.compose.foundation.layout.J.i(companion4, localThemeScope2.getAdsSpacing().getThree().getDp()), composer2, 0);
                    composer2.startReplaceGroup(799544098);
                    if (paymentOptionsViewState4.getEbtBalance() == null || paymentOptionsViewState4.getEbtCardMask() == null || !paymentOptionsViewState4.getDisplayEbtFields()) {
                        z10 = z13;
                        function0 = function03;
                        localThemeScope = localThemeScope2;
                        function1 = function13;
                        str = null;
                        i11 = 0;
                        z11 = true;
                        paymentOptionsViewState = paymentOptionsViewState4;
                    } else {
                        composer2.startReplaceGroup(799546494);
                        if (list.isEmpty()) {
                            Modifier modifierL = androidx.compose.foundation.layout.D.l(companion4, localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getFour().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp(), localThemeScope2.getAdsSpacing().getThree().getDp());
                            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                            int iA3 = C5859f.a(composer2, 0);
                            InterfaceC5884s interfaceC5884sR3 = composer2.r();
                            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierL);
                            InterfaceC5953g.Companion companion5 = InterfaceC5953g.INSTANCE;
                            Function0<InterfaceC5953g> function0A3 = companion5.a();
                            if (composer2.k() == null) {
                                C5859f.c();
                            }
                            composer2.F();
                            if (composer2.getInserting()) {
                                composer2.I(function0A3);
                            } else {
                                composer2.s();
                            }
                            Composer composerA3 = D1.a(composer2);
                            D1.c(composerA3, measurePolicyG, companion5.e());
                            D1.c(composerA3, interfaceC5884sR3, companion5.g());
                            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion5.b();
                            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                                composerA3.t(Integer.valueOf(iA3));
                                composerA3.n(Integer.valueOf(iA3), function2B3);
                            }
                            D1.c(composerA3, modifierE3, companion5.f());
                            C5806j c5806j = C5806j.f48836a;
                            Ki.Q.e(localThemeScope2, a1.f142015a, ComposableLambdaKt.c(-1055409031, true, new C0756a(localThemeScope2), composer2, 54), composer2, LocalThemeScope.f17314g | 384 | (a1.f142016b << 3));
                            composer2.v();
                        }
                        composer2.P();
                        String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f101183sd, composer2, 0);
                        C.g.f fVar = C.g.f.f17076e;
                        AbstractC6392a ebtCardMask = paymentOptionsViewState4.getEbtCardMask();
                        EbtPaymentOption ebtPaymentOption = paymentOptionsViewState4.getEbtPaymentOption();
                        String fullName = (ebtPaymentOption == null || (cardHolder = ebtPaymentOption.getCardHolder()) == null) ? null : cardHolder.getFullName();
                        if (fullName == null) {
                            fullName = "";
                        }
                        CardDetailDecorator cardDetailDecorator = new CardDetailDecorator(fVar, ebtCardMask, fullName, C16338g.c(com.meijer.mobile.meijer.Y.f100548M3, composer2, 0));
                        AbstractC6392a ebtBalance = paymentOptionsViewState4.getEbtBalance();
                        composer2.startReplaceGroup(1849434622);
                        Object objB = composer2.B();
                        Composer.Companion companion6 = Composer.INSTANCE;
                        if (objB == companion6.a()) {
                            objB = new Function0() { // from class: Rq.W
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return f0.a.v();
                                }
                            };
                            composer2.t(objB);
                        }
                        Function0 function07 = (Function0) objB;
                        composer2.P();
                        composer2.startReplaceGroup(1849434622);
                        Object objB2 = composer2.B();
                        if (objB2 == companion6.a()) {
                            objB2 = new Function1() { // from class: Rq.X
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f0.a.w((String) obj);
                                }
                            };
                            composer2.t(objB2);
                        }
                        Function1 function16 = (Function1) objB2;
                        composer2.P();
                        composer2.startReplaceGroup(5004770);
                        boolean zV = composer2.V(function02);
                        Object objB3 = composer2.B();
                        if (zV || objB3 == companion6.a()) {
                            objB3 = new Function0() { // from class: Rq.Y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return f0.a.x(function02);
                                }
                            };
                            composer2.t(objB3);
                        }
                        Function0 function08 = (Function0) objB3;
                        composer2.P();
                        composer2.startReplaceGroup(1849434622);
                        Object objB4 = composer2.B();
                        if (objB4 == companion6.a()) {
                            objB4 = new Function0() { // from class: Rq.Z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return f0.a.p();
                                }
                            };
                            composer2.t(objB4);
                        }
                        Function0 function09 = (Function0) objB4;
                        composer2.P();
                        composer2.startReplaceGroup(1849434622);
                        Object objB5 = composer2.B();
                        if (objB5 == companion6.a()) {
                            objB5 = new Function1() { // from class: Rq.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f0.a.q((String) obj);
                                }
                            };
                            composer2.t(objB5);
                        }
                        Function1 function17 = (Function1) objB5;
                        composer2.P();
                        int i13 = 113470512 | LocalThemeScope.f17314g;
                        int i14 = C.g.f17069d;
                        int i15 = AbstractC6392a.f60445b;
                        localThemeScope = localThemeScope2;
                        z11 = true;
                        function1 = function13;
                        paymentOptionsViewState = paymentOptionsViewState4;
                        str = null;
                        z10 = z13;
                        function0 = function03;
                        i11 = 0;
                        M.c(localThemeScope, null, z10, function07, function16, false, function08, function09, true, cardDetailDecorator, false, false, ebtBalance, null, null, strC2, false, function17, composer, i13 | ((i14 | i15) << 27), 14155830 | (i15 << 6), 12288);
                        composer2 = composer;
                    }
                    composer2.P();
                    for (final PaymentOptionDecorator paymentOptionDecorator : list) {
                        composer2.startReplaceGroup(799631730);
                        if (paymentOptionDecorator.getIsSelected()) {
                            PaymentOption paymentOptionE = paymentOptionsViewState.getPaymentOptions().k().e();
                            String cardCvNumber = paymentOptionE != null ? paymentOptionE.getCardCvNumber() : str;
                            String str2 = cardCvNumber == null ? "" : cardCvNumber;
                            String strC3 = C16338g.c(com.meijer.mobile.meijer.Y.f100559Me, composer2, i11);
                            CardDetailDecorator cardDetailDecorator2 = paymentOptionDecorator.getCardDetailDecorator();
                            AbstractC6392a abstractC6392aE = paymentOptionDecorator.e();
                            boolean completePayment = paymentOptionsViewState.getPaymentOptions().getCompletePayment();
                            composer2.startReplaceGroup(1849434622);
                            Object objB6 = composer2.B();
                            Composer.Companion companion7 = Composer.INSTANCE;
                            if (objB6 == companion7.a()) {
                                objB6 = new Function0() { // from class: Rq.b0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return f0.a.r();
                                    }
                                };
                                composer2.t(objB6);
                            }
                            Function0 function010 = (Function0) objB6;
                            composer2.P();
                            composer2.startReplaceGroup(-1746271574);
                            final Z.PaymentOptionsViewState paymentOptionsViewState5 = paymentOptionsViewState;
                            final Function1<Z.i, Unit> function18 = function1;
                            boolean zD = composer2.D(paymentOptionsViewState5) | composer2.D(paymentOptionDecorator) | composer2.V(function18);
                            Object objB7 = composer2.B();
                            if (zD || objB7 == companion7.a()) {
                                objB7 = new Function1() { // from class: Rq.c0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return f0.a.s(paymentOptionsViewState5, paymentOptionDecorator, function18, (String) obj);
                                    }
                                };
                                composer2.t(objB7);
                            }
                            Function1 function19 = (Function1) objB7;
                            composer2.P();
                            composer2.startReplaceGroup(1849434622);
                            Object objB8 = composer2.B();
                            if (objB8 == companion7.a()) {
                                objB8 = new Function0() { // from class: Rq.d0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return f0.a.t();
                                    }
                                };
                                composer2.t(objB8);
                            }
                            Function0 function011 = (Function0) objB8;
                            composer2.P();
                            composer2.startReplaceGroup(5004770);
                            function12 = function15;
                            boolean zV2 = composer2.V(function12);
                            Object objB9 = composer2.B();
                            if (zV2 || objB9 == companion7.a()) {
                                objB9 = new Function1() { // from class: Rq.e0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return f0.a.u(function12, (String) obj);
                                    }
                                };
                                composer2.t(objB9);
                            }
                            Function1 function110 = (Function1) objB9;
                            composer2.P();
                            int i16 = 102239232 | LocalThemeScope.f17314g;
                            int i17 = C.g.f17069d;
                            int i18 = AbstractC6392a.f60445b;
                            paymentOptionsViewState3 = paymentOptionsViewState5;
                            function1 = function18;
                            boolean z18 = z17;
                            M.c(localThemeScope, paymentOptionDecorator, z10, function010, function19, z18, function011, function06, false, cardDetailDecorator2, false, false, abstractC6392aE, null, str2, strC3, completePayment, function110, composer, i16 | ((i17 | i18) << 27), (i18 << 6) | 54, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                            z12 = z18;
                        } else {
                            z12 = z17;
                            function12 = function15;
                            paymentOptionsViewState3 = paymentOptionsViewState;
                        }
                        composer.P();
                        composer2 = composer;
                        function15 = function12;
                        z17 = z12;
                        paymentOptionsViewState = paymentOptionsViewState3;
                        i11 = 0;
                    }
                    paymentOptionsViewState2 = paymentOptionsViewState;
                    composer.P();
                }
                f0.h(localThemeScope, z14, (paymentOptionsViewState2.getEbtPaymentOption() == null && paymentOptionsViewState2.getDisplayEbtFields()) ? z11 : false, null, function0, function04, function05, composer, LocalThemeScope.f17314g, 4);
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r31, final com.meijer.mobile.meijer.activity.checkout.payment.Z.PaymentOptionsViewState r32, final boolean r33, final boolean r34, final boolean r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, final com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, final boolean r44, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.payment.Z.i, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.f0.j(Ki.M, com.meijer.mobile.meijer.activity.checkout.payment.Z$k, boolean, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.meijer.mobile.meijer.activity.checkout.review.D1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.f0.p(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r25, final boolean r26, final boolean r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, final kotlin.jvm.functions.Function0<kotlin.Unit> r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.f0.h(Ki.M, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, boolean z10, boolean z11, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, z10, z11, modifier, function0, function02, function03, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(String it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Z.i it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Z.PaymentOptionsViewState paymentOptionsViewState, boolean z10, boolean z11, boolean z12, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, CheckoutViewState checkoutViewState, Function0 function04, Function1 function1, Function0 function05, boolean z13, Function1 function12, int i10, int i11, int i12, Composer composer, int i13) {
        j(localThemeScope, paymentOptionsViewState, z10, z11, z12, modifier, function0, function02, function03, checkoutViewState, function04, function1, function05, z13, function12, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
