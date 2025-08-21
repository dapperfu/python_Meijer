package com.radiusnetworks.flybuy.sdk.pickup.eta;

import android.location.Location;
import androidx.annotation.Keep;
import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsLeg;
import com.google.maps.model.DirectionsRoute;
import com.google.maps.model.LatLng;
import com.google.maps.model.TravelMode;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.app.ETAConfig;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import j$.time.Clock;
import j$.time.Duration;
import j$.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010'R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010!R\u0016\u00106\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010$¨\u00067"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/pickup/eta/ETACalculator;", "", "<init>", "()V", "", "isETACalculationEnabled", "()Z", "Landroid/location/Location;", "location", "", "orderId", "shouldCalculateNewETA", "(Landroid/location/Location;I)Z", "Lcom/radiusnetworks/flybuy/sdk/pickup/eta/ETAData;", "getETAData", "(I)Lcom/radiusnetworks/flybuy/sdk/pickup/eta/ETAData;", "", "googleApiKey", "j$/time/Clock", "clock", "", "configure", "(Ljava/lang/String;Lj$/time/Clock;)V", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "order", "getEtaIfNeeded", "(Landroid/location/Location;Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;)Ljava/lang/Integer;", "etaSeconds", "prearrivalSeconds", "saveNewExpiryTime$pickup_defaultRelease", "(III)V", "saveNewExpiryTime", "DEFAULT_MINIMUM_ETA_CACHE_INTERVAL", "I", "", "DEFAULT_CACHE_FILTER_ETA_SECONDS_MULTIPLIER", "D", "", "ACCURACY_LIMIT", "F", "ACCURACY_RECALCULATION_THRESHOLD", "", "etaDataMap", "Ljava/util/Map;", "getEtaDataMap$pickup_defaultRelease", "()Ljava/util/Map;", "Lcom/google/maps/GeoApiContext;", "geoApiContext", "Lcom/google/maps/GeoApiContext;", "Lj$/time/Clock;", "initialized", "Z", "lastAccuracy", "minimumETACacheInterval", "cacheFilterETASecondsMultiplier", "pickup_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ETACalculator {
    private static final float ACCURACY_LIMIT = 5.0f;
    private static final float ACCURACY_RECALCULATION_THRESHOLD = 0.8f;
    private static final double DEFAULT_CACHE_FILTER_ETA_SECONDS_MULTIPLIER = 0.5d;
    private static final int DEFAULT_MINIMUM_ETA_CACHE_INTERVAL = 120;
    private static double cacheFilterETASecondsMultiplier;
    private static Clock clock;
    private static GeoApiContext geoApiContext;
    private static boolean initialized;
    private static float lastAccuracy;
    private static int minimumETACacheInterval;
    public static final ETACalculator INSTANCE = new ETACalculator();
    private static final Map<Integer, ETAData> etaDataMap = new LinkedHashMap();

    public final void saveNewExpiryTime$pickup_defaultRelease(int orderId, int etaSeconds, int prearrivalSeconds) {
        int iMin = (int) (etaSeconds * cacheFilterETASecondsMultiplier);
        int i10 = etaSeconds - (prearrivalSeconds * 2);
        int i11 = etaSeconds - prearrivalSeconds;
        if (i10 > 0) {
            iMin = Integer.min(iMin, i10);
        } else if (i11 > 0) {
            iMin = 0;
        }
        getETAData(orderId).setCachedETAExpirySeconds(Math.max(iMin, minimumETACacheInterval));
    }

    static {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Intrinsics.i(clockSystemDefaultZone, "systemDefaultZone(...)");
        clock = clockSystemDefaultZone;
        lastAccuracy = Float.MAX_VALUE;
        minimumETACacheInterval = 120;
        cacheFilterETASecondsMultiplier = DEFAULT_CACHE_FILTER_ETA_SECONDS_MULTIPLIER;
    }

    private final ETAData getETAData(int orderId) {
        Map<Integer, ETAData> map = etaDataMap;
        if (!map.containsKey(Integer.valueOf(orderId))) {
            map.put(Integer.valueOf(orderId), new ETAData(null, null, 0, false, 15, null));
        }
        return (ETAData) MapsKt.l(map, Integer.valueOf(orderId));
    }

    private final boolean isETACalculationEnabled() {
        return FlyBuyCore.INSTANCE.getSdkConfig().getEtaConfig() != null;
    }

    private final boolean shouldCalculateNewETA(Location location, int orderId) {
        if (lastAccuracy > 5.0f && location.getAccuracy() < lastAccuracy * ACCURACY_RECALCULATION_THRESHOLD) {
            return true;
        }
        ETAData eTAData = getETAData(orderId);
        if (eTAData.getLastETAFetchedAt() == null) {
            return true;
        }
        long seconds = Duration.between(eTAData.getLastETAFetchedAt(), Instant.now(clock)).getSeconds();
        LogExtensionsKt.logd(this, true, "Time since last ETA calculated = " + seconds);
        return seconds > ((long) eTAData.getCachedETAExpirySeconds());
    }

    public final void configure(String googleApiKey, Clock clock2) {
        if (googleApiKey != null) {
            geoApiContext = new GeoApiContext.Builder().apiKey(googleApiKey).build();
        }
        if (clock2 != null) {
            clock = clock2;
        }
        FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
        ETAConfig etaConfig = flyBuyCore.getSdkConfig().getEtaConfig();
        if (etaConfig != null) {
            minimumETACacheInterval = etaConfig.getMinimumETACacheInterval();
        }
        ETAConfig etaConfig2 = flyBuyCore.getSdkConfig().getEtaConfig();
        if (etaConfig2 != null) {
            cacheFilterETASecondsMultiplier = etaConfig2.getCacheFilterETASecondsMultiplier();
        }
        initialized = true;
    }

    public final Map<Integer, ETAData> getEtaDataMap$pickup_defaultRelease() {
        return etaDataMap;
    }

    public final Integer getEtaIfNeeded(Location location, Order order) {
        GeoApiContext geoApiContext2;
        Location location2;
        DirectionsLeg[] directionsLegArr;
        DirectionsLeg directionsLeg;
        com.google.maps.model.Duration duration;
        Intrinsics.j(location, "location");
        Intrinsics.j(order, "order");
        if (!initialized || !isETACalculationEnabled() || !shouldCalculateNewETA(location, order.getId())) {
            return null;
        }
        ETAData eTAData = getETAData(order.getId());
        if (eTAData.getDirectionsFailed() || (geoApiContext2 = geoApiContext) == null || (location2 = order.getSite().getLocation()) == null) {
            return null;
        }
        try {
            DirectionsRoute[] routes = DirectionsApi.newRequest(geoApiContext2).origin(new LatLng(location.getLatitude(), location.getLongitude())).destination(new LatLng(location2.getLatitude(), location2.getLongitude())).mode(TravelMode.DRIVING).await().routes;
            Intrinsics.i(routes, "routes");
            DirectionsRoute directionsRoute = (DirectionsRoute) ArraysKt.g0(routes);
            if (directionsRoute == null || (directionsLegArr = directionsRoute.legs) == null || (directionsLeg = (DirectionsLeg) ArraysKt.g0(directionsLegArr)) == null || (duration = directionsLeg.duration) == null) {
                return null;
            }
            int i10 = (int) duration.inSeconds;
            Integer numValueOf = Integer.valueOf(i10);
            eTAData.setLastComputedETASeconds(Integer.valueOf(i10));
            eTAData.setLastETAFetchedAt(Instant.now(clock));
            lastAccuracy = location.getAccuracy();
            INSTANCE.saveNewExpiryTime$pickup_defaultRelease(order.getId(), i10, order.getSite().getPrearrivalSeconds());
            return numValueOf;
        } catch (Exception e10) {
            LogExtensionsKt.loge$default(this, true, e10, null, new Object[0], 4, null);
            eTAData.setDirectionsFailed(true);
            return null;
        }
    }

    private ETACalculator() {
    }
}
