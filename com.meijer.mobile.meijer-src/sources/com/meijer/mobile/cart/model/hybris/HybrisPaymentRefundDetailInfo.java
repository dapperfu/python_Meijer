package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001d\u0010\u000f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisPaymentRefundDetailInfo;", "", "", "sequence", "", "refundType", "", "refundAmount", "refundDateTime", "refundTransactionId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/HybrisPaymentRefundDetailInfo;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "d", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisPaymentRefundDetailInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String refundType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double refundAmount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String refundDateTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String refundTransactionId;

    public HybrisPaymentRefundDetailInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public final HybrisPaymentRefundDetailInfo copy(@g(name = "sequence") Integer sequence, @g(name = "refundType") String refundType, @g(name = "refundAmount") Double refundAmount, @g(name = "refundDateTime") String refundDateTime, @g(name = "refundTransactionId") String refundTransactionId) {
        return new HybrisPaymentRefundDetailInfo(sequence, refundType, refundAmount, refundDateTime, refundTransactionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPaymentRefundDetailInfo)) {
            return false;
        }
        HybrisPaymentRefundDetailInfo hybrisPaymentRefundDetailInfo = (HybrisPaymentRefundDetailInfo) other;
        return Intrinsics.e(this.sequence, hybrisPaymentRefundDetailInfo.sequence) && Intrinsics.e(this.refundType, hybrisPaymentRefundDetailInfo.refundType) && Intrinsics.e(this.refundAmount, hybrisPaymentRefundDetailInfo.refundAmount) && Intrinsics.e(this.refundDateTime, hybrisPaymentRefundDetailInfo.refundDateTime) && Intrinsics.e(this.refundTransactionId, hybrisPaymentRefundDetailInfo.refundTransactionId);
    }

    public int hashCode() {
        Integer num = this.sequence;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.refundType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d10 = this.refundAmount;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str2 = this.refundDateTime;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refundTransactionId;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "HybrisPaymentRefundDetailInfo(sequence=" + this.sequence + ", refundType=" + this.refundType + ", refundAmount=" + this.refundAmount + ", refundDateTime=" + this.refundDateTime + ", refundTransactionId=" + this.refundTransactionId + ')';
    }

    public HybrisPaymentRefundDetailInfo(@g(name = "sequence") Integer num, @g(name = "refundType") String str, @g(name = "refundAmount") Double d10, @g(name = "refundDateTime") String str2, @g(name = "refundTransactionId") String str3) {
        this.sequence = num;
        this.refundType = str;
        this.refundAmount = d10;
        this.refundDateTime = str2;
        this.refundTransactionId = str3;
    }

    /* renamed from: a, reason: from getter */
    public final Double getRefundAmount() {
        return this.refundAmount;
    }

    /* renamed from: b, reason: from getter */
    public final String getRefundDateTime() {
        return this.refundDateTime;
    }

    /* renamed from: c, reason: from getter */
    public final String getRefundTransactionId() {
        return this.refundTransactionId;
    }

    /* renamed from: d, reason: from getter */
    public final String getRefundType() {
        return this.refundType;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getSequence() {
        return this.sequence;
    }

    public /* synthetic */ HybrisPaymentRefundDetailInfo(Integer num, String str, Double d10, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : d10, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3);
    }
}
