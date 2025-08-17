package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/data/Cluster;", "", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;", "native", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;)V", "a", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;", "getNative$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "b", "Ljava/util/List;", "getBarcodes", "()Ljava/util/List;", "barcodes", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class Cluster {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeCluster native;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f120895b;

    public Cluster(NativeCluster nativeCluster) {
        Intrinsics.j(nativeCluster, "native");
        this.native = nativeCluster;
        ArrayList<NativeBarcode> barcodes = nativeCluster.getBarcodes();
        Intrinsics.i(barcodes, "getBarcodes(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(barcodes, 10));
        Iterator<T> it = barcodes.iterator();
        while (it.hasNext()) {
            arrayList.add(new Barcode((NativeBarcode) it.next()));
        }
        this.f120895b = arrayList;
    }

    public final List<Barcode> getBarcodes() {
        return this.f120895b;
    }

    /* renamed from: getNative$scandit_barcode_capture, reason: from getter */
    public final NativeCluster getNative() {
        return this.native;
    }
}
