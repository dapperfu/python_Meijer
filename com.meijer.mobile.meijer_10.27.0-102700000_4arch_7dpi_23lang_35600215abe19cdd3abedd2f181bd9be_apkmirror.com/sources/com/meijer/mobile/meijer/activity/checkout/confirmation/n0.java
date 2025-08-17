package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator;
import com.meijer.mobile.meijer.activity.checkout.confirmation.n0;
import ej.PaymentDetailItem;
import ji.InterfaceC14926b0;
import ji.a1;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aJ\u0010\f\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005H\u0001¢\u0006\u0004\b\f\u0010\r\u001aN\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "orderNumber", "", "onOpenOrderDetails", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onCloseIconClicked", "g", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "isPaymentWidgetVisible", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class n0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102201a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderConfirmationDecorator f102202b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f102203c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f102204d;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
            n0.e(interfaceC5730l0, false);
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, Function1<? super String, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f102201a = localThemeScope;
            this.f102202b = orderConfirmationDecorator;
            this.f102203c = function1;
            this.f102204d = interfaceC5730l0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1535764651, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderPaymentStatusSection.<anonymous> (OrderPaymentStatusSection.kt:55)");
            }
            LocalThemeScope localThemeScope = this.f102201a;
            OrderConfirmationDecorator orderConfirmationDecorator = this.f102202b;
            composer.startReplaceGroup(5004770);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f102204d;
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n0.a.c(interfaceC5730l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            n0.g(localThemeScope, orderConfirmationDecorator, (Function0) objB, this.f102203c, composer, LocalThemeScope.f15770g | 384);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderConfirmationDecorator f102205a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102206b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f102207c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102208d;

        /* JADX WARN: Multi-variable type inference failed */
        b(OrderConfirmationDecorator orderConfirmationDecorator, LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, Function0<Unit> function0) {
            this.f102205a = orderConfirmationDecorator;
            this.f102206b = localThemeScope;
            this.f102207c = function1;
            this.f102208d = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(String str, final OrderConfirmationDecorator orderConfirmationDecorator, Function0 function0, final Function1 function1, Ci.o AdsInlineNotification) {
            PaymentDetailItem paymentDetails;
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.D(str, new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n0.b.e(function1, orderConfirmationDecorator);
                }
            });
            if (orderConfirmationDecorator != null && (paymentDetails = orderConfirmationDecorator.getPaymentDetails()) != null && !paymentDetails.getIsPaymentDeclined()) {
                AdsInlineNotification.Q(function0);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, OrderConfirmationDecorator orderConfirmationDecorator) {
            String orderNumber = orderConfirmationDecorator != null ? orderConfirmationDecorator.getOrderNumber() : null;
            if (orderNumber == null) {
                orderNumber = "";
            }
            function1.invoke(orderNumber);
            return Unit.f142422a;
        }

        public final void c(InterfaceC14926b0 Assemble, Composer composer, int i10) {
            PaymentDetailItem paymentDetails;
            OrderConfirmationDecorator.PaymentStatusWidgetDecorator paymentStatusWidget;
            OrderConfirmationDecorator.PaymentStatusWidgetDecorator paymentStatusWidget2;
            OrderConfirmationDecorator.PaymentStatusWidgetDecorator paymentStatusWidget3;
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-996219990, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.PaymentWidgetBody.<anonymous> (OrderPaymentStatusSection.kt:72)");
            }
            OrderConfirmationDecorator orderConfirmationDecorator = this.f102205a;
            AbstractC5607a content = null;
            AbstractC5607a buttonLabel = (orderConfirmationDecorator == null || (paymentStatusWidget3 = orderConfirmationDecorator.getPaymentStatusWidget()) == null) ? null : paymentStatusWidget3.getButtonLabel();
            int i11 = AbstractC5607a.f45514b;
            final String strA = C6408b.a(buttonLabel, composer, i11);
            OrderConfirmationDecorator orderConfirmationDecorator2 = this.f102205a;
            String strA2 = C6408b.a((orderConfirmationDecorator2 == null || (paymentStatusWidget2 = orderConfirmationDecorator2.getPaymentStatusWidget()) == null) ? null : paymentStatusWidget2.getTitle(), composer, i11);
            OrderConfirmationDecorator orderConfirmationDecorator3 = this.f102205a;
            if (orderConfirmationDecorator3 != null && (paymentStatusWidget = orderConfirmationDecorator3.getPaymentStatusWidget()) != null) {
                content = paymentStatusWidget.getContent();
            }
            String strA3 = C6408b.a(content, composer, i11);
            OrderConfirmationDecorator orderConfirmationDecorator4 = this.f102205a;
            q1.m.Inline success = (orderConfirmationDecorator4 == null || (paymentDetails = orderConfirmationDecorator4.getPaymentDetails()) == null || !paymentDetails.getIsPaymentDeclined()) ? Assemble.getToastVariant().getSuccess() : Assemble.getToastVariant().getError();
            LocalThemeScope localThemeScope = this.f102206b;
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(strA) | composer.V(this.f102207c) | composer.D(this.f102205a) | composer.V(this.f102208d);
            final OrderConfirmationDecorator orderConfirmationDecorator5 = this.f102205a;
            final Function0<Unit> function0 = this.f102208d;
            final Function1<String, Unit> function1 = this.f102207c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.p0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n0.b.d(strA, orderConfirmationDecorator5, function0, function1, (Ci.o) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Ci.j.i(localThemeScope, null, strA3, strA2, success, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
            c(interfaceC14926b0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator r20, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.n0.c(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.confirmation.p, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, OrderConfirmationDecorator orderConfirmationDecorator, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, orderConfirmationDecorator, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void g(final LocalThemeScope localThemeScope, final OrderConfirmationDecorator orderConfirmationDecorator, final Function0<Unit> onCloseIconClicked, final Function1<? super String, Unit> onOpenOrderDetails, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onCloseIconClicked, "onCloseIconClicked");
        Intrinsics.j(onOpenOrderDetails, "onOpenOrderDetails");
        Composer composerStartRestartGroup = composer.startRestartGroup(155991197);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(orderConfirmationDecorator) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onCloseIconClicked) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onOpenOrderDetails) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(155991197, i11, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.PaymentWidgetBody (OrderPaymentStatusSection.kt:70)");
            }
            Ji.Q.e(localThemeScope, a1.f139760a, ComposableLambdaKt.c(-996219990, true, new b(orderConfirmationDecorator, localThemeScope, onOpenOrderDetails, onCloseIconClicked), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (a1.f139761b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.h(localThemeScope, orderConfirmationDecorator, onCloseIconClicked, onOpenOrderDetails, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, Function0 function0, Function1 function1, int i10, Composer composer, int i11) {
        g(localThemeScope, orderConfirmationDecorator, function0, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final boolean d(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
