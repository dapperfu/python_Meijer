package oj;

import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionOrderEntryConsumed;
import hj.PromotionOrderEntryConsumed;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionOrderEntryConsumed;", "Lhj/h;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionOrderEntryConsumed;)Lhj/h;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: oj.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16212d {
    public static final PromotionOrderEntryConsumed a(HybrisPromotionOrderEntryConsumed hybrisPromotionOrderEntryConsumed) {
        Intrinsics.j(hybrisPromotionOrderEntryConsumed, "<this>");
        return new PromotionOrderEntryConsumed(hybrisPromotionOrderEntryConsumed.getAdjustedUnitPrice(), hybrisPromotionOrderEntryConsumed.getCode(), hybrisPromotionOrderEntryConsumed.getOrderEntryNumber(), hybrisPromotionOrderEntryConsumed.getQuantity());
    }
}
