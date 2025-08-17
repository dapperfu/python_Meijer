package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DeliveryPartner;", "", "", "partnerEligibility", "facilityId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DeliveryPartner;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeliveryPartner {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String facilityId;

    public final DeliveryPartner copy(@g(name = "partnerEligibility") String partnerEligibility, @g(name = "facilityId") String facilityId) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        Intrinsics.j(facilityId, "facilityId");
        return new DeliveryPartner(partnerEligibility, facilityId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryPartner)) {
            return false;
        }
        DeliveryPartner deliveryPartner = (DeliveryPartner) other;
        return Intrinsics.e(this.partnerEligibility, deliveryPartner.partnerEligibility) && Intrinsics.e(this.facilityId, deliveryPartner.facilityId);
    }

    public int hashCode() {
        return (this.partnerEligibility.hashCode() * 31) + this.facilityId.hashCode();
    }

    public String toString() {
        return "DeliveryPartner(partnerEligibility=" + this.partnerEligibility + ", facilityId=" + this.facilityId + ')';
    }

    public DeliveryPartner(@g(name = "partnerEligibility") String partnerEligibility, @g(name = "facilityId") String facilityId) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        Intrinsics.j(facilityId, "facilityId");
        this.partnerEligibility = partnerEligibility;
        this.facilityId = facilityId;
    }

    /* renamed from: a, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* renamed from: b, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }
}
