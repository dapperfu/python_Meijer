package com.scandit.datacapture.core.area.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerProxyAdapter;", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;", "_NativeLocationSelectionDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;", "helper", "", "_setHelper", "(Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "", "getWarnings", "()Ljava/util/List;", "warnings", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class LocationSelectionDeserializerProxyAdapter implements LocationSelectionDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeLocationSelectionDeserializer f124979a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public LocationSelectionDeserializerProxyAdapter(NativeLocationSelectionDeserializer _NativeLocationSelectionDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_NativeLocationSelectionDeserializer, "_NativeLocationSelectionDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124979a = _NativeLocationSelectionDeserializer;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    public void _setHelper(LocationSelectionDeserializerHelper helper) {
        this.f124979a.setHelper(helper != null ? (LocationSelectionDeserializerHelperReversedAdapter) this.proxyCache.getOrPut(Reflection.b(LocationSelectionDeserializerHelper.class), null, helper, new a(helper)) : null);
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    /* renamed from: _impl, reason: from getter */
    public NativeLocationSelectionDeserializer getF124979a() {
        return this.f124979a;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    public List<String> getWarnings() {
        ArrayList<String> warnings = this.f124979a.getWarnings();
        Intrinsics.g(warnings);
        return warnings;
    }

    public /* synthetic */ LocationSelectionDeserializerProxyAdapter(NativeLocationSelectionDeserializer nativeLocationSelectionDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeLocationSelectionDeserializer, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
