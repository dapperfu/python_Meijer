package com.radiusnetworks.flybuy.sdk.pickup.helper;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.location.Location;
import android.util.SparseArray;
import com.google.android.gms.common.api.a;
import com.radiusnetworks.flybuy.api.model.AndroidPickupLocationFilter;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfig;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfigKt;
import com.radiusnetworks.flybuy.sdk.data.beacons.BeaconIdentifiers;
import com.radiusnetworks.flybuy.sdk.data.beacons.BeaconList;
import com.radiusnetworks.flybuy.sdk.data.defaults.SdkDefaultsKt;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.data.wrongsitearrival.WrongSiteArrivalConfig;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.pickup.service.i;
import com.radiusnetworks.flybuy.sdk.pickup.service.k;
import j$.time.Clock;
import j$.time.Instant;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Clock f120012a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f120013b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f120014c;

    /* renamed from: d, reason: collision with root package name */
    public SdkConfig f120015d;

    /* renamed from: e, reason: collision with root package name */
    public com.radiusnetworks.flybuy.sdk.pickup.data.a f120016e;

    /* renamed from: f, reason: collision with root package name */
    public com.radiusnetworks.flybuy.sdk.pickup.data.a f120017f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f120018g;

    /* renamed from: h, reason: collision with root package name */
    public Order f120019h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f120020i;

    /* renamed from: j, reason: collision with root package name */
    public Location f120021j;

    /* renamed from: k, reason: collision with root package name */
    public Instant f120022k;

    /* renamed from: l, reason: collision with root package name */
    public final BeaconList f120023l;

    /* renamed from: m, reason: collision with root package name */
    public Location f120024m;

    /* renamed from: n, reason: collision with root package name */
    public Instant f120025n;

    /* renamed from: o, reason: collision with root package name */
    public List f120026o;

    public final ArrayList a(ScanResult scanResult) {
        BeaconIdentifiers beaconIdentifiers;
        Location location;
        SparseArray<byte[]> manufacturerSpecificData;
        byte[] bArrValueAt;
        if (scanResult != null) {
            Intrinsics.j(scanResult, "<this>");
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord == null || (manufacturerSpecificData = scanRecord.getManufacturerSpecificData()) == null || (bArrValueAt = manufacturerSpecificData.valueAt(0)) == null || bArrValueAt.length < 23) {
                beaconIdentifiers = null;
            } else {
                byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                System.arraycopy(bArrValueAt, 2, bArr, 0, 16);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                beaconIdentifiers = new BeaconIdentifiers(new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()), UInt.b(UInt.b(UByte.b(bArrValueAt[19]) & 255) + UInt.b(UInt.b(256) * UInt.b(UByte.b(bArrValueAt[18]) & 255))), UInt.b(UInt.b(UByte.b(bArrValueAt[21]) & 255) + UInt.b(UInt.b(256) * UInt.b(UByte.b(bArrValueAt[20]) & 255))), bArrValueAt[22]);
            }
            if (beaconIdentifiers != null) {
                this.f120023l.addScan(beaconIdentifiers, scanResult.getRssi());
                if (!Instant.now(this.f120012a).minusSeconds(5L).isBefore(this.f120022k) && (location = this.f120021j) != null) {
                    return b(location);
                }
            }
        }
        return null;
    }

    public final void d(Location location, ArrayList arrayList) {
        ArrayList arrayList2;
        Order order;
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((Order) next).getWrongSiteDetectionEnabled()) {
                    arrayList2.add(next);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.f120026o = null;
            return;
        }
        if (this.f120026o == null) {
            this.f120026o = new ArrayList();
            WrongSiteArrivalConfig wrongSiteArrivalConfig = this.f120015d.getWrongSiteArrivalConfig();
            double wrongSiteSearchRadius = (arrayList == null || (order = (Order) CollectionsKt.u0(arrayList)) == null) ? 40000.0d : order.getWrongSiteSearchRadius();
            Integer siteLimit = wrongSiteArrivalConfig.getSiteLimit();
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            int sitesFetchLatitudePrecision = wrongSiteArrivalConfig.getSitesFetchLatitudePrecision();
            RoundingMode roundingMode = RoundingMode.HALF_EVEN;
            this.f120026o = (List) this.f120013b.invoke(new CircularRegion(bigDecimal.setScale(sitesFetchLatitudePrecision, roundingMode).doubleValue(), new BigDecimal(location.getLongitude()).setScale(wrongSiteArrivalConfig.getSitesFetchLongitudePrecision(), roundingMode).doubleValue(), (float) wrongSiteSearchRadius), siteLimit);
        }
    }

    public final boolean f(Location location, ArrayList arrayList) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Order) it.next()).getDistanceFilteringDisabled()) {
                    }
                }
            }
            LogExtensionsKt.logd(this, true, "Distance filtering is not disabled.");
            return true;
        }
        if (Instant.now(this.f120012a).isAfter(this.f120025n.plusMillis(MathKt.f(1000 * this.f120017f.f119989b)))) {
            LogExtensionsKt.logd(this, true, "Last location update is more than " + this.f120017f.f119989b + " sec ago.");
            return true;
        }
        Location location2 = this.f120024m;
        boolean z10 = location2 == null || location.distanceTo(location2) > this.f120017f.f119991d;
        if (!z10) {
            LogExtensionsKt.logd(this, true, "Should not send location update.");
            return z10;
        }
        LogExtensionsKt.logd(this, true, "Last location update is more than " + this.f120017f.f119991d + " m away.");
        return z10;
    }

    public c(Clock clock, i fetchMisarrivalSitesRequestListener, k orderOrLocationFilterChangeListener) {
        Intrinsics.j(clock, "clock");
        Intrinsics.j(fetchMisarrivalSitesRequestListener, "fetchMisarrivalSitesRequestListener");
        Intrinsics.j(orderOrLocationFilterChangeListener, "orderOrLocationFilterChangeListener");
        this.f120012a = clock;
        this.f120013b = fetchMisarrivalSitesRequestListener;
        this.f120014c = orderOrLocationFilterChangeListener;
        this.f120015d = SdkConfigKt.toSdkConfig(SdkDefaultsKt.getDEFAULT_APP_RESPONSE().getData());
        com.radiusnetworks.flybuy.sdk.pickup.data.a aVar = com.radiusnetworks.flybuy.sdk.pickup.data.b.f119992a;
        this.f120016e = aVar;
        this.f120017f = aVar;
        this.f120018g = new ArrayList();
        Instant MIN = Instant.MIN;
        Intrinsics.i(MIN, "MIN");
        this.f120022k = MIN;
        this.f120023l = new BeaconList();
        this.f120025n = MIN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [com.radiusnetworks.flybuy.sdk.data.room.domain.Site] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(android.location.Location r25) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.pickup.helper.c.b(android.location.Location):java.util.ArrayList");
    }

    public final List c() {
        com.radiusnetworks.flybuy.sdk.pickup.data.a aVar;
        int i10;
        List<AndroidPickupLocationFilter> android2 = this.f120015d.getPickupLocationFilters().getAndroid();
        if (android2 == null) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        for (AndroidPickupLocationFilter androidPickupLocationFilter : android2) {
            Intrinsics.j(androidPickupLocationFilter, "<this>");
            if (androidPickupLocationFilter.getIntervalSeconds() == null || androidPickupLocationFilter.getPriority() == null || androidPickupLocationFilter.getSmallestDisplacement() == null) {
                aVar = null;
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
                    aVar = new com.radiusnetworks.flybuy.sdk.pickup.data.a(proximityToSite, fFloatValue, i10, smallestDisplacement.floatValue());
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
                        aVar = new com.radiusnetworks.flybuy.sdk.pickup.data.a(proximityToSite, fFloatValue2, i10, smallestDisplacement2.floatValue());
                    } else if (iHashCode != -46201078) {
                        if (iHashCode == 990897415 && priority.equals("no_power")) {
                            i10 = 105;
                        }
                        Float intervalSeconds22 = androidPickupLocationFilter.getIntervalSeconds();
                        Intrinsics.g(intervalSeconds22);
                        float fFloatValue22 = intervalSeconds22.floatValue();
                        Float smallestDisplacement22 = androidPickupLocationFilter.getSmallestDisplacement();
                        Intrinsics.g(smallestDisplacement22);
                        aVar = new com.radiusnetworks.flybuy.sdk.pickup.data.a(proximityToSite, fFloatValue22, i10, smallestDisplacement22.floatValue());
                    } else {
                        if (priority.equals("balanced_power_accuracy")) {
                            i10 = 102;
                        }
                        Float intervalSeconds222 = androidPickupLocationFilter.getIntervalSeconds();
                        Intrinsics.g(intervalSeconds222);
                        float fFloatValue222 = intervalSeconds222.floatValue();
                        Float smallestDisplacement222 = androidPickupLocationFilter.getSmallestDisplacement();
                        Intrinsics.g(smallestDisplacement222);
                        aVar = new com.radiusnetworks.flybuy.sdk.pickup.data.a(proximityToSite, fFloatValue222, i10, smallestDisplacement222.floatValue());
                    }
                    i10 = 100;
                    Float intervalSeconds2222 = androidPickupLocationFilter.getIntervalSeconds();
                    Intrinsics.g(intervalSeconds2222);
                    float fFloatValue2222 = intervalSeconds2222.floatValue();
                    Float smallestDisplacement2222 = androidPickupLocationFilter.getSmallestDisplacement();
                    Intrinsics.g(smallestDisplacement2222);
                    aVar = new com.radiusnetworks.flybuy.sdk.pickup.data.a(proximityToSite, fFloatValue2222, i10, smallestDisplacement2222.floatValue());
                }
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.pickup.helper.c.e():void");
    }
}
