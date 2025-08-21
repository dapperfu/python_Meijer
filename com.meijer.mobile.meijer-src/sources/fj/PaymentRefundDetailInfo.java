package fj;

import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001c\u0010\u000e¨\u0006\""}, d2 = {"Lfj/w;", "", "", "sequence", "", "refundType", "", "refundAmount", "j$/time/OffsetDateTime", "refundDateTime", "refundTransactionId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Lj$/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getRefundType", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "Lj$/time/OffsetDateTime;", "()Lj$/time/OffsetDateTime;", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.w, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class PaymentRefundDetailInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String refundType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double refundAmount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime refundDateTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String refundTransactionId;

    public PaymentRefundDetailInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentRefundDetailInfo)) {
            return false;
        }
        PaymentRefundDetailInfo paymentRefundDetailInfo = (PaymentRefundDetailInfo) other;
        return Intrinsics.e(this.sequence, paymentRefundDetailInfo.sequence) && Intrinsics.e(this.refundType, paymentRefundDetailInfo.refundType) && Intrinsics.e(this.refundAmount, paymentRefundDetailInfo.refundAmount) && Intrinsics.e(this.refundDateTime, paymentRefundDetailInfo.refundDateTime) && Intrinsics.e(this.refundTransactionId, paymentRefundDetailInfo.refundTransactionId);
    }

    public PaymentRefundDetailInfo(Integer num, String str, Double d10, OffsetDateTime offsetDateTime, String str2) {
        this.sequence = num;
        this.refundType = str;
        this.refundAmount = d10;
        this.refundDateTime = offsetDateTime;
        this.refundTransactionId = str2;
    }

    /* renamed from: a, reason: from getter */
    public final Double getRefundAmount() {
        return this.refundAmount;
    }

    /* renamed from: b, reason: from getter */
    public final OffsetDateTime getRefundDateTime() {
        return this.refundDateTime;
    }

    /* renamed from: c, reason: from getter */
    public final String getRefundTransactionId() {
        return this.refundTransactionId;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        Integer num = this.sequence;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.refundType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d10 = this.refundAmount;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.refundDateTime;
        int iHashCode4 = (iHashCode3 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str2 = this.refundTransactionId;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PaymentRefundDetailInfo(sequence=" + this.sequence + ", refundType=" + this.refundType + ", refundAmount=" + this.refundAmount + ", refundDateTime=" + this.refundDateTime + ", refundTransactionId=" + this.refundTransactionId + ')';
    }

    public /* synthetic */ PaymentRefundDetailInfo(Integer num, String str, Double d10, OffsetDateTime offsetDateTime, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : d10, (i10 & 8) != 0 ? null : offsetDateTime, (i10 & 16) != 0 ? null : str2);
    }
}
