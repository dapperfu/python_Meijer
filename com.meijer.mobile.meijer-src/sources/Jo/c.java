package Jo;

import Do.Classification;
import com.meijer.mobile.product.model.hybris.api.models.classification.HybrisClassification;
import com.meijer.mobile.product.model.hybris.api.models.classification.HybrisClassificationFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassification;", "LDo/a;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassification;)LDo/a;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class c {
    public static final Classification a(HybrisClassification hybrisClassification) {
        Intrinsics.j(hybrisClassification, "<this>");
        String code = hybrisClassification.getCode();
        List<HybrisClassificationFeature> listB = hybrisClassification.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a((HybrisClassificationFeature) it.next()));
        }
        return new Classification(code, arrayList);
    }
}
