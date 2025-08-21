package com.scandit.datacapture.barcode.batch.data;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/data/TrackedObjectProxyAdapter;", "Lcom/scandit/datacapture/barcode/batch/data/TrackedObjectProxy;", "Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedObject;", "_NativeTrackedObject", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedObject;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedObject;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "location", "getData", "data", "", "getIdentifier", "()I", "identifier", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class TrackedObjectProxyAdapter implements TrackedObjectProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeTrackedObject f121425a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public TrackedObjectProxyAdapter(NativeTrackedObject _NativeTrackedObject, ProxyCache proxyCache) {
        Intrinsics.j(_NativeTrackedObject, "_NativeTrackedObject");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121425a = _NativeTrackedObject;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    /* renamed from: _impl, reason: from getter */
    public NativeTrackedObject getF121425a() {
        return this.f121425a;
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    public String getData() {
        return this.f121425a.getUtf8String();
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    public int getIdentifier() {
        return this.f121425a.getIdentifier();
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    public Quadrilateral getLocation() {
        Quadrilateral location = this.f121425a.getLocation();
        Intrinsics.g(location);
        return location;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    public String toJson() {
        String json = this.f121425a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ TrackedObjectProxyAdapter(NativeTrackedObject nativeTrackedObject, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeTrackedObject, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
