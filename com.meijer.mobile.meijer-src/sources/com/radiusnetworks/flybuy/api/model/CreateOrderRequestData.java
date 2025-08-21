package com.radiusnetworks.flybuy.api.model;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.mapbox.model.a;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b=\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0019J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010#J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jú\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020\u00112\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\t\u0010M\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001b¨\u0006N"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequestData;", "", "siteId", "", "customerName", "", "customerToken", "customerCarType", "customerCarColor", "customerLicensePlate", "customerPhone", "partnerId", "customerPushToken", "pickupWindow", "state", "pickupType", "deferredLocationTrackingEnabled", "", "spotIdentifier", "handoffVehicleLocation", "partnerIdentifierForCustomer", "partnerIdentifierForCrew", "disableOrderFire", "disableDisablePromiseTimeScheduling", "orderFireMakeIntervalSeconds", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getCustomerCarColor", "()Ljava/lang/String;", "getCustomerCarType", "getCustomerLicensePlate", "getCustomerName", "getCustomerPhone", "getCustomerPushToken", "getCustomerToken", "getDeferredLocationTrackingEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisableDisablePromiseTimeScheduling", "getDisableOrderFire", "getHandoffVehicleLocation", "getOrderFireMakeIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPartnerId", "getPartnerIdentifierForCrew", "getPartnerIdentifierForCustomer", "getPickupType", "getPickupWindow", "getSiteId", "()I", "getSpotIdentifier", "getState", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequestData;", "equals", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateOrderRequestData {

    @InterfaceC16127c("customer_car_color")
    private final String customerCarColor;

    @InterfaceC16127c("customer_car_type")
    private final String customerCarType;

    @InterfaceC16127c("customer_license_plate")
    private final String customerLicensePlate;

    @InterfaceC16127c("customer_name")
    private final String customerName;

    @InterfaceC16127c("customer_phone")
    private final String customerPhone;

    @InterfaceC16127c("push_token")
    private final String customerPushToken;

    @InterfaceC16127c("customer_token")
    private final String customerToken;

    @InterfaceC16127c("deferred_location_tracking_enabled")
    private final Boolean deferredLocationTrackingEnabled;

    @InterfaceC16127c("disable_promise_time_scheduling")
    private final Boolean disableDisablePromiseTimeScheduling;

    @InterfaceC16127c("disable_order_fire")
    private final Boolean disableOrderFire;

    @InterfaceC16127c("handoff_vehicle_location")
    private final String handoffVehicleLocation;

    @InterfaceC16127c("order_fire_make_interval_seconds")
    private final Integer orderFireMakeIntervalSeconds;

    @InterfaceC16127c("partner_identifier")
    private final String partnerId;

    @InterfaceC16127c("partner_identifier_for_crew")
    private final String partnerIdentifierForCrew;

    @InterfaceC16127c("partner_identifier_for_customer")
    private final String partnerIdentifierForCustomer;

    @InterfaceC16127c("pickup_type")
    private final String pickupType;

    @InterfaceC16127c("pickup_window")
    private final String pickupWindow;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_SITE_ID)
    private final int siteId;

    @InterfaceC16127c("spot_identifier")
    private final String spotIdentifier;

    @InterfaceC16127c("state")
    private final String state;

    public static /* synthetic */ CreateOrderRequestData copy$default(CreateOrderRequestData createOrderRequestData, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, String str14, String str15, Boolean bool2, Boolean bool3, Integer num, int i11, Object obj) {
        Integer num2;
        Boolean bool4;
        int i12 = (i11 & 1) != 0 ? createOrderRequestData.siteId : i10;
        String str16 = (i11 & 2) != 0 ? createOrderRequestData.customerName : str;
        String str17 = (i11 & 4) != 0 ? createOrderRequestData.customerToken : str2;
        String str18 = (i11 & 8) != 0 ? createOrderRequestData.customerCarType : str3;
        String str19 = (i11 & 16) != 0 ? createOrderRequestData.customerCarColor : str4;
        String str20 = (i11 & 32) != 0 ? createOrderRequestData.customerLicensePlate : str5;
        String str21 = (i11 & 64) != 0 ? createOrderRequestData.customerPhone : str6;
        String str22 = (i11 & 128) != 0 ? createOrderRequestData.partnerId : str7;
        String str23 = (i11 & 256) != 0 ? createOrderRequestData.customerPushToken : str8;
        String str24 = (i11 & 512) != 0 ? createOrderRequestData.pickupWindow : str9;
        String str25 = (i11 & 1024) != 0 ? createOrderRequestData.state : str10;
        String str26 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? createOrderRequestData.pickupType : str11;
        Boolean bool5 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? createOrderRequestData.deferredLocationTrackingEnabled : bool;
        String str27 = (i11 & 8192) != 0 ? createOrderRequestData.spotIdentifier : str12;
        int i13 = i12;
        String str28 = (i11 & 16384) != 0 ? createOrderRequestData.handoffVehicleLocation : str13;
        String str29 = (i11 & 32768) != 0 ? createOrderRequestData.partnerIdentifierForCustomer : str14;
        String str30 = (i11 & 65536) != 0 ? createOrderRequestData.partnerIdentifierForCrew : str15;
        Boolean bool6 = (i11 & 131072) != 0 ? createOrderRequestData.disableOrderFire : bool2;
        Boolean bool7 = (i11 & 262144) != 0 ? createOrderRequestData.disableDisablePromiseTimeScheduling : bool3;
        if ((i11 & 524288) != 0) {
            bool4 = bool7;
            num2 = createOrderRequestData.orderFireMakeIntervalSeconds;
        } else {
            num2 = num;
            bool4 = bool7;
        }
        return createOrderRequestData.copy(i13, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, bool5, str27, str28, str29, str30, bool6, bool4, num2);
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

    /* renamed from: component18, reason: from getter */
    public final Boolean getDisableOrderFire() {
        return this.disableOrderFire;
    }

    /* renamed from: component19, reason: from getter */
    public final Boolean getDisableDisablePromiseTimeScheduling() {
        return this.disableDisablePromiseTimeScheduling;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component20, reason: from getter */
    public final Integer getOrderFireMakeIntervalSeconds() {
        return this.orderFireMakeIntervalSeconds;
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

    public final CreateOrderRequestData copy(int siteId, String customerName, String customerToken, String customerCarType, String customerCarColor, String customerLicensePlate, String customerPhone, String partnerId, String customerPushToken, String pickupWindow, String state, String pickupType, Boolean deferredLocationTrackingEnabled, String spotIdentifier, String handoffVehicleLocation, String partnerIdentifierForCustomer, String partnerIdentifierForCrew, Boolean disableOrderFire, Boolean disableDisablePromiseTimeScheduling, Integer orderFireMakeIntervalSeconds) {
        Intrinsics.j(customerName, "customerName");
        return new CreateOrderRequestData(siteId, customerName, customerToken, customerCarType, customerCarColor, customerLicensePlate, customerPhone, partnerId, customerPushToken, pickupWindow, state, pickupType, deferredLocationTrackingEnabled, spotIdentifier, handoffVehicleLocation, partnerIdentifierForCustomer, partnerIdentifierForCrew, disableOrderFire, disableDisablePromiseTimeScheduling, orderFireMakeIntervalSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderRequestData)) {
            return false;
        }
        CreateOrderRequestData createOrderRequestData = (CreateOrderRequestData) other;
        return this.siteId == createOrderRequestData.siteId && Intrinsics.e(this.customerName, createOrderRequestData.customerName) && Intrinsics.e(this.customerToken, createOrderRequestData.customerToken) && Intrinsics.e(this.customerCarType, createOrderRequestData.customerCarType) && Intrinsics.e(this.customerCarColor, createOrderRequestData.customerCarColor) && Intrinsics.e(this.customerLicensePlate, createOrderRequestData.customerLicensePlate) && Intrinsics.e(this.customerPhone, createOrderRequestData.customerPhone) && Intrinsics.e(this.partnerId, createOrderRequestData.partnerId) && Intrinsics.e(this.customerPushToken, createOrderRequestData.customerPushToken) && Intrinsics.e(this.pickupWindow, createOrderRequestData.pickupWindow) && Intrinsics.e(this.state, createOrderRequestData.state) && Intrinsics.e(this.pickupType, createOrderRequestData.pickupType) && Intrinsics.e(this.deferredLocationTrackingEnabled, createOrderRequestData.deferredLocationTrackingEnabled) && Intrinsics.e(this.spotIdentifier, createOrderRequestData.spotIdentifier) && Intrinsics.e(this.handoffVehicleLocation, createOrderRequestData.handoffVehicleLocation) && Intrinsics.e(this.partnerIdentifierForCustomer, createOrderRequestData.partnerIdentifierForCustomer) && Intrinsics.e(this.partnerIdentifierForCrew, createOrderRequestData.partnerIdentifierForCrew) && Intrinsics.e(this.disableOrderFire, createOrderRequestData.disableOrderFire) && Intrinsics.e(this.disableDisablePromiseTimeScheduling, createOrderRequestData.disableDisablePromiseTimeScheduling) && Intrinsics.e(this.orderFireMakeIntervalSeconds, createOrderRequestData.orderFireMakeIntervalSeconds);
    }

    public String toString() {
        return "CreateOrderRequestData(siteId=" + this.siteId + ", customerName=" + this.customerName + ", customerToken=" + this.customerToken + ", customerCarType=" + this.customerCarType + ", customerCarColor=" + this.customerCarColor + ", customerLicensePlate=" + this.customerLicensePlate + ", customerPhone=" + this.customerPhone + ", partnerId=" + this.partnerId + ", customerPushToken=" + this.customerPushToken + ", pickupWindow=" + this.pickupWindow + ", state=" + this.state + ", pickupType=" + this.pickupType + ", deferredLocationTrackingEnabled=" + this.deferredLocationTrackingEnabled + ", spotIdentifier=" + this.spotIdentifier + ", handoffVehicleLocation=" + this.handoffVehicleLocation + ", partnerIdentifierForCustomer=" + this.partnerIdentifierForCustomer + ", partnerIdentifierForCrew=" + this.partnerIdentifierForCrew + ", disableOrderFire=" + this.disableOrderFire + ", disableDisablePromiseTimeScheduling=" + this.disableDisablePromiseTimeScheduling + ", orderFireMakeIntervalSeconds=" + this.orderFireMakeIntervalSeconds + ')';
    }

    public CreateOrderRequestData(int i10, String customerName, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, String str13, String str14, Boolean bool2, Boolean bool3, Integer num) {
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
        this.disableOrderFire = bool2;
        this.disableDisablePromiseTimeScheduling = bool3;
        this.orderFireMakeIntervalSeconds = num;
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

    public final Boolean getDisableDisablePromiseTimeScheduling() {
        return this.disableDisablePromiseTimeScheduling;
    }

    public final Boolean getDisableOrderFire() {
        return this.disableOrderFire;
    }

    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    public final Integer getOrderFireMakeIntervalSeconds() {
        return this.orderFireMakeIntervalSeconds;
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
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool2 = this.disableOrderFire;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.disableDisablePromiseTimeScheduling;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.orderFireMakeIntervalSeconds;
        return iHashCode17 + (num != null ? num.hashCode() : 0);
    }
}
