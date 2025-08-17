package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.capture.Coordinate2d;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridElement;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGrid;", "_NativeBarcodeSpatialGrid", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGrid;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGrid;", "", "rows", "()I", "columns", "row", "column", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElement;", "elementAt", "(II)Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElement;", "element", "", "Lcom/scandit/datacapture/barcode/count/capture/Coordinate2d;", "coordinatesForElement", "(Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElement;)Ljava/util/List;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeSpatialGridProxyAdapter implements BarcodeSpatialGridProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSpatialGrid f120691a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeSpatialGridProxyAdapter(NativeBarcodeSpatialGrid _NativeBarcodeSpatialGrid, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeSpatialGrid, "_NativeBarcodeSpatialGrid");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120691a = _NativeBarcodeSpatialGrid;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeSpatialGrid getF120691a() {
        return this.f120691a;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    public int columns() {
        return this.f120691a.columns();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    public List<Coordinate2d> coordinatesForElement(BarcodeSpatialGridElement element) {
        Intrinsics.j(element, "element");
        NativeBarcodeSpatialGridElement f120689a = element.getF120689a();
        this.proxyCache.put(Reflection.b(NativeBarcodeSpatialGridElement.class), null, f120689a, element);
        ArrayList<Coordinate2d> arrayListCoordinatesForElement = this.f120691a.coordinatesForElement(f120689a);
        Intrinsics.g(arrayListCoordinatesForElement);
        return arrayListCoordinatesForElement;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    public BarcodeSpatialGridElement elementAt(int row, int column) {
        NativeBarcodeSpatialGridElement nativeBarcodeSpatialGridElementElementAt = this.f120691a.elementAt(row, column);
        if (nativeBarcodeSpatialGridElementElementAt != null) {
            return (BarcodeSpatialGridElement) this.proxyCache.getOrPut(Reflection.b(NativeBarcodeSpatialGridElement.class), null, nativeBarcodeSpatialGridElementElementAt, new e(nativeBarcodeSpatialGridElementElementAt));
        }
        return null;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    public int rows() {
        return this.f120691a.rows();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridProxy
    public String toJson() {
        String json = this.f120691a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ BarcodeSpatialGridProxyAdapter(NativeBarcodeSpatialGrid nativeBarcodeSpatialGrid, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeSpatialGrid, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
