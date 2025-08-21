package fr;

import com.meijer.mobile.subscription.service.api.models.PaymentInfoRequestJson;
import dr.PaymentInfoRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr/d;", "Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoRequestJson;", "a", "(Ldr/d;)Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoRequestJson;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14062g {
    public static final PaymentInfoRequestJson a(PaymentInfoRequest paymentInfoRequest) {
        Intrinsics.j(paymentInfoRequest, "<this>");
        return new PaymentInfoRequestJson(paymentInfoRequest.getCardLastFour(), paymentInfoRequest.getCardType(), paymentInfoRequest.getPaymentId());
    }
}
