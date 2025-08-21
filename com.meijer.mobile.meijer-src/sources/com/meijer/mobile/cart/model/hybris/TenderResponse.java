package com.meijer.mobile.cart.model.hybris;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import fj.CardType;
import fj.Tender;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj.o;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJè\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b*\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b+\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b5\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b6\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b7\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b8\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b9\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b:\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b;\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b<\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b=\u0010!R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\bA\u0010!R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010)\u001a\u0004\bB\u0010!¨\u0006C"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/TenderResponse;", "", "", "authCode", "authTime", "cardNumber", "Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;", "cardType", "", "defaultPayment", "", "desiredChargeAmount", "expiryMonth", "expiryYear", PreferencesHelper.PREF_ID, "paymentStatus", "providerType", "requestToken", "saved", "subscriptionId", "tenderType", "Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;", "transactionDetails", "transactionStatus", "transactionStatusDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;Ljava/lang/String;Ljava/lang/String;)V", "Lfj/F;", "s", "()Lfj/F;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/TenderResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;", "()Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "f", "Ljava/lang/Double;", "()Ljava/lang/Double;", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;", "()Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;", "q", "r", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class TenderResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCardType cardType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean defaultPayment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double desiredChargeAmount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expiryMonth;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expiryYear;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentStatus;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String providerType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String requestToken;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean saved;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tenderType;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisTransactionDetails transactionDetails;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionStatus;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionStatusDetails;

    public TenderResponse(@g(name = "authCode") String str, @g(name = "authTime") String str2, @g(name = "cardNumber") String str3, @g(name = "cardType") HybrisCardType hybrisCardType, @g(name = "defaultPayment") Boolean bool, @g(name = "desiredChargeAmount") Double d10, @g(name = "expiryMonth") String str4, @g(name = "expiryYear") String str5, @g(name = PreferencesHelper.PREF_ID) String str6, @g(name = "paymentStatus") String str7, @g(name = "providerType") String str8, @g(name = "requestToken") String str9, @g(name = "saved") Boolean bool2, @g(name = "subscriptionId") String str10, @g(name = "tenderType") String str11, @g(name = "transactionDetails") HybrisTransactionDetails hybrisTransactionDetails, @g(name = "transactionStatus") String str12, @g(name = "transactionStatusDetails") String str13) {
        this.authCode = str;
        this.authTime = str2;
        this.cardNumber = str3;
        this.cardType = hybrisCardType;
        this.defaultPayment = bool;
        this.desiredChargeAmount = d10;
        this.expiryMonth = str4;
        this.expiryYear = str5;
        this.id = str6;
        this.paymentStatus = str7;
        this.providerType = str8;
        this.requestToken = str9;
        this.saved = bool2;
        this.subscriptionId = str10;
        this.tenderType = str11;
        this.transactionDetails = hybrisTransactionDetails;
        this.transactionStatus = str12;
        this.transactionStatusDetails = str13;
    }

    public final TenderResponse copy(@g(name = "authCode") String authCode, @g(name = "authTime") String authTime, @g(name = "cardNumber") String cardNumber, @g(name = "cardType") HybrisCardType cardType, @g(name = "defaultPayment") Boolean defaultPayment, @g(name = "desiredChargeAmount") Double desiredChargeAmount, @g(name = "expiryMonth") String expiryMonth, @g(name = "expiryYear") String expiryYear, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "paymentStatus") String paymentStatus, @g(name = "providerType") String providerType, @g(name = "requestToken") String requestToken, @g(name = "saved") Boolean saved, @g(name = "subscriptionId") String subscriptionId, @g(name = "tenderType") String tenderType, @g(name = "transactionDetails") HybrisTransactionDetails transactionDetails, @g(name = "transactionStatus") String transactionStatus, @g(name = "transactionStatusDetails") String transactionStatusDetails) {
        return new TenderResponse(authCode, authTime, cardNumber, cardType, defaultPayment, desiredChargeAmount, expiryMonth, expiryYear, id2, paymentStatus, providerType, requestToken, saved, subscriptionId, tenderType, transactionDetails, transactionStatus, transactionStatusDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TenderResponse)) {
            return false;
        }
        TenderResponse tenderResponse = (TenderResponse) other;
        return Intrinsics.e(this.authCode, tenderResponse.authCode) && Intrinsics.e(this.authTime, tenderResponse.authTime) && Intrinsics.e(this.cardNumber, tenderResponse.cardNumber) && Intrinsics.e(this.cardType, tenderResponse.cardType) && Intrinsics.e(this.defaultPayment, tenderResponse.defaultPayment) && Intrinsics.e(this.desiredChargeAmount, tenderResponse.desiredChargeAmount) && Intrinsics.e(this.expiryMonth, tenderResponse.expiryMonth) && Intrinsics.e(this.expiryYear, tenderResponse.expiryYear) && Intrinsics.e(this.id, tenderResponse.id) && Intrinsics.e(this.paymentStatus, tenderResponse.paymentStatus) && Intrinsics.e(this.providerType, tenderResponse.providerType) && Intrinsics.e(this.requestToken, tenderResponse.requestToken) && Intrinsics.e(this.saved, tenderResponse.saved) && Intrinsics.e(this.subscriptionId, tenderResponse.subscriptionId) && Intrinsics.e(this.tenderType, tenderResponse.tenderType) && Intrinsics.e(this.transactionDetails, tenderResponse.transactionDetails) && Intrinsics.e(this.transactionStatus, tenderResponse.transactionStatus) && Intrinsics.e(this.transactionStatusDetails, tenderResponse.transactionStatusDetails);
    }

    public int hashCode() {
        String str = this.authCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authTime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HybrisCardType hybrisCardType = this.cardType;
        int iHashCode4 = (iHashCode3 + (hybrisCardType == null ? 0 : hybrisCardType.hashCode())) * 31;
        Boolean bool = this.defaultPayment;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d10 = this.desiredChargeAmount;
        int iHashCode6 = (iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str4 = this.expiryMonth;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expiryYear;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.id;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentStatus;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.providerType;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.requestToken;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool2 = this.saved;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str10 = this.subscriptionId;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tenderType;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        HybrisTransactionDetails hybrisTransactionDetails = this.transactionDetails;
        int iHashCode16 = (iHashCode15 + (hybrisTransactionDetails == null ? 0 : hybrisTransactionDetails.hashCode())) * 31;
        String str12 = this.transactionStatus;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.transactionStatusDetails;
        return iHashCode17 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "TenderResponse(authCode=" + this.authCode + ", authTime=" + this.authTime + ", cardNumber=" + this.cardNumber + ", cardType=" + this.cardType + ", defaultPayment=" + this.defaultPayment + ", desiredChargeAmount=" + this.desiredChargeAmount + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", id=" + this.id + ", paymentStatus=" + this.paymentStatus + ", providerType=" + this.providerType + ", requestToken=" + this.requestToken + ", saved=" + this.saved + ", subscriptionId=" + this.subscriptionId + ", tenderType=" + this.tenderType + ", transactionDetails=" + this.transactionDetails + ", transactionStatus=" + this.transactionStatus + ", transactionStatusDetails=" + this.transactionStatusDetails + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getAuthTime() {
        return this.authTime;
    }

    /* renamed from: c, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: d, reason: from getter */
    public final HybrisCardType getCardType() {
        return this.cardType;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getDefaultPayment() {
        return this.defaultPayment;
    }

    /* renamed from: f, reason: from getter */
    public final Double getDesiredChargeAmount() {
        return this.desiredChargeAmount;
    }

    /* renamed from: g, reason: from getter */
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    /* renamed from: h, reason: from getter */
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    /* renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: j, reason: from getter */
    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    /* renamed from: k, reason: from getter */
    public final String getProviderType() {
        return this.providerType;
    }

    /* renamed from: l, reason: from getter */
    public final String getRequestToken() {
        return this.requestToken;
    }

    /* renamed from: m, reason: from getter */
    public final Boolean getSaved() {
        return this.saved;
    }

    /* renamed from: n, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* renamed from: o, reason: from getter */
    public final String getTenderType() {
        return this.tenderType;
    }

    /* renamed from: p, reason: from getter */
    public final HybrisTransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    /* renamed from: q, reason: from getter */
    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    /* renamed from: r, reason: from getter */
    public final String getTransactionStatusDetails() {
        return this.transactionStatusDetails;
    }

    public final Tender s() {
        CardType cardTypeH;
        List listM;
        List<PaymentCreditDetailInfoResponse> listA;
        String str = this.cardNumber;
        if (str == null) {
            str = "";
        }
        HybrisCardType hybrisCardType = this.cardType;
        if (hybrisCardType == null || (cardTypeH = o.a(hybrisCardType)) == null) {
            cardTypeH = CardType.INSTANCE.h();
        }
        String str2 = this.tenderType;
        String str3 = str2 != null ? str2 : "";
        HybrisTransactionDetails hybrisTransactionDetails = this.transactionDetails;
        if (hybrisTransactionDetails == null || (listA = hybrisTransactionDetails.a()) == null) {
            listM = null;
        } else {
            List<PaymentCreditDetailInfoResponse> list = listA;
            listM = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(((PaymentCreditDetailInfoResponse) it.next()).f());
            }
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return new Tender(str, cardTypeH, str3, listM);
    }

    public /* synthetic */ TenderResponse(String str, String str2, String str3, HybrisCardType hybrisCardType, Boolean bool, Double d10, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool2, String str10, String str11, HybrisTransactionDetails hybrisTransactionDetails, String str12, String str13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : hybrisCardType, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : d10, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? null : str8, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str9, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : bool2, (i10 & 8192) != 0 ? null : str10, (i10 & 16384) != 0 ? null : str11, (32768 & i10) != 0 ? null : hybrisTransactionDetails, (65536 & i10) != 0 ? null : str12, (i10 & 131072) != 0 ? null : str13);
    }
}
