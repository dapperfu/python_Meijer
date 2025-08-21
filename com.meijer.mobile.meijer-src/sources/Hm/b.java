package Hm;

import Gm.EbtBalance;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.AcculynkDeliveryAddress;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtAcculynkResponse;
import di.InterfaceC13683a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldi/a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "b", "(Ldi/a;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;", "LGm/a;", "a", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;)LGm/a;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
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

    public static final AcculynkDeliveryAddress b(InterfaceC13683a interfaceC13683a) {
        Intrinsics.j(interfaceC13683a, "<this>");
        String town = interfaceC13683a.getTown();
        String isoCode = interfaceC13683a.getRegion().getIsoCode();
        String postalCode = interfaceC13683a.getPostalCode();
        return new AcculynkDeliveryAddress(interfaceC13683a.getLine1(), interfaceC13683a.getCountry().getIsoCode(), town, isoCode, postalCode);
    }
}
