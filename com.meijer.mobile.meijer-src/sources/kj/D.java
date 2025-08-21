package kj;

import com.meijer.mobile.address.model.hybris.HybrisCountry;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.address.model.hybris.HybrisRegion;
import com.meijer.mobile.cart.model.hybris.HybrisCardType;
import com.meijer.mobile.cart.model.hybris.HybrisTransactionDetails;
import com.meijer.mobile.cart.model.hybris.PaymentCreditDetailInfoResponse;
import com.meijer.mobile.cart.model.hybris.PaymentDetails;
import di.CustomerAddress;
import ei.C13801b;
import fj.CardType;
import fj.PaymentDetailItem;
import fj.Tender;
import hk.BillingAddress;
import hk.CardHolderName;
import hk.PaymentOption;
import j$.time.Month;
import j$.time.Year;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import wk.C17898a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "", "Lfj/F;", "d", "(Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;)Ljava/util/List;", "Lhk/f;", "c", "(Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;)Lhk/f;", "", "month", "year", "j$/time/YearMonth", "a", "(Ljava/lang/String;Ljava/lang/String;)Lj$/time/YearMonth;", "Lfj/u;", "b", "(Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;)Lfj/u;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class D {
    private static final YearMonth a(String str, String str2) {
        Year year = str2 != null ? (Year) wk.d.b(str2, C17898a.f167225a.i(), new C()) : null;
        Month month = str != null ? (Month) wk.d.b(str, C17898a.f167225a.g(), new C15210B()) : null;
        if (month == null || year == null) {
            return null;
        }
        return year.atMonth(month);
    }

    public static final PaymentDetailItem b(PaymentDetails paymentDetails) {
        Intrinsics.j(paymentDetails, "<this>");
        String accountHolderName = paymentDetails.getAccountHolderName();
        HybrisCustomerAddress billingAddress = paymentDetails.getBillingAddress();
        CustomerAddress customerAddressA = billingAddress != null ? C13801b.a(billingAddress) : null;
        String cardNumber = paymentDetails.getCardNumber();
        HybrisCardType cardType = paymentDetails.getCardType();
        CardType cardTypeA = cardType != null ? o.a(cardType) : null;
        boolean defaultPayment = paymentDetails.getDefaultPayment();
        String expiryMonth = paymentDetails.getExpiryMonth();
        Month month = expiryMonth != null ? (Month) wk.d.b(expiryMonth, C17898a.f167225a.w(), new C15210B()) : null;
        String expiryYear = paymentDetails.getExpiryYear();
        Year year = expiryYear != null ? (Year) wk.d.b(expiryYear, C17898a.f167225a.F(), new C()) : null;
        String id2 = paymentDetails.getId();
        String issueNumber = paymentDetails.getIssueNumber();
        boolean saved = paymentDetails.getSaved();
        String startMonth = paymentDetails.getStartMonth();
        Month month2 = startMonth != null ? (Month) wk.d.b(startMonth, C17898a.f167225a.w(), new C15210B()) : null;
        String startYear = paymentDetails.getStartYear();
        Year year2 = startYear != null ? (Year) wk.d.b(startYear, C17898a.f167225a.F(), new C()) : null;
        String subscriptionId = paymentDetails.getSubscriptionId();
        String paymentStatus = paymentDetails.getPaymentStatus();
        return new PaymentDetailItem(accountHolderName, customerAddressA, cardNumber, cardTypeA, defaultPayment, month, year, null, id2, issueNumber, saved, month2, year2, null, subscriptionId, paymentStatus != null ? fj.x.valueOf(paymentStatus) : null, false, 73856, null);
    }

    public static final PaymentOption c(PaymentDetails paymentDetails) {
        HybrisCountry country;
        HybrisRegion region;
        Intrinsics.j(paymentDetails, "<this>");
        String accountHolderName = paymentDetails.getAccountHolderName();
        if (accountHolderName == null) {
            accountHolderName = "";
        }
        CardHolderName cardHolderName = new CardHolderName(accountHolderName);
        StringBuilder sb2 = new StringBuilder();
        HybrisCustomerAddress billingAddress = paymentDetails.getBillingAddress();
        sb2.append(billingAddress != null ? billingAddress.getFirstName() : null);
        sb2.append(' ');
        HybrisCustomerAddress billingAddress2 = paymentDetails.getBillingAddress();
        sb2.append(billingAddress2 != null ? billingAddress2.getLastName() : null);
        CardHolderName cardHolderName2 = new CardHolderName(sb2.toString());
        HybrisCustomerAddress billingAddress3 = paymentDetails.getBillingAddress();
        String line1 = billingAddress3 != null ? billingAddress3.getLine1() : null;
        HybrisCustomerAddress billingAddress4 = paymentDetails.getBillingAddress();
        String line2 = billingAddress4 != null ? billingAddress4.getLine2() : null;
        HybrisCustomerAddress billingAddress5 = paymentDetails.getBillingAddress();
        String town = billingAddress5 != null ? billingAddress5.getTown() : null;
        HybrisCustomerAddress billingAddress6 = paymentDetails.getBillingAddress();
        String name = (billingAddress6 == null || (region = billingAddress6.getRegion()) == null) ? null : region.getName();
        HybrisCustomerAddress billingAddress7 = paymentDetails.getBillingAddress();
        String postalCode = billingAddress7 != null ? billingAddress7.getPostalCode() : null;
        HybrisCustomerAddress billingAddress8 = paymentDetails.getBillingAddress();
        String name2 = (billingAddress8 == null || (country = billingAddress8.getCountry()) == null) ? null : country.getName();
        BillingAddress billingAddress9 = new BillingAddress(cardHolderName2, null, line1, line2, town, name, postalCode, name2 == null ? "" : name2, 2, null);
        String cardNumber = paymentDetails.getCardNumber();
        EnumEntries<hk.h> enumEntriesM = hk.h.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(enumEntriesM, 10)), 16));
        for (hk.h hVar : enumEntriesM) {
            linkedHashMap.put(hVar.getCodeName(), hVar);
        }
        HybrisCardType cardType = paymentDetails.getCardType();
        return new PaymentOption(cardHolderName, billingAddress9, cardNumber, (hk.h) linkedHashMap.get(cardType != null ? cardType.getCode() : null), null, paymentDetails.getDefaultPayment(), a(paymentDetails.getExpiryMonth(), paymentDetails.getExpiryYear()), null, paymentDetails.getId(), paymentDetails.getIssueNumber(), false, null, null, 7312, null);
    }

    public static final List<Tender> d(PaymentDetails paymentDetails) {
        List<Tender> listE;
        List listM;
        List<PaymentCreditDetailInfoResponse> listA;
        Intrinsics.j(paymentDetails, "<this>");
        HybrisCardType cardType = paymentDetails.getCardType();
        if (cardType != null) {
            String strValueOf = String.valueOf(paymentDetails.getCardNumber());
            CardType cardTypeA = o.a(cardType);
            HybrisTransactionDetails transactionDetails = paymentDetails.getTransactionDetails();
            if (transactionDetails == null || (listA = transactionDetails.a()) == null) {
                listM = CollectionsKt.m();
            } else {
                List<PaymentCreditDetailInfoResponse> list = listA;
                listM = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listM.add(((PaymentCreditDetailInfoResponse) it.next()).f());
                }
            }
            listE = CollectionsKt.e(new Tender(strValueOf, cardTypeA, null, listM, 4, null));
        } else {
            listE = null;
        }
        return listE == null ? CollectionsKt.m() : listE;
    }
}
