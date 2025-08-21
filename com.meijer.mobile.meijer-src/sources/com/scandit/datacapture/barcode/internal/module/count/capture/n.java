package com.scandit.datacapture.barcode.internal.module.count.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCluster f122250a;

    /* renamed from: b, reason: collision with root package name */
    public final List f122251b;

    public n(NativeCluster nativeCluster, Collection nativeRecognizedBarcode, ArrayList nativeUnrecognizedBarcode) {
        Intrinsics.j(nativeCluster, "native");
        Intrinsics.j(nativeRecognizedBarcode, "recognizedBarcode");
        Intrinsics.j(nativeUnrecognizedBarcode, "unrecognizedBarcode");
        Intrinsics.j(nativeCluster, "nativeCluster");
        Intrinsics.j(nativeRecognizedBarcode, "nativeRecognizedBarcode");
        Intrinsics.j(nativeUnrecognizedBarcode, "nativeUnrecognizedBarcode");
        List<NativeTrackedBarcode> listP0 = CollectionsKt.P0(nativeRecognizedBarcode, nativeUnrecognizedBarcode);
        ArrayList trackedBarcodes = new ArrayList();
        for (NativeTrackedBarcode nativeTrackedBarcode : listP0) {
            Integer clusterIdentifier = nativeTrackedBarcode.getClusterIdentifier();
            TrackedBarcode trackedBarcode = (clusterIdentifier != null && clusterIdentifier.intValue() == nativeCluster.getIdentifier()) ? new TrackedBarcode(nativeTrackedBarcode) : null;
            if (trackedBarcode != null) {
                trackedBarcodes.add(trackedBarcode);
            }
        }
        Intrinsics.j(nativeCluster, "nativeCluster");
        Intrinsics.j(trackedBarcodes, "trackedBarcodes");
        this.f122250a = nativeCluster;
        this.f122251b = trackedBarcodes;
    }
}
