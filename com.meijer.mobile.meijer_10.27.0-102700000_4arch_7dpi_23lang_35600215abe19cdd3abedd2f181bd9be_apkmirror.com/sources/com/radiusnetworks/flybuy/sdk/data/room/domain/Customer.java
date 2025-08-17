package com.radiusnetworks.flybuy.sdk.data.room.domain;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001Bk\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fB\u000f\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u0006 "}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "", PreferencesHelper.PREF_ID, "", "apiToken", "", "createdAt", "updatedAt", "deletedAt", "email", "name", "phone", "carType", "carColor", "licensePlate", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "customer", "Lcom/radiusnetworks/flybuy/api/model/Customer;", "(Lcom/radiusnetworks/flybuy/api/model/Customer;)V", "getApiToken", "()Ljava/lang/String;", "getCarColor", "getCarType", "getCreatedAt", "getDeletedAt", "getEmail", "getId", "()I", "getLicensePlate", "getName", "getPhone", "getUpdatedAt", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Customer {
    private final String apiToken;
    private final String carColor;
    private final String carType;
    private final String createdAt;
    private final String deletedAt;
    private final String email;
    private final int id;
    private final String licensePlate;
    private final String name;
    private final String phone;
    private final String updatedAt;

    public Customer(int i10, String apiToken, String createdAt, String updatedAt, String str, String str2, String name, String str3, String str4, String str5, String str6) {
        Intrinsics.j(apiToken, "apiToken");
        Intrinsics.j(createdAt, "createdAt");
        Intrinsics.j(updatedAt, "updatedAt");
        Intrinsics.j(name, "name");
        this.id = i10;
        this.apiToken = apiToken;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = str;
        this.email = str2;
        this.name = name;
        this.phone = str3;
        this.carType = str4;
        this.carColor = str5;
        this.licensePlate = str6;
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

    public Customer(com.radiusnetworks.flybuy.api.model.Customer customer) {
        Intrinsics.j(customer, "customer");
        this.id = customer.getId();
        this.apiToken = customer.getApiToken();
        this.createdAt = customer.getCreatedAt();
        this.updatedAt = customer.getUpdatedAt();
        this.deletedAt = customer.getDeletedAt();
        this.email = customer.getEmail();
        this.name = customer.getName();
        this.phone = customer.getPhone();
        this.carType = customer.getCarType();
        this.carColor = customer.getCarColor();
        this.licensePlate = customer.getLicensePlate();
    }
}
