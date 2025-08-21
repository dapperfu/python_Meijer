package com.meijer.mobile.accounts.payments.api.models.network;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.EnumC17677e;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J´\u0001\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b)\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b-\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b*\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b%\u0010\u0017R\u0011\u00102\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b/\u00101¨\u00063"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/AddCardAurusResponse;", "", "", "cardType", "", "meijerAccountNumberMasked", "cardExpirationMonth", "cardExpirationYear", "authToken", "cardAuthorizationCode", "billFirstName", "billLastName", "billStreet1", "billStreet2", "billCity", "billState", "billPostalCode", "billCountry", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/payments/api/models/network/AddCardAurusResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "o", "c", "k", "d", "l", "e", "f", "j", "g", "h", "i", "n", "Lvh/e;", "()Lvh/e;", "creditCardType", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AddCardAurusResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer cardType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String meijerAccountNumberMasked;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardExpirationMonth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardExpirationYear;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardAuthorizationCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billFirstName;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billLastName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billStreet1;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billStreet2;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billCity;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billPostalCode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String billCountry;

    public AddCardAurusResponse(@g(name = "card_cardType") Integer num, @g(name = "meijerMaskedAccountNumber") String meijerAccountNumberMasked, @g(name = "card_expirationMonth") String str, @g(name = "card_expirationYear") String str2, @g(name = "auth_token") String authToken, @g(name = "ccAuthReply_authorizationCode") String str3, @g(name = "billTo_firstName") String str4, @g(name = "billTo_lastName") String str5, @g(name = "billTo_street1") String str6, @g(name = "billTo_street2") String str7, @g(name = "billTo_city") String str8, @g(name = "billTo_state") String str9, @g(name = "billTo_postalCode") String str10, @g(name = "billTo_country") String str11) {
        Intrinsics.j(meijerAccountNumberMasked, "meijerAccountNumberMasked");
        Intrinsics.j(authToken, "authToken");
        this.cardType = num;
        this.meijerAccountNumberMasked = meijerAccountNumberMasked;
        this.cardExpirationMonth = str;
        this.cardExpirationYear = str2;
        this.authToken = authToken;
        this.cardAuthorizationCode = str3;
        this.billFirstName = str4;
        this.billLastName = str5;
        this.billStreet1 = str6;
        this.billStreet2 = str7;
        this.billCity = str8;
        this.billState = str9;
        this.billPostalCode = str10;
        this.billCountry = str11;
    }

    public final AddCardAurusResponse copy(@g(name = "card_cardType") Integer cardType, @g(name = "meijerMaskedAccountNumber") String meijerAccountNumberMasked, @g(name = "card_expirationMonth") String cardExpirationMonth, @g(name = "card_expirationYear") String cardExpirationYear, @g(name = "auth_token") String authToken, @g(name = "ccAuthReply_authorizationCode") String cardAuthorizationCode, @g(name = "billTo_firstName") String billFirstName, @g(name = "billTo_lastName") String billLastName, @g(name = "billTo_street1") String billStreet1, @g(name = "billTo_street2") String billStreet2, @g(name = "billTo_city") String billCity, @g(name = "billTo_state") String billState, @g(name = "billTo_postalCode") String billPostalCode, @g(name = "billTo_country") String billCountry) {
        Intrinsics.j(meijerAccountNumberMasked, "meijerAccountNumberMasked");
        Intrinsics.j(authToken, "authToken");
        return new AddCardAurusResponse(cardType, meijerAccountNumberMasked, cardExpirationMonth, cardExpirationYear, authToken, cardAuthorizationCode, billFirstName, billLastName, billStreet1, billStreet2, billCity, billState, billPostalCode, billCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddCardAurusResponse)) {
            return false;
        }
        AddCardAurusResponse addCardAurusResponse = (AddCardAurusResponse) other;
        return Intrinsics.e(this.cardType, addCardAurusResponse.cardType) && Intrinsics.e(this.meijerAccountNumberMasked, addCardAurusResponse.meijerAccountNumberMasked) && Intrinsics.e(this.cardExpirationMonth, addCardAurusResponse.cardExpirationMonth) && Intrinsics.e(this.cardExpirationYear, addCardAurusResponse.cardExpirationYear) && Intrinsics.e(this.authToken, addCardAurusResponse.authToken) && Intrinsics.e(this.cardAuthorizationCode, addCardAurusResponse.cardAuthorizationCode) && Intrinsics.e(this.billFirstName, addCardAurusResponse.billFirstName) && Intrinsics.e(this.billLastName, addCardAurusResponse.billLastName) && Intrinsics.e(this.billStreet1, addCardAurusResponse.billStreet1) && Intrinsics.e(this.billStreet2, addCardAurusResponse.billStreet2) && Intrinsics.e(this.billCity, addCardAurusResponse.billCity) && Intrinsics.e(this.billState, addCardAurusResponse.billState) && Intrinsics.e(this.billPostalCode, addCardAurusResponse.billPostalCode) && Intrinsics.e(this.billCountry, addCardAurusResponse.billCountry);
    }

    public int hashCode() {
        Integer num = this.cardType;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.meijerAccountNumberMasked.hashCode()) * 31;
        String str = this.cardExpirationMonth;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardExpirationYear;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.authToken.hashCode()) * 31;
        String str3 = this.cardAuthorizationCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billFirstName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.billLastName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.billStreet1;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.billStreet2;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.billCity;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.billState;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.billPostalCode;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.billCountry;
        return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "AddCardAurusResponse(cardType=" + this.cardType + ", meijerAccountNumberMasked=" + this.meijerAccountNumberMasked + ", cardExpirationMonth=" + this.cardExpirationMonth + ", cardExpirationYear=" + this.cardExpirationYear + ", authToken=" + this.authToken + ", cardAuthorizationCode=" + this.cardAuthorizationCode + ", billFirstName=" + this.billFirstName + ", billLastName=" + this.billLastName + ", billStreet1=" + this.billStreet1 + ", billStreet2=" + this.billStreet2 + ", billCity=" + this.billCity + ", billState=" + this.billState + ", billPostalCode=" + this.billPostalCode + ", billCountry=" + this.billCountry + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    /* renamed from: b, reason: from getter */
    public final String getBillCity() {
        return this.billCity;
    }

    /* renamed from: c, reason: from getter */
    public final String getBillCountry() {
        return this.billCountry;
    }

    /* renamed from: d, reason: from getter */
    public final String getBillFirstName() {
        return this.billFirstName;
    }

    /* renamed from: e, reason: from getter */
    public final String getBillLastName() {
        return this.billLastName;
    }

    /* renamed from: f, reason: from getter */
    public final String getBillPostalCode() {
        return this.billPostalCode;
    }

    /* renamed from: g, reason: from getter */
    public final String getBillState() {
        return this.billState;
    }

    /* renamed from: h, reason: from getter */
    public final String getBillStreet1() {
        return this.billStreet1;
    }

    /* renamed from: i, reason: from getter */
    public final String getBillStreet2() {
        return this.billStreet2;
    }

    /* renamed from: j, reason: from getter */
    public final String getCardAuthorizationCode() {
        return this.cardAuthorizationCode;
    }

    /* renamed from: k, reason: from getter */
    public final String getCardExpirationMonth() {
        return this.cardExpirationMonth;
    }

    /* renamed from: l, reason: from getter */
    public final String getCardExpirationYear() {
        return this.cardExpirationYear;
    }

    /* renamed from: m, reason: from getter */
    public final Integer getCardType() {
        return this.cardType;
    }

    public final EnumC17677e n() {
        Integer num = this.cardType;
        return (num != null && num.intValue() == 1) ? EnumC17677e.f165881c : (num != null && num.intValue() == 2) ? EnumC17677e.f165882d : (num != null && num.intValue() == 3) ? EnumC17677e.f165883e : (num != null && num.intValue() == 4) ? EnumC17677e.f165884f : (num != null && num.intValue() == 5) ? EnumC17677e.f165885g : (num != null && num.intValue() == 6) ? EnumC17677e.f165886h : (num != null && num.intValue() == 7) ? EnumC17677e.f165887i : EnumC17677e.f165888j;
    }

    /* renamed from: o, reason: from getter */
    public final String getMeijerAccountNumberMasked() {
        return this.meijerAccountNumberMasked;
    }

    public /* synthetic */ AddCardAurusResponse(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, str4, (i10 & 32) != 0 ? "" : str5, (i10 & 64) != 0 ? null : str6, str7, (i10 & 256) != 0 ? null : str8, (i10 & 512) != 0 ? null : str9, (i10 & 1024) != 0 ? null : str10, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str11, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str12, (i10 & 8192) != 0 ? null : str13);
    }
}
