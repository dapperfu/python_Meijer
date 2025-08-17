package com.scandit.datacapture.core.area.serialization;

import com.scandit.datacapture.core.area.RadiusLocationSelection;
import com.scandit.datacapture.core.area.RectangularLocationSelection;
import com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.area.NativeNoLocationSelection;
import com.scandit.datacapture.core.internal.sdk.area.NativeRadiusLocationSelection;
import com.scandit.datacapture.core.internal.sdk.area.NativeRectangularLocationSelection;
import com.scandit.datacapture.core.internal.sdk.area.NoLocationSelection;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializerHelper;", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;", "_LocationSelectionDeserializerHelper", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeNoLocationSelection;", "createNoLocationSelection", "()Lcom/scandit/datacapture/core/internal/sdk/area/NativeNoLocationSelection;", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeRadiusLocationSelection;", "createRadiusLocationSelection", "()Lcom/scandit/datacapture/core/internal/sdk/area/NativeRadiusLocationSelection;", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeRectangularLocationSelection;", "createRectangularLocationSelection", "()Lcom/scandit/datacapture/core/internal/sdk/area/NativeRectangularLocationSelection;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class LocationSelectionDeserializerHelperReversedAdapter extends NativeLocationSelectionDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final LocationSelectionDeserializerHelper f124025a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public LocationSelectionDeserializerHelperReversedAdapter(LocationSelectionDeserializerHelper _LocationSelectionDeserializerHelper, ProxyCache proxyCache) {
        Intrinsics.j(_LocationSelectionDeserializerHelper, "_LocationSelectionDeserializerHelper");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124025a = _LocationSelectionDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializerHelper
    public NativeNoLocationSelection createNoLocationSelection() {
        NoLocationSelection noLocationSelectionCreateNoLocationSelectionFromJson = this.f124025a.createNoLocationSelectionFromJson();
        NativeNoLocationSelection nativeNoLocationSelection_impl = noLocationSelectionCreateNoLocationSelectionFromJson._impl();
        this.proxyCache.put(Reflection.b(NativeNoLocationSelection.class), null, nativeNoLocationSelection_impl, noLocationSelectionCreateNoLocationSelectionFromJson);
        return nativeNoLocationSelection_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializerHelper
    public NativeRadiusLocationSelection createRadiusLocationSelection() {
        RadiusLocationSelection radiusLocationSelectionCreateRadiusLocationSelectionFromJson = this.f124025a.createRadiusLocationSelectionFromJson();
        NativeRadiusLocationSelection nativeRadiusLocationSelection_impl = radiusLocationSelectionCreateRadiusLocationSelectionFromJson._impl();
        this.proxyCache.put(Reflection.b(NativeRadiusLocationSelection.class), null, nativeRadiusLocationSelection_impl, radiusLocationSelectionCreateRadiusLocationSelectionFromJson);
        return nativeRadiusLocationSelection_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializerHelper
    public NativeRectangularLocationSelection createRectangularLocationSelection() {
        RectangularLocationSelection rectangularLocationSelectionCreateRectangularLocationSelectionFromJson = this.f124025a.createRectangularLocationSelectionFromJson();
        NativeRectangularLocationSelection nativeRectangularLocationSelection_impl = rectangularLocationSelectionCreateRectangularLocationSelectionFromJson._impl();
        this.proxyCache.put(Reflection.b(NativeRectangularLocationSelection.class), null, nativeRectangularLocationSelection_impl, rectangularLocationSelectionCreateRectangularLocationSelectionFromJson);
        return nativeRectangularLocationSelection_impl;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ LocationSelectionDeserializerHelperReversedAdapter(LocationSelectionDeserializerHelper locationSelectionDeserializerHelper, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(locationSelectionDeserializerHelper, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
