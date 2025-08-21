package Tq;

import com.google.android.libraries.places.api.model.PlaceTypes;
import di.StoreAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"LTq/i;", "", "Ldi/g;", PlaceTypes.ADDRESS, "LTq/b;", "openingSchedule", "", "phone", "storeFeaturePickUpType", "LTq/f;", "storeFeaturePickUpTypeData", "storeFeatureServiceType", "LTq/g;", "storeFeatureServiceTypeData", "<init>", "(Ldi/g;LTq/b;Ljava/lang/String;Ljava/lang/String;LTq/f;Ljava/lang/String;LTq/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldi/g;", "getAddress", "()Ldi/g;", "b", "LTq/b;", "getOpeningSchedule", "()LTq/b;", "c", "Ljava/lang/String;", "getPhone", "d", "getStoreFeaturePickUpType", "e", "LTq/f;", "getStoreFeaturePickUpTypeData", "()LTq/f;", "f", "getStoreFeatureServiceType", "g", "LTq/g;", "getStoreFeatureServiceTypeData", "()LTq/g;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tq.i, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class StoreLocatorFeature {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreAddress address;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OpeningSchedule openingSchedule;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeFeaturePickUpType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreFeaturePickUpTypeData storeFeaturePickUpTypeData;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeFeatureServiceType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreFeatureServiceTypeData storeFeatureServiceTypeData;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreLocatorFeature)) {
            return false;
        }
        StoreLocatorFeature storeLocatorFeature = (StoreLocatorFeature) other;
        return Intrinsics.e(this.address, storeLocatorFeature.address) && Intrinsics.e(this.openingSchedule, storeLocatorFeature.openingSchedule) && Intrinsics.e(this.phone, storeLocatorFeature.phone) && Intrinsics.e(this.storeFeaturePickUpType, storeLocatorFeature.storeFeaturePickUpType) && Intrinsics.e(this.storeFeaturePickUpTypeData, storeLocatorFeature.storeFeaturePickUpTypeData) && Intrinsics.e(this.storeFeatureServiceType, storeLocatorFeature.storeFeatureServiceType) && Intrinsics.e(this.storeFeatureServiceTypeData, storeLocatorFeature.storeFeatureServiceTypeData);
    }

    public StoreLocatorFeature(StoreAddress address, OpeningSchedule openingSchedule, String str, String str2, StoreFeaturePickUpTypeData storeFeaturePickUpTypeData, String str3, StoreFeatureServiceTypeData storeFeatureServiceTypeData) {
        Intrinsics.j(address, "address");
        this.address = address;
        this.openingSchedule = openingSchedule;
        this.phone = str;
        this.storeFeaturePickUpType = str2;
        this.storeFeaturePickUpTypeData = storeFeaturePickUpTypeData;
        this.storeFeatureServiceType = str3;
        this.storeFeatureServiceTypeData = storeFeatureServiceTypeData;
    }

    public int hashCode() {
        int iHashCode = this.address.hashCode() * 31;
        OpeningSchedule openingSchedule = this.openingSchedule;
        int iHashCode2 = (iHashCode + (openingSchedule == null ? 0 : openingSchedule.hashCode())) * 31;
        String str = this.phone;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.storeFeaturePickUpType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StoreFeaturePickUpTypeData storeFeaturePickUpTypeData = this.storeFeaturePickUpTypeData;
        int iHashCode5 = (iHashCode4 + (storeFeaturePickUpTypeData == null ? 0 : storeFeaturePickUpTypeData.hashCode())) * 31;
        String str3 = this.storeFeatureServiceType;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StoreFeatureServiceTypeData storeFeatureServiceTypeData = this.storeFeatureServiceTypeData;
        return iHashCode6 + (storeFeatureServiceTypeData != null ? storeFeatureServiceTypeData.hashCode() : 0);
    }

    public String toString() {
        return "StoreLocatorFeature(address=" + this.address + ", openingSchedule=" + this.openingSchedule + ", phone=" + this.phone + ", storeFeaturePickUpType=" + this.storeFeaturePickUpType + ", storeFeaturePickUpTypeData=" + this.storeFeaturePickUpTypeData + ", storeFeatureServiceType=" + this.storeFeatureServiceType + ", storeFeatureServiceTypeData=" + this.storeFeatureServiceTypeData + ')';
    }
}
