package Xr;

import Xr.a;
import com.meijer.mobile.core.models.coupon.CouponAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LXr/a;", "", "a", "(LXr/a;)Z", "LXr/a$b;", "b", "(LXr/a;)LXr/a$b;", "LXr/a$a;", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "c", "(LXr/a$a;)Lcom/meijer/mobile/core/models/coupon/CouponAd;", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {
    public static final boolean a(a aVar) {
        Intrinsics.j(aVar, "<this>");
        return aVar instanceof a.Coupon;
    }

    public static final a.Coupon b(a aVar) {
        Intrinsics.j(aVar, "<this>");
        return (a.Coupon) aVar;
    }

    public static final CouponAd c(a.Ad ad2) {
        Intrinsics.j(ad2, "<this>");
        return new CouponAd(ad2.getTitle(), ad2.getImageURL(), ad2.getBundleTag(), ad2.getAnalyticTag(), ad2.getImageDescription());
    }
}
