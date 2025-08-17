package di;

import ci.Region;
import com.meijer.mobile.address.model.hybris.HybrisRegion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "Lci/f;", "a", "(Lcom/meijer/mobile/address/model/hybris/HybrisRegion;)Lci/f;", "b", "(Lci/f;)Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: di.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13527d {
    public static final Region a(HybrisRegion hybrisRegion) {
        Intrinsics.j(hybrisRegion, "<this>");
        return new Region(hybrisRegion.getIsoCode(), hybrisRegion.getName(), hybrisRegion.getIsoCodeShort(), hybrisRegion.getCountryIso());
    }

    public static final HybrisRegion b(Region region) {
        Intrinsics.j(region, "<this>");
        return new HybrisRegion(region.getIsoCode(), region.getName(), region.getIsoCodeShort(), region.getCountryIso());
    }
}
