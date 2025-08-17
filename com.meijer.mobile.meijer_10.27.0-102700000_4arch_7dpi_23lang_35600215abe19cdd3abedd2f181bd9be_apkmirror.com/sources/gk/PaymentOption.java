package gk;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import io.constructor.data.local.PreferencesHelper;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J®\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b(\u0010#J\u001a\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b.\u00104\u001a\u0004\b5\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b:\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010>\u001a\u0004\bA\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\bB\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\bC\u0010'R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bD\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\b6\u0010'¨\u0006H"}, d2 = {"Lgk/f;", "Landroid/os/Parcelable;", "Lgk/c;", "accountHolderName", "Lgk/b;", "billingAddress", "", "Lcom/meijer/mobile/core/model/common/CreditCardNumber;", "cardNumber", "Lgk/h;", "cardType", "cardCvNumber", "", "defaultPayment", "j$/time/YearMonth", "expiryDate", "startDate", PreferencesHelper.PREF_ID, "issueNumber", "saved", "providerType", "authToken", "<init>", "(Lgk/c;Lgk/b;Ljava/lang/String;Lgk/h;Ljava/lang/String;ZLj$/time/YearMonth;Lj$/time/YearMonth;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "now", "o", "(Lj$/time/YearMonth;)Z", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Lgk/c;Lgk/b;Ljava/lang/String;Lgk/h;Ljava/lang/String;ZLj$/time/YearMonth;Lj$/time/YearMonth;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lgk/f;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lgk/c;", "c", "()Lgk/c;", "b", "Lgk/b;", "e", "()Lgk/b;", "Ljava/lang/String;", "g", "d", "Lgk/h;", "h", "()Lgk/h;", "f", "Z", "i", "()Z", "Lj$/time/YearMonth;", "j", "()Lj$/time/YearMonth;", "getStartDate", "k", "getIssueNumber", "getSaved", "l", "n", "m", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gk.f, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class PaymentOption implements Parcelable {
    public static final Parcelable.Creator<PaymentOption> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardHolderName accountHolderName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BillingAddress billingAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final h cardType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardCvNumber;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean defaultPayment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final YearMonth expiryDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final YearMonth startDate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issueNumber;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean saved;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String providerType;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authToken;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gk.f$a */
    public static final class a implements Parcelable.Creator<PaymentOption> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentOption createFromParcel(Parcel parcel) {
            boolean z10;
            Intrinsics.j(parcel, "parcel");
            CardHolderName cardHolderNameCreateFromParcel = parcel.readInt() == 0 ? null : CardHolderName.CREATOR.createFromParcel(parcel);
            BillingAddress billingAddressCreateFromParcel = parcel.readInt() == 0 ? null : BillingAddress.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            h hVarValueOf = parcel.readInt() != 0 ? h.valueOf(parcel.readString()) : null;
            String string2 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            YearMonth yearMonth = (YearMonth) parcel.readSerializable();
            YearMonth yearMonth2 = (YearMonth) parcel.readSerializable();
            String string3 = parcel.readString();
            boolean z12 = true;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                z12 = z10;
            }
            return new PaymentOption(cardHolderNameCreateFromParcel, billingAddressCreateFromParcel, string, hVarValueOf, string2, z11, yearMonth, yearMonth2, string3, string4, z12, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentOption[] newArray(int i10) {
            return new PaymentOption[i10];
        }
    }

    public PaymentOption() {
        this(null, null, null, null, null, false, null, null, null, null, false, null, null, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOption)) {
            return false;
        }
        PaymentOption paymentOption = (PaymentOption) other;
        return Intrinsics.e(this.accountHolderName, paymentOption.accountHolderName) && Intrinsics.e(this.billingAddress, paymentOption.billingAddress) && Intrinsics.e(this.cardNumber, paymentOption.cardNumber) && this.cardType == paymentOption.cardType && Intrinsics.e(this.cardCvNumber, paymentOption.cardCvNumber) && this.defaultPayment == paymentOption.defaultPayment && Intrinsics.e(this.expiryDate, paymentOption.expiryDate) && Intrinsics.e(this.startDate, paymentOption.startDate) && Intrinsics.e(this.id, paymentOption.id) && Intrinsics.e(this.issueNumber, paymentOption.issueNumber) && this.saved == paymentOption.saved && Intrinsics.e(this.providerType, paymentOption.providerType) && Intrinsics.e(this.authToken, paymentOption.authToken);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        CardHolderName cardHolderName = this.accountHolderName;
        if (cardHolderName == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardHolderName.writeToParcel(dest, flags);
        }
        BillingAddress billingAddress = this.billingAddress;
        if (billingAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billingAddress.writeToParcel(dest, flags);
        }
        dest.writeString(this.cardNumber);
        h hVar = this.cardType;
        if (hVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(hVar.name());
        }
        dest.writeString(this.cardCvNumber);
        dest.writeInt(this.defaultPayment ? 1 : 0);
        dest.writeSerializable(this.expiryDate);
        dest.writeSerializable(this.startDate);
        dest.writeString(this.id);
        dest.writeString(this.issueNumber);
        dest.writeInt(this.saved ? 1 : 0);
        dest.writeString(this.providerType);
        dest.writeString(this.authToken);
    }

    public PaymentOption(CardHolderName cardHolderName, BillingAddress billingAddress, String str, h hVar, String str2, boolean z10, YearMonth yearMonth, YearMonth yearMonth2, String str3, String str4, boolean z11, String str5, String str6) {
        this.accountHolderName = cardHolderName;
        this.billingAddress = billingAddress;
        this.cardNumber = str;
        this.cardType = hVar;
        this.cardCvNumber = str2;
        this.defaultPayment = z10;
        this.expiryDate = yearMonth;
        this.startDate = yearMonth2;
        this.id = str3;
        this.issueNumber = str4;
        this.saved = z11;
        this.providerType = str5;
        this.authToken = str6;
    }

    public static /* synthetic */ PaymentOption b(PaymentOption paymentOption, CardHolderName cardHolderName, BillingAddress billingAddress, String str, h hVar, String str2, boolean z10, YearMonth yearMonth, YearMonth yearMonth2, String str3, String str4, boolean z11, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cardHolderName = paymentOption.accountHolderName;
        }
        return paymentOption.a(cardHolderName, (i10 & 2) != 0 ? paymentOption.billingAddress : billingAddress, (i10 & 4) != 0 ? paymentOption.cardNumber : str, (i10 & 8) != 0 ? paymentOption.cardType : hVar, (i10 & 16) != 0 ? paymentOption.cardCvNumber : str2, (i10 & 32) != 0 ? paymentOption.defaultPayment : z10, (i10 & 64) != 0 ? paymentOption.expiryDate : yearMonth, (i10 & 128) != 0 ? paymentOption.startDate : yearMonth2, (i10 & 256) != 0 ? paymentOption.id : str3, (i10 & 512) != 0 ? paymentOption.issueNumber : str4, (i10 & 1024) != 0 ? paymentOption.saved : z11, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? paymentOption.providerType : str5, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? paymentOption.authToken : str6);
    }

    public final PaymentOption a(CardHolderName accountHolderName, BillingAddress billingAddress, String cardNumber, h cardType, String cardCvNumber, boolean defaultPayment, YearMonth expiryDate, YearMonth startDate, String id2, String issueNumber, boolean saved, String providerType, String authToken) {
        return new PaymentOption(accountHolderName, billingAddress, cardNumber, cardType, cardCvNumber, defaultPayment, expiryDate, startDate, id2, issueNumber, saved, providerType, authToken);
    }

    /* renamed from: c, reason: from getter */
    public final CardHolderName getAccountHolderName() {
        return this.accountHolderName;
    }

    /* renamed from: d, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    /* renamed from: e, reason: from getter */
    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: f, reason: from getter */
    public final String getCardCvNumber() {
        return this.cardCvNumber;
    }

    /* renamed from: g, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: h, reason: from getter */
    public final h getCardType() {
        return this.cardType;
    }

    public int hashCode() {
        CardHolderName cardHolderName = this.accountHolderName;
        int iHashCode = (cardHolderName == null ? 0 : cardHolderName.hashCode()) * 31;
        BillingAddress billingAddress = this.billingAddress;
        int iHashCode2 = (iHashCode + (billingAddress == null ? 0 : billingAddress.hashCode())) * 31;
        String str = this.cardNumber;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.cardType;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str2 = this.cardCvNumber;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.defaultPayment)) * 31;
        YearMonth yearMonth = this.expiryDate;
        int iHashCode6 = (iHashCode5 + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31;
        YearMonth yearMonth2 = this.startDate;
        int iHashCode7 = (iHashCode6 + (yearMonth2 == null ? 0 : yearMonth2.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.issueNumber;
        int iHashCode9 = (((iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.saved)) * 31;
        String str5 = this.providerType;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.authToken;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getDefaultPayment() {
        return this.defaultPayment;
    }

    /* renamed from: j, reason: from getter */
    public final YearMonth getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: k, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: n, reason: from getter */
    public final String getProviderType() {
        return this.providerType;
    }

    public final boolean o(YearMonth now) {
        Intrinsics.j(now, "now");
        YearMonth yearMonthMinusYears = this.expiryDate;
        if (yearMonthMinusYears == null) {
            yearMonthMinusYears = now.minusYears(1L);
        }
        return now.isAfter(yearMonthMinusYears);
    }

    public String toString() {
        return "PaymentOption(accountHolderName=" + this.accountHolderName + ", billingAddress=" + this.billingAddress + ", cardNumber=" + this.cardNumber + ", cardType=" + this.cardType + ", cardCvNumber=" + this.cardCvNumber + ", defaultPayment=" + this.defaultPayment + ", expiryDate=" + this.expiryDate + ", startDate=" + this.startDate + ", id=" + this.id + ", issueNumber=" + this.issueNumber + ", saved=" + this.saved + ", providerType=" + this.providerType + ", authToken=" + this.authToken + ')';
    }

    public /* synthetic */ PaymentOption(CardHolderName cardHolderName, BillingAddress billingAddress, String str, h hVar, String str2, boolean z10, YearMonth yearMonth, YearMonth yearMonth2, String str3, String str4, boolean z11, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : cardHolderName, (i10 & 2) != 0 ? null : billingAddress, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : hVar, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? null : yearMonth, (i10 & 128) != 0 ? null : yearMonth2, (i10 & 256) != 0 ? null : str3, (i10 & 512) != 0 ? null : str4, (i10 & 1024) == 0 ? z11 : false, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str5, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str6);
    }
}
