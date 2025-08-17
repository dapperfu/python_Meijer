package com.radiusnetworks.flybuy.api.model;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.mapbox.model.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÖ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018¨\u0006C"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequestData;", "", "siteId", "", "customerName", "", "customerToken", "customerCarType", "customerCarColor", "customerLicensePlate", "customerPhone", "partnerId", "customerPushToken", "pickupWindow", "state", "pickupType", "deferredLocationTrackingEnabled", "", "spotIdentifier", "handoffVehicleLocation", "partnerIdentifierForCustomer", "partnerIdentifierForCrew", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerCarColor", "()Ljava/lang/String;", "getCustomerCarType", "getCustomerLicensePlate", "getCustomerName", "getCustomerPhone", "getCustomerPushToken", "getCustomerToken", "getDeferredLocationTrackingEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHandoffVehicleLocation", "getPartnerId", "getPartnerIdentifierForCrew", "getPartnerIdentifierForCustomer", "getPickupType", "getPickupWindow", "getSiteId", "()I", "getSpotIdentifier", "getState", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequestData;", "equals", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CreateOrderRequestData {

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

    @InterfaceC15617c("customer_token")
    private final String customerToken;

    @InterfaceC15617c("deferred_location_tracking_enabled")
    private final Boolean deferredLocationTrackingEnabled;

    @InterfaceC15617c("handoff_vehicle_location")
    private final String handoffVehicleLocation;

    @InterfaceC15617c("partner_identifier")
    private final String partnerId;

    @InterfaceC15617c("partner_identifier_for_crew")
    private final String partnerIdentifierForCrew;

    @InterfaceC15617c("partner_identifier_for_customer")
    private final String partnerIdentifierForCustomer;

    @InterfaceC15617c("pickup_type")
    private final String pickupType;

    @InterfaceC15617c("pickup_window")
    private final String pickupWindow;

    @InterfaceC15617c("site_id")
    private final int siteId;

    @InterfaceC15617c("spot_identifier")
    private final String spotIdentifier;

    @InterfaceC15617c("state")
    private final String state;

    public CreateOrderRequestData(int i10, String customerName, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, String str13, String str14) {
        Intrinsics.j(customerName, "customerName");
        this.siteId = i10;
        this.customerName = customerName;
        this.customerToken = str;
        this.customerCarType = str2;
        this.customerCarColor = str3;
        this.customerLicensePlate = str4;
        this.customerPhone = str5;
        this.partnerId = str6;
        this.customerPushToken = str7;
        this.pickupWindow = str8;
        this.state = str9;
        this.pickupType = str10;
        this.deferredLocationTrackingEnabled = bool;
        this.spotIdentifier = str11;
        this.handoffVehicleLocation = str12;
        this.partnerIdentifierForCustomer = str13;
        this.partnerIdentifierForCrew = str14;
    }

    public static /* synthetic */ CreateOrderRequestData copy$default(CreateOrderRequestData createOrderRequestData, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, String str14, String str15, int i11, Object obj) {
        String str16;
        String str17;
        int i12;
        CreateOrderRequestData createOrderRequestData2;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        Boolean bool2;
        String str30;
        int i13 = (i11 & 1) != 0 ? createOrderRequestData.siteId : i10;
        String str31 = (i11 & 2) != 0 ? createOrderRequestData.customerName : str;
        String str32 = (i11 & 4) != 0 ? createOrderRequestData.customerToken : str2;
        String str33 = (i11 & 8) != 0 ? createOrderRequestData.customerCarType : str3;
        String str34 = (i11 & 16) != 0 ? createOrderRequestData.customerCarColor : str4;
        String str35 = (i11 & 32) != 0 ? createOrderRequestData.customerLicensePlate : str5;
        String str36 = (i11 & 64) != 0 ? createOrderRequestData.customerPhone : str6;
        String str37 = (i11 & 128) != 0 ? createOrderRequestData.partnerId : str7;
        String str38 = (i11 & 256) != 0 ? createOrderRequestData.customerPushToken : str8;
        String str39 = (i11 & 512) != 0 ? createOrderRequestData.pickupWindow : str9;
        String str40 = (i11 & 1024) != 0 ? createOrderRequestData.state : str10;
        String str41 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? createOrderRequestData.pickupType : str11;
        Boolean bool3 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? createOrderRequestData.deferredLocationTrackingEnabled : bool;
        String str42 = (i11 & 8192) != 0 ? createOrderRequestData.spotIdentifier : str12;
        int i14 = i13;
        String str43 = (i11 & 16384) != 0 ? createOrderRequestData.handoffVehicleLocation : str13;
        String str44 = (i11 & 32768) != 0 ? createOrderRequestData.partnerIdentifierForCustomer : str14;
        if ((i11 & 65536) != 0) {
            str17 = str44;
            str16 = createOrderRequestData.partnerIdentifierForCrew;
            str18 = str43;
            str19 = str31;
            str20 = str32;
            str21 = str33;
            str22 = str34;
            str23 = str35;
            str24 = str36;
            str25 = str37;
            str26 = str38;
            str27 = str39;
            str28 = str40;
            str29 = str41;
            bool2 = bool3;
            str30 = str42;
            i12 = i14;
            createOrderRequestData2 = createOrderRequestData;
        } else {
            str16 = str15;
            str17 = str44;
            i12 = i14;
            createOrderRequestData2 = createOrderRequestData;
            str18 = str43;
            str19 = str31;
            str20 = str32;
            str21 = str33;
            str22 = str34;
            str23 = str35;
            str24 = str36;
            str25 = str37;
            str26 = str38;
            str27 = str39;
            str28 = str40;
            str29 = str41;
            bool2 = bool3;
            str30 = str42;
        }
        return createOrderRequestData2.copy(i12, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, bool2, str30, str18, str17, str16);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSiteId() {
        return this.siteId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPickupWindow() {
        return this.pickupWindow;
    }

    /* renamed from: component11, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPickupType() {
        return this.pickupType;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getDeferredLocationTrackingEnabled() {
        return this.deferredLocationTrackingEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    /* renamed from: component15, reason: from getter */
    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    /* renamed from: component16, reason: from getter */
    public final String getPartnerIdentifierForCustomer() {
        return this.partnerIdentifierForCustomer;
    }

    /* renamed from: component17, reason: from getter */
    public final String getPartnerIdentifierForCrew() {
        return this.partnerIdentifierForCrew;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCustomerToken() {
        return this.customerToken;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCustomerCarType() {
        return this.customerCarType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomerCarColor() {
        return this.customerCarColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCustomerLicensePlate() {
        return this.customerLicensePlate;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCustomerPushToken() {
        return this.customerPushToken;
    }

    public final CreateOrderRequestData copy(int siteId, String customerName, String customerToken, String customerCarType, String customerCarColor, String customerLicensePlate, String customerPhone, String partnerId, String customerPushToken, String pickupWindow, String state, String pickupType, Boolean deferredLocationTrackingEnabled, String spotIdentifier, String handoffVehicleLocation, String partnerIdentifierForCustomer, String partnerIdentifierForCrew) {
        Intrinsics.j(customerName, "customerName");
        return new CreateOrderRequestData(siteId, customerName, customerToken, customerCarType, customerCarColor, customerLicensePlate, customerPhone, partnerId, customerPushToken, pickupWindow, state, pickupType, deferredLocationTrackingEnabled, spotIdentifier, handoffVehicleLocation, partnerIdentifierForCustomer, partnerIdentifierForCrew);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderRequestData)) {
            return false;
        }
        CreateOrderRequestData createOrderRequestData = (CreateOrderRequestData) other;
        return this.siteId == createOrderRequestData.siteId && Intrinsics.e(this.customerName, createOrderRequestData.customerName) && Intrinsics.e(this.customerToken, createOrderRequestData.customerToken) && Intrinsics.e(this.customerCarType, createOrderRequestData.customerCarType) && Intrinsics.e(this.customerCarColor, createOrderRequestData.customerCarColor) && Intrinsics.e(this.customerLicensePlate, createOrderRequestData.customerLicensePlate) && Intrinsics.e(this.customerPhone, createOrderRequestData.customerPhone) && Intrinsics.e(this.partnerId, createOrderRequestData.partnerId) && Intrinsics.e(this.customerPushToken, createOrderRequestData.customerPushToken) && Intrinsics.e(this.pickupWindow, createOrderRequestData.pickupWindow) && Intrinsics.e(this.state, createOrderRequestData.state) && Intrinsics.e(this.pickupType, createOrderRequestData.pickupType) && Intrinsics.e(this.deferredLocationTrackingEnabled, createOrderRequestData.deferredLocationTrackingEnabled) && Intrinsics.e(this.spotIdentifier, createOrderRequestData.spotIdentifier) && Intrinsics.e(this.handoffVehicleLocation, createOrderRequestData.handoffVehicleLocation) && Intrinsics.e(this.partnerIdentifierForCustomer, createOrderRequestData.partnerIdentifierForCustomer) && Intrinsics.e(this.partnerIdentifierForCrew, createOrderRequestData.partnerIdentifierForCrew);
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

    public final String getCustomerToken() {
        return this.customerToken;
    }

    public final Boolean getDeferredLocationTrackingEnabled() {
        return this.deferredLocationTrackingEnabled;
    }

    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPartnerIdentifierForCrew() {
        return this.partnerIdentifierForCrew;
    }

    public final String getPartnerIdentifierForCustomer() {
        return this.partnerIdentifierForCustomer;
    }

    public final String getPickupType() {
        return this.pickupType;
    }

    public final String getPickupWindow() {
        return this.pickupWindow;
    }

    public final int getSiteId() {
        return this.siteId;
    }

    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    public final String getState() {
        return this.state;
    }

    public String toString() {
        return "CreateOrderRequestData(siteId=" + this.siteId + ", customerName=" + this.customerName + ", customerToken=" + this.customerToken + ", customerCarType=" + this.customerCarType + ", customerCarColor=" + this.customerCarColor + ", customerLicensePlate=" + this.customerLicensePlate + ", customerPhone=" + this.customerPhone + ", partnerId=" + this.partnerId + ", customerPushToken=" + this.customerPushToken + ", pickupWindow=" + this.pickupWindow + ", state=" + this.state + ", pickupType=" + this.pickupType + ", deferredLocationTrackingEnabled=" + this.deferredLocationTrackingEnabled + ", spotIdentifier=" + this.spotIdentifier + ", handoffVehicleLocation=" + this.handoffVehicleLocation + ", partnerIdentifierForCustomer=" + this.partnerIdentifierForCustomer + ", partnerIdentifierForCrew=" + this.partnerIdentifierForCrew + ')';
    }

    public int hashCode() {
        int iA = a.a(this.customerName, Integer.hashCode(this.siteId) * 31, 31);
        String str = this.customerToken;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerCarType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerCarColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerLicensePlate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.customerPhone;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.partnerId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customerPushToken;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pickupWindow;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.state;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pickupType;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.deferredLocationTrackingEnabled;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.spotIdentifier;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.handoffVehicleLocation;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.partnerIdentifierForCustomer;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.partnerIdentifierForCrew;
        return iHashCode14 + (str14 != null ? str14.hashCode() : 0);
    }
}
