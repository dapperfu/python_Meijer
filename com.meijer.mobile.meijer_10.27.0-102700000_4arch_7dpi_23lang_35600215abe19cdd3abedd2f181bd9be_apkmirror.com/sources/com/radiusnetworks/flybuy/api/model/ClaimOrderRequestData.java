package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0084\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006-"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/ClaimOrderRequestData;", "", "customerName", "", "customerCarType", "customerCarColor", "customerLicensePlate", "customerPhone", "customerPushToken", "pickupType", "deferredLocationTrackingEnabled", "", "spotIdentifier", "handoffVehicleLocation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerCarColor", "()Ljava/lang/String;", "getCustomerCarType", "getCustomerLicensePlate", "getCustomerName", "getCustomerPhone", "getCustomerPushToken", "getDeferredLocationTrackingEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHandoffVehicleLocation", "getPickupType", "getSpotIdentifier", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/radiusnetworks/flybuy/api/model/ClaimOrderRequestData;", "equals", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ClaimOrderRequestData {

    @InterfaceC15617c("customer_car_color")
    private final String customerCarColor;

    @InterfaceC15617c("customer_car_type")
    private final String customerCarType;

    @InterfaceC15617c("customer_license_plate")
    private final String customerLicensePlate;

    @InterfaceC15617c("customer_name")
    private final String customerName;

    @InterfaceC15617c("customer_phone")
    private final String customerPhone;

    @InterfaceC15617c("push_token")
    private final String customerPushToken;

    @InterfaceC15617c("deferred_location_tracking_enabled")
    private final Boolean deferredLocationTrackingEnabled;

    @InterfaceC15617c("handoff_vehicle_location")
    private final String handoffVehicleLocation;

    @InterfaceC15617c("pickup_type")
    private final String pickupType;

    @InterfaceC15617c("spot_identifier")
    private final String spotIdentifier;

    public ClaimOrderRequestData(String customerName, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8) {
        Intrinsics.j(customerName, "customerName");
        this.customerName = customerName;
        this.customerCarType = str;
        this.customerCarColor = str2;
        this.customerLicensePlate = str3;
        this.customerPhone = str4;
        this.customerPushToken = str5;
        this.pickupType = str6;
        this.deferredLocationTrackingEnabled = bool;
        this.spotIdentifier = str7;
        this.handoffVehicleLocation = str8;
    }

    public static /* synthetic */ ClaimOrderRequestData copy$default(ClaimOrderRequestData claimOrderRequestData, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = claimOrderRequestData.customerName;
        }
        if ((i10 & 2) != 0) {
            str2 = claimOrderRequestData.customerCarType;
        }
        if ((i10 & 4) != 0) {
            str3 = claimOrderRequestData.customerCarColor;
        }
        if ((i10 & 8) != 0) {
            str4 = claimOrderRequestData.customerLicensePlate;
        }
        if ((i10 & 16) != 0) {
            str5 = claimOrderRequestData.customerPhone;
        }
        if ((i10 & 32) != 0) {
            str6 = claimOrderRequestData.customerPushToken;
        }
        if ((i10 & 64) != 0) {
            str7 = claimOrderRequestData.pickupType;
        }
        if ((i10 & 128) != 0) {
            bool = claimOrderRequestData.deferredLocationTrackingEnabled;
        }
        if ((i10 & 256) != 0) {
            str8 = claimOrderRequestData.spotIdentifier;
        }
        if ((i10 & 512) != 0) {
            str9 = claimOrderRequestData.handoffVehicleLocation;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str7;
        Boolean bool2 = bool;
        String str13 = str5;
        String str14 = str6;
        return claimOrderRequestData.copy(str, str2, str3, str4, str13, str14, str12, bool2, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCustomerCarType() {
        return this.customerCarType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCustomerCarColor() {
        return this.customerCarColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCustomerLicensePlate() {
        return this.customerLicensePlate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCustomerPushToken() {
        return this.customerPushToken;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPickupType() {
        return this.pickupType;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getDeferredLocationTrackingEnabled() {
        return this.deferredLocationTrackingEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    public final ClaimOrderRequestData copy(String customerName, String customerCarType, String customerCarColor, String customerLicensePlate, String customerPhone, String customerPushToken, String pickupType, Boolean deferredLocationTrackingEnabled, String spotIdentifier, String handoffVehicleLocation) {
        Intrinsics.j(customerName, "customerName");
        return new ClaimOrderRequestData(customerName, customerCarType, customerCarColor, customerLicensePlate, customerPhone, customerPushToken, pickupType, deferredLocationTrackingEnabled, spotIdentifier, handoffVehicleLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaimOrderRequestData)) {
            return false;
        }
        ClaimOrderRequestData claimOrderRequestData = (ClaimOrderRequestData) other;
        return Intrinsics.e(this.customerName, claimOrderRequestData.customerName) && Intrinsics.e(this.customerCarType, claimOrderRequestData.customerCarType) && Intrinsics.e(this.customerCarColor, claimOrderRequestData.customerCarColor) && Intrinsics.e(this.customerLicensePlate, claimOrderRequestData.customerLicensePlate) && Intrinsics.e(this.customerPhone, claimOrderRequestData.customerPhone) && Intrinsics.e(this.customerPushToken, claimOrderRequestData.customerPushToken) && Intrinsics.e(this.pickupType, claimOrderRequestData.pickupType) && Intrinsics.e(this.deferredLocationTrackingEnabled, claimOrderRequestData.deferredLocationTrackingEnabled) && Intrinsics.e(this.spotIdentifier, claimOrderRequestData.spotIdentifier) && Intrinsics.e(this.handoffVehicleLocation, claimOrderRequestData.handoffVehicleLocation);
    }

    public final String getCustomerCarColor() {
        return this.customerCarColor;
    }

    public final String getCustomerCarType() {
        return this.customerCarType;
    }

    public final String getCustomerLicensePlate() {
        return this.customerLicensePlate;
    }

    public final String getCustomerName() {
        return this.customerName;
    }

    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    public final String getCustomerPushToken() {
        return this.customerPushToken;
    }

    public final Boolean getDeferredLocationTrackingEnabled() {
        return this.deferredLocationTrackingEnabled;
    }

    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    public final String getPickupType() {
        return this.pickupType;
    }

    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    public int hashCode() {
        int iHashCode = this.customerName.hashCode() * 31;
        String str = this.customerCarType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerCarColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerLicensePlate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerPhone;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.customerPushToken;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pickupType;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.deferredLocationTrackingEnabled;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.spotIdentifier;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.handoffVehicleLocation;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "ClaimOrderRequestData(customerName=" + this.customerName + ", customerCarType=" + this.customerCarType + ", customerCarColor=" + this.customerCarColor + ", customerLicensePlate=" + this.customerLicensePlate + ", customerPhone=" + this.customerPhone + ", customerPushToken=" + this.customerPushToken + ", pickupType=" + this.pickupType + ", deferredLocationTrackingEnabled=" + this.deferredLocationTrackingEnabled + ", spotIdentifier=" + this.spotIdentifier + ", handoffVehicleLocation=" + this.handoffVehicleLocation + ')';
    }
}
