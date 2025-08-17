package Uq;

import Tq.OpeningSchedule;
import Tq.StoreFeaturePickUpTypeData;
import Tq.StoreLocatorFeature;
import ci.StoreAddress;
import com.meijer.mobile.store.model.hybris.HybrisOpeningSchedule;
import com.meijer.mobile.store.model.hybris.HybrisStoreFeaturePickUpTypeData;
import com.meijer.mobile.store.model.hybris.HybrisStoreFeatureServiceTypeData;
import com.meijer.mobile.store.model.hybris.HybrisStoreLocatorFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisStoreLocatorFeature;", "LTq/i;", "a", "(Lcom/meijer/mobile/store/model/hybris/HybrisStoreLocatorFeature;)LTq/i;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {
    public static final StoreLocatorFeature a(HybrisStoreLocatorFeature hybrisStoreLocatorFeature) {
        Intrinsics.j(hybrisStoreLocatorFeature, "<this>");
        StoreAddress storeAddressA = e.a(hybrisStoreLocatorFeature.getAddress());
        HybrisOpeningSchedule openingSchedule = hybrisStoreLocatorFeature.getOpeningSchedule();
        OpeningSchedule openingScheduleA = openingSchedule != null ? b.a(openingSchedule) : null;
        String phone = hybrisStoreLocatorFeature.getPhone();
        String storeFeaturePickUpType = hybrisStoreLocatorFeature.getStoreFeaturePickUpType();
        HybrisStoreFeaturePickUpTypeData storeFeaturePickUpTypeData = hybrisStoreLocatorFeature.getStoreFeaturePickUpTypeData();
        StoreFeaturePickUpTypeData storeFeaturePickUpTypeDataA = storeFeaturePickUpTypeData != null ? f.a(storeFeaturePickUpTypeData) : null;
        String storeFeatureServiceType = hybrisStoreLocatorFeature.getStoreFeatureServiceType();
        HybrisStoreFeatureServiceTypeData storeFeatureServiceTypeData = hybrisStoreLocatorFeature.getStoreFeatureServiceTypeData();
        return new StoreLocatorFeature(storeAddressA, openingScheduleA, phone, storeFeaturePickUpType, storeFeaturePickUpTypeDataA, storeFeatureServiceType, storeFeatureServiceTypeData != null ? g.a(storeFeatureServiceTypeData) : null);
    }
}
