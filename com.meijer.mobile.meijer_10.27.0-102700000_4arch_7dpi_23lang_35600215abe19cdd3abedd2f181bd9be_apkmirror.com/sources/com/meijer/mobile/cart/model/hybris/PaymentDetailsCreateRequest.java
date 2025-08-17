package com.meijer.mobile.cart.model.hybris;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J¼\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\u00022\b\b\u0003\u0010\u0013\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b!\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b*\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b,\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b2\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b&\u0010\u0019¨\u00063"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/PaymentDetailsCreateRequest;", "", "", "cardCardType", "meijerMaskedAccountNumber", "cardCvNumber", "cardExpirationMonth", "cardExpirationYear", "authToken", "providerType", "ccAuthReplyAuthorizationCode", "billToFirstName", "billToLastName", "billToEmail", "billToStreet1", "billToStreet2", "billToCity", "billToState", "billToPostalCode", "billToCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/PaymentDetailsCreateRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "k", "b", "p", "c", "l", "d", "m", "e", "n", "f", "g", "q", "h", "o", "i", "j", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PaymentDetailsCreateRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardCardType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String meijerMaskedAccountNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardCvNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardExpirationMonth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardExpirationYear;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authToken;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String providerType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ccAuthReplyAuthorizationCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billToFirstName;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billToLastName;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billToEmail;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billToStreet1;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billToStreet2;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billToCity;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billToState;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billToPostalCode;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billToCountry;

    public PaymentDetailsCreateRequest(@g(name = "card_cardType") String cardCardType, @g(name = "meijerMaskedAccountNumber") String meijerMaskedAccountNumber, @g(name = "card_cvNumber") String cardCvNumber, @g(name = "card_expirationMonth") String cardExpirationMonth, @g(name = "card_expirationYear") String cardExpirationYear, @g(name = "auth_token") String authToken, @g(name = "providerType") String providerType, @g(name = "ccAuthReply_authorizationCode") String ccAuthReplyAuthorizationCode, @g(name = "billTo_firstName") String billToFirstName, @g(name = "billTo_lastName") String billToLastName, @g(name = "billTo_email") String billToEmail, @g(name = "billTo_street1") String billToStreet1, @g(name = "billTo_street2") String str, @g(name = "billTo_city") String billToCity, @g(name = "billTo_state") String billToState, @g(name = "billTo_postalCode") String billToPostalCode, @g(name = "billTo_country") String billToCountry) {
        Intrinsics.j(cardCardType, "cardCardType");
        Intrinsics.j(meijerMaskedAccountNumber, "meijerMaskedAccountNumber");
        Intrinsics.j(cardCvNumber, "cardCvNumber");
        Intrinsics.j(cardExpirationMonth, "cardExpirationMonth");
        Intrinsics.j(cardExpirationYear, "cardExpirationYear");
        Intrinsics.j(authToken, "authToken");
        Intrinsics.j(providerType, "providerType");
        Intrinsics.j(ccAuthReplyAuthorizationCode, "ccAuthReplyAuthorizationCode");
        Intrinsics.j(billToFirstName, "billToFirstName");
        Intrinsics.j(billToLastName, "billToLastName");
        Intrinsics.j(billToEmail, "billToEmail");
        Intrinsics.j(billToStreet1, "billToStreet1");
        Intrinsics.j(billToCity, "billToCity");
        Intrinsics.j(billToState, "billToState");
        Intrinsics.j(billToPostalCode, "billToPostalCode");
        Intrinsics.j(billToCountry, "billToCountry");
        this.cardCardType = cardCardType;
        this.meijerMaskedAccountNumber = meijerMaskedAccountNumber;
        this.cardCvNumber = cardCvNumber;
        this.cardExpirationMonth = cardExpirationMonth;
        this.cardExpirationYear = cardExpirationYear;
        this.authToken = authToken;
        this.providerType = providerType;
        this.ccAuthReplyAuthorizationCode = ccAuthReplyAuthorizationCode;
        this.billToFirstName = billToFirstName;
        this.billToLastName = billToLastName;
        this.billToEmail = billToEmail;
        this.billToStreet1 = billToStreet1;
        this.billToStreet2 = str;
        this.billToCity = billToCity;
        this.billToState = billToState;
        this.billToPostalCode = billToPostalCode;
        this.billToCountry = billToCountry;
    }

    public final PaymentDetailsCreateRequest copy(@g(name = "card_cardType") String cardCardType, @g(name = "meijerMaskedAccountNumber") String meijerMaskedAccountNumber, @g(name = "card_cvNumber") String cardCvNumber, @g(name = "card_expirationMonth") String cardExpirationMonth, @g(name = "card_expirationYear") String cardExpirationYear, @g(name = "auth_token") String authToken, @g(name = "providerType") String providerType, @g(name = "ccAuthReply_authorizationCode") String ccAuthReplyAuthorizationCode, @g(name = "billTo_firstName") String billToFirstName, @g(name = "billTo_lastName") String billToLastName, @g(name = "billTo_email") String billToEmail, @g(name = "billTo_street1") String billToStreet1, @g(name = "billTo_street2") String billToStreet2, @g(name = "billTo_city") String billToCity, @g(name = "billTo_state") String billToState, @g(name = "billTo_postalCode") String billToPostalCode, @g(name = "billTo_country") String billToCountry) {
        Intrinsics.j(cardCardType, "cardCardType");
        Intrinsics.j(meijerMaskedAccountNumber, "meijerMaskedAccountNumber");
        Intrinsics.j(cardCvNumber, "cardCvNumber");
        Intrinsics.j(cardExpirationMonth, "cardExpirationMonth");
        Intrinsics.j(cardExpirationYear, "cardExpirationYear");
        Intrinsics.j(authToken, "authToken");
        Intrinsics.j(providerType, "providerType");
        Intrinsics.j(ccAuthReplyAuthorizationCode, "ccAuthReplyAuthorizationCode");
        Intrinsics.j(billToFirstName, "billToFirstName");
        Intrinsics.j(billToLastName, "billToLastName");
        Intrinsics.j(billToEmail, "billToEmail");
        Intrinsics.j(billToStreet1, "billToStreet1");
        Intrinsics.j(billToCity, "billToCity");
        Intrinsics.j(billToState, "billToState");
        Intrinsics.j(billToPostalCode, "billToPostalCode");
        Intrinsics.j(billToCountry, "billToCountry");
        return new PaymentDetailsCreateRequest(cardCardType, meijerMaskedAccountNumber, cardCvNumber, cardExpirationMonth, cardExpirationYear, authToken, providerType, ccAuthReplyAuthorizationCode, billToFirstName, billToLastName, billToEmail, billToStreet1, billToStreet2, billToCity, billToState, billToPostalCode, billToCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDetailsCreateRequest)) {
            return false;
        }
        PaymentDetailsCreateRequest paymentDetailsCreateRequest = (PaymentDetailsCreateRequest) other;
        return Intrinsics.e(this.cardCardType, paymentDetailsCreateRequest.cardCardType) && Intrinsics.e(this.meijerMaskedAccountNumber, paymentDetailsCreateRequest.meijerMaskedAccountNumber) && Intrinsics.e(this.cardCvNumber, paymentDetailsCreateRequest.cardCvNumber) && Intrinsics.e(this.cardExpirationMonth, paymentDetailsCreateRequest.cardExpirationMonth) && Intrinsics.e(this.cardExpirationYear, paymentDetailsCreateRequest.cardExpirationYear) && Intrinsics.e(this.authToken, paymentDetailsCreateRequest.authToken) && Intrinsics.e(this.providerType, paymentDetailsCreateRequest.providerType) && Intrinsics.e(this.ccAuthReplyAuthorizationCode, paymentDetailsCreateRequest.ccAuthReplyAuthorizationCode) && Intrinsics.e(this.billToFirstName, paymentDetailsCreateRequest.billToFirstName) && Intrinsics.e(this.billToLastName, paymentDetailsCreateRequest.billToLastName) && Intrinsics.e(this.billToEmail, paymentDetailsCreateRequest.billToEmail) && Intrinsics.e(this.billToStreet1, paymentDetailsCreateRequest.billToStreet1) && Intrinsics.e(this.billToStreet2, paymentDetailsCreateRequest.billToStreet2) && Intrinsics.e(this.billToCity, paymentDetailsCreateRequest.billToCity) && Intrinsics.e(this.billToState, paymentDetailsCreateRequest.billToState) && Intrinsics.e(this.billToPostalCode, paymentDetailsCreateRequest.billToPostalCode) && Intrinsics.e(this.billToCountry, paymentDetailsCreateRequest.billToCountry);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.cardCardType.hashCode() * 31) + this.meijerMaskedAccountNumber.hashCode()) * 31) + this.cardCvNumber.hashCode()) * 31) + this.cardExpirationMonth.hashCode()) * 31) + this.cardExpirationYear.hashCode()) * 31) + this.authToken.hashCode()) * 31) + this.providerType.hashCode()) * 31) + this.ccAuthReplyAuthorizationCode.hashCode()) * 31) + this.billToFirstName.hashCode()) * 31) + this.billToLastName.hashCode()) * 31) + this.billToEmail.hashCode()) * 31) + this.billToStreet1.hashCode()) * 31;
        String str = this.billToStreet2;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.billToCity.hashCode()) * 31) + this.billToState.hashCode()) * 31) + this.billToPostalCode.hashCode()) * 31) + this.billToCountry.hashCode();
    }

    public String toString() {
        return "PaymentDetailsCreateRequest(cardCardType=" + this.cardCardType + ", meijerMaskedAccountNumber=" + this.meijerMaskedAccountNumber + ", cardCvNumber=" + this.cardCvNumber + ", cardExpirationMonth=" + this.cardExpirationMonth + ", cardExpirationYear=" + this.cardExpirationYear + ", authToken=" + this.authToken + ", providerType=" + this.providerType + ", ccAuthReplyAuthorizationCode=" + this.ccAuthReplyAuthorizationCode + ", billToFirstName=" + this.billToFirstName + ", billToLastName=" + this.billToLastName + ", billToEmail=" + this.billToEmail + ", billToStreet1=" + this.billToStreet1 + ", billToStreet2=" + this.billToStreet2 + ", billToCity=" + this.billToCity + ", billToState=" + this.billToState + ", billToPostalCode=" + this.billToPostalCode + ", billToCountry=" + this.billToCountry + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    /* renamed from: b, reason: from getter */
    public final String getBillToCity() {
        return this.billToCity;
    }

    /* renamed from: c, reason: from getter */
    public final String getBillToCountry() {
        return this.billToCountry;
    }

    /* renamed from: d, reason: from getter */
    public final String getBillToEmail() {
        return this.billToEmail;
    }

    /* renamed from: e, reason: from getter */
    public final String getBillToFirstName() {
        return this.billToFirstName;
    }

    /* renamed from: f, reason: from getter */
    public final String getBillToLastName() {
        return this.billToLastName;
    }

    /* renamed from: g, reason: from getter */
    public final String getBillToPostalCode() {
        return this.billToPostalCode;
    }

    /* renamed from: h, reason: from getter */
    public final String getBillToState() {
        return this.billToState;
    }

    /* renamed from: i, reason: from getter */
    public final String getBillToStreet1() {
        return this.billToStreet1;
    }

    /* renamed from: j, reason: from getter */
    public final String getBillToStreet2() {
        return this.billToStreet2;
    }

    /* renamed from: k, reason: from getter */
    public final String getCardCardType() {
        return this.cardCardType;
    }

    /* renamed from: l, reason: from getter */
    public final String getCardCvNumber() {
        return this.cardCvNumber;
    }

    /* renamed from: m, reason: from getter */
    public final String getCardExpirationMonth() {
        return this.cardExpirationMonth;
    }

    /* renamed from: n, reason: from getter */
    public final String getCardExpirationYear() {
        return this.cardExpirationYear;
    }

    /* renamed from: o, reason: from getter */
    public final String getCcAuthReplyAuthorizationCode() {
        return this.ccAuthReplyAuthorizationCode;
    }

    /* renamed from: p, reason: from getter */
    public final String getMeijerMaskedAccountNumber() {
        return this.meijerMaskedAccountNumber;
    }

    /* renamed from: q, reason: from getter */
    public final String getProviderType() {
        return this.providerType;
    }

    public /* synthetic */ PaymentDetailsCreateRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str13, str14, str15, str16, str17);
    }
}
