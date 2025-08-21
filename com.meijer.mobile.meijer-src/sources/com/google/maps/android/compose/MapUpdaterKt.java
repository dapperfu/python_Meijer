package com.google.maps.android.compose;

import Md.C4110c;
import android.annotation.SuppressLint;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.C6034t0;
import com.google.android.gms.maps.MapView;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0081\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/maps/android/compose/MapUpdaterState;", "mapUpdaterState", "", "MapUpdater", "(Lcom/google/maps/android/compose/MapUpdaterState;Landroidx/compose/runtime/Composer;I)V", "Lcom/google/maps/android/compose/MapPropertiesNode;", "LMd/c;", "map", "Lj0/C;", "contentPadding", "applyContentPadding", "(Lcom/google/maps/android/compose/MapPropertiesNode;LMd/c;Lj0/C;)V", "DefaultMapContentPadding", "Lj0/C;", "getDefaultMapContentPadding", "()Lj0/C;", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapUpdaterKt {
    private static final InterfaceC14882C DefaultMapContentPadding = androidx.compose.foundation.layout.D.c(0.0f, 0.0f, 3, null);

    @SuppressLint({"MissingPermission"})
    public static final void MapUpdater(MapUpdaterState mapUpdaterState, Composer composer, int i10) {
        Intrinsics.j(mapUpdaterState, "mapUpdaterState");
        composer.startReplaceGroup(-1929095045);
        Applier<?> applierK = composer.k();
        Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
        C4110c map = ((MapApplier) applierK).getMap();
        Applier<?> applierK2 = composer.k();
        Intrinsics.h(applierK2, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
        MapView mapView$maps_compose_release = ((MapApplier) applierK2).getMapView();
        if (mapUpdaterState.getMergeDescendants()) {
            mapView$maps_compose_release.setImportantForAccessibility(4);
        }
        H1.d dVar = (H1.d) composer.o(C6034t0.g());
        H1.t tVar = (H1.t) composer.o(C6034t0.m());
        boolean zV = composer.V(mapUpdaterState) | composer.D(map) | composer.V(dVar) | composer.d(tVar.ordinal());
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new MapUpdaterKt$MapUpdater$1$1$1(mapUpdaterState, map, dVar, tVar);
            composer.t(objB);
        }
        Function0 function0 = (Function0) objB;
        if (!(composer.k() instanceof MapApplier)) {
            C5859f.c();
        }
        composer.m();
        if (composer.h()) {
            composer.I(function0);
        } else {
            composer.s();
        }
        Composer composerA = androidx.compose.runtime.D1.a(composer);
        androidx.compose.runtime.D1.d(composerA, dVar, MapUpdaterKt$MapUpdater$1$2$1.INSTANCE);
        androidx.compose.runtime.D1.d(composerA, tVar, MapUpdaterKt$MapUpdater$1$2$2.INSTANCE);
        androidx.compose.runtime.D1.d(composerA, mapUpdaterState.getContentDescription(), MapUpdaterKt$MapUpdater$1$2$3.INSTANCE);
        androidx.compose.runtime.D1.d(composerA, mapUpdaterState.getContentPadding(), new MapUpdaterKt$MapUpdater$1$2$4(map));
        androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getLocationSource(), new MapUpdaterKt$MapUpdater$1$2$5(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapProperties().getIsBuildingEnabled()), new MapUpdaterKt$MapUpdater$1$2$6(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapProperties().getIsIndoorEnabled()), new MapUpdaterKt$MapUpdater$1$2$7(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapProperties().getIsMyLocationEnabled()), new MapUpdaterKt$MapUpdater$1$2$8(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapProperties().getIsTrafficEnabled()), new MapUpdaterKt$MapUpdater$1$2$9(map));
        androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getMapProperties().getLatLngBoundsForCameraTarget(), new MapUpdaterKt$MapUpdater$1$2$10(map));
        androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getMapProperties().getMapStyleOptions(), new MapUpdaterKt$MapUpdater$1$2$11(map));
        androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getMapProperties().getMapType(), new MapUpdaterKt$MapUpdater$1$2$12(map));
        androidx.compose.runtime.D1.c(composerA, Float.valueOf(mapUpdaterState.getMapProperties().getMaxZoomPreference()), new MapUpdaterKt$MapUpdater$1$2$13(map));
        androidx.compose.runtime.D1.c(composerA, Float.valueOf(mapUpdaterState.getMapProperties().getMinZoomPreference()), new MapUpdaterKt$MapUpdater$1$2$14(map));
        androidx.compose.runtime.D1.c(composerA, mapUpdaterState.getMapColorScheme(), new MapUpdaterKt$MapUpdater$1$2$15(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getCompassEnabled()), new MapUpdaterKt$MapUpdater$1$2$16(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getIndoorLevelPickerEnabled()), new MapUpdaterKt$MapUpdater$1$2$17(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMapToolbarEnabled()), new MapUpdaterKt$MapUpdater$1$2$18(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMyLocationButtonEnabled()), new MapUpdaterKt$MapUpdater$1$2$19(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getRotationGesturesEnabled()), new MapUpdaterKt$MapUpdater$1$2$20(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabled()), new MapUpdaterKt$MapUpdater$1$2$21(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabledDuringRotateOrZoom()), new MapUpdaterKt$MapUpdater$1$2$22(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getTiltGesturesEnabled()), new MapUpdaterKt$MapUpdater$1$2$23(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomControlsEnabled()), new MapUpdaterKt$MapUpdater$1$2$24(map));
        androidx.compose.runtime.D1.c(composerA, Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomGesturesEnabled()), new MapUpdaterKt$MapUpdater$1$2$25(map));
        androidx.compose.runtime.D1.d(composerA, mapUpdaterState.getCameraPositionState(), MapUpdaterKt$MapUpdater$1$2$26.INSTANCE);
        composer.v();
        composer.P();
    }

    public static final InterfaceC14882C getDefaultMapContentPadding() {
        return DefaultMapContentPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyContentPadding(MapPropertiesNode mapPropertiesNode, C4110c c4110c, InterfaceC14882C interfaceC14882C) {
        H1.d density = mapPropertiesNode.getDensity();
        c4110c.T(density.E0(interfaceC14882C.b(mapPropertiesNode.getLayoutDirection())), density.E0(interfaceC14882C.getTop()), density.E0(interfaceC14882C.c(mapPropertiesNode.getLayoutDirection())), density.E0(interfaceC14882C.getBottom()));
    }
}
