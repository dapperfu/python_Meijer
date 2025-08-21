package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeCompositeTypeDescription;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/data/CompositeTypeDescriptionProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/CompositeTypeDescriptionProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeCompositeTypeDescription;", "_NativeCompositeTypeDescription", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeCompositeTypeDescription;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeCompositeTypeDescription;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbologies", "()Ljava/util/Set;", "symbologies", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "getTypes", "()Ljava/util/EnumSet;", "types", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CompositeTypeDescriptionProxyAdapter implements CompositeTypeDescriptionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCompositeTypeDescription f121856a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public CompositeTypeDescriptionProxyAdapter(NativeCompositeTypeDescription _NativeCompositeTypeDescription, ProxyCache proxyCache) {
        Intrinsics.j(_NativeCompositeTypeDescription, "_NativeCompositeTypeDescription");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121856a = _NativeCompositeTypeDescription;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    /* renamed from: _impl, reason: from getter */
    public NativeCompositeTypeDescription getF121856a() {
        return this.f121856a;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    public Set<Symbology> getSymbologies() {
        HashSet<Symbology> symbologies = this.f121856a.getSymbologies();
        Intrinsics.g(symbologies);
        return symbologies;
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    public EnumSet<CompositeType> getTypes() {
        EnumSet<CompositeType> typesBits = this.f121856a.getTypesBits();
        Intrinsics.g(typesBits);
        return typesBits;
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    public String toJson() {
        String json = this.f121856a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ CompositeTypeDescriptionProxyAdapter(NativeCompositeTypeDescription nativeCompositeTypeDescription, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeCompositeTypeDescription, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
