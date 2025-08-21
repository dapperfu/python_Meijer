package com.radiusnetworks.flybuy.sdk.data.pickup_config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0006H\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/AvailableHandoffVehicleLocation;", "", "apiModel", "Lcom/radiusnetworks/flybuy/api/model/AvailableHandoffVehicleLocation;", "(Lcom/radiusnetworks/flybuy/api/model/AvailableHandoffVehicleLocation;)V", "vehicleLocation", "", "vehicleLocationLocalizedString", "(Ljava/lang/String;Ljava/lang/String;)V", "getVehicleLocation", "()Ljava/lang/String;", "getVehicleLocationLocalizedString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AvailableHandoffVehicleLocation {

    @InterfaceC16127c("vehicle_location")
    private final String vehicleLocation;

    @InterfaceC16127c("vehicle_location_localized_string")
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

    public int hashCode() {
        return this.vehicleLocationLocalizedString.hashCode() + (this.vehicleLocation.hashCode() * 31);
    }

    public final String getVehicleLocation() {
        return this.vehicleLocation;
    }

    public final String getVehicleLocationLocalizedString() {
        return this.vehicleLocationLocalizedString;
    }

    public String toString() {
        return this.vehicleLocationLocalizedString;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvailableHandoffVehicleLocation(com.radiusnetworks.flybuy.api.model.AvailableHandoffVehicleLocation apiModel) {
        this(apiModel.getVehicleLocation(), apiModel.getVehicleLocationLocalizedString());
        Intrinsics.j(apiModel, "apiModel");
    }
}
