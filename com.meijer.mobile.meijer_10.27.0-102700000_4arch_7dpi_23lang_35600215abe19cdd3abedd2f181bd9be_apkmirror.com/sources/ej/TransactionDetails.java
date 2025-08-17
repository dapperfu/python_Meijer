package ej;

import androidx.recyclerview.widget.RecyclerView;
import j$.time.OffsetDateTime;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\b\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b \u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b,\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b*\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b0\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b#\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b/\u0010\u0018R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b-\u00109¨\u0006:"}, d2 = {"Lej/J;", "", "", "ebtCaptureTranId", "", "ebtRefundAmount", "j$/time/ZonedDateTime", "transactionDateTime", "ebtRefundDateTime", "approvedAmount", "ebtRefundTranId", "ebtBalanceAmount", "ebtCapturedAmount", "remainingBalanceCash", "remainingBalanceSNAP", "j$/time/OffsetDateTime", "ebtCaptureDateTime", "referenceKey", "", "Lej/w;", "paymentRefundDetailInfo", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lj$/time/OffsetDateTime;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/lang/Double;", "e", "()Ljava/lang/Double;", "Lj$/time/ZonedDateTime;", "getTransactionDateTime", "()Lj$/time/ZonedDateTime;", "d", "getEbtRefundDateTime", "f", "g", "getEbtBalanceAmount", "h", "i", "getRemainingBalanceCash", "j", "k", "Lj$/time/OffsetDateTime;", "()Lj$/time/OffsetDateTime;", "l", "m", "Ljava/util/List;", "()Ljava/util/List;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.J, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class TransactionDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ebtCaptureTranId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double ebtRefundAmount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime transactionDateTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ebtRefundDateTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double approvedAmount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ebtRefundTranId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double ebtBalanceAmount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double ebtCapturedAmount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double remainingBalanceCash;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double remainingBalanceSNAP;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime ebtCaptureDateTime;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String referenceKey;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PaymentRefundDetailInfo> paymentRefundDetailInfo;

    public TransactionDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDetails)) {
            return false;
        }
        TransactionDetails transactionDetails = (TransactionDetails) other;
        return Intrinsics.e(this.ebtCaptureTranId, transactionDetails.ebtCaptureTranId) && Intrinsics.e(this.ebtRefundAmount, transactionDetails.ebtRefundAmount) && Intrinsics.e(this.transactionDateTime, transactionDetails.transactionDateTime) && Intrinsics.e(this.ebtRefundDateTime, transactionDetails.ebtRefundDateTime) && Intrinsics.e(this.approvedAmount, transactionDetails.approvedAmount) && Intrinsics.e(this.ebtRefundTranId, transactionDetails.ebtRefundTranId) && Intrinsics.e(this.ebtBalanceAmount, transactionDetails.ebtBalanceAmount) && Intrinsics.e(this.ebtCapturedAmount, transactionDetails.ebtCapturedAmount) && Intrinsics.e(this.remainingBalanceCash, transactionDetails.remainingBalanceCash) && Intrinsics.e(this.remainingBalanceSNAP, transactionDetails.remainingBalanceSNAP) && Intrinsics.e(this.ebtCaptureDateTime, transactionDetails.ebtCaptureDateTime) && Intrinsics.e(this.referenceKey, transactionDetails.referenceKey) && Intrinsics.e(this.paymentRefundDetailInfo, transactionDetails.paymentRefundDetailInfo);
    }

    public TransactionDetails(String str, Double d10, ZonedDateTime zonedDateTime, String str2, Double d11, String str3, Double d12, Double d13, Double d14, Double d15, OffsetDateTime offsetDateTime, String str4, List<PaymentRefundDetailInfo> paymentRefundDetailInfo) {
        Intrinsics.j(paymentRefundDetailInfo, "paymentRefundDetailInfo");
        this.ebtCaptureTranId = str;
        this.ebtRefundAmount = d10;
        this.transactionDateTime = zonedDateTime;
        this.ebtRefundDateTime = str2;
        this.approvedAmount = d11;
        this.ebtRefundTranId = str3;
        this.ebtBalanceAmount = d12;
        this.ebtCapturedAmount = d13;
        this.remainingBalanceCash = d14;
        this.remainingBalanceSNAP = d15;
        this.ebtCaptureDateTime = offsetDateTime;
        this.referenceKey = str4;
        this.paymentRefundDetailInfo = paymentRefundDetailInfo;
    }

    /* renamed from: a, reason: from getter */
    public final Double getApprovedAmount() {
        return this.approvedAmount;
    }

    /* renamed from: b, reason: from getter */
    public final OffsetDateTime getEbtCaptureDateTime() {
        return this.ebtCaptureDateTime;
    }

    /* renamed from: c, reason: from getter */
    public final String getEbtCaptureTranId() {
        return this.ebtCaptureTranId;
    }

    /* renamed from: d, reason: from getter */
    public final Double getEbtCapturedAmount() {
        return this.ebtCapturedAmount;
    }

    /* renamed from: e, reason: from getter */
    public final Double getEbtRefundAmount() {
        return this.ebtRefundAmount;
    }

    /* renamed from: f, reason: from getter */
    public final String getEbtRefundTranId() {
        return this.ebtRefundTranId;
    }

    public final List<PaymentRefundDetailInfo> g() {
        return this.paymentRefundDetailInfo;
    }

    /* renamed from: h, reason: from getter */
    public final String getReferenceKey() {
        return this.referenceKey;
    }

    public int hashCode() {
        String str = this.ebtCaptureTranId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.ebtRefundAmount;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.transactionDateTime;
        int iHashCode3 = (iHashCode2 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str2 = this.ebtRefundDateTime;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d11 = this.approvedAmount;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str3 = this.ebtRefundTranId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d12 = this.ebtBalanceAmount;
        int iHashCode7 = (iHashCode6 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.ebtCapturedAmount;
        int iHashCode8 = (iHashCode7 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.remainingBalanceCash;
        int iHashCode9 = (iHashCode8 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.remainingBalanceSNAP;
        int iHashCode10 = (iHashCode9 + (d15 == null ? 0 : d15.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.ebtCaptureDateTime;
        int iHashCode11 = (iHashCode10 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str4 = this.referenceKey;
        return ((iHashCode11 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.paymentRefundDetailInfo.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final Double getRemainingBalanceSNAP() {
        return this.remainingBalanceSNAP;
    }

    public String toString() {
        return "TransactionDetails(ebtCaptureTranId=" + this.ebtCaptureTranId + ", ebtRefundAmount=" + this.ebtRefundAmount + ", transactionDateTime=" + this.transactionDateTime + ", ebtRefundDateTime=" + this.ebtRefundDateTime + ", approvedAmount=" + this.approvedAmount + ", ebtRefundTranId=" + this.ebtRefundTranId + ", ebtBalanceAmount=" + this.ebtBalanceAmount + ", ebtCapturedAmount=" + this.ebtCapturedAmount + ", remainingBalanceCash=" + this.remainingBalanceCash + ", remainingBalanceSNAP=" + this.remainingBalanceSNAP + ", ebtCaptureDateTime=" + this.ebtCaptureDateTime + ", referenceKey=" + this.referenceKey + ", paymentRefundDetailInfo=" + this.paymentRefundDetailInfo + ')';
    }

    public /* synthetic */ TransactionDetails(String str, Double d10, ZonedDateTime zonedDateTime, String str2, Double d11, String str3, Double d12, Double d13, Double d14, Double d15, OffsetDateTime offsetDateTime, String str4, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : zonedDateTime, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : d11, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : d12, (i10 & 128) != 0 ? null : d13, (i10 & 256) != 0 ? null : d14, (i10 & 512) != 0 ? null : d15, (i10 & 1024) != 0 ? null : offsetDateTime, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? str4 : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? CollectionsKt.m() : list);
    }
}
