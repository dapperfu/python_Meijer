package Ao;

import Ho.ProductSponsorship;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lhi/f;", "trackingData", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "", "isVariantInteracted", "variantType", "variantName", "", "b", "(Lhi/f;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "LHo/a;", "productSponsorship", "a", "(LHo/a;Lhi/f;)V", "analytics_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e0 {
    public static final void a(ProductSponsorship productSponsorship, TrackingData trackingData) {
        Ho.b sponsorSource;
        String sourceName;
        Intrinsics.j(trackingData, "trackingData");
        trackingData.q("isSponsoredProduct");
        if (productSponsorship == null || (sponsorSource = productSponsorship.getSponsorSource()) == null || (sourceName = sponsorSource.getSourceName()) == null || sourceName.length() <= 0) {
            return;
        }
        trackingData.s("isSponsoredProduct", "yes");
    }

    public static final void b(TrackingData trackingData, String str, boolean z10, String str2, String str3) {
        Intrinsics.j(trackingData, "trackingData");
        trackingData.h("&&products", ';' + str);
        trackingData.h("variantsAvailable", "true");
        trackingData.h("variantInteraction", z10 ? "true" : "false");
        trackingData.h("variantType", str2);
        trackingData.h("variantName", str3);
    }
}
