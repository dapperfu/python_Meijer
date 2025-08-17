package di;

import ci.Country;
import com.meijer.mobile.address.model.hybris.HybrisCountry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", "Lci/b;", "a", "(Lcom/meijer/mobile/address/model/hybris/HybrisCountry;)Lci/b;", "b", "(Lci/b;)Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: di.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13524a {
    public static final Country a(HybrisCountry hybrisCountry) {
        Intrinsics.j(hybrisCountry, "<this>");
        return new Country(hybrisCountry.getIsoCode(), hybrisCountry.getName());
    }

    public static final HybrisCountry b(Country country) {
        Intrinsics.j(country, "<this>");
        return new HybrisCountry(country.getIsoCode(), country.getName());
    }
}
