package jj;

import com.meijer.mobile.cart.model.hybris.HybrisAllDiscountDetails;
import com.meijer.mobile.cart.model.hybris.PromoDiscountJson;
import ej.AllDiscountDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisAllDiscountDetails;", "Lej/a;", "a", "(Lcom/meijer/mobile/cart/model/hybris/HybrisAllDiscountDetails;)Lej/a;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class m {
    public static final AllDiscountDetails a(HybrisAllDiscountDetails hybrisAllDiscountDetails) {
        Intrinsics.j(hybrisAllDiscountDetails, "<this>");
        List<PromoDiscountJson> listA = hybrisAllDiscountDetails.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(E.a((PromoDiscountJson) it.next()));
        }
        return new AllDiscountDetails(arrayList, Lo.c.a(hybrisAllDiscountDetails.getTotalSavings()));
    }
}
