package com.scandit.datacapture.barcode.internal.module.count.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGrid;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class InternalBarcodeCountSession {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f121278a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f121279b;

    public InternalBarcodeCountSession(Function0 getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f121278a = getImpl;
        this.f121279b = LazyKt.b(new l(this));
    }

    public final BarcodeSpatialGrid a(int i10, int i11) {
        NativeBarcodeSpatialGrid spatialMap = ((m) this.f121279b.getValue()).f121297a.getSpatialMap(i10, i11);
        if (spatialMap != null) {
            return new BarcodeSpatialGrid(spatialMap);
        }
        return null;
    }

    public final long b() {
        return ((m) this.f121279b.getValue()).f121297a.getFrameSeqIdAndroid();
    }

    public final boolean c() {
        return ((m) this.f121279b.getValue()).f121297a.hasScanningFailed();
    }

    public final Map d() {
        HashMap<Integer, NativeTrackedBarcode> trackedBarcodes = ((m) this.f121279b.getValue()).f121297a.getTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(trackedBarcodes);
        return barcodeNativeTypeFactory.convert(trackedBarcodes);
    }

    public final ArrayList e() {
        ArrayList<NativeBarcode> additionalBarcodes = ((NativeBarcodeCountSession) this.f121278a.invoke()).getAdditionalBarcodes();
        Intrinsics.i(additionalBarcodes, "getAdditionalBarcodes(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(additionalBarcodes, 10));
        for (NativeBarcode nativeBarcode : additionalBarcodes) {
            Intrinsics.g(nativeBarcode);
            arrayList.add(new Barcode(nativeBarcode));
        }
        return arrayList;
    }

    public final LinkedHashMap f() {
        HashMap<Integer, NativeTrackedBarcode> clearedBarcodes = ((NativeBarcodeCountSession) this.f121278a.invoke()).getClearedBarcodes();
        Intrinsics.i(clearedBarcodes, "getClearedBarcodes(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(clearedBarcodes.size()));
        Iterator<T> it = clearedBarcodes.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.i(value, "<get-value>(...)");
            linkedHashMap.put(key, new TrackedBarcode((NativeTrackedBarcode) value));
        }
        return linkedHashMap;
    }

    public final ArrayList g() {
        ArrayList<NativeCluster> clusters = ((NativeBarcodeCountSession) this.f121278a.invoke()).getClusters();
        Intrinsics.i(clusters, "getClusters(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(clusters, 10));
        for (NativeCluster nativeCluster : clusters) {
            Intrinsics.g(nativeCluster);
            Collection<NativeTrackedBarcode> collectionValues = ((NativeBarcodeCountSession) this.f121278a.invoke()).getTrackedBarcodes().values();
            Intrinsics.i(collectionValues, "<get-values>(...)");
            ArrayList<NativeTrackedBarcode> unscannedTrackedBarcodes = ((NativeBarcodeCountSession) this.f121278a.invoke()).getUnscannedTrackedBarcodes();
            Intrinsics.i(unscannedTrackedBarcodes, "getUnscannedTrackedBarcodes(...)");
            arrayList.add(new n(nativeCluster, collectionValues, unscannedTrackedBarcodes));
        }
        return arrayList;
    }

    public final ArrayList h() {
        Collection<NativeTrackedBarcode> collectionValues = ((NativeBarcodeCountSession) this.f121278a.invoke()).getFilteredTrackedBarcodes().values();
        Intrinsics.i(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(new TrackedBarcode((NativeTrackedBarcode) it.next()));
        }
        return arrayList;
    }

    public final ArrayList i() {
        Collection<NativeTrackedBarcode> collectionValues = ((NativeBarcodeCountSession) this.f121278a.invoke()).getTrackedBarcodes().values();
        Intrinsics.i(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(new TrackedBarcode((NativeTrackedBarcode) it.next()));
        }
        return arrayList;
    }

    public final ArrayList j() {
        ArrayList<Integer> removedTrackedBarcodes = ((NativeBarcodeCountSession) this.f121278a.invoke()).getRemovedTrackedBarcodes();
        Intrinsics.i(removedTrackedBarcodes, "getRemovedTrackedBarcodes(...)");
        return removedTrackedBarcodes;
    }

    public final int k() {
        return ((NativeBarcodeCountSession) this.f121278a.invoke()).getScannedBarcodeCount();
    }

    public final ArrayList l() {
        ArrayList<NativeTrackedBarcode> unscannedTrackedBarcodes = ((NativeBarcodeCountSession) this.f121278a.invoke()).getUnscannedTrackedBarcodes();
        Intrinsics.i(unscannedTrackedBarcodes, "getUnscannedTrackedBarcodes(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(unscannedTrackedBarcodes, 10));
        for (NativeTrackedBarcode nativeTrackedBarcode : unscannedTrackedBarcodes) {
            Intrinsics.g(nativeTrackedBarcode);
            arrayList.add(new TrackedBarcode(nativeTrackedBarcode));
        }
        return arrayList;
    }

    public final void m() {
        ((m) this.f121279b.getValue()).f121297a.reset();
    }

    public final String n() {
        String json = ((m) this.f121279b.getValue()).f121297a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public final NativeBarcodeCountSession a() {
        return (NativeBarcodeCountSession) this.f121278a.invoke();
    }
}
