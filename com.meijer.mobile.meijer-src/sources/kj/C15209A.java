package kj;

import com.meijer.mobile.cart.model.hybris.PaymentDetailsEbtCardRequest;
import hk.EbtPaymentOption;
import j$.time.Month;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk/d;", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetailsEbtCardRequest;", "a", "(Lhk/d;)Lcom/meijer/mobile/cart/model/hybris/PaymentDetailsEbtCardRequest;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kj.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15209A {
    public static final PaymentDetailsEbtCardRequest a(EbtPaymentOption ebtPaymentOption) {
        Month month;
        Intrinsics.j(ebtPaymentOption, "<this>");
        YearMonth expiryDate = ebtPaymentOption.getExpiryDate();
        String string = (expiryDate == null || (month = expiryDate.getMonth()) == null) ? null : Integer.valueOf(month.getValue()).toString();
        if (string == null) {
            string = "";
        }
        YearMonth expiryDate2 = ebtPaymentOption.getExpiryDate();
        String string2 = expiryDate2 != null ? Integer.valueOf(expiryDate2.getYear()).toString() : null;
        return new PaymentDetailsEbtCardRequest(string, string2 != null ? string2 : "", ebtPaymentOption.getAuthorizationToken(), ebtPaymentOption.getAuthorizationCode(), ebtPaymentOption.getEbtBalanceTranId(), ebtPaymentOption.getCardHolder().getFirstName(), ebtPaymentOption.getCardHolder().getLastName(), ebtPaymentOption.getEbtBalance(), ebtPaymentOption.getMeijerMaskedAccountNumber());
    }
}
