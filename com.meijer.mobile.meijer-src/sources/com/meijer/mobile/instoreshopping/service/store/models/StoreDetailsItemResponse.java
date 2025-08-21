package com.meijer.mobile.instoreshopping.service.store.models;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b)\b\u0081\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u0004\u0012\b\b\u0003\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\t\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018Jº\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\t2\b\b\u0003\u0010\u000f\u001a\u00020\u00042\b\b\u0003\u0010\u0010\u001a\u00020\u00042\b\b\u0003\u0010\u0011\u001a\u00020\u00042\b\b\u0003\u0010\u0013\u001a\u00020\u00122\b\b\u0003\u0010\u0014\u001a\u00020\u00042\b\b\u0003\u0010\u0015\u001a\u00020\u00042\b\b\u0003\u0010\u0016\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010&\u001a\u0004\b\"\u0010\u001c\"\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b%\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b(\u00100R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b1\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b+\u00100R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b:\u0010\u001cR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b9\u0010\u001c¨\u0006;"}, d2 = {"Lcom/meijer/mobile/instoreshopping/service/store/models/StoreDetailsItemResponse;", "", "", "storeId", "", "streetAddress", "city", "stateCode", "zip", "", "latitude", "longitude", "storeHours", "storeName", "milesFrom", "storeShortName", "storePhoneNumber", "pharmacyPhone", "", "isPharmacy", "storeTypeCode", "isMobileShoppingEnabled", "isMobilePaymentEnabled", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/instoreshopping/service/store/models/StoreDetailsItemResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "h", "b", "Ljava/lang/String;", "m", "c", "setCity", "(Ljava/lang/String;)V", "d", "f", "e", "n", "D", "()D", "g", "i", "j", "k", "l", "Z", "q", "()Z", "o", "p", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class StoreDetailsItemResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String city;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stateCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double latitude;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double longitude;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeHours;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final double milesFrom;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeShortName;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storePhoneNumber;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyPhone;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPharmacy;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeTypeCode;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isMobileShoppingEnabled;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isMobilePaymentEnabled;

    public StoreDetailsItemResponse() {
        this(0, null, null, null, null, 0.0d, 0.0d, null, null, 0.0d, null, null, null, false, null, null, null, 131071, null);
    }

    public final StoreDetailsItemResponse copy(@g(name = "unitid") int storeId, @g(name = "streetAddress") String streetAddress, @g(name = "city") String city, @g(name = "state") String stateCode, @g(name = "zip") String zip, @g(name = "latitude") double latitude, @g(name = "longitude") double longitude, @g(name = "storeHours") String storeHours, @g(name = "storeName") String storeName, @g(name = "milesFrom") double milesFrom, @g(name = "storeShortName") String storeShortName, @g(name = "storePhoneNumber") String storePhoneNumber, @g(name = "pharmacyPhone") String pharmacyPhone, @g(name = "isPharmacy") boolean isPharmacy, @g(name = "UnitType") String storeTypeCode, @g(name = "IsMobileShoppingEnabled") String isMobileShoppingEnabled, @g(name = "IsMobilePaymentEnabled") String isMobilePaymentEnabled) {
        Intrinsics.j(streetAddress, "streetAddress");
        Intrinsics.j(city, "city");
        Intrinsics.j(stateCode, "stateCode");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(storeHours, "storeHours");
        Intrinsics.j(storeName, "storeName");
        Intrinsics.j(storeShortName, "storeShortName");
        Intrinsics.j(storePhoneNumber, "storePhoneNumber");
        Intrinsics.j(pharmacyPhone, "pharmacyPhone");
        Intrinsics.j(storeTypeCode, "storeTypeCode");
        Intrinsics.j(isMobileShoppingEnabled, "isMobileShoppingEnabled");
        Intrinsics.j(isMobilePaymentEnabled, "isMobilePaymentEnabled");
        return new StoreDetailsItemResponse(storeId, streetAddress, city, stateCode, zip, latitude, longitude, storeHours, storeName, milesFrom, storeShortName, storePhoneNumber, pharmacyPhone, isPharmacy, storeTypeCode, isMobileShoppingEnabled, isMobilePaymentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreDetailsItemResponse)) {
            return false;
        }
        StoreDetailsItemResponse storeDetailsItemResponse = (StoreDetailsItemResponse) other;
        return this.storeId == storeDetailsItemResponse.storeId && Intrinsics.e(this.streetAddress, storeDetailsItemResponse.streetAddress) && Intrinsics.e(this.city, storeDetailsItemResponse.city) && Intrinsics.e(this.stateCode, storeDetailsItemResponse.stateCode) && Intrinsics.e(this.zip, storeDetailsItemResponse.zip) && Double.compare(this.latitude, storeDetailsItemResponse.latitude) == 0 && Double.compare(this.longitude, storeDetailsItemResponse.longitude) == 0 && Intrinsics.e(this.storeHours, storeDetailsItemResponse.storeHours) && Intrinsics.e(this.storeName, storeDetailsItemResponse.storeName) && Double.compare(this.milesFrom, storeDetailsItemResponse.milesFrom) == 0 && Intrinsics.e(this.storeShortName, storeDetailsItemResponse.storeShortName) && Intrinsics.e(this.storePhoneNumber, storeDetailsItemResponse.storePhoneNumber) && Intrinsics.e(this.pharmacyPhone, storeDetailsItemResponse.pharmacyPhone) && this.isPharmacy == storeDetailsItemResponse.isPharmacy && Intrinsics.e(this.storeTypeCode, storeDetailsItemResponse.storeTypeCode) && Intrinsics.e(this.isMobileShoppingEnabled, storeDetailsItemResponse.isMobileShoppingEnabled) && Intrinsics.e(this.isMobilePaymentEnabled, storeDetailsItemResponse.isMobilePaymentEnabled);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((Integer.hashCode(this.storeId) * 31) + this.streetAddress.hashCode()) * 31) + this.city.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.zip.hashCode()) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31) + this.storeHours.hashCode()) * 31) + this.storeName.hashCode()) * 31) + Double.hashCode(this.milesFrom)) * 31) + this.storeShortName.hashCode()) * 31) + this.storePhoneNumber.hashCode()) * 31) + this.pharmacyPhone.hashCode()) * 31) + Boolean.hashCode(this.isPharmacy)) * 31) + this.storeTypeCode.hashCode()) * 31) + this.isMobileShoppingEnabled.hashCode()) * 31) + this.isMobilePaymentEnabled.hashCode();
    }

    public String toString() {
        return "StoreDetailsItemResponse(storeId=" + this.storeId + ", streetAddress=" + this.streetAddress + ", city=" + this.city + ", stateCode=" + this.stateCode + ", zip=" + this.zip + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", storeHours=" + this.storeHours + ", storeName=" + this.storeName + ", milesFrom=" + this.milesFrom + ", storeShortName=" + this.storeShortName + ", storePhoneNumber=" + this.storePhoneNumber + ", pharmacyPhone=" + this.pharmacyPhone + ", isPharmacy=" + this.isPharmacy + ", storeTypeCode=" + this.storeTypeCode + ", isMobileShoppingEnabled=" + this.isMobileShoppingEnabled + ", isMobilePaymentEnabled=" + this.isMobilePaymentEnabled + ')';
    }

    public StoreDetailsItemResponse(@g(name = "unitid") int i10, @g(name = "streetAddress") String streetAddress, @g(name = "city") String city, @g(name = "state") String stateCode, @g(name = "zip") String zip, @g(name = "latitude") double d10, @g(name = "longitude") double d11, @g(name = "storeHours") String storeHours, @g(name = "storeName") String storeName, @g(name = "milesFrom") double d12, @g(name = "storeShortName") String storeShortName, @g(name = "storePhoneNumber") String storePhoneNumber, @g(name = "pharmacyPhone") String pharmacyPhone, @g(name = "isPharmacy") boolean z10, @g(name = "UnitType") String storeTypeCode, @g(name = "IsMobileShoppingEnabled") String isMobileShoppingEnabled, @g(name = "IsMobilePaymentEnabled") String isMobilePaymentEnabled) {
        Intrinsics.j(streetAddress, "streetAddress");
        Intrinsics.j(city, "city");
        Intrinsics.j(stateCode, "stateCode");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(storeHours, "storeHours");
        Intrinsics.j(storeName, "storeName");
        Intrinsics.j(storeShortName, "storeShortName");
        Intrinsics.j(storePhoneNumber, "storePhoneNumber");
        Intrinsics.j(pharmacyPhone, "pharmacyPhone");
        Intrinsics.j(storeTypeCode, "storeTypeCode");
        Intrinsics.j(isMobileShoppingEnabled, "isMobileShoppingEnabled");
        Intrinsics.j(isMobilePaymentEnabled, "isMobilePaymentEnabled");
        this.storeId = i10;
        this.streetAddress = streetAddress;
        this.city = city;
        this.stateCode = stateCode;
        this.zip = zip;
        this.latitude = d10;
        this.longitude = d11;
        this.storeHours = storeHours;
        this.storeName = storeName;
        this.milesFrom = d12;
        this.storeShortName = storeShortName;
        this.storePhoneNumber = storePhoneNumber;
        this.pharmacyPhone = pharmacyPhone;
        this.isPharmacy = z10;
        this.storeTypeCode = storeTypeCode;
        this.isMobileShoppingEnabled = isMobileShoppingEnabled;
        this.isMobilePaymentEnabled = isMobilePaymentEnabled;
    }

    /* renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: b, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: c, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: d, reason: from getter */
    public final double getMilesFrom() {
        return this.milesFrom;
    }

    /* renamed from: e, reason: from getter */
    public final String getPharmacyPhone() {
        return this.pharmacyPhone;
    }

    /* renamed from: f, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* renamed from: g, reason: from getter */
    public final String getStoreHours() {
        return this.storeHours;
    }

    /* renamed from: h, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: i, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: j, reason: from getter */
    public final String getStorePhoneNumber() {
        return this.storePhoneNumber;
    }

    /* renamed from: k, reason: from getter */
    public final String getStoreShortName() {
        return this.storeShortName;
    }

    /* renamed from: l, reason: from getter */
    public final String getStoreTypeCode() {
        return this.storeTypeCode;
    }

    /* renamed from: m, reason: from getter */
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    /* renamed from: n, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: o, reason: from getter */
    public final String getIsMobilePaymentEnabled() {
        return this.isMobilePaymentEnabled;
    }

    /* renamed from: p, reason: from getter */
    public final String getIsMobileShoppingEnabled() {
        return this.isMobileShoppingEnabled;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsPharmacy() {
        return this.isPharmacy;
    }

    public /* synthetic */ StoreDetailsItemResponse(int i10, String str, String str2, String str3, String str4, double d10, double d11, String str5, String str6, double d12, String str7, String str8, String str9, boolean z10, String str10, String str11, String str12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? 0.0d : d10, (i11 & 64) != 0 ? 0.0d : d11, (i11 & 128) != 0 ? "" : str5, (i11 & 256) != 0 ? "" : str6, (i11 & 512) == 0 ? d12 : 0.0d, (i11 & 1024) != 0 ? "" : str7, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str8, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "" : str9, (i11 & 8192) != 0 ? false : z10, (i11 & 16384) != 0 ? "" : str10, (i11 & 32768) != 0 ? "" : str11, (i11 & 65536) != 0 ? "" : str12);
    }
}
