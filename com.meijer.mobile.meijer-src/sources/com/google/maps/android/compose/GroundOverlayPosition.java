package com.google.maps.android.compose;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B9\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/google/maps/android/compose/GroundOverlayPosition;", "", "latLngBounds", "Lcom/google/android/gms/maps/model/LatLngBounds;", "location", "Lcom/google/android/gms/maps/model/LatLng;", "width", "", "height", "<init>", "(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Float;Ljava/lang/Float;)V", "getLatLngBounds", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "getLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "getWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHeight", "Companion", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GroundOverlayPosition {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Float height;
    private final LatLngBounds latLngBounds;
    private final LatLng location;
    private final Float width;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/GroundOverlayPosition$Companion;", "", "<init>", "()V", "create", "Lcom/google/maps/android/compose/GroundOverlayPosition;", "latLngBounds", "Lcom/google/android/gms/maps/model/LatLngBounds;", "location", "Lcom/google/android/gms/maps/model/LatLng;", "width", "", "height", "(Lcom/google/android/gms/maps/model/LatLng;FLjava/lang/Float;)Lcom/google/maps/android/compose/GroundOverlayPosition;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GroundOverlayPosition create(LatLngBounds latLngBounds) {
            Intrinsics.j(latLngBounds, "latLngBounds");
            return new GroundOverlayPosition(latLngBounds, null, null, null, 14, null);
        }

        private Companion() {
        }

        public static /* synthetic */ GroundOverlayPosition create$default(Companion companion, LatLng latLng, float f10, Float f11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                f11 = null;
            }
            return companion.create(latLng, f10, f11);
        }

        public final GroundOverlayPosition create(LatLng location, float width, Float height) {
            Intrinsics.j(location, "location");
            return new GroundOverlayPosition(null, location, Float.valueOf(width), height, 1, null);
        }
    }

    private GroundOverlayPosition(LatLngBounds latLngBounds, LatLng latLng, Float f10, Float f11) {
        this.latLngBounds = latLngBounds;
        this.location = latLng;
        this.width = f10;
        this.height = f11;
    }

    public final Float getHeight() {
        return this.height;
    }

    public final LatLngBounds getLatLngBounds() {
        return this.latLngBounds;
    }

    public final LatLng getLocation() {
        return this.location;
    }

    public final Float getWidth() {
        return this.width;
    }

    /* synthetic */ GroundOverlayPosition(LatLngBounds latLngBounds, LatLng latLng, Float f10, Float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : latLngBounds, (i10 & 2) != 0 ? null : latLng, (i10 & 4) != 0 ? null : f10, (i10 & 8) != 0 ? null : f11);
    }
}
