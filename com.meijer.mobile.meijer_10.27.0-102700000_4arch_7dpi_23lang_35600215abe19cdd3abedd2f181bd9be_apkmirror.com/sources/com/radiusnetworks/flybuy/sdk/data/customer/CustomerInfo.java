package com.radiusnetworks.flybuy.sdk.data.customer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\""}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "", "name", "", "phone", "carType", "carColor", "licensePlate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCarColor", "()Ljava/lang/String;", "setCarColor", "(Ljava/lang/String;)V", "getCarType", "setCarType", "getLicensePlate", "setLicensePlate", "getName", "setName", "getPhone", "setPhone", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Builder", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CustomerInfo {
    private String carColor;
    private String carType;
    private String licensePlate;
    private String name;
    private String phone;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo$Builder;", "", "name", "", "(Ljava/lang/String;)V", "carColor", "carType", "licensePlate", "getName", "()Ljava/lang/String;", "phone", "build", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "setCarColor", "setCarType", "setLicensePlate", "setPhone", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private String carColor;
        private String carType;
        private String licensePlate;
        private final String name;
        private String phone;

        public Builder(String name) {
            Intrinsics.j(name, "name");
            this.name = name;
        }

        public final CustomerInfo build() {
            String str;
            String str2;
            String str3 = this.name;
            String str4 = this.phone;
            String str5 = this.carType;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = this.carColor;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = this.licensePlate;
            if (str7 == null) {
                String str8 = str6;
                str2 = "";
                str = str8;
            } else {
                str = str6;
                str2 = str7;
            }
            return new CustomerInfo(str3, str4, str5, str, str2);
        }

        public final String getName() {
            return this.name;
        }

        public final Builder setCarColor(String carColor) {
            this.carColor = carColor;
            return this;
        }

        public final Builder setCarType(String carType) {
            this.carType = carType;
            return this;
        }

        public final Builder setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public final Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
    }

    public CustomerInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CustomerInfo copy$default(CustomerInfo customerInfo, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerInfo.name;
        }
        if ((i10 & 2) != 0) {
            str2 = customerInfo.phone;
        }
        if ((i10 & 4) != 0) {
            str3 = customerInfo.carType;
        }
        if ((i10 & 8) != 0) {
            str4 = customerInfo.carColor;
        }
        if ((i10 & 16) != 0) {
            str5 = customerInfo.licensePlate;
        }
        String str6 = str5;
        String str7 = str3;
        return customerInfo.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCarType() {
        return this.carType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCarColor() {
        return this.carColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLicensePlate() {
        return this.licensePlate;
    }

    public final CustomerInfo copy(String name, String phone, String carType, String carColor, String licensePlate) {
        Intrinsics.j(name, "name");
        Intrinsics.j(carType, "carType");
        Intrinsics.j(carColor, "carColor");
        Intrinsics.j(licensePlate, "licensePlate");
        return new CustomerInfo(name, phone, carType, carColor, licensePlate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerInfo)) {
            return false;
        }
        CustomerInfo customerInfo = (CustomerInfo) other;
        return Intrinsics.e(this.name, customerInfo.name) && Intrinsics.e(this.phone, customerInfo.phone) && Intrinsics.e(this.carType, customerInfo.carType) && Intrinsics.e(this.carColor, customerInfo.carColor) && Intrinsics.e(this.licensePlate, customerInfo.licensePlate);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.phone;
        return this.licensePlate.hashCode() + ((this.carColor.hashCode() + ((this.carType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "CustomerInfo(name=" + this.name + ", phone=" + this.phone + ", carType=" + this.carType + ", carColor=" + this.carColor + ", licensePlate=" + this.licensePlate + ')';
    }

    public CustomerInfo(String name, String str, String carType, String carColor, String licensePlate) {
        Intrinsics.j(name, "name");
        Intrinsics.j(carType, "carType");
        Intrinsics.j(carColor, "carColor");
        Intrinsics.j(licensePlate, "licensePlate");
        this.name = name;
        this.phone = str;
        this.carType = carType;
        this.carColor = carColor;
        this.licensePlate = licensePlate;
    }

    public final String getCarColor() {
        return this.carColor;
    }

    public final String getCarType() {
        return this.carType;
    }

    public final String getLicensePlate() {
        return this.licensePlate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final void setCarColor(String str) {
        Intrinsics.j(str, "<set-?>");
        this.carColor = str;
    }

    public final void setCarType(String str) {
        Intrinsics.j(str, "<set-?>");
        this.carType = str;
    }

    public final void setLicensePlate(String str) {
        Intrinsics.j(str, "<set-?>");
        this.licensePlate = str;
    }

    public final void setName(String str) {
        Intrinsics.j(str, "<set-?>");
        this.name = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public /* synthetic */ CustomerInfo(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5);
    }
}
