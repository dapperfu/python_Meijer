package Th;

import Eh.AccountAddress;
import Hh.a;
import Ik.Validation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LEh/a;", "LTh/a;", "b", "(LEh/a;)LTh/a;", "a", "(LTh/a;)LEh/a;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class b {
    public static final AccountAddress a(AddressDecorator addressDecorator) {
        Intrinsics.j(addressDecorator, "<this>");
        long id2 = addressDecorator.getId();
        String strE = addressDecorator.getFirstName().c().e();
        String strE2 = addressDecorator.getLastName().c().e();
        String strE3 = addressDecorator.getStreetAddress().c().e();
        String information = addressDecorator.getApartment().getInformation();
        if (information.length() == 0) {
            information = null;
        }
        return new AccountAddress(id2, 0L, null, strE3, information, addressDecorator.getCity().c().e(), addressDecorator.getState().c().e(), addressDecorator.getZipCode().c().e(), null, null, 0L, strE, strE2, null, null, addressDecorator.getIsPrimaryAddress(), null, null, null, null, 1009414, null);
    }

    public static final AddressDecorator b(AccountAddress accountAddress) {
        String str;
        Intrinsics.j(accountAddress, "<this>");
        long id2 = accountAddress.getId();
        String firstName = accountAddress.getFirstName();
        if (firstName == null) {
            firstName = "";
        }
        a.FirstName firstName2 = new a.FirstName(new Validation(firstName, null, 2, null));
        String lastName = accountAddress.getLastName();
        if (lastName == null) {
            lastName = "";
        }
        a.LastName lastName2 = new a.LastName(new Validation(lastName, null, 2, null));
        str = "";
        String addressLine1 = accountAddress.getAddressLine1();
        if (addressLine1 == null) {
            addressLine1 = str;
        }
        a.StreetAddress streetAddress = new a.StreetAddress(new Validation(addressLine1, null, 2, null));
        String addressLine2 = accountAddress.getAddressLine2();
        if (addressLine2 == null) {
            addressLine2 = str;
        }
        a.Apartment apartment = new a.Apartment(null, addressLine2, 1, null);
        String city = accountAddress.getCity();
        if (city == null) {
            city = str;
        }
        a.City city2 = new a.City(new Validation(city, null, 2, null));
        String state = accountAddress.getState();
        if (state == null) {
            state = str;
        }
        a.State state2 = new a.State(new Validation(state, null, 2, null));
        String zipCode = accountAddress.getZipCode();
        if (zipCode == null) {
            zipCode = str;
        }
        a.ZipCode zipCode2 = new a.ZipCode(new Validation(zipCode, null, 2, null));
        boolean isPrimary = accountAddress.getIsPrimary();
        StringBuilder sb2 = new StringBuilder();
        String firstName3 = accountAddress.getFirstName();
        if (firstName3 == null) {
            firstName3 = str;
        }
        sb2.append(firstName3);
        sb2.append(' ');
        String lastName3 = accountAddress.getLastName();
        if (lastName3 == null) {
            lastName3 = str;
        }
        sb2.append(lastName3);
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        String city3 = accountAddress.getCity();
        if (city3 == null) {
            city3 = str;
        }
        sb3.append(city3);
        sb3.append(", ");
        String state3 = accountAddress.getState();
        if (state3 == null) {
            state3 = str;
        }
        sb3.append(state3);
        sb3.append(", ");
        String zipCode3 = accountAddress.getZipCode();
        sb3.append(zipCode3 != null ? zipCode3 : "");
        return new AddressDecorator(id2, firstName2, lastName2, streetAddress, apartment, city2, state2, zipCode2, isPrimary, string, sb3.toString(), false, null, 6144, null);
    }
}
