package Uq;

import Tq.StoreFeatureServiceTypeData;
import com.meijer.mobile.store.model.hybris.HybrisStoreFeatureServiceTypeData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeatureServiceTypeData;", "LTq/g;", "a", "(Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeatureServiceTypeData;)LTq/g;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {
    public static final StoreFeatureServiceTypeData a(HybrisStoreFeatureServiceTypeData hybrisStoreFeatureServiceTypeData) {
        Intrinsics.j(hybrisStoreFeatureServiceTypeData, "<this>");
        return new StoreFeatureServiceTypeData(hybrisStoreFeatureServiceTypeData.getCode(), hybrisStoreFeatureServiceTypeData.getName());
    }
}
