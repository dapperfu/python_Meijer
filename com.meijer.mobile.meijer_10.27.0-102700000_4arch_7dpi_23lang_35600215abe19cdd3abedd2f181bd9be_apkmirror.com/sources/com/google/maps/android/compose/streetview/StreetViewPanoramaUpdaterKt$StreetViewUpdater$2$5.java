package com.google.maps.android.compose.streetview;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5 implements Function2<StreetViewPanoramaPropertiesNode, StreetViewPanoramaEventListeners, Unit> {
    public static final StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5 INSTANCE = new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5();

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        invoke2(streetViewPanoramaPropertiesNode, streetViewPanoramaEventListeners);
        return Unit.f142422a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StreetViewPanoramaPropertiesNode set, StreetViewPanoramaEventListeners it) {
        Intrinsics.j(set, "$this$set");
        Intrinsics.j(it, "it");
        set.setEventListeners(it);
    }
}
