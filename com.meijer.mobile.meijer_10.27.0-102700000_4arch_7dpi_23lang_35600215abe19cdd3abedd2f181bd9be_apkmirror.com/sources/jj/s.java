package jj;

import com.meijer.mobile.cart.model.hybris.HybrisPaymentRefundDetailInfo;
import ej.PaymentRefundDetailInfo;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisPaymentRefundDetailInfo;", "Lej/w;", "a", "(Lcom/meijer/mobile/cart/model/hybris/HybrisPaymentRefundDetailInfo;)Lej/w;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class s {
    public static final PaymentRefundDetailInfo a(HybrisPaymentRefundDetailInfo hybrisPaymentRefundDetailInfo) {
        Intrinsics.j(hybrisPaymentRefundDetailInfo, "<this>");
        Integer sequence = hybrisPaymentRefundDetailInfo.getSequence();
        String refundType = hybrisPaymentRefundDetailInfo.getRefundType();
        Double refundAmount = hybrisPaymentRefundDetailInfo.getRefundAmount();
        String refundDateTime = hybrisPaymentRefundDetailInfo.getRefundDateTime();
        return new PaymentRefundDetailInfo(sequence, refundType, refundAmount, refundDateTime != null ? (OffsetDateTime) vk.d.b(refundDateTime, C17590a.f164803a.s(), new r()) : null, hybrisPaymentRefundDetailInfo.getRefundTransactionId());
    }
}
