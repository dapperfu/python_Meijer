package ej;

import androidx.recyclerview.widget.RecyclerView;
import ci.CustomerAddress;
import io.constructor.data.local.PreferencesHelper;
import j$.time.Month;
import j$.time.Year;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001f\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b,\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b0\u0010>R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\b4\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\b8\u0010 R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\bA\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u00107R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bA\u00109\u001a\u0004\bD\u0010;R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\b<\u0010>R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010(\u001a\u0004\b?\u0010 R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b@\u0010IR\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bB\u00103¨\u0006K"}, d2 = {"Lej/u;", "", "", "accountHolderName", "Lci/c;", "billingAddress", "Lcom/meijer/mobile/core/model/common/CreditCardNumber;", "cardNumber", "Lej/d;", "cardType", "", "isDefaultPayment", "j$/time/Month", "expiryMonth", "j$/time/Year", "expiryYear", "j$/time/YearMonth", "expiryDate", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "issueNumber", "isSaved", "startMonth", "startYear", "startDate", "subscriptionId", "Lej/x;", "transactionStatus", "isPaymentDeclined", "<init>", "(Ljava/lang/String;Lci/c;Ljava/lang/String;Lej/d;ZLj$/time/Month;Lj$/time/Year;Lj$/time/YearMonth;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Month;Lj$/time/Year;Lj$/time/YearMonth;Ljava/lang/String;Lej/x;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lci/c;", "()Lci/c;", "c", "d", "Lej/d;", "()Lej/d;", "e", "Z", "k", "()Z", "f", "Lj$/time/Month;", "getExpiryMonth", "()Lj$/time/Month;", "g", "Lj$/time/Year;", "getExpiryYear", "()Lj$/time/Year;", "h", "Lj$/time/YearMonth;", "()Lj$/time/YearMonth;", "i", "j", "m", "l", "getStartMonth", "getStartYear", "n", "o", "p", "Lej/x;", "()Lej/x;", "q", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ej.u, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class PaymentDetailItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountHolderName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerAddress billingAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardType cardType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDefaultPayment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Month expiryMonth;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Year expiryYear;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final YearMonth expiryDate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issueNumber;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSaved;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Month startMonth;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Year startYear;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final YearMonth startDate;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final x transactionStatus;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPaymentDeclined;

    public PaymentDetailItem() {
        this(null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, 131071, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDetailItem)) {
            return false;
        }
        PaymentDetailItem paymentDetailItem = (PaymentDetailItem) other;
        return Intrinsics.e(this.accountHolderName, paymentDetailItem.accountHolderName) && Intrinsics.e(this.billingAddress, paymentDetailItem.billingAddress) && Intrinsics.e(this.cardNumber, paymentDetailItem.cardNumber) && Intrinsics.e(this.cardType, paymentDetailItem.cardType) && this.isDefaultPayment == paymentDetailItem.isDefaultPayment && this.expiryMonth == paymentDetailItem.expiryMonth && Intrinsics.e(this.expiryYear, paymentDetailItem.expiryYear) && Intrinsics.e(this.expiryDate, paymentDetailItem.expiryDate) && Intrinsics.e(this.id, paymentDetailItem.id) && Intrinsics.e(this.issueNumber, paymentDetailItem.issueNumber) && this.isSaved == paymentDetailItem.isSaved && this.startMonth == paymentDetailItem.startMonth && Intrinsics.e(this.startYear, paymentDetailItem.startYear) && Intrinsics.e(this.startDate, paymentDetailItem.startDate) && Intrinsics.e(this.subscriptionId, paymentDetailItem.subscriptionId) && this.transactionStatus == paymentDetailItem.transactionStatus && this.isPaymentDeclined == paymentDetailItem.isPaymentDeclined;
    }

    public PaymentDetailItem(String str, CustomerAddress customerAddress, String str2, CardType cardType, boolean z10, Month month, Year year, YearMonth yearMonth, String str3, String str4, boolean z11, Month month2, Year year2, YearMonth yearMonth2, String str5, x xVar, boolean z12) {
        this.accountHolderName = str;
        this.billingAddress = customerAddress;
        this.cardNumber = str2;
        this.cardType = cardType;
        this.isDefaultPayment = z10;
        this.expiryMonth = month;
        this.expiryYear = year;
        this.expiryDate = yearMonth;
        this.id = str3;
        this.issueNumber = str4;
        this.isSaved = z11;
        this.startMonth = month2;
        this.startYear = year2;
        this.startDate = yearMonth2;
        this.subscriptionId = str5;
        this.transactionStatus = xVar;
        this.isPaymentDeclined = z12;
    }

    /* renamed from: a, reason: from getter */
    public final String getAccountHolderName() {
        return this.accountHolderName;
    }

    /* renamed from: b, reason: from getter */
    public final CustomerAddress getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: c, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: d, reason: from getter */
    public final CardType getCardType() {
        return this.cardType;
    }

    /* renamed from: e, reason: from getter */
    public final YearMonth getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public final String getIssueNumber() {
        return this.issueNumber;
    }

    /* renamed from: h, reason: from getter */
    public final YearMonth getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        String str = this.accountHolderName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CustomerAddress customerAddress = this.billingAddress;
        int iHashCode2 = (iHashCode + (customerAddress == null ? 0 : customerAddress.hashCode())) * 31;
        String str2 = this.cardNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CardType cardType = this.cardType;
        int iHashCode4 = (((iHashCode3 + (cardType == null ? 0 : cardType.hashCode())) * 31) + Boolean.hashCode(this.isDefaultPayment)) * 31;
        Month month = this.expiryMonth;
        int iHashCode5 = (iHashCode4 + (month == null ? 0 : month.hashCode())) * 31;
        Year year = this.expiryYear;
        int iHashCode6 = (iHashCode5 + (year == null ? 0 : year.hashCode())) * 31;
        YearMonth yearMonth = this.expiryDate;
        int iHashCode7 = (iHashCode6 + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.issueNumber;
        int iHashCode9 = (((iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isSaved)) * 31;
        Month month2 = this.startMonth;
        int iHashCode10 = (iHashCode9 + (month2 == null ? 0 : month2.hashCode())) * 31;
        Year year2 = this.startYear;
        int iHashCode11 = (iHashCode10 + (year2 == null ? 0 : year2.hashCode())) * 31;
        YearMonth yearMonth2 = this.startDate;
        int iHashCode12 = (iHashCode11 + (yearMonth2 == null ? 0 : yearMonth2.hashCode())) * 31;
        String str5 = this.subscriptionId;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        x xVar = this.transactionStatus;
        return ((iHashCode13 + (xVar != null ? xVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPaymentDeclined);
    }

    /* renamed from: i, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* renamed from: j, reason: from getter */
    public final x getTransactionStatus() {
        return this.transactionStatus;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsDefaultPayment() {
        return this.isDefaultPayment;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsPaymentDeclined() {
        return this.isPaymentDeclined;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsSaved() {
        return this.isSaved;
    }

    public String toString() {
        return "PaymentDetailItem(accountHolderName=" + this.accountHolderName + ", billingAddress=" + this.billingAddress + ", cardNumber=" + this.cardNumber + ", cardType=" + this.cardType + ", isDefaultPayment=" + this.isDefaultPayment + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", expiryDate=" + this.expiryDate + ", id=" + this.id + ", issueNumber=" + this.issueNumber + ", isSaved=" + this.isSaved + ", startMonth=" + this.startMonth + ", startYear=" + this.startYear + ", startDate=" + this.startDate + ", subscriptionId=" + this.subscriptionId + ", transactionStatus=" + this.transactionStatus + ", isPaymentDeclined=" + this.isPaymentDeclined + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaymentDetailItem(String str, CustomerAddress customerAddress, String str2, CardType cardType, boolean z10, Month month, Year year, YearMonth yearMonth, String str3, String str4, boolean z11, Month month2, Year year2, YearMonth yearMonth2, String str5, x xVar, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        YearMonth yearMonthAtMonth;
        YearMonth yearMonthAtMonth2;
        boolean z13;
        String str6;
        String str7 = (i10 & 1) != 0 ? null : str;
        CustomerAddress customerAddress2 = (i10 & 2) != 0 ? null : customerAddress;
        String str8 = (i10 & 4) != 0 ? null : str2;
        CardType cardType2 = (i10 & 8) != 0 ? null : cardType;
        boolean z14 = (i10 & 16) != 0 ? false : z10;
        Month month3 = (i10 & 32) != 0 ? null : month;
        Year year3 = (i10 & 64) != 0 ? null : year;
        if ((i10 & 128) != 0) {
            yearMonthAtMonth = (month3 == null || year3 == null) ? null : year3.atMonth(month3);
        } else {
            yearMonthAtMonth = yearMonth;
        }
        String str9 = (i10 & 256) != 0 ? null : str3;
        String str10 = (i10 & 512) != 0 ? null : str4;
        boolean z15 = (i10 & 1024) != 0 ? false : z11;
        Month month4 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : month2;
        Year year4 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : year2;
        if ((i10 & 8192) != 0) {
            yearMonthAtMonth2 = year4 != null ? year4.atMonth(month4) : null;
        } else {
            yearMonthAtMonth2 = yearMonth2;
        }
        String str11 = (i10 & 16384) != 0 ? null : str5;
        x xVar2 = (i10 & 32768) != 0 ? null : xVar;
        if ((i10 & 65536) != 0) {
            str6 = str7;
            z13 = xVar2 == x.f129009c;
        } else {
            z13 = z12;
            str6 = str7;
        }
        this(str6, customerAddress2, str8, cardType2, z14, month3, year3, yearMonthAtMonth, str9, str10, z15, month4, year4, yearMonthAtMonth2, str11, xVar2, z13);
    }
}
