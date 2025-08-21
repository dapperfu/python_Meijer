package com.meijer.mobile.singlepagecheckout;

import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.cart.entrynote.i;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import com.meijer.mobile.meijer.activity.checkout.payment.Z;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutAnimations;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import com.meijer.mobile.singlepagecheckout.A2;
import dk.C13698b;
import h6.C14478i;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.io.IOException;
import ki.C15158a0;
import ki.InterfaceC15154X;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l6.InterfaceC15464h;
import l6.InterfaceC15467k;
import mv.InterfaceC15783O;
import oi.C16194s0;
import oi.C16200v0;
import p0.InterfaceC16328a;
import p1.C16338g;
import qi.C16671b;
import r1.C16819m;
import ti.C17265b;
import tr.C17284b;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aµ\u0001\u0010\u001f\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001f\u0010 \u001ak\u0010(\u001a\u00020\u0016*\u00020\u00002\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160\u00142\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160\u0014H\u0003¢\u0006\u0004\b(\u0010)\u001au\u0010*\u001a\u00020\u0016*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160\u00142\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160\u0014H\u0003¢\u0006\u0004\b*\u0010+\u001a1\u0010-\u001a\u00020\u0016*\u00020\u00002\u0006\u0010,\u001a\u00020\u000b2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160\u0014H\u0003¢\u0006\u0004\b-\u0010.¨\u0006C²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\f\u00109\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010;\u001a\u00020:8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010>\u001a\u0004\u0018\u00010=8\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\u000e\u0010B\u001a\u00020A8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/singlepagecheckout/d0;", "fulfillmentSlotsCardDecorator", "LRq/N;", "paymentOptionsCardDependencies", "Lcom/meijer/mobile/singlepagecheckout/l;", "contactInfoCardDependencies", "Lcom/meijer/mobile/singlepagecheckout/c;", "coordinatorViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "checkoutViewModel", "", "isEditMode", "isWicEnabled", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i;", "entryNoteViewModel", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/l0;", "displayCheckoutAnimations", "Lkotlin/Function1;", "LQq/o;", "", "onOrderSummaryAction", "Lkotlin/Function0;", "onEditCart", "onEditSubstitutionPreference", "Lp0/a;", "timeSlotsRequester", "paymentSlotsRequester", "placeOrderButtonViewRequester", "I", "(LKi/M;Lcom/meijer/mobile/singlepagecheckout/d0;LRq/N;Lcom/meijer/mobile/singlepagecheckout/l;Lcom/meijer/mobile/singlepagecheckout/c;Lcom/meijer/mobile/meijer/activity/checkout/review/z1;ZZLcom/meijer/mobile/meijer/activity/cart/entrynote/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lp0/a;Lp0/a;Lp0/a;Landroidx/compose/runtime/Composer;III)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "viewState", "isScreenVisible", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "onAction", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "onFulfillmentSlotsAction", "E", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "t", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showOrderCancelWarning", "B", "(LKi/M;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "fulfillmentSlotsViewState", "isPlaceOrderEnabled", "checkoutViewState", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "paymentsOptionsViewState", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "pickupPersonViewState", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "deliveryContactInfoViewState", "orderSummaryViewState", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;", "entryNoteViewState", "displayError", "Lh6/i;", "composition", "", "progress", "", "warningAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class A2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutPageKt$CheckoutLottieAnimation$4$1", f = "SinglePageCheckoutPage.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118573a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutAnimations f118574b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118575c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118576d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f118577e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f118578f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CheckoutAnimations checkoutAnimations, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, Function1<? super z1.h, Unit> function1, CheckoutViewState checkoutViewState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f118574b = checkoutAnimations;
            this.f118575c = interfaceC5872l0;
            this.f118576d = interfaceC5872l02;
            this.f118577e = function1;
            this.f118578f = checkoutViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f118574b, this.f118575c, this.f118576d, this.f118577e, this.f118578f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean boolA;
            String orderId;
            z1.OrderConfirmationInfo information;
            IntrinsicsKt.f();
            if (this.f118573a == 0) {
                ResultKt.b(obj);
                CheckoutAnimations checkoutAnimations = this.f118574b;
                Boolean isBopasEligibleCart = null;
                if (checkoutAnimations != null) {
                    boolA = Boxing.a(checkoutAnimations.getIsErrorEvent());
                } else {
                    boolA = null;
                }
                if (Intrinsics.e(boolA, Boxing.a(true))) {
                    if (!this.f118574b.getIsTimeSlotError()) {
                        this.f118575c.setValue(Boxing.a(true));
                        this.f118576d.setValue(Boxing.a(false));
                        this.f118577e.invoke(z1.h.w.f105994a);
                    }
                } else {
                    CheckoutAnimations checkoutAnimations2 = this.f118574b;
                    if (checkoutAnimations2 != null && checkoutAnimations2.getDisplayEbtPinPad()) {
                        this.f118575c.setValue(Boxing.a(false));
                        this.f118576d.setValue(Boxing.a(false));
                        this.f118577e.invoke(z1.h.v.f105993a);
                    } else {
                        Function1<z1.h, Unit> function1 = this.f118577e;
                        CheckoutAnimations checkoutAnimations3 = this.f118574b;
                        if (checkoutAnimations3 != null) {
                            orderId = checkoutAnimations3.getOrderId();
                        } else {
                            orderId = null;
                        }
                        CheckoutAnimations checkoutAnimations4 = this.f118574b;
                        if (checkoutAnimations4 != null) {
                            information = checkoutAnimations4.getInformation();
                        } else {
                            information = null;
                        }
                        CheckoutViewState checkoutViewState = this.f118578f;
                        if (checkoutViewState != null) {
                            isBopasEligibleCart = checkoutViewState.getIsBopasEligibleCart();
                        }
                        function1.invoke(new z1.h.NavigateToOrderConfirmation(orderId, information, isBopasEligibleCart));
                    }
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<ki.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f118580b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118581a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.R0 f118582b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<z1.h, Unit> f118583c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.A2$b$a$a, reason: collision with other inner class name */
            static final class C1907a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f118584a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.R0 f118585b;

                C1907a(LocalThemeScope localThemeScope, ki.R0 r02) {
                    this.f118584a = localThemeScope;
                    this.f118585b = r02;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1138057051, i10, -1, "com.meijer.mobile.singlepagecheckout.OrderCancellationWarningModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:617)");
                    }
                    C16671b.b(this.f118584a, this.f118585b.getButtons().getDismissIcon(), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, ki.R0 r02, Function1<? super z1.h, Unit> function1) {
                this.f118581a = localThemeScope;
                this.f118582b = r02;
                this.f118583c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1) {
                function1.invoke(z1.h.d.f105972a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1) {
                function1.invoke(z1.h.d.f105972a);
                function1.invoke(z1.h.v.f105993a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1) {
                function1.invoke(z1.h.d.f105972a);
                function1.invoke(z1.h.C12141b.f105970a);
                return Unit.f143329a;
            }

            public final void d(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(39277058, i10, -1, "com.meijer.mobile.singlepagecheckout.OrderCancellationWarningModal.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:605)");
                }
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarG = companion.g();
                LocalThemeScope localThemeScope = this.f118581a;
                ki.R0 r02 = this.f118582b;
                final Function1<z1.h, Unit> function1 = this.f118583c;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C5800d c5800d = C5800d.f48779a;
                MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), bVarG, composer, 48);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), composer, 0);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
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
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14890K.a(InterfaceC14888I.b(C14889J.f139620a, companion2, 1.0f, false, 2, null), composer, 0);
                q1.d.ModalButton dismiss = r02.getButtons().getDismiss();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.C2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return A2.b.a.e(function1);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(1138057051, true, new C1907a(localThemeScope, r02), composer, 54);
                int i11 = LocalThemeScope.f17314g;
                oi.E0.b(localThemeScope, dismiss, function0, composableLambdaC, composer, i11 | 3072 | (q1.d.ModalButton.f142218k << 3));
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C16671b.b(localThemeScope, r02.getIcons().getWarningIcon(), null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 7, null), composer, 0);
                q1.Label labelY = q1.Label.y(r02.getLabels().getHeading(), r02.getLabels().getHeading().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null);
                String strC = C16338g.c(C17284b.f163333m, composer, 0);
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, labelY, strC, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 7, null), composer, 0);
                si.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), r02.getLabels().getBody().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, localThemeScope.getAdsSpacing().getNine().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), C16338g.c(C17284b.f163327j, composer, 0), null, composer, i11 | (i12 << 3), 4);
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getEight().getDp(), 7, null), composer, 0);
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, 10, null);
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion.k(), composer, 0);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM);
                Function0<InterfaceC5953g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyA2, companion3.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
                Modifier modifierB = androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), 0.0f, localThemeScope.getAdsSpacing().getTen().getDp(), 1, null);
                C16194s0 c16194s0 = C16194s0.f154251a;
                String strC2 = C16338g.c(C17284b.f163331l, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function1);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.D2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return A2.b.a.f(function1);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                oi.P0.k(localThemeScope, c16194s0, strC2, (Function0) objB2, modifierB, null, false, 0L, false, composer, i11 | (C16194s0.f154252b << 3), 240);
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFour().getDp(), 7, null), composer, 0);
                Modifier modifierB2 = androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), 0.0f, localThemeScope.getAdsSpacing().getTen().getDp(), 1, null);
                C16200v0 c16200v0 = C16200v0.f154265a;
                String strC3 = C16338g.c(C17284b.f163329k, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(function1);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.E2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return A2.b.a.g(function1);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                oi.P0.k(localThemeScope, c16200v0, strC3, (Function0) objB3, modifierB2, null, false, 0L, false, composer, i11 | (C16200v0.f154266b << 3), 240);
                C14890K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), 7, null), composer, 0);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Function1<? super z1.h, Unit> function1) {
            this.f118579a = localThemeScope;
            this.f118580b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(z1.h.d.f105972a);
            return Unit.f143329a;
        }

        public final void b(ki.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1589896527, i10, -1, "com.meijer.mobile.singlepagecheckout.OrderCancellationWarningModal.<anonymous> (SinglePageCheckoutPage.kt:598)");
            }
            LocalThemeScope localThemeScope = this.f118579a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f118580b);
            final Function1<z1.h, Unit> function1 = this.f118580b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.B2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return A2.b.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplate, (Function0) objB, null, ComposableLambdaKt.c(39277058, true, new a(this.f118579a, Assemble, this.f118580b), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f118587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f118588c;

        c(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f118586a = localThemeScope;
            this.f118587b = checkoutViewState;
            this.f118588c = interfaceC5872l0;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-218888759, i10, -1, "com.meijer.mobile.singlepagecheckout.OrderLoadingState.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:451)");
            }
            LocalThemeScope localThemeScope = this.f118586a;
            Ci.o oVar = null;
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null));
            q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
            Ci.o oVar2 = Ci.o.f4629a;
            CheckoutViewState checkoutViewState = this.f118587b;
            InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f118588c;
            if (checkoutViewState.getLoadingState().getIsLoading() && !interfaceC5872l0.getValue().booleanValue()) {
                oVar = oVar2;
            }
            if (oVar == null) {
                oVar = Ci.o.f4633e;
            }
            Ci.o oVar3 = oVar;
            AbstractC6392a loadingMessage = this.f118587b.getLoadingState().getLoadingMessage();
            int i11 = AbstractC6392a.f60445b;
            Ci.m.e(localThemeScope, modifierFsUnmask, largeLoadingV2, oVar3, C13698b.a(loadingMessage, composer, i11), C13698b.a(this.f118587b.getLoadingState().getLoadingMessageBody(), composer, i11), null, composer, (q1.k.LargeV2.f142351f << 6) | LocalThemeScope.f17314g, 32);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<q1.g, Unit> {
        d(Object obj) {
            super(1, obj, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsViewModel$Action;)V", 0);
        }

        public final void a(q1.g p02) {
            Intrinsics.j(p02, "p0");
            ((com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1) this.receiver).e0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(q1.g gVar) {
            a(gVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118589a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13065l f118590b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<DeliveryContactInformationViewState> f118591c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f118592a;

            a(L1.h hVar) {
                this.f118592a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f118592a.getStart(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C13065l f118593a;

            b(C13065l c13065l) {
                this.f118593a = c13065l;
            }

            public final void a() {
                this.f118593a.getDeliveryContactViewModel().M(H.g.b.f103237a);
                this.f118593a.getDeliveryContactViewModel().M(H.g.j.f103247a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f118594a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118595b;

            c(L1.h hVar, LocalThemeScope localThemeScope) {
                this.f118594a = hVar;
                this.f118595b = localThemeScope;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), this.f118594a.getEnd(), this.f118595b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C13065l f118596a;

            d(C13065l c13065l) {
                this.f118596a = c13065l;
            }

            public final void a() {
                this.f118596a.getDeliveryContactViewModel().M(H.g.j.f103247a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.A2$e$e, reason: collision with other inner class name */
        public static final class C1908e extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f118597f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1908e(L1.A a10) {
                super(1);
                this.f118597f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f118597f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f118598f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f118599g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f118600h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118601i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C13065l f118602j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1 f118603k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, C13065l c13065l, androidx.compose.runtime.z1 z1Var) {
                super(2);
                this.f118599g = nVar;
                this.f118600h = function0;
                this.f118601i = localThemeScope;
                this.f118602j = c13065l;
                this.f118603k = z1Var;
                this.f118598f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f118599g.getHelpersHashCode();
                this.f118599g.i();
                L1.n nVar = this.f118599g;
                composer.startReplaceGroup(-1142082696);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarC);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new a(hVarC);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
                C16200v0 c16200v0 = C16200v0.f154265a;
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101170s0, composer, 0);
                LocalThemeScope localThemeScope = this.f118601i;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f118602j);
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(this.f118602j);
                    composer.t(objB2);
                }
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                oi.P0.k(localThemeScope, c16200v0, strC, (Function0) objB2, modifierK, null, false, 0L, false, composer, i11 | (C16200v0.f154266b << 3), 240);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(hVarA) | composer.D(this.f118601i);
                Object objB3 = composer.B();
                if (zV2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new c(hVarA, this.f118601i);
                    composer.t(objB3);
                }
                composer.P();
                Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(nVar.k(companion, hVarC, (Function1) objB3), "Button", "save contact info");
                C16194s0 c16194s0 = C16194s0.f154251a;
                String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f100558Md, composer, 0);
                boolean zIsValid = A2.X(this.f118603k).isValid();
                LocalThemeScope localThemeScope2 = this.f118601i;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f118602j);
                Object objB4 = composer.B();
                if (zD2 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new d(this.f118602j);
                    composer.t(objB4);
                }
                composer.P();
                oi.P0.k(localThemeScope2, c16194s0, strC2, (Function0) objB4, modifierFsAttribute, null, false, 0L, zIsValid, composer, i11 | (C16194s0.f154252b << 3), 112);
                composer.P();
                if (this.f118599g.getHelpersHashCode() != helpersHashCode) {
                    this.f118600h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        e(LocalThemeScope localThemeScope, C13065l c13065l, androidx.compose.runtime.z1<DeliveryContactInformationViewState> z1Var) {
            this.f118589a = localThemeScope;
            this.f118590b = c13065l;
            this.f118591c = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-129042417, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutPage.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:267)");
            }
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f118589a.getAdsSpacing().getFive().getDp(), 0.0f, this.f118589a.getAdsSpacing().getFive().getDp(), this.f118589a.getAdsSpacing().getFive().getDp(), 2, null), "Button", "cancel edit contact info");
            LocalThemeScope localThemeScope = this.f118589a;
            C13065l c13065l = this.f118590b;
            androidx.compose.runtime.z1<DeliveryContactInformationViewState> z1Var = this.f118591c;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierFsAttribute, false, new C1908e(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new f(nVar, 0, pairH.b(), localThemeScope, c13065l, z1Var)), pairH.a(), composer, 48, 0);
            composer.U();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends FunctionReferenceImpl implements Function1<Z.i, Unit> {
        f(Object obj) {
            super(1, obj, com.meijer.mobile.meijer.activity.checkout.payment.Z.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/payment/CheckoutPaymentOptionsViewModel$PaymentOptionsAction;)V", 0);
        }

        public final void a(Z.i p02) {
            Intrinsics.j(p02, "p0");
            ((com.meijer.mobile.meijer.activity.checkout.payment.Z) this.receiver).d0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Z.i iVar) {
            a(iVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsCardDecorator f118605b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.review.z1 f118606c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<FulfillmentSlotsViewState> f118607d;

        g(LocalThemeScope localThemeScope, FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator, com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var, androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var2) {
            this.f118604a = localThemeScope;
            this.f118605b = fulfillmentSlotsCardDecorator;
            this.f118606c = z1Var;
            this.f118607d = z1Var2;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1556851993, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutPage.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:140)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14890K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, this.f118604a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 13, null), composer, 0);
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "timeslot saved");
            C16194s0 c16194s0 = C16194s0.f154251a;
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100558Md, composer, 0);
            boolean zIsValid = A2.J(this.f118607d).isValid();
            LocalThemeScope localThemeScope = this.f118604a;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f118605b) | composer.D(this.f118606c);
            final FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator = this.f118605b;
            final com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var = this.f118606c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.F2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return A2.g.c(fulfillmentSlotsCardDecorator, z1Var);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            oi.P0.k(localThemeScope, c16194s0, strC, (Function0) objB, modifierFsAttribute, null, true, 0L, zIsValid, composer, 1572864 | LocalThemeScope.f17314g | (C16194s0.f154252b << 3), 80);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator, com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var) throws IOException {
            fulfillmentSlotsCardDecorator.getFulfillmentSlotsViewModel().e0(q1.g.k.f103939a);
            z1Var.r0(z1.h.m.f105981a);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends FunctionReferenceImpl implements Function1<C12057p.g, Unit> {
        h(Object obj) {
            super(1, obj, C12057p.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/PickupPersonFormViewModel$Action;)V", 0);
        }

        public final void a(C12057p.g p02) {
            Intrinsics.j(p02, "p0");
            ((C12057p) this.receiver).M(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C12057p.g gVar) {
            a(gVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13065l f118609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<PickupPersonViewState> f118610c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f118611a;

            a(L1.h hVar) {
                this.f118611a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f118611a.getStart(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C13065l f118612a;

            b(C13065l c13065l) {
                this.f118612a = c13065l;
            }

            public final void a() {
                this.f118612a.getPickupPersonFormViewModel().M(C12057p.g.b.f105143a);
                this.f118612a.getPickupPersonFormViewModel().M(C12057p.g.n.f105164a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f118613a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118614b;

            c(L1.h hVar, LocalThemeScope localThemeScope) {
                this.f118613a = hVar;
                this.f118614b = localThemeScope;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), this.f118613a.getEnd(), this.f118614b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C13065l f118615a;

            d(C13065l c13065l) {
                this.f118615a = c13065l;
            }

            public final void a() {
                this.f118615a.getPickupPersonFormViewModel().M(C12057p.g.n.f105164a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class e extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f118616f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(L1.A a10) {
                super(1);
                this.f118616f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f118616f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f118617f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f118618g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f118619h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118620i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C13065l f118621j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1 f118622k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, C13065l c13065l, androidx.compose.runtime.z1 z1Var) {
                super(2);
                this.f118618g = nVar;
                this.f118619h = function0;
                this.f118620i = localThemeScope;
                this.f118621j = c13065l;
                this.f118622k = z1Var;
                this.f118617f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f118618g.getHelpersHashCode();
                this.f118618g.i();
                L1.n nVar = this.f118618g;
                composer.startReplaceGroup(-1348733070);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarC);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new a(hVarC);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
                C16200v0 c16200v0 = C16200v0.f154265a;
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101170s0, composer, 0);
                LocalThemeScope localThemeScope = this.f118620i;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f118621j);
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(this.f118621j);
                    composer.t(objB2);
                }
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                oi.P0.k(localThemeScope, c16200v0, strC, (Function0) objB2, modifierK, null, false, 0L, false, composer, i11 | (C16200v0.f154266b << 3), 240);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(hVarA) | composer.D(this.f118620i);
                Object objB3 = composer.B();
                if (zV2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new c(hVarA, this.f118620i);
                    composer.t(objB3);
                }
                composer.P();
                Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(nVar.k(companion, hVarC, (Function1) objB3), "Button", "save contact info");
                C16194s0 c16194s0 = C16194s0.f154251a;
                String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f100558Md, composer, 0);
                boolean zIsValid = A2.W(this.f118622k).isValid();
                LocalThemeScope localThemeScope2 = this.f118620i;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f118621j);
                Object objB4 = composer.B();
                if (zD2 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new d(this.f118621j);
                    composer.t(objB4);
                }
                composer.P();
                oi.P0.k(localThemeScope2, c16194s0, strC2, (Function0) objB4, modifierFsAttribute, null, false, 0L, zIsValid, composer, i11 | (C16194s0.f154252b << 3), 112);
                composer.P();
                if (this.f118618g.getHelpersHashCode() != helpersHashCode) {
                    this.f118619h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        i(LocalThemeScope localThemeScope, C13065l c13065l, androidx.compose.runtime.z1<PickupPersonViewState> z1Var) {
            this.f118608a = localThemeScope;
            this.f118609b = c13065l;
            this.f118610c = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1906463837, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutPage.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:176)");
            }
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f118608a.getAdsSpacing().getFive().getDp(), 0.0f, this.f118608a.getAdsSpacing().getFive().getDp(), this.f118608a.getAdsSpacing().getFive().getDp(), 2, null), "Button", "cancel edit contact info");
            LocalThemeScope localThemeScope = this.f118608a;
            C13065l c13065l = this.f118609b;
            androidx.compose.runtime.z1<PickupPersonViewState> z1Var = this.f118610c;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierFsAttribute, false, new e(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new f(nVar, 0, pairH.b(), localThemeScope, c13065l, z1Var)), pairH.a(), composer, 48, 0);
            composer.U();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j extends FunctionReferenceImpl implements Function1<H.g, Unit> {
        j(Object obj) {
            super(1, obj, com.meijer.mobile.meijer.activity.checkout.contactinformation.H.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/DeliveryContactInformationFormViewModel$Action;)V", 0);
        }

        public final void a(H.g p02) {
            Intrinsics.j(p02, "p0");
            ((com.meijer.mobile.meijer.activity.checkout.contactinformation.H) this.receiver).M(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(H.g gVar) {
            a(gVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class k extends FunctionReferenceImpl implements Function1<z1.h, Unit> {
        k(Object obj) {
            super(1, obj, com.meijer.mobile.meijer.activity.checkout.review.z1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutViewModel$Action;)V", 0);
        }

        public final void a(z1.h p02) throws IOException {
            Intrinsics.j(p02, "p0");
            ((com.meijer.mobile.meijer.activity.checkout.review.z1) this.receiver).r0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(z1.h hVar) throws IOException {
            a(hVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class l extends FunctionReferenceImpl implements Function1<q1.g, Unit> {
        l(Object obj) {
            super(1, obj, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsViewModel$Action;)V", 0);
        }

        public final void a(q1.g p02) {
            Intrinsics.j(p02, "p0");
            ((com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1) this.receiver).e0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(q1.g gVar) {
            a(gVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class m extends FunctionReferenceImpl implements Function1<z1.h, Unit> {
        m(Object obj) {
            super(1, obj, com.meijer.mobile.meijer.activity.checkout.review.z1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutViewModel$Action;)V", 0);
        }

        public final void a(z1.h p02) throws IOException {
            Intrinsics.j(p02, "p0");
            ((com.meijer.mobile.meijer.activity.checkout.review.z1) this.receiver).r0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(z1.h hVar) throws IOException {
            a(hVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class n extends FunctionReferenceImpl implements Function1<z1.h, Unit> {
        n(Object obj) {
            super(1, obj, com.meijer.mobile.meijer.activity.checkout.review.z1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutViewModel$Action;)V", 0);
        }

        public final void a(z1.h p02) throws IOException {
            Intrinsics.j(p02, "p0");
            ((com.meijer.mobile.meijer.activity.checkout.review.z1) this.receiver).r0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(z1.h hVar) throws IOException {
            a(hVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class o extends FunctionReferenceImpl implements Function1<q1.g, Unit> {
        o(Object obj) {
            super(1, obj, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/FulfillmentSlotsViewModel$Action;)V", 0);
        }

        public final void a(q1.g p02) {
            Intrinsics.j(p02, "p0");
            ((com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1) this.receiver).e0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(q1.g gVar) {
            a(gVar);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:360:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(final Ki.LocalThemeScope r45, final com.meijer.mobile.singlepagecheckout.FulfillmentSlotsCardDecorator r46, final Rq.N r47, final com.meijer.mobile.singlepagecheckout.C13065l r48, final com.meijer.mobile.singlepagecheckout.C13032c r49, final com.meijer.mobile.meijer.activity.checkout.review.z1 r50, final boolean r51, final boolean r52, final com.meijer.mobile.meijer.activity.cart.entrynote.i r53, androidx.compose.ui.Modifier r54, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r55, final kotlin.jvm.functions.Function1<? super Qq.o, kotlin.Unit> r56, final kotlin.jvm.functions.Function0<kotlin.Unit> r57, final kotlin.jvm.functions.Function0<kotlin.Unit> r58, final p0.InterfaceC16328a r59, final p0.InterfaceC16328a r60, final p0.InterfaceC16328a r61, androidx.compose.runtime.Composer r62, final int r63, final int r64, final int r65) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.A2.I(Ki.M, com.meijer.mobile.singlepagecheckout.d0, Rq.N, com.meijer.mobile.singlepagecheckout.l, com.meijer.mobile.singlepagecheckout.c, com.meijer.mobile.meijer.activity.checkout.review.z1, boolean, boolean, com.meijer.mobile.meijer.activity.cart.entrynote.i, androidx.compose.ui.Modifier, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p0.a, p0.a, p0.a, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, modifier, checkoutViewState, interfaceC5872l0, interfaceC5872l02, function1, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void E(final Ki.LocalThemeScope r16, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r17, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r18, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r19, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r20, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.A2.E(Ki.M, com.meijer.mobile.meijer.activity.checkout.review.D1, androidx.compose.runtime.l0, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, checkoutViewState, interfaceC5872l0, interfaceC5872l02, function1, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(com.meijer.mobile.meijer.activity.cart.entrynote.i iVar, String note) {
        Intrinsics.j(note, "note");
        iVar.E(note);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(com.meijer.mobile.meijer.activity.cart.entrynote.i iVar, String note) {
        Intrinsics.j(note, "note");
        iVar.A(new i.b.SetDeliveryNote(note));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(com.meijer.mobile.meijer.activity.cart.entrynote.i iVar) {
        iVar.A(i.b.a.f102654a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Rq.N n10, String cvv) {
        Intrinsics.j(cvv, "cvv");
        n10.e().invoke(cvv);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(LocalThemeScope localThemeScope, FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator, Rq.N n10, C13065l c13065l, C13032c c13032c, com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var, boolean z10, boolean z11, com.meijer.mobile.meijer.activity.cart.entrynote.i iVar, Modifier modifier, InterfaceC5872l0 interfaceC5872l0, Function1 function1, Function0 function0, Function0 function02, InterfaceC16328a interfaceC16328a, InterfaceC16328a interfaceC16328a2, InterfaceC16328a interfaceC16328a3, int i10, int i11, int i12, Composer composer, int i13) throws IOException {
        I(localThemeScope, fulfillmentSlotsCardDecorator, n10, c13065l, c13032c, z1Var, z10, z11, iVar, modifier, interfaceC5872l0, function1, function0, function02, interfaceC16328a, interfaceC16328a2, interfaceC16328a3, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void t(final Ki.LocalThemeScope r41, androidx.compose.ui.Modifier r42, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r43, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r44, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r45, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r46, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.A2.t(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, androidx.compose.runtime.l0, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    private static final void B(final LocalThemeScope localThemeScope, final boolean z10, Function1<? super z1.h, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1824832593);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.k2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return A2.C((z1.h) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function1 = (Function1) objB;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1824832593, i12, -1, "com.meijer.mobile.singlepagecheckout.OrderCancellationWarningModal (SinglePageCheckoutPage.kt:595)");
            }
            if (z10) {
                Ki.Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(1589896527, true, new b(localThemeScope, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (C15158a0.f142010b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Function1<? super z1.h, Unit> function12 = function1;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.l2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return A2.D(localThemeScope, z10, function12, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FulfillmentSlotsViewState J(androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var) {
        return z1Var.getValue();
    }

    private static final boolean K(androidx.compose.runtime.z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    private static final CheckoutViewState L(androidx.compose.runtime.z1<CheckoutViewState> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(C13065l c13065l) {
        c13065l.getPickupPersonFormViewModel().M(C12057p.g.c.f105144a);
        c13065l.getPickupPersonFormViewModel().M(C12057p.g.a.f105142a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(C13065l c13065l) {
        c13065l.getDeliveryContactViewModel().M(H.g.c.f103238a);
        c13065l.getDeliveryContactViewModel().M(H.g.a.f103236a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var) throws IOException {
        if (!z1Var.h0().getValue().booleanValue()) {
            z1Var.J0(true);
            z1Var.r0(new z1.h.SubmitOrderAction(true));
        } else {
            z1Var.r0(z1.h.v.f105993a);
        }
        return Unit.f143329a;
    }

    private static final Z.PaymentOptionsViewState T(androidx.compose.runtime.z1<Z.PaymentOptionsViewState> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var) throws IOException {
        if (!z1Var.h0().getValue().booleanValue()) {
            z1Var.J0(true);
            z1Var.r0(new z1.h.SubmitOrderAction(true));
        } else {
            z1Var.r0(z1.h.v.f105993a);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PickupPersonViewState W(androidx.compose.runtime.z1<PickupPersonViewState> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeliveryContactInformationViewState X(androidx.compose.runtime.z1<DeliveryContactInformationViewState> z1Var) {
        return z1Var.getValue();
    }

    private static final CheckoutViewState Y(androidx.compose.runtime.z1<CheckoutViewState> z1Var) {
        return z1Var.getValue();
    }

    private static final i.EntryNoteViewState Z(androidx.compose.runtime.z1<i.EntryNoteViewState> z1Var) {
        return z1Var.getValue();
    }

    private static final boolean a0(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final C14478i w(InterfaceC15467k interfaceC15467k) {
        return interfaceC15467k.getValue();
    }

    private static final float x(InterfaceC15464h interfaceC15464h) {
        return interfaceC15464h.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float y(InterfaceC15464h interfaceC15464h) {
        return x(interfaceC15464h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(CheckoutAnimations checkoutAnimations, Function1 function1, Function1 function12, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02) {
        if (checkoutAnimations.getIsTimeSlotError()) {
            function1.invoke(z1.h.j.f105978a);
            function12.invoke(q1.g.b.f103930a);
            function1.invoke(z1.h.m.f105981a);
        } else {
            function1.invoke(new z1.h.SubmitOrderAction(false));
        }
        function1.invoke(new z1.h.SetCheckoutAnimations(false, null));
        interfaceC5872l0.setValue(Boolean.FALSE);
        interfaceC5872l02.setValue(Boolean.TRUE);
        return Unit.f143329a;
    }
}
