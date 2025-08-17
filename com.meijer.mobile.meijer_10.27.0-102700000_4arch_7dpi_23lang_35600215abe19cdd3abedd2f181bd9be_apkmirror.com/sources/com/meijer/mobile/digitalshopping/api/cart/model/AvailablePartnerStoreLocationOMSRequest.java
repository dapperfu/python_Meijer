package com.meijer.mobile.digitalshopping.api.cart.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJP\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOMSRequest;", "", "", "addressLine1", "addressLine2", "addressType", "city", "state", "zipcode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOMSRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AvailablePartnerStoreLocationOMSRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipcode;

    public final AvailablePartnerStoreLocationOMSRequest copy(@g(name = "addressLine1") String addressLine1, @g(name = "addressLine2") String addressLine2, @g(name = "addressType") String addressType, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zipcode") String zipcode) {
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipcode, "zipcode");
        return new AvailablePartnerStoreLocationOMSRequest(addressLine1, addressLine2, addressType, city, state, zipcode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailablePartnerStoreLocationOMSRequest)) {
            return false;
        }
        AvailablePartnerStoreLocationOMSRequest availablePartnerStoreLocationOMSRequest = (AvailablePartnerStoreLocationOMSRequest) other;
        return Intrinsics.e(this.addressLine1, availablePartnerStoreLocationOMSRequest.addressLine1) && Intrinsics.e(this.addressLine2, availablePartnerStoreLocationOMSRequest.addressLine2) && Intrinsics.e(this.addressType, availablePartnerStoreLocationOMSRequest.addressType) && Intrinsics.e(this.city, availablePartnerStoreLocationOMSRequest.city) && Intrinsics.e(this.state, availablePartnerStoreLocationOMSRequest.state) && Intrinsics.e(this.zipcode, availablePartnerStoreLocationOMSRequest.zipcode);
    }

    public int hashCode() {
        int iHashCode = this.addressLine1.hashCode() * 31;
        String str = this.addressLine2;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressType;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipcode.hashCode();
    }

    public String toString() {
        return "AvailablePartnerStoreLocationOMSRequest(addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", addressType=" + this.addressType + ", city=" + this.city + ", state=" + this.state + ", zipcode=" + this.zipcode + ')';
    }

    public AvailablePartnerStoreLocationOMSRequest(@g(name = "addressLine1") String addressLine1, @g(name = "addressLine2") String str, @g(name = "addressType") String str2, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zipcode") String zipcode) {
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipcode, "zipcode");
        this.addressLine1 = addressLine1;
        this.addressLine2 = str;
        this.addressType = str2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
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
    public final String getAddressType() {
        return this.addressType;
    }

    /* renamed from: d, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: f, reason: from getter */
    public final String getZipcode() {
        return this.zipcode;
    }
}
