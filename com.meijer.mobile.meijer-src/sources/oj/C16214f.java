package oj;

import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotion;
import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionOrderEntryConsumed;
import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult;
import hj.PromotionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionResult;", "Lhj/j;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionResult;)Lhj/j;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: oj.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16214f {
    public static final PromotionResult a(HybrisPromotionResult hybrisPromotionResult) {
        ArrayList arrayList;
        Intrinsics.j(hybrisPromotionResult, "<this>");
        List<HybrisPromotionOrderEntryConsumed> listA = hybrisPromotionResult.a();
        if (listA != null) {
            List<HybrisPromotionOrderEntryConsumed> list = listA;
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C16212d.a((HybrisPromotionOrderEntryConsumed) it.next()));
            }
        } else {
            arrayList = null;
        }
        String description = hybrisPromotionResult.getDescription();
        HybrisPromotion promotion = hybrisPromotionResult.getPromotion();
        return new PromotionResult(arrayList, description, promotion != null ? C16211c.a(promotion) : null);
    }
}
