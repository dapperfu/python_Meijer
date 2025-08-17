package Em;

import Am.C2887f;
import Am.C2893i;
import Em.A;
import Hk.Validation;
import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.Z;
import d0.T;
import gk.PaymentOption;
import j0.InterfaceC14814f;
import java.util.Iterator;
import java.util.List;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;
import p1.C16193g;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aÐ\u0001\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u001a\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e²\u0006\u000e\u0010\u001d\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "headerText", "Lkotlin/Function0;", "", "onClose", "", "Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "decoratorList", "", "isEditMode", "displayError", "Lkotlin/Function1;", "updateDisplayError", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "viewState", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "onAction", "onSaveCardClicked", "onCancelClicked", "Lkotlin/ParameterName;", "name", "isSaveSlotAvailable", "onUseDifferentCardClicked", "existingSelectedCardId", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/List;ZZLkotlin/jvm/functions/Function1;Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "selectedCardId", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class A {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f9197a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f9199c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f9200d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f9201e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f9202f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<PaymentOptionDecorator> f9203g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f9204h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Z.PaymentOptionsViewState f9205i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f9206j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f9207k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<Z.i, Unit> f9208l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f9209m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Em.A$a$a, reason: collision with other inner class name */
        static final class C0128a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<PaymentOptionDecorator> f9210a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f9211b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f9212c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Z.PaymentOptionsViewState f9213d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f9214e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f9215f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f9216g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<Z.i, Unit> f9217h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f9218i;

            /* JADX WARN: Multi-variable type inference failed */
            C0128a(List<PaymentOptionDecorator> list, LocalThemeScope localThemeScope, Function1<? super Boolean, Unit> function1, Z.PaymentOptionsViewState paymentOptionsViewState, boolean z10, InterfaceC5730l0<String> interfaceC5730l0, Function1<? super Boolean, Unit> function12, Function1<? super Z.i, Unit> function13, boolean z11) {
                this.f9210a = list;
                this.f9211b = localThemeScope;
                this.f9212c = function1;
                this.f9213d = paymentOptionsViewState;
                this.f9214e = z10;
                this.f9215f = interfaceC5730l0;
                this.f9216g = function12;
                this.f9217h = function13;
                this.f9218i = z11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(Z.PaymentOptionsViewState paymentOptionsViewState, PaymentOptionDecorator paymentOptionDecorator, Function1 function1, String cvv) {
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
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l() {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o() {
                return Unit.f142422a;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x014d  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0155 A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void f(j0.InterfaceC14814f r28, androidx.compose.runtime.Composer r29, int r30) {
                /*
                    Method dump skipped, instructions count: 532
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: Em.A.a.C0128a.f(j0.f, androidx.compose.runtime.Composer, int):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                f(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(PaymentOptionDecorator paymentOptionDecorator, Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
                A.f(interfaceC5730l0, paymentOptionDecorator.getId());
                function1.invoke(Boolean.FALSE);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(Function1 function1, List list) {
                boolean z10;
                if (list.size() < 5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                function1.invoke(Boolean.valueOf(z10));
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, String str, Function0<Unit> function0, Function1<? super String, Unit> function1, InterfaceC5730l0<String> interfaceC5730l0, Function0<Unit> function02, List<PaymentOptionDecorator> list, Function1<? super Boolean, Unit> function12, Z.PaymentOptionsViewState paymentOptionsViewState, boolean z10, Function1<? super Boolean, Unit> function13, Function1<? super Z.i, Unit> function14, boolean z11) {
            this.f9197a = localThemeScope;
            this.f9198b = str;
            this.f9199c = function0;
            this.f9200d = function1;
            this.f9201e = interfaceC5730l0;
            this.f9202f = function02;
            this.f9203g = list;
            this.f9204h = function12;
            this.f9205i = paymentOptionsViewState;
            this.f9206j = z10;
            this.f9207k = function13;
            this.f9208l = function14;
            this.f9209m = z11;
        }

        public final void d(InterfaceC14814f AdsColumn, Composer composer, int i10) {
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
                ComposerKt.U(1465412025, i11, -1, "com.meijer.mobile.meijer.activity.checkout.payment.compose.PaymentSavedCardListScreen.<anonymous> (PaymentSavedCardListScreen.kt:72)");
            }
            LocalThemeScope localThemeScope = this.f9197a;
            String str = this.f9198b;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f9199c);
            final Function0<Unit> function0 = this.f9199c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Em.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return A.a.e(function0);
                    }
                };
                composer.t(objB);
            }
            Function0 function02 = (Function0) objB;
            composer.P();
            int i12 = LocalThemeScope.f15770g;
            C2893i.c(localThemeScope, null, str, function02, composer, i12, 1);
            LocalThemeScope localThemeScope2 = this.f9197a;
            Modifier.Companion companion = Modifier.INSTANCE;
            C16088n.e(localThemeScope2, new q1.Column(androidx.compose.foundation.b.d(T.g(D.i(InterfaceC14814f.b(AdsColumn, companion, 1.0f, false, 2, null), this.f9197a.getAdsSpacing().getFive().getDp()), T.c(0, composer, 0, 1), false, null, false, 14, null), this.f9197a.getAdsColors().getAdsColorInverse().getColor(), null, 2, null), null, null, 6, null), ComposableLambdaKt.c(1873161647, true, new C0128a(this.f9203g, this.f9197a, this.f9204h, this.f9205i, this.f9206j, this.f9201e, this.f9207k, this.f9208l, this.f9209m), composer, 54), composer, i12 | 384 | (q1.Column.f139985d << 3));
            Modifier modifierI = D.i(J.h(companion, 0.0f, 1, null), this.f9197a.getAdsSpacing().getFive().getDp());
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "changeCard_saveButton");
            Modifier modifierFsAttribute2 = FullStoryAnnotationsKt.fsAttribute(companion, "Button", "changeCard_cancelButton");
            String strC = C16193g.c(Y.f99639Jd, composer, 0);
            String strC2 = C16193g.c(Bj.o.f3039r, composer, 0);
            LocalThemeScope localThemeScope3 = this.f9197a;
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(this.f9200d) | composer.V(this.f9201e);
            final Function1<String, Unit> function1 = this.f9200d;
            final InterfaceC5730l0<String> interfaceC5730l0 = this.f9201e;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: Em.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return A.a.f(function1, interfaceC5730l0);
                    }
                };
                composer.t(objB2);
            }
            Function0 function03 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f9202f);
            final Function0<Unit> function04 = this.f9202f;
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function0() { // from class: Em.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return A.a.g(function04);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2887f.c(localThemeScope3, modifierI, modifierFsAttribute, modifierFsAttribute2, strC, strC2, function03, (Function0) objB3, composer, i12, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            d(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
            function1.invoke(A.e(interfaceC5730l0));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(Ji.LocalThemeScope r30, androidx.compose.ui.Modifier r31, java.lang.String r32, final kotlin.jvm.functions.Function0<kotlin.Unit> r33, final java.util.List<com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator> r34, final boolean r35, final boolean r36, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r37, final com.meijer.mobile.meijer.activity.checkout.payment.Z.PaymentOptionsViewState r38, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.payment.Z.i, kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r42, final java.lang.String r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Em.A.c(Ji.M, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, java.util.List, boolean, boolean, kotlin.jvm.functions.Function1, com.meijer.mobile.meijer.activity.checkout.payment.Z$k, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, java.lang.String, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5730l0 d() {
        return t1.e("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, String str, Function0 function0, List list, boolean z10, boolean z11, Function1 function1, Z.PaymentOptionsViewState paymentOptionsViewState, Function1 function12, Function1 function13, Function0 function02, Function1 function14, String str2, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, str, function0, list, z10, z11, function1, paymentOptionsViewState, function12, function13, function02, function14, str2, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }
}
