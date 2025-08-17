package com.radiusnetworks.flybuy.sdk.data.room.domain;

import com.radiusnetworks.flybuy.api.model.GetOrdersResponse;
import com.radiusnetworks.flybuy.api.model.OrderResponse;
import com.radiusnetworks.flybuy.api.model.OrdersIncluded;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfig;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfigKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\n\u001a\u00020\u0006*\u00020\u0007\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b*\b\u0012\u0004\u0012\u00020\u00070\u000b\u001a\"\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b0\r*\u00020\u000fH\u0001\u001a(\u0010\u0010\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b0\r*\u00020\u0011H\u0001\u001a\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000\u001a\u0016\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"customerInfo", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "Lcom/radiusnetworks/flybuy/api/model/Order;", "getCustomerInfo", "(Lcom/radiusnetworks/flybuy/api/model/Order;)Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "locationTrackingDeferred", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "getLocationTrackingDeferred", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;)Z", "open", "", "toOrderAndBeaconRegions", "Lkotlin/Pair;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "Lcom/radiusnetworks/flybuy/api/model/OrderResponse;", "toOrdersAndBeaconRegions", "Lcom/radiusnetworks/flybuy/api/model/GetOrdersResponse;", "toSite", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "pickupConfig", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "updateOrderWithCustomerInfo", "customer", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OrderKt {
    public static final boolean open(Order order) {
        Intrinsics.j(order, "<this>");
        return order.getLocationTrackingEnabled();
    }

    public static final CustomerInfo getCustomerInfo(com.radiusnetworks.flybuy.api.model.Order order) {
        Intrinsics.j(order, "<this>");
        String customerName = order.getCustomerName();
        String str = customerName == null ? "" : customerName;
        String customerCarColor = order.getCustomerCarColor();
        String str2 = customerCarColor == null ? "" : customerCarColor;
        String customerCarType = order.getCustomerCarType();
        String str3 = customerCarType == null ? "" : customerCarType;
        String customerLicensePlate = order.getCustomerLicensePlate();
        return new CustomerInfo(str, null, str3, str2, customerLicensePlate == null ? "" : customerLicensePlate, 2, null);
    }

    public static final boolean getLocationTrackingDeferred(Order order) {
        Intrinsics.j(order, "<this>");
        if (!FlyBuyCore.getConfigOptions().getDeferredLocationTrackingEnabled()) {
            return false;
        }
        FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
        return flyBuyCore.getSdkConfig().getPickupStates().getOrderDeferred().contains(order.getState()) || flyBuyCore.getSdkConfig().getPickupStates().getCustomerDeferred().contains(order.getCustomerState());
    }

    public static final List<Order> open(List<Order> list) {
        Intrinsics.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (open((Order) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @ExperimentalUnsignedTypes
    public static final Pair<Order, List<BeaconRegion>> toOrderAndBeaconRegions(OrderResponse orderResponse) {
        Order order;
        List<com.radiusnetworks.flybuy.api.model.BeaconRegion> siteBeaconRegions;
        PickupConfig pickupConfig;
        List<com.radiusnetworks.flybuy.api.model.PickupConfig> pickupConfigs;
        Intrinsics.j(orderResponse, "<this>");
        OrdersIncluded included = orderResponse.getIncluded();
        ArrayList arrayList = null;
        Map<Integer, PickupConfig> pickupConfigs2 = (included == null || (pickupConfigs = included.getPickupConfigs()) == null) ? null : PickupConfigKt.toPickupConfigs(pickupConfigs);
        com.radiusnetworks.flybuy.api.model.Order data = orderResponse.getData();
        if (data != null) {
            if (pickupConfigs2 != null) {
                com.radiusnetworks.flybuy.api.model.Order data2 = orderResponse.getData();
                pickupConfig = pickupConfigs2.get(data2 != null ? data2.getPickupConfigId() : null);
            } else {
                pickupConfig = null;
            }
            order = new Order(data, pickupConfig);
        } else {
            order = null;
        }
        com.radiusnetworks.flybuy.api.model.Order data3 = orderResponse.getData();
        if (data3 != null && (siteBeaconRegions = data3.getSiteBeaconRegions()) != null) {
            arrayList = new ArrayList(CollectionsKt.x(siteBeaconRegions, 10));
            Iterator<T> it = siteBeaconRegions.iterator();
            while (it.hasNext()) {
                arrayList.add(new BeaconRegion((com.radiusnetworks.flybuy.api.model.BeaconRegion) it.next(), data3.getId()));
            }
        }
        return new Pair<>(order, arrayList);
    }

    @ExperimentalUnsignedTypes
    public static final Pair<List<Order>, List<BeaconRegion>> toOrdersAndBeaconRegions(GetOrdersResponse getOrdersResponse) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<com.radiusnetworks.flybuy.api.model.PickupConfig> pickupConfigs;
        Intrinsics.j(getOrdersResponse, "<this>");
        OrdersIncluded included = getOrdersResponse.getIncluded();
        List listZ = null;
        Map<Integer, PickupConfig> pickupConfigs2 = (included == null || (pickupConfigs = included.getPickupConfigs()) == null) ? null : PickupConfigKt.toPickupConfigs(pickupConfigs);
        List<com.radiusnetworks.flybuy.api.model.Order> data = getOrdersResponse.getData();
        if (data != null) {
            arrayList = new ArrayList(CollectionsKt.x(data, 10));
            for (com.radiusnetworks.flybuy.api.model.Order order : data) {
                arrayList.add(new Order(order, pickupConfigs2 != null ? pickupConfigs2.get(order.getPickupConfigId()) : null));
            }
        } else {
            arrayList = null;
        }
        List<com.radiusnetworks.flybuy.api.model.Order> data2 = getOrdersResponse.getData();
        if (data2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (com.radiusnetworks.flybuy.api.model.Order order2 : data2) {
                List<com.radiusnetworks.flybuy.api.model.BeaconRegion> siteBeaconRegions = order2.getSiteBeaconRegions();
                if (siteBeaconRegions != null) {
                    arrayList2 = new ArrayList(CollectionsKt.x(siteBeaconRegions, 10));
                    Iterator<T> it = siteBeaconRegions.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new BeaconRegion((com.radiusnetworks.flybuy.api.model.BeaconRegion) it.next(), order2.getId()));
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    arrayList3.add(arrayList2);
                }
            }
            listZ = CollectionsKt.z(arrayList3);
        }
        return new Pair<>(arrayList, listZ);
    }

    public static final Site toSite(com.radiusnetworks.flybuy.api.model.Order order, PickupConfig pickupConfig) {
        Intrinsics.j(order, "<this>");
        int siteId = order.getSiteId();
        String siteName = order.getSiteName();
        String sitePhone = order.getSitePhone();
        String siteStreetAddress = order.getSiteStreetAddress();
        String siteFullAddress = order.getSiteFullAddress();
        String siteLocality = order.getSiteLocality();
        String siteRegion = order.getSiteRegion();
        String siteCountry = order.getSiteCountry();
        String sitePostalCode = order.getSitePostalCode();
        String siteLatitude = order.getSiteLatitude();
        String siteLongitude = order.getSiteLongitude();
        String siteCoverPhotoURL = order.getSiteCoverPhotoURL();
        String projectLogoURL = order.getProjectLogoURL();
        String siteInstructions = order.getSiteInstructions();
        String siteDescription = order.getSiteDescription();
        String sitePartnerId = order.getSitePartnerId();
        Double siteWrongSiteArrivalRadius = order.getSiteWrongSiteArrivalRadius();
        double dDoubleValue = siteWrongSiteArrivalRadius != null ? siteWrongSiteArrivalRadius.doubleValue() : 250.0d;
        String siteOperationalStatus = order.getSiteOperationalStatus();
        if (siteOperationalStatus == null) {
            siteOperationalStatus = "live";
        }
        String str = siteOperationalStatus;
        Integer sitePrearrivalSeconds = order.getSitePrearrivalSeconds();
        return new Site(siteId, siteName, sitePhone, siteStreetAddress, siteFullAddress, siteLocality, siteRegion, siteCountry, sitePostalCode, siteLatitude, siteLongitude, siteCoverPhotoURL, projectLogoURL, siteInstructions, siteDescription, sitePartnerId, null, dDoubleValue, str, sitePrearrivalSeconds != null ? sitePrearrivalSeconds.intValue() : 0, pickupConfig == null ? PickupConfig.INSTANCE.getDEFAULT_PICKUP_CONFIG() : pickupConfig);
    }

    public static final Order updateOrderWithCustomerInfo(Order order, Customer customer) {
        Intrinsics.j(order, "<this>");
        if (customer != null) {
            if (StringsKt.r0(order.getCustomer().getName())) {
                order.getCustomer().setName(customer.getName());
            }
            if (StringsKt.r0(order.getCustomer().getCarType()) && StringsKt.r0(order.getCustomer().getCarColor())) {
                if (customer.getCarType() != null) {
                    order.getCustomer().setCarType(customer.getCarType());
                }
                if (customer.getCarColor() != null) {
                    order.getCustomer().setCarColor(customer.getCarColor());
                }
            }
            if (StringsKt.r0(order.getCustomer().getLicensePlate()) && customer.getLicensePlate() != null) {
                order.getCustomer().setLicensePlate(customer.getLicensePlate());
            }
        }
        return order;
    }
}
