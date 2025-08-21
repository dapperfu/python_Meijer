package fj;

import androidx.recyclerview.widget.RecyclerView;
import di.Country;
import di.CustomerAddress;
import di.Region;
import hk.BillingAddress;
import hk.CardHolderName;
import hk.PaymentOption;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfj/u;", "Lhk/f;", "a", "(Lfj/u;)Lhk/f;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class v {
    public static final PaymentOption a(PaymentDetailItem paymentDetailItem) {
        String isoCode;
        Country country;
        Region region;
        Intrinsics.j(paymentDetailItem, "<this>");
        String accountHolderName = paymentDetailItem.getAccountHolderName();
        if (accountHolderName == null) {
            accountHolderName = "";
        }
        CardHolderName cardHolderName = new CardHolderName(accountHolderName);
        CustomerAddress billingAddress = paymentDetailItem.getBillingAddress();
        String firstName = billingAddress != null ? billingAddress.getFirstName() : null;
        String str = firstName == null ? "" : firstName;
        CustomerAddress billingAddress2 = paymentDetailItem.getBillingAddress();
        String lastName = billingAddress2 != null ? billingAddress2.getLastName() : null;
        CardHolderName cardHolderName2 = new CardHolderName(str, lastName == null ? "" : lastName, null, 4, null);
        CustomerAddress billingAddress3 = paymentDetailItem.getBillingAddress();
        String email = billingAddress3 != null ? billingAddress3.getEmail() : null;
        CustomerAddress billingAddress4 = paymentDetailItem.getBillingAddress();
        String line1 = billingAddress4 != null ? billingAddress4.getLine1() : null;
        CustomerAddress billingAddress5 = paymentDetailItem.getBillingAddress();
        String line2 = billingAddress5 != null ? billingAddress5.getLine2() : null;
        CustomerAddress billingAddress6 = paymentDetailItem.getBillingAddress();
        String town = billingAddress6 != null ? billingAddress6.getTown() : null;
        CustomerAddress billingAddress7 = paymentDetailItem.getBillingAddress();
        String isoCodeShort = (billingAddress7 == null || (region = billingAddress7.getRegion()) == null) ? null : region.getIsoCodeShort();
        CustomerAddress billingAddress8 = paymentDetailItem.getBillingAddress();
        String postalCode = billingAddress8 != null ? billingAddress8.getPostalCode() : null;
        CustomerAddress billingAddress9 = paymentDetailItem.getBillingAddress();
        if (billingAddress9 == null || (country = billingAddress9.getCountry()) == null || (isoCode = country.getIsoCode()) == null) {
            isoCode = "US";
        }
        BillingAddress billingAddress10 = new BillingAddress(cardHolderName2, email, line1, line2, town, isoCodeShort, postalCode, isoCode);
        String cardNumber = paymentDetailItem.getCardNumber();
        EnumEntries<hk.h> enumEntriesM = hk.h.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(enumEntriesM, 10)), 16));
        for (hk.h hVar : enumEntriesM) {
            linkedHashMap.put(hVar.getCodeName(), hVar);
        }
        CardType cardType = paymentDetailItem.getCardType();
        return new PaymentOption(cardHolderName, billingAddress10, cardNumber, (hk.h) linkedHashMap.get(cardType != null ? cardType.getCode() : null), null, paymentDetailItem.getIsDefaultPayment(), paymentDetailItem.getExpiryDate(), paymentDetailItem.getStartDate(), paymentDetailItem.getId(), paymentDetailItem.getIssueNumber(), paymentDetailItem.getIsSaved(), null, paymentDetailItem.getSubscriptionId(), RecyclerView.m.FLAG_MOVED, null);
    }
}
