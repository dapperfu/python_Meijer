package com.google.maps.android.compose;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016Jj\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006!"}, d2 = {"Lcom/google/maps/android/compose/MapUiSettings;", "", "compassEnabled", "", "indoorLevelPickerEnabled", "mapToolbarEnabled", "myLocationButtonEnabled", "rotationGesturesEnabled", "scrollGesturesEnabled", "scrollGesturesEnabledDuringRotateOrZoom", "tiltGesturesEnabled", "zoomControlsEnabled", "zoomGesturesEnabled", "<init>", "(ZZZZZZZZZZ)V", "getCompassEnabled", "()Z", "getIndoorLevelPickerEnabled", "getMapToolbarEnabled", "getMyLocationButtonEnabled", "getRotationGesturesEnabled", "getScrollGesturesEnabled", "getScrollGesturesEnabledDuringRotateOrZoom", "getTiltGesturesEnabled", "getZoomControlsEnabled", "getZoomGesturesEnabled", "toString", "", "equals", "other", "hashCode", "", "copy", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapUiSettings {
    public static final int $stable = 0;
    private final boolean compassEnabled;
    private final boolean indoorLevelPickerEnabled;
    private final boolean mapToolbarEnabled;
    private final boolean myLocationButtonEnabled;
    private final boolean rotationGesturesEnabled;
    private final boolean scrollGesturesEnabled;
    private final boolean scrollGesturesEnabledDuringRotateOrZoom;
    private final boolean tiltGesturesEnabled;
    private final boolean zoomControlsEnabled;
    private final boolean zoomGesturesEnabled;

    public MapUiSettings() {
        this(false, false, false, false, false, false, false, false, false, false, 1023, null);
    }

    public MapUiSettings(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.compassEnabled = z10;
        this.indoorLevelPickerEnabled = z11;
        this.mapToolbarEnabled = z12;
        this.myLocationButtonEnabled = z13;
        this.rotationGesturesEnabled = z14;
        this.scrollGesturesEnabled = z15;
        this.scrollGesturesEnabledDuringRotateOrZoom = z16;
        this.tiltGesturesEnabled = z17;
        this.zoomControlsEnabled = z18;
        this.zoomGesturesEnabled = z19;
    }

    public static /* synthetic */ MapUiSettings copy$default(MapUiSettings mapUiSettings, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = mapUiSettings.compassEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = mapUiSettings.indoorLevelPickerEnabled;
        }
        if ((i10 & 4) != 0) {
            z12 = mapUiSettings.mapToolbarEnabled;
        }
        if ((i10 & 8) != 0) {
            z13 = mapUiSettings.myLocationButtonEnabled;
        }
        if ((i10 & 16) != 0) {
            z14 = mapUiSettings.rotationGesturesEnabled;
        }
        if ((i10 & 32) != 0) {
            z15 = mapUiSettings.scrollGesturesEnabled;
        }
        if ((i10 & 64) != 0) {
            z16 = mapUiSettings.scrollGesturesEnabledDuringRotateOrZoom;
        }
        if ((i10 & 128) != 0) {
            z17 = mapUiSettings.tiltGesturesEnabled;
        }
        if ((i10 & 256) != 0) {
            z18 = mapUiSettings.zoomControlsEnabled;
        }
        if ((i10 & 512) != 0) {
            z19 = mapUiSettings.zoomGesturesEnabled;
        }
        boolean z20 = z18;
        boolean z21 = z19;
        boolean z22 = z16;
        boolean z23 = z17;
        boolean z24 = z14;
        boolean z25 = z15;
        return mapUiSettings.copy(z10, z11, z12, z13, z24, z25, z22, z23, z20, z21);
    }

    public final MapUiSettings copy(boolean compassEnabled, boolean indoorLevelPickerEnabled, boolean mapToolbarEnabled, boolean myLocationButtonEnabled, boolean rotationGesturesEnabled, boolean scrollGesturesEnabled, boolean scrollGesturesEnabledDuringRotateOrZoom, boolean tiltGesturesEnabled, boolean zoomControlsEnabled, boolean zoomGesturesEnabled) {
        return new MapUiSettings(compassEnabled, indoorLevelPickerEnabled, mapToolbarEnabled, myLocationButtonEnabled, rotationGesturesEnabled, scrollGesturesEnabled, scrollGesturesEnabledDuringRotateOrZoom, tiltGesturesEnabled, zoomControlsEnabled, zoomGesturesEnabled);
    }

    public boolean equals(Object other) {
        if (!(other instanceof MapUiSettings)) {
            return false;
        }
        MapUiSettings mapUiSettings = (MapUiSettings) other;
        return this.compassEnabled == mapUiSettings.compassEnabled && this.indoorLevelPickerEnabled == mapUiSettings.indoorLevelPickerEnabled && this.mapToolbarEnabled == mapUiSettings.mapToolbarEnabled && this.myLocationButtonEnabled == mapUiSettings.myLocationButtonEnabled && this.rotationGesturesEnabled == mapUiSettings.rotationGesturesEnabled && this.scrollGesturesEnabled == mapUiSettings.scrollGesturesEnabled && this.scrollGesturesEnabledDuringRotateOrZoom == mapUiSettings.scrollGesturesEnabledDuringRotateOrZoom && this.tiltGesturesEnabled == mapUiSettings.tiltGesturesEnabled && this.zoomControlsEnabled == mapUiSettings.zoomControlsEnabled && this.zoomGesturesEnabled == mapUiSettings.zoomGesturesEnabled;
    }

    public final boolean getCompassEnabled() {
        return this.compassEnabled;
    }

    public final boolean getIndoorLevelPickerEnabled() {
        return this.indoorLevelPickerEnabled;
    }

    public final boolean getMapToolbarEnabled() {
        return this.mapToolbarEnabled;
    }

    public final boolean getMyLocationButtonEnabled() {
        return this.myLocationButtonEnabled;
    }

    public final boolean getRotationGesturesEnabled() {
        return this.rotationGesturesEnabled;
    }

    public final boolean getScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    public final boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.scrollGesturesEnabledDuringRotateOrZoom;
    }

    public final boolean getTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    public final boolean getZoomControlsEnabled() {
        return this.zoomControlsEnabled;
    }

    public final boolean getZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.compassEnabled), Boolean.valueOf(this.indoorLevelPickerEnabled), Boolean.valueOf(this.mapToolbarEnabled), Boolean.valueOf(this.myLocationButtonEnabled), Boolean.valueOf(this.rotationGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabledDuringRotateOrZoom), Boolean.valueOf(this.tiltGesturesEnabled), Boolean.valueOf(this.zoomControlsEnabled), Boolean.valueOf(this.zoomGesturesEnabled));
    }

    public String toString() {
        return "MapUiSettings(compassEnabled=" + this.compassEnabled + ", indoorLevelPickerEnabled=" + this.indoorLevelPickerEnabled + ", mapToolbarEnabled=" + this.mapToolbarEnabled + ", myLocationButtonEnabled=" + this.myLocationButtonEnabled + ", rotationGesturesEnabled=" + this.rotationGesturesEnabled + ", scrollGesturesEnabled=" + this.scrollGesturesEnabled + ", scrollGesturesEnabledDuringRotateOrZoom=" + this.scrollGesturesEnabledDuringRotateOrZoom + ", tiltGesturesEnabled=" + this.tiltGesturesEnabled + ", zoomControlsEnabled=" + this.zoomControlsEnabled + ", zoomGesturesEnabled=" + this.zoomGesturesEnabled + ')';
    }

    public /* synthetic */ MapUiSettings(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13, (i10 & 16) != 0 ? true : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? true : z16, (i10 & 128) != 0 ? true : z17, (i10 & 256) != 0 ? true : z18, (i10 & 512) != 0 ? true : z19);
    }
}
