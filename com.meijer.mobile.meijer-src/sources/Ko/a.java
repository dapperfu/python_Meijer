package Ko;

import Eo.Nutrient;
import com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutrient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutrient;", "LEo/a;", "a", "(Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutrient;)LEo/a;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {
    public static final Nutrient a(HybrisNutrient hybrisNutrient) {
        Intrinsics.j(hybrisNutrient, "<this>");
        return new Nutrient(hybrisNutrient.getName(), hybrisNutrient.getValue(), hybrisNutrient.getUnitOfMeasure(), hybrisNutrient.getDailyPercentageValue(), hybrisNutrient.getIndex());
    }
}
