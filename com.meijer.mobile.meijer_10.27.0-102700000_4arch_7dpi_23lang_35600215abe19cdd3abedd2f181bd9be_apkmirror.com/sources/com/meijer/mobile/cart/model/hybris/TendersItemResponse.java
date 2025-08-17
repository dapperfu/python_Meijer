package com.meijer.mobile.cart.model.hybris;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018JÐ\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b+\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b4\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b#\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b5\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b6\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u0010\u001cR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b;\u0010\u001cR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b'\u0010\u001cR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b7\u0010\u001c¨\u0006<"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/TendersItemResponse;", "", "Lcom/meijer/mobile/cart/model/hybris/TransactionDetailsResponse;", "transactionDetails", "", "desiredChargeAmount", "", "saved", "", "transactionStatus", "Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;", "cardType", "expiryMonth", "authTime", "expiryYear", "tenderType", "transactionStatusDetails", "defaultPayment", PreferencesHelper.PREF_ID, "requestToken", "subscriptionId", "cardNumber", "paymentStatus", "<init>", "(Lcom/meijer/mobile/cart/model/hybris/TransactionDetailsResponse;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/meijer/mobile/cart/model/hybris/TransactionDetailsResponse;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/TendersItemResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/cart/model/hybris/TransactionDetailsResponse;", "n", "()Lcom/meijer/mobile/cart/model/hybris/TransactionDetailsResponse;", "b", "Ljava/lang/Double;", "e", "()Ljava/lang/Double;", "c", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "d", "Ljava/lang/String;", "o", "Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;", "()Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;", "f", "g", "h", "i", "m", "j", "p", "l", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TendersItemResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionDetailsResponse transactionDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double desiredChargeAmount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean saved;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionStatus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCardType cardType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expiryMonth;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authTime;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expiryYear;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tenderType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionStatusDetails;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean defaultPayment;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String requestToken;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentStatus;

    public TendersItemResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public final TendersItemResponse copy(@g(name = "transactionDetails") TransactionDetailsResponse transactionDetails, @g(name = "desiredChargeAmount") Double desiredChargeAmount, @g(name = "saved") Boolean saved, @g(name = "transactionStatus") String transactionStatus, @g(name = "cardType") HybrisCardType cardType, @g(name = "expiryMonth") String expiryMonth, @g(name = "authTime") String authTime, @g(name = "expiryYear") String expiryYear, @g(name = "tenderType") String tenderType, @g(name = "transactionStatusDetails") String transactionStatusDetails, @g(name = "defaultPayment") Boolean defaultPayment, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "requestToken") String requestToken, @g(name = "subscriptionId") String subscriptionId, @g(name = "cardNumber") String cardNumber, @g(name = "paymentStatus") String paymentStatus) {
        return new TendersItemResponse(transactionDetails, desiredChargeAmount, saved, transactionStatus, cardType, expiryMonth, authTime, expiryYear, tenderType, transactionStatusDetails, defaultPayment, id2, requestToken, subscriptionId, cardNumber, paymentStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TendersItemResponse)) {
            return false;
        }
        TendersItemResponse tendersItemResponse = (TendersItemResponse) other;
        return Intrinsics.e(this.transactionDetails, tendersItemResponse.transactionDetails) && Intrinsics.e(this.desiredChargeAmount, tendersItemResponse.desiredChargeAmount) && Intrinsics.e(this.saved, tendersItemResponse.saved) && Intrinsics.e(this.transactionStatus, tendersItemResponse.transactionStatus) && Intrinsics.e(this.cardType, tendersItemResponse.cardType) && Intrinsics.e(this.expiryMonth, tendersItemResponse.expiryMonth) && Intrinsics.e(this.authTime, tendersItemResponse.authTime) && Intrinsics.e(this.expiryYear, tendersItemResponse.expiryYear) && Intrinsics.e(this.tenderType, tendersItemResponse.tenderType) && Intrinsics.e(this.transactionStatusDetails, tendersItemResponse.transactionStatusDetails) && Intrinsics.e(this.defaultPayment, tendersItemResponse.defaultPayment) && Intrinsics.e(this.id, tendersItemResponse.id) && Intrinsics.e(this.requestToken, tendersItemResponse.requestToken) && Intrinsics.e(this.subscriptionId, tendersItemResponse.subscriptionId) && Intrinsics.e(this.cardNumber, tendersItemResponse.cardNumber) && Intrinsics.e(this.paymentStatus, tendersItemResponse.paymentStatus);
    }

    public int hashCode() {
        TransactionDetailsResponse transactionDetailsResponse = this.transactionDetails;
        int iHashCode = (transactionDetailsResponse == null ? 0 : transactionDetailsResponse.hashCode()) * 31;
        Double d10 = this.desiredChargeAmount;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Boolean bool = this.saved;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.transactionStatus;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        HybrisCardType hybrisCardType = this.cardType;
        int iHashCode5 = (iHashCode4 + (hybrisCardType == null ? 0 : hybrisCardType.hashCode())) * 31;
        String str2 = this.expiryMonth;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authTime;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiryYear;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tenderType;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transactionStatusDetails;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.defaultPayment;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.id;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.requestToken;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.subscriptionId;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cardNumber;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.paymentStatus;
        return iHashCode15 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "TendersItemResponse(transactionDetails=" + this.transactionDetails + ", desiredChargeAmount=" + this.desiredChargeAmount + ", saved=" + this.saved + ", transactionStatus=" + this.transactionStatus + ", cardType=" + this.cardType + ", expiryMonth=" + this.expiryMonth + ", authTime=" + this.authTime + ", expiryYear=" + this.expiryYear + ", tenderType=" + this.tenderType + ", transactionStatusDetails=" + this.transactionStatusDetails + ", defaultPayment=" + this.defaultPayment + ", id=" + this.id + ", requestToken=" + this.requestToken + ", subscriptionId=" + this.subscriptionId + ", cardNumber=" + this.cardNumber + ", paymentStatus=" + this.paymentStatus + ')';
    }

    public TendersItemResponse(@g(name = "transactionDetails") TransactionDetailsResponse transactionDetailsResponse, @g(name = "desiredChargeAmount") Double d10, @g(name = "saved") Boolean bool, @g(name = "transactionStatus") String str, @g(name = "cardType") HybrisCardType hybrisCardType, @g(name = "expiryMonth") String str2, @g(name = "authTime") String str3, @g(name = "expiryYear") String str4, @g(name = "tenderType") String str5, @g(name = "transactionStatusDetails") String str6, @g(name = "defaultPayment") Boolean bool2, @g(name = PreferencesHelper.PREF_ID) String str7, @g(name = "requestToken") String str8, @g(name = "subscriptionId") String str9, @g(name = "cardNumber") String str10, @g(name = "paymentStatus") String str11) {
        this.transactionDetails = transactionDetailsResponse;
        this.desiredChargeAmount = d10;
        this.saved = bool;
        this.transactionStatus = str;
        this.cardType = hybrisCardType;
        this.expiryMonth = str2;
        this.authTime = str3;
        this.expiryYear = str4;
        this.tenderType = str5;
        this.transactionStatusDetails = str6;
        this.defaultPayment = bool2;
        this.id = str7;
        this.requestToken = str8;
        this.subscriptionId = str9;
        this.cardNumber = str10;
        this.paymentStatus = str11;
    }

    /* renamed from: a, reason: from getter */
    public final String getAuthTime() {
        return this.authTime;
    }

    /* renamed from: b, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: c, reason: from getter */
    public final HybrisCardType getCardType() {
        return this.cardType;
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getDefaultPayment() {
        return this.defaultPayment;
    }

    /* renamed from: e, reason: from getter */
    public final Double getDesiredChargeAmount() {
        return this.desiredChargeAmount;
    }

    /* renamed from: f, reason: from getter */
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    /* renamed from: g, reason: from getter */
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    /* renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: i, reason: from getter */
    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    /* renamed from: j, reason: from getter */
    public final String getRequestToken() {
        return this.requestToken;
    }

    /* renamed from: k, reason: from getter */
    public final Boolean getSaved() {
        return this.saved;
    }

    /* renamed from: l, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* renamed from: m, reason: from getter */
    public final String getTenderType() {
        return this.tenderType;
    }

    /* renamed from: n, reason: from getter */
    public final TransactionDetailsResponse getTransactionDetails() {
        return this.transactionDetails;
    }

    /* renamed from: o, reason: from getter */
    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    /* renamed from: p, reason: from getter */
    public final String getTransactionStatusDetails() {
        return this.transactionStatusDetails;
    }

    public /* synthetic */ TendersItemResponse(TransactionDetailsResponse transactionDetailsResponse, Double d10, Boolean bool, String str, HybrisCardType hybrisCardType, String str2, String str3, String str4, String str5, String str6, Boolean bool2, String str7, String str8, String str9, String str10, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : transactionDetailsResponse, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : hybrisCardType, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : bool2, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str7, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str8, (i10 & 8192) != 0 ? null : str9, (i10 & 16384) != 0 ? null : str10, (i10 & 32768) != 0 ? null : str11);
    }
}
