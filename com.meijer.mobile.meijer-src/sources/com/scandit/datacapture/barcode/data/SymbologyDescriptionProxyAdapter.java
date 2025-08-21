package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription;
import com.scandit.datacapture.core.data.Range;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/barcode/data/SymbologyDescriptionProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/SymbologyDescriptionProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;", "_NativeSymbologyDescription", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getIdentifier", "identifier", "getReadableName", "readableName", "", "isAvailable", "()Z", "isColorInvertible", "Lcom/scandit/datacapture/core/data/Range;", "getActiveSymbolCountRange", "()Lcom/scandit/datacapture/core/data/Range;", "activeSymbolCountRange", "getDefaultSymbolCountRange", "defaultSymbolCountRange", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SymbologyDescriptionProxyAdapter implements SymbologyDescriptionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSymbologyDescription f121866a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public SymbologyDescriptionProxyAdapter(NativeSymbologyDescription _NativeSymbologyDescription, ProxyCache proxyCache) {
        Intrinsics.j(_NativeSymbologyDescription, "_NativeSymbologyDescription");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121866a = _NativeSymbologyDescription;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    /* renamed from: _impl, reason: from getter */
    public NativeSymbologyDescription getF121866a() {
        return this.f121866a;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public Range getActiveSymbolCountRange() {
        Range activeSymbolCountRange = this.f121866a.getActiveSymbolCountRange();
        Intrinsics.g(activeSymbolCountRange);
        return activeSymbolCountRange;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public Range getDefaultSymbolCountRange() {
        Range defaultSymbolCountRange = this.f121866a.getDefaultSymbolCountRange();
        Intrinsics.g(defaultSymbolCountRange);
        return defaultSymbolCountRange;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public String getIdentifier() {
        String identifier = this.f121866a.getIdentifier();
        Intrinsics.g(identifier);
        return identifier;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public String getReadableName() {
        String readableName = this.f121866a.getReadableName();
        Intrinsics.g(readableName);
        return readableName;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public Symbology getSymbology() {
        Symbology symbology = this.f121866a.getSymbology();
        Intrinsics.g(symbology);
        return symbology;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public boolean isAvailable() {
        return this.f121866a.isAvailable();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public boolean isColorInvertible() {
        return this.f121866a.isColorInvertible();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public String toJson() {
        String json = this.f121866a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ SymbologyDescriptionProxyAdapter(NativeSymbologyDescription nativeSymbologyDescription, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSymbologyDescription, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
