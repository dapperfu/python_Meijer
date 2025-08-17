package ej;

import androidx.recyclerview.widget.RecyclerView;
import io.constructor.data.local.PreferencesHelper;
import j$.time.Month;
import j$.time.Year;
import j$.time.YearMonth;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b3\b\u0086\b\u0018\u0000 R2\u00020\u0001:\u0001&BÓ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b*\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b1\u0010DR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bH\u0010.\u001a\u0004\bI\u00100R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bJ\u00102\u001a\u0004\bK\u0010\u001fR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bM\u0010\u001fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bN\u00102\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bO\u00102\u001a\u0004\b&\u0010\u001fR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bP\u00102\u001a\u0004\bQ\u0010\u001f¨\u0006S"}, d2 = {"Lej/G;", "", "Lej/J;", "transactionDetails", "", "desiredChargeAmount", "", "saved", "", "transactionStatus", "Lej/d;", "cardType", "j$/time/Month", "expiryMonth", "j$/time/ZonedDateTime", "authTime", "j$/time/Year", "expiryYear", "j$/time/YearMonth", "expiryDate", "tenderType", "transactionStatusDetails", "defaultPayment", PreferencesHelper.PREF_ID, "requestToken", "subscriptionId", "cardNumber", "paymentStatus", "<init>", "(Lej/J;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Lej/d;Lj$/time/Month;Lj$/time/ZonedDateTime;Lj$/time/Year;Lj$/time/YearMonth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lej/J;", "g", "()Lej/J;", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "Ljava/lang/Boolean;", "getSaved", "()Ljava/lang/Boolean;", "d", "Ljava/lang/String;", "getTransactionStatus", "e", "Lej/d;", "()Lej/d;", "f", "Lj$/time/Month;", "getExpiryMonth", "()Lj$/time/Month;", "Lj$/time/ZonedDateTime;", "getAuthTime", "()Lj$/time/ZonedDateTime;", "h", "Lj$/time/Year;", "getExpiryYear", "()Lj$/time/Year;", "i", "Lj$/time/YearMonth;", "()Lj$/time/YearMonth;", "j", "k", "getTransactionStatusDetails", "l", "getDefaultPayment", "m", "getId", "n", "getRequestToken", "o", "p", "q", "getPaymentStatus", "r", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.G, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class TendersItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionDetails transactionDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double desiredChargeAmount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean saved;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionStatus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardType cardType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Month expiryMonth;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime authTime;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Year expiryYear;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final YearMonth expiryDate;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tenderType;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionStatusDetails;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean defaultPayment;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String requestToken;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentStatus;

    public TendersItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TendersItem)) {
            return false;
        }
        TendersItem tendersItem = (TendersItem) other;
        return Intrinsics.e(this.transactionDetails, tendersItem.transactionDetails) && Intrinsics.e(this.desiredChargeAmount, tendersItem.desiredChargeAmount) && Intrinsics.e(this.saved, tendersItem.saved) && Intrinsics.e(this.transactionStatus, tendersItem.transactionStatus) && Intrinsics.e(this.cardType, tendersItem.cardType) && this.expiryMonth == tendersItem.expiryMonth && Intrinsics.e(this.authTime, tendersItem.authTime) && Intrinsics.e(this.expiryYear, tendersItem.expiryYear) && Intrinsics.e(this.expiryDate, tendersItem.expiryDate) && Intrinsics.e(this.tenderType, tendersItem.tenderType) && Intrinsics.e(this.transactionStatusDetails, tendersItem.transactionStatusDetails) && Intrinsics.e(this.defaultPayment, tendersItem.defaultPayment) && Intrinsics.e(this.id, tendersItem.id) && Intrinsics.e(this.requestToken, tendersItem.requestToken) && Intrinsics.e(this.subscriptionId, tendersItem.subscriptionId) && Intrinsics.e(this.cardNumber, tendersItem.cardNumber) && Intrinsics.e(this.paymentStatus, tendersItem.paymentStatus);
    }

    public TendersItem(TransactionDetails transactionDetails, Double d10, Boolean bool, String str, CardType cardType, Month month, ZonedDateTime zonedDateTime, Year year, YearMonth yearMonth, String str2, String str3, Boolean bool2, String str4, String str5, String str6, String str7, String str8) {
        this.transactionDetails = transactionDetails;
        this.desiredChargeAmount = d10;
        this.saved = bool;
        this.transactionStatus = str;
        this.cardType = cardType;
        this.expiryMonth = month;
        this.authTime = zonedDateTime;
        this.expiryYear = year;
        this.expiryDate = yearMonth;
        this.tenderType = str2;
        this.transactionStatusDetails = str3;
        this.defaultPayment = bool2;
        this.id = str4;
        this.requestToken = str5;
        this.subscriptionId = str6;
        this.cardNumber = str7;
        this.paymentStatus = str8;
    }

    /* renamed from: a, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: b, reason: from getter */
    public final CardType getCardType() {
        return this.cardType;
    }

    /* renamed from: c, reason: from getter */
    public final Double getDesiredChargeAmount() {
        return this.desiredChargeAmount;
    }

    /* renamed from: d, reason: from getter */
    public final YearMonth getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: e, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* renamed from: f, reason: from getter */
    public final String getTenderType() {
        return this.tenderType;
    }

    /* renamed from: g, reason: from getter */
    public final TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public int hashCode() {
        TransactionDetails transactionDetails = this.transactionDetails;
        int iHashCode = (transactionDetails == null ? 0 : transactionDetails.hashCode()) * 31;
        Double d10 = this.desiredChargeAmount;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Boolean bool = this.saved;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.transactionStatus;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CardType cardType = this.cardType;
        int iHashCode5 = (iHashCode4 + (cardType == null ? 0 : cardType.hashCode())) * 31;
        Month month = this.expiryMonth;
        int iHashCode6 = (iHashCode5 + (month == null ? 0 : month.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.authTime;
        int iHashCode7 = (iHashCode6 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        Year year = this.expiryYear;
        int iHashCode8 = (iHashCode7 + (year == null ? 0 : year.hashCode())) * 31;
        YearMonth yearMonth = this.expiryDate;
        int iHashCode9 = (iHashCode8 + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31;
        String str2 = this.tenderType;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transactionStatusDetails;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.defaultPayment;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.id;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.requestToken;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subscriptionId;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardNumber;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.paymentStatus;
        return iHashCode16 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "TendersItem(transactionDetails=" + this.transactionDetails + ", desiredChargeAmount=" + this.desiredChargeAmount + ", saved=" + this.saved + ", transactionStatus=" + this.transactionStatus + ", cardType=" + this.cardType + ", expiryMonth=" + this.expiryMonth + ", authTime=" + this.authTime + ", expiryYear=" + this.expiryYear + ", expiryDate=" + this.expiryDate + ", tenderType=" + this.tenderType + ", transactionStatusDetails=" + this.transactionStatusDetails + ", defaultPayment=" + this.defaultPayment + ", id=" + this.id + ", requestToken=" + this.requestToken + ", subscriptionId=" + this.subscriptionId + ", cardNumber=" + this.cardNumber + ", paymentStatus=" + this.paymentStatus + ')';
    }

    public /* synthetic */ TendersItem(TransactionDetails transactionDetails, Double d10, Boolean bool, String str, CardType cardType, Month month, ZonedDateTime zonedDateTime, Year year, YearMonth yearMonth, String str2, String str3, Boolean bool2, String str4, String str5, String str6, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : transactionDetails, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : cardType, (i10 & 32) != 0 ? null : month, (i10 & 64) != 0 ? null : zonedDateTime, (i10 & 128) != 0 ? null : year, (i10 & 256) != 0 ? null : yearMonth, (i10 & 512) != 0 ? null : str2, (i10 & 1024) != 0 ? null : str3, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : bool2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str4, (i10 & 8192) != 0 ? null : str5, (i10 & 16384) != 0 ? null : str6, (i10 & 32768) != 0 ? null : str7, (i10 & 65536) != 0 ? null : str8);
    }
}
