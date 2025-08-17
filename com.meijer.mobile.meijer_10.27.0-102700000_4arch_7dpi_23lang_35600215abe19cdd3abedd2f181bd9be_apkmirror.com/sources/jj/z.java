package jj;

import com.meijer.mobile.cart.model.hybris.PaymentDetailsCreateRequest;
import gk.BillingAddress;
import gk.CardHolderName;
import gk.PaymentOption;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgk/f;", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetailsCreateRequest;", "a", "(Lgk/f;)Lcom/meijer/mobile/cart/model/hybris/PaymentDetailsCreateRequest;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class z {
    public static final PaymentDetailsCreateRequest a(PaymentOption paymentOption) {
        CardHolderName name;
        CardHolderName name2;
        Intrinsics.j(paymentOption, "<this>");
        gk.h cardType = paymentOption.getCardType();
        String codeNum = cardType != null ? cardType.getCodeNum() : null;
        String str = codeNum == null ? "" : codeNum;
        String cardNumber = paymentOption.getCardNumber();
        String str2 = cardNumber == null ? "" : cardNumber;
        String cardCvNumber = paymentOption.getCardCvNumber();
        String str3 = cardCvNumber == null ? "" : cardCvNumber;
        YearMonth expiryDate = paymentOption.getExpiryDate();
        Intrinsics.g(expiryDate);
        C17590a c17590a = C17590a.f164803a;
        String str4 = expiryDate.format(c17590a.x());
        Intrinsics.i(str4, "format(...)");
        YearMonth expiryDate2 = paymentOption.getExpiryDate();
        Intrinsics.g(expiryDate2);
        String str5 = expiryDate2.format(c17590a.G());
        Intrinsics.i(str5, "format(...)");
        String authToken = paymentOption.getAuthToken();
        String str6 = authToken == null ? "" : authToken;
        BillingAddress billingAddress = paymentOption.getBillingAddress();
        String firstName = (billingAddress == null || (name2 = billingAddress.getName()) == null) ? null : name2.getFirstName();
        String str7 = firstName == null ? "" : firstName;
        BillingAddress billingAddress2 = paymentOption.getBillingAddress();
        String lastName = (billingAddress2 == null || (name = billingAddress2.getName()) == null) ? null : name.getLastName();
        String str8 = lastName == null ? "" : lastName;
        BillingAddress billingAddress3 = paymentOption.getBillingAddress();
        String email = billingAddress3 != null ? billingAddress3.getEmail() : null;
        String str9 = email == null ? "" : email;
        BillingAddress billingAddress4 = paymentOption.getBillingAddress();
        String street1 = billingAddress4 != null ? billingAddress4.getStreet1() : null;
        String str10 = street1 == null ? "" : street1;
        BillingAddress billingAddress5 = paymentOption.getBillingAddress();
        String street2 = billingAddress5 != null ? billingAddress5.getStreet2() : null;
        BillingAddress billingAddress6 = paymentOption.getBillingAddress();
        String city = billingAddress6 != null ? billingAddress6.getCity() : null;
        String str11 = city == null ? "" : city;
        BillingAddress billingAddress7 = paymentOption.getBillingAddress();
        String state = billingAddress7 != null ? billingAddress7.getState() : null;
        String str12 = state == null ? "" : state;
        BillingAddress billingAddress8 = paymentOption.getBillingAddress();
        String postalCode = billingAddress8 != null ? billingAddress8.getPostalCode() : null;
        String str13 = postalCode == null ? "" : postalCode;
        BillingAddress billingAddress9 = paymentOption.getBillingAddress();
        String country = billingAddress9 != null ? billingAddress9.getCountry() : null;
        String str14 = country == null ? "" : country;
        String providerType = paymentOption.getProviderType();
        return new PaymentDetailsCreateRequest(str, str2, str3, str4, str5, str6, providerType == null ? "" : providerType, "0", str7, str8, str9, str10, street2, str11, str12, str13, str14);
    }
}
