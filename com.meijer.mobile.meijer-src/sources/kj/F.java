package kj;

import com.meijer.mobile.cart.model.hybris.HybrisCardType;
import com.meijer.mobile.cart.model.hybris.TendersItemResponse;
import com.meijer.mobile.cart.model.hybris.TransactionDetailsResponse;
import fj.CardType;
import fj.TendersItem;
import fj.TransactionDetails;
import j$.time.Month;
import j$.time.Year;
import j$.time.YearMonth;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/TendersItemResponse;", "Lfj/G;", "b", "(Lcom/meijer/mobile/cart/model/hybris/TendersItemResponse;)Lfj/G;", "", "month", "year", "j$/time/YearMonth", "a", "(Ljava/lang/String;Ljava/lang/String;)Lj$/time/YearMonth;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class F {
    private static final YearMonth a(String str, String str2) {
        Year year = str2 != null ? (Year) wk.d.b(str2, C17898a.f167225a.h(), new C()) : null;
        Month month = str != null ? (Month) wk.d.b(str, C17898a.f167225a.w(), new C15210B()) : null;
        if (month == null || year == null) {
            return null;
        }
        return year.atMonth(month);
    }

    public static final TendersItem b(TendersItemResponse tendersItemResponse) {
        Year year;
        Intrinsics.j(tendersItemResponse, "<this>");
        TransactionDetailsResponse transactionDetails = tendersItemResponse.getTransactionDetails();
        TransactionDetails transactionDetailsA = transactionDetails != null ? G.a(transactionDetails) : null;
        Double desiredChargeAmount = tendersItemResponse.getDesiredChargeAmount();
        Boolean saved = tendersItemResponse.getSaved();
        String transactionStatus = tendersItemResponse.getTransactionStatus();
        HybrisCardType cardType = tendersItemResponse.getCardType();
        CardType cardTypeA = cardType != null ? o.a(cardType) : null;
        String expiryMonth = tendersItemResponse.getExpiryMonth();
        Month month = expiryMonth != null ? (Month) wk.d.b(expiryMonth, C17898a.f167225a.w(), new C15210B()) : null;
        String expiryYear = tendersItemResponse.getExpiryYear();
        if (expiryYear == null || (year = (Year) wk.d.b(expiryYear, C17898a.f167225a.h(), new C())) == null) {
            String expiryYear2 = tendersItemResponse.getExpiryYear();
            if (expiryYear2 != null) {
                Year year2 = (Year) wk.d.b(expiryYear2, C17898a.f167225a.i(), new C());
                year = year2;
            } else {
                year = null;
            }
        } else {
            year = year2;
        }
        YearMonth yearMonthA = a(tendersItemResponse.getExpiryMonth(), tendersItemResponse.getExpiryYear());
        String authTime = tendersItemResponse.getAuthTime();
        return new TendersItem(transactionDetailsA, desiredChargeAmount, saved, transactionStatus, cardTypeA, month, authTime != null ? (ZonedDateTime) wk.d.b(authTime, C17898a.FULL_NUMERIC_MONTH_DATE_TIME, new k()) : null, year, yearMonthA, tendersItemResponse.getTenderType(), tendersItemResponse.getTransactionStatusDetails(), tendersItemResponse.getDefaultPayment(), tendersItemResponse.getId(), tendersItemResponse.getRequestToken(), tendersItemResponse.getSubscriptionId(), tendersItemResponse.getCardNumber(), tendersItemResponse.getPaymentStatus());
    }
}
