package Ko;

import Eo.NutritionLabel;
import Eo.NutritionLabelHeader;
import com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutrient;
import com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutritionLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;", "LEo/g;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;)LEo/g;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c {
    public static final NutritionLabel a(HybrisNutritionLabel hybrisNutritionLabel) {
        Intrinsics.j(hybrisNutritionLabel, "<this>");
        NutritionLabelHeader nutritionLabelHeaderA = b.a(hybrisNutritionLabel.getHeader());
        List<HybrisNutrient> listD = hybrisNutritionLabel.d();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a((HybrisNutrient) it.next()));
        }
        List<HybrisNutrient> listE = hybrisNutritionLabel.e();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listE, 10));
        Iterator<T> it2 = listE.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a.a((HybrisNutrient) it2.next()));
        }
        List<HybrisNutrient> listC = hybrisNutritionLabel.c();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listC, 10));
        Iterator<T> it3 = listC.iterator();
        while (it3.hasNext()) {
            arrayList3.add(a.a((HybrisNutrient) it3.next()));
        }
        List<HybrisNutrient> listB = hybrisNutritionLabel.b();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList4.add(a.a((HybrisNutrient) it4.next()));
        }
        return new NutritionLabel(nutritionLabelHeaderA, arrayList, arrayList2, arrayList3, arrayList4);
    }
}
