package ci;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lci/g;", "", "a", "(Lci/g;)Ljava/lang/String;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ci.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6400h {
    public static final String a(StoreAddress storeAddress) {
        Intrinsics.j(storeAddress, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(storeAddress.getLine1());
        sb2.append(",\n");
        sb2.append(storeAddress.getTown());
        sb2.append(", ");
        Region region = storeAddress.getRegion();
        String isoCodeShort = region.getIsoCodeShort();
        if (isoCodeShort == null) {
            isoCodeShort = StringsKt.J0(region.getIsoCode(), "US-");
        }
        sb2.append(isoCodeShort);
        sb2.append(", ");
        sb2.append(storeAddress.getPostalCode());
        return sb2.toString();
    }
}
