package com.google.maps.android.compose;

import Md.C4110c;
import com.google.android.gms.maps.model.CameraPosition;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/google/maps/android/compose/MapPropertiesNode;", "Lcom/google/maps/android/compose/MapNode;", "LMd/c;", "map", "Lcom/google/maps/android/compose/CameraPositionState;", "cameraPositionState", "", "contentDescription", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Lj0/C;", "contentPadding", "<init>", "(LMd/c;Lcom/google/maps/android/compose/CameraPositionState;Ljava/lang/String;LH1/d;LH1/t;Lj0/C;)V", "", "onAttached", "()V", "onRemoved", "onCleared", "LMd/c;", "getMap", "()LMd/c;", "LH1/d;", "getDensity", "()LH1/d;", "setDensity", "(LH1/d;)V", "LH1/t;", "getLayoutDirection", "()LH1/t;", "setLayoutDirection", "(LH1/t;)V", "value", "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "setContentDescription", "(Ljava/lang/String;)V", "Lcom/google/maps/android/compose/CameraPositionState;", "getCameraPositionState", "()Lcom/google/maps/android/compose/CameraPositionState;", "setCameraPositionState", "(Lcom/google/maps/android/compose/CameraPositionState;)V", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapPropertiesNode implements MapNode {
    public static final int $stable = 8;
    private CameraPositionState cameraPositionState;
    private String contentDescription;
    private H1.d density;
    private H1.t layoutDirection;
    private final C4110c map;

    public MapPropertiesNode(C4110c map, CameraPositionState cameraPositionState, String str, H1.d density, H1.t layoutDirection, InterfaceC14882C contentPadding) {
        Intrinsics.j(map, "map");
        Intrinsics.j(cameraPositionState, "cameraPositionState");
        Intrinsics.j(density, "density");
        Intrinsics.j(layoutDirection, "layoutDirection");
        Intrinsics.j(contentPadding, "contentPadding");
        this.map = map;
        this.density = density;
        this.layoutDirection = layoutDirection;
        MapUpdaterKt.applyContentPadding(this, map, contentPadding);
        cameraPositionState.setMap$maps_compose_release(map);
        if (str != null) {
            map.o(str);
        }
        this.contentDescription = str;
        this.cameraPositionState = cameraPositionState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$0(MapPropertiesNode mapPropertiesNode) {
        mapPropertiesNode.cameraPositionState.setMoving$maps_compose_release(false);
        CameraPositionState cameraPositionState = mapPropertiesNode.cameraPositionState;
        CameraPosition cameraPositionJ = mapPropertiesNode.map.j();
        Intrinsics.i(cameraPositionJ, "getCameraPosition(...)");
        cameraPositionState.setRawPosition$maps_compose_release(cameraPositionJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$1(MapPropertiesNode mapPropertiesNode) {
        mapPropertiesNode.cameraPositionState.setMoving$maps_compose_release(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$2(MapPropertiesNode mapPropertiesNode, int i10) {
        mapPropertiesNode.cameraPositionState.setCameraMoveStartedReason$maps_compose_release(CameraMoveStartedReason.INSTANCE.fromInt(i10));
        mapPropertiesNode.cameraPositionState.setMoving$maps_compose_release(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$3(MapPropertiesNode mapPropertiesNode) {
        CameraPositionState cameraPositionState = mapPropertiesNode.cameraPositionState;
        CameraPosition cameraPositionJ = mapPropertiesNode.map.j();
        Intrinsics.i(cameraPositionJ, "getCameraPosition(...)");
        cameraPositionState.setRawPosition$maps_compose_release(cameraPositionJ);
    }

    public final CameraPositionState getCameraPositionState() {
        return this.cameraPositionState;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final H1.d getDensity() {
        return this.density;
    }

    public final H1.t getLayoutDirection() {
        return this.layoutDirection;
    }

    public final C4110c getMap() {
        return this.map;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        this.map.z(new C4110c.InterfaceC0346c() { // from class: com.google.maps.android.compose.F0
            @Override // Md.C4110c.InterfaceC0346c
            public final void onCameraIdle() {
                MapPropertiesNode.onAttached$lambda$0(this.f90694a);
            }
        });
        this.map.A(new C4110c.d() { // from class: com.google.maps.android.compose.G0
            @Override // Md.C4110c.d
            public final void a() {
                MapPropertiesNode.onAttached$lambda$1(this.f90695a);
            }
        });
        this.map.C(new C4110c.f() { // from class: com.google.maps.android.compose.H0
            @Override // Md.C4110c.f
            public final void a(int i10) {
                MapPropertiesNode.onAttached$lambda$2(this.f90696a, i10);
            }
        });
        this.map.B(new C4110c.e() { // from class: com.google.maps.android.compose.I0
            @Override // Md.C4110c.e
            public final void a() {
                MapPropertiesNode.onAttached$lambda$3(this.f90697a);
            }
        });
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }

    public final void setCameraPositionState(CameraPositionState value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.cameraPositionState)) {
            return;
        }
        this.cameraPositionState.setMap$maps_compose_release(null);
        this.cameraPositionState = value;
        value.setMap$maps_compose_release(this.map);
    }

    public final void setContentDescription(String str) {
        this.contentDescription = str;
        this.map.o(str);
    }

    public final void setDensity(H1.d dVar) {
        Intrinsics.j(dVar, "<set-?>");
        this.density = dVar;
    }

    public final void setLayoutDirection(H1.t tVar) {
        Intrinsics.j(tVar, "<set-?>");
        this.layoutDirection = tVar;
    }
}
