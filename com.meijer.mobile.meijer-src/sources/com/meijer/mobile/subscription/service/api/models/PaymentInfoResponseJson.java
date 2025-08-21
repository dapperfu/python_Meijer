package com.meijer.mobile.subscription.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoResponseJson;", "", "", "cardLastFour", "cardType", "paymentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/subscription/service/api/models/PaymentInfoResponseJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PaymentInfoResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardLastFour;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    public PaymentInfoResponseJson(@g(name = "cardLastFour") String str, @g(name = "cardType") String str2, @g(name = "paymentId") String paymentId) {
        Intrinsics.j(paymentId, "paymentId");
        this.cardLastFour = str;
        this.cardType = str2;
        this.paymentId = paymentId;
    }

    public final PaymentInfoResponseJson copy(@g(name = "cardLastFour") String cardLastFour, @g(name = "cardType") String cardType, @g(name = "paymentId") String paymentId) {
        Intrinsics.j(paymentId, "paymentId");
        return new PaymentInfoResponseJson(cardLastFour, cardType, paymentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfoResponseJson)) {
            return false;
        }
        PaymentInfoResponseJson paymentInfoResponseJson = (PaymentInfoResponseJson) other;
        return Intrinsics.e(this.cardLastFour, paymentInfoResponseJson.cardLastFour) && Intrinsics.e(this.cardType, paymentInfoResponseJson.cardType) && Intrinsics.e(this.paymentId, paymentInfoResponseJson.paymentId);
    }

    public int hashCode() {
        String str = this.cardLastFour;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardType;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.paymentId.hashCode();
    }

    public String toString() {
        return "PaymentInfoResponseJson(cardLastFour=" + this.cardLastFour + ", cardType=" + this.cardType + ", paymentId=" + this.paymentId + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getCardLastFour() {
        return this.cardLastFour;
    }

    /* renamed from: b, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* renamed from: c, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    public /* synthetic */ PaymentInfoResponseJson(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, str3);
    }
}
