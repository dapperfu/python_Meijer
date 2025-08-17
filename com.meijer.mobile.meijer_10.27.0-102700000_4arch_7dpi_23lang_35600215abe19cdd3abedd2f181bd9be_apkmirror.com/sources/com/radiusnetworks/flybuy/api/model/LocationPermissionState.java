package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/LocationPermissionState;", "", "(Ljava/lang/String;I)V", "authorized_always", "authorized_when_in_use", "authorized_always_not_enabled", "authorized_when_in_use_not_enabled", "denied", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocationPermissionState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocationPermissionState[] $VALUES;
    public static final LocationPermissionState authorized_always = new LocationPermissionState("authorized_always", 0);
    public static final LocationPermissionState authorized_when_in_use = new LocationPermissionState("authorized_when_in_use", 1);
    public static final LocationPermissionState authorized_always_not_enabled = new LocationPermissionState("authorized_always_not_enabled", 2);
    public static final LocationPermissionState authorized_when_in_use_not_enabled = new LocationPermissionState("authorized_when_in_use_not_enabled", 3);
    public static final LocationPermissionState denied = new LocationPermissionState("denied", 4);

    private static final /* synthetic */ LocationPermissionState[] $values() {
        return new LocationPermissionState[]{authorized_always, authorized_when_in_use, authorized_always_not_enabled, authorized_when_in_use_not_enabled, denied};
    }

    static {
        LocationPermissionState[] locationPermissionStateArr$values = $values();
        $VALUES = locationPermissionStateArr$values;
        $ENTRIES = EnumEntriesKt.a(locationPermissionStateArr$values);
    }

    private LocationPermissionState(String str, int i10) {
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
}
