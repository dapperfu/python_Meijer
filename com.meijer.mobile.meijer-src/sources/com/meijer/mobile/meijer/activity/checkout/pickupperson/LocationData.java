package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/b;", "", "", "addressLine1", "addressLine2", "storeName", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class LocationData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    public LocationData() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationData)) {
            return false;
        }
        LocationData locationData = (LocationData) other;
        return Intrinsics.e(this.addressLine1, locationData.addressLine1) && Intrinsics.e(this.addressLine2, locationData.addressLine2) && Intrinsics.e(this.storeName, locationData.storeName) && Intrinsics.e(this.type, locationData.type);
    }

    public int hashCode() {
        String str = this.addressLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.storeName;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "LocationData(addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", storeName=" + this.storeName + ", type=" + this.type + ')';
    }

    public LocationData(String str, String str2, String str3, String type) {
        Intrinsics.j(type, "type");
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.storeName = str3;
        this.type = type;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: b, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: c, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ LocationData(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
