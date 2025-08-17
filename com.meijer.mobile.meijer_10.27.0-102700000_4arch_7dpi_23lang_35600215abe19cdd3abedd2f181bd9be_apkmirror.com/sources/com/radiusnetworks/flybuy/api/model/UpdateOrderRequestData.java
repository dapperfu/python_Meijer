package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/UpdateOrderRequestData;", "", "siteId", "", "customerName", "", "customerPhone", "customerCarColor", "customerCarType", "partnerIdentifier", "pushToken", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerCarColor", "()Ljava/lang/String;", "getCustomerCarType", "getCustomerName", "getCustomerPhone", "getPartnerIdentifier", "getPushToken", "getSiteId", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateOrderRequestData {

    @InterfaceC15617c("customer_car_color")
    private final String customerCarColor;

    @InterfaceC15617c("customer_car_type")
    private final String customerCarType;

    @InterfaceC15617c("customer_name")
    private final String customerName;

    @InterfaceC15617c("customer_phone")
    private final String customerPhone;

    @InterfaceC15617c("partner_identifier")
    private final String partnerIdentifier;

    @InterfaceC15617c("push_token")
    private final String pushToken;

    @InterfaceC15617c("site_id")
    private final int siteId;

    public UpdateOrderRequestData(int i10, String str, String str2, String str3, String str4, String str5, String str6) {
        this.siteId = i10;
        this.customerName = str;
        this.customerPhone = str2;
        this.customerCarColor = str3;
        this.customerCarType = str4;
        this.partnerIdentifier = str5;
        this.pushToken = str6;
    }

    public static /* synthetic */ UpdateOrderRequestData copy$default(UpdateOrderRequestData updateOrderRequestData, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = updateOrderRequestData.siteId;
        }
        if ((i11 & 2) != 0) {
            str = updateOrderRequestData.customerName;
        }
        if ((i11 & 4) != 0) {
            str2 = updateOrderRequestData.customerPhone;
        }
        if ((i11 & 8) != 0) {
            str3 = updateOrderRequestData.customerCarColor;
        }
        if ((i11 & 16) != 0) {
            str4 = updateOrderRequestData.customerCarType;
        }
        if ((i11 & 32) != 0) {
            str5 = updateOrderRequestData.partnerIdentifier;
        }
        if ((i11 & 64) != 0) {
            str6 = updateOrderRequestData.pushToken;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return updateOrderRequestData.copy(i10, str, str10, str3, str9, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSiteId() {
        return this.siteId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCustomerCarColor() {
        return this.customerCarColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomerCarType() {
        return this.customerCarType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    public final UpdateOrderRequestData copy(int siteId, String customerName, String customerPhone, String customerCarColor, String customerCarType, String partnerIdentifier, String pushToken) {
        return new UpdateOrderRequestData(siteId, customerName, customerPhone, customerCarColor, customerCarType, partnerIdentifier, pushToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateOrderRequestData)) {
            return false;
        }
        UpdateOrderRequestData updateOrderRequestData = (UpdateOrderRequestData) other;
        return this.siteId == updateOrderRequestData.siteId && Intrinsics.e(this.customerName, updateOrderRequestData.customerName) && Intrinsics.e(this.customerPhone, updateOrderRequestData.customerPhone) && Intrinsics.e(this.customerCarColor, updateOrderRequestData.customerCarColor) && Intrinsics.e(this.customerCarType, updateOrderRequestData.customerCarType) && Intrinsics.e(this.partnerIdentifier, updateOrderRequestData.partnerIdentifier) && Intrinsics.e(this.pushToken, updateOrderRequestData.pushToken);
    }

    public final String getCustomerCarColor() {
        return this.customerCarColor;
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

    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final int getSiteId() {
        return this.siteId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.siteId) * 31;
        String str = this.customerName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerPhone;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerCarColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerCarType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.partnerIdentifier;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pushToken;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "UpdateOrderRequestData(siteId=" + this.siteId + ", customerName=" + this.customerName + ", customerPhone=" + this.customerPhone + ", customerCarColor=" + this.customerCarColor + ", customerCarType=" + this.customerCarType + ", partnerIdentifier=" + this.partnerIdentifier + ", pushToken=" + this.pushToken + ')';
    }

    public /* synthetic */ UpdateOrderRequestData(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6);
    }
}
