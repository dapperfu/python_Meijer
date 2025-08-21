package com.meijer.mobile.digitalshopping.api.cart.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOmsResponse;", "", "Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "facility", "", "addressAllowsAlcohol", "", "partnerEligibility", "", "Lcom/meijer/mobile/digitalshopping/api/cart/model/SupplementalEligibilityOmsResponse;", "supplementalEligibility", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;ZLjava/lang/String;Ljava/util/List;)V", "copy", "(Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;ZLjava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOmsResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "b", "()Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "Z", "()Z", "c", "Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AvailablePartnerStoreLocationOmsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Facility facility;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean addressAllowsAlcohol;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SupplementalEligibilityOmsResponse> supplementalEligibility;

    public AvailablePartnerStoreLocationOmsResponse() {
        this(null, false, null, null, 15, null);
    }

    public final AvailablePartnerStoreLocationOmsResponse copy(@g(name = "facility") Facility facility, @g(name = "addressAllowsAlcohol") boolean addressAllowsAlcohol, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "supplementalEligibility") List<SupplementalEligibilityOmsResponse> supplementalEligibility) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        return new AvailablePartnerStoreLocationOmsResponse(facility, addressAllowsAlcohol, partnerEligibility, supplementalEligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailablePartnerStoreLocationOmsResponse)) {
            return false;
        }
        AvailablePartnerStoreLocationOmsResponse availablePartnerStoreLocationOmsResponse = (AvailablePartnerStoreLocationOmsResponse) other;
        return Intrinsics.e(this.facility, availablePartnerStoreLocationOmsResponse.facility) && this.addressAllowsAlcohol == availablePartnerStoreLocationOmsResponse.addressAllowsAlcohol && Intrinsics.e(this.partnerEligibility, availablePartnerStoreLocationOmsResponse.partnerEligibility) && Intrinsics.e(this.supplementalEligibility, availablePartnerStoreLocationOmsResponse.supplementalEligibility);
    }

    public int hashCode() {
        Facility facility = this.facility;
        int iHashCode = (((((facility == null ? 0 : facility.hashCode()) * 31) + Boolean.hashCode(this.addressAllowsAlcohol)) * 31) + this.partnerEligibility.hashCode()) * 31;
        List<SupplementalEligibilityOmsResponse> list = this.supplementalEligibility;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "AvailablePartnerStoreLocationOmsResponse(facility=" + this.facility + ", addressAllowsAlcohol=" + this.addressAllowsAlcohol + ", partnerEligibility=" + this.partnerEligibility + ", supplementalEligibility=" + this.supplementalEligibility + ')';
    }

    public AvailablePartnerStoreLocationOmsResponse(@g(name = "facility") Facility facility, @g(name = "addressAllowsAlcohol") boolean z10, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "supplementalEligibility") List<SupplementalEligibilityOmsResponse> list) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        this.facility = facility;
        this.addressAllowsAlcohol = z10;
        this.partnerEligibility = partnerEligibility;
        this.supplementalEligibility = list;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAddressAllowsAlcohol() {
        return this.addressAllowsAlcohol;
    }

    /* renamed from: b, reason: from getter */
    public final Facility getFacility() {
        return this.facility;
    }

    /* renamed from: c, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    public final List<SupplementalEligibilityOmsResponse> d() {
        return this.supplementalEligibility;
    }

    public /* synthetic */ AvailablePartnerStoreLocationOmsResponse(Facility facility, boolean z10, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : facility, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? null : list);
    }
}
