package com.radiusnetworks.flybuy.sdk.data.location;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"isLocationTrackingAllowed", "", "Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;", "toApiLocationPermissionState", "Lcom/radiusnetworks/flybuy/api/model/LocationPermissionState;", "toLocationPermissionState", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocationPermissionStateKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LocationPermissionState.values().length];
            try {
                iArr[LocationPermissionState.AUTHORIZED_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationPermissionState.AUTHORIZED_WHEN_IN_USE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocationPermissionState.AUTHORIZED_ALWAYS_NOT_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocationPermissionState.AUTHORIZED_WHEN_IN_USE_NOT_ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocationPermissionState.DENIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.radiusnetworks.flybuy.api.model.LocationPermissionState.values().length];
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.LocationPermissionState.authorized_always.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.LocationPermissionState.authorized_when_in_use.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.LocationPermissionState.authorized_always_not_enabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.LocationPermissionState.authorized_when_in_use_not_enabled.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.LocationPermissionState.denied.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean isLocationTrackingAllowed(LocationPermissionState locationPermissionState) {
        Intrinsics.j(locationPermissionState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[locationPermissionState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final com.radiusnetworks.flybuy.api.model.LocationPermissionState toApiLocationPermissionState(LocationPermissionState locationPermissionState) {
        Intrinsics.j(locationPermissionState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[locationPermissionState.ordinal()];
        if (i10 == 1) {
            return com.radiusnetworks.flybuy.api.model.LocationPermissionState.authorized_always;
        }
        if (i10 == 2) {
            return com.radiusnetworks.flybuy.api.model.LocationPermissionState.authorized_when_in_use;
        }
        if (i10 == 3) {
            return com.radiusnetworks.flybuy.api.model.LocationPermissionState.authorized_always_not_enabled;
        }
        if (i10 == 4) {
            return com.radiusnetworks.flybuy.api.model.LocationPermissionState.authorized_when_in_use_not_enabled;
        }
        if (i10 == 5) {
            return com.radiusnetworks.flybuy.api.model.LocationPermissionState.denied;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final LocationPermissionState toLocationPermissionState(com.radiusnetworks.flybuy.api.model.LocationPermissionState locationPermissionState) {
        Intrinsics.j(locationPermissionState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[locationPermissionState.ordinal()];
        if (i10 == 1) {
            return LocationPermissionState.AUTHORIZED_ALWAYS;
        }
        if (i10 == 2) {
            return LocationPermissionState.AUTHORIZED_WHEN_IN_USE;
        }
        if (i10 == 3) {
            return LocationPermissionState.AUTHORIZED_WHEN_IN_USE_NOT_ENABLED;
        }
        if (i10 == 4) {
            return LocationPermissionState.AUTHORIZED_WHEN_IN_USE_NOT_ENABLED;
        }
        if (i10 == 5) {
            return LocationPermissionState.DENIED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
