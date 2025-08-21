package com.google.maps.android.compose.streetview;

import Md.C4119l;
import Od.A;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.maps.android.compose.MapNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaPropertiesNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "cameraPositionState", "LMd/l;", "panorama", "Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "eventListeners", "<init>", "(Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;LMd/l;Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;)V", "", "onAttached", "()V", "onRemoved", "onCleared", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "getCameraPositionState", "()Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "LMd/l;", "getPanorama", "()LMd/l;", "Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "getEventListeners", "()Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "setEventListeners", "(Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;)V", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StreetViewPanoramaPropertiesNode implements MapNode {
    public static final int $stable = 8;
    private final StreetViewCameraPositionState cameraPositionState;
    private StreetViewPanoramaEventListeners eventListeners;
    private final C4119l panorama;

    public StreetViewPanoramaPropertiesNode(StreetViewCameraPositionState cameraPositionState, C4119l panorama, StreetViewPanoramaEventListeners eventListeners) {
        Intrinsics.j(cameraPositionState, "cameraPositionState");
        Intrinsics.j(panorama, "panorama");
        Intrinsics.j(eventListeners, "eventListeners");
        this.cameraPositionState = cameraPositionState;
        this.panorama = panorama;
        this.eventListeners = eventListeners;
        cameraPositionState.setPanorama$maps_compose_release(panorama);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$0(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, com.google.android.gms.maps.model.a it) {
        Intrinsics.j(it, "it");
        streetViewPanoramaPropertiesNode.eventListeners.getOnClick().invoke(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$1(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, com.google.android.gms.maps.model.a it) {
        Intrinsics.j(it, "it");
        streetViewPanoramaPropertiesNode.eventListeners.getOnLongClick().invoke(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$2(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, StreetViewPanoramaCamera it) {
        Intrinsics.j(it, "it");
        streetViewPanoramaPropertiesNode.cameraPositionState.setRawPanoramaCamera$maps_compose_release(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$3(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, A it) {
        Intrinsics.j(it, "it");
        streetViewPanoramaPropertiesNode.cameraPositionState.setRawLocation$maps_compose_release(it);
    }

    public final StreetViewCameraPositionState getCameraPositionState() {
        return this.cameraPositionState;
    }

    public final StreetViewPanoramaEventListeners getEventListeners() {
        return this.eventListeners;
    }

    public final C4119l getPanorama() {
        return this.panorama;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        this.cameraPositionState.setPanorama$maps_compose_release(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.cameraPositionState.setPanorama$maps_compose_release(null);
    }

    public final void setEventListeners(StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        Intrinsics.j(streetViewPanoramaEventListeners, "<set-?>");
        this.eventListeners = streetViewPanoramaEventListeners;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        super.onAttached();
        this.panorama.e(new C4119l.c() { // from class: com.google.maps.android.compose.streetview.m
            @Override // Md.C4119l.c
            public final void a(com.google.android.gms.maps.model.a aVar) {
                StreetViewPanoramaPropertiesNode.onAttached$lambda$0(this.f91103a, aVar);
            }
        });
        this.panorama.f(new C4119l.d() { // from class: com.google.maps.android.compose.streetview.n
            @Override // Md.C4119l.d
            public final void a(com.google.android.gms.maps.model.a aVar) {
                StreetViewPanoramaPropertiesNode.onAttached$lambda$1(this.f91104a, aVar);
            }
        });
        this.panorama.c(new C4119l.a() { // from class: com.google.maps.android.compose.streetview.o
            @Override // Md.C4119l.a
            public final void a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                StreetViewPanoramaPropertiesNode.onAttached$lambda$2(this.f91105a, streetViewPanoramaCamera);
            }
        });
        this.panorama.d(new C4119l.b() { // from class: com.google.maps.android.compose.streetview.p
            @Override // Md.C4119l.b
            public final void a(A a10) {
                StreetViewPanoramaPropertiesNode.onAttached$lambda$3(this.f91106a, a10);
            }
        });
    }
}
