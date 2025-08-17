package Rq;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0011\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"LRq/N;", "", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "paymentOptionsViewModel", "Lkotlin/Function0;", "", "openSheet", "onAddNewCreditCard", "onAddNewEBTCard", "onAddNewWicCard", "onChangeCard", "onRemoveEBTCard", "Lkotlin/Function1;", "", "onConfirmCVVClicked", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "a", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "g", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "b", "Lkotlin/jvm/functions/Function0;", "getOpenSheet", "()Lkotlin/jvm/functions/Function0;", "c", "d", "e", "f", "h", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.meijer.activity.checkout.payment.Z paymentOptionsViewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> openSheet;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onAddNewCreditCard;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onAddNewEBTCard;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onAddNewWicCard;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onChangeCard;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onRemoveEBTCard;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Function1<String, Unit> onConfirmCVVClicked;

    /* JADX WARN: Multi-variable type inference failed */
    public N(com.meijer.mobile.meijer.activity.checkout.payment.Z paymentOptionsViewModel, Function0<Unit> openSheet, Function0<Unit> onAddNewCreditCard, Function0<Unit> onAddNewEBTCard, Function0<Unit> onAddNewWicCard, Function0<Unit> onChangeCard, Function0<Unit> onRemoveEBTCard, Function1<? super String, Unit> onConfirmCVVClicked) {
        Intrinsics.j(paymentOptionsViewModel, "paymentOptionsViewModel");
        Intrinsics.j(openSheet, "openSheet");
        Intrinsics.j(onAddNewCreditCard, "onAddNewCreditCard");
        Intrinsics.j(onAddNewEBTCard, "onAddNewEBTCard");
        Intrinsics.j(onAddNewWicCard, "onAddNewWicCard");
        Intrinsics.j(onChangeCard, "onChangeCard");
        Intrinsics.j(onRemoveEBTCard, "onRemoveEBTCard");
        Intrinsics.j(onConfirmCVVClicked, "onConfirmCVVClicked");
        this.paymentOptionsViewModel = paymentOptionsViewModel;
        this.openSheet = openSheet;
        this.onAddNewCreditCard = onAddNewCreditCard;
        this.onAddNewEBTCard = onAddNewEBTCard;
        this.onAddNewWicCard = onAddNewWicCard;
        this.onChangeCard = onChangeCard;
        this.onRemoveEBTCard = onRemoveEBTCard;
        this.onConfirmCVVClicked = onConfirmCVVClicked;
    }

    public final Function0<Unit> a() {
        return this.onAddNewCreditCard;
    }

    public final Function0<Unit> b() {
        return this.onAddNewEBTCard;
    }

    public final Function0<Unit> c() {
        return this.onAddNewWicCard;
    }

    public final Function0<Unit> d() {
        return this.onChangeCard;
    }

    public final Function1<String, Unit> e() {
        return this.onConfirmCVVClicked;
    }

    public final Function0<Unit> f() {
        return this.onRemoveEBTCard;
    }

    /* renamed from: g, reason: from getter */
    public final com.meijer.mobile.meijer.activity.checkout.payment.Z getPaymentOptionsViewModel() {
        return this.paymentOptionsViewModel;
    }
}
