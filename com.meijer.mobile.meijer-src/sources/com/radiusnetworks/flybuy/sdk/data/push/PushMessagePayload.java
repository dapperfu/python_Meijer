package com.radiusnetworks.flybuy.sdk.data.push;

import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b)\u0010\"¨\u0006*"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/push/PushMessagePayload;", "", "messageSource", "", "flybuyMessageType", PreferencesHelper.PREF_ID, "", "orderState", "customerState", "etaAt", "locationTrackingEnabled", "forceSyncAppConfig", "forceSyncNotifyCampaigns", "wrongSiteId", "estimatedReadyAt", "orderFiredAt", "pickupType", "customerCarColor", "customerCarType", "customerLicensePlate", "handoffVehicleLocation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerCarColor", "()Ljava/lang/String;", "getCustomerCarType", "getCustomerLicensePlate", "getCustomerState", "getEstimatedReadyAt", "getEtaAt", "getFlybuyMessageType", "getForceSyncAppConfig", "getForceSyncNotifyCampaigns", "getHandoffVehicleLocation", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLocationTrackingEnabled", "getMessageSource", "getOrderFiredAt", "getOrderState", "getPickupType", "getWrongSiteId", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushMessagePayload {

    @InterfaceC16127c("customer_car_color")
    private final String customerCarColor;

    @InterfaceC16127c("customer_car_type")
    private final String customerCarType;

    @InterfaceC16127c("customer_license_plate")
    private final String customerLicensePlate;

    @InterfaceC16127c("customer_state_v2")
    private final String customerState;

    @InterfaceC16127c("estimated_ready_at")
    private final String estimatedReadyAt;

    @InterfaceC16127c("eta_at")
    private final String etaAt;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_FLYBUY_MESSAGE_TYPE)
    private final String flybuyMessageType;

    @InterfaceC16127c("force_sync_app_config")
    private final String forceSyncAppConfig;

    @InterfaceC16127c("force_sync_notify_campaigns")
    private final String forceSyncNotifyCampaigns;

    @InterfaceC16127c("handoff_vehicle_location")
    private final String handoffVehicleLocation;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_ORDER_ID)
    private final Integer id;

    @InterfaceC16127c("location_tracking_enabled")
    private final String locationTrackingEnabled;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_MESSAGE_SOURCE)
    private final String messageSource;

    @InterfaceC16127c("order_fired_at")
    private final String orderFiredAt;

    @InterfaceC16127c("order_state_v2")
    private final String orderState;

    @InterfaceC16127c("pickup_type")
    private final String pickupType;

    @InterfaceC16127c("wrong_site_id")
    private final Integer wrongSiteId;

    public final String getCustomerCarColor() {
        return this.customerCarColor;
    }

    public final String getCustomerCarType() {
        return this.customerCarType;
    }

    public final String getCustomerLicensePlate() {
        return this.customerLicensePlate;
    }

    public final String getCustomerState() {
        return this.customerState;
    }

    public final String getEstimatedReadyAt() {
        return this.estimatedReadyAt;
    }

    public final String getEtaAt() {
        return this.etaAt;
    }

    public final String getFlybuyMessageType() {
        return this.flybuyMessageType;
    }

    public final String getForceSyncAppConfig() {
        return this.forceSyncAppConfig;
    }

    public final String getForceSyncNotifyCampaigns() {
        return this.forceSyncNotifyCampaigns;
    }

    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getLocationTrackingEnabled() {
        return this.locationTrackingEnabled;
    }

    public final String getMessageSource() {
        return this.messageSource;
    }

    public final String getOrderFiredAt() {
        return this.orderFiredAt;
    }

    public final String getOrderState() {
        return this.orderState;
    }

    public final String getPickupType() {
        return this.pickupType;
    }

    public final Integer getWrongSiteId() {
        return this.wrongSiteId;
    }

    public PushMessagePayload(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, Integer num2, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.messageSource = str;
        this.flybuyMessageType = str2;
        this.id = num;
        this.orderState = str3;
        this.customerState = str4;
        this.etaAt = str5;
        this.locationTrackingEnabled = str6;
        this.forceSyncAppConfig = str7;
        this.forceSyncNotifyCampaigns = str8;
        this.wrongSiteId = num2;
        this.estimatedReadyAt = str9;
        this.orderFiredAt = str10;
        this.pickupType = str11;
        this.customerCarColor = str12;
        this.customerCarType = str13;
        this.customerLicensePlate = str14;
        this.handoffVehicleLocation = str15;
    }
}
