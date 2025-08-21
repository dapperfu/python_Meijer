package com.meijer.mobile.cart.model.hybris;

import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import fj.x;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u000f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u000e\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\n\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJÖ\u0001\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u000f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0013\u001a\u00020\n2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001f\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b*\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b1\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b2\u0010\u001eR\u001f\u0010\u000f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b9\u00100R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b:\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b;\u0010\u001eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b<\u0010\u001eR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b8\u0010\u001eR\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b=\u00100¨\u0006>"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "", "", "accountHolderName", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "billingAddress", "Lcom/meijer/mobile/core/model/common/CreditCardNumber;", "cardNumber", "Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;", "cardType", "", "defaultPayment", "expiryMonth", "expiryYear", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;", "transactionDetails", "issueNumber", "saved", "startMonth", "startYear", "subscriptionId", "paymentStatus", "isPaymentDeclined", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "()Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "c", "d", "Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;", "()Lcom/meijer/mobile/cart/model/hybris/HybrisCardType;", "e", "Z", "()Z", "f", "g", "h", "i", "Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;", "o", "()Lcom/meijer/mobile/cart/model/hybris/HybrisTransactionDetails;", "j", "k", "l", "m", "n", "p", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class PaymentDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountHolderName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCustomerAddress billingAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCardType cardType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean defaultPayment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expiryMonth;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expiryYear;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisTransactionDetails transactionDetails;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issueNumber;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean saved;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startMonth;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startYear;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentStatus;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPaymentDeclined;

    public PaymentDetails() {
        this(null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, 65535, null);
    }

    public final PaymentDetails copy(@g(name = "accountHolderName") String accountHolderName, @g(name = "billingAddress") HybrisCustomerAddress billingAddress, @g(name = "cardNumber") String cardNumber, @g(name = "cardType") HybrisCardType cardType, @g(name = "defaultPayment") boolean defaultPayment, @g(name = "expiryMonth") String expiryMonth, @g(name = "expiryYear") String expiryYear, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "transactionDetails") HybrisTransactionDetails transactionDetails, @g(name = "issueNumber") String issueNumber, @g(name = "saved") boolean saved, @g(name = "startMonth") String startMonth, @g(name = "startYear") String startYear, @g(name = "subscriptionId") String subscriptionId, @g(name = "paymentStatus") String paymentStatus, boolean isPaymentDeclined) {
        return new PaymentDetails(accountHolderName, billingAddress, cardNumber, cardType, defaultPayment, expiryMonth, expiryYear, id2, transactionDetails, issueNumber, saved, startMonth, startYear, subscriptionId, paymentStatus, isPaymentDeclined);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDetails)) {
            return false;
        }
        PaymentDetails paymentDetails = (PaymentDetails) other;
        return Intrinsics.e(this.accountHolderName, paymentDetails.accountHolderName) && Intrinsics.e(this.billingAddress, paymentDetails.billingAddress) && Intrinsics.e(this.cardNumber, paymentDetails.cardNumber) && Intrinsics.e(this.cardType, paymentDetails.cardType) && this.defaultPayment == paymentDetails.defaultPayment && Intrinsics.e(this.expiryMonth, paymentDetails.expiryMonth) && Intrinsics.e(this.expiryYear, paymentDetails.expiryYear) && Intrinsics.e(this.id, paymentDetails.id) && Intrinsics.e(this.transactionDetails, paymentDetails.transactionDetails) && Intrinsics.e(this.issueNumber, paymentDetails.issueNumber) && this.saved == paymentDetails.saved && Intrinsics.e(this.startMonth, paymentDetails.startMonth) && Intrinsics.e(this.startYear, paymentDetails.startYear) && Intrinsics.e(this.subscriptionId, paymentDetails.subscriptionId) && Intrinsics.e(this.paymentStatus, paymentDetails.paymentStatus) && this.isPaymentDeclined == paymentDetails.isPaymentDeclined;
    }

    public int hashCode() {
        String str = this.accountHolderName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        HybrisCustomerAddress hybrisCustomerAddress = this.billingAddress;
        int iHashCode2 = (iHashCode + (hybrisCustomerAddress == null ? 0 : hybrisCustomerAddress.hashCode())) * 31;
        String str2 = this.cardNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HybrisCardType hybrisCardType = this.cardType;
        int iHashCode4 = (((iHashCode3 + (hybrisCardType == null ? 0 : hybrisCardType.hashCode())) * 31) + Boolean.hashCode(this.defaultPayment)) * 31;
        String str3 = this.expiryMonth;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiryYear;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.id;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        HybrisTransactionDetails hybrisTransactionDetails = this.transactionDetails;
        int iHashCode8 = (iHashCode7 + (hybrisTransactionDetails == null ? 0 : hybrisTransactionDetails.hashCode())) * 31;
        String str6 = this.issueNumber;
        int iHashCode9 = (((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.saved)) * 31;
        String str7 = this.startMonth;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.startYear;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.subscriptionId;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.paymentStatus;
        return ((iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPaymentDeclined);
    }

    public String toString() {
        return "PaymentDetails(accountHolderName=" + this.accountHolderName + ", billingAddress=" + this.billingAddress + ", cardNumber=" + this.cardNumber + ", cardType=" + this.cardType + ", defaultPayment=" + this.defaultPayment + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", id=" + this.id + ", transactionDetails=" + this.transactionDetails + ", issueNumber=" + this.issueNumber + ", saved=" + this.saved + ", startMonth=" + this.startMonth + ", startYear=" + this.startYear + ", subscriptionId=" + this.subscriptionId + ", paymentStatus=" + this.paymentStatus + ", isPaymentDeclined=" + this.isPaymentDeclined + ')';
    }

    public PaymentDetails(@g(name = "accountHolderName") String str, @g(name = "billingAddress") HybrisCustomerAddress hybrisCustomerAddress, @g(name = "cardNumber") String str2, @g(name = "cardType") HybrisCardType hybrisCardType, @g(name = "defaultPayment") boolean z10, @g(name = "expiryMonth") String str3, @g(name = "expiryYear") String str4, @g(name = PreferencesHelper.PREF_ID) String str5, @g(name = "transactionDetails") HybrisTransactionDetails hybrisTransactionDetails, @g(name = "issueNumber") String str6, @g(name = "saved") boolean z11, @g(name = "startMonth") String str7, @g(name = "startYear") String str8, @g(name = "subscriptionId") String str9, @g(name = "paymentStatus") String str10, boolean z12) {
        this.accountHolderName = str;
        this.billingAddress = hybrisCustomerAddress;
        this.cardNumber = str2;
        this.cardType = hybrisCardType;
        this.defaultPayment = z10;
        this.expiryMonth = str3;
        this.expiryYear = str4;
        this.id = str5;
        this.transactionDetails = hybrisTransactionDetails;
        this.issueNumber = str6;
        this.saved = z11;
        this.startMonth = str7;
        this.startYear = str8;
        this.subscriptionId = str9;
        this.paymentStatus = str10;
        this.isPaymentDeclined = z12;
    }

    /* renamed from: a, reason: from getter */
    public final String getAccountHolderName() {
        return this.accountHolderName;
    }

    /* renamed from: b, reason: from getter */
    public final HybrisCustomerAddress getBillingAddress() {
        return this.billingAddress;
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
    public final boolean getDefaultPayment() {
        return this.defaultPayment;
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
    public final String getIssueNumber() {
        return this.issueNumber;
    }

    /* renamed from: j, reason: from getter */
    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getSaved() {
        return this.saved;
    }

    /* renamed from: l, reason: from getter */
    public final String getStartMonth() {
        return this.startMonth;
    }

    /* renamed from: m, reason: from getter */
    public final String getStartYear() {
        return this.startYear;
    }

    /* renamed from: n, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* renamed from: o, reason: from getter */
    public final HybrisTransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsPaymentDeclined() {
        return this.isPaymentDeclined;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaymentDetails(String str, HybrisCustomerAddress hybrisCustomerAddress, String str2, HybrisCardType hybrisCardType, boolean z10, String str3, String str4, String str5, HybrisTransactionDetails hybrisTransactionDetails, String str6, boolean z11, String str7, String str8, String str9, String str10, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z13;
        String str11;
        String str12 = (i10 & 1) != 0 ? null : str;
        HybrisCustomerAddress hybrisCustomerAddress2 = (i10 & 2) != 0 ? null : hybrisCustomerAddress;
        String str13 = (i10 & 4) != 0 ? null : str2;
        HybrisCardType hybrisCardType2 = (i10 & 8) != 0 ? null : hybrisCardType;
        boolean z14 = (i10 & 16) != 0 ? false : z10;
        String str14 = (i10 & 32) != 0 ? null : str3;
        String str15 = (i10 & 64) != 0 ? null : str4;
        String str16 = (i10 & 128) != 0 ? null : str5;
        HybrisTransactionDetails hybrisTransactionDetails2 = (i10 & 256) != 0 ? null : hybrisTransactionDetails;
        String str17 = (i10 & 512) != 0 ? null : str6;
        boolean z15 = (i10 & 1024) != 0 ? false : z11;
        String str18 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str7;
        String str19 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str8;
        String str20 = (i10 & 8192) != 0 ? null : str9;
        String str21 = (i10 & 16384) != 0 ? null : str10;
        if ((i10 & 32768) != 0) {
            str11 = str12;
            z13 = (str21 != null ? x.valueOf(str21) : null) == x.f131998c;
        } else {
            z13 = z12;
            str11 = str12;
        }
        this(str11, hybrisCustomerAddress2, str13, hybrisCardType2, z14, str14, str15, str16, hybrisTransactionDetails2, str17, z15, str18, str19, str20, str21, z13);
    }
}
