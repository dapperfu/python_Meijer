package Rq;

import Bm.C2992f;
import Ik.Validation;
import Ki.C;
import Ki.LocalThemeScope;
import Rq.q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.payment.CardDetailDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.Z;
import hk.PaymentOption;
import j0.InterfaceC14902f;
import java.util.Iterator;
import java.util.List;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16200v0;
import oi.P0;
import p1.C16338g;
import pi.C16453n;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a¸\u0001\u0010\u0019\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\t2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0018\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\u000e\u0010\u001b\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "decoratorList", "", "isEditMode", "displayError", "Lkotlin/Function1;", "", "updateDisplayError", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "viewState", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "onAction", "Lkotlin/ParameterName;", "name", "isSaveSlotAvailable", "onUseDifferentCardClicked", "", "onSaveCardClicked", "Lkotlin/Function0;", "onCancelClicked", "existingSelectedCardId", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;ZZLkotlin/jvm/functions/Function1;Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "selectedCardId", "lastAction", "errorMessage", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class q0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f33945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f33946c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f33947d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<PaymentOptionDecorator> f33948e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f33949f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f33950g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f33951h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f33952i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Z.i, Unit> f33953j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f33954k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Rq.q0$a$a, reason: collision with other inner class name */
        static final class C0758a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<PaymentOptionDecorator> f33955a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33956b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f33957c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Z.PaymentOptionsViewState f33958d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f33959e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f33960f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f33961g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<Z.i, Unit> f33962h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f33963i;

            /* JADX WARN: Multi-variable type inference failed */
            C0758a(List<PaymentOptionDecorator> list, LocalThemeScope localThemeScope, Function1<? super Boolean, Unit> function1, Z.PaymentOptionsViewState paymentOptionsViewState, boolean z10, InterfaceC5872l0<String> interfaceC5872l0, Function1<? super Boolean, Unit> function12, Function1<? super Z.i, Unit> function13, boolean z11) {
                this.f33955a = list;
                this.f33956b = localThemeScope;
                this.f33957c = function1;
                this.f33958d = paymentOptionsViewState;
                this.f33959e = z10;
                this.f33960f = interfaceC5872l0;
                this.f33961g = function12;
                this.f33962h = function13;
                this.f33963i = z11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(String it) {
                Intrinsics.j(it, "it");
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(Z.PaymentOptionsViewState paymentOptionsViewState, PaymentOptionDecorator paymentOptionDecorator, Function1 function1, String cvv) {
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
            public static final Unit p() {
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q() {
                return Unit.f143329a;
            }

            public final void g(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                Composer composer2 = composer;
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer2.j()) {
                    composer2.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-216807424, i10, -1, "com.meijer.mobile.singlepagecheckout.payment.PaymentSavedCardListScreen.<anonymous>.<anonymous> (PaymentSavedCardListScreen.kt:81)");
                }
                composer2.startReplaceGroup(2101465751);
                List<PaymentOptionDecorator> list = this.f33955a;
                final Z.PaymentOptionsViewState paymentOptionsViewState = this.f33958d;
                LocalThemeScope localThemeScope = this.f33956b;
                boolean z10 = this.f33959e;
                final InterfaceC5872l0<String> interfaceC5872l0 = this.f33960f;
                final Function1<Boolean, Unit> function1 = this.f33961g;
                final Function1<Z.i, Unit> function12 = this.f33962h;
                boolean z11 = this.f33963i;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    final PaymentOptionDecorator paymentOptionDecorator = (PaymentOptionDecorator) it.next();
                    PaymentOption paymentOptionE = paymentOptionsViewState.getPaymentOptions().k().e();
                    String cardCvNumber = paymentOptionE != null ? paymentOptionE.getCardCvNumber() : null;
                    if (cardCvNumber == null) {
                        cardCvNumber = "";
                    }
                    String str = cardCvNumber;
                    CardDetailDecorator cardDetailDecorator = paymentOptionDecorator.getCardDetailDecorator();
                    boolean zE = Intrinsics.e(q0.e(interfaceC5872l0), paymentOptionDecorator.getId());
                    AbstractC6392a abstractC6392aE = paymentOptionDecorator.e();
                    composer2.startReplaceGroup(-1746271574);
                    boolean zV = composer2.V(interfaceC5872l0) | composer2.D(paymentOptionDecorator) | composer2.V(function1);
                    Object objB = composer2.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Rq.k0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return q0.a.C0758a.k(paymentOptionDecorator, function1, interfaceC5872l0);
                            }
                        };
                        composer2.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer2.P();
                    composer2.startReplaceGroup(-1746271574);
                    boolean zD = composer2.D(paymentOptionsViewState) | composer2.D(paymentOptionDecorator) | composer2.V(function12);
                    LocalThemeScope localThemeScope2 = localThemeScope;
                    Object objB2 = composer2.B();
                    if (zD || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: Rq.l0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return q0.a.C0758a.o(paymentOptionsViewState, paymentOptionDecorator, function12, (String) obj);
                            }
                        };
                        composer2.t(objB2);
                    }
                    Function1 function13 = (Function1) objB2;
                    composer2.P();
                    composer2.startReplaceGroup(1849434622);
                    Object objB3 = composer2.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB3 == companion.a()) {
                        objB3 = new Function0() { // from class: Rq.m0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return q0.a.C0758a.p();
                            }
                        };
                        composer2.t(objB3);
                    }
                    Function0 function02 = (Function0) objB3;
                    composer2.P();
                    composer2.startReplaceGroup(1849434622);
                    Object objB4 = composer2.B();
                    Z.PaymentOptionsViewState paymentOptionsViewState2 = paymentOptionsViewState;
                    if (objB4 == companion.a()) {
                        objB4 = new Function0() { // from class: Rq.n0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return q0.a.C0758a.q();
                            }
                        };
                        composer2.t(objB4);
                    }
                    Function0 function03 = (Function0) objB4;
                    composer2.P();
                    composer2.startReplaceGroup(1849434622);
                    Object objB5 = composer2.B();
                    if (objB5 == companion.a()) {
                        objB5 = new Function1() { // from class: Rq.o0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return q0.a.C0758a.l((String) obj);
                            }
                        };
                        composer2.t(objB5);
                    }
                    composer2.P();
                    int i11 = LocalThemeScope.f17314g | 114819072;
                    int i12 = C.g.f17069d;
                    int i13 = AbstractC6392a.f60445b;
                    localThemeScope = localThemeScope2;
                    Function1<Boolean, Unit> function14 = function1;
                    boolean z12 = z11;
                    M.c(localThemeScope, paymentOptionDecorator, z10, function0, function13, z12, function02, function03, false, cardDetailDecorator, zE, true, abstractC6392aE, null, str, null, false, (Function1) objB5, composer, i11 | ((i12 | i13) << 27), (i13 << 6) | 12582960, 53248);
                    z11 = z12;
                    composer2 = composer;
                    paymentOptionsViewState = paymentOptionsViewState2;
                    interfaceC5872l0 = interfaceC5872l0;
                    function1 = function14;
                    function12 = function12;
                }
                composer2.P();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                C16200v0 c16200v0 = C16200v0.f154265a;
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101109p, composer2, 0);
                String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f101109p, composer2, 0);
                LocalThemeScope localThemeScope3 = this.f33956b;
                composer2.startReplaceGroup(-1633490746);
                boolean zV2 = composer2.V(this.f33957c) | composer2.D(this.f33955a);
                final Function1<Boolean, Unit> function15 = this.f33957c;
                final List<PaymentOptionDecorator> list2 = this.f33955a;
                Object objB6 = composer2.B();
                if (zV2 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function0() { // from class: Rq.p0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return q0.a.C0758a.r(function15, list2);
                        }
                    };
                    composer2.t(objB6);
                }
                composer2.P();
                P0.k(localThemeScope3, c16200v0, strC2, (Function0) objB6, modifierH, strC, false, 0L, false, composer2, LocalThemeScope.f17314g | 24576 | (C16200v0.f154266b << 3), 224);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                g(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(PaymentOptionDecorator paymentOptionDecorator, Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
                q0.f(interfaceC5872l0, paymentOptionDecorator.getId());
                function1.invoke(Boolean.FALSE);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(Function1 function1, List list) {
                boolean z10;
                if (list.size() < 5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                function1.invoke(Boolean.valueOf(z10));
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5872l0<String> interfaceC5872l0, Function0<Unit> function0, List<PaymentOptionDecorator> list, Function1<? super Boolean, Unit> function12, Z.PaymentOptionsViewState paymentOptionsViewState, boolean z10, Function1<? super Boolean, Unit> function13, Function1<? super Z.i, Unit> function14, boolean z11) {
            this.f33944a = localThemeScope;
            this.f33945b = function1;
            this.f33946c = interfaceC5872l0;
            this.f33947d = function0;
            this.f33948e = list;
            this.f33949f = function12;
            this.f33950g = paymentOptionsViewState;
            this.f33951h = z10;
            this.f33952i = function13;
            this.f33953j = function14;
            this.f33954k = z11;
        }

        public final void c(InterfaceC14902f AdsColumn, Composer composer, int i10) {
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
                ComposerKt.U(64709942, i11, -1, "com.meijer.mobile.singlepagecheckout.payment.PaymentSavedCardListScreen.<anonymous> (PaymentSavedCardListScreen.kt:72)");
            }
            LocalThemeScope localThemeScope = this.f33944a;
            Modifier.Companion companion = Modifier.INSTANCE;
            q1.Column column = new q1.Column(androidx.compose.foundation.b.d(d0.T.g(androidx.compose.foundation.layout.D.k(InterfaceC14902f.b(AdsColumn, companion, 1.0f, false, 2, null), this.f33944a.getAdsSpacing().getThree().getDp(), 0.0f, 2, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null), this.f33944a.getAdsColors().getAdsColorInverse().getColor(), null, 2, null), null, null, 6, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-216807424, true, new C0758a(this.f33948e, this.f33944a, this.f33949f, this.f33950g, this.f33951h, this.f33946c, this.f33952i, this.f33953j, this.f33954k), composer, 54);
            int i12 = LocalThemeScope.f17314g;
            C16453n.e(localThemeScope, column, composableLambdaC, composer, i12 | 384 | (q1.Column.f142240d << 3));
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "changeCard_saveButton");
            Modifier modifierFsAttribute2 = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "changeCard_cancelButton");
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100558Md, composer, 0);
            String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f101170s0, composer, 0);
            LocalThemeScope localThemeScope2 = this.f33944a;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f33945b) | composer.V(this.f33946c);
            final Function1<String, Unit> function1 = this.f33945b;
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f33946c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Rq.i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q0.a.d(function1, interfaceC5872l0);
                    }
                };
                composer.t(objB);
            }
            Function0 function0 = (Function0) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f33947d);
            final Function0<Unit> function02 = this.f33947d;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: Rq.j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q0.a.e(function02);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2992f.c(localThemeScope2, modifierH, modifierFsAttribute, modifierFsAttribute2, strC, strC2, function0, (Function0) objB2, composer, i12 | 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            c(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
            function1.invoke(q0.e(interfaceC5872l0));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(Ki.LocalThemeScope r29, androidx.compose.ui.Modifier r30, final java.util.List<com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator> r31, final boolean r32, final boolean r33, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r34, final com.meijer.mobile.meijer.activity.checkout.payment.Z.PaymentOptionsViewState r35, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.payment.Z.i, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, final java.lang.String r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.q0.c(Ki.M, androidx.compose.ui.Modifier, java.util.List, boolean, boolean, kotlin.jvm.functions.Function1, com.meijer.mobile.meijer.activity.checkout.payment.Z$k, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5872l0 d() {
        return t1.e("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, List list, boolean z10, boolean z11, Function1 function1, Z.PaymentOptionsViewState paymentOptionsViewState, Function1 function12, Function1 function13, Function1 function14, Function0 function0, String str, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, list, z10, z11, function1, paymentOptionsViewState, function12, function13, function14, function0, str, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }
}
