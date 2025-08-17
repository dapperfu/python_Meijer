package com.radiusnetworks.flybuy.sdk.data.order;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.sdk.data.room.domain.PickupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0014J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\rHÆ\u0003J·\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\t\u0010M\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018¨\u0006N"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/order/CreateOrderInfo;", "", "siteID", "", "partnerIdentifier", "", "name", "carType", "carColor", "licensePlate", "phone", "pushToken", "pickupWindow", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "state", "pickupType", "spotIdentifier", "handoffVehicleLocation", "partnerIdentifierForCustomer", "partnerIdentifierForCrew", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCarColor", "()Ljava/lang/String;", "setCarColor", "(Ljava/lang/String;)V", "getCarType", "setCarType", "getHandoffVehicleLocation", "setHandoffVehicleLocation", "getLicensePlate", "setLicensePlate", "getName", "setName", "getPartnerIdentifier", "setPartnerIdentifier", "getPartnerIdentifierForCrew", "setPartnerIdentifierForCrew", "getPartnerIdentifierForCustomer", "setPartnerIdentifierForCustomer", "getPhone", "setPhone", "getPickupType", "setPickupType", "getPickupWindow", "()Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "setPickupWindow", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;)V", "getPushToken", "setPushToken", "getSiteID", "()I", "setSiteID", "(I)V", "getSpotIdentifier", "setSpotIdentifier", "getState", "setState", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CreateOrderInfo {
    private String carColor;
    private String carType;
    private String handoffVehicleLocation;
    private String licensePlate;
    private String name;
    private String partnerIdentifier;
    private String partnerIdentifierForCrew;
    private String partnerIdentifierForCustomer;
    private String phone;
    private String pickupType;
    private PickupWindow pickupWindow;
    private String pushToken;
    private int siteID;
    private String spotIdentifier;
    private String state;

    public CreateOrderInfo() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSiteID() {
        return this.siteID;
    }

    /* renamed from: component10, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPickupType() {
        return this.pickupType;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    /* renamed from: component13, reason: from getter */
    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPartnerIdentifierForCustomer() {
        return this.partnerIdentifierForCustomer;
    }

    /* renamed from: component15, reason: from getter */
    public final String getPartnerIdentifierForCrew() {
        return this.partnerIdentifierForCrew;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCarType() {
        return this.carType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCarColor() {
        return this.carColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLicensePlate() {
        return this.licensePlate;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    /* renamed from: component9, reason: from getter */
    public final PickupWindow getPickupWindow() {
        return this.pickupWindow;
    }

    public final CreateOrderInfo copy(int siteID, String partnerIdentifier, String name, String carType, String carColor, String licensePlate, String phone, String pushToken, PickupWindow pickupWindow, String state, String pickupType, String spotIdentifier, String handoffVehicleLocation, String partnerIdentifierForCustomer, String partnerIdentifierForCrew) {
        Intrinsics.j(partnerIdentifier, "partnerIdentifier");
        Intrinsics.j(name, "name");
        return new CreateOrderInfo(siteID, partnerIdentifier, name, carType, carColor, licensePlate, phone, pushToken, pickupWindow, state, pickupType, spotIdentifier, handoffVehicleLocation, partnerIdentifierForCustomer, partnerIdentifierForCrew);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderInfo)) {
            return false;
        }
        CreateOrderInfo createOrderInfo = (CreateOrderInfo) other;
        return this.siteID == createOrderInfo.siteID && Intrinsics.e(this.partnerIdentifier, createOrderInfo.partnerIdentifier) && Intrinsics.e(this.name, createOrderInfo.name) && Intrinsics.e(this.carType, createOrderInfo.carType) && Intrinsics.e(this.carColor, createOrderInfo.carColor) && Intrinsics.e(this.licensePlate, createOrderInfo.licensePlate) && Intrinsics.e(this.phone, createOrderInfo.phone) && Intrinsics.e(this.pushToken, createOrderInfo.pushToken) && Intrinsics.e(this.pickupWindow, createOrderInfo.pickupWindow) && Intrinsics.e(this.state, createOrderInfo.state) && Intrinsics.e(this.pickupType, createOrderInfo.pickupType) && Intrinsics.e(this.spotIdentifier, createOrderInfo.spotIdentifier) && Intrinsics.e(this.handoffVehicleLocation, createOrderInfo.handoffVehicleLocation) && Intrinsics.e(this.partnerIdentifierForCustomer, createOrderInfo.partnerIdentifierForCustomer) && Intrinsics.e(this.partnerIdentifierForCrew, createOrderInfo.partnerIdentifierForCrew);
    }

    public int hashCode() {
        int iHashCode = (this.name.hashCode() + ((this.partnerIdentifier.hashCode() + (Integer.hashCode(this.siteID) * 31)) * 31)) * 31;
        String str = this.carType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.carColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.licensePlate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phone;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pushToken;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PickupWindow pickupWindow = this.pickupWindow;
        int iHashCode7 = (iHashCode6 + (pickupWindow == null ? 0 : pickupWindow.hashCode())) * 31;
        String str6 = this.state;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pickupType;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.spotIdentifier;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.handoffVehicleLocation;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.partnerIdentifierForCustomer;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.partnerIdentifierForCrew;
        return iHashCode12 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "CreateOrderInfo(siteID=" + this.siteID + ", partnerIdentifier=" + this.partnerIdentifier + ", name=" + this.name + ", carType=" + this.carType + ", carColor=" + this.carColor + ", licensePlate=" + this.licensePlate + ", phone=" + this.phone + ", pushToken=" + this.pushToken + ", pickupWindow=" + this.pickupWindow + ", state=" + this.state + ", pickupType=" + this.pickupType + ", spotIdentifier=" + this.spotIdentifier + ", handoffVehicleLocation=" + this.handoffVehicleLocation + ", partnerIdentifierForCustomer=" + this.partnerIdentifierForCustomer + ", partnerIdentifierForCrew=" + this.partnerIdentifierForCrew + ')';
    }

    public CreateOrderInfo(int i10, String partnerIdentifier, String name, String str, String str2, String str3, String str4, String str5, PickupWindow pickupWindow, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.j(partnerIdentifier, "partnerIdentifier");
        Intrinsics.j(name, "name");
        this.siteID = i10;
        this.partnerIdentifier = partnerIdentifier;
        this.name = name;
        this.carType = str;
        this.carColor = str2;
        this.licensePlate = str3;
        this.phone = str4;
        this.pushToken = str5;
        this.pickupWindow = pickupWindow;
        this.state = str6;
        this.pickupType = str7;
        this.spotIdentifier = str8;
        this.handoffVehicleLocation = str9;
        this.partnerIdentifierForCustomer = str10;
        this.partnerIdentifierForCrew = str11;
    }

    public final String getCarColor() {
        return this.carColor;
    }

    public final String getCarType() {
        return this.carType;
    }

    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    public final String getLicensePlate() {
        return this.licensePlate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    public final String getPartnerIdentifierForCrew() {
        return this.partnerIdentifierForCrew;
    }

    public final String getPartnerIdentifierForCustomer() {
        return this.partnerIdentifierForCustomer;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPickupType() {
        return this.pickupType;
    }

    public final PickupWindow getPickupWindow() {
        return this.pickupWindow;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final int getSiteID() {
        return this.siteID;
    }

    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    public final String getState() {
        return this.state;
    }

    public final void setCarColor(String str) {
        this.carColor = str;
    }

    public final void setCarType(String str) {
        this.carType = str;
    }

    public final void setHandoffVehicleLocation(String str) {
        this.handoffVehicleLocation = str;
    }

    public final void setLicensePlate(String str) {
        this.licensePlate = str;
    }

    public final void setName(String str) {
        Intrinsics.j(str, "<set-?>");
        this.name = str;
    }

    public final void setPartnerIdentifier(String str) {
        Intrinsics.j(str, "<set-?>");
        this.partnerIdentifier = str;
    }

    public final void setPartnerIdentifierForCrew(String str) {
        this.partnerIdentifierForCrew = str;
    }

    public final void setPartnerIdentifierForCustomer(String str) {
        this.partnerIdentifierForCustomer = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPickupType(String str) {
        this.pickupType = str;
    }

    public final void setPickupWindow(PickupWindow pickupWindow) {
        this.pickupWindow = pickupWindow;
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setSiteID(int i10) {
        this.siteID = i10;
    }

    public final void setSpotIdentifier(String str) {
        this.spotIdentifier = str;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public /* synthetic */ CreateOrderInfo(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, PickupWindow pickupWindow, String str8, String str9, String str10, String str11, String str12, String str13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) == 0 ? str2 : "", (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : pickupWindow, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str10, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str11, (i11 & 8192) != 0 ? null : str12, (i11 & 16384) != 0 ? null : str13);
    }
}
