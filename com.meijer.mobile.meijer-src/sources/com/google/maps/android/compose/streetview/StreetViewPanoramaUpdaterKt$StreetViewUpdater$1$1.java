package com.google.maps.android.compose.streetview;

import Md.C4119l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1 implements Function0<StreetViewPanoramaPropertiesNode> {
    final /* synthetic */ StreetViewCameraPositionState $cameraPositionState;
    final /* synthetic */ StreetViewPanoramaEventListeners $clickListeners;
    final /* synthetic */ C4119l $streetViewPanorama;

    public StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(StreetViewCameraPositionState streetViewCameraPositionState, C4119l c4119l, StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        this.$cameraPositionState = streetViewCameraPositionState;
        this.$streetViewPanorama = c4119l;
        this.$clickListeners = streetViewPanoramaEventListeners;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final StreetViewPanoramaPropertiesNode invoke() {
        return new StreetViewPanoramaPropertiesNode(this.$cameraPositionState, this.$streetViewPanorama, this.$clickListeners);
    }
}
