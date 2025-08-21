package Mp;

import Co.ProductFullDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nk.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LCo/h;", "", "productQuantity", "LMp/h;", "a", "(LCo/h;D)LMp/h;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {
    public static final ProductScanItem a(ProductFullDetails productFullDetails, double d10) {
        Intrinsics.j(productFullDetails, "<this>");
        return new ProductScanItem(k.c(productFullDetails, d10), Co.f.a(productFullDetails.j()), productFullDetails.getName());
    }
}
