package com.radiusnetworks.flybuy.sdk.pickup.helper;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.location.Location;
import android.util.SparseArray;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.a;
import com.radiusnetworks.flybuy.api.model.AndroidPickupLocationFilter;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfig;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfigKt;
import com.radiusnetworks.flybuy.sdk.data.beacons.BeaconIdentifiers;
import com.radiusnetworks.flybuy.sdk.data.beacons.BeaconList;
import com.radiusnetworks.flybuy.sdk.data.defaults.SdkDefaultsKt;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import com.radiusnetworks.flybuy.sdk.data.location.LocationWithBeaconUpdate;
import com.radiusnetworks.flybuy.sdk.data.location.LocationWithBeaconUpdateKt;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.data.room.domain.OrderKt;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import com.radiusnetworks.flybuy.sdk.data.wrongsitearrival.WrongSiteArrivalConfig;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.pickup.data.LocationFilter;
import com.radiusnetworks.flybuy.sdk.pickup.eta.ETACalculator;
import j$.time.Clock;
import j$.time.Instant;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Keep
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001TBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0004\u0012\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R0\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R(\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\n088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R(\u0010;\u001a\u0004\u0018\u00010\n2\b\u00104\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bG\u0010H\u0012\u0004\bI\u0010\u0011R\u0018\u0010J\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010BR\u001e\u0010L\u001a\n K*\u0004\u0018\u00010C0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010ER\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010:R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0014R\u0011\u0010R\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/pickup/helper/LocationEventGenerator;", "", "j$/time/Clock", "clock", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "fetchMisarrivalSitesRequestListener", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "Lcom/radiusnetworks/flybuy/sdk/pickup/data/LocationFilter;", "", "orderOrLocationFilterChangeListener", "<init>", "(Lj$/time/Clock;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "updateProximity", "()V", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "updateLocationIfStale", "()Ljava/util/List;", "Landroid/location/Location;", "location", "ordersToUpdate", "", "shouldSendLocationEvent", "(Landroid/location/Location;Ljava/util/List;)Z", "fetchMisarrivalSitesIfNeeded", "(Landroid/location/Location;Ljava/util/List;)V", "order", "getPossibleWrongSiteId", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;Landroid/location/Location;)Ljava/lang/Integer;", "orders", "updateOpenOrders", "(Ljava/util/List;)V", "Landroid/bluetooth/le/ScanResult;", "result", "updateBeaconScanResult", "(Landroid/bluetooth/le/ScanResult;)Ljava/util/List;", "updateLocation", "(Landroid/location/Location;)Ljava/util/List;", "Lj$/time/Clock;", "Lkotlin/jvm/functions/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "sdkConfig", "Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "getSdkConfig", "()Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "setSdkConfig", "(Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;)V", "osLocationFilter", "Lcom/radiusnetworks/flybuy/sdk/pickup/data/LocationFilter;", "<set-?>", "currentLocationFilter", "getCurrentLocationFilter", "()Lcom/radiusnetworks/flybuy/sdk/pickup/data/LocationFilter;", "", "activeOrders", "Ljava/util/List;", "closestOrder", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "getClosestOrder", "()Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "updatingLocation", "Z", "lastLocation", "Landroid/location/Location;", "j$/time/Instant", "lastLocationUpdate", "Lj$/time/Instant;", "Lcom/radiusnetworks/flybuy/sdk/data/beacons/BeaconList;", "beaconList", "Lcom/radiusnetworks/flybuy/sdk/data/beacons/BeaconList;", "getBeaconList$annotations", "lastLocationEvent", "kotlin.jvm.PlatformType", "lastLocationEventSent", "sitesForMisarrival", "getLocationFilters", "locationFilters", "getShouldStartBeaconing", "()Z", "shouldStartBeaconing", "Companion", "com/radiusnetworks/flybuy/sdk/pickup/helper/a", "pickup_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LocationEventGenerator {
    private static final int BEACONING_DISTANCE_METERS = 500;
    public static final a Companion = new a();
    private static final String ETA_SOURCE = "android_google_maps";
    private static final long STALE_LOCATION_SECONDS = 5;
    private final List<Order> activeOrders;
    private final BeaconList beaconList;
    private final Clock clock;
    private Order closestOrder;
    private LocationFilter currentLocationFilter;
    private final Function2<CircularRegion, Integer, List<Site>> fetchMisarrivalSitesRequestListener;
    private Location lastLocation;
    private Location lastLocationEvent;
    private Instant lastLocationEventSent;
    private Instant lastLocationUpdate;
    private final Function2<Order, LocationFilter, Unit> orderOrLocationFilterChangeListener;
    private LocationFilter osLocationFilter;
    private SdkConfig sdkConfig;
    private List<Site> sitesForMisarrival;
    private boolean updatingLocation;

    private final void fetchMisarrivalSitesIfNeeded(Location location, List<Order> ordersToUpdate) {
        ArrayList arrayList;
        Order order;
        if (ordersToUpdate != null) {
            arrayList = new ArrayList();
            for (Object obj : ordersToUpdate) {
                if (((Order) obj).getWrongSiteDetectionEnabled()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            this.sitesForMisarrival = null;
            return;
        }
        if (this.sitesForMisarrival == null) {
            this.sitesForMisarrival = new ArrayList();
            WrongSiteArrivalConfig wrongSiteArrivalConfig = this.sdkConfig.getWrongSiteArrivalConfig();
            double wrongSiteSearchRadius = (ordersToUpdate == null || (order = (Order) CollectionsKt.u0(ordersToUpdate)) == null) ? 40000.0d : order.getWrongSiteSearchRadius();
            Integer siteLimit = wrongSiteArrivalConfig.getSiteLimit();
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            int sitesFetchLatitudePrecision = wrongSiteArrivalConfig.getSitesFetchLatitudePrecision();
            RoundingMode roundingMode = RoundingMode.HALF_EVEN;
            this.sitesForMisarrival = this.fetchMisarrivalSitesRequestListener.invoke(new CircularRegion(bigDecimal.setScale(sitesFetchLatitudePrecision, roundingMode).doubleValue(), new BigDecimal(location.getLongitude()).setScale(wrongSiteArrivalConfig.getSitesFetchLongitudePrecision(), roundingMode).doubleValue(), (float) wrongSiteSearchRadius), siteLimit);
        }
    }

    @ExperimentalUnsignedTypes
    private static /* synthetic */ void getBeaconList$annotations() {
    }

    private final boolean shouldSendLocationEvent(Location location, List<Order> ordersToUpdate) {
        if (ordersToUpdate != null) {
            if (!ordersToUpdate.isEmpty()) {
                Iterator<T> it = ordersToUpdate.iterator();
                while (it.hasNext()) {
                    if (((Order) it.next()).getDistanceFilteringDisabled()) {
                    }
                }
            }
            LogExtensionsKt.logd(this, true, "Distance filtering is not disabled.");
            return true;
        }
        if (Instant.now(this.clock).isAfter(this.lastLocationEventSent.plusMillis(MathKt.f(this.currentLocationFilter.getIntervalSeconds() * 1000)))) {
            LogExtensionsKt.logd(this, true, "Last location update is more than " + this.currentLocationFilter.getIntervalSeconds() + " sec ago.");
            return true;
        }
        Location location2 = this.lastLocationEvent;
        boolean z10 = location2 == null || location.distanceTo(location2) > this.currentLocationFilter.getSmallestDisplacement();
        if (!z10) {
            LogExtensionsKt.logd(this, true, "Should not send location update.");
            return z10;
        }
        LogExtensionsKt.logd(this, true, "Last location update is more than " + this.currentLocationFilter.getSmallestDisplacement() + " m away.");
        return z10;
    }

    public final List<OrderEventInfo> updateBeaconScanResult(ScanResult result) {
        BeaconIdentifiers beaconIdentifiers;
        SparseArray<byte[]> manufacturerSpecificData;
        byte[] bArrValueAt;
        if (result != null) {
            Intrinsics.j(result, "<this>");
            ScanRecord scanRecord = result.getScanRecord();
            if (scanRecord == null || (manufacturerSpecificData = scanRecord.getManufacturerSpecificData()) == null || (bArrValueAt = manufacturerSpecificData.valueAt(0)) == null || bArrValueAt.length < 23) {
                beaconIdentifiers = null;
            } else {
                byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                System.arraycopy(bArrValueAt, 2, bArr, 0, 16);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                beaconIdentifiers = new BeaconIdentifiers(new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()), UInt.b(UInt.b(UByte.b(bArrValueAt[19]) & 255) + UInt.b(UInt.b(256) * UInt.b(UByte.b(bArrValueAt[18]) & 255))), UInt.b(UInt.b(UByte.b(bArrValueAt[21]) & 255) + UInt.b(UInt.b(256) * UInt.b(UByte.b(bArrValueAt[20]) & 255))), bArrValueAt[22]);
            }
            if (beaconIdentifiers != null) {
                this.beaconList.addScan(beaconIdentifiers, result.getRssi());
                return updateLocationIfStale();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocationEventGenerator(Clock clock, Function2<? super CircularRegion, ? super Integer, ? extends List<Site>> fetchMisarrivalSitesRequestListener, Function2<? super Order, ? super LocationFilter, Unit> orderOrLocationFilterChangeListener) {
        Intrinsics.j(clock, "clock");
        Intrinsics.j(fetchMisarrivalSitesRequestListener, "fetchMisarrivalSitesRequestListener");
        Intrinsics.j(orderOrLocationFilterChangeListener, "orderOrLocationFilterChangeListener");
        this.clock = clock;
        this.fetchMisarrivalSitesRequestListener = fetchMisarrivalSitesRequestListener;
        this.orderOrLocationFilterChangeListener = orderOrLocationFilterChangeListener;
        this.sdkConfig = SdkConfigKt.toSdkConfig(SdkDefaultsKt.getDEFAULT_APP_RESPONSE().getData());
        LocationFilter locationFilter = com.radiusnetworks.flybuy.sdk.pickup.data.a.f120965a;
        this.osLocationFilter = locationFilter;
        this.currentLocationFilter = locationFilter;
        this.activeOrders = new ArrayList();
        Instant MIN = Instant.MIN;
        Intrinsics.i(MIN, "MIN");
        this.lastLocationUpdate = MIN;
        this.beaconList = new BeaconList();
        this.lastLocationEventSent = MIN;
    }

    private final List<LocationFilter> getLocationFilters() {
        LocationFilter locationFilter;
        int i10;
        List<AndroidPickupLocationFilter> android2 = this.sdkConfig.getPickupLocationFilters().getAndroid();
        if (android2 == null) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        for (AndroidPickupLocationFilter androidPickupLocationFilter : android2) {
            LocationFilter locationFilter2 = com.radiusnetworks.flybuy.sdk.pickup.data.a.f120965a;
            Intrinsics.j(androidPickupLocationFilter, "<this>");
            if (androidPickupLocationFilter.getIntervalSeconds() == null || androidPickupLocationFilter.getPriority() == null || androidPickupLocationFilter.getSmallestDisplacement() == null) {
                locationFilter = null;
            } else {
                int proximityToSite = androidPickupLocationFilter.getProximityToSite() < 0 ? a.e.API_PRIORITY_OTHER : androidPickupLocationFilter.getProximityToSite();
                String priority = androidPickupLocationFilter.getPriority();
                if (priority == null) {
                    i10 = 100;
                    Float intervalSeconds = androidPickupLocationFilter.getIntervalSeconds();
                    Intrinsics.g(intervalSeconds);
                    float fFloatValue = intervalSeconds.floatValue();
                    Float smallestDisplacement = androidPickupLocationFilter.getSmallestDisplacement();
                    Intrinsics.g(smallestDisplacement);
                    locationFilter = new LocationFilter(proximityToSite, fFloatValue, i10, smallestDisplacement.floatValue());
                } else {
                    int iHashCode = priority.hashCode();
                    if (iHashCode == -1186512138) {
                        priority.equals("high_accuracy");
                    } else if (iHashCode == -687751078) {
                        if (priority.equals("low_power")) {
                            i10 = 104;
                        }
                        Float intervalSeconds2 = androidPickupLocationFilter.getIntervalSeconds();
                        Intrinsics.g(intervalSeconds2);
                        float fFloatValue2 = intervalSeconds2.floatValue();
                        Float smallestDisplacement2 = androidPickupLocationFilter.getSmallestDisplacement();
                        Intrinsics.g(smallestDisplacement2);
                        locationFilter = new LocationFilter(proximityToSite, fFloatValue2, i10, smallestDisplacement2.floatValue());
                    } else if (iHashCode != -46201078) {
                        if (iHashCode == 990897415 && priority.equals("no_power")) {
                            i10 = 105;
                        }
                        Float intervalSeconds22 = androidPickupLocationFilter.getIntervalSeconds();
                        Intrinsics.g(intervalSeconds22);
                        float fFloatValue22 = intervalSeconds22.floatValue();
                        Float smallestDisplacement22 = androidPickupLocationFilter.getSmallestDisplacement();
                        Intrinsics.g(smallestDisplacement22);
                        locationFilter = new LocationFilter(proximityToSite, fFloatValue22, i10, smallestDisplacement22.floatValue());
                    } else {
                        if (priority.equals("balanced_power_accuracy")) {
                            i10 = 102;
                        }
                        Float intervalSeconds222 = androidPickupLocationFilter.getIntervalSeconds();
                        Intrinsics.g(intervalSeconds222);
                        float fFloatValue222 = intervalSeconds222.floatValue();
                        Float smallestDisplacement222 = androidPickupLocationFilter.getSmallestDisplacement();
                        Intrinsics.g(smallestDisplacement222);
                        locationFilter = new LocationFilter(proximityToSite, fFloatValue222, i10, smallestDisplacement222.floatValue());
                    }
                    i10 = 100;
                    Float intervalSeconds2222 = androidPickupLocationFilter.getIntervalSeconds();
                    Intrinsics.g(intervalSeconds2222);
                    float fFloatValue2222 = intervalSeconds2222.floatValue();
                    Float smallestDisplacement2222 = androidPickupLocationFilter.getSmallestDisplacement();
                    Intrinsics.g(smallestDisplacement2222);
                    locationFilter = new LocationFilter(proximityToSite, fFloatValue2222, i10, smallestDisplacement2222.floatValue());
                }
            }
            if (locationFilter != null) {
                arrayList.add(locationFilter);
            }
        }
        return arrayList;
    }

    private final List<OrderEventInfo> updateLocationIfStale() {
        Location location;
        if (Instant.now(this.clock).minusSeconds(STALE_LOCATION_SECONDS).isBefore(this.lastLocationUpdate) || (location = this.lastLocation) == null) {
            return null;
        }
        return updateLocation(location);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateProximity() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.pickup.helper.LocationEventGenerator.updateProximity():void");
    }

    public final Order getClosestOrder() {
        return this.closestOrder;
    }

    public final LocationFilter getCurrentLocationFilter() {
        return this.currentLocationFilter;
    }

    public final SdkConfig getSdkConfig() {
        return this.sdkConfig;
    }

    public final boolean getShouldStartBeaconing() {
        return this.currentLocationFilter.getProximityToSite() < 500;
    }

    public final void setSdkConfig(SdkConfig sdkConfig) {
        Intrinsics.j(sdkConfig, "<set-?>");
        this.sdkConfig = sdkConfig;
    }

    public final List<OrderEventInfo> updateLocation(Location location) {
        Intrinsics.j(location, "location");
        if (this.updatingLocation) {
            return null;
        }
        this.beaconList.removeStale();
        this.lastLocation = location;
        Instant instantNow = Instant.now(this.clock);
        Intrinsics.i(instantNow, "now(...)");
        this.lastLocationUpdate = instantNow;
        this.updatingLocation = true;
        fetchMisarrivalSitesIfNeeded(location, this.activeOrders);
        LocationWithBeaconUpdate locationWithBeaconUpdate = new LocationWithBeaconUpdate(location, CollectionsKt.j1(this.beaconList.getBeacons().values()));
        boolean zShouldSendLocationEvent = shouldSendLocationEvent(location, this.activeOrders);
        if (zShouldSendLocationEvent) {
            this.lastLocationEvent = location;
            this.lastLocationEventSent = Instant.now(this.clock);
        }
        updateProximity();
        ArrayList arrayList = new ArrayList();
        for (Order order : this.activeOrders) {
            Integer possibleWrongSiteId = getPossibleWrongSiteId(order, location);
            if (possibleWrongSiteId != null) {
                LogExtensionsKt.logd(this, true, "Possible wrong site found: " + possibleWrongSiteId.intValue());
            }
            Location location2 = this.lastLocation;
            Integer etaIfNeeded = location2 != null ? ETACalculator.INSTANCE.getEtaIfNeeded(location2, order) : null;
            String str = etaIfNeeded != null ? ETA_SOURCE : null;
            if (zShouldSendLocationEvent || possibleWrongSiteId != null) {
                arrayList.add(LocationWithBeaconUpdateKt.toApiOrderEvent(locationWithBeaconUpdate, order.getId(), possibleWrongSiteId, etaIfNeeded, str));
            }
        }
        this.updatingLocation = false;
        return arrayList;
    }

    public final void updateOpenOrders(List<Order> orders) {
        Intrinsics.j(orders, "orders");
        synchronized (this.activeOrders) {
            try {
                this.activeOrders.clear();
                ArrayList arrayList = new ArrayList();
                for (Object obj : orders) {
                    if (!OrderKt.getLocationTrackingDeferred((Order) obj)) {
                        arrayList.add(obj);
                    }
                }
                this.activeOrders.addAll(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        updateProximity();
    }

    private final Integer getPossibleWrongSiteId(Order order, Location location) {
        double dDoubleValue;
        List listZ0;
        Site site;
        Location location2;
        if (order.getWrongSiteDetectionEnabled() && order.getWrongSiteId() == null) {
            Double worstAccuracyLimit = this.sdkConfig.getWrongSiteArrivalConfig().getWorstAccuracyLimit();
            if (worstAccuracyLimit != null) {
                dDoubleValue = worstAccuracyLimit.doubleValue();
            } else {
                dDoubleValue = 250.0d;
            }
            if (location.getAccuracy() < ((float) dDoubleValue)) {
                int id2 = order.getSite().getId();
                double wrongSiteArrivalRadius = order.getSite().getWrongSiteArrivalRadius();
                List<Site> list = this.sitesForMisarrival;
                if (list != null) {
                    listZ0 = CollectionsKt.Z0(list, new b(location));
                } else {
                    listZ0 = null;
                }
                if (listZ0 != null) {
                    site = (Site) CollectionsKt.u0(listZ0);
                } else {
                    site = null;
                }
                if (site != null && (location2 = site.getLocation()) != null && site.getId() != id2 && location2.distanceTo(location) < wrongSiteArrivalRadius) {
                    return Integer.valueOf(site.getId());
                }
            }
        }
        return null;
    }
}
