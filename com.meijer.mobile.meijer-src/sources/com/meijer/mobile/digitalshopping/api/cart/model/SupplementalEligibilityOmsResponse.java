package com.meijer.mobile.digitalshopping.api.cart.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/cart/model/SupplementalEligibilityOmsResponse;", "", "Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "facility", "", "addressAllowsAlcohol", "", "partnerEligibility", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;ZLjava/lang/String;)V", "copy", "(Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;ZLjava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/cart/model/SupplementalEligibilityOmsResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "b", "()Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "Z", "()Z", "c", "Ljava/lang/String;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SupplementalEligibilityOmsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Facility facility;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean addressAllowsAlcohol;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    public SupplementalEligibilityOmsResponse() {
        this(null, false, null, 7, null);
    }

    public final SupplementalEligibilityOmsResponse copy(@g(name = "facility") Facility facility, @g(name = "addressAllowsAlcohol") boolean addressAllowsAlcohol, @g(name = "partnerEligibility") String partnerEligibility) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        return new SupplementalEligibilityOmsResponse(facility, addressAllowsAlcohol, partnerEligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupplementalEligibilityOmsResponse)) {
            return false;
        }
        SupplementalEligibilityOmsResponse supplementalEligibilityOmsResponse = (SupplementalEligibilityOmsResponse) other;
        return Intrinsics.e(this.facility, supplementalEligibilityOmsResponse.facility) && this.addressAllowsAlcohol == supplementalEligibilityOmsResponse.addressAllowsAlcohol && Intrinsics.e(this.partnerEligibility, supplementalEligibilityOmsResponse.partnerEligibility);
    }

    public int hashCode() {
        Facility facility = this.facility;
        return ((((facility == null ? 0 : facility.hashCode()) * 31) + Boolean.hashCode(this.addressAllowsAlcohol)) * 31) + this.partnerEligibility.hashCode();
    }

    public String toString() {
        return "SupplementalEligibilityOmsResponse(facility=" + this.facility + ", addressAllowsAlcohol=" + this.addressAllowsAlcohol + ", partnerEligibility=" + this.partnerEligibility + ')';
    }

    public SupplementalEligibilityOmsResponse(@g(name = "facility") Facility facility, @g(name = "addressAllowsAlcohol") boolean z10, @g(name = "partnerEligibility") String partnerEligibility) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        this.facility = facility;
        this.addressAllowsAlcohol = z10;
        this.partnerEligibility = partnerEligibility;
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

    public /* synthetic */ SupplementalEligibilityOmsResponse(Facility facility, boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : facility, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? "" : str);
    }
}
