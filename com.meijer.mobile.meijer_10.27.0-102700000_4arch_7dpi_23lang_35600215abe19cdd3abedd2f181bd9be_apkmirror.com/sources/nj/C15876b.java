package nj;

import com.meijer.mobile.cart.model.hybris.orders.HybrisOrderPrice;
import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult;
import gj.OrderPrice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPrice;", "Lgj/e;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPrice;)Lgj/e;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: nj.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15876b {
    public static final OrderPrice a(HybrisOrderPrice hybrisOrderPrice) {
        Intrinsics.j(hybrisOrderPrice, "<this>");
        mk.b bVarA = Lo.b.a(hybrisOrderPrice.getTotalPrice());
        mk.b bVarA2 = Lo.b.a(hybrisOrderPrice.getBillingTime());
        mk.b bVarA3 = Lo.b.a(hybrisOrderPrice.getTotalTax());
        mk.b bVarA4 = Lo.b.a(hybrisOrderPrice.getSubTotal());
        mk.b bVarA5 = Lo.b.a(hybrisOrderPrice.getDeliveryCost());
        mk.b bVarA6 = Lo.b.a(hybrisOrderPrice.getTotalDiscounts());
        List<HybrisPromotionResult> listB = hybrisOrderPrice.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(C15880f.a((HybrisPromotionResult) it.next()));
        }
        List<HybrisPromotionResult> listA = hybrisOrderPrice.a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C15880f.a((HybrisPromotionResult) it2.next()));
        }
        List<HybrisPromotionResult> listF = hybrisOrderPrice.f();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listF, 10));
        Iterator<T> it3 = listF.iterator();
        while (it3.hasNext()) {
            arrayList3.add(C15880f.a((HybrisPromotionResult) it3.next()));
        }
        List<HybrisPromotionResult> listE = hybrisOrderPrice.e();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.x(listE, 10));
        Iterator<T> it4 = listE.iterator();
        while (it4.hasNext()) {
            arrayList4.add(C15880f.a((HybrisPromotionResult) it4.next()));
        }
        return new OrderPrice(bVarA, bVarA2, bVarA3, bVarA4, bVarA5, bVarA6, arrayList, arrayList2, arrayList3, arrayList4);
    }
}
