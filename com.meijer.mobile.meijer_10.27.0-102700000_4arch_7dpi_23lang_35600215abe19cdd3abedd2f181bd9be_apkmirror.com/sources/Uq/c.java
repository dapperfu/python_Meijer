package Uq;

import Tq.OpeningHours;
import Tq.PointOfService;
import ci.StoreAddress;
import com.meijer.mobile.address.model.common.GeoPoint;
import com.meijer.mobile.address.model.hybris.HybrisGeoPoint;
import com.meijer.mobile.store.model.hybris.HybrisOpeningHours;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import com.meijer.mobile.store.model.hybris.HybrisStoreAddress;
import com.meijer.mobile.store.model.hybris.HybrisStoreLocatorFeature;
import com.meijer.mobile.store.model.hybris.HybrisStoreTenant;
import di.C13526c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "LTq/c;", "a", "(Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;)LTq/c;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c {
    public static final PointOfService a(HybrisPointOfService hybrisPointOfService) {
        Intrinsics.j(hybrisPointOfService, "<this>");
        int storeId = hybrisPointOfService.getStoreId();
        String displayName = hybrisPointOfService.getDisplayName();
        HybrisStoreAddress address = hybrisPointOfService.getAddress();
        StoreAddress storeAddressA = address != null ? e.a(address) : null;
        boolean curbSideEligibility = hybrisPointOfService.getCurbSideEligibility();
        double curbSideFee = hybrisPointOfService.getCurbSideFee();
        String curbsidePartner = hybrisPointOfService.getCurbsidePartner();
        Integer mfcStoreId = hybrisPointOfService.getMfcStoreId();
        boolean isEligibleForDelivery = hybrisPointOfService.getIsEligibleForDelivery();
        double deliveryFee = hybrisPointOfService.getDeliveryFee();
        String deliveryPartner = hybrisPointOfService.getDeliveryPartner();
        HybrisGeoPoint geoPoint = hybrisPointOfService.getGeoPoint();
        GeoPoint geoPointA = geoPoint != null ? C13526c.a(geoPoint) : null;
        boolean isMobilePaymentEnabledEventsStrategy = hybrisPointOfService.getIsMobilePaymentEnabledEventsStrategy();
        boolean isMobileShoppingEnabled = hybrisPointOfService.getIsMobileShoppingEnabled();
        HybrisOpeningHours openingHours = hybrisPointOfService.getOpeningHours();
        OpeningHours openingHoursA = openingHours != null ? a.a(openingHours) : null;
        String phone = hybrisPointOfService.getPhone();
        String pickupHelpNumber = hybrisPointOfService.getPickupHelpNumber();
        String storeDirector = hybrisPointOfService.getStoreDirector();
        List<HybrisStoreLocatorFeature> listP = hybrisPointOfService.p();
        StoreAddress storeAddress = storeAddressA;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listP, 10));
        Iterator<T> it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(h.a((HybrisStoreLocatorFeature) it.next()));
        }
        List<HybrisStoreTenant> listQ = hybrisPointOfService.q();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listQ, 10));
        Iterator<T> it2 = listQ.iterator();
        while (it2.hasNext()) {
            arrayList2.add(i.a((HybrisStoreTenant) it2.next()));
        }
        return new PointOfService(storeId, displayName, storeAddress, curbSideEligibility, curbSideFee, curbsidePartner, mfcStoreId, isEligibleForDelivery, deliveryFee, deliveryPartner, geoPointA, isMobilePaymentEnabledEventsStrategy, isMobileShoppingEnabled, openingHoursA, phone, pickupHelpNumber, storeDirector, arrayList, arrayList2, hybrisPointOfService.getIsAlcoholDeliveryEnabled(), hybrisPointOfService.getIsAlcoholPickupEnabled(), hybrisPointOfService.getEbtEnabled());
    }
}
