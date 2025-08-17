package com.meijer.mobile.singlepagecheckout;

import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.cart.entrynote.i;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import com.meijer.mobile.meijer.activity.checkout.payment.Z;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutAnimations;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import com.meijer.mobile.singlepagecheckout.y2;
import g6.C14209i;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.io.IOException;
import ji.C14924a0;
import ji.InterfaceC14920X;
import ji.q1;
import k6.InterfaceC15105h;
import k6.InterfaceC15108k;
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
import ni.C15860s0;
import ni.C15866v0;
import p0.InterfaceC16183a;
import p1.C16193g;
import pi.C16307b;
import qv.InterfaceC16622O;
import r1.C16705m;
import si.C16977b;
import tr.C17135b;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aµ\u0001\u0010\u001f\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001f\u0010 \u001ak\u0010(\u001a\u00020\u0016*\u00020\u00002\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160\u00142\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160\u0014H\u0003¢\u0006\u0004\b(\u0010)\u001au\u0010*\u001a\u00020\u0016*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160\u00142\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160\u0014H\u0003¢\u0006\u0004\b*\u0010+\u001a1\u0010-\u001a\u00020\u0016*\u00020\u00002\u0006\u0010,\u001a\u00020\u000b2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160\u0014H\u0003¢\u0006\u0004\b-\u0010.¨\u0006C²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\f\u00109\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010;\u001a\u00020:8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010>\u001a\u0004\u0018\u00010=8\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\u000e\u0010B\u001a\u00020A8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/singlepagecheckout/d0;", "fulfillmentSlotsCardDecorator", "LRq/N;", "paymentOptionsCardDependencies", "Lcom/meijer/mobile/singlepagecheckout/l;", "contactInfoCardDependencies", "Lcom/meijer/mobile/singlepagecheckout/c;", "coordinatorViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "checkoutViewModel", "", "isEditMode", "isWicEnabled", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i;", "entryNoteViewModel", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/l0;", "displayCheckoutAnimations", "Lkotlin/Function1;", "LQq/o;", "", "onOrderSummaryAction", "Lkotlin/Function0;", "onEditCart", "onEditSubstitutionPreference", "Lp0/a;", "timeSlotsRequester", "paymentSlotsRequester", "placeOrderButtonViewRequester", "I", "(LJi/M;Lcom/meijer/mobile/singlepagecheckout/d0;LRq/N;Lcom/meijer/mobile/singlepagecheckout/l;Lcom/meijer/mobile/singlepagecheckout/c;Lcom/meijer/mobile/meijer/activity/checkout/review/z1;ZZLcom/meijer/mobile/meijer/activity/cart/entrynote/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lp0/a;Lp0/a;Lp0/a;Landroidx/compose/runtime/Composer;III)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "viewState", "isScreenVisible", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$h;", "onAction", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "onFulfillmentSlotsAction", "E", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "t", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showOrderCancelWarning", "B", "(LJi/M;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "fulfillmentSlotsViewState", "isPlaceOrderEnabled", "checkoutViewState", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "paymentsOptionsViewState", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "pickupPersonViewState", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "deliveryContactInfoViewState", "orderSummaryViewState", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;", "entryNoteViewState", "displayError", "Lg6/i;", "composition", "", "progress", "", "warningAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class y2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutPageKt$CheckoutLottieAnimation$4$1", f = "SinglePageCheckoutPage.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118405a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutAnimations f118406b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f118407c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f118408d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f118409e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f118410f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CheckoutAnimations checkoutAnimations, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, Function1<? super z1.h, Unit> function1, CheckoutViewState checkoutViewState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f118406b = checkoutAnimations;
            this.f118407c = interfaceC5730l0;
            this.f118408d = interfaceC5730l02;
            this.f118409e = function1;
            this.f118410f = checkoutViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f118406b, this.f118407c, this.f118408d, this.f118409e, this.f118410f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean boolA;
            String orderId;
            z1.OrderConfirmationInfo information;
            IntrinsicsKt.f();
            if (this.f118405a == 0) {
                ResultKt.b(obj);
                CheckoutAnimations checkoutAnimations = this.f118406b;
                Boolean isBopasEligibleCart = null;
                if (checkoutAnimations != null) {
                    boolA = Boxing.a(checkoutAnimations.getIsErrorEvent());
                } else {
                    boolA = null;
                }
                if (Intrinsics.e(boolA, Boxing.a(true))) {
                    if (!this.f118406b.getIsTimeSlotError()) {
                        this.f118407c.setValue(Boxing.a(true));
                        this.f118408d.setValue(Boxing.a(false));
                        this.f118409e.invoke(z1.h.w.f105139a);
                    }
                } else {
                    CheckoutAnimations checkoutAnimations2 = this.f118406b;
                    if (checkoutAnimations2 != null && checkoutAnimations2.getDisplayEbtPinPad()) {
                        this.f118407c.setValue(Boxing.a(false));
                        this.f118408d.setValue(Boxing.a(false));
                        this.f118409e.invoke(z1.h.v.f105138a);
                    } else {
                        Function1<z1.h, Unit> function1 = this.f118409e;
                        CheckoutAnimations checkoutAnimations3 = this.f118406b;
                        if (checkoutAnimations3 != null) {
                            orderId = checkoutAnimations3.getOrderId();
                        } else {
                            orderId = null;
                        }
                        CheckoutAnimations checkoutAnimations4 = this.f118406b;
                        if (checkoutAnimations4 != null) {
                            information = checkoutAnimations4.getInformation();
                        } else {
                            information = null;
                        }
                        CheckoutViewState checkoutViewState = this.f118410f;
                        if (checkoutViewState != null) {
                            isBopasEligibleCart = checkoutViewState.getIsBopasEligibleCart();
                        }
                        function1.invoke(new z1.h.NavigateToOrderConfirmation(orderId, information, isBopasEligibleCart));
                    }
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<ji.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118411a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<z1.h, Unit> f118412b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118413a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ji.R0 f118414b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<z1.h, Unit> f118415c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.y2$b$a$a, reason: collision with other inner class name */
            static final class C1921a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f118416a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.R0 f118417b;

                C1921a(LocalThemeScope localThemeScope, ji.R0 r02) {
                    this.f118416a = localThemeScope;
                    this.f118417b = r02;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1138057051, i10, -1, "com.meijer.mobile.singlepagecheckout.OrderCancellationWarningModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:611)");
                    }
                    C16307b.b(this.f118416a, this.f118417b.getButtons().getDismissIcon(), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, ji.R0 r02, Function1<? super z1.h, Unit> function1) {
                this.f118413a = localThemeScope;
                this.f118414b = r02;
                this.f118415c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1) {
                function1.invoke(z1.h.d.f105117a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1) {
                function1.invoke(z1.h.d.f105117a);
                function1.invoke(z1.h.v.f105138a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1) {
                function1.invoke(z1.h.d.f105117a);
                function1.invoke(z1.h.C12016b.f105115a);
                return Unit.f142422a;
            }

            public final void d(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(39277058, i10, -1, "com.meijer.mobile.singlepagecheckout.OrderCancellationWarningModal.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:599)");
                }
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarG = companion.g();
                LocalThemeScope localThemeScope = this.f118413a;
                ji.R0 r02 = this.f118414b;
                final Function1<z1.h, Unit> function1 = this.f118415c;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C5658d c5658d = C5658d.f48555a;
                MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarG, composer, 48);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
                InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), composer, 0);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion2, 1.0f, false, 2, null), composer, 0);
                q1.d.ModalButton dismiss = r02.getButtons().getDismiss();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.A2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return y2.b.a.e(function1);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(1138057051, true, new C1921a(localThemeScope, r02), composer, 54);
                int i11 = LocalThemeScope.f15770g;
                ni.E0.b(localThemeScope, dismiss, function0, composableLambdaC, composer, i11 | 3072 | (q1.d.ModalButton.f139963k << 3));
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer, 0);
                composer.v();
                C16307b.b(localThemeScope, r02.getIcons().getWarningIcon(), null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 7, null), composer, 0);
                q1.Label labelY = q1.Label.y(r02.getLabels().getHeading(), r02.getLabels().getHeading().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null);
                String strC = C16193g.c(C17135b.f162033m, composer, 0);
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, labelY, strC, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 7, null), composer, 0);
                ri.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), r02.getLabels().getBody().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, localThemeScope.getAdsSpacing().getNine().getDp(), 0.0f, 2, null)), null, null, null, 0, false, 0, null, null, 510, null), C16193g.c(C17135b.f162027j, composer, 0), null, composer, i11 | (i12 << 3), 4);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getEight().getDp(), 7, null), composer, 0);
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), 0.0f, 10, null);
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion.k(), composer, 0);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM);
                Function0<InterfaceC5811g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyA2, companion3.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
                Modifier modifierB = androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), 0.0f, localThemeScope.getAdsSpacing().getTen().getDp(), 1, null);
                C15860s0 c15860s0 = C15860s0.f151792a;
                String strC2 = C16193g.c(C17135b.f162031l, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function1);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.B2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return y2.b.a.f(function1);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                ni.P0.k(localThemeScope, c15860s0, strC2, (Function0) objB2, modifierB, null, false, 0L, false, composer, i11 | (C15860s0.f151793b << 3), 240);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFour().getDp(), 7, null), composer, 0);
                Modifier modifierB2 = androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), 0.0f, localThemeScope.getAdsSpacing().getTen().getDp(), 1, null);
                C15866v0 c15866v0 = C15866v0.f151806a;
                String strC3 = C16193g.c(C17135b.f162029k, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(function1);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.C2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return y2.b.a.g(function1);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                ni.P0.k(localThemeScope, c15866v0, strC3, (Function0) objB3, modifierB2, null, false, 0L, false, composer, i11 | (C15866v0.f151807b << 3), 240);
                C14802K.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), 7, null), composer, 0);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Function1<? super z1.h, Unit> function1) {
            this.f118411a = localThemeScope;
            this.f118412b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(z1.h.d.f105117a);
            return Unit.f142422a;
        }

        public final void b(ji.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1589896527, i10, -1, "com.meijer.mobile.singlepagecheckout.OrderCancellationWarningModal.<anonymous> (SinglePageCheckoutPage.kt:592)");
            }
            LocalThemeScope localThemeScope = this.f118411a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f118412b);
            final Function1<z1.h, Unit> function1 = this.f118412b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.z2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return y2.b.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16977b.b(localThemeScope, modalTemplate, (Function0) objB, null, ComposableLambdaKt.c(39277058, true, new a(this.f118411a, Assemble, this.f118412b), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118418a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f118419b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f118420c;

        c(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f118418a = localThemeScope;
            this.f118419b = checkoutViewState;
            this.f118420c = interfaceC5730l0;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-218888759, i10, -1, "com.meijer.mobile.singlepagecheckout.OrderLoadingState.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:445)");
            }
            LocalThemeScope localThemeScope = this.f118418a;
            Bi.o oVar = null;
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null));
            q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
            Bi.o oVar2 = Bi.o.f2584a;
            CheckoutViewState checkoutViewState = this.f118419b;
            InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f118420c;
            if (checkoutViewState.getLoadingState().getIsLoading() && !interfaceC5730l0.getValue().booleanValue()) {
                oVar = oVar2;
            }
            if (oVar == null) {
                oVar = Bi.o.f2588e;
            }
            Bi.o oVar3 = oVar;
            AbstractC5607a loadingMessage = this.f118419b.getLoadingState().getLoadingMessage();
            int i11 = AbstractC5607a.f45514b;
            Bi.m.e(localThemeScope, modifierFsUnmask, largeLoadingV2, oVar3, C6408b.a(loadingMessage, composer, i11), C6408b.a(this.f118419b.getLoadingState().getLoadingMessageBody(), composer, i11), null, composer, (q1.k.LargeV2.f140096f << 6) | LocalThemeScope.f15770g, 32);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
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
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118421a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12937l f118422b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<DeliveryContactInformationViewState> f118423c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f118424a;

            a(L1.h hVar) {
                this.f118424a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f118424a.getStart(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12937l f118425a;

            b(C12937l c12937l) {
                this.f118425a = c12937l;
            }

            public final void a() {
                this.f118425a.getDeliveryContactViewModel().K(H.g.b.f102384a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f118426a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118427b;

            c(L1.h hVar, LocalThemeScope localThemeScope) {
                this.f118426a = hVar;
                this.f118427b = localThemeScope;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), this.f118426a.getEnd(), this.f118427b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12937l f118428a;

            d(C12937l c12937l) {
                this.f118428a = c12937l;
            }

            public final void a() {
                this.f118428a.getDeliveryContactViewModel().K(H.g.j.f102394a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.y2$e$e, reason: collision with other inner class name */
        public static final class C1922e extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f118429f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1922e(L1.A a10) {
                super(1);
                this.f118429f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f118429f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f118430f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f118431g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f118432h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118433i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C12937l f118434j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1 f118435k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, C12937l c12937l, androidx.compose.runtime.z1 z1Var) {
                super(2);
                this.f118431g = nVar;
                this.f118432h = function0;
                this.f118433i = localThemeScope;
                this.f118434j = c12937l;
                this.f118435k = z1Var;
                this.f118430f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f118431g.getHelpersHashCode();
                this.f118431g.i();
                L1.n nVar = this.f118431g;
                composer.startReplaceGroup(-1142090136);
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
                C15866v0 c15866v0 = C15866v0.f151806a;
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100308s0, composer, 0);
                LocalThemeScope localThemeScope = this.f118433i;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f118434j);
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(this.f118434j);
                    composer.t(objB2);
                }
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                ni.P0.k(localThemeScope, c15866v0, strC, (Function0) objB2, modifierK, null, false, 0L, false, composer, i11 | (C15866v0.f151807b << 3), 240);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(hVarA) | composer.D(this.f118433i);
                Object objB3 = composer.B();
                if (zV2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new c(hVarA, this.f118433i);
                    composer.t(objB3);
                }
                composer.P();
                Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(nVar.k(companion, hVarC, (Function1) objB3), "Button", "save contact info");
                C15860s0 c15860s0 = C15860s0.f151792a;
                String strC2 = C16193g.c(com.meijer.mobile.meijer.Y.f99639Jd, composer, 0);
                boolean zIsValid = y2.X(this.f118435k).isValid();
                LocalThemeScope localThemeScope2 = this.f118433i;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f118434j);
                Object objB4 = composer.B();
                if (zD2 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new d(this.f118434j);
                    composer.t(objB4);
                }
                composer.P();
                ni.P0.k(localThemeScope2, c15860s0, strC2, (Function0) objB4, modifierFsAttribute, null, false, 0L, zIsValid, composer, i11 | (C15860s0.f151793b << 3), 112);
                composer.P();
                if (this.f118431g.getHelpersHashCode() != helpersHashCode) {
                    this.f118432h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        e(LocalThemeScope localThemeScope, C12937l c12937l, androidx.compose.runtime.z1<DeliveryContactInformationViewState> z1Var) {
            this.f118421a = localThemeScope;
            this.f118422b = c12937l;
            this.f118423c = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-129042417, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutPage.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:264)");
            }
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f118421a.getAdsSpacing().getFive().getDp(), 0.0f, this.f118421a.getAdsSpacing().getFive().getDp(), this.f118421a.getAdsSpacing().getFive().getDp(), 2, null), "Button", "cancel edit contact info");
            LocalThemeScope localThemeScope = this.f118421a;
            C12937l c12937l = this.f118422b;
            androidx.compose.runtime.z1<DeliveryContactInformationViewState> z1Var = this.f118423c;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierFsAttribute, false, new C1922e(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new f(nVar, 0, pairH.b(), localThemeScope, c12937l, z1Var)), pairH.a(), composer, 48, 0);
            composer.U();
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
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118436a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsCardDecorator f118437b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.review.z1 f118438c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<FulfillmentSlotsViewState> f118439d;

        g(LocalThemeScope localThemeScope, FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator, com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var, androidx.compose.runtime.z1<FulfillmentSlotsViewState> z1Var2) {
            this.f118436a = localThemeScope;
            this.f118437b = fulfillmentSlotsCardDecorator;
            this.f118438c = z1Var;
            this.f118439d = z1Var2;
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
            C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, this.f118436a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 13, null), composer, 0);
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "timeslot saved");
            C15860s0 c15860s0 = C15860s0.f151792a;
            String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99639Jd, composer, 0);
            boolean zIsValid = y2.J(this.f118439d).isValid();
            LocalThemeScope localThemeScope = this.f118436a;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f118437b) | composer.D(this.f118438c);
            final FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator = this.f118437b;
            final com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var = this.f118438c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.D2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return y2.g.c(fulfillmentSlotsCardDecorator, z1Var);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.P0.k(localThemeScope, c15860s0, strC, (Function0) objB, modifierFsAttribute, null, true, 0L, zIsValid, composer, 1572864 | LocalThemeScope.f15770g | (C15860s0.f151793b << 3), 80);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator, com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var) throws IOException {
            fulfillmentSlotsCardDecorator.getFulfillmentSlotsViewModel().e0(q1.g.k.f103084a);
            z1Var.r0(z1.h.m.f105126a);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends FunctionReferenceImpl implements Function1<C11932p.g, Unit> {
        h(Object obj) {
            super(1, obj, C11932p.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/PickupPersonFormViewModel$Action;)V", 0);
        }

        public final void a(C11932p.g p02) {
            Intrinsics.j(p02, "p0");
            ((C11932p) this.receiver).K(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C11932p.g gVar) {
            a(gVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118440a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12937l f118441b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z1<PickupPersonViewState> f118442c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f118443a;

            a(L1.h hVar) {
                this.f118443a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f118443a.getStart(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12937l f118444a;

            b(C12937l c12937l) {
                this.f118444a = c12937l;
            }

            public final void a() {
                this.f118444a.getPickupPersonFormViewModel().K(C11932p.g.b.f104289a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f118445a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118446b;

            c(L1.h hVar, LocalThemeScope localThemeScope) {
                this.f118445a = hVar;
                this.f118446b = localThemeScope;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), this.f118445a.getEnd(), this.f118446b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12937l f118447a;

            d(C12937l c12937l) {
                this.f118447a = c12937l;
            }

            public final void a() {
                this.f118447a.getPickupPersonFormViewModel().K(C11932p.g.m.f104309a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class e extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f118448f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(L1.A a10) {
                super(1);
                this.f118448f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f118448f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f118449f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f118450g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f118451h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118452i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C12937l f118453j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1 f118454k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, C12937l c12937l, androidx.compose.runtime.z1 z1Var) {
                super(2);
                this.f118450g = nVar;
                this.f118451h = function0;
                this.f118452i = localThemeScope;
                this.f118453j = c12937l;
                this.f118454k = z1Var;
                this.f118449f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f118450g.getHelpersHashCode();
                this.f118450g.i();
                L1.n nVar = this.f118450g;
                composer.startReplaceGroup(-1348740541);
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
                C15866v0 c15866v0 = C15866v0.f151806a;
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100308s0, composer, 0);
                LocalThemeScope localThemeScope = this.f118452i;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f118453j);
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(this.f118453j);
                    composer.t(objB2);
                }
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                ni.P0.k(localThemeScope, c15866v0, strC, (Function0) objB2, modifierK, null, false, 0L, false, composer, i11 | (C15866v0.f151807b << 3), 240);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(hVarA) | composer.D(this.f118452i);
                Object objB3 = composer.B();
                if (zV2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new c(hVarA, this.f118452i);
                    composer.t(objB3);
                }
                composer.P();
                Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(nVar.k(companion, hVarC, (Function1) objB3), "Button", "save contact info");
                C15860s0 c15860s0 = C15860s0.f151792a;
                String strC2 = C16193g.c(com.meijer.mobile.meijer.Y.f99639Jd, composer, 0);
                boolean zIsValid = y2.W(this.f118454k).isValid();
                LocalThemeScope localThemeScope2 = this.f118452i;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f118453j);
                Object objB4 = composer.B();
                if (zD2 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new d(this.f118453j);
                    composer.t(objB4);
                }
                composer.P();
                ni.P0.k(localThemeScope2, c15860s0, strC2, (Function0) objB4, modifierFsAttribute, null, false, 0L, zIsValid, composer, i11 | (C15860s0.f151793b << 3), 112);
                composer.P();
                if (this.f118450g.getHelpersHashCode() != helpersHashCode) {
                    this.f118451h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        i(LocalThemeScope localThemeScope, C12937l c12937l, androidx.compose.runtime.z1<PickupPersonViewState> z1Var) {
            this.f118440a = localThemeScope;
            this.f118441b = c12937l;
            this.f118442c = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1906463837, i10, -1, "com.meijer.mobile.singlepagecheckout.SinglePageCheckoutPage.<anonymous>.<anonymous> (SinglePageCheckoutPage.kt:176)");
            }
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f118440a.getAdsSpacing().getFive().getDp(), 0.0f, this.f118440a.getAdsSpacing().getFive().getDp(), this.f118440a.getAdsSpacing().getFive().getDp(), 2, null), "Button", "cancel edit contact info");
            LocalThemeScope localThemeScope = this.f118440a;
            C12937l c12937l = this.f118441b;
            androidx.compose.runtime.z1<PickupPersonViewState> z1Var = this.f118442c;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierFsAttribute, false, new e(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new f(nVar, 0, pairH.b(), localThemeScope, c12937l, z1Var)), pairH.a(), composer, 48, 0);
            composer.U();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j extends FunctionReferenceImpl implements Function1<H.g, Unit> {
        j(Object obj) {
            super(1, obj, com.meijer.mobile.meijer.activity.checkout.contactinformation.H.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/DeliveryContactInformationFormViewModel$Action;)V", 0);
        }

        public final void a(H.g p02) {
            Intrinsics.j(p02, "p0");
            ((com.meijer.mobile.meijer.activity.checkout.contactinformation.H) this.receiver).K(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(H.g gVar) {
            a(gVar);
            return Unit.f142422a;
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
            return Unit.f142422a;
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
            return Unit.f142422a;
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
            return Unit.f142422a;
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
            return Unit.f142422a;
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
            return Unit.f142422a;
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
    public static final void I(final Ji.LocalThemeScope r45, final com.meijer.mobile.singlepagecheckout.FulfillmentSlotsCardDecorator r46, final Rq.N r47, final com.meijer.mobile.singlepagecheckout.C12937l r48, final com.meijer.mobile.singlepagecheckout.C12906c r49, final com.meijer.mobile.meijer.activity.checkout.review.z1 r50, final boolean r51, final boolean r52, final com.meijer.mobile.meijer.activity.cart.entrynote.i r53, androidx.compose.ui.Modifier r54, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r55, final kotlin.jvm.functions.Function1<? super Qq.o, kotlin.Unit> r56, final kotlin.jvm.functions.Function0<kotlin.Unit> r57, final kotlin.jvm.functions.Function0<kotlin.Unit> r58, final p0.InterfaceC16183a r59, final p0.InterfaceC16183a r60, final p0.InterfaceC16183a r61, androidx.compose.runtime.Composer r62, final int r63, final int r64, final int r65) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.y2.I(Ji.M, com.meijer.mobile.singlepagecheckout.d0, Rq.N, com.meijer.mobile.singlepagecheckout.l, com.meijer.mobile.singlepagecheckout.c, com.meijer.mobile.meijer.activity.checkout.review.z1, boolean, boolean, com.meijer.mobile.meijer.activity.cart.entrynote.i, androidx.compose.ui.Modifier, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p0.a, p0.a, p0.a, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, modifier, checkoutViewState, interfaceC5730l0, interfaceC5730l02, function1, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, z10, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    private static final void E(final Ji.LocalThemeScope r16, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r17, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r18, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r19, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r20, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.y2.E(Ji.M, com.meijer.mobile.meijer.activity.checkout.review.D1, androidx.compose.runtime.l0, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, checkoutViewState, interfaceC5730l0, interfaceC5730l02, function1, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(com.meijer.mobile.meijer.activity.cart.entrynote.i iVar, String note) {
        Intrinsics.j(note, "note");
        iVar.E(note);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(com.meijer.mobile.meijer.activity.cart.entrynote.i iVar, String note) {
        Intrinsics.j(note, "note");
        iVar.A(new i.b.SetDeliveryNote(note));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(com.meijer.mobile.meijer.activity.cart.entrynote.i iVar) {
        iVar.A(i.b.a.f101799a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Rq.N n10, String cvv) {
        Intrinsics.j(cvv, "cvv");
        n10.e().invoke(cvv);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(LocalThemeScope localThemeScope, FulfillmentSlotsCardDecorator fulfillmentSlotsCardDecorator, Rq.N n10, C12937l c12937l, C12906c c12906c, com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var, boolean z10, boolean z11, com.meijer.mobile.meijer.activity.cart.entrynote.i iVar, Modifier modifier, InterfaceC5730l0 interfaceC5730l0, Function1 function1, Function0 function0, Function0 function02, InterfaceC16183a interfaceC16183a, InterfaceC16183a interfaceC16183a2, InterfaceC16183a interfaceC16183a3, int i10, int i11, int i12, Composer composer, int i13) throws IOException {
        I(localThemeScope, fulfillmentSlotsCardDecorator, n10, c12937l, c12906c, z1Var, z10, z11, iVar, modifier, interfaceC5730l0, function1, function0, function02, interfaceC16183a, interfaceC16183a2, interfaceC16183a3, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
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
    private static final void t(final Ji.LocalThemeScope r41, androidx.compose.ui.Modifier r42, com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r43, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r44, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r45, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.review.z1.h, kotlin.Unit> r46, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.y2.t(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, androidx.compose.runtime.l0, androidx.compose.runtime.l0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(z1.h it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
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
                    objB = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.i2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y2.C((z1.h) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function1 = (Function1) objB;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1824832593, i12, -1, "com.meijer.mobile.singlepagecheckout.OrderCancellationWarningModal (SinglePageCheckoutPage.kt:589)");
            }
            if (z10) {
                Ji.Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(1589896527, true, new b(localThemeScope, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (C14924a0.f139755b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Function1<? super z1.h, Unit> function12 = function1;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.j2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y2.D(localThemeScope, z10, function12, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
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
    public static final Unit M(C12937l c12937l) {
        c12937l.getPickupPersonFormViewModel().K(C11932p.g.c.f104290a);
        c12937l.getPickupPersonFormViewModel().K(C11932p.g.a.f104288a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(C12937l c12937l) {
        c12937l.getDeliveryContactViewModel().K(H.g.c.f102385a);
        c12937l.getDeliveryContactViewModel().K(H.g.a.f102383a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(com.meijer.mobile.meijer.activity.checkout.review.z1 z1Var) throws IOException {
        if (!z1Var.h0().getValue().booleanValue()) {
            z1Var.J0(true);
            z1Var.r0(new z1.h.SubmitOrderAction(true));
        } else {
            z1Var.r0(z1.h.v.f105138a);
        }
        return Unit.f142422a;
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
            z1Var.r0(z1.h.v.f105138a);
        }
        return Unit.f142422a;
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

    private static final boolean a0(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final C14209i w(InterfaceC15108k interfaceC15108k) {
        return interfaceC15108k.getValue();
    }

    private static final float x(InterfaceC15105h interfaceC15105h) {
        return interfaceC15105h.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float y(InterfaceC15105h interfaceC15105h) {
        return x(interfaceC15105h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(CheckoutAnimations checkoutAnimations, Function1 function1, Function1 function12, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02) {
        if (checkoutAnimations.getIsTimeSlotError()) {
            function1.invoke(z1.h.j.f105123a);
            function12.invoke(q1.g.b.f103075a);
            function1.invoke(z1.h.m.f105126a);
        } else {
            function1.invoke(new z1.h.SubmitOrderAction(false));
        }
        function1.invoke(new z1.h.SetCheckoutAnimations(false, null));
        interfaceC5730l0.setValue(Boolean.FALSE);
        interfaceC5730l02.setValue(Boolean.TRUE);
        return Unit.f142422a;
    }
}
