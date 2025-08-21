package com.scandit.datacapture.core.ui.viewfinder.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeNoViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderLineStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeTargetAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.TargetAimerViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializerHelper;", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "_ViewfinderDeserializerHelper", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeNoViewfinder;", "createNoViewfinder", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeNoViewfinder;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinder;", "createLaserlineViewfinder", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinder;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderStyle;", "style", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderLineStyle;", "lineStyle", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;", "createRectangularViewfinder", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderStyle;Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderLineStyle;)Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinder;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;", "createAimerViewfinder", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeTargetAimerViewfinder;", "createTargetAimerViewfinder", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeTargetAimerViewfinder;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ViewfinderDeserializerHelperReversedAdapter extends NativeViewfinderDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final ViewfinderDeserializerHelper f127153a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public ViewfinderDeserializerHelperReversedAdapter(ViewfinderDeserializerHelper _ViewfinderDeserializerHelper, ProxyCache proxyCache) {
        Intrinsics.j(_ViewfinderDeserializerHelper, "_ViewfinderDeserializerHelper");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f127153a = _ViewfinderDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    public NativeAimerViewfinder createAimerViewfinder() {
        AimerViewfinder aimerViewfinderCreateAimerViewfinder = this.f127153a.createAimerViewfinder();
        NativeAimerViewfinder nativeAimerViewfinder_impl = aimerViewfinderCreateAimerViewfinder._impl();
        this.proxyCache.put(Reflection.b(NativeAimerViewfinder.class), null, nativeAimerViewfinder_impl, aimerViewfinderCreateAimerViewfinder);
        return nativeAimerViewfinder_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    public NativeLaserlineViewfinder createLaserlineViewfinder() {
        LaserlineViewfinder laserlineViewfinderCreateLaserlineViewfinder = this.f127153a.createLaserlineViewfinder();
        NativeLaserlineViewfinder nativeLaserlineViewfinder_impl = laserlineViewfinderCreateLaserlineViewfinder._impl();
        this.proxyCache.put(Reflection.b(NativeLaserlineViewfinder.class), null, nativeLaserlineViewfinder_impl, laserlineViewfinderCreateLaserlineViewfinder);
        return nativeLaserlineViewfinder_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    public NativeNoViewfinder createNoViewfinder() {
        NoViewfinder noViewfinderCreateNoViewfinder = this.f127153a.createNoViewfinder();
        NativeNoViewfinder f126778a = noViewfinderCreateNoViewfinder.getF126778a();
        this.proxyCache.put(Reflection.b(NativeNoViewfinder.class), null, f126778a, noViewfinderCreateNoViewfinder);
        return f126778a;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    public NativeRectangularViewfinder createRectangularViewfinder(NativeRectangularViewfinderStyle style, NativeRectangularViewfinderLineStyle lineStyle) {
        Intrinsics.j(style, "style");
        Intrinsics.j(lineStyle, "lineStyle");
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        RectangularViewfinder rectangularViewfinderCreateRectangularViewfinder = this.f127153a.createRectangularViewfinder(coreNativeTypeFactory.convert(style), coreNativeTypeFactory.convert(lineStyle));
        NativeRectangularViewfinder nativeRectangularViewfinder_impl = rectangularViewfinderCreateRectangularViewfinder._impl();
        this.proxyCache.put(Reflection.b(NativeRectangularViewfinder.class), null, nativeRectangularViewfinder_impl, rectangularViewfinderCreateRectangularViewfinder);
        return nativeRectangularViewfinder_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper
    public NativeTargetAimerViewfinder createTargetAimerViewfinder() {
        TargetAimerViewfinder targetAimerViewfinderCreateTargetAimerViewfinder = this.f127153a.createTargetAimerViewfinder();
        NativeTargetAimerViewfinder f127146a = targetAimerViewfinderCreateTargetAimerViewfinder.getF127146a();
        this.proxyCache.put(Reflection.b(NativeTargetAimerViewfinder.class), null, f127146a, targetAimerViewfinderCreateTargetAimerViewfinder);
        return f127146a;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ ViewfinderDeserializerHelperReversedAdapter(ViewfinderDeserializerHelper viewfinderDeserializerHelper, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewfinderDeserializerHelper, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
