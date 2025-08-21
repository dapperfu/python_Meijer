package Fm;

import Bm.C2986c;
import Bm.F0;
import Bm.t0;
import Fm.p;
import Ik.Validation;
import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.payment.CardDetailDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.Z;
import hk.PaymentOption;
import j0.InterfaceC14902f;
import java.util.Iterator;
import java.util.List;
import ki.InterfaceC15154X;
import ki.InterfaceC15160b0;
import ki.Q0;
import ki.a1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aÞ\u0001\u0010\u001e\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "viewState", "", "isEditMode", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isSaveSlotAvailable", "", "onUseDifferentCardClicked", "Lkotlin/Function0;", "onAddEbtCardClicked", "", "Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "decoratorList", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "onAction", "displayError", "updateDisplayError", "displayEbtFields", "Lbk/a;", "ebtCardMask", "ebtBalance", "onRemoveEbtCard", "onChangeCard", "", "ebtCardHolderName", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;ZLbk/a;Lbk/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "e", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f10705a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f10706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f10707c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f10708d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f10709e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10710f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<PaymentOptionDecorator> f10711g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f10712h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f10713i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f10714j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f10715k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<Z.i, Unit> f10716l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f10717m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f10718n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f10719o;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fm.p$a$a, reason: collision with other inner class name */
        static final class C0173a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f10720a;

            C0173a(LocalThemeScope localThemeScope) {
                this.f10720a = localThemeScope;
            }

            public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(2017514154, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.compose.CheckoutPaymentOptionsScreen.<anonymous>.<anonymous>.<anonymous> (CheckoutPaymentOptionsScreen.kt:108)");
                }
                String strC = C16338g.c(Y.f100911f0, composer, 0);
                Di.j.i(this.f10720a, null, C16338g.c(Y.f100891e0, composer, 0), strC, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 17);
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
        a(boolean z10, Z.PaymentOptionsViewState paymentOptionsViewState, LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, boolean z11, List<PaymentOptionDecorator> list, String str, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Function0<Unit> function02, Function1<? super Z.i, Unit> function12, Function1<? super Boolean, Unit> function13, boolean z12, Function0<Unit> function03) {
            this.f10705a = z10;
            this.f10706b = paymentOptionsViewState;
            this.f10707c = localThemeScope;
            this.f10708d = abstractC6392a;
            this.f10709e = abstractC6392a2;
            this.f10710f = z11;
            this.f10711g = list;
            this.f10712h = str;
            this.f10713i = function0;
            this.f10714j = function1;
            this.f10715k = function02;
            this.f10716l = function12;
            this.f10717m = function13;
            this.f10718n = z12;
            this.f10719o = function03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q() {
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
        public static final Unit x(String it) {
            Intrinsics.j(it, "it");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit z() {
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            p(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void p(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            float f10;
            Z.PaymentOptionsViewState paymentOptionsViewState;
            Function1<Z.i, Unit> function1;
            Function1<Boolean, Unit> function12;
            boolean z10;
            Function0<Unit> function0;
            Z.PaymentOptionsViewState paymentOptionsViewState2;
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-299795679, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.compose.CheckoutPaymentOptionsScreen.<anonymous> (CheckoutPaymentOptionsScreen.kt:88)");
            }
            Bm.A.c(this.f10705a, this.f10706b.getCheckoutFlowState(), false, composer, 0, 4);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f11 = 16;
            float f12 = 8;
            Modifier modifierL = D.l(companion, H1.h.p(f12), H1.h.p(f11), H1.h.p(f12), H1.h.p(f12));
            String strC = C16338g.c(Y.f101010k0, composer, 0);
            C.b.e.c cVar = C.b.e.c.f16973e;
            LocalThemeScope localThemeScope = this.f10707c;
            int i11 = LocalThemeScope.f17314g;
            F0.b(localThemeScope, strC, modifierL, cVar, null, true, composer, 196608 | i11 | (C.b.e.c.f16974f << 9), 8);
            Composer composer2 = composer;
            composer2.startReplaceGroup(-340821616);
            if (this.f10708d == null || this.f10709e == null || !this.f10710f) {
                f10 = f12;
            } else {
                composer2.startReplaceGroup(-340820055);
                if (this.f10711g.isEmpty()) {
                    Modifier modifierL2 = D.l(companion, H1.h.p(f12), H1.h.p(f11), H1.h.p(f12), H1.h.p(f12));
                    LocalThemeScope localThemeScope2 = this.f10707c;
                    MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5859f.a(composer2, 0);
                    InterfaceC5884s interfaceC5884sR = composer2.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierL2);
                    InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion2.a();
                    if (composer2.k() == null) {
                        C5859f.c();
                    }
                    composer2.F();
                    if (composer2.getInserting()) {
                        composer2.I(function0A);
                    } else {
                        composer2.s();
                    }
                    Composer composerA = D1.a(composer2);
                    D1.c(composerA, measurePolicyG, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C5806j c5806j = C5806j.f48836a;
                    Q.e(localThemeScope2, a1.f142015a, ComposableLambdaKt.c(2017514154, true, new C0173a(localThemeScope2), composer2, 54), composer2, i11 | 384 | (a1.f142016b << 3));
                    composer2.v();
                }
                composer2.P();
                String strC2 = C16338g.c(Y.f101263wd, composer2, 0);
                CardDetailDecorator cardDetailDecorator = new CardDetailDecorator(C.g.f.f17076e, this.f10709e, this.f10712h, C16338g.c(Y.f100548M3, composer2, 0));
                LocalThemeScope localThemeScope3 = this.f10707c;
                boolean z11 = this.f10705a;
                composer2.startReplaceGroup(1849434622);
                Object objB = composer2.B();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objB == companion3.a()) {
                    objB = new Function0() { // from class: Fm.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p.a.q();
                        }
                    };
                    composer2.t(objB);
                }
                Function0 function02 = (Function0) objB;
                composer2.P();
                composer2.startReplaceGroup(1849434622);
                Object objB2 = composer2.B();
                if (objB2 == companion3.a()) {
                    objB2 = new Function1() { // from class: Fm.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return p.a.x((String) obj);
                        }
                    };
                    composer2.t(objB2);
                }
                Function1 function13 = (Function1) objB2;
                composer2.P();
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(this.f10713i);
                final Function0<Unit> function03 = this.f10713i;
                Object objB3 = composer2.B();
                if (zV || objB3 == companion3.a()) {
                    objB3 = new Function0() { // from class: Fm.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p.a.y(function03);
                        }
                    };
                    composer2.t(objB3);
                }
                Function0 function04 = (Function0) objB3;
                composer2.P();
                composer2.startReplaceGroup(1849434622);
                Object objB4 = composer2.B();
                if (objB4 == companion3.a()) {
                    objB4 = new Function0() { // from class: Fm.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p.a.z();
                        }
                    };
                    composer2.t(objB4);
                }
                composer2.P();
                AbstractC6392a abstractC6392a = this.f10708d;
                int i12 = i11 | 1794432;
                int i13 = C.g.f17069d;
                int i14 = AbstractC6392a.f60445b;
                f10 = f12;
                t0.c(localThemeScope3, null, null, z11, function02, function13, false, null, strC2, function04, (Function0) objB4, true, cardDetailDecorator, false, false, abstractC6392a, composer, i12, ((i13 | i14) << 6) | 27702 | (i14 << 15), 65);
                composer2 = composer;
            }
            composer2.P();
            composer2.startReplaceGroup(-340766836);
            List<PaymentOptionDecorator> list = this.f10711g;
            final Z.PaymentOptionsViewState paymentOptionsViewState3 = this.f10706b;
            LocalThemeScope localThemeScope4 = this.f10707c;
            boolean z12 = this.f10705a;
            final Function1<Z.i, Unit> function14 = this.f10716l;
            final Function1<Boolean, Unit> function15 = this.f10717m;
            boolean z13 = this.f10718n;
            final Function0<Unit> function05 = this.f10719o;
            for (final PaymentOptionDecorator paymentOptionDecorator : list) {
                composer2.startReplaceGroup(-340765358);
                if (paymentOptionDecorator.getIsSelected()) {
                    PaymentOption paymentOptionE = paymentOptionsViewState3.getPaymentOptions().k().e();
                    String cardCvNumber = paymentOptionE != null ? paymentOptionE.getCardCvNumber() : null;
                    if (cardCvNumber == null) {
                        cardCvNumber = "";
                    }
                    String strC3 = C16338g.c(Y.f100352C0, composer2, 0);
                    CardDetailDecorator cardDetailDecorator2 = paymentOptionDecorator.getCardDetailDecorator();
                    AbstractC6392a abstractC6392aE = paymentOptionDecorator.e();
                    composer2.startReplaceGroup(-1224400529);
                    boolean zD = composer2.D(paymentOptionsViewState3) | composer2.D(paymentOptionDecorator) | composer2.V(function14) | composer2.V(function15);
                    Object objB5 = composer2.B();
                    if (zD || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new Function0() { // from class: Fm.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return p.a.r(paymentOptionsViewState3, function15, paymentOptionDecorator, function14);
                            }
                        };
                        composer2.t(objB5);
                    }
                    Function0 function06 = (Function0) objB5;
                    composer2.P();
                    composer2.startReplaceGroup(-1746271574);
                    boolean zD2 = composer2.D(paymentOptionsViewState3) | composer2.D(paymentOptionDecorator) | composer2.V(function14);
                    Object objB6 = composer2.B();
                    if (zD2 || objB6 == Composer.INSTANCE.a()) {
                        objB6 = new Function1() { // from class: Fm.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return p.a.s(paymentOptionsViewState3, paymentOptionDecorator, function14, (String) obj);
                            }
                        };
                        composer2.t(objB6);
                    }
                    Function1 function16 = (Function1) objB6;
                    composer2.P();
                    composer2.startReplaceGroup(1849434622);
                    Object objB7 = composer2.B();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    LocalThemeScope localThemeScope5 = localThemeScope4;
                    if (objB7 == companion4.a()) {
                        objB7 = new Function0() { // from class: Fm.l
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return p.a.t();
                            }
                        };
                        composer2.t(objB7);
                    }
                    Function0 function07 = (Function0) objB7;
                    composer2.P();
                    composer2.startReplaceGroup(5004770);
                    boolean zV2 = composer2.V(function05);
                    Object objB8 = composer2.B();
                    if (zV2) {
                        paymentOptionsViewState2 = paymentOptionsViewState3;
                    } else {
                        paymentOptionsViewState2 = paymentOptionsViewState3;
                        if (objB8 == companion4.a()) {
                        }
                        composer2.P();
                        int i15 = LocalThemeScope.f17314g | 805306368;
                        int i16 = C.g.f17069d;
                        int i17 = AbstractC6392a.f60445b;
                        localThemeScope4 = localThemeScope5;
                        Function1<Boolean, Unit> function17 = function15;
                        z10 = z13;
                        function1 = function14;
                        function0 = function05;
                        function12 = function17;
                        paymentOptionsViewState = paymentOptionsViewState2;
                        t0.c(localThemeScope4, null, paymentOptionDecorator, z12, function06, function16, z10, cardCvNumber, strC3, function07, (Function0) objB8, false, cardDetailDecorator2, false, false, abstractC6392aE, composer, i15, ((i16 | i17) << 6) | 27696 | (i17 << 15), 1);
                        composer2 = composer;
                    }
                    objB8 = new Function0() { // from class: Fm.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p.a.u(function05);
                        }
                    };
                    composer2.t(objB8);
                    composer2.P();
                    int i152 = LocalThemeScope.f17314g | 805306368;
                    int i162 = C.g.f17069d;
                    int i172 = AbstractC6392a.f60445b;
                    localThemeScope4 = localThemeScope5;
                    Function1<Boolean, Unit> function172 = function15;
                    z10 = z13;
                    function1 = function14;
                    function0 = function05;
                    function12 = function172;
                    paymentOptionsViewState = paymentOptionsViewState2;
                    t0.c(localThemeScope4, null, paymentOptionDecorator, z12, function06, function16, z10, cardCvNumber, strC3, function07, (Function0) objB8, false, cardDetailDecorator2, false, false, abstractC6392aE, composer, i152, ((i162 | i172) << 6) | 27696 | (i172 << 15), 1);
                    composer2 = composer;
                } else {
                    paymentOptionsViewState = paymentOptionsViewState3;
                    function1 = function14;
                    function12 = function15;
                    z10 = z13;
                    function0 = function05;
                }
                composer2.P();
                z13 = z10;
                paymentOptionsViewState3 = paymentOptionsViewState;
                function15 = function12;
                function05 = function0;
                function14 = function1;
            }
            composer2.P();
            LocalThemeScope localThemeScope6 = this.f10707c;
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion5, "Button", "selectPayment_addCardButton");
            String strC4 = C16338g.c(Y.f101109p, composer2, 0);
            composer2.startReplaceGroup(-1633490746);
            boolean zV3 = composer2.V(this.f10714j) | composer2.D(this.f10711g);
            final Function1<Boolean, Unit> function18 = this.f10714j;
            final List<PaymentOptionDecorator> list2 = this.f10711g;
            Object objB9 = composer2.B();
            if (zV3 || objB9 == Composer.INSTANCE.a()) {
                objB9 = new Function0() { // from class: Fm.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.a.v(function18, list2);
                    }
                };
                composer2.t(objB9);
            }
            composer2.P();
            int i18 = LocalThemeScope.f17314g;
            C2986c.c(localThemeScope6, modifierFsAttribute, strC4, null, (Function0) objB9, composer2, i18, 4);
            Composer composer3 = composer2;
            if (this.f10710f && this.f10708d == null) {
                Modifier modifierFsAttribute2 = FullStoryAnnotationsKt.fsAttribute(D.m(companion5, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null), "Button", "selectPayment_addEbtButton");
                String strC5 = C16338g.c(Y.f101009k, composer3, 0);
                String strC6 = C16338g.c(Y.f101124pe, composer3, 0);
                LocalThemeScope localThemeScope7 = this.f10707c;
                composer3.startReplaceGroup(5004770);
                boolean zV4 = composer3.V(this.f10715k);
                final Function0<Unit> function08 = this.f10715k;
                Object objB10 = composer3.B();
                if (zV4 || objB10 == Composer.INSTANCE.a()) {
                    objB10 = new Function0() { // from class: Fm.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p.a.w(function08);
                        }
                    };
                    composer3.t(objB10);
                }
                composer3.P();
                C2986c.c(localThemeScope7, modifierFsAttribute2, strC5, strC6, (Function0) objB10, composer, i18, 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Z.PaymentOptionsViewState paymentOptionsViewState, Function1 function1, PaymentOptionDecorator paymentOptionDecorator, Function1 function12) {
            Object next;
            PaymentOption paymentOption;
            Iterator<T> it = paymentOptionsViewState.getPaymentOptions().h().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.e(((PaymentOption) ((Validation) next).e()).getId(), paymentOptionDecorator.getId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Validation validation = (Validation) next;
            if (validation != null && (paymentOption = (PaymentOption) validation.e()) != null) {
                function12.invoke(new Z.i.SetPaymentMethodAction(paymentOption));
            }
            function1.invoke(Boolean.FALSE);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, List list) {
            boolean z10;
            if (list.size() < 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            function1.invoke(Boolean.valueOf(z10));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f10721a;

        b(LocalThemeScope localThemeScope) {
            this.f10721a = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1115739741, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.compose.LoadingIndicator.<anonymous>.<anonymous> (CheckoutPaymentOptionsScreen.kt:217)");
            }
            q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.e(this.f10721a, FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoadingV2, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.LargeV2.f142351f << 6), 56);
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(Ki.LocalThemeScope r39, androidx.compose.ui.Modifier r40, final com.meijer.mobile.meijer.activity.checkout.payment.Z.PaymentOptionsViewState r41, final boolean r42, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r43, final kotlin.jvm.functions.Function0<kotlin.Unit> r44, final java.util.List<com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator> r45, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.payment.Z.i, kotlin.Unit> r46, final boolean r47, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r48, boolean r49, final bk.AbstractC6392a r50, final bk.AbstractC6392a r51, final kotlin.jvm.functions.Function0<kotlin.Unit> r52, final kotlin.jvm.functions.Function0<kotlin.Unit> r53, final java.lang.String r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fm.p.c(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.payment.Z$k, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.util.List, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, boolean, bk.a, bk.a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, Z.PaymentOptionsViewState paymentOptionsViewState, boolean z10, Function1 function1, Function0 function0, List list, Function1 function12, boolean z11, Function1 function13, boolean z12, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, Function0 function02, Function0 function03, String str, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, paymentOptionsViewState, z10, function1, function0, list, function12, z11, function13, z12, abstractC6392a, abstractC6392a2, function02, function03, str, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void e(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1820735800);
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
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1820735800, i12, -1, "com.meijer.mobile.meijer.activity.checkout.payment.compose.LoadingIndicator (CheckoutPaymentOptionsScreen.kt:212)");
            }
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-1115739741, true, new b(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Fm.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.f(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
