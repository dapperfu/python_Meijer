package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JW\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/CustomerData;", "", "name", "", "phone", "carType", "carColor", "licensePlate", "termsOfService", "", "ageVerification", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAgeVerification", "()Z", "getCarColor", "()Ljava/lang/String;", "getCarType", "getLicensePlate", "getName", "getPhone", "getTermsOfService", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CustomerData {

    @InterfaceC15617c("age_verification")
    private final boolean ageVerification;

    @InterfaceC15617c("car_color")
    private final String carColor;

    @InterfaceC15617c("car_type")
    private final String carType;

    @InterfaceC15617c("license_plate")
    private final String licensePlate;
    private final String name;
    private final String phone;

    @InterfaceC15617c("terms_of_service")
    private final boolean termsOfService;

    public CustomerData(String name, String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        Intrinsics.j(name, "name");
        this.name = name;
        this.phone = str;
        this.carType = str2;
        this.carColor = str3;
        this.licensePlate = str4;
        this.termsOfService = z10;
        this.ageVerification = z11;
    }

    public static /* synthetic */ CustomerData copy$default(CustomerData customerData, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerData.name;
        }
        if ((i10 & 2) != 0) {
            str2 = customerData.phone;
        }
        if ((i10 & 4) != 0) {
            str3 = customerData.carType;
        }
        if ((i10 & 8) != 0) {
            str4 = customerData.carColor;
        }
        if ((i10 & 16) != 0) {
            str5 = customerData.licensePlate;
        }
        if ((i10 & 32) != 0) {
            z10 = customerData.termsOfService;
        }
        if ((i10 & 64) != 0) {
            z11 = customerData.ageVerification;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        String str6 = str5;
        String str7 = str3;
        return customerData.copy(str, str2, str7, str4, str6, z12, z13);
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

    /* renamed from: component6, reason: from getter */
    public final boolean getTermsOfService() {
        return this.termsOfService;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAgeVerification() {
        return this.ageVerification;
    }

    public final CustomerData copy(String name, String phone, String carType, String carColor, String licensePlate, boolean termsOfService, boolean ageVerification) {
        Intrinsics.j(name, "name");
        return new CustomerData(name, phone, carType, carColor, licensePlate, termsOfService, ageVerification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerData)) {
            return false;
        }
        CustomerData customerData = (CustomerData) other;
        return Intrinsics.e(this.name, customerData.name) && Intrinsics.e(this.phone, customerData.phone) && Intrinsics.e(this.carType, customerData.carType) && Intrinsics.e(this.carColor, customerData.carColor) && Intrinsics.e(this.licensePlate, customerData.licensePlate) && this.termsOfService == customerData.termsOfService && this.ageVerification == customerData.ageVerification;
    }

    public final boolean getAgeVerification() {
        return this.ageVerification;
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

    public final boolean getTermsOfService() {
        return this.termsOfService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.phone;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.carType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.carColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.licensePlate;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z10 = this.termsOfService;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode5 + i10) * 31;
        boolean z11 = this.ageVerification;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "CustomerData(name=" + this.name + ", phone=" + this.phone + ", carType=" + this.carType + ", carColor=" + this.carColor + ", licensePlate=" + this.licensePlate + ", termsOfService=" + this.termsOfService + ", ageVerification=" + this.ageVerification + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomerData(String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z12;
        boolean z13;
        String str6;
        str2 = (i10 & 2) != 0 ? null : str2;
        str3 = (i10 & 4) != 0 ? null : str3;
        str4 = (i10 & 8) != 0 ? null : str4;
        if ((i10 & 16) != 0) {
            z12 = z11;
            z13 = z10;
            str6 = null;
        } else {
            z12 = z11;
            z13 = z10;
            str6 = str5;
        }
        this(str, str2, str3, str4, str6, z13, z12);
    }
}
