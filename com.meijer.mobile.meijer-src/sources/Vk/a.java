package Vk;

import Bo.c;
import Xk.ProductComplexPromo;
import com.meijer.mobile.coupon.service.complexpromos.api.models.ProductComplexPromoJson;
import io.constructor.data.model.common.ResultData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/coupon/service/complexpromos/api/models/ProductComplexPromoJson;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "LXk/a;", "a", "(Lcom/meijer/mobile/coupon/service/complexpromos/api/models/ProductComplexPromoJson;I)LXk/a;", "complexpromos_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class a {
    public static final ProductComplexPromo a(ProductComplexPromoJson productComplexPromoJson, int i10) {
        Intrinsics.j(productComplexPromoJson, "<this>");
        long promoId = productComplexPromoJson.getPromoId();
        String promoText = productComplexPromoJson.getPromoText();
        int promoBuyMinQty = productComplexPromoJson.getPromoBuyMinQty();
        double promoValue = productComplexPromoJson.getPromoValue();
        double promoBuyMinSpend = productComplexPromoJson.getPromoBuyMinSpend();
        List<ResultData> listA = productComplexPromoJson.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c.d((ResultData) it.next(), i10, null, 2, null));
        }
        List<ResultData> listB = productComplexPromoJson.b();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it2 = listB.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c.d((ResultData) it2.next(), i10, null, 2, null));
        }
        return new ProductComplexPromo(promoId, promoText, promoBuyMinQty, promoValue, promoBuyMinSpend, arrayList, arrayList2);
    }
}
