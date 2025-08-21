package com.google.maps.android.compose.streetview;

import Md.C4119l;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.D1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0081\b¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"StreetViewUpdater", "", "cameraPositionState", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "isPanningGesturesEnabled", "", "isStreetNamesEnabled", "isUserNavigationEnabled", "isZoomGesturesEnabled", "clickListeners", "Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "(Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;ZZZZLcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;Landroidx/compose/runtime/Composer;I)V", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class StreetViewPanoramaUpdaterKt {
    public static final void StreetViewUpdater(StreetViewCameraPositionState cameraPositionState, boolean z10, boolean z11, boolean z12, boolean z13, StreetViewPanoramaEventListeners clickListeners, Composer composer, int i10) {
        Intrinsics.j(cameraPositionState, "cameraPositionState");
        Intrinsics.j(clickListeners, "clickListeners");
        Applier<?> applierK = composer.k();
        Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.streetview.StreetViewPanoramaApplier");
        C4119l streetViewPanorama = ((StreetViewPanoramaApplier) applierK).getStreetViewPanorama();
        boolean zD = ((((458752 & i10) ^ 196608) > 131072 && composer.V(clickListeners)) || (i10 & 196608) == 131072) | composer.D(cameraPositionState) | composer.D(streetViewPanorama);
        Object objB = composer.B();
        if (zD || objB == Composer.INSTANCE.a()) {
            objB = new StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(cameraPositionState, streetViewPanorama, clickListeners);
            composer.t(objB);
        }
        Function0 function0 = (Function0) objB;
        if (!(composer.k() instanceof StreetViewPanoramaApplier)) {
            C5859f.c();
        }
        composer.m();
        if (composer.h()) {
            composer.I(function0);
        } else {
            composer.s();
        }
        Composer composerA = D1.a(composer);
        D1.c(composerA, Boolean.valueOf(z10), new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1(z10));
        D1.c(composerA, Boolean.valueOf(z11), new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$2(z11));
        D1.c(composerA, Boolean.valueOf(z12), new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3(z12));
        D1.c(composerA, Boolean.valueOf(z13), new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$4(z13));
        D1.c(composerA, clickListeners, StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5.INSTANCE);
        composer.v();
    }
}
