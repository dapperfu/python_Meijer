package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;", "", "", "Lcom/meijer/mobile/cart/model/hybris/PaymentCreditDetailInfoResponse;", "paymentCreditDetailInfo", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisTransactionDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PaymentCreditDetailInfoResponse> paymentCreditDetailInfo;

    public final HybrisTransactionDetails copy(@g(name = "paymentCreditDetailInfo") List<PaymentCreditDetailInfoResponse> paymentCreditDetailInfo) {
        return new HybrisTransactionDetails(paymentCreditDetailInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HybrisTransactionDetails) && Intrinsics.e(this.paymentCreditDetailInfo, ((HybrisTransactionDetails) other).paymentCreditDetailInfo);
    }

    public int hashCode() {
        List<PaymentCreditDetailInfoResponse> list = this.paymentCreditDetailInfo;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "HybrisTransactionDetails(paymentCreditDetailInfo=" + this.paymentCreditDetailInfo + ')';
    }

    public final List<PaymentCreditDetailInfoResponse> a() {
        return this.paymentCreditDetailInfo;
    }

    public HybrisTransactionDetails(@g(name = "paymentCreditDetailInfo") List<PaymentCreditDetailInfoResponse> list) {
        this.paymentCreditDetailInfo = list;
    }
}
