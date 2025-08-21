package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSession;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSessionProxy;", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickPublicSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toJson", "()Ljava/lang/String;", "", "getTrackedItems", "()Ljava/util/Set;", "trackedItems", "getAddedItems", "addedItems", "Lcom/scandit/datacapture/barcode/batch/data/TrackedObject;", "getTrackedObjects", "trackedObjects", "getAddedObjects", "addedObjects", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodePickSession implements BarcodePickSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f124530a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f124531b;

    public BarcodePickSession(Function0<? extends NativeBarcodePickPublicSession> getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f124530a = getImpl;
        this.f124531b = LazyKt.b(new f(this));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public Set<String> getAddedItems() {
        return ((BarcodePickSessionProxyAdapter) this.f124531b.getValue()).getAddedItems();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public Set<TrackedObject> getAddedObjects() {
        return ((BarcodePickSessionProxyAdapter) this.f124531b.getValue()).getAddedObjects();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public Set<String> getTrackedItems() {
        return ((BarcodePickSessionProxyAdapter) this.f124531b.getValue()).getTrackedItems();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public Set<TrackedObject> getTrackedObjects() {
        return ((BarcodePickSessionProxyAdapter) this.f124531b.getValue()).getTrackedObjects();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public String toJson() {
        return ((BarcodePickSessionProxyAdapter) this.f124531b.getValue()).toJson();
    }
}
