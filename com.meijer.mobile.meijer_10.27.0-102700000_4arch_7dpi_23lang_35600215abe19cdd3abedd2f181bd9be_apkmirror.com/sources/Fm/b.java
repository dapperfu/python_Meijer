package Fm;

import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse;
import gk.CardHolderName;
import gk.EbtPaymentOption;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import th.i;
import vk.C17590a;
import vk.d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LFm/a;", "Lgk/c;", "cardHolder", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "ebtPanResponse", "Lgk/d;", "a", "(LFm/a;Lgk/c;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;)Lgk/d;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {
    public static final EbtPaymentOption a(EbtBalance ebtBalance, CardHolderName cardHolder, EbtPanResponse ebtPanResponse) {
        String mask;
        Intrinsics.j(cardHolder, "cardHolder");
        if (ebtBalance == null || ebtPanResponse == null || (mask = ebtPanResponse.getMask()) == null) {
            return null;
        }
        String cardExpiration = ebtPanResponse.getCardExpiration();
        YearMonth yearMonth = cardExpiration != null ? (YearMonth) d.a(cardExpiration, C17590a.NUMERIC_MONTH_YEAR_SHORT_NO_DELIMITER, new i()) : null;
        String token = ebtBalance.getToken();
        String str = token == null ? "" : token;
        String responseCode = ebtBalance.getResponseCode();
        String str2 = (responseCode == null && (responseCode = ebtBalance.getErrorCode()) == null) ? "" : responseCode;
        String tranId = ebtBalance.getTranId();
        return new EbtPaymentOption(yearMonth, str, str2, tranId == null ? "" : tranId, cardHolder, null, null, String.valueOf(ebtBalance.getRemainingBalanceSnap() / 100), mask, 96, null);
    }
}
