package di;

import ci.CustomerAddress;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "Lci/c;", "a", "(Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;)Lci/c;", "b", "(Lci/c;)Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: di.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13525b {
    public static final CustomerAddress a(HybrisCustomerAddress hybrisCustomerAddress) {
        Intrinsics.j(hybrisCustomerAddress, "<this>");
        return new CustomerAddress(hybrisCustomerAddress.getId(), null, hybrisCustomerAddress.getTitle(), hybrisCustomerAddress.getTitleCode(), hybrisCustomerAddress.getFirstName(), hybrisCustomerAddress.getLastName(), hybrisCustomerAddress.getCompanyName(), hybrisCustomerAddress.getLine1(), hybrisCustomerAddress.getLine2(), hybrisCustomerAddress.getTown(), C13527d.a(hybrisCustomerAddress.getRegion()), hybrisCustomerAddress.getPostalCode(), C13524a.a(hybrisCustomerAddress.getCountry()), hybrisCustomerAddress.getPhone(), hybrisCustomerAddress.getEmail(), hybrisCustomerAddress.getIsShippingAddress(), hybrisCustomerAddress.getIsBillingAddress(), hybrisCustomerAddress.getIsDefault(), hybrisCustomerAddress.getIsVisibleInAddressBook(), 2, null);
    }

    public static final HybrisCustomerAddress b(CustomerAddress customerAddress) {
        Intrinsics.j(customerAddress, "<this>");
        return new HybrisCustomerAddress(customerAddress.getId(), customerAddress.getTitle(), customerAddress.getTitleCode(), customerAddress.getFirstName(), customerAddress.getLastName(), customerAddress.getCompanyName(), customerAddress.getLine1(), customerAddress.getLine2(), customerAddress.getTown(), C13527d.b(customerAddress.getRegion()), customerAddress.getPostalCode(), customerAddress.getPhone(), customerAddress.getEmail(), C13524a.b(customerAddress.getCountry()), customerAddress.getIsShippingAddress(), customerAddress.getIsBillingAddress(), customerAddress.getIsDefault(), customerAddress.getIsVisibleInAddressBook());
    }
}
