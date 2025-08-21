package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0081\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006."}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/Customer;", "", PreferencesHelper.PREF_ID, "", "apiToken", "", "createdAt", "updatedAt", "deletedAt", "email", "name", "phone", "carType", "carColor", "licensePlate", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiToken", "()Ljava/lang/String;", "getCarColor", "getCarType", "getCreatedAt", "getDeletedAt", "getEmail", "getId", "()I", "getLicensePlate", "getName", "getPhone", "getUpdatedAt", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Customer {

    @InterfaceC16127c("api_token")
    private final String apiToken;

    @InterfaceC16127c("car_color")
    private final String carColor;

    @InterfaceC16127c("car_type")
    private final String carType;

    @InterfaceC16127c("created_at")
    private final String createdAt;

    @InterfaceC16127c("deleted_at")
    private final String deletedAt;
    private final String email;
    private final int id;

    @InterfaceC16127c("license_plate")
    private final String licensePlate;
    private final String name;
    private final String phone;

    @InterfaceC16127c("updated_at")
    private final String updatedAt;

    public Customer(int i10, String apiToken, String createdAt, String updatedAt, String deletedAt, String str, String name, String str2, String str3, String str4, String str5) {
        Intrinsics.j(apiToken, "apiToken");
        Intrinsics.j(createdAt, "createdAt");
        Intrinsics.j(updatedAt, "updatedAt");
        Intrinsics.j(deletedAt, "deletedAt");
        Intrinsics.j(name, "name");
        this.id = i10;
        this.apiToken = apiToken;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.email = str;
        this.name = name;
        this.phone = str2;
        this.carType = str3;
        this.carColor = str4;
        this.licensePlate = str5;
    }

    public static /* synthetic */ Customer copy$default(Customer customer, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = customer.id;
        }
        if ((i11 & 2) != 0) {
            str = customer.apiToken;
        }
        if ((i11 & 4) != 0) {
            str2 = customer.createdAt;
        }
        if ((i11 & 8) != 0) {
            str3 = customer.updatedAt;
        }
        if ((i11 & 16) != 0) {
            str4 = customer.deletedAt;
        }
        if ((i11 & 32) != 0) {
            str5 = customer.email;
        }
        if ((i11 & 64) != 0) {
            str6 = customer.name;
        }
        if ((i11 & 128) != 0) {
            str7 = customer.phone;
        }
        if ((i11 & 256) != 0) {
            str8 = customer.carType;
        }
        if ((i11 & 512) != 0) {
            str9 = customer.carColor;
        }
        if ((i11 & 1024) != 0) {
            str10 = customer.licensePlate;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str4;
        String str18 = str2;
        return customer.copy(i10, str, str18, str3, str17, str15, str16, str13, str14, str11, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCarColor() {
        return this.carColor;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLicensePlate() {
        return this.licensePlate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApiToken() {
        return this.apiToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeletedAt() {
        return this.deletedAt;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCarType() {
        return this.carType;
    }

    public final Customer copy(int id2, String apiToken, String createdAt, String updatedAt, String deletedAt, String email, String name, String phone, String carType, String carColor, String licensePlate) {
        Intrinsics.j(apiToken, "apiToken");
        Intrinsics.j(createdAt, "createdAt");
        Intrinsics.j(updatedAt, "updatedAt");
        Intrinsics.j(deletedAt, "deletedAt");
        Intrinsics.j(name, "name");
        return new Customer(id2, apiToken, createdAt, updatedAt, deletedAt, email, name, phone, carType, carColor, licensePlate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) other;
        return this.id == customer.id && Intrinsics.e(this.apiToken, customer.apiToken) && Intrinsics.e(this.createdAt, customer.createdAt) && Intrinsics.e(this.updatedAt, customer.updatedAt) && Intrinsics.e(this.deletedAt, customer.deletedAt) && Intrinsics.e(this.email, customer.email) && Intrinsics.e(this.name, customer.name) && Intrinsics.e(this.phone, customer.phone) && Intrinsics.e(this.carType, customer.carType) && Intrinsics.e(this.carColor, customer.carColor) && Intrinsics.e(this.licensePlate, customer.licensePlate);
    }

    public String toString() {
        return "Customer(id=" + this.id + ", apiToken=" + this.apiToken + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", deletedAt=" + this.deletedAt + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ", carType=" + this.carType + ", carColor=" + this.carColor + ", licensePlate=" + this.licensePlate + ')';
    }

    public final String getApiToken() {
        return this.apiToken;
    }

    public final String getCarColor() {
        return this.carColor;
    }

    public final String getCarType() {
        return this.carType;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDeletedAt() {
        return this.deletedAt;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getId() {
        return this.id;
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

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iA = a.a(this.deletedAt, a.a(this.updatedAt, a.a(this.createdAt, a.a(this.apiToken, Integer.hashCode(this.id) * 31, 31), 31), 31), 31);
        String str = this.email;
        int iA2 = a.a(this.name, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.phone;
        int iHashCode = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.carType;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.carColor;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.licensePlate;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public /* synthetic */ Customer(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, str4, (i11 & 32) != 0 ? null : str5, str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : str9, (i11 & 1024) != 0 ? null : str10);
    }
}
