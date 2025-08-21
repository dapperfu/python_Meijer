package com.radiusnetworks.flybuy.sdk.manager.builder;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u000fB7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/PickupMethodOptions;", "", "pickupType", "", "customerCarColor", "customerCarType", "customerLicensePlate", "handoffVehicleLocation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerCarColor", "()Ljava/lang/String;", "getCustomerCarType", "getCustomerLicensePlate", "getHandoffVehicleLocation", "getPickupType", "Builder", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PickupMethodOptions {
    private final String customerCarColor;
    private final String customerCarType;
    private final String customerLicensePlate;
    private final String handoffVehicleLocation;
    private final String pickupType;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/PickupMethodOptions$Builder;", "", "pickupType", "", "(Ljava/lang/String;)V", "customerCarColor", "customerCarType", "customerLicensePlate", "handoffVehicleLocation", "getPickupType", "()Ljava/lang/String;", "build", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/PickupMethodOptions;", "setCustomerCarColor", "setCustomerCarType", "setCustomerLicensePlate", "customerCarPlate", "setHandoffVehicleLocation", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private String customerCarColor;
        private String customerCarType;
        private String customerLicensePlate;
        private String handoffVehicleLocation;
        private final String pickupType;

        public Builder(String pickupType) {
            Intrinsics.j(pickupType, "pickupType");
            this.pickupType = pickupType;
        }

        public final PickupMethodOptions build() {
            return new PickupMethodOptions(this.pickupType, this.customerCarColor, this.customerCarType, this.customerLicensePlate, this.handoffVehicleLocation, null);
        }

        public final String getPickupType() {
            return this.pickupType;
        }

        public final Builder setCustomerCarColor(String customerCarColor) {
            this.customerCarColor = customerCarColor;
            return this;
        }

        public final Builder setCustomerCarType(String customerCarType) {
            this.customerCarType = customerCarType;
            return this;
        }

        public final Builder setCustomerLicensePlate(String customerCarPlate) {
            this.customerLicensePlate = customerCarPlate;
            return this;
        }

        public final Builder setHandoffVehicleLocation(String handoffVehicleLocation) {
            this.handoffVehicleLocation = handoffVehicleLocation;
            return this;
        }
    }

    public /* synthetic */ PickupMethodOptions(String str, String str2, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5);
    }

    private PickupMethodOptions(String str, String str2, String str3, String str4, String str5) {
        this.pickupType = str;
        this.customerCarColor = str2;
        this.customerCarType = str3;
        this.customerLicensePlate = str4;
        this.handoffVehicleLocation = str5;
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

    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    public final String getPickupType() {
        return this.pickupType;
    }
}
