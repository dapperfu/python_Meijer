package com.radiusnetworks.flybuy.sdk.manager.builder;

import com.radiusnetworks.flybuy.sdk.data.room.domain.PickupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001-B¥\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018¨\u0006."}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions;", "", "customerName", "", "customerPhone", "customerCarColor", "customerCarType", "customerCarLicensePlate", "partnerIdentifier", "pickupWindow", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "state", "pickupType", "spotIdentifier", "handoffVehicleLocation", "partnerIdentifierForCustomer", "partnerIdentifierForCrew", "disableOrderFire", "", "disablePromiseTimeScheduling", "orderFireMakeIntervalSeconds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getCustomerCarColor", "()Ljava/lang/String;", "getCustomerCarLicensePlate", "getCustomerCarType", "getCustomerName", "getCustomerPhone", "getDisableOrderFire", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisablePromiseTimeScheduling", "getHandoffVehicleLocation", "getOrderFireMakeIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPartnerIdentifier", "getPartnerIdentifierForCrew", "getPartnerIdentifierForCustomer", "getPickupType", "getPickupWindow", "()Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "getSpotIdentifier", "getState", "Builder", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderOptions {
    private final String customerCarColor;
    private final String customerCarLicensePlate;
    private final String customerCarType;
    private final String customerName;
    private final String customerPhone;
    private final Boolean disableOrderFire;
    private final Boolean disablePromiseTimeScheduling;
    private final String handoffVehicleLocation;
    private final Integer orderFireMakeIntervalSeconds;
    private final String partnerIdentifier;
    private final String partnerIdentifierForCrew;
    private final String partnerIdentifierForCustomer;
    private final String pickupType;
    private final PickupWindow pickupWindow;
    private final String spotIdentifier;
    private final String state;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0003J\u0010\u0010 \u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003J\u0015\u0010!\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\"J\u0010\u0010$\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0003J\u0015\u0010%\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003J\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003J\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003J\u0010\u0010*\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\u0010\u0010+\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003J\u0010\u0010-\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions$Builder;", "", "customerName", "", "(Ljava/lang/String;)V", "customerCarColor", "customerCarPlate", "customerCarType", "customerPhone", "disableOrderFire", "", "Ljava/lang/Boolean;", "disablePromiseTimeScheduling", "handoffVehicleLocation", "orderFireMakeIntervalSeconds", "", "Ljava/lang/Integer;", "partnerIdentifier", "partnerIdentifierForCrew", "partnerIdentifierForCustomer", "pickupType", "pickupWindow", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "spotIdentifier", "state", "build", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions;", "setCustomerCarColor", "setCustomerCarPlate", "setCustomerCarType", "setCustomerName", "name", "setCustomerPhone", "setDisableOrderFire", "(Ljava/lang/Boolean;)Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions$Builder;", "setDisablePromiseTimeScheduling", "setHandoffVehicleLocation", "setOrderFireMakeIntervalSeconds", "(Ljava/lang/Integer;)Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions$Builder;", "setPartnerIdentifier", "setPartnerIdentifierForCrew", "setPartnerIdentifierForCustomer", "setPickupType", "setPickupWindow", "setSpotIdentifier", "setState", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private String customerCarColor;
        private String customerCarPlate;
        private String customerCarType;
        private String customerName;
        private String customerPhone;
        private Boolean disableOrderFire;
        private Boolean disablePromiseTimeScheduling;
        private String handoffVehicleLocation;
        private Integer orderFireMakeIntervalSeconds;
        private String partnerIdentifier;
        private String partnerIdentifierForCrew;
        private String partnerIdentifierForCustomer;
        private String pickupType;
        private PickupWindow pickupWindow;
        private String spotIdentifier;
        private String state;

        public Builder(String customerName) {
            Intrinsics.j(customerName, "customerName");
            this.customerName = customerName;
            this.partnerIdentifier = "";
        }

        public final OrderOptions build() {
            return new OrderOptions(this.customerName, this.customerPhone, this.customerCarColor, this.customerCarType, this.customerCarPlate, this.partnerIdentifier, this.pickupWindow, this.state, this.pickupType, this.spotIdentifier, this.handoffVehicleLocation, this.partnerIdentifierForCustomer, this.partnerIdentifierForCrew, this.disableOrderFire, this.disablePromiseTimeScheduling, this.orderFireMakeIntervalSeconds, null);
        }

        public final Builder setCustomerCarColor(String customerCarColor) {
            this.customerCarColor = customerCarColor;
            return this;
        }

        public final Builder setCustomerCarPlate(String customerCarPlate) {
            this.customerCarPlate = customerCarPlate;
            return this;
        }

        public final Builder setCustomerCarType(String customerCarType) {
            this.customerCarType = customerCarType;
            return this;
        }

        public final Builder setCustomerName(String name) {
            Intrinsics.j(name, "name");
            this.customerName = name;
            return this;
        }

        public final Builder setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public final Builder setDisableOrderFire(Boolean disableOrderFire) {
            this.disableOrderFire = disableOrderFire;
            return this;
        }

        public final Builder setDisablePromiseTimeScheduling(Boolean disablePromiseTimeScheduling) {
            this.disablePromiseTimeScheduling = disablePromiseTimeScheduling;
            return this;
        }

        public final Builder setHandoffVehicleLocation(String handoffVehicleLocation) {
            this.handoffVehicleLocation = handoffVehicleLocation;
            return this;
        }

        public final Builder setOrderFireMakeIntervalSeconds(Integer orderFireMakeIntervalSeconds) {
            this.orderFireMakeIntervalSeconds = orderFireMakeIntervalSeconds;
            return this;
        }

        public final Builder setPartnerIdentifier(String partnerIdentifier) {
            if (partnerIdentifier == null) {
                partnerIdentifier = "";
            }
            this.partnerIdentifier = partnerIdentifier;
            return this;
        }

        public final Builder setPartnerIdentifierForCrew(String partnerIdentifierForCrew) {
            this.partnerIdentifierForCrew = partnerIdentifierForCrew;
            return this;
        }

        public final Builder setPartnerIdentifierForCustomer(String partnerIdentifierForCustomer) {
            this.partnerIdentifierForCustomer = partnerIdentifierForCustomer;
            return this;
        }

        public final Builder setPickupType(String pickupType) {
            this.pickupType = pickupType;
            return this;
        }

        public final Builder setPickupWindow(PickupWindow pickupWindow) {
            this.pickupWindow = pickupWindow;
            return this;
        }

        public final Builder setSpotIdentifier(String spotIdentifier) {
            this.spotIdentifier = spotIdentifier;
            return this;
        }

        public final Builder setState(String state) {
            this.state = state;
            return this;
        }
    }

    public /* synthetic */ OrderOptions(String str, String str2, String str3, String str4, String str5, String str6, PickupWindow pickupWindow, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, Boolean bool2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, pickupWindow, str7, str8, str9, str10, str11, str12, bool, bool2, num);
    }

    private OrderOptions(String str, String str2, String str3, String str4, String str5, String str6, PickupWindow pickupWindow, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, Boolean bool2, Integer num) {
        this.customerName = str;
        this.customerPhone = str2;
        this.customerCarColor = str3;
        this.customerCarType = str4;
        this.customerCarLicensePlate = str5;
        this.partnerIdentifier = str6;
        this.pickupWindow = pickupWindow;
        this.state = str7;
        this.pickupType = str8;
        this.spotIdentifier = str9;
        this.handoffVehicleLocation = str10;
        this.partnerIdentifierForCustomer = str11;
        this.partnerIdentifierForCrew = str12;
        this.disableOrderFire = bool;
        this.disablePromiseTimeScheduling = bool2;
        this.orderFireMakeIntervalSeconds = num;
    }

    public final String getCustomerCarColor() {
        return this.customerCarColor;
    }

    public final String getCustomerCarLicensePlate() {
        return this.customerCarLicensePlate;
    }

    public final String getCustomerCarType() {
        return this.customerCarType;
    }

    public final String getCustomerName() {
        return this.customerName;
    }

    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    public final Boolean getDisableOrderFire() {
        return this.disableOrderFire;
    }

    public final Boolean getDisablePromiseTimeScheduling() {
        return this.disablePromiseTimeScheduling;
    }

    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    public final Integer getOrderFireMakeIntervalSeconds() {
        return this.orderFireMakeIntervalSeconds;
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

    public final String getPickupType() {
        return this.pickupType;
    }

    public final PickupWindow getPickupWindow() {
        return this.pickupWindow;
    }

    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    public final String getState() {
        return this.state;
    }

    public /* synthetic */ OrderOptions(String str, String str2, String str3, String str4, String str5, String str6, PickupWindow pickupWindow, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, Boolean bool2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? "" : str6, pickupWindow, str7, str8, str9, str10, str11, str12, bool, bool2, num);
    }
}
