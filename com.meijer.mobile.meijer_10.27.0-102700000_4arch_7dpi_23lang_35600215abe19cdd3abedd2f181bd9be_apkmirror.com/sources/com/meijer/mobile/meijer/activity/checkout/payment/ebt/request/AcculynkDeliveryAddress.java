package com.meijer.mobile.meijer.activity.checkout.payment.ebt.request;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJL\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "", "", PlaceTypes.ADDRESS, PlaceTypes.COUNTRY, "city", "state", "zipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AcculynkDeliveryAddress {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    public AcculynkDeliveryAddress() {
        this(null, null, null, null, null, 31, null);
    }

    public final AcculynkDeliveryAddress copy(@g(name = PlaceTypes.ADDRESS) String address, @g(name = PlaceTypes.COUNTRY) String country, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zipCode) {
        return new AcculynkDeliveryAddress(address, country, city, state, zipCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcculynkDeliveryAddress)) {
            return false;
        }
        AcculynkDeliveryAddress acculynkDeliveryAddress = (AcculynkDeliveryAddress) other;
        return Intrinsics.e(this.address, acculynkDeliveryAddress.address) && Intrinsics.e(this.country, acculynkDeliveryAddress.country) && Intrinsics.e(this.city, acculynkDeliveryAddress.city) && Intrinsics.e(this.state, acculynkDeliveryAddress.state) && Intrinsics.e(this.zipCode, acculynkDeliveryAddress.zipCode);
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zipCode;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "AcculynkDeliveryAddress(address=" + this.address + ", country=" + this.country + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ')';
    }

    public AcculynkDeliveryAddress(@g(name = PlaceTypes.ADDRESS) String str, @g(name = PlaceTypes.COUNTRY) String str2, @g(name = "city") String str3, @g(name = "state") String str4, @g(name = "zip") String str5) {
        this.address = str;
        this.country = str2;
        this.city = str3;
        this.state = str4;
        this.zipCode = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: c, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: e, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    public /* synthetic */ AcculynkDeliveryAddress(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
