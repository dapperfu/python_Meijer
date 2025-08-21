package com.meijer.mobile.cart.model.hybris;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J°\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b,\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b!\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b.\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b$\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b-\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b1\u0010\u0019R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b/\u00104¨\u00065"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/TransactionDetailsResponse;", "", "", "ebtCaptureTranId", "", "ebtRefundAmount", "Lcom/meijer/mobile/cart/model/hybris/TransactionDTResponse;", "transactionDateTime", "ebtRefundDateTime", "approvedAmount", "ebtRefundTranId", "ebtBalanceAmount", "ebtCapturedAmount", "remainingBalanceCash", "remainingBalanceSNAP", "ebtCaptureDateTime", "referenceKey", "", "Lcom/meijer/mobile/cart/model/hybris/HybrisPaymentRefundDetailInfo;", "paymentRefundDetailInfo", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Lcom/meijer/mobile/cart/model/hybris/TransactionDTResponse;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/Double;Lcom/meijer/mobile/cart/model/hybris/TransactionDTResponse;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/cart/model/hybris/TransactionDetailsResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "c", "Lcom/meijer/mobile/cart/model/hybris/TransactionDTResponse;", "m", "()Lcom/meijer/mobile/cart/model/hybris/TransactionDTResponse;", "g", "e", "h", "i", "k", "j", "l", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TransactionDetailsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ebtCaptureTranId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double ebtRefundAmount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionDTResponse transactionDateTime;

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
    private final String ebtCaptureDateTime;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String referenceKey;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPaymentRefundDetailInfo> paymentRefundDetailInfo;

    public TransactionDetailsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final TransactionDetailsResponse copy(@g(name = "ebtCaptureTranId") String ebtCaptureTranId, @g(name = "ebtRefundAmount") Double ebtRefundAmount, @g(name = "transactionDT") TransactionDTResponse transactionDateTime, @g(name = "ebtRefundDateTime") String ebtRefundDateTime, @g(name = "approvedAmount") Double approvedAmount, @g(name = "ebtRefundTranId") String ebtRefundTranId, @g(name = "ebtBalanceAmount") Double ebtBalanceAmount, @g(name = "ebtCapturedAmount") Double ebtCapturedAmount, @g(name = "remainingBalanceCash") Double remainingBalanceCash, @g(name = "remainingBalanceSNAP") Double remainingBalanceSNAP, @g(name = "ebtCaptureDateTime") String ebtCaptureDateTime, @g(name = "referenceKey") String referenceKey, @g(name = "paymentRefundDetailInfo") List<HybrisPaymentRefundDetailInfo> paymentRefundDetailInfo) {
        Intrinsics.j(paymentRefundDetailInfo, "paymentRefundDetailInfo");
        return new TransactionDetailsResponse(ebtCaptureTranId, ebtRefundAmount, transactionDateTime, ebtRefundDateTime, approvedAmount, ebtRefundTranId, ebtBalanceAmount, ebtCapturedAmount, remainingBalanceCash, remainingBalanceSNAP, ebtCaptureDateTime, referenceKey, paymentRefundDetailInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDetailsResponse)) {
            return false;
        }
        TransactionDetailsResponse transactionDetailsResponse = (TransactionDetailsResponse) other;
        return Intrinsics.e(this.ebtCaptureTranId, transactionDetailsResponse.ebtCaptureTranId) && Intrinsics.e(this.ebtRefundAmount, transactionDetailsResponse.ebtRefundAmount) && Intrinsics.e(this.transactionDateTime, transactionDetailsResponse.transactionDateTime) && Intrinsics.e(this.ebtRefundDateTime, transactionDetailsResponse.ebtRefundDateTime) && Intrinsics.e(this.approvedAmount, transactionDetailsResponse.approvedAmount) && Intrinsics.e(this.ebtRefundTranId, transactionDetailsResponse.ebtRefundTranId) && Intrinsics.e(this.ebtBalanceAmount, transactionDetailsResponse.ebtBalanceAmount) && Intrinsics.e(this.ebtCapturedAmount, transactionDetailsResponse.ebtCapturedAmount) && Intrinsics.e(this.remainingBalanceCash, transactionDetailsResponse.remainingBalanceCash) && Intrinsics.e(this.remainingBalanceSNAP, transactionDetailsResponse.remainingBalanceSNAP) && Intrinsics.e(this.ebtCaptureDateTime, transactionDetailsResponse.ebtCaptureDateTime) && Intrinsics.e(this.referenceKey, transactionDetailsResponse.referenceKey) && Intrinsics.e(this.paymentRefundDetailInfo, transactionDetailsResponse.paymentRefundDetailInfo);
    }

    public int hashCode() {
        String str = this.ebtCaptureTranId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.ebtRefundAmount;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        TransactionDTResponse transactionDTResponse = this.transactionDateTime;
        int iHashCode3 = (iHashCode2 + (transactionDTResponse == null ? 0 : transactionDTResponse.hashCode())) * 31;
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
        String str4 = this.ebtCaptureDateTime;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.referenceKey;
        return ((iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.paymentRefundDetailInfo.hashCode();
    }

    public String toString() {
        return "TransactionDetailsResponse(ebtCaptureTranId=" + this.ebtCaptureTranId + ", ebtRefundAmount=" + this.ebtRefundAmount + ", transactionDateTime=" + this.transactionDateTime + ", ebtRefundDateTime=" + this.ebtRefundDateTime + ", approvedAmount=" + this.approvedAmount + ", ebtRefundTranId=" + this.ebtRefundTranId + ", ebtBalanceAmount=" + this.ebtBalanceAmount + ", ebtCapturedAmount=" + this.ebtCapturedAmount + ", remainingBalanceCash=" + this.remainingBalanceCash + ", remainingBalanceSNAP=" + this.remainingBalanceSNAP + ", ebtCaptureDateTime=" + this.ebtCaptureDateTime + ", referenceKey=" + this.referenceKey + ", paymentRefundDetailInfo=" + this.paymentRefundDetailInfo + ')';
    }

    public TransactionDetailsResponse(@g(name = "ebtCaptureTranId") String str, @g(name = "ebtRefundAmount") Double d10, @g(name = "transactionDT") TransactionDTResponse transactionDTResponse, @g(name = "ebtRefundDateTime") String str2, @g(name = "approvedAmount") Double d11, @g(name = "ebtRefundTranId") String str3, @g(name = "ebtBalanceAmount") Double d12, @g(name = "ebtCapturedAmount") Double d13, @g(name = "remainingBalanceCash") Double d14, @g(name = "remainingBalanceSNAP") Double d15, @g(name = "ebtCaptureDateTime") String str4, @g(name = "referenceKey") String str5, @g(name = "paymentRefundDetailInfo") List<HybrisPaymentRefundDetailInfo> paymentRefundDetailInfo) {
        Intrinsics.j(paymentRefundDetailInfo, "paymentRefundDetailInfo");
        this.ebtCaptureTranId = str;
        this.ebtRefundAmount = d10;
        this.transactionDateTime = transactionDTResponse;
        this.ebtRefundDateTime = str2;
        this.approvedAmount = d11;
        this.ebtRefundTranId = str3;
        this.ebtBalanceAmount = d12;
        this.ebtCapturedAmount = d13;
        this.remainingBalanceCash = d14;
        this.remainingBalanceSNAP = d15;
        this.ebtCaptureDateTime = str4;
        this.referenceKey = str5;
        this.paymentRefundDetailInfo = paymentRefundDetailInfo;
    }

    /* renamed from: a, reason: from getter */
    public final Double getApprovedAmount() {
        return this.approvedAmount;
    }

    /* renamed from: b, reason: from getter */
    public final Double getEbtBalanceAmount() {
        return this.ebtBalanceAmount;
    }

    /* renamed from: c, reason: from getter */
    public final String getEbtCaptureDateTime() {
        return this.ebtCaptureDateTime;
    }

    /* renamed from: d, reason: from getter */
    public final String getEbtCaptureTranId() {
        return this.ebtCaptureTranId;
    }

    /* renamed from: e, reason: from getter */
    public final Double getEbtCapturedAmount() {
        return this.ebtCapturedAmount;
    }

    /* renamed from: f, reason: from getter */
    public final Double getEbtRefundAmount() {
        return this.ebtRefundAmount;
    }

    /* renamed from: g, reason: from getter */
    public final String getEbtRefundDateTime() {
        return this.ebtRefundDateTime;
    }

    /* renamed from: h, reason: from getter */
    public final String getEbtRefundTranId() {
        return this.ebtRefundTranId;
    }

    public final List<HybrisPaymentRefundDetailInfo> i() {
        return this.paymentRefundDetailInfo;
    }

    /* renamed from: j, reason: from getter */
    public final String getReferenceKey() {
        return this.referenceKey;
    }

    /* renamed from: k, reason: from getter */
    public final Double getRemainingBalanceCash() {
        return this.remainingBalanceCash;
    }

    /* renamed from: l, reason: from getter */
    public final Double getRemainingBalanceSNAP() {
        return this.remainingBalanceSNAP;
    }

    /* renamed from: m, reason: from getter */
    public final TransactionDTResponse getTransactionDateTime() {
        return this.transactionDateTime;
    }

    public /* synthetic */ TransactionDetailsResponse(String str, Double d10, TransactionDTResponse transactionDTResponse, String str2, Double d11, String str3, Double d12, Double d13, Double d14, Double d15, String str4, String str5, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : transactionDTResponse, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : d11, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : d12, (i10 & 128) != 0 ? null : d13, (i10 & 256) != 0 ? null : d14, (i10 & 512) != 0 ? null : d15, (i10 & 1024) != 0 ? null : str4, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? str5 : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? CollectionsKt.m() : list);
    }
}
