package qj;

import com.meijer.mobile.cart.model.hybris.promos.HybrisPromoCoupon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCoupon;", "Lqj/d;", "a", "(Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCoupon;)Lqj/d;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: qj.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16676c {
    public static final PromoCouponResult a(HybrisPromoCoupon hybrisPromoCoupon) {
        Intrinsics.j(hybrisPromoCoupon, "<this>");
        return new PromoCouponResult(hybrisPromoCoupon.getClipCode(), hybrisPromoCoupon.getClipResult(), hybrisPromoCoupon.getDescription(), hybrisPromoCoupon.getTitle(), false, 16, null);
    }
}
