package com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots;

import Tq.PointOfService;
import android.os.Parcel;
import android.os.Parcelable;
import ci.CustomerAddress;
import ci.Region;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0001 Bu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b \u0010\u0019R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b#\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b$\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b(\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b)\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010\u0019¨\u0006,"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;", "Landroid/os/Parcelable;", "", "deliveryPartner", "curbsidePartner", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "selectedStoreId", "deliveryAddressLine1", "deliveryAddressLine2", "deliveryAddressTown", "deliveryAddressRegionIsoCode", "deliveryAddressRegionIsoCodeShort", "deliveryAddressPostalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "c", "I", "i", "d", "e", "f", "g", "j", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.a, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class FulfillmentStateDetails implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryPartner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsidePartner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int selectedStoreId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryAddressLine1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryAddressLine2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryAddressTown;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryAddressRegionIsoCode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryAddressRegionIsoCodeShort;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryAddressPostalCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FulfillmentStateDetails> CREATOR = new b();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a$a;", "", "<init>", "()V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "LTq/c;", "pointOfService", "Lci/c;", "deliveryAddress", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;", "a", "(ILTq/c;Lci/c;)Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FulfillmentStateDetails a(int storeId, PointOfService pointOfService, CustomerAddress deliveryAddress) {
            Region region;
            Region region2;
            Intrinsics.j(pointOfService, "pointOfService");
            return new FulfillmentStateDetails(pointOfService.getDeliveryPartner(), pointOfService.getCurbsidePartner(), storeId, deliveryAddress != null ? deliveryAddress.getLine1() : null, deliveryAddress != null ? deliveryAddress.getLine2() : null, deliveryAddress != null ? deliveryAddress.getTown() : null, (deliveryAddress == null || (region2 = deliveryAddress.getRegion()) == null) ? null : region2.getIsoCode(), (deliveryAddress == null || (region = deliveryAddress.getRegion()) == null) ? null : region.getIsoCodeShort(), deliveryAddress != null ? deliveryAddress.getPostalCode() : null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.a$b */
    public static final class b implements Parcelable.Creator<FulfillmentStateDetails> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FulfillmentStateDetails createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new FulfillmentStateDetails(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FulfillmentStateDetails[] newArray(int i10) {
            return new FulfillmentStateDetails[i10];
        }
    }

    public FulfillmentStateDetails() {
        this(null, null, 0, null, null, null, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentStateDetails)) {
            return false;
        }
        FulfillmentStateDetails fulfillmentStateDetails = (FulfillmentStateDetails) other;
        return Intrinsics.e(this.deliveryPartner, fulfillmentStateDetails.deliveryPartner) && Intrinsics.e(this.curbsidePartner, fulfillmentStateDetails.curbsidePartner) && this.selectedStoreId == fulfillmentStateDetails.selectedStoreId && Intrinsics.e(this.deliveryAddressLine1, fulfillmentStateDetails.deliveryAddressLine1) && Intrinsics.e(this.deliveryAddressLine2, fulfillmentStateDetails.deliveryAddressLine2) && Intrinsics.e(this.deliveryAddressTown, fulfillmentStateDetails.deliveryAddressTown) && Intrinsics.e(this.deliveryAddressRegionIsoCode, fulfillmentStateDetails.deliveryAddressRegionIsoCode) && Intrinsics.e(this.deliveryAddressRegionIsoCodeShort, fulfillmentStateDetails.deliveryAddressRegionIsoCodeShort) && Intrinsics.e(this.deliveryAddressPostalCode, fulfillmentStateDetails.deliveryAddressPostalCode);
    }

    public int hashCode() {
        String str = this.deliveryPartner;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.curbsidePartner;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.selectedStoreId)) * 31;
        String str3 = this.deliveryAddressLine1;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deliveryAddressLine2;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deliveryAddressTown;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deliveryAddressRegionIsoCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deliveryAddressRegionIsoCodeShort;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deliveryAddressPostalCode;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "FulfillmentStateDetails(deliveryPartner=" + this.deliveryPartner + ", curbsidePartner=" + this.curbsidePartner + ", selectedStoreId=" + this.selectedStoreId + ", deliveryAddressLine1=" + this.deliveryAddressLine1 + ", deliveryAddressLine2=" + this.deliveryAddressLine2 + ", deliveryAddressTown=" + this.deliveryAddressTown + ", deliveryAddressRegionIsoCode=" + this.deliveryAddressRegionIsoCode + ", deliveryAddressRegionIsoCodeShort=" + this.deliveryAddressRegionIsoCodeShort + ", deliveryAddressPostalCode=" + this.deliveryAddressPostalCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.deliveryPartner);
        dest.writeString(this.curbsidePartner);
        dest.writeInt(this.selectedStoreId);
        dest.writeString(this.deliveryAddressLine1);
        dest.writeString(this.deliveryAddressLine2);
        dest.writeString(this.deliveryAddressTown);
        dest.writeString(this.deliveryAddressRegionIsoCode);
        dest.writeString(this.deliveryAddressRegionIsoCodeShort);
        dest.writeString(this.deliveryAddressPostalCode);
    }

    public FulfillmentStateDetails(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.deliveryPartner = str;
        this.curbsidePartner = str2;
        this.selectedStoreId = i10;
        this.deliveryAddressLine1 = str3;
        this.deliveryAddressLine2 = str4;
        this.deliveryAddressTown = str5;
        this.deliveryAddressRegionIsoCode = str6;
        this.deliveryAddressRegionIsoCodeShort = str7;
        this.deliveryAddressPostalCode = str8;
    }

    /* renamed from: a, reason: from getter */
    public final String getCurbsidePartner() {
        return this.curbsidePartner;
    }

    /* renamed from: b, reason: from getter */
    public final String getDeliveryAddressLine1() {
        return this.deliveryAddressLine1;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeliveryAddressLine2() {
        return this.deliveryAddressLine2;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeliveryAddressPostalCode() {
        return this.deliveryAddressPostalCode;
    }

    /* renamed from: e, reason: from getter */
    public final String getDeliveryAddressRegionIsoCode() {
        return this.deliveryAddressRegionIsoCode;
    }

    /* renamed from: f, reason: from getter */
    public final String getDeliveryAddressRegionIsoCodeShort() {
        return this.deliveryAddressRegionIsoCodeShort;
    }

    /* renamed from: g, reason: from getter */
    public final String getDeliveryAddressTown() {
        return this.deliveryAddressTown;
    }

    /* renamed from: h, reason: from getter */
    public final String getDeliveryPartner() {
        return this.deliveryPartner;
    }

    /* renamed from: i, reason: from getter */
    public final int getSelectedStoreId() {
        return this.selectedStoreId;
    }

    public /* synthetic */ FulfillmentStateDetails(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? -1 : i10, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8);
    }
}
