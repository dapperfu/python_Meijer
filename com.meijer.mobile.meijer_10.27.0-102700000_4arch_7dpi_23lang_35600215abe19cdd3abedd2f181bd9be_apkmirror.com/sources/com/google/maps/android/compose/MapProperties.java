package com.google.maps.android.compose;

import Md.C4187m;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJk\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u0004\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u0005\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lcom/google/maps/android/compose/MapProperties;", "", "", "isBuildingEnabled", "isIndoorEnabled", "isMyLocationEnabled", "isTrafficEnabled", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBoundsForCameraTarget", "LMd/m;", "mapStyleOptions", "Lcom/google/maps/android/compose/MapType;", "mapType", "", "maxZoomPreference", "minZoomPreference", "<init>", "(ZZZZLcom/google/android/gms/maps/model/LatLngBounds;LMd/m;Lcom/google/maps/android/compose/MapType;FF)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "copy", "(ZZZZLcom/google/android/gms/maps/model/LatLngBounds;LMd/m;Lcom/google/maps/android/compose/MapType;FF)Lcom/google/maps/android/compose/MapProperties;", "Z", "()Z", "Lcom/google/android/gms/maps/model/LatLngBounds;", "getLatLngBoundsForCameraTarget", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "LMd/m;", "getMapStyleOptions", "()LMd/m;", "Lcom/google/maps/android/compose/MapType;", "getMapType", "()Lcom/google/maps/android/compose/MapType;", "F", "getMaxZoomPreference", "()F", "getMinZoomPreference", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapProperties {
    public static final int $stable = 0;
    private final boolean isBuildingEnabled;
    private final boolean isIndoorEnabled;
    private final boolean isMyLocationEnabled;
    private final boolean isTrafficEnabled;
    private final LatLngBounds latLngBoundsForCameraTarget;
    private final C4187m mapStyleOptions;
    private final MapType mapType;
    private final float maxZoomPreference;
    private final float minZoomPreference;

    public MapProperties() {
        this(false, false, false, false, null, null, null, 0.0f, 0.0f, 511, null);
    }

    public MapProperties(boolean z10, boolean z11, boolean z12, boolean z13, LatLngBounds latLngBounds, C4187m c4187m, MapType mapType, float f10, float f11) {
        Intrinsics.j(mapType, "mapType");
        this.isBuildingEnabled = z10;
        this.isIndoorEnabled = z11;
        this.isMyLocationEnabled = z12;
        this.isTrafficEnabled = z13;
        this.latLngBoundsForCameraTarget = latLngBounds;
        this.mapStyleOptions = c4187m;
        this.mapType = mapType;
        this.maxZoomPreference = f10;
        this.minZoomPreference = f11;
    }

    public static /* synthetic */ MapProperties copy$default(MapProperties mapProperties, boolean z10, boolean z11, boolean z12, boolean z13, LatLngBounds latLngBounds, C4187m c4187m, MapType mapType, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = mapProperties.isBuildingEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = mapProperties.isIndoorEnabled;
        }
        if ((i10 & 4) != 0) {
            z12 = mapProperties.isMyLocationEnabled;
        }
        if ((i10 & 8) != 0) {
            z13 = mapProperties.isTrafficEnabled;
        }
        if ((i10 & 16) != 0) {
            latLngBounds = mapProperties.latLngBoundsForCameraTarget;
        }
        if ((i10 & 32) != 0) {
            c4187m = mapProperties.mapStyleOptions;
        }
        if ((i10 & 64) != 0) {
            mapType = mapProperties.mapType;
        }
        if ((i10 & 128) != 0) {
            f10 = mapProperties.maxZoomPreference;
        }
        if ((i10 & 256) != 0) {
            f11 = mapProperties.minZoomPreference;
        }
        float f12 = f10;
        float f13 = f11;
        C4187m c4187m2 = c4187m;
        MapType mapType2 = mapType;
        LatLngBounds latLngBounds2 = latLngBounds;
        boolean z14 = z12;
        return mapProperties.copy(z10, z11, z14, z13, latLngBounds2, c4187m2, mapType2, f12, f13);
    }

    public final MapProperties copy(boolean isBuildingEnabled, boolean isIndoorEnabled, boolean isMyLocationEnabled, boolean isTrafficEnabled, LatLngBounds latLngBoundsForCameraTarget, C4187m mapStyleOptions, MapType mapType, float maxZoomPreference, float minZoomPreference) {
        Intrinsics.j(mapType, "mapType");
        return new MapProperties(isBuildingEnabled, isIndoorEnabled, isMyLocationEnabled, isTrafficEnabled, latLngBoundsForCameraTarget, mapStyleOptions, mapType, maxZoomPreference, minZoomPreference);
    }

    public boolean equals(Object other) {
        if (!(other instanceof MapProperties)) {
            return false;
        }
        MapProperties mapProperties = (MapProperties) other;
        return this.isBuildingEnabled == mapProperties.isBuildingEnabled && this.isIndoorEnabled == mapProperties.isIndoorEnabled && this.isMyLocationEnabled == mapProperties.isMyLocationEnabled && this.isTrafficEnabled == mapProperties.isTrafficEnabled && Intrinsics.e(this.latLngBoundsForCameraTarget, mapProperties.latLngBoundsForCameraTarget) && Intrinsics.e(this.mapStyleOptions, mapProperties.mapStyleOptions) && this.mapType == mapProperties.mapType && this.maxZoomPreference == mapProperties.maxZoomPreference && this.minZoomPreference == mapProperties.minZoomPreference;
    }

    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.latLngBoundsForCameraTarget;
    }

    public final C4187m getMapStyleOptions() {
        return this.mapStyleOptions;
    }

    public final MapType getMapType() {
        return this.mapType;
    }

    public final float getMaxZoomPreference() {
        return this.maxZoomPreference;
    }

    public final float getMinZoomPreference() {
        return this.minZoomPreference;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isBuildingEnabled), Boolean.valueOf(this.isIndoorEnabled), Boolean.valueOf(this.isMyLocationEnabled), Boolean.valueOf(this.isTrafficEnabled), this.latLngBoundsForCameraTarget, this.mapStyleOptions, this.mapType, Float.valueOf(this.maxZoomPreference), Float.valueOf(this.minZoomPreference));
    }

    /* renamed from: isBuildingEnabled, reason: from getter */
    public final boolean getIsBuildingEnabled() {
        return this.isBuildingEnabled;
    }

    /* renamed from: isIndoorEnabled, reason: from getter */
    public final boolean getIsIndoorEnabled() {
        return this.isIndoorEnabled;
    }

    /* renamed from: isMyLocationEnabled, reason: from getter */
    public final boolean getIsMyLocationEnabled() {
        return this.isMyLocationEnabled;
    }

    /* renamed from: isTrafficEnabled, reason: from getter */
    public final boolean getIsTrafficEnabled() {
        return this.isTrafficEnabled;
    }

    public String toString() {
        return "MapProperties(isBuildingEnabled=" + this.isBuildingEnabled + ", isIndoorEnabled=" + this.isIndoorEnabled + ", isMyLocationEnabled=" + this.isMyLocationEnabled + ", isTrafficEnabled=" + this.isTrafficEnabled + ", latLngBoundsForCameraTarget=" + this.latLngBoundsForCameraTarget + ", mapStyleOptions=" + this.mapStyleOptions + ", mapType=" + this.mapType + ", maxZoomPreference=" + this.maxZoomPreference + ", minZoomPreference=" + this.minZoomPreference + ')';
    }

    public /* synthetic */ MapProperties(boolean z10, boolean z11, boolean z12, boolean z13, LatLngBounds latLngBounds, C4187m c4187m, MapType mapType, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? null : latLngBounds, (i10 & 32) != 0 ? null : c4187m, (i10 & 64) != 0 ? MapType.NORMAL : mapType, (i10 & 128) != 0 ? 21.0f : f10, (i10 & 256) != 0 ? 3.0f : f11);
    }
}
