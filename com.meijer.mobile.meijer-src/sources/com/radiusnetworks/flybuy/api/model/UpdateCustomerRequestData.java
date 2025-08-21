package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/UpdateCustomerRequestData;", "", "name", "", "phone", "carType", "carColor", "licensePlate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCarColor", "()Ljava/lang/String;", "getCarType", "getLicensePlate", "getName", "getPhone", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UpdateCustomerRequestData {

    @InterfaceC16127c("car_color")
    private final String carColor;

    @InterfaceC16127c("car_type")
    private final String carType;

    @InterfaceC16127c("license_plate")
    private final String licensePlate;
    private final String name;
    private final String phone;

    public UpdateCustomerRequestData(String name, String str, String str2, String str3, String str4) {
        Intrinsics.j(name, "name");
        this.name = name;
        this.phone = str;
        this.carType = str2;
        this.carColor = str3;
        this.licensePlate = str4;
    }

    public static /* synthetic */ UpdateCustomerRequestData copy$default(UpdateCustomerRequestData updateCustomerRequestData, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateCustomerRequestData.name;
        }
        if ((i10 & 2) != 0) {
            str2 = updateCustomerRequestData.phone;
        }
        if ((i10 & 4) != 0) {
            str3 = updateCustomerRequestData.carType;
        }
        if ((i10 & 8) != 0) {
            str4 = updateCustomerRequestData.carColor;
        }
        if ((i10 & 16) != 0) {
            str5 = updateCustomerRequestData.licensePlate;
        }
        String str6 = str5;
        String str7 = str3;
        return updateCustomerRequestData.copy(str, str2, str7, str4, str6);
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

    public final UpdateCustomerRequestData copy(String name, String phone, String carType, String carColor, String licensePlate) {
        Intrinsics.j(name, "name");
        return new UpdateCustomerRequestData(name, phone, carType, carColor, licensePlate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCustomerRequestData)) {
            return false;
        }
        UpdateCustomerRequestData updateCustomerRequestData = (UpdateCustomerRequestData) other;
        return Intrinsics.e(this.name, updateCustomerRequestData.name) && Intrinsics.e(this.phone, updateCustomerRequestData.phone) && Intrinsics.e(this.carType, updateCustomerRequestData.carType) && Intrinsics.e(this.carColor, updateCustomerRequestData.carColor) && Intrinsics.e(this.licensePlate, updateCustomerRequestData.licensePlate);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.phone;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.carType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.carColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.licensePlate;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "UpdateCustomerRequestData(name=" + this.name + ", phone=" + this.phone + ", carType=" + this.carType + ", carColor=" + this.carColor + ", licensePlate=" + this.licensePlate + ')';
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

    public /* synthetic */ UpdateCustomerRequestData(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
