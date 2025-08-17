package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/PickupTypeConfig;", "", "pickupType", "", "pickupTypeLocalizedString", "showVehicleInfoFields", "", "requireVehicleInfo", "showHandoffVehicleLocations", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getPickupType", "()Ljava/lang/String;", "getPickupTypeLocalizedString", "getRequireVehicleInfo", "()Z", "getShowHandoffVehicleLocations", "getShowVehicleInfoFields", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PickupTypeConfig {

    @InterfaceC15617c("pickup_type")
    private final String pickupType;

    @InterfaceC15617c("pickup_type_localized_string")
    private final String pickupTypeLocalizedString;

    @InterfaceC15617c("require_vehicle_info")
    private final boolean requireVehicleInfo;

    @InterfaceC15617c("show_handoff_vehicle_locations")
    private final boolean showHandoffVehicleLocations;

    @InterfaceC15617c("show_vehicle_info_fields")
    private final boolean showVehicleInfoFields;

    public PickupTypeConfig(String pickupType, String pickupTypeLocalizedString, boolean z10, boolean z11, boolean z12) {
        Intrinsics.j(pickupType, "pickupType");
        Intrinsics.j(pickupTypeLocalizedString, "pickupTypeLocalizedString");
        this.pickupType = pickupType;
        this.pickupTypeLocalizedString = pickupTypeLocalizedString;
        this.showVehicleInfoFields = z10;
        this.requireVehicleInfo = z11;
        this.showHandoffVehicleLocations = z12;
    }

    public static /* synthetic */ PickupTypeConfig copy$default(PickupTypeConfig pickupTypeConfig, String str, String str2, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pickupTypeConfig.pickupType;
        }
        if ((i10 & 2) != 0) {
            str2 = pickupTypeConfig.pickupTypeLocalizedString;
        }
        if ((i10 & 4) != 0) {
            z10 = pickupTypeConfig.showVehicleInfoFields;
        }
        if ((i10 & 8) != 0) {
            z11 = pickupTypeConfig.requireVehicleInfo;
        }
        if ((i10 & 16) != 0) {
            z12 = pickupTypeConfig.showHandoffVehicleLocations;
        }
        boolean z13 = z12;
        boolean z14 = z10;
        return pickupTypeConfig.copy(str, str2, z14, z11, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPickupType() {
        return this.pickupType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPickupTypeLocalizedString() {
        return this.pickupTypeLocalizedString;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowVehicleInfoFields() {
        return this.showVehicleInfoFields;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRequireVehicleInfo() {
        return this.requireVehicleInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowHandoffVehicleLocations() {
        return this.showHandoffVehicleLocations;
    }

    public final PickupTypeConfig copy(String pickupType, String pickupTypeLocalizedString, boolean showVehicleInfoFields, boolean requireVehicleInfo, boolean showHandoffVehicleLocations) {
        Intrinsics.j(pickupType, "pickupType");
        Intrinsics.j(pickupTypeLocalizedString, "pickupTypeLocalizedString");
        return new PickupTypeConfig(pickupType, pickupTypeLocalizedString, showVehicleInfoFields, requireVehicleInfo, showHandoffVehicleLocations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupTypeConfig)) {
            return false;
        }
        PickupTypeConfig pickupTypeConfig = (PickupTypeConfig) other;
        return Intrinsics.e(this.pickupType, pickupTypeConfig.pickupType) && Intrinsics.e(this.pickupTypeLocalizedString, pickupTypeConfig.pickupTypeLocalizedString) && this.showVehicleInfoFields == pickupTypeConfig.showVehicleInfoFields && this.requireVehicleInfo == pickupTypeConfig.requireVehicleInfo && this.showHandoffVehicleLocations == pickupTypeConfig.showHandoffVehicleLocations;
    }

    public final String getPickupType() {
        return this.pickupType;
    }

    public final String getPickupTypeLocalizedString() {
        return this.pickupTypeLocalizedString;
    }

    public final boolean getRequireVehicleInfo() {
        return this.requireVehicleInfo;
    }

    public final boolean getShowHandoffVehicleLocations() {
        return this.showHandoffVehicleLocations;
    }

    public final boolean getShowVehicleInfoFields() {
        return this.showVehicleInfoFields;
    }

    public String toString() {
        return "PickupTypeConfig(pickupType=" + this.pickupType + ", pickupTypeLocalizedString=" + this.pickupTypeLocalizedString + ", showVehicleInfoFields=" + this.showVehicleInfoFields + ", requireVehicleInfo=" + this.requireVehicleInfo + ", showHandoffVehicleLocations=" + this.showHandoffVehicleLocations + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iA = a.a(this.pickupTypeLocalizedString, this.pickupType.hashCode() * 31, 31);
        boolean z10 = this.showVehicleInfoFields;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iA + i10) * 31;
        boolean z11 = this.requireVehicleInfo;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.showHandoffVehicleLocations;
        return i13 + (z12 ? 1 : z12 ? 1 : 0);
    }
}
