package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSessionProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickPublicSession;", "_NativeBarcodePickPublicSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickPublicSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "getTrackedItems", "()Ljava/util/Set;", "trackedItems", "getAddedItems", "addedItems", "Lcom/scandit/datacapture/barcode/batch/data/TrackedObject;", "getTrackedObjects", "trackedObjects", "getAddedObjects", "addedObjects", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickSessionProxyAdapter implements BarcodePickSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickPublicSession f123580a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickSessionProxyAdapter(NativeBarcodePickPublicSession _NativeBarcodePickPublicSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodePickPublicSession, "_NativeBarcodePickPublicSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123580a = _NativeBarcodePickPublicSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public Set<String> getAddedItems() {
        HashSet<String> addedItems = this.f123580a.getAddedItems();
        Intrinsics.g(addedItems);
        return addedItems;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public Set<TrackedObject> getAddedObjects() {
        HashSet<NativeTrackedObject> addedObjects = this.f123580a.getAddedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(addedObjects);
        return barcodeNativeTypeFactory.convertTrackedObjectNativeSet(addedObjects);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public Set<String> getTrackedItems() {
        HashSet<String> trackedItems = this.f123580a.getTrackedItems();
        Intrinsics.g(trackedItems);
        return trackedItems;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public Set<TrackedObject> getTrackedObjects() {
        HashSet<NativeTrackedObject> trackedObjects = this.f123580a.getTrackedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(trackedObjects);
        return barcodeNativeTypeFactory.convertTrackedObjectNativeSet(trackedObjects);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    public String toJson() {
        String json = this.f123580a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ BarcodePickSessionProxyAdapter(NativeBarcodePickPublicSession nativeBarcodePickPublicSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickPublicSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
