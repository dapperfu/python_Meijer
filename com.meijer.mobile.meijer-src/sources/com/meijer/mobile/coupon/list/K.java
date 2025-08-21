package com.meijer.mobile.coupon.list;

import Xr.a;
import com.meijer.mobile.core.models.coupon.CouponAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/core/models/coupon/CouponAd;", "LXr/a$a;", "a", "(Lcom/meijer/mobile/core/models/coupon/CouponAd;)LXr/a$a;", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K {
    public static final a.Ad a(CouponAd couponAd) {
        Intrinsics.j(couponAd, "<this>");
        String title = couponAd.getTitle();
        String imageURL = couponAd.getImageURL();
        Intrinsics.g(imageURL);
        return new a.Ad(imageURL, title, couponAd.getBundleTag(), couponAd.getAnalyticTag(), couponAd.getImageDescription());
    }
}
