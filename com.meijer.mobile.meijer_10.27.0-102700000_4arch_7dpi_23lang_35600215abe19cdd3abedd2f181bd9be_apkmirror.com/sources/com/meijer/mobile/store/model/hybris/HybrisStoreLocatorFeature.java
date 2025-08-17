package com.meijer.mobile.store.model.hybris;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b#\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisStoreLocatorFeature;", "", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", PlaceTypes.ADDRESS, "Lcom/meijer/mobile/store/model/hybris/HybrisOpeningSchedule;", "openingSchedule", "", "phone", "storeFeaturePickUpType", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeaturePickUpTypeData;", "storeFeaturePickUpTypeData", "storeFeatureServiceType", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeatureServiceTypeData;", "storeFeatureServiceTypeData", "<init>", "(Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;Lcom/meijer/mobile/store/model/hybris/HybrisOpeningSchedule;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeaturePickUpTypeData;Ljava/lang/String;Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeatureServiceTypeData;)V", "copy", "(Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;Lcom/meijer/mobile/store/model/hybris/HybrisOpeningSchedule;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeaturePickUpTypeData;Ljava/lang/String;Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeatureServiceTypeData;)Lcom/meijer/mobile/store/model/hybris/HybrisStoreLocatorFeature;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", "()Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", "b", "Lcom/meijer/mobile/store/model/hybris/HybrisOpeningSchedule;", "()Lcom/meijer/mobile/store/model/hybris/HybrisOpeningSchedule;", "c", "Ljava/lang/String;", "d", "e", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeaturePickUpTypeData;", "()Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeaturePickUpTypeData;", "f", "g", "Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeatureServiceTypeData;", "()Lcom/meijer/mobile/store/model/hybris/HybrisStoreFeatureServiceTypeData;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisStoreLocatorFeature {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisStoreAddress address;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisOpeningSchedule openingSchedule;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeFeaturePickUpType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisStoreFeaturePickUpTypeData storeFeaturePickUpTypeData;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeFeatureServiceType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisStoreFeatureServiceTypeData storeFeatureServiceTypeData;

    public HybrisStoreLocatorFeature(@g(name = PlaceTypes.ADDRESS) HybrisStoreAddress address, @g(name = "openingSchedule") HybrisOpeningSchedule hybrisOpeningSchedule, @g(name = "phone") String str, @g(name = "storeFeaturePickUpType") String str2, @g(name = "storeFeaturePickUpTypeData") HybrisStoreFeaturePickUpTypeData hybrisStoreFeaturePickUpTypeData, @g(name = "storeFeatureServiceType") String str3, @g(name = "storeFeatureServiceTypeData") HybrisStoreFeatureServiceTypeData hybrisStoreFeatureServiceTypeData) {
        Intrinsics.j(address, "address");
        this.address = address;
        this.openingSchedule = hybrisOpeningSchedule;
        this.phone = str;
        this.storeFeaturePickUpType = str2;
        this.storeFeaturePickUpTypeData = hybrisStoreFeaturePickUpTypeData;
        this.storeFeatureServiceType = str3;
        this.storeFeatureServiceTypeData = hybrisStoreFeatureServiceTypeData;
    }

    public final HybrisStoreLocatorFeature copy(@g(name = PlaceTypes.ADDRESS) HybrisStoreAddress address, @g(name = "openingSchedule") HybrisOpeningSchedule openingSchedule, @g(name = "phone") String phone, @g(name = "storeFeaturePickUpType") String storeFeaturePickUpType, @g(name = "storeFeaturePickUpTypeData") HybrisStoreFeaturePickUpTypeData storeFeaturePickUpTypeData, @g(name = "storeFeatureServiceType") String storeFeatureServiceType, @g(name = "storeFeatureServiceTypeData") HybrisStoreFeatureServiceTypeData storeFeatureServiceTypeData) {
        Intrinsics.j(address, "address");
        return new HybrisStoreLocatorFeature(address, openingSchedule, phone, storeFeaturePickUpType, storeFeaturePickUpTypeData, storeFeatureServiceType, storeFeatureServiceTypeData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisStoreLocatorFeature)) {
            return false;
        }
        HybrisStoreLocatorFeature hybrisStoreLocatorFeature = (HybrisStoreLocatorFeature) other;
        return Intrinsics.e(this.address, hybrisStoreLocatorFeature.address) && Intrinsics.e(this.openingSchedule, hybrisStoreLocatorFeature.openingSchedule) && Intrinsics.e(this.phone, hybrisStoreLocatorFeature.phone) && Intrinsics.e(this.storeFeaturePickUpType, hybrisStoreLocatorFeature.storeFeaturePickUpType) && Intrinsics.e(this.storeFeaturePickUpTypeData, hybrisStoreLocatorFeature.storeFeaturePickUpTypeData) && Intrinsics.e(this.storeFeatureServiceType, hybrisStoreLocatorFeature.storeFeatureServiceType) && Intrinsics.e(this.storeFeatureServiceTypeData, hybrisStoreLocatorFeature.storeFeatureServiceTypeData);
    }

    public int hashCode() {
        int iHashCode = this.address.hashCode() * 31;
        HybrisOpeningSchedule hybrisOpeningSchedule = this.openingSchedule;
        int iHashCode2 = (iHashCode + (hybrisOpeningSchedule == null ? 0 : hybrisOpeningSchedule.hashCode())) * 31;
        String str = this.phone;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.storeFeaturePickUpType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HybrisStoreFeaturePickUpTypeData hybrisStoreFeaturePickUpTypeData = this.storeFeaturePickUpTypeData;
        int iHashCode5 = (iHashCode4 + (hybrisStoreFeaturePickUpTypeData == null ? 0 : hybrisStoreFeaturePickUpTypeData.hashCode())) * 31;
        String str3 = this.storeFeatureServiceType;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HybrisStoreFeatureServiceTypeData hybrisStoreFeatureServiceTypeData = this.storeFeatureServiceTypeData;
        return iHashCode6 + (hybrisStoreFeatureServiceTypeData != null ? hybrisStoreFeatureServiceTypeData.hashCode() : 0);
    }

    public String toString() {
        return "HybrisStoreLocatorFeature(address=" + this.address + ", openingSchedule=" + this.openingSchedule + ", phone=" + this.phone + ", storeFeaturePickUpType=" + this.storeFeaturePickUpType + ", storeFeaturePickUpTypeData=" + this.storeFeaturePickUpTypeData + ", storeFeatureServiceType=" + this.storeFeatureServiceType + ", storeFeatureServiceTypeData=" + this.storeFeatureServiceTypeData + ')';
    }

    /* renamed from: a, reason: from getter */
    public final HybrisStoreAddress getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final HybrisOpeningSchedule getOpeningSchedule() {
        return this.openingSchedule;
    }

    /* renamed from: c, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: d, reason: from getter */
    public final String getStoreFeaturePickUpType() {
        return this.storeFeaturePickUpType;
    }

    /* renamed from: e, reason: from getter */
    public final HybrisStoreFeaturePickUpTypeData getStoreFeaturePickUpTypeData() {
        return this.storeFeaturePickUpTypeData;
    }

    /* renamed from: f, reason: from getter */
    public final String getStoreFeatureServiceType() {
        return this.storeFeatureServiceType;
    }

    /* renamed from: g, reason: from getter */
    public final HybrisStoreFeatureServiceTypeData getStoreFeatureServiceTypeData() {
        return this.storeFeatureServiceTypeData;
    }

    public /* synthetic */ HybrisStoreLocatorFeature(HybrisStoreAddress hybrisStoreAddress, HybrisOpeningSchedule hybrisOpeningSchedule, String str, String str2, HybrisStoreFeaturePickUpTypeData hybrisStoreFeaturePickUpTypeData, String str3, HybrisStoreFeatureServiceTypeData hybrisStoreFeatureServiceTypeData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hybrisStoreAddress, (i10 & 2) != 0 ? null : hybrisOpeningSchedule, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : hybrisStoreFeaturePickUpTypeData, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : hybrisStoreFeatureServiceTypeData);
    }
}
