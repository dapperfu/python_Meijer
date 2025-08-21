package Th;

import Eh.AbstractC3240d;
import Eh.AccountAddress;
import Gh.h;
import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import responses.PostalAddress;
import tk.C17269a;
import vh.EnumC17676d;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\b*\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LTh/c;", "LEh/a;", "previousAccountAddress", "b", "(LTh/c;LEh/a;)LEh/a;", "Lresponses/PostalAddress;", "postalAddress", "accountAddress", "", "a", "(Lresponses/PostalAddress;LEh/a;)Ljava/util/List;", "LEh/d$a;", "c", "(LEh/d$a;)Ljava/util/List;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d {
    public static final List<AddressSuggestionDecorator> a(PostalAddress postalAddress, AccountAddress accountAddress) {
        String strQ;
        Intrinsics.j(postalAddress, "postalAddress");
        Intrinsics.j(accountAddress, "accountAddress");
        String streetAddress1 = postalAddress.getStreetAddress1();
        String addressLine2 = accountAddress.getAddressLine2();
        String postalCode = postalAddress.getPostalCode();
        String str = postalAddress.getCity() + ", " + postalAddress.getMainDivision() + ", " + ((postalCode == null || (strQ = StringsKt.Q(postalCode, " ", "", false, 4, null)) == null) ? null : C17269a.CANADIAN_POSTAL_CODE_RAW_REGEX.matcher(strQ).matches() ? StringsKt.N1(strQ, 6) : StringsKt.N1(strQ, 5));
        String addressLine1 = accountAddress.getAddressLine1();
        String addressLine22 = accountAddress.getAddressLine2();
        String str2 = accountAddress.getCity() + ", " + accountAddress.getState() + ", " + accountAddress.getZipCode();
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        AddressSuggestionDecorator addressSuggestionDecorator = new AddressSuggestionDecorator(companion.d(h.f12998v4, new Object[0]), MapsKt.n(TuplesKt.a(streetAddress1, Boolean.valueOf(!StringsKt.H(streetAddress1, addressLine1, true))), TuplesKt.a(addressLine2, Boolean.valueOf(!StringsKt.H(addressLine2, addressLine22, true))), TuplesKt.a(str, Boolean.valueOf(!StringsKt.H(str, str2, true)))), true, EnumC17676d.f165876f);
        AbstractC6392a abstractC6392aD = companion.d(h.f12897h1, new Object[0]);
        Boolean bool = Boolean.FALSE;
        return CollectionsKt.p(addressSuggestionDecorator, new AddressSuggestionDecorator(abstractC6392aD, MapsKt.n(TuplesKt.a(addressLine1, bool), TuplesKt.a(addressLine22, bool), TuplesKt.a(str2, bool)), false, null, 8, null));
    }

    public static final AccountAddress b(AddressSuggestionDecorator addressSuggestionDecorator, AccountAddress previousAccountAddress) {
        Intrinsics.j(addressSuggestionDecorator, "<this>");
        Intrinsics.j(previousAccountAddress, "previousAccountAddress");
        Object objL0 = CollectionsKt.l0(addressSuggestionDecorator.c().keySet(), 2);
        Intrinsics.g(objL0);
        List listB1 = StringsKt.b1((CharSequence) objL0, new String[]{", "}, false, 0, 6, null);
        return AccountAddress.b(previousAccountAddress, 0L, 0L, null, (String) CollectionsKt.l0(addressSuggestionDecorator.c().keySet(), 0), (String) CollectionsKt.l0(addressSuggestionDecorator.c().keySet(), 1), (String) listB1.get(0), (String) listB1.get(1), (String) listB1.get(2), null, addressSuggestionDecorator.getAddressValidationType(), 0L, null, null, null, null, false, null, null, null, null, 1047815, null);
    }

    public static final List<AddressSuggestionDecorator> c(AbstractC3240d.Select select) {
        Intrinsics.j(select, "<this>");
        String addressLine1 = select.getSuggested().getAddressLine1();
        String addressLine2 = select.getSuggested().getAddressLine2();
        String str = select.getSuggested().getCity() + ", " + select.getSuggested().getState() + ", " + select.getSuggested().getZipCode();
        String addressLine12 = select.getOriginal().getAddressLine1();
        String addressLine22 = select.getOriginal().getAddressLine2();
        String str2 = select.getOriginal().getCity() + ", " + select.getOriginal().getState() + ", " + select.getOriginal().getZipCode();
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        AddressSuggestionDecorator addressSuggestionDecorator = new AddressSuggestionDecorator(companion.d(h.f12998v4, new Object[0]), MapsKt.n(TuplesKt.a(addressLine1, Boolean.valueOf(!StringsKt.H(addressLine1, addressLine12, true))), TuplesKt.a(addressLine2, Boolean.valueOf(!StringsKt.H(addressLine2, addressLine22, true))), TuplesKt.a(str, Boolean.valueOf(true ^ StringsKt.H(str, str2, true)))), true, null, 8, null);
        AbstractC6392a abstractC6392aD = companion.d(h.f12897h1, new Object[0]);
        Boolean bool = Boolean.FALSE;
        return CollectionsKt.p(addressSuggestionDecorator, new AddressSuggestionDecorator(abstractC6392aD, MapsKt.n(TuplesKt.a(addressLine12, bool), TuplesKt.a(addressLine22, bool), TuplesKt.a(str2, bool)), false, null, 8, null));
    }
}
