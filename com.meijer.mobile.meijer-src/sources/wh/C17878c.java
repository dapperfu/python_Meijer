package wh;

import com.meijer.mobile.accounts.payments.api.models.network.AddCardAurusResponse;
import hk.BillingAddress;
import hk.CardHolderName;
import hk.PaymentOption;
import hk.h;
import j$.time.YearMonth;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00032\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/AddCardAurusResponse;", "", "providerType", "Lcom/meijer/mobile/core/model/common/EmailAddress;", "email", "newCreditCardId", "Lhk/h;", "cardType", "Lhk/f;", "a", "(Lcom/meijer/mobile/accounts/payments/api/models/network/AddCardAurusResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhk/h;)Lhk/f;", "payments_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wh.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17878c {
    public static final PaymentOption a(AddCardAurusResponse addCardAurusResponse, String providerType, String str, String newCreditCardId, h hVar) {
        Intrinsics.j(addCardAurusResponse, "<this>");
        Intrinsics.j(providerType, "providerType");
        Intrinsics.j(newCreditCardId, "newCreditCardId");
        String billFirstName = addCardAurusResponse.getBillFirstName();
        String str2 = billFirstName == null ? "" : billFirstName;
        String billLastName = addCardAurusResponse.getBillLastName();
        CardHolderName cardHolderName = new CardHolderName(str2, billLastName == null ? "" : billLastName, null, 4, null);
        String billFirstName2 = addCardAurusResponse.getBillFirstName();
        String str3 = billFirstName2 == null ? "" : billFirstName2;
        String billLastName2 = addCardAurusResponse.getBillLastName();
        CardHolderName cardHolderName2 = new CardHolderName(str3, billLastName2 == null ? "" : billLastName2, null, 4, null);
        String billStreet1 = addCardAurusResponse.getBillStreet1();
        String str4 = billStreet1 == null ? "" : billStreet1;
        String billStreet2 = addCardAurusResponse.getBillStreet2();
        String str5 = billStreet2 == null ? "" : billStreet2;
        String billCity = addCardAurusResponse.getBillCity();
        String str6 = billCity == null ? "" : billCity;
        String billState = addCardAurusResponse.getBillState();
        String str7 = billState == null ? "" : billState;
        String billPostalCode = addCardAurusResponse.getBillPostalCode();
        String str8 = billPostalCode == null ? "" : billPostalCode;
        String billCountry = addCardAurusResponse.getBillCountry();
        return new PaymentOption(cardHolderName, new BillingAddress(cardHolderName2, str, str4, str5, str6, str7, str8, billCountry == null ? "" : billCountry), StringsKt.O1(addCardAurusResponse.getMeijerAccountNumberMasked(), 4), hVar, "", false, YearMonth.parse(addCardAurusResponse.getCardExpirationMonth() + addCardAurusResponse.getCardExpirationYear(), DateTimeFormatter.ofPattern("MMyy")), null, newCreditCardId, null, false, providerType, addCardAurusResponse.getAuthToken());
    }

    public static /* synthetic */ PaymentOption b(AddCardAurusResponse addCardAurusResponse, String str, String str2, String str3, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Aurus";
        }
        return a(addCardAurusResponse, str, str2, str3, hVar);
    }
}
