package com.radiusnetworks.flybuy.sdk.data.location;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;", "", "(Ljava/lang/String;I)V", "AUTHORIZED_ALWAYS", "AUTHORIZED_WHEN_IN_USE", "AUTHORIZED_ALWAYS_NOT_ENABLED", "AUTHORIZED_WHEN_IN_USE_NOT_ENABLED", "DENIED", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocationPermissionState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocationPermissionState[] $VALUES;
    public static final LocationPermissionState AUTHORIZED_ALWAYS = new LocationPermissionState("AUTHORIZED_ALWAYS", 0);
    public static final LocationPermissionState AUTHORIZED_WHEN_IN_USE = new LocationPermissionState("AUTHORIZED_WHEN_IN_USE", 1);
    public static final LocationPermissionState AUTHORIZED_ALWAYS_NOT_ENABLED = new LocationPermissionState("AUTHORIZED_ALWAYS_NOT_ENABLED", 2);
    public static final LocationPermissionState AUTHORIZED_WHEN_IN_USE_NOT_ENABLED = new LocationPermissionState("AUTHORIZED_WHEN_IN_USE_NOT_ENABLED", 3);
    public static final LocationPermissionState DENIED = new LocationPermissionState("DENIED", 4);

    private static final /* synthetic */ LocationPermissionState[] $values() {
        return new LocationPermissionState[]{AUTHORIZED_ALWAYS, AUTHORIZED_WHEN_IN_USE, AUTHORIZED_ALWAYS_NOT_ENABLED, AUTHORIZED_WHEN_IN_USE_NOT_ENABLED, DENIED};
    }

    public static EnumEntries<LocationPermissionState> getEntries() {
        return $ENTRIES;
    }

    public static LocationPermissionState valueOf(String str) {
        return (LocationPermissionState) Enum.valueOf(LocationPermissionState.class, str);
    }

    public static LocationPermissionState[] values() {
        return (LocationPermissionState[]) $VALUES.clone();
    }

    static {
        LocationPermissionState[] locationPermissionStateArr$values = $values();
        $VALUES = locationPermissionStateArr$values;
        $ENTRIES = EnumEntriesKt.a(locationPermissionStateArr$values);
    }

    private LocationPermissionState(String str, int i10) {
    }
}
