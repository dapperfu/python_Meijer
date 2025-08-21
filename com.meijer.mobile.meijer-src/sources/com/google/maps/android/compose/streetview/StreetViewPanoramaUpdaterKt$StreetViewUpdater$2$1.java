package com.google.maps.android.compose.streetview;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1 implements Function2<StreetViewPanoramaPropertiesNode, Boolean, Unit> {
    final /* synthetic */ boolean $isPanningGesturesEnabled;

    public StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1(boolean z10) {
        this.$isPanningGesturesEnabled = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, Boolean bool) {
        invoke(streetViewPanoramaPropertiesNode, bool.booleanValue());
        return Unit.f143329a;
    }

    public final void invoke(StreetViewPanoramaPropertiesNode set, boolean z10) {
        Intrinsics.j(set, "$this$set");
        set.getPanorama().g(this.$isPanningGesturesEnabled);
    }
}
