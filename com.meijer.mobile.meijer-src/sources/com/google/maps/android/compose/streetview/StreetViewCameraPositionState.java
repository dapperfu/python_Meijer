package com.google.maps.android.compose.streetview;

import Md.C4119l;
import Od.A;
import Od.B;
import Od.C4477z;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010&\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0011\u0010/\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00061"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "camera", "", "durationMs", "", "animateTo", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;I)V", "Lcom/google/android/gms/maps/model/LatLng;", "position", "radius", "LOd/B;", "source", "setPosition", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Integer;LOd/B;)V", "", "panoId", "(Ljava/lang/String;)V", "LOd/A;", "<set-?>", "rawLocation$delegate", "Landroidx/compose/runtime/l0;", "getRawLocation$maps_compose_release", "()LOd/A;", "setRawLocation$maps_compose_release", "(LOd/A;)V", "rawLocation", "rawPanoramaCamera$delegate", "getRawPanoramaCamera$maps_compose_release", "()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "setRawPanoramaCamera$maps_compose_release", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)V", "rawPanoramaCamera", "LMd/l;", "value", "panorama", "LMd/l;", "getPanorama$maps_compose_release", "()LMd/l;", "setPanorama$maps_compose_release", "(LMd/l;)V", "getLocation", "location", "getPanoramaCamera", "panoramaCamera", "Companion", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class StreetViewCameraPositionState {
    private C4119l panorama;

    /* renamed from: rawLocation$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 rawLocation;

    /* renamed from: rawPanoramaCamera$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 rawPanoramaCamera;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087\u0002¨\u0006\u0006"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState$Companion;", "", "<init>", "()V", "invoke", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StreetViewCameraPositionState invoke() {
            return new StreetViewCameraPositionState(null);
        }
    }

    public /* synthetic */ StreetViewCameraPositionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void setPosition(LatLng position, Integer radius, B source) {
        Intrinsics.j(position, "position");
        if (radius != null && source != null) {
            C4119l c4119l = this.panorama;
            if (c4119l != null) {
                c4119l.j(position, radius.intValue(), source);
                return;
            }
            return;
        }
        if (radius != null) {
            C4119l c4119l2 = this.panorama;
            if (c4119l2 != null) {
                c4119l2.i(position, radius.intValue());
                return;
            }
            return;
        }
        C4119l c4119l3 = this.panorama;
        if (c4119l3 != null) {
            c4119l3.h(position);
        }
    }

    private StreetViewCameraPositionState() {
        this.rawLocation = t1.e(new A(new C4477z[0], new LatLng(0.0d, 0.0d), ""), null, 2, null);
        this.rawPanoramaCamera = t1.e(new StreetViewPanoramaCamera(0.0f, 0.0f, 0.0f), null, 2, null);
    }

    public static /* synthetic */ void setPosition$default(StreetViewCameraPositionState streetViewCameraPositionState, LatLng latLng, Integer num, B b10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            b10 = null;
        }
        streetViewCameraPositionState.setPosition(latLng, num, b10);
    }

    public final void animateTo(StreetViewPanoramaCamera camera, int durationMs) {
        Intrinsics.j(camera, "camera");
        C4119l c4119l = this.panorama;
        if (c4119l != null) {
            c4119l.a(camera, durationMs);
        }
    }

    /* renamed from: getPanorama$maps_compose_release, reason: from getter */
    public final C4119l getPanorama() {
        return this.panorama;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final A getRawLocation$maps_compose_release() {
        return (A) this.rawLocation.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StreetViewPanoramaCamera getRawPanoramaCamera$maps_compose_release() {
        return (StreetViewPanoramaCamera) this.rawPanoramaCamera.getValue();
    }

    public final void setPanorama$maps_compose_release(C4119l c4119l) {
        C4119l c4119l2 = this.panorama;
        if (c4119l2 == null && c4119l == null) {
            return;
        }
        if (c4119l2 != null && c4119l != null) {
            throw new IllegalStateException("StreetViewCameraPositionState may only be associated with one StreetView at a time.");
        }
        this.panorama = c4119l;
    }

    public final void setRawLocation$maps_compose_release(A a10) {
        Intrinsics.j(a10, "<set-?>");
        this.rawLocation.setValue(a10);
    }

    public final void setRawPanoramaCamera$maps_compose_release(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        Intrinsics.j(streetViewPanoramaCamera, "<set-?>");
        this.rawPanoramaCamera.setValue(streetViewPanoramaCamera);
    }

    public final A getLocation() {
        return getRawLocation$maps_compose_release();
    }

    public final StreetViewPanoramaCamera getPanoramaCamera() {
        return getRawPanoramaCamera$maps_compose_release();
    }

    public final void setPosition(String panoId) {
        Intrinsics.j(panoId, "panoId");
        C4119l c4119l = this.panorama;
        if (c4119l != null) {
            c4119l.k(panoId);
        }
    }
}
