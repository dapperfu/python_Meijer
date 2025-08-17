package Gm;

import Fm.EbtBalance;
import ci.InterfaceC6393a;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.AcculynkDeliveryAddress;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtAcculynkResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lci/a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "b", "(Lci/a;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;", "LFm/a;", "a", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;)LFm/a;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {
    public static final EbtBalance a(EbtAcculynkResponse ebtAcculynkResponse) {
        Intrinsics.j(ebtAcculynkResponse, "<this>");
        String tranId = ebtAcculynkResponse.getTranId();
        String network = ebtAcculynkResponse.getNetwork();
        String cvn = ebtAcculynkResponse.getCvn();
        Integer remainingBalanceCash = ebtAcculynkResponse.getRemainingBalanceCash();
        int iIntValue = remainingBalanceCash != null ? remainingBalanceCash.intValue() : 0;
        String cashCurrencyCode = ebtAcculynkResponse.getCashCurrencyCode();
        Integer remainingBalanceSNAP = ebtAcculynkResponse.getRemainingBalanceSNAP();
        return new EbtBalance(null, tranId, network, cvn, iIntValue, cashCurrencyCode, remainingBalanceSNAP != null ? remainingBalanceSNAP.intValue() : 0, ebtAcculynkResponse.getSnapCurrencyCode(), ebtAcculynkResponse.getResponseCode(), ebtAcculynkResponse.getErrorCode(), ebtAcculynkResponse.getErrorMessage(), ebtAcculynkResponse.getToken(), 1, null);
    }

    public static final AcculynkDeliveryAddress b(InterfaceC6393a interfaceC6393a) {
        Intrinsics.j(interfaceC6393a, "<this>");
        String town = interfaceC6393a.getTown();
        String isoCode = interfaceC6393a.getRegion().getIsoCode();
        String postalCode = interfaceC6393a.getPostalCode();
        return new AcculynkDeliveryAddress(interfaceC6393a.getLine1(), interfaceC6393a.getCountry().getIsoCode(), town, isoCode, postalCode);
    }
}
