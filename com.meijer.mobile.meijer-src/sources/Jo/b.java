package Jo;

import Do.ClassificationFeatureValue;
import com.meijer.mobile.product.model.hybris.api.models.classification.HybrisClassificationFeatureValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeatureValue;", "LDo/c;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeatureValue;)LDo/c;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {
    public static final ClassificationFeatureValue a(HybrisClassificationFeatureValue hybrisClassificationFeatureValue) {
        Intrinsics.j(hybrisClassificationFeatureValue, "<this>");
        return new ClassificationFeatureValue(hybrisClassificationFeatureValue.getValue());
    }
}
