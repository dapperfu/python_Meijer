package Ko;

import Eo.NutritionLabelHeader;
import com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutrient;
import com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutritionLabelHeader;
import com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisServingSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;", "LEo/h;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;)LEo/h;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class b {
    public static final NutritionLabelHeader a(HybrisNutritionLabelHeader hybrisNutritionLabelHeader) {
        Intrinsics.j(hybrisNutritionLabelHeader, "<this>");
        String name = hybrisNutritionLabelHeader.getName();
        String servingsPerContainer = hybrisNutritionLabelHeader.getServingsPerContainer();
        List<HybrisServingSize> listC = hybrisNutritionLabelHeader.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(d.a((HybrisServingSize) it.next()));
        }
        List<HybrisNutrient> listB = hybrisNutritionLabelHeader.b();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it2 = listB.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a.a((HybrisNutrient) it2.next()));
        }
        return new NutritionLabelHeader(name, servingsPerContainer, arrayList, arrayList2);
    }
}
