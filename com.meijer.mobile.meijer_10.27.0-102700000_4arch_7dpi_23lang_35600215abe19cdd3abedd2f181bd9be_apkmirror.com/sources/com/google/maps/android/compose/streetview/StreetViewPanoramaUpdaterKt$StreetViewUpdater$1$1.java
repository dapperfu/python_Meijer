package com.google.maps.android.compose.streetview;

import Kd.C3954l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1 implements Function0<StreetViewPanoramaPropertiesNode> {
    final /* synthetic */ StreetViewCameraPositionState $cameraPositionState;
    final /* synthetic */ StreetViewPanoramaEventListeners $clickListeners;
    final /* synthetic */ C3954l $streetViewPanorama;

    public StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(StreetViewCameraPositionState streetViewCameraPositionState, C3954l c3954l, StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        this.$cameraPositionState = streetViewCameraPositionState;
        this.$streetViewPanorama = c3954l;
        this.$clickListeners = streetViewPanoramaEventListeners;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final StreetViewPanoramaPropertiesNode invoke() {
        return new StreetViewPanoramaPropertiesNode(this.$cameraPositionState, this.$streetViewPanorama, this.$clickListeners);
    }
}
