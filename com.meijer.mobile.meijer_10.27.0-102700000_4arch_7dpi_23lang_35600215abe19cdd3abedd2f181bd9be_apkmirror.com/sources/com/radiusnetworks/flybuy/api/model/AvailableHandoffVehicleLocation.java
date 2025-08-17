package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/AvailableHandoffVehicleLocation;", "", "vehicleLocation", "", "vehicleLocationLocalizedString", "(Ljava/lang/String;Ljava/lang/String;)V", "getVehicleLocation", "()Ljava/lang/String;", "getVehicleLocationLocalizedString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvailableHandoffVehicleLocation {

    @InterfaceC15617c("vehicle_location")
    private final String vehicleLocation;

    @InterfaceC15617c("vehicle_location_localized_string")
    private final String vehicleLocationLocalizedString;

    public AvailableHandoffVehicleLocation(String vehicleLocation, String vehicleLocationLocalizedString) {
        Intrinsics.j(vehicleLocation, "vehicleLocation");
        Intrinsics.j(vehicleLocationLocalizedString, "vehicleLocationLocalizedString");
        this.vehicleLocation = vehicleLocation;
        this.vehicleLocationLocalizedString = vehicleLocationLocalizedString;
    }

    public static /* synthetic */ AvailableHandoffVehicleLocation copy$default(AvailableHandoffVehicleLocation availableHandoffVehicleLocation, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = availableHandoffVehicleLocation.vehicleLocation;
        }
        if ((i10 & 2) != 0) {
            str2 = availableHandoffVehicleLocation.vehicleLocationLocalizedString;
        }
        return availableHandoffVehicleLocation.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVehicleLocation() {
        return this.vehicleLocation;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVehicleLocationLocalizedString() {
        return this.vehicleLocationLocalizedString;
    }

    public final AvailableHandoffVehicleLocation copy(String vehicleLocation, String vehicleLocationLocalizedString) {
        Intrinsics.j(vehicleLocation, "vehicleLocation");
        Intrinsics.j(vehicleLocationLocalizedString, "vehicleLocationLocalizedString");
        return new AvailableHandoffVehicleLocation(vehicleLocation, vehicleLocationLocalizedString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableHandoffVehicleLocation)) {
            return false;
        }
        AvailableHandoffVehicleLocation availableHandoffVehicleLocation = (AvailableHandoffVehicleLocation) other;
        return Intrinsics.e(this.vehicleLocation, availableHandoffVehicleLocation.vehicleLocation) && Intrinsics.e(this.vehicleLocationLocalizedString, availableHandoffVehicleLocation.vehicleLocationLocalizedString);
    }

    public final String getVehicleLocation() {
        return this.vehicleLocation;
    }

    public final String getVehicleLocationLocalizedString() {
        return this.vehicleLocationLocalizedString;
    }

    public int hashCode() {
        return this.vehicleLocationLocalizedString.hashCode() + (this.vehicleLocation.hashCode() * 31);
    }

    public String toString() {
        return "AvailableHandoffVehicleLocation(vehicleLocation=" + this.vehicleLocation + ", vehicleLocationLocalizedString=" + this.vehicleLocationLocalizedString + ')';
    }
}
